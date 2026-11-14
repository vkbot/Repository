package org.apache.commons.net.imap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.ftp.a;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class IMAP extends SocketClient {
    public static final int DEFAULT_PORT = 143;
    protected BufferedWriter __writer;
    protected BufferedReader _reader;
    private volatile IMAPChunkListener chunkListener;
    private final char[] initialID = {'A', 'A', 'A', 'A'};
    private int replyCode;
    private final List<String> replyLines;
    private IMAPState state;
    protected static final String __DEFAULT_ENCODING = StandardCharsets.ISO_8859_1.name();
    public static final IMAPChunkListener TRUE_CHUNK_LISTENER = new a(2);

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface IMAPChunkListener {
        boolean chunkReceived(IMAP imap);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum IMAPState {
        DISCONNECTED_STATE,
        NOT_AUTH_STATE,
        AUTH_STATE,
        LOGOUT_STATE
    }

    public IMAP() {
        setDefaultPort(DEFAULT_PORT);
        this.state = IMAPState.DISCONNECTED_STATE;
        this._reader = null;
        this.__writer = null;
        this.replyLines = new ArrayList();
        createCommandSupport();
    }

    public static /* synthetic */ boolean a(IMAP imap) {
        return lambda$static$0(imap);
    }

    private void getReply(boolean z9) {
        boolean z10;
        IMAPChunkListener iMAPChunkListener;
        this.replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine != null) {
            this.replyLines.add(readLine);
            if (z9) {
                while (IMAPReply.isUntagged(readLine)) {
                    int literalCount = IMAPReply.literalCount(readLine);
                    if (literalCount >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (literalCount >= 0) {
                        String readLine2 = this._reader.readLine();
                        if (readLine2 != null) {
                            this.replyLines.add(readLine2);
                            literalCount -= readLine2.length() + 2;
                        } else {
                            throw new EOFException("Connection closed without indication.");
                        }
                    }
                    if (z10 && (iMAPChunkListener = this.chunkListener) != null && iMAPChunkListener.chunkReceived(this)) {
                        fireReplyReceived(3, getReplyString());
                        this.replyLines.clear();
                    }
                    readLine = this._reader.readLine();
                    if (readLine != null) {
                        this.replyLines.add(readLine);
                    } else {
                        throw new EOFException("Connection closed without indication.");
                    }
                }
                this.replyCode = IMAPReply.getReplyCode(readLine);
            } else {
                this.replyCode = IMAPReply.getUntaggedReplyCode(readLine);
            }
            fireReplyReceived(this.replyCode, getReplyString());
            return;
        }
        throw new EOFException("Connection closed without indication.");
    }

    public static /* synthetic */ boolean lambda$static$0(IMAP imap) {
        return true;
    }

    public static String quoteMailboxName(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return "\"\"";
        }
        if ((str.length() <= 1 || !str.startsWith("\"") || !str.endsWith("\"")) && str.contains(" ")) {
            return "\"" + str.replaceAll("([\\\\\"])", "\\\\$1") + "\"";
        }
        return str;
    }

    private int sendCommandWithID(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(str2);
        if (str3 != null) {
            sb.append(' ');
            sb.append(str3);
        }
        sb.append(SocketClient.NETASCII_EOL);
        String sb2 = sb.toString();
        this.__writer.write(sb2);
        this.__writer.flush();
        fireCommandSent(str2, sb2);
        getReply();
        return this.replyCode;
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        InputStream inputStream = this._input_;
        String str = __DEFAULT_ENCODING;
        this._reader = new CRLFLineReader(new InputStreamReader(inputStream, str));
        this.__writer = new BufferedWriter(new OutputStreamWriter(this._output_, str));
        int soTimeout = getSoTimeout();
        if (soTimeout <= 0) {
            setSoTimeout(this.connectTimeout);
        }
        getReply(false);
        if (soTimeout <= 0) {
            setSoTimeout(soTimeout);
        }
        setState(IMAPState.NOT_AUTH_STATE);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this.__writer = null;
        this.replyLines.clear();
        setState(IMAPState.DISCONNECTED_STATE);
    }

    public boolean doCommand(IMAPCommand iMAPCommand) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand));
    }

    @Override // org.apache.commons.net.SocketClient
    public void fireReplyReceived(int i10, String str) {
        getCommandSupport().fireReplyReceived(i10, getReplyString());
    }

    public String generateCommandID() {
        String str = new String(this.initialID);
        boolean z9 = true;
        for (int length = this.initialID.length - 1; z9 && length >= 0; length--) {
            char[] cArr = this.initialID;
            char c = cArr[length];
            if (c == 'Z') {
                cArr[length] = 'A';
            } else {
                cArr[length] = (char) (c + 1);
                z9 = false;
            }
        }
        return str;
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

    public IMAPState getState() {
        return this.state;
    }

    public int sendCommand(IMAPCommand iMAPCommand, String str) {
        return sendCommand(iMAPCommand.getIMAPCommand(), str);
    }

    public int sendData(String str) {
        return sendCommandWithID(null, str, null);
    }

    public void setChunkListener(IMAPChunkListener iMAPChunkListener) {
        this.chunkListener = iMAPChunkListener;
    }

    public void setState(IMAPState iMAPState) {
        this.state = iMAPState;
    }

    public boolean doCommand(IMAPCommand iMAPCommand, String str) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand, str));
    }

    public int sendCommand(IMAPCommand iMAPCommand) {
        return sendCommand(iMAPCommand, (String) null);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        return sendCommandWithID(generateCommandID(), str, str2);
    }

    private void getReply() {
        getReply(true);
    }
}
