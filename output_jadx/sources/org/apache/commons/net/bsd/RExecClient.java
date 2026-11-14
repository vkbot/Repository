package org.apache.commons.net.bsd;

import ai.onnxruntime.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import n0.b;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.SocketInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class RExecClient extends SocketClient {
    public static final int DEFAULT_PORT = 512;
    protected static final char NULL_CHAR = 0;
    protected InputStream _errorStream_ = null;
    private boolean remoteVerificationEnabled;

    public RExecClient() {
        setDefaultPort(512);
    }

    public InputStream createErrorStream() {
        ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(0, 1, getLocalAddress());
        try {
            this._output_.write(Integer.toString(createServerSocket.getLocalPort()).getBytes(StandardCharsets.UTF_8));
            this._output_.write(0);
            this._output_.flush();
            Socket accept = createServerSocket.accept();
            createServerSocket.close();
            if (this.remoteVerificationEnabled && !verifyRemote(accept)) {
                String hostAddress = SocketClient.getHostAddress(accept);
                IOUtils.closeQuietly(accept);
                b.A(a.l("Security violation: unexpected connection attempt by ", hostAddress));
                return null;
            }
            return new SocketInputStream(accept, accept.getInputStream());
        } catch (Throwable th) {
            if (createServerSocket != null) {
                try {
                    createServerSocket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        IOUtils.close(this._errorStream_);
        this._errorStream_ = null;
        super.disconnect();
    }

    public InputStream getErrorStream() {
        return this._errorStream_;
    }

    public InputStream getInputStream() {
        return this._input_;
    }

    public OutputStream getOutputStream() {
        return this._output_;
    }

    public final boolean isRemoteVerificationEnabled() {
        return this.remoteVerificationEnabled;
    }

    public void rexec(String str, String str2, String str3, boolean z9) {
        if (z9) {
            this._errorStream_ = createErrorStream();
        } else {
            this._output_.write(0);
        }
        this._output_.write(str.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str2.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str3.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.flush();
        int read = this._input_.read();
        if (read > 0) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read2 = this._input_.read();
                if (read2 == -1 || read2 == 10) {
                    break;
                } else {
                    sb.append((char) read2);
                }
            }
            throw new IOException(sb.toString());
        }
        if (read >= 0) {
            return;
        }
        b.A("Server closed connection.");
    }

    public final void setRemoteVerificationEnabled(boolean z9) {
        this.remoteVerificationEnabled = z9;
    }

    public void rexec(String str, String str2, String str3) {
        rexec(str, str2, str3, false);
    }
}
