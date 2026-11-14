package org.apache.commons.net.ftp;

import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import l9.i;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.util.SSLContextUtils;
import org.apache.commons.net.util.SSLSocketUtils;
import org.apache.commons.net.util.TrustManagerUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FTPSClient extends FTPClient {
    private static final String CMD_ADAT = "ADAT";
    private static final String CMD_AUTH = "AUTH";
    private static final String CMD_CCC = "CCC";
    private static final String CMD_CONF = "CONF";
    private static final String CMD_ENC = "ENC";
    private static final String CMD_MIC = "MIC";
    private static final String CMD_PBSZ = "PBSZ";
    private static final String CMD_PROT = "PROT";
    public static final int DEFAULT_FTPS_DATA_PORT = 989;
    public static final int DEFAULT_FTPS_PORT = 990;
    private static final String DEFAULT_PROTOCOL = "TLS";

    @Deprecated
    public static String KEYSTORE_ALGORITHM;

    @Deprecated
    public static String PROVIDER;

    @Deprecated
    public static String STORE_TYPE;

    @Deprecated
    public static String TRUSTSTORE_ALGORITHM;
    private String auth;
    private SSLContext context;
    private HostnameVerifier hostnameVerifier;
    private boolean isClientMode;
    private boolean isCreation;
    private final boolean isImplicit;
    private boolean isNeedClientAuth;
    private boolean isWantClientAuth;
    private KeyManager keyManager;
    private Socket plainSocket;
    private final String protocol;
    private String[] protocols;
    private String[] suites;
    private boolean tlsEndpointChecking;
    private TrustManager trustManager;
    private static final String DEFAULT_PROT = "C";
    private static final String[] PROT_COMMAND_VALUE = {DEFAULT_PROT, ExifInterface.LONGITUDE_EAST, ExifInterface.LATITUDE_SOUTH, "P"};

    public FTPSClient(String str, boolean z9) {
        this.auth = "TLS";
        this.isCreation = true;
        this.isClientMode = true;
        this.trustManager = TrustManagerUtils.getValidateServerCertificateTrustManager();
        this.protocol = str;
        this.isImplicit = z9;
        if (z9) {
            setDefaultPort(DEFAULT_FTPS_PORT);
        }
    }

    private boolean checkPROTValue(String str) {
        for (String str2 : PROT_COMMAND_VALUE) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void closeSockets(Socket socket, Socket socket2) {
        IOUtils.close(socket, socket2);
    }

    private SSLSocket createSSLSocket(Socket socket) {
        if (socket != null) {
            return (SSLSocket) this.context.getSocketFactory().createSocket(socket, this._hostname_, socket.getPort(), false);
        }
        return null;
    }

    private String extractPrefixedData(String str, String str2) {
        int indexOf = str2.indexOf(str);
        if (indexOf == -1) {
            return null;
        }
        return str2.substring(str.length() + indexOf).trim();
    }

    private KeyManager getKeyManager() {
        return this.keyManager;
    }

    private void initSslContext() {
        if (this.context == null) {
            this.context = SSLContextUtils.createSSLContext(this.protocol, getKeyManager(), getTrustManager());
        }
    }

    private Socket openDataSecureConnection(String str, String str2) {
        Socket createSocket;
        Socket socket;
        Socket socket2;
        Socket socket3 = null;
        if (getDataConnectionMode() != 0 && getDataConnectionMode() != 2) {
            return null;
        }
        boolean z9 = getRemoteAddress() instanceof Inet6Address;
        int millisInt = DurationUtils.toMillisInt(getDataTimeout());
        if (getDataConnectionMode() == 0) {
            ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(getActivePort(), 1, getHostAddress());
            try {
                if (z9) {
                    if (!FTPReply.isPositiveCompletion(eprt(getReportHostAddress(), createServerSocket.getLocalPort()))) {
                        createServerSocket.close();
                        return null;
                    }
                } else if (!FTPReply.isPositiveCompletion(port(getReportHostAddress(), createServerSocket.getLocalPort()))) {
                    createServerSocket.close();
                    return null;
                }
                if ((getRestartOffset() > 0 && !restart(getRestartOffset())) || !FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                    if (createServerSocket != null) {
                        createServerSocket.close();
                    }
                    return null;
                }
                if (millisInt >= 0) {
                    createServerSocket.setSoTimeout(millisInt);
                }
                socket2 = createServerSocket.accept();
                if (millisInt >= 0) {
                    socket2.setSoTimeout(millisInt);
                }
                if (getReceiveDataSocketBufferSize() > 0) {
                    socket2.setReceiveBufferSize(getReceiveDataSocketBufferSize());
                }
                if (getSendDataSocketBufferSize() > 0) {
                    socket2.setSendBufferSize(getSendDataSocketBufferSize());
                }
                createServerSocket.close();
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
        } else {
            if ((isUseEPSVwithIPv4() || z9) && epsv() == 229) {
                _parseExtendedPassiveModeReply(this._replyLines.get(0));
            } else {
                if (z9 || pasv() != 227) {
                    return null;
                }
                _parsePassiveModeReply(this._replyLines.get(0));
            }
            if (getProxy() != null) {
                createSocket = new Socket(getProxy());
            } else {
                createSocket = this._socketFactory_.createSocket();
            }
            if (getReceiveDataSocketBufferSize() > 0) {
                createSocket.setReceiveBufferSize(getReceiveDataSocketBufferSize());
            }
            if (getSendDataSocketBufferSize() > 0) {
                createSocket.setSendBufferSize(getSendDataSocketBufferSize());
            }
            if (getPassiveLocalIPAddress() != null) {
                createSocket.bind(new InetSocketAddress(getPassiveLocalIPAddress(), 0));
            }
            if (millisInt >= 0) {
                createSocket.setSoTimeout(millisInt);
            }
            createSocket.connect(new InetSocketAddress(getPassiveHost(), getPassivePort()), this.connectTimeout);
            if (getProxy() != null) {
                socket = this.context.getSocketFactory().createSocket(createSocket, getPassiveHost(), getPassivePort(), true);
            } else {
                socket = null;
            }
            if ((getRestartOffset() > 0 && !restart(getRestartOffset())) || !FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                closeSockets(createSocket, socket);
                return null;
            }
            socket2 = createSocket;
            socket3 = socket;
        }
        if (isRemoteVerificationEnabled() && !verifyRemote(socket2)) {
            InetAddress inetAddress = socket2.getInetAddress();
            closeSockets(socket2, socket3);
            throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + getRemoteAddress().getHostAddress());
        }
        if (getProxy() != null) {
            return socket3;
        }
        return socket2;
    }

    @Override // org.apache.commons.net.ftp.FTPClient, org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        if (this.isImplicit) {
            applySocketAttributes();
            sslNegotiation();
        }
        super._connectAction_();
        if (!this.isImplicit) {
            execAUTH();
            sslNegotiation();
        }
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    public Socket _openDataConnection_(String str, String str2) {
        Socket openDataSecureConnection = openDataSecureConnection(str, str2);
        _prepareDataSocket_(openDataSecureConnection);
        if (openDataSecureConnection instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) openDataSecureConnection;
            sSLSocket.setUseClientMode(this.isClientMode);
            sSLSocket.setEnableSessionCreation(this.isCreation);
            if (!this.isClientMode) {
                sSLSocket.setNeedClientAuth(this.isNeedClientAuth);
                sSLSocket.setWantClientAuth(this.isWantClientAuth);
            }
            String[] strArr = this.suites;
            if (strArr != null) {
                sSLSocket.setEnabledCipherSuites(strArr);
            }
            String[] strArr2 = this.protocols;
            if (strArr2 != null) {
                sSLSocket.setEnabledProtocols(strArr2);
            }
            sSLSocket.startHandshake();
        }
        return openDataSecureConnection;
    }

    @Override // org.apache.commons.net.ftp.FTPClient, org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        IOUtils.close(this.plainSocket);
        setSocketFactory(null);
        setServerSocketFactory(null);
    }

    public int execADAT(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        if (bArr != null) {
            encoder = Base64.getEncoder();
            encodeToString = encoder.encodeToString(bArr);
            return sendCommand(CMD_ADAT, encodeToString);
        }
        return sendCommand(CMD_ADAT);
    }

    public void execAUTH() {
        int sendCommand = sendCommand(CMD_AUTH, this.auth);
        if (334 == sendCommand || 234 == sendCommand) {
        } else {
            throw new SSLException(getReplyString());
        }
    }

    public int execCCC() {
        return sendCommand(CMD_CCC);
    }

    public int execCONF(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        if (bArr != null) {
            encoder = Base64.getEncoder();
            encodeToString = encoder.encodeToString(bArr);
            return sendCommand(CMD_CONF, encodeToString);
        }
        return sendCommand(CMD_CONF, "");
    }

    public int execENC(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        if (bArr != null) {
            encoder = Base64.getEncoder();
            encodeToString = encoder.encodeToString(bArr);
            return sendCommand(CMD_ENC, encodeToString);
        }
        return sendCommand(CMD_ENC, "");
    }

    public int execMIC(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        if (bArr != null) {
            encoder = Base64.getEncoder();
            encodeToString = encoder.encodeToString(bArr);
            return sendCommand(CMD_MIC, encodeToString);
        }
        return sendCommand(CMD_MIC, "");
    }

    public void execPBSZ(long j10) {
        if (j10 >= 0 && 4294967295L >= j10) {
            if (200 == sendCommand(CMD_PBSZ, String.valueOf(j10))) {
            } else {
                throw new SSLException(getReplyString());
            }
        } else {
            i.a();
        }
    }

    public void execPROT(String str) {
        if (str == null) {
            str = DEFAULT_PROT;
        }
        if (checkPROTValue(str)) {
            if (200 == sendCommand(CMD_PROT, str)) {
                if (DEFAULT_PROT.equals(str)) {
                    setSocketFactory(null);
                    setServerSocketFactory(null);
                    return;
                } else {
                    setSocketFactory(new FTPSSocketFactory(this.context));
                    setServerSocketFactory(new FTPSServerSocketFactory(this.context));
                    initSslContext();
                    return;
                }
            }
            throw new SSLException(getReplyString());
        }
        i.a();
    }

    public String getAuthValue() {
        return this.auth;
    }

    public boolean getEnableSessionCreation() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnableSessionCreation();
        }
        return false;
    }

    public String[] getEnabledCipherSuites() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnabledCipherSuites();
        }
        return null;
    }

    public String[] getEnabledProtocols() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnabledProtocols();
        }
        return null;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean getNeedClientAuth() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getNeedClientAuth();
        }
        return false;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String[] getProtocols() {
        String[] strArr = this.protocols;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public String[] getSuites() {
        String[] strArr = this.suites;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    public boolean getUseClientMode() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getUseClientMode();
        }
        return false;
    }

    public boolean getWantClientAuth() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getWantClientAuth();
        }
        return false;
    }

    public boolean isClientMode() {
        return this.isClientMode;
    }

    public boolean isCreation() {
        return this.isCreation;
    }

    public boolean isEndpointCheckingEnabled() {
        return this.tlsEndpointChecking;
    }

    public boolean isImplicit() {
        return this.isImplicit;
    }

    public boolean isNeedClientAuth() {
        return this.isNeedClientAuth;
    }

    public boolean isWantClientAuth() {
        return this.isWantClientAuth;
    }

    public byte[] parseADATReply(String str) {
        Base64.Decoder decoder;
        byte[] decode;
        if (str != null) {
            decoder = Base64.getDecoder();
            decode = decoder.decode(extractPrefixedData("ADAT=", str));
            return decode;
        }
        return null;
    }

    public long parsePBSZ(long j10) {
        execPBSZ(j10);
        String extractPrefixedData = extractPrefixedData("PBSZ=", getReplyString());
        if (extractPrefixedData != null) {
            long parseLong = Long.parseLong(extractPrefixedData);
            if (parseLong < j10) {
                return parseLong;
            }
        }
        return j10;
    }

    @Override // org.apache.commons.net.ftp.FTP
    public int sendCommand(String str, String str2) {
        int sendCommand = super.sendCommand(str, str2);
        if (CMD_CCC.equals(str)) {
            if (200 == sendCommand) {
                this._socket_.close();
                this._socket_ = this.plainSocket;
                this._controlInput_ = new BufferedReader(new InputStreamReader(this._socket_.getInputStream(), getControlEncoding()));
                this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._socket_.getOutputStream(), getControlEncoding()));
                return sendCommand;
            }
            throw new SSLException(getReplyString());
        }
        return sendCommand;
    }

    public void setAuthValue(String str) {
        this.auth = str;
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.suites = (String[]) strArr.clone();
    }

    public void setEnabledProtocols(String[] strArr) {
        this.protocols = (String[]) strArr.clone();
    }

    public void setEnabledSessionCreation(boolean z9) {
        this.isCreation = z9;
    }

    public void setEndpointCheckingEnabled(boolean z9) {
        this.tlsEndpointChecking = z9;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setKeyManager(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    public void setNeedClientAuth(boolean z9) {
        this.isNeedClientAuth = z9;
    }

    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public void setUseClientMode(boolean z9) {
        this.isClientMode = z9;
    }

    public void setWantClientAuth(boolean z9) {
        this.isWantClientAuth = z9;
    }

    public void sslNegotiation() {
        HostnameVerifier hostnameVerifier;
        this.plainSocket = this._socket_;
        initSslContext();
        SSLSocket createSSLSocket = createSSLSocket(this._socket_);
        createSSLSocket.setEnableSessionCreation(this.isCreation);
        createSSLSocket.setUseClientMode(this.isClientMode);
        if (this.isClientMode) {
            if (this.tlsEndpointChecking) {
                SSLSocketUtils.enableEndpointNameVerification(createSSLSocket);
            }
        } else {
            createSSLSocket.setNeedClientAuth(this.isNeedClientAuth);
            createSSLSocket.setWantClientAuth(this.isWantClientAuth);
        }
        String[] strArr = this.protocols;
        if (strArr != null) {
            createSSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.suites;
        if (strArr2 != null) {
            createSSLSocket.setEnabledCipherSuites(strArr2);
        }
        createSSLSocket.startHandshake();
        this._socket_ = createSSLSocket;
        this._controlInput_ = new BufferedReader(new InputStreamReader(createSSLSocket.getInputStream(), getControlEncoding()));
        this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(createSSLSocket.getOutputStream(), getControlEncoding()));
        if (this.isClientMode && (hostnameVerifier = this.hostnameVerifier) != null && !hostnameVerifier.verify(this._hostname_, createSSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    public int execAUTH(String str) {
        return sendCommand(CMD_AUTH, str);
    }

    public FTPSClient(boolean z9) {
        this("TLS", z9);
    }

    public FTPSClient(boolean z9, SSLContext sSLContext) {
        this("TLS", z9);
        this.context = sSLContext;
    }

    public FTPSClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public FTPSClient(String str) {
        this(str, false);
    }

    public FTPSClient() {
        this("TLS", false);
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    @Deprecated
    public Socket _openDataConnection_(int i10, String str) {
        return _openDataConnection_(FTPCommand.getCommand(i10), str);
    }

    public void _prepareDataSocket_(Socket socket) {
    }
}
