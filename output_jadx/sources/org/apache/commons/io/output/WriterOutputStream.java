package org.apache.commons.io.output;

import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.charset.CharsetDecoders;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class WriterOutputStream extends OutputStream {
    private static final int BUFFER_SIZE = 8192;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    @Deprecated
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i10, boolean z9) {
        this.decoderIn = ByteBuffer.allocate(128);
        checkIbmJdkWithBrokenUTF16(CharsetDecoders.toCharsetDecoder(charsetDecoder).charset());
        this.writer = writer;
        this.decoder = CharsetDecoders.toCharsetDecoder(charsetDecoder);
        this.writeImmediately = z9;
        this.decoderOut = CharBuffer.allocate(i10);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static void checkIbmJdkWithBrokenUTF16(Charset charset) {
        boolean z9;
        if (StandardCharsets.UTF_16.name().equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            CharBuffer allocate2 = CharBuffer.allocate(3);
            int length = bytes.length;
            for (int i10 = 0; i10 < length; i10++) {
                allocate.put(bytes[i10]);
                allocate.flip();
                if (i10 == length - 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                try {
                    newDecoder.decode(allocate, allocate2, z9);
                    allocate.compact();
                } catch (IllegalArgumentException unused) {
                    androidx.navigation.b.g("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                    return;
                }
            }
            allocate2.rewind();
            if ("vés".equals(allocate2.toString())) {
                return;
            }
            androidx.navigation.b.g("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }
    }

    private void flushOutput() {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z9) {
        CoderResult decode;
        this.decoderIn.flip();
        while (true) {
            decode = this.decoder.decode(this.decoderIn, this.decoderOut, z9);
            if (!decode.isOverflow()) {
                break;
            } else {
                flushOutput();
            }
        }
        if (decode.isUnderflow()) {
            this.decoderIn.compact();
        } else {
            n0.b.A("Unexpected coder result");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        flushOutput();
        this.writer.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        while (i11 > 0) {
            int min = Math.min(i11, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i10, min);
            processInput(false);
            i11 -= min;
            i10 += min;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<WriterOutputStream, Builder> {
        private CharsetDecoder charsetDecoder = getCharset().newDecoder();
        private boolean writeImmediately;

        @Override // org.apache.commons.io.function.IOSupplier
        public WriterOutputStream get() {
            return new WriterOutputStream(this);
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            super.setCharset(charset);
            this.charsetDecoder = getCharset().newDecoder();
            return this;
        }

        public Builder setCharsetDecoder(CharsetDecoder charsetDecoder) {
            if (charsetDecoder == null) {
                charsetDecoder = getCharsetDefault().newDecoder();
            }
            this.charsetDecoder = charsetDecoder;
            super.setCharset(charsetDecoder.charset());
            return this;
        }

        public Builder setWriteImmediately(boolean z9) {
            this.writeImmediately = z9;
            return this;
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(String str) {
            super.setCharset(str);
            this.charsetDecoder = getCharset().newDecoder();
            return this;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    private WriterOutputStream(Builder builder) {
        this(builder.getWriter(), builder.charsetDecoder, builder.getBufferSize(), builder.writeImmediately);
    }

    @Deprecated
    public WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), 8192, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, 8192, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WriterOutputStream(java.io.Writer r2, java.nio.charset.Charset r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r3 = r3.onUnmappableCharacter(r0)
            java.lang.String r0 = "?"
            java.nio.charset.CharsetDecoder r3 = r3.replaceWith(r0)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.output.WriterOutputStream.<init>(java.io.Writer, java.nio.charset.Charset, int, boolean):void");
    }

    @Deprecated
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 8192, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, String str) {
        this(writer, str, 8192, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, String str, int i10, boolean z9) {
        this(writer, Charsets.toCharset(str), i10, z9);
    }
}
