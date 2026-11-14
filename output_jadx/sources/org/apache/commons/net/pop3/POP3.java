package org.apache.commons.net.pop3;

import j1.i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class POP3 extends SocketClient {
    public static final int AUTHORIZATION_STATE = 0;
    static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    public static final int DEFAULT_PORT = 110;
    public static final int DISCONNECTED_STATE = -1;
    static final String ERROR = "-ERR";
    static final String OK = "+OK";
    static final String OK_INT = "+ ";
    public static final int TRANSACTION_STATE = 1;
    public static final int UPDATE_STATE = 2;
    protected ProtocolCommandSupport _commandSupport_;
    String lastReplyLine;
    private int popState;
    BufferedReader reader;
    int replyCode;
    List<String> replyLines;
    BufferedWriter writer;

    public POP3() {
        setDefaultPort(110);
        this.popState = -1;
        this.reader = null;
        this.writer = null;
        this.replyLines = new ArrayList();
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private void getReply() {
        this.replyLines.clear();
        String readLine = this.reader.readLine();
        if (readLine != null) {
            if (readLine.startsWith(OK)) {
                this.replyCode = 0;
            } else if (readLine.startsWith(ERROR)) {
                this.replyCode = 1;
            } else if (readLine.startsWith(OK_INT)) {
                this.replyCode = 2;
            } else {
                throw new MalformedServerReplyException("Received invalid POP3 protocol response from server.".concat(readLine));
            }
            this.replyLines.add(readLine);
            this.lastReplyLine = readLine;
            fireReplyReceived(this.replyCode, getReplyString());
            return;
        }
        throw new EOFException("Connection closed without indication.");
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        InputStream inputStream = this._input_;
        Charset charset = DEFAULT_ENCODING;
        this.reader = new CRLFLineReader(new InputStreamReader(inputStream, charset));
        this.writer = new BufferedWriter(new OutputStreamWriter(this._output_, charset));
        getReply();
        setState(0);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this.reader = null;
        this.writer = null;
        this.lastReplyLine = null;
        this.replyLines.clear();
        setState(-1);
    }

    public void getAdditionalReply() {
        String readLine = this.reader.readLine();
        while (readLine != null) {
            this.replyLines.add(readLine);
            if (!readLine.equals(".")) {
                readLine = this.reader.readLine();
            } else {
                return;
            }
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public String getReplyString() {
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it = this.replyLines.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(SocketClient.NETASCII_EOL);
        }
        return sb.toString();
    }

    public String[] getReplyStrings() {
        return (String[]) this.replyLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public int getState() {
        return this.popState;
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    public int sendCommand(String str, String str2) {
        if (this.writer != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append(SocketClient.NETASCII_EOL);
            String sb2 = sb.toString();
            this.writer.write(sb2);
            this.writer.flush();
            fireCommandSent(str, sb2);
            getReply();
            return this.replyCode;
        }
        i.l("Socket is not connected");
        return 0;
    }

    public void setState(int i10) {
        this.popState = i10;
    }

    public int sendCommand(int i10, String str) {
        return sendCommand(POP3Command.commands[i10], str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i10) {
        return sendCommand(POP3Command.commands[i10], (String) null);
    }
}
