package org.apache.commons.net.ftp.parser;

import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class DefaultFTPFileEntryParserFactory implements FTPFileEntryParserFactory {
    private static final String JAVA_IDENTIFIER = "\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final String JAVA_QUALIFIED_NAME = "(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final Pattern JAVA_QUALIFIED_NAME_PATTERN = Pattern.compile(JAVA_QUALIFIED_NAME);

    private FTPFileEntryParser createFileEntryParser(String str, FTPClientConfig fTPClientConfig) {
        FTPFileEntryParser fTPFileEntryParser = null;
        if (JAVA_QUALIFIED_NAME_PATTERN.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    fTPFileEntryParser = (FTPFileEntryParser) cls.getConstructor(null).newInstance(null);
                } catch (ClassCastException e) {
                    throw new ParserInitializationException(cls.getName() + " does not implement the interface " + FTPFileEntryParser.class.getCanonicalName(), e);
                } catch (Exception e6) {
                    e = e6;
                    throw new ParserInitializationException("Error initializing parser", e);
                } catch (LinkageError e10) {
                    e = e10;
                    throw new ParserInitializationException("Error initializing parser", e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        if (fTPFileEntryParser == null) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.contains(FTPClientConfig.SYST_UNIX_TRIM_LEADING)) {
                fTPFileEntryParser = new UnixFTPEntryParser(fTPClientConfig, true);
            } else if (upperCase.contains(FTPClientConfig.SYST_UNIX)) {
                fTPFileEntryParser = new UnixFTPEntryParser(fTPClientConfig, false);
            } else if (upperCase.contains(FTPClientConfig.SYST_VMS)) {
                fTPFileEntryParser = new VMSVersioningFTPEntryParser(fTPClientConfig);
            } else if (upperCase.contains(FTPClientConfig.SYST_NT)) {
                fTPFileEntryParser = createNTFTPEntryParser(fTPClientConfig);
            } else if (upperCase.contains(FTPClientConfig.SYST_OS2)) {
                fTPFileEntryParser = new OS2FTPEntryParser(fTPClientConfig);
            } else if (!upperCase.contains(FTPClientConfig.SYST_OS400) && !upperCase.contains(FTPClientConfig.SYST_AS400)) {
                if (upperCase.contains(FTPClientConfig.SYST_MVS)) {
                    fTPFileEntryParser = new MVSFTPEntryParser();
                } else if (upperCase.contains(FTPClientConfig.SYST_NETWARE)) {
                    fTPFileEntryParser = new NetwareFTPEntryParser(fTPClientConfig);
                } else if (upperCase.contains(FTPClientConfig.SYST_MACOS_PETER)) {
                    fTPFileEntryParser = new MacOsPeterFTPEntryParser(fTPClientConfig);
                } else if (upperCase.contains(FTPClientConfig.SYST_L8)) {
                    fTPFileEntryParser = new UnixFTPEntryParser(fTPClientConfig);
                } else {
                    throw new ParserInitializationException("Unknown parser type: ".concat(str));
                }
            } else {
                fTPFileEntryParser = createOS400FTPEntryParser(fTPClientConfig);
            }
        }
        if (fTPFileEntryParser instanceof Configurable) {
            ((Configurable) fTPFileEntryParser).configure(fTPClientConfig);
        }
        return fTPFileEntryParser;
    }

    private FTPFileEntryParser createNTFTPEntryParser(FTPClientConfig fTPClientConfig) {
        FTPClientConfig fTPClientConfig2;
        boolean z9;
        if (fTPClientConfig != null && FTPClientConfig.SYST_NT.equals(fTPClientConfig.getServerSystemKey())) {
            return new NTFTPEntryParser(fTPClientConfig);
        }
        if (fTPClientConfig != null) {
            fTPClientConfig2 = new FTPClientConfig(fTPClientConfig);
        } else {
            fTPClientConfig2 = null;
        }
        NTFTPEntryParser nTFTPEntryParser = new NTFTPEntryParser(fTPClientConfig);
        if (fTPClientConfig2 != null && FTPClientConfig.SYST_UNIX_TRIM_LEADING.equals(fTPClientConfig2.getServerSystemKey())) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new CompositeFileEntryParser(new FTPFileEntryParser[]{nTFTPEntryParser, new UnixFTPEntryParser(fTPClientConfig2, z9)});
    }

    private FTPFileEntryParser createOS400FTPEntryParser(FTPClientConfig fTPClientConfig) {
        FTPClientConfig fTPClientConfig2;
        boolean z9;
        if (fTPClientConfig != null && FTPClientConfig.SYST_OS400.equals(fTPClientConfig.getServerSystemKey())) {
            return new OS400FTPEntryParser(fTPClientConfig);
        }
        if (fTPClientConfig != null) {
            fTPClientConfig2 = new FTPClientConfig(fTPClientConfig);
        } else {
            fTPClientConfig2 = null;
        }
        OS400FTPEntryParser oS400FTPEntryParser = new OS400FTPEntryParser(fTPClientConfig);
        if (fTPClientConfig2 != null && FTPClientConfig.SYST_UNIX_TRIM_LEADING.equals(fTPClientConfig2.getServerSystemKey())) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new CompositeFileEntryParser(new FTPFileEntryParser[]{oS400FTPEntryParser, new UnixFTPEntryParser(fTPClientConfig2, z9)});
    }

    public FTPFileEntryParser createMVSEntryParser() {
        return new MVSFTPEntryParser();
    }

    public FTPFileEntryParser createNetwareFTPEntryParser() {
        return new NetwareFTPEntryParser();
    }

    public FTPFileEntryParser createOS2FTPEntryParser() {
        return new OS2FTPEntryParser();
    }

    public FTPFileEntryParser createUnixFTPEntryParser() {
        return new UnixFTPEntryParser();
    }

    public FTPFileEntryParser createVMSVersioningFTPEntryParser() {
        return new VMSVersioningFTPEntryParser();
    }

    public FTPFileEntryParser createNTFTPEntryParser() {
        return createNTFTPEntryParser(null);
    }

    public FTPFileEntryParser createOS400FTPEntryParser() {
        return createOS400FTPEntryParser(null);
    }

    @Override // org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory
    public FTPFileEntryParser createFileEntryParser(String str) {
        if (str != null) {
            return createFileEntryParser(str, null);
        }
        throw new ParserInitializationException("Parser key cannot be null");
    }

    @Override // org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory
    public FTPFileEntryParser createFileEntryParser(FTPClientConfig fTPClientConfig) {
        return createFileEntryParser(fTPClientConfig.getServerSystemKey(), fTPClientConfig);
    }
}
