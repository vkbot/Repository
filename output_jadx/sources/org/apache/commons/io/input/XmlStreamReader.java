package org.apache.commons.io.input;

import androidx.appcompat.app.AppCompatDelegate;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.input.BOMInputStream;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class XmlStreamReader extends Reader {
    private static final ByteOrderMark[] BOMS;
    private static final Pattern CHARSET_PATTERN;
    private static final String EBCDIC = "CP1047";
    public static final Pattern ENCODING_PATTERN;
    private static final String HTTP_EX_1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null";
    private static final String HTTP_EX_2 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME";
    private static final String RAW_EX_1 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String US_ASCII;
    private static final String UTF_16;
    private static final String UTF_16BE;
    private static final String UTF_16LE;
    private static final String UTF_32 = "UTF-32";
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String UTF_8;
    private static final ByteOrderMark[] XML_GUESS_BYTES;
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;

    static {
        String name = StandardCharsets.UTF_8.name();
        UTF_8 = name;
        US_ASCII = StandardCharsets.US_ASCII.name();
        String name2 = StandardCharsets.UTF_16BE.name();
        UTF_16BE = name2;
        String name3 = StandardCharsets.UTF_16LE.name();
        UTF_16LE = name3;
        UTF_16 = StandardCharsets.UTF_16.name();
        BOMS = new ByteOrderMark[]{ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
        XML_GUESS_BYTES = new ByteOrderMark[]{new ByteOrderMark(name, 60, 63, FTPReply.SERVICE_NOT_READY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), new ByteOrderMark(name2, 0, 60, 0, 63), new ByteOrderMark(name3, 60, 0, 63, 0), new ByteOrderMark(UTF_32BE, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, FTPReply.SERVICE_NOT_READY, 0, 0, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), new ByteOrderMark(UTF_32LE, 60, 0, 0, 0, 63, 0, 0, 0, FTPReply.SERVICE_NOT_READY, 0, 0, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 0, 0, 0), new ByteOrderMark(EBCDIC, 76, 111, 167, 148)};
        CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
        ENCODING_PATTERN = Pattern.compile("^<\\?xml\\s+(?:version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:'1.[0-9]+'))\\s+)??encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:'[A-Za-z0-9][A-Za-z0-9._+:-]*'))", 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XmlStreamReader(URLConnection uRLConnection, String str) {
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.defaultEncoding = str;
        String contentType = uRLConnection.getContentType();
        BOMInputStream bOMInputStream = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(uRLConnection.getInputStream(), 8192))).setInclude(false).setByteOrderMarks(BOMS).get();
        BOMInputStream bOMInputStream2 = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(bOMInputStream, 8192))).setInclude(true).setByteOrderMarks(XML_GUESS_BYTES).get();
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.encoding = processHttpStream(bOMInputStream, bOMInputStream2, true);
        } else {
            this.encoding = processHttpStream(bOMInputStream, bOMInputStream2, true, contentType);
        }
        this.reader = new InputStreamReader(bOMInputStream2, this.encoding);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String doLenientDetection(java.lang.String r8, org.apache.commons.io.input.XmlStreamReaderException r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L30
            java.lang.String r0 = "text/html"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L30
            r0 = 9
            java.lang.String r8 = r8.substring(r0)
            java.lang.String r0 = "text/xml"
            java.lang.String r6 = r0.concat(r8)
            java.lang.String r2 = r9.getBomEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            java.lang.String r3 = r9.getXmlGuessEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            java.lang.String r4 = r9.getXmlEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            r5 = 1
            r1 = r7
            java.lang.String r8 = r1.calculateHttpEncoding(r2, r3, r4, r5, r6)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L29
            return r8
        L29:
            r0 = move-exception
        L2a:
            r8 = r0
            r9 = r8
            goto L31
        L2d:
            r0 = move-exception
            r1 = r7
            goto L2a
        L30:
            r1 = r7
        L31:
            java.lang.String r8 = r9.getXmlEncoding()
            if (r8 != 0) goto L3b
            java.lang.String r8 = r9.getContentTypeEncoding()
        L3b:
            if (r8 != 0) goto L43
            java.lang.String r8 = r1.defaultEncoding
            if (r8 != 0) goto L43
            java.lang.String r8 = org.apache.commons.io.input.XmlStreamReader.UTF_8
        L43:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.doLenientDetection(java.lang.String, org.apache.commons.io.input.XmlStreamReaderException):java.lang.String");
    }

    public static String getContentTypeEncoding(String str) {
        int indexOf;
        String str2;
        if (str != null && (indexOf = str.indexOf(";")) > -1) {
            Matcher matcher = CHARSET_PATTERN.matcher(str.substring(indexOf + 1));
            if (matcher.find()) {
                str2 = matcher.group(1);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return str2.toUpperCase(Locale.ROOT);
            }
        }
        return null;
    }

    public static String getContentTypeMime(String str) {
        if (str != null) {
            int indexOf = str.indexOf(";");
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            return str.trim();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        n0.b.A("Unexpected end of XML stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        n0.b.A(ai.onnxruntime.a.f(r7, "XML prolog or ROOT element not found on first ", " bytes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r3 != (-1)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getXmlProlog(java.io.InputStream r9, java.lang.String r10) {
        /*
            if (r10 == 0) goto L8d
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            r1 = 8192(0x2000, float:1.14794E-41)
            r9.mark(r1)
            r2 = 0
            int r3 = r9.read(r0, r2, r1)
            r4 = -1
            java.lang.String r5 = ""
            r8 = r1
            r7 = r2
            r6 = r4
        L16:
            if (r3 == r4) goto L2e
            if (r6 != r4) goto L2e
            if (r7 >= r1) goto L2e
            int r7 = r7 + r3
            int r8 = r8 - r3
            int r3 = r9.read(r0, r7, r8)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2, r7, r10)
            r6 = 62
            int r6 = r5.indexOf(r6)
            goto L16
        L2e:
            if (r6 != r4) goto L46
            if (r3 != r4) goto L39
            java.lang.String r9 = "Unexpected end of XML stream"
            n0.b.A(r9)
            r9 = 0
            return r9
        L39:
            java.lang.String r9 = "XML prolog or ROOT element not found on first "
            java.lang.String r10 = " bytes"
            java.lang.String r9 = ai.onnxruntime.a.f(r7, r9, r10)
            n0.b.A(r9)
            r9 = 0
            return r9
        L46:
            if (r7 <= 0) goto L8d
            r9.reset()
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.StringReader r10 = new java.io.StringReader
            r0 = 1
            int r6 = r6 + r0
            java.lang.String r1 = r5.substring(r2, r6)
            r10.<init>(r1)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.stream.Stream r9 = r9.lines()
            org.apache.commons.io.input.j r1 = new org.apache.commons.io.input.j
            r2 = 2
            r1.<init>(r2, r10)
            org.apache.commons.io.function.IOConsumer.forEach(r9, r1)
            java.util.regex.Pattern r9 = org.apache.commons.io.input.XmlStreamReader.ENCODING_PATTERN
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r10 = r9.find()
            if (r10 == 0) goto L8d
            java.lang.String r9 = r9.group(r0)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r10)
            int r10 = r9.length()
            int r10 = r10 - r0
            java.lang.String r9 = r9.substring(r0, r10)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.getXmlProlog(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static boolean isAppXml(String str) {
        if (str != null) {
            if (!str.equals("application/xml") && !str.equals("application/xml-dtd") && !str.equals("application/xml-external-parsed-entity")) {
                if (str.startsWith("application/") && str.endsWith("+xml")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isTextXml(String str) {
        if (str != null) {
            if (!str.equals("text/xml") && !str.equals("text/xml-external-parsed-entity")) {
                if (str.startsWith("text/") && str.endsWith("+xml")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$getXmlProlog$0(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(' ');
    }

    private String processHttpStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z9, String str) {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateHttpEncoding(bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2), z9, str);
        } catch (XmlStreamReaderException e) {
            if (z9) {
                return doLenientDetection(str, e);
            }
            throw e;
        }
    }

    public String calculateHttpEncoding(String str, String str2, String str3, boolean z9, String str4) {
        if (z9 && str3 != null) {
            return str3;
        }
        String contentTypeMime = getContentTypeMime(str4);
        String contentTypeEncoding = getContentTypeEncoding(str4);
        boolean isAppXml = isAppXml(contentTypeMime);
        boolean isTextXml = isTextXml(contentTypeMime);
        if (!isAppXml && !isTextXml) {
            throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_3, contentTypeMime, contentTypeEncoding, str, str2, str3), contentTypeMime, contentTypeEncoding, str, str2, str3);
        }
        if (contentTypeEncoding == null) {
            if (isAppXml) {
                return calculateRawEncoding(str, str2, str3);
            }
            String str5 = this.defaultEncoding;
            if (str5 == null) {
                return US_ASCII;
            }
            return str5;
        }
        if (!contentTypeEncoding.equals(UTF_16BE) && !contentTypeEncoding.equals(UTF_16LE)) {
            String str6 = UTF_16;
            if (contentTypeEncoding.equals(str6)) {
                if (str != null && str.startsWith(str6)) {
                    return str;
                }
                throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str, str2, str3), contentTypeMime, contentTypeEncoding, str, str2, str3);
            }
            if (!contentTypeEncoding.equals(UTF_32BE) && !contentTypeEncoding.equals(UTF_32LE)) {
                if (contentTypeEncoding.equals(UTF_32)) {
                    if (str != null && str.startsWith(UTF_32)) {
                        return str;
                    }
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str, str2, str3), contentTypeMime, contentTypeEncoding, str, str2, str3);
                }
            } else if (str != null) {
                throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str, str2, str3), contentTypeMime, contentTypeEncoding, str, str2, str3);
            }
        } else if (str != null) {
            throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str, str2, str3), contentTypeMime, contentTypeEncoding, str, str2, str3);
        }
        return contentTypeEncoding;
    }

    public String calculateRawEncoding(String str, String str2, String str3) {
        if (str == null) {
            if (str2 != null && str3 != null) {
                if (str3.equals(UTF_16) && (str2.equals(UTF_16BE) || str2.equals(UTF_16LE))) {
                    return str2;
                }
                return str3;
            }
            String str4 = this.defaultEncoding;
            if (str4 == null) {
                return UTF_8;
            }
            return str4;
        }
        String str5 = UTF_8;
        if (str.equals(str5)) {
            if (str2 != null && !str2.equals(str5)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(str5)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else if (!str.equals(UTF_16BE) && !str.equals(UTF_16LE)) {
            if (!str.equals(UTF_32BE) && !str.equals(UTF_32LE)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_2, str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(UTF_32) && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else {
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(UTF_16) && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        }
        return str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.reader.close();
    }

    public String getDefaultEncoding() {
        return this.defaultEncoding;
    }

    public String getEncoding() {
        return this.encoding;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        return this.reader.read(cArr, i10, i11);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<XmlStreamReader, Builder> {
        private String httpContentType;
        private boolean nullCharset = true;
        private boolean lenient = true;

        @Override // org.apache.commons.io.function.IOSupplier
        public XmlStreamReader get() {
            String name;
            if (this.nullCharset) {
                name = null;
            } else {
                name = getCharset().name();
            }
            if (this.httpContentType == null) {
                return new XmlStreamReader(getInputStream(), this.lenient, name);
            }
            return new XmlStreamReader(getInputStream(), this.httpContentType, this.lenient, name);
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(String str) {
            boolean z9;
            if (str == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.nullCharset = z9;
            return (Builder) super.setCharset(Charsets.toCharset(str, getCharsetDefault()));
        }

        public Builder setHttpContentType(String str) {
            this.httpContentType = str;
            return this;
        }

        public Builder setLenient(boolean z9) {
            this.lenient = z9;
            return this;
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            this.nullCharset = charset == null;
            return (Builder) super.setCharset(charset);
        }
    }

    private String processHttpStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z9) {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateRawEncoding(bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2));
        } catch (XmlStreamReaderException e) {
            if (z9) {
                return doLenientDetection(null, e);
            }
            throw e;
        }
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream) {
        this(inputStream, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean z9) {
        this(inputStream, z9, (String) null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean z9, String str) {
        this.defaultEncoding = str;
        Objects.requireNonNull(inputStream, "inputStream");
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String processHttpStream = processHttpStream(bOMInputStream, bOMInputStream2, z9);
        this.encoding = processHttpStream;
        this.reader = new InputStreamReader(bOMInputStream2, processHttpStream);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str, boolean z9) {
        this(inputStream, str, z9, null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str, boolean z9, String str2) {
        this.defaultEncoding = str2;
        Objects.requireNonNull(inputStream, "inputStream");
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String processHttpStream = processHttpStream(bOMInputStream, bOMInputStream2, z9, str);
        this.encoding = processHttpStream;
        this.reader = new InputStreamReader(bOMInputStream2, processHttpStream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XmlStreamReader(java.nio.file.Path r2) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = kotlin.internal.jdk8.a.m(r2)
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r2 = kotlin.io.path.f.e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.<init>(java.nio.file.Path):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(URL url) {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, "url");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XmlStreamReader(java.io.File r2) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = c5.h.i(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.<init>(java.io.File):void");
    }
}
