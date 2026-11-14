package org.apache.commons.net.bsd;

import ai.onnxruntime.a;
import j1.i;
import java.io.InputStream;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import n0.b;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.SocketInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class RCommandClient extends RExecClient {
    public static final int DEFAULT_PORT = 514;
    public static final int MAX_CLIENT_PORT = 1023;
    public static final int MIN_CLIENT_PORT = 512;

    public RCommandClient() {
        setDefaultPort(DEFAULT_PORT);
    }

    private ServerSocket createServer() {
        for (int i10 = MAX_CLIENT_PORT; i10 >= 512; i10--) {
            try {
                return this._serverSocketFactory_.createServerSocket(i10, 1, getLocalAddress());
            } catch (SocketException unused) {
            }
        }
        throw new BindException("All ports in use.");
    }

    public void connect(InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        int i11 = MAX_CLIENT_PORT;
        while (i11 >= 512) {
            try {
                this._socket_ = this._socketFactory_.createSocket(inetAddress, i10, inetAddress2, i11);
                break;
            } catch (SocketException unused) {
                i11--;
            }
        }
        if (i11 >= 512) {
            _connectAction_();
            return;
        }
        throw new BindException("All ports in use or insufficient permssion.");
    }

    @Override // org.apache.commons.net.bsd.RExecClient
    public InputStream createErrorStream() {
        ServerSocket createServer = createServer();
        try {
            this._output_.write(Integer.toString(createServer.getLocalPort()).getBytes(StandardCharsets.UTF_8));
            this._output_.write(0);
            this._output_.flush();
            Socket accept = createServer.accept();
            createServer.close();
            if (isRemoteVerificationEnabled() && !verifyRemote(accept)) {
                String hostAddress = SocketClient.getHostAddress(accept);
                IOUtils.closeQuietly(accept);
                b.A(a.l("Security violation: unexpected connection attempt by ", hostAddress));
                return null;
            }
            return new SocketInputStream(accept, accept.getInputStream());
        } catch (Throwable th) {
            if (createServer != null) {
                try {
                    createServer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void rcommand(String str, String str2, String str3) {
        rcommand(str, str2, str3, false);
    }

    public void rcommand(String str, String str2, String str3, boolean z9) {
        rexec(str, str2, str3, z9);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i10) {
        connect(inetAddress, i10, InetAddress.getLocalHost());
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        if (i11 >= 512 && i11 <= 1023) {
            super.connect(inetAddress, i10, inetAddress2, i11);
        } else {
            i.k(a.e(i11, "Invalid port number "));
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i10) {
        connect(InetAddress.getByName(str), i10, InetAddress.getLocalHost());
    }

    public void connect(String str, int i10, InetAddress inetAddress) {
        connect(InetAddress.getByName(str), i10, inetAddress);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i10, InetAddress inetAddress, int i11) {
        if (i11 >= 512 && i11 <= 1023) {
            super.connect(str, i10, inetAddress, i11);
        } else {
            i.k(a.e(i11, "Invalid port number "));
        }
    }
}
