package org.apache.commons.io.output;

import java.io.File;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FileWriterWithEncoding extends ProxyWriter {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<FileWriterWithEncoding, Builder> {
        private boolean append;
        private CharsetEncoder charsetEncoder = super.getCharset().newEncoder();

        /* JADX INFO: Access modifiers changed from: private */
        public File checkOriginFile() {
            return checkOrigin().getFile();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getEncoder() {
            if (this.charsetEncoder != null && getCharset() != null && !this.charsetEncoder.charset().equals(getCharset())) {
                throw new IllegalStateException(String.format("Mismatched Charset(%s) and CharsetEncoder(%s)", getCharset(), this.charsetEncoder.charset()));
            }
            CharsetEncoder charsetEncoder = this.charsetEncoder;
            if (charsetEncoder != null) {
                return charsetEncoder;
            }
            return getCharset();
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public FileWriterWithEncoding get() {
            return new FileWriterWithEncoding(this);
        }

        public Builder setAppend(boolean z9) {
            this.append = z9;
            return this;
        }

        public Builder setCharsetEncoder(CharsetEncoder charsetEncoder) {
            this.charsetEncoder = charsetEncoder;
            return this;
        }
    }

    private FileWriterWithEncoding(Builder builder) {
        super(initWriter(builder.checkOriginFile(), builder.getEncoder(), builder.append));
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.OutputStreamWriter initWriter(java.io.File r2, java.lang.Object r3, boolean r4) {
        /*
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2.exists()
            r1 = 0
            java.io.OutputStream r1 = org.apache.commons.io.FileUtils.newOutputStream(r2, r4)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r3 == 0) goto L2d
            boolean r4 = r3 instanceof java.nio.charset.Charset     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r4 == 0) goto L15
            goto L2d
        L15:
            boolean r4 = r3 instanceof java.nio.charset.CharsetEncoder     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r4 == 0) goto L25
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.CharsetEncoder r3 = (java.nio.charset.CharsetEncoder) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L21:
            r3 = move-exception
            goto L39
        L23:
            r3 = move-exception
            goto L39
        L25:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L2d:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L39:
            org.apache.commons.io.IOUtils.close(r1)     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r4 = move-exception
            r3.addSuppressed(r4)
        L41:
            if (r0 != 0) goto L46
            org.apache.commons.io.FileUtils.deleteQuietly(r2)
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.output.FileWriterWithEncoding.initWriter(java.io.File, java.lang.Object, boolean):java.io.OutputStreamWriter");
    }

    @Deprecated
    public FileWriterWithEncoding(File file, Charset charset) {
        this(file, charset, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, Charset charset, boolean z9) {
        this(initWriter(file, charset, z9));
    }

    @Deprecated
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) {
        this(file, charsetEncoder, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z9) {
        this(initWriter(file, charsetEncoder, z9));
    }

    @Deprecated
    public FileWriterWithEncoding(File file, String str) {
        this(file, str, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, String str, boolean z9) {
        this(initWriter(file, str, z9));
    }

    private FileWriterWithEncoding(OutputStreamWriter outputStreamWriter) {
        super(outputStreamWriter);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, Charset charset) {
        this(new File(str), charset, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, Charset charset, boolean z9) {
        this(new File(str), charset, z9);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) {
        this(new File(str), charsetEncoder, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z9) {
        this(new File(str), charsetEncoder, z9);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, String str2) {
        this(new File(str), str2, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, String str2, boolean z9) {
        this(new File(str), str2, z9);
    }
}
