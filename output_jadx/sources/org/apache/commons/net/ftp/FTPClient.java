package org.apache.commons.net.ftp;

import ai.onnxruntime.b;
import ai.onnxruntime.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.MLSxEntryParser;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.io.CopyStreamAdapter;
import org.apache.commons.net.io.CopyStreamEvent;
import org.apache.commons.net.io.CopyStreamListener;
import org.apache.commons.net.io.FromNetASCIIInputStream;
import org.apache.commons.net.io.SocketInputStream;
import org.apache.commons.net.io.SocketOutputStream;
import org.apache.commons.net.io.ToNetASCIIOutputStream;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FTPClient extends FTP implements Configurable {
    public static final int ACTIVE_LOCAL_DATA_CONNECTION_MODE = 0;
    public static final int ACTIVE_REMOTE_DATA_CONNECTION_MODE = 1;
    public static final String FTP_IP_ADDRESS_FROM_PASV_RESPONSE = "org.apache.commons.net.ftp.ipAddressFromPasvResponse";
    public static final String FTP_SYSTEM_TYPE = "org.apache.commons.net.ftp.systemType";
    public static final String FTP_SYSTEM_TYPE_DEFAULT = "org.apache.commons.net.ftp.systemType.default";
    private static final Pattern PARMS_PAT = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    public static final int PASSIVE_LOCAL_DATA_CONNECTION_MODE = 2;
    public static final int PASSIVE_REMOTE_DATA_CONNECTION_MODE = 3;
    public static final String SYSTEM_TYPE_PROPERTIES = "/systemType.properties";
    private InetAddress activeExternalHost;
    private int activeMaxPort;
    private int activeMinPort;
    private boolean autoDetectEncoding;
    private int bufferSize;
    private Duration controlKeepAliveReplyTimeout;
    private Duration controlKeepAliveTimeout;
    private CopyStreamListener copyStreamListener;
    private int[] cslDebug;
    private int dataConnectionMode;
    private Duration dataTimeout;
    private FTPFileEntryParser entryParser;
    private String entryParserKey;
    private HashMap<String, Set<String>> featuresMap;
    private int fileStructure;
    private int fileTransferMode;
    private int fileType;
    private int formatOrByteSize;
    private FTPClientConfig ftpClientConfig;
    private boolean ipAddressFromPasvResponse;
    private boolean listHiddenFiles;
    private FTPFileEntryParserFactory parserFactory;
    private String passiveHost;
    private InetAddress passiveLocalHost;
    private HostnameResolver passiveNatWorkaroundStrategy;
    private int passivePort;
    private final Random random;
    private int receiveDataSocketBufferSize;
    private boolean remoteVerificationEnabled;
    private InetAddress reportActiveExternalHost;
    private long restartOffset;
    private int sendDataSocketBufferSize;
    private String systemName;
    private boolean useEPSVwithIPv4;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface HostnameResolver {
        String resolve(String str);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class NatServerResolverImpl implements HostnameResolver {
        private final FTPClient client;

        public NatServerResolverImpl(FTPClient fTPClient) {
            this.client = fTPClient;
        }

        @Override // org.apache.commons.net.ftp.FTPClient.HostnameResolver
        public String resolve(String str) {
            if (InetAddress.getByName(str).isSiteLocalAddress()) {
                InetAddress remoteAddress = this.client.getRemoteAddress();
                if (!remoteAddress.isSiteLocalAddress()) {
                    return remoteAddress.getHostAddress();
                }
                return str;
            }
            return str;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class PropertiesSingleton {
        static final Properties PROPERTIES = FTPClient.loadResourceProperties(FTPClient.SYSTEM_TYPE_PROPERTIES);

        private PropertiesSingleton() {
        }
    }

    public FTPClient() {
        Duration ofMillis;
        Duration duration;
        Duration ofSeconds;
        ofMillis = Duration.ofMillis(-1L);
        this.dataTimeout = ofMillis;
        this.random = new Random();
        this.remoteVerificationEnabled = true;
        this.parserFactory = new DefaultFTPFileEntryParserFactory();
        duration = Duration.ZERO;
        this.controlKeepAliveTimeout = duration;
        ofSeconds = Duration.ofSeconds(1L);
        this.controlKeepAliveReplyTimeout = ofSeconds;
        this.passiveNatWorkaroundStrategy = new NatServerResolverImpl(this);
        this.ipAddressFromPasvResponse = Boolean.getBoolean(FTP_IP_ADDRESS_FROM_PASV_RESPONSE);
        initDefaults();
    }

    private InputStream getBufferedInputStream(InputStream inputStream) {
        if (this.bufferSize > 0) {
            return new BufferedInputStream(inputStream, this.bufferSize);
        }
        return new BufferedInputStream(inputStream);
    }

    private OutputStream getBufferedOutputStream(OutputStream outputStream) {
        if (this.bufferSize > 0) {
            return new BufferedOutputStream(outputStream, this.bufferSize);
        }
        return new BufferedOutputStream(outputStream);
    }

    private static Properties getOverrideProperties() {
        return PropertiesSingleton.PROPERTIES;
    }

    private void initDefaults() {
        this.dataConnectionMode = 0;
        this.passiveHost = null;
        this.passivePort = -1;
        this.activeExternalHost = null;
        this.reportActiveExternalHost = null;
        this.activeMinPort = 0;
        this.activeMaxPort = 0;
        this.fileType = 0;
        this.fileStructure = 7;
        this.formatOrByteSize = 4;
        this.fileTransferMode = 10;
        this.restartOffset = 0L;
        this.systemName = null;
        this.entryParser = null;
        this.entryParserKey = "";
        this.featuresMap = null;
    }

    private boolean initFeatureMap() {
        String substring;
        String str;
        if (this.featuresMap == null) {
            int feat = feat();
            int i10 = 0;
            if (feat == 530) {
                return false;
            }
            boolean isPositiveCompletion = FTPReply.isPositiveCompletion(feat);
            this.featuresMap = new HashMap<>();
            if (!isPositiveCompletion) {
                return false;
            }
            ArrayList<String> arrayList = this._replyLines;
            int size = arrayList.size();
            while (i10 < size) {
                String str2 = arrayList.get(i10);
                i10++;
                String str3 = str2;
                if (str3.startsWith(" ")) {
                    int indexOf = str3.indexOf(32, 1);
                    if (indexOf > 0) {
                        substring = str3.substring(1, indexOf);
                        str = str3.substring(indexOf + 1);
                    } else {
                        substring = str3.substring(1);
                        str = "";
                    }
                    this.featuresMap.computeIfAbsent(substring.toUpperCase(Locale.ENGLISH), new d(6)).add(str);
                }
            }
        }
        return true;
    }

    private FTPListParseEngine initiateListParsing(FTPFileEntryParser fTPFileEntryParser, String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.LIST, getListArguments(str));
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(fTPFileEntryParser, this.ftpClientConfig);
        if (_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(_openDataConnection_.getInputStream(), getControlEncoding());
            IOUtils.closeQuietly(_openDataConnection_);
            completePendingCommand();
            return fTPListParseEngine;
        } catch (Throwable th) {
            IOUtils.closeQuietly(_openDataConnection_);
            throw th;
        }
    }

    public static /* synthetic */ Set lambda$initFeatureMap$0(String str) {
        return new HashSet();
    }

    public static Properties loadResourceProperties(String str) {
        Properties properties;
        Throwable th;
        Properties properties2 = null;
        if (str == null) {
            return null;
        }
        try {
            InputStream resourceAsStream = FTPClient.class.getResourceAsStream(str);
            if (resourceAsStream != null) {
                try {
                    properties = new Properties();
                    try {
                        properties.load(resourceAsStream);
                        properties2 = properties;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            try {
                                resourceAsStream.close();
                            } catch (IOException unused) {
                                return properties;
                            }
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    properties = null;
                    th = th4;
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
                return properties2;
            }
            return properties2;
        } catch (IOException unused2) {
            return properties2;
        }
    }

    private CopyStreamListener mergeListeners(CopyStreamListener copyStreamListener) {
        CopyStreamListener copyStreamListener2 = this.copyStreamListener;
        if (copyStreamListener == null) {
            return copyStreamListener2;
        }
        if (copyStreamListener2 == null) {
            return copyStreamListener;
        }
        CopyStreamAdapter copyStreamAdapter = new CopyStreamAdapter();
        copyStreamAdapter.addCopyStreamListener(copyStreamListener);
        copyStreamAdapter.addCopyStreamListener(this.copyStreamListener);
        return copyStreamAdapter;
    }

    public static String parsePathname(String str) {
        String substring = str.substring(4);
        if (substring.startsWith("\"")) {
            StringBuilder sb = new StringBuilder(substring.length());
            boolean z9 = false;
            for (int i10 = 1; i10 < substring.length(); i10++) {
                char charAt = substring.charAt(i10);
                if (charAt == '\"') {
                    if (z9) {
                        sb.append(charAt);
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                } else {
                    if (z9) {
                        return sb.toString();
                    }
                    sb.append(charAt);
                }
            }
            if (z9) {
                return sb.toString();
            }
            return substring;
        }
        return substring;
    }

    private boolean storeFile(FTPCmd fTPCmd, String str, InputStream inputStream) {
        return _storeFile(fTPCmd.getCommand(), str, inputStream);
    }

    private OutputStream storeFileStream(FTPCmd fTPCmd, String str) {
        return _storeFileStream(fTPCmd.getCommand(), str);
    }

    private Socket wrapOnDeflate(Socket socket) {
        if (this.fileTransferMode != 13) {
            return socket;
        }
        return new DeflateSocket(socket);
    }

    @Override // org.apache.commons.net.ftp.FTP
    public void _connectAction_(Reader reader) {
        super._connectAction_(reader);
        initDefaults();
        if (this.autoDetectEncoding) {
            ArrayList arrayList = new ArrayList(this._replyLines);
            int i10 = this._replyCode;
            Charset charset = StandardCharsets.UTF_8;
            if (hasFeature("UTF8") || hasFeature(charset.name())) {
                setControlEncoding(charset);
                this._controlInput_ = new CRLFLineReader(new InputStreamReader(this._input_, getControlEncoding()));
                this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._output_, getControlEncoding()));
            }
            this._replyLines.clear();
            this._replyLines.addAll(arrayList);
            this._replyCode = i10;
            this._newReplyString = true;
        }
    }

    public Socket _openDataConnection_(String str, String str2) {
        Socket socket;
        int i10 = this.dataConnectionMode;
        if (i10 != 0 && i10 != 2) {
            return null;
        }
        boolean z9 = getRemoteAddress() instanceof Inet6Address;
        int millisInt = DurationUtils.toMillisInt(this.dataTimeout);
        if (this.dataConnectionMode == 0) {
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
                long j10 = this.restartOffset;
                if ((j10 > 0 && !restart(j10)) || !FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                    if (createServerSocket != null) {
                        createServerSocket.close();
                    }
                    return null;
                }
                if (millisInt >= 0) {
                    createServerSocket.setSoTimeout(millisInt);
                }
                socket = wrapOnDeflate(createServerSocket.accept());
                if (millisInt >= 0) {
                    socket.setSoTimeout(millisInt);
                }
                int i11 = this.receiveDataSocketBufferSize;
                if (i11 > 0) {
                    socket.setReceiveBufferSize(i11);
                }
                int i12 = this.sendDataSocketBufferSize;
                if (i12 > 0) {
                    socket.setSendBufferSize(i12);
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
            Socket wrapOnDeflate = wrapOnDeflate(this._socketFactory_.createSocket());
            int i13 = this.receiveDataSocketBufferSize;
            if (i13 > 0) {
                wrapOnDeflate.setReceiveBufferSize(i13);
            }
            int i14 = this.sendDataSocketBufferSize;
            if (i14 > 0) {
                wrapOnDeflate.setSendBufferSize(i14);
            }
            if (this.passiveLocalHost != null) {
                wrapOnDeflate.bind(new InetSocketAddress(this.passiveLocalHost, 0));
            }
            if (millisInt >= 0) {
                wrapOnDeflate.setSoTimeout(millisInt);
            }
            wrapOnDeflate.connect(new InetSocketAddress(this.passiveHost, this.passivePort), this.connectTimeout);
            long j11 = this.restartOffset;
            if ((j11 > 0 && !restart(j11)) || !FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                wrapOnDeflate.close();
                return null;
            }
            socket = wrapOnDeflate;
        }
        if (this.remoteVerificationEnabled && !verifyRemote(socket)) {
            String hostAddress = SocketClient.getHostAddress(socket);
            String hostAddress2 = SocketClient.getHostAddress(this._socket_);
            IOUtils.closeQuietly(socket);
            b.m("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2);
            return null;
        }
        return socket;
    }

    public void _parseExtendedPassiveModeReply(String str) {
        String trim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char charAt = trim.charAt(0);
        char charAt2 = trim.charAt(1);
        char charAt3 = trim.charAt(2);
        char charAt4 = trim.charAt(trim.length() - 1);
        if (charAt == charAt2 && charAt2 == charAt3 && charAt3 == charAt4) {
            try {
                int parseInt = Integer.parseInt(trim.substring(3, trim.length() - 1));
                this.passiveHost = getRemoteAddress().getHostAddress();
                this.passivePort = parseInt;
                return;
            } catch (NumberFormatException unused) {
                throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: ".concat(trim));
            }
        }
        throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: ".concat(trim));
    }

    public void _parsePassiveModeReply(String str) {
        String replace;
        Matcher matcher = PARMS_PAT.matcher(str);
        if (matcher.find()) {
            if ("0,0,0,0".equals(matcher.group(1))) {
                replace = this._socket_.getInetAddress().getHostAddress();
            } else {
                replace = matcher.group(1).replace(',', FilenameUtils.EXTENSION_SEPARATOR);
            }
            try {
                int parseInt = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
                if (isIpAddressFromPasvResponse()) {
                    HostnameResolver hostnameResolver = this.passiveNatWorkaroundStrategy;
                    if (hostnameResolver != null) {
                        try {
                            String resolve = hostnameResolver.resolve(replace);
                            if (!replace.equals(resolve)) {
                                fireReplyReceived(0, "[Replacing PASV mode reply address " + this.passiveHost + " with " + resolve + "]\n");
                                replace = resolve;
                            }
                        } catch (UnknownHostException unused) {
                            throw new MalformedServerReplyException(ai.onnxruntime.a.l("Could not parse passive host information.\nServer Reply: ", str));
                        }
                    }
                } else {
                    Socket socket = this._socket_;
                    if (socket == null) {
                        replace = null;
                    } else {
                        replace = socket.getInetAddress().getHostAddress();
                    }
                }
                this.passiveHost = replace;
                this.passivePort = parseInt;
                return;
            } catch (NumberFormatException unused2) {
                throw new MalformedServerReplyException(ai.onnxruntime.a.l("Could not parse passive port information.\nServer Reply: ", str));
            }
        }
        throw new MalformedServerReplyException(ai.onnxruntime.a.l("Could not parse passive host information.\nServer Reply: ", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean _retrieveFile(java.lang.String r10, java.lang.String r11, java.io.OutputStream r12) {
        /*
            r9 = this;
            java.net.Socket r10 = r9._openDataConnection_(r10, r11)
            if (r10 != 0) goto L8
            r10 = 0
            return r10
        L8:
            r11 = 0
            int r0 = r9.fileType     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L20
            org.apache.commons.net.io.FromNetASCIIInputStream r0 = new org.apache.commons.net.io.FromNetASCIIInputStream     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r1 = r10.getInputStream()     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r1 = r9.getBufferedInputStream(r1)     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L1a:
            r1 = r0
            goto L29
        L1c:
            r0 = move-exception
            r12 = r0
            r12 = r11
            goto L66
        L20:
            java.io.InputStream r0 = r10.getInputStream()     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r0 = r9.getBufferedInputStream(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1a
        L29:
            java.time.Duration r0 = r9.controlKeepAliveTimeout     // Catch: java.lang.Throwable -> L3c
            boolean r0 = org.apache.commons.net.ftp.DurationUtils.isPositive(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L41
            org.apache.commons.net.ftp.FTPClient$CSL r0 = new org.apache.commons.net.ftp.FTPClient$CSL     // Catch: java.lang.Throwable -> L3c
            java.time.Duration r2 = r9.controlKeepAliveTimeout     // Catch: java.lang.Throwable -> L3c
            java.time.Duration r3 = r9.controlKeepAliveReplyTimeout     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r9, r2, r3)     // Catch: java.lang.Throwable -> L3c
            r11 = r0
            goto L41
        L3c:
            r0 = move-exception
            r12 = r0
            r12 = r11
            r11 = r1
            goto L66
        L41:
            int r3 = r9.getBufferSize()     // Catch: java.lang.Throwable -> L3c
            org.apache.commons.net.io.CopyStreamListener r6 = r9.mergeListeners(r11)     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            r4 = -1
            r2 = r12
            org.apache.commons.net.io.Util.copyStream(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L3c
            org.apache.commons.io.IOUtils.closeQuietly(r1)     // Catch: java.lang.Throwable -> L63
            boolean r12 = r9.completePendingCommand()     // Catch: java.lang.Throwable -> L63
            org.apache.commons.io.IOUtils.closeQuietly(r10)
            if (r11 == 0) goto L62
            int[] r10 = r11.cleanUp()
            r9.cslDebug = r10
        L62:
            return r12
        L63:
            r0 = move-exception
            r12 = r0
            goto L6f
        L66:
            org.apache.commons.io.IOUtils.closeQuietly(r11)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r11 = r0
            r8 = r12
            r12 = r11
            r11 = r8
        L6f:
            org.apache.commons.io.IOUtils.closeQuietly(r10)
            if (r11 == 0) goto L7a
            int[] r10 = r11.cleanUp()
            r9.cslDebug = r10
        L7a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.FTPClient._retrieveFile(java.lang.String, java.lang.String, java.io.OutputStream):boolean");
    }

    public InputStream _retrieveFileStream(String str, String str2) {
        InputStream inputStream;
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return null;
        }
        if (this.fileType == 0) {
            inputStream = new FromNetASCIIInputStream(getBufferedInputStream(_openDataConnection_.getInputStream()));
        } else {
            inputStream = _openDataConnection_.getInputStream();
        }
        return new SocketInputStream(_openDataConnection_, inputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean _storeFile(java.lang.String r9, java.lang.String r10, java.io.InputStream r11) {
        /*
            r8 = this;
            java.net.Socket r9 = r8._openDataConnection_(r9, r10)
            if (r9 != 0) goto L8
            r9 = 0
            return r9
        L8:
            r10 = 0
            int r0 = r8.fileType     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            if (r0 != 0) goto L23
            org.apache.commons.net.io.ToNetASCIIOutputStream r0 = new org.apache.commons.net.io.ToNetASCIIOutputStream     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            java.io.OutputStream r1 = r8.getBufferedOutputStream(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
        L1a:
            r2 = r0
            goto L2c
        L1c:
            r0 = move-exception
            r9 = r0
            goto L70
        L1f:
            r0 = move-exception
            r11 = r0
            r11 = r10
            goto L66
        L23:
            java.io.OutputStream r0 = r9.getOutputStream()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            java.io.OutputStream r0 = r8.getBufferedOutputStream(r0)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            goto L1a
        L2c:
            java.time.Duration r0 = r8.controlKeepAliveTimeout     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            boolean r0 = org.apache.commons.net.ftp.DurationUtils.isPositive(r0)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            if (r0 == 0) goto L44
            org.apache.commons.net.ftp.FTPClient$CSL r0 = new org.apache.commons.net.ftp.FTPClient$CSL     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            java.time.Duration r1 = r8.controlKeepAliveTimeout     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            java.time.Duration r3 = r8.controlKeepAliveReplyTimeout     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            r0.<init>(r8, r1, r3)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            r10 = r0
            goto L44
        L3f:
            r0 = move-exception
            r11 = r0
            r11 = r10
            r10 = r2
            goto L66
        L44:
            int r3 = r8.getBufferSize()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            org.apache.commons.net.io.CopyStreamListener r6 = r8.mergeListeners(r10)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            r7 = 0
            r4 = -1
            r1 = r11
            org.apache.commons.net.io.Util.copyStream(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            r2.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            r9.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            boolean r9 = r8.completePendingCommand()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L3f
            if (r10 == 0) goto L65
            int[] r10 = r10.cleanUp()
            r8.cslDebug = r10
        L65:
            return r9
        L66:
            org.apache.commons.io.IOUtils.closeQuietly(r10)     // Catch: java.lang.Throwable -> L6d
            org.apache.commons.io.IOUtils.closeQuietly(r9)     // Catch: java.lang.Throwable -> L6d
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            r9 = r0
            r10 = r11
        L70:
            if (r10 == 0) goto L78
            int[] r10 = r10.cleanUp()
            r8.cslDebug = r10
        L78:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.FTPClient._storeFile(java.lang.String, java.lang.String, java.io.InputStream):boolean");
    }

    public OutputStream _storeFileStream(String str, String str2) {
        OutputStream outputStream;
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return null;
        }
        if (this.fileType == 0) {
            outputStream = new ToNetASCIIOutputStream(getBufferedOutputStream(_openDataConnection_.getOutputStream()));
        } else {
            outputStream = _openDataConnection_.getOutputStream();
        }
        return new SocketOutputStream(_openDataConnection_, outputStream);
    }

    public boolean abort() {
        return FTPReply.isPositiveCompletion(abor());
    }

    public boolean allocate(int i10) {
        return FTPReply.isPositiveCompletion(allo(i10));
    }

    public boolean appendFile(String str, InputStream inputStream) {
        return storeFile(FTPCmd.APPE, str, inputStream);
    }

    public OutputStream appendFileStream(String str) {
        return storeFileStream(FTPCmd.APPE, str);
    }

    public boolean changeToParentDirectory() {
        return FTPReply.isPositiveCompletion(cdup());
    }

    public boolean changeWorkingDirectory(String str) {
        return FTPReply.isPositiveCompletion(cwd(str));
    }

    public boolean completePendingCommand() {
        return FTPReply.isPositiveCompletion(getReply());
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        this.ftpClientConfig = fTPClientConfig;
    }

    public void createParser(String str) {
        if (this.entryParser != null && (str == null || this.entryParserKey.equals(str))) {
            return;
        }
        if (str != null) {
            this.entryParser = this.parserFactory.createFileEntryParser(str);
            this.entryParserKey = str;
            return;
        }
        FTPClientConfig fTPClientConfig = this.ftpClientConfig;
        if (fTPClientConfig != null && !fTPClientConfig.getServerSystemKey().isEmpty()) {
            this.entryParser = this.parserFactory.createFileEntryParser(this.ftpClientConfig);
            this.entryParserKey = this.ftpClientConfig.getServerSystemKey();
            return;
        }
        String systemTypeOverride = getSystemTypeOverride();
        FTPClientConfig fTPClientConfig2 = this.ftpClientConfig;
        FTPFileEntryParserFactory fTPFileEntryParserFactory = this.parserFactory;
        if (fTPClientConfig2 != null) {
            this.entryParser = fTPFileEntryParserFactory.createFileEntryParser(new FTPClientConfig(systemTypeOverride, this.ftpClientConfig));
        } else {
            this.entryParser = fTPFileEntryParserFactory.createFileEntryParser(systemTypeOverride);
        }
        this.entryParserKey = systemTypeOverride;
    }

    public boolean deleteFile(String str) {
        return FTPReply.isPositiveCompletion(dele(str));
    }

    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        initDefaults();
    }

    public boolean doCommand(String str, String str2) {
        return FTPReply.isPositiveCompletion(sendCommand(str, str2));
    }

    public String[] doCommandAsStrings(String str, String str2) {
        if (FTPReply.isPositiveCompletion(sendCommand(str, str2))) {
            return getReplyStrings();
        }
        return null;
    }

    public void enterLocalActiveMode() {
        this.dataConnectionMode = 0;
        this.passiveHost = null;
        this.passivePort = -1;
    }

    public void enterLocalPassiveMode() {
        this.dataConnectionMode = 2;
        this.passiveHost = null;
        this.passivePort = -1;
    }

    public boolean enterRemoteActiveMode(InetAddress inetAddress, int i10) {
        if (FTPReply.isPositiveCompletion(port(inetAddress, i10))) {
            this.dataConnectionMode = 1;
            this.passiveHost = null;
            this.passivePort = -1;
            return true;
        }
        return false;
    }

    public boolean enterRemotePassiveMode() {
        if (pasv() != 227) {
            return false;
        }
        this.dataConnectionMode = 3;
        _parsePassiveModeReply(this._replyLines.get(0));
        return true;
    }

    public String featureValue(String str) {
        String[] featureValues = featureValues(str);
        if (featureValues != null) {
            return featureValues[0];
        }
        return null;
    }

    public String[] featureValues(String str) {
        Set<String> set;
        if (!initFeatureMap() || (set = this.featuresMap.get(str.toUpperCase(Locale.ENGLISH))) == null) {
            return null;
        }
        return (String[]) set.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public boolean features() {
        return FTPReply.isPositiveCompletion(feat());
    }

    public int getActivePort() {
        int i10;
        int i11 = this.activeMinPort;
        if (i11 > 0 && (i10 = this.activeMaxPort) >= i11) {
            if (i10 == i11) {
                return i10;
            }
            return this.random.nextInt((i10 - i11) + 1) + this.activeMinPort;
        }
        return 0;
    }

    public boolean getAutodetectUTF8() {
        return this.autoDetectEncoding;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    @Deprecated
    public int getControlKeepAliveReplyTimeout() {
        return DurationUtils.toMillisInt(this.controlKeepAliveReplyTimeout);
    }

    public Duration getControlKeepAliveReplyTimeoutDuration() {
        return this.controlKeepAliveReplyTimeout;
    }

    @Deprecated
    public long getControlKeepAliveTimeout() {
        long seconds;
        seconds = this.controlKeepAliveTimeout.getSeconds();
        return seconds;
    }

    public Duration getControlKeepAliveTimeoutDuration() {
        return this.controlKeepAliveTimeout;
    }

    public CopyStreamListener getCopyStreamListener() {
        return this.copyStreamListener;
    }

    @Deprecated
    public int[] getCslDebug() {
        return this.cslDebug;
    }

    public int getDataConnectionMode() {
        return this.dataConnectionMode;
    }

    public Duration getDataTimeout() {
        return this.dataTimeout;
    }

    public FTPFileEntryParser getEntryParser() {
        return this.entryParser;
    }

    public InetAddress getHostAddress() {
        InetAddress inetAddress = this.activeExternalHost;
        if (inetAddress != null) {
            return inetAddress;
        }
        return getLocalAddress();
    }

    public String getListArguments(String str) {
        if (getListHiddenFiles()) {
            if (str != null) {
                return ai.onnxruntime.a.p(new StringBuilder(str.length() + 3), "-a ", str);
            }
            return "-a";
        }
        return str;
    }

    public boolean getListHiddenFiles() {
        return this.listHiddenFiles;
    }

    public String getModificationTime(String str) {
        if (FTPReply.isPositiveCompletion(mdtm(str))) {
            return getReplyString(0).substring(4);
        }
        return null;
    }

    public String getPassiveHost() {
        return this.passiveHost;
    }

    public InetAddress getPassiveLocalIPAddress() {
        return this.passiveLocalHost;
    }

    public int getPassivePort() {
        return this.passivePort;
    }

    public int getReceiveDataSocketBufferSize() {
        return this.receiveDataSocketBufferSize;
    }

    public InetAddress getReportHostAddress() {
        InetAddress inetAddress = this.reportActiveExternalHost;
        if (inetAddress != null) {
            return inetAddress;
        }
        return getHostAddress();
    }

    public long getRestartOffset() {
        return this.restartOffset;
    }

    public int getSendDataSocketBufferSize() {
        return this.sendDataSocketBufferSize;
    }

    public String getSize(String str) {
        if (FTPReply.isPositiveCompletion(size(str))) {
            return getReplyString(0).substring(4);
        }
        return null;
    }

    public String getStatus() {
        if (FTPReply.isPositiveCompletion(stat())) {
            return getReplyString();
        }
        return null;
    }

    @Deprecated
    public String getSystemName() {
        if (this.systemName == null && FTPReply.isPositiveCompletion(syst())) {
            this.systemName = this._replyLines.get(r0.size() - 1).substring(4);
        }
        return this.systemName;
    }

    public String getSystemType() {
        if (this.systemName == null) {
            if (FTPReply.isPositiveCompletion(syst())) {
                this.systemName = this._replyLines.get(r0.size() - 1).substring(4);
            } else {
                String property = System.getProperty(FTP_SYSTEM_TYPE_DEFAULT);
                if (property != null) {
                    this.systemName = property;
                } else {
                    b.w(getReplyString(), "Unable to determine system type - response: ");
                    return null;
                }
            }
        }
        return this.systemName;
    }

    public String getSystemTypeOverride() {
        String property;
        String property2 = System.getProperty(FTP_SYSTEM_TYPE);
        if (property2 == null) {
            property2 = getSystemType();
            Properties overrideProperties = getOverrideProperties();
            if (overrideProperties != null && (property = overrideProperties.getProperty(property2)) != null) {
                return property;
            }
        }
        return property2;
    }

    public boolean hasFeature(String str, String str2) {
        Set<String> set;
        if (!initFeatureMap() || (set = this.featuresMap.get(str.toUpperCase(Locale.ENGLISH))) == null) {
            return false;
        }
        return set.contains(str2);
    }

    public FTPListParseEngine initiateMListParsing(String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.MLSD, str);
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(MLSxEntryParser.getInstance(), this.ftpClientConfig);
        if (_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(_openDataConnection_.getInputStream(), getControlEncoding());
            return fTPListParseEngine;
        } finally {
            IOUtils.closeQuietly(_openDataConnection_);
            completePendingCommand();
        }
    }

    public boolean isIpAddressFromPasvResponse() {
        return this.ipAddressFromPasvResponse;
    }

    public boolean isRemoteVerificationEnabled() {
        return this.remoteVerificationEnabled;
    }

    public boolean isUseEPSVwithIPv4() {
        return this.useEPSVwithIPv4;
    }

    public FTPFile[] listDirectories(String str) {
        return listFiles(str, FTPFileFilters.DIRECTORIES);
    }

    public FTPFile[] listFiles(String str) {
        return initiateListParsing((String) null, str).getFiles();
    }

    public String listHelp() {
        if (FTPReply.isPositiveCompletion(help())) {
            return getReplyString();
        }
        return null;
    }

    public String[] listNames(String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.NLST, getListArguments(str));
        if (_openDataConnection_ == null) {
            if (_openDataConnection_ != null) {
                _openDataConnection_.close();
            }
            return null;
        }
        try {
            InputStream inputStream = _openDataConnection_.getInputStream();
            try {
                List<String> readLines = IOUtils.readLines(inputStream, getControlEncoding());
                if (inputStream != null) {
                    inputStream.close();
                }
                _openDataConnection_.close();
                if (!completePendingCommand()) {
                    return null;
                }
                return (String[]) readLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
            } finally {
            }
        } catch (Throwable th) {
            try {
                _openDataConnection_.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean login(String str, String str2, String str3) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        pass(str2);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        return FTPReply.isPositiveCompletion(acct(str3));
    }

    public boolean logout() {
        return FTPReply.isPositiveCompletion(quit());
    }

    public boolean makeDirectory(String str) {
        return FTPReply.isPositiveCompletion(mkd(str));
    }

    public Calendar mdtmCalendar(String str) {
        String modificationTime = getModificationTime(str);
        if (modificationTime != null) {
            return MLSxEntryParser.parseGMTdateTime(modificationTime);
        }
        return null;
    }

    public FTPFile mdtmFile(String str) {
        String modificationTime = getModificationTime(str);
        if (modificationTime != null) {
            FTPFile fTPFile = new FTPFile();
            fTPFile.setName(str);
            fTPFile.setRawListing(modificationTime);
            fTPFile.setTimestamp(MLSxEntryParser.parseGMTdateTime(modificationTime));
            return fTPFile;
        }
        return null;
    }

    public Instant mdtmInstant(String str) {
        String modificationTime = getModificationTime(str);
        if (modificationTime != null) {
            return MLSxEntryParser.parseGmtInstant(modificationTime);
        }
        return null;
    }

    public FTPFile[] mlistDir(String str) {
        return initiateMListParsing(str).getFiles();
    }

    public FTPFile mlistFile(String str) {
        if (FTPReply.isPositiveCompletion(sendCommand(FTPCmd.MLST, str))) {
            String replyString = getReplyString(1);
            if (replyString.charAt(0) != ' ') {
                replyString = " ".concat(replyString);
            }
            if (replyString.length() >= 3) {
                return MLSxEntryParser.parseEntry(replyString.replaceAll("^\\s+", ""));
            }
            throw new MalformedServerReplyException(ai.onnxruntime.a.m("Invalid server reply (MLST): '", replyString, "'"));
        }
        return null;
    }

    public String printWorkingDirectory() {
        if (pwd() != 257) {
            return null;
        }
        return parsePathname(this._replyLines.get(r0.size() - 1));
    }

    public boolean reinitialize() {
        rein();
        if (!FTPReply.isPositiveCompletion(this._replyCode) && (!FTPReply.isPositivePreliminary(this._replyCode) || !FTPReply.isPositiveCompletion(getReply()))) {
            return false;
        }
        initDefaults();
        return true;
    }

    public boolean remoteAppend(String str) {
        int i10 = this.dataConnectionMode;
        if (i10 != 1 && i10 != 3) {
            return false;
        }
        return FTPReply.isPositivePreliminary(appe(str));
    }

    public boolean remoteRetrieve(String str) {
        int i10 = this.dataConnectionMode;
        if (i10 != 1 && i10 != 3) {
            return false;
        }
        return FTPReply.isPositivePreliminary(retr(str));
    }

    public boolean remoteStore(String str) {
        int i10 = this.dataConnectionMode;
        if (i10 != 1 && i10 != 3) {
            return false;
        }
        return FTPReply.isPositivePreliminary(stor(str));
    }

    public boolean remoteStoreUnique() {
        int i10 = this.dataConnectionMode;
        if (i10 != 1 && i10 != 3) {
            return false;
        }
        return FTPReply.isPositivePreliminary(stou());
    }

    public boolean removeDirectory(String str) {
        return FTPReply.isPositiveCompletion(rmd(str));
    }

    public boolean rename(String str, String str2) {
        if (!FTPReply.isPositiveIntermediate(rnfr(str))) {
            return false;
        }
        return FTPReply.isPositiveCompletion(rnto(str2));
    }

    public boolean restart(long j10) {
        this.restartOffset = 0L;
        return FTPReply.isPositiveIntermediate(rest(Long.toString(j10)));
    }

    public boolean retrieveFile(String str, OutputStream outputStream) {
        return _retrieveFile(FTPCmd.RETR.getCommand(), str, outputStream);
    }

    public InputStream retrieveFileStream(String str) {
        return _retrieveFileStream(FTPCmd.RETR.getCommand(), str);
    }

    public boolean sendNoOp() {
        return FTPReply.isPositiveCompletion(noop());
    }

    public boolean sendSiteCommand(String str) {
        return FTPReply.isPositiveCompletion(site(str));
    }

    public void setActiveExternalIPAddress(String str) {
        this.activeExternalHost = InetAddress.getByName(str);
    }

    public void setActivePortRange(int i10, int i11) {
        this.activeMinPort = i10;
        this.activeMaxPort = i11;
    }

    public void setAutodetectUTF8(boolean z9) {
        this.autoDetectEncoding = z9;
    }

    public void setBufferSize(int i10) {
        this.bufferSize = i10;
    }

    @Deprecated
    public void setControlKeepAliveReplyTimeout(int i10) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(i10);
        this.controlKeepAliveReplyTimeout = ofMillis;
    }

    public void setControlKeepAliveTimeout(Duration duration) {
        this.controlKeepAliveTimeout = DurationUtils.zeroIfNull(duration);
    }

    public void setCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.copyStreamListener = copyStreamListener;
    }

    @Deprecated
    public void setDataTimeout(int i10) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(i10);
        this.dataTimeout = ofMillis;
    }

    public boolean setFileStructure(int i10) {
        if (FTPReply.isPositiveCompletion(stru(i10))) {
            this.fileStructure = i10;
            return true;
        }
        return false;
    }

    public boolean setFileTransferMode(int i10) {
        if (FTPReply.isPositiveCompletion(mode(i10))) {
            this.fileTransferMode = i10;
            return true;
        }
        return false;
    }

    public boolean setFileType(int i10) {
        if (FTPReply.isPositiveCompletion(type(i10))) {
            this.fileType = i10;
            this.formatOrByteSize = 4;
            return true;
        }
        return false;
    }

    public void setIpAddressFromPasvResponse(boolean z9) {
        this.ipAddressFromPasvResponse = z9;
    }

    public void setListHiddenFiles(boolean z9) {
        this.listHiddenFiles = z9;
    }

    public boolean setModificationTime(String str, String str2) {
        return FTPReply.isPositiveCompletion(mfmt(str, str2));
    }

    public void setParserFactory(FTPFileEntryParserFactory fTPFileEntryParserFactory) {
        this.parserFactory = fTPFileEntryParserFactory;
    }

    public void setPassiveLocalIPAddress(String str) {
        this.passiveLocalHost = InetAddress.getByName(str);
    }

    @Deprecated
    public void setPassiveNatWorkaround(boolean z9) {
        NatServerResolverImpl natServerResolverImpl;
        if (z9) {
            natServerResolverImpl = new NatServerResolverImpl(this);
        } else {
            natServerResolverImpl = null;
        }
        this.passiveNatWorkaroundStrategy = natServerResolverImpl;
    }

    public void setPassiveNatWorkaroundStrategy(HostnameResolver hostnameResolver) {
        this.passiveNatWorkaroundStrategy = hostnameResolver;
    }

    public void setReceieveDataSocketBufferSize(int i10) {
        this.receiveDataSocketBufferSize = i10;
    }

    public void setRemoteVerificationEnabled(boolean z9) {
        this.remoteVerificationEnabled = z9;
    }

    public void setReportActiveExternalIPAddress(String str) {
        this.reportActiveExternalHost = InetAddress.getByName(str);
    }

    public void setRestartOffset(long j10) {
        if (j10 >= 0) {
            this.restartOffset = j10;
        }
    }

    public void setSendDataSocketBufferSize(int i10) {
        this.sendDataSocketBufferSize = i10;
    }

    public void setUseEPSVwithIPv4(boolean z9) {
        this.useEPSVwithIPv4 = z9;
    }

    public boolean storeUniqueFile(InputStream inputStream) {
        return storeFile(FTPCmd.STOU, null, inputStream);
    }

    public OutputStream storeUniqueFileStream() {
        return storeFileStream(FTPCmd.STOU, null);
    }

    public boolean structureMount(String str) {
        return FTPReply.isPositiveCompletion(smnt(str));
    }

    public FTPFile[] listDirectories() {
        return listDirectories(null);
    }

    @Deprecated
    public void setControlKeepAliveTimeout(long j10) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(j10);
        this.controlKeepAliveTimeout = ofSeconds;
    }

    public void setPassiveLocalIPAddress(InetAddress inetAddress) {
        this.passiveLocalHost = inetAddress;
    }

    public void setControlKeepAliveReplyTimeout(Duration duration) {
        this.controlKeepAliveReplyTimeout = DurationUtils.zeroIfNull(duration);
    }

    public void setDataTimeout(Duration duration) {
        this.dataTimeout = DurationUtils.zeroIfNull(duration);
    }

    public boolean storeUniqueFile(String str, InputStream inputStream) {
        return storeFile(FTPCmd.STOU, str, inputStream);
    }

    public OutputStream storeUniqueFileStream(String str) {
        return storeFileStream(FTPCmd.STOU, str);
    }

    public boolean allocate(int i10, int i11) {
        return FTPReply.isPositiveCompletion(allo(i10, i11));
    }

    public FTPFile[] mlistDir() {
        return mlistDir(null);
    }

    public boolean storeFile(String str, InputStream inputStream) {
        return storeFile(FTPCmd.STOR, str, inputStream);
    }

    public OutputStream storeFileStream(String str) {
        return storeFileStream(FTPCmd.STOR, str);
    }

    public boolean allocate(long j10) {
        return FTPReply.isPositiveCompletion(allo(j10));
    }

    public FTPFile[] listFiles() {
        return listFiles(null);
    }

    public FTPFile[] mlistDir(String str, FTPFileFilter fTPFileFilter) {
        return initiateMListParsing(str).getFiles(fTPFileFilter);
    }

    public boolean allocate(long j10, int i10) {
        return FTPReply.isPositiveCompletion(allo(j10, i10));
    }

    public FTPFile[] listFiles(String str, FTPFileFilter fTPFileFilter) {
        return initiateListParsing((String) null, str).getFiles(fTPFileFilter);
    }

    public String getStatus(String str) {
        if (FTPReply.isPositiveCompletion(stat(str))) {
            return getReplyString();
        }
        return null;
    }

    public String listHelp(String str) {
        if (FTPReply.isPositiveCompletion(help(str))) {
            return getReplyString();
        }
        return null;
    }

    public boolean setFileType(int i10, int i11) {
        if (!FTPReply.isPositiveCompletion(type(i10, i11))) {
            return false;
        }
        this.fileType = i10;
        this.formatOrByteSize = i11;
        return true;
    }

    public boolean remoteStoreUnique(String str) {
        int i10 = this.dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(stou(str));
        }
        return false;
    }

    public boolean hasFeature(String str) {
        if (initFeatureMap()) {
            return this.featuresMap.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    public boolean hasFeature(FTPCmd fTPCmd) {
        return hasFeature(fTPCmd.name());
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class CSL implements CopyStreamListener {
        private int acksAcked;
        private final int currentSoTimeoutMillis;
        private final long idleMillis;
        private int ioErrors;
        private long lastIdleTimeMillis = System.currentTimeMillis();
        private int notAcked;
        private final FTPClient parent;

        public CSL(FTPClient fTPClient, Duration duration, Duration duration2) {
            long millis;
            millis = duration.toMillis();
            this.idleMillis = millis;
            this.parent = fTPClient;
            this.currentSoTimeoutMillis = fTPClient.getSoTimeout();
            fTPClient.setSoTimeout(DurationUtils.toMillisInt(duration2));
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public void bytesTransferred(long j10, int i10, long j11) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastIdleTimeMillis > this.idleMillis) {
                try {
                    this.parent.__noop();
                    this.acksAcked++;
                } catch (SocketTimeoutException unused) {
                    this.notAcked++;
                } catch (IOException unused2) {
                    this.ioErrors++;
                }
                this.lastIdleTimeMillis = currentTimeMillis;
            }
        }

        public int[] cleanUp() {
            FTPClient fTPClient;
            int i10 = this.notAcked;
            while (true) {
                try {
                    int i11 = this.notAcked;
                    fTPClient = this.parent;
                    if (i11 <= 0) {
                        break;
                    }
                    fTPClient.getReply();
                    this.notAcked--;
                } catch (SocketTimeoutException unused) {
                    this.parent.setSoTimeout(this.currentSoTimeoutMillis);
                } catch (Throwable th) {
                    this.parent.setSoTimeout(this.currentSoTimeoutMillis);
                    throw th;
                }
            }
            fTPClient.setSoTimeout(this.currentSoTimeoutMillis);
            return new int[]{this.acksAcked, i10, this.notAcked, this.ioErrors};
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
            bytesTransferred(copyStreamEvent.getTotalBytesTransferred(), copyStreamEvent.getBytesTransferred(), copyStreamEvent.getStreamSize());
        }
    }

    public FTPListParseEngine initiateListParsing() {
        return initiateListParsing(null);
    }

    public FTPListParseEngine initiateListParsing(String str) {
        return initiateListParsing((String) null, str);
    }

    public FTPListParseEngine initiateListParsing(String str, String str2) {
        createParser(str);
        return initiateListParsing(this.entryParser, str2);
    }

    public FTPListParseEngine initiateMListParsing() {
        return initiateMListParsing(null);
    }

    public boolean login(String str, String str2) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (FTPReply.isPositiveIntermediate(this._replyCode)) {
            return FTPReply.isPositiveCompletion(pass(str2));
        }
        return false;
    }

    public String[] listNames() {
        return listNames(null);
    }

    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        _connectAction_(null);
    }

    @Deprecated
    public Socket _openDataConnection_(int i10, String str) {
        return _openDataConnection_(FTPCommand.getCommand(i10), str);
    }

    public Socket _openDataConnection_(FTPCmd fTPCmd, String str) {
        return _openDataConnection_(fTPCmd.getCommand(), str);
    }
}
