package org.apache.commons.net.telnet;

import j1.i;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import n0.b;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TelnetClient extends Telnet {
    private static final int DEFAULT_MAX_SUBNEGOTIATION_LENGTH = 512;
    private InputStream input;
    private TelnetInputListener inputListener;
    final int maxSubnegotiationLength;
    private OutputStream output;
    protected boolean readerThread;

    public TelnetClient(String str, int i10) {
        super(str);
        this.readerThread = true;
        this.input = null;
        this.output = null;
        this.maxSubnegotiationLength = i10;
    }

    @Override // org.apache.commons.net.telnet.Telnet, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        TelnetInputStream telnetInputStream = new TelnetInputStream(this._input_, this, this.readerThread);
        if (this.readerThread) {
            telnetInputStream.start();
        }
        this.input = new BufferedInputStream(telnetInputStream);
        this.output = new TelnetOutputStream(this);
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) {
        super.addOptionHandler(telnetOptionHandler);
    }

    public void closeOutputStream() {
        OutputStream outputStream = this._output_;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } finally {
            this._output_ = null;
        }
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void deleteOptionHandler(int i10) {
        super.deleteOptionHandler(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        try {
            IOUtils.close(this.input);
            IOUtils.close(this.output);
        } finally {
            this.output = null;
            this.input = null;
            super.disconnect();
        }
    }

    public void flushOutputStream() {
        OutputStream outputStream = this._output_;
        if (outputStream != null) {
            outputStream.flush();
        } else {
            b.A("Stream closed");
        }
    }

    public InputStream getInputStream() {
        return this.input;
    }

    public boolean getLocalOptionState(int i10) {
        if (stateIsWill(i10) && requestedWill(i10)) {
            return true;
        }
        return false;
    }

    public OutputStream getOutputStream() {
        return this.output;
    }

    public boolean getReaderThread() {
        return this.readerThread;
    }

    public boolean getRemoteOptionState(int i10) {
        if (stateIsDo(i10) && requestedDo(i10)) {
            return true;
        }
        return false;
    }

    public void notifyInputListener() {
        TelnetInputListener telnetInputListener;
        synchronized (this) {
            telnetInputListener = this.inputListener;
        }
        if (telnetInputListener != null) {
            telnetInputListener.telnetInputAvailable();
        }
    }

    public synchronized void registerInputListener(TelnetInputListener telnetInputListener) {
        this.inputListener = telnetInputListener;
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public /* bridge */ /* synthetic */ void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        super.registerNotifHandler(telnetNotificationHandler);
    }

    public void registerSpyStream(OutputStream outputStream) {
        super._registerSpyStream(outputStream);
    }

    @Deprecated
    public boolean sendAYT(long j10) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(j10);
        return _sendAYT(ofMillis);
    }

    public void sendCommand(byte b10) {
        _sendCommand(b10);
    }

    public void sendSubnegotiation(int[] iArr) {
        if (iArr.length >= 1) {
            _sendSubnegotiation(iArr);
        } else {
            i.k("zero length message");
        }
    }

    public void setReaderThread(boolean z9) {
        this.readerThread = z9;
    }

    public void stopSpyStream() {
        super._stopSpyStream();
    }

    public synchronized void unregisterInputListener() {
        this.inputListener = null;
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public /* bridge */ /* synthetic */ void unregisterNotifHandler() {
        super.unregisterNotifHandler();
    }

    public boolean sendAYT(Duration duration) {
        return _sendAYT(duration);
    }

    public TelnetClient(int i10) {
        this("VT100", i10);
    }

    public TelnetClient(String str) {
        this(str, 512);
    }

    public TelnetClient() {
        this("VT100", 512);
    }
}
