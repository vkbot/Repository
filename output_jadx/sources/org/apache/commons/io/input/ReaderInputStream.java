package org.apache.commons.io.input;

import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.UByte;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.charset.CharsetEncoders;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ReaderInputStream extends AbstractInputStream {
    private final CharsetEncoder charsetEncoder;
    private final CharBuffer encoderIn;
    private final ByteBuffer encoderOut;
    private boolean endOfInput;
    private CoderResult lastCoderResult;
    private final Reader reader;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<ReaderInputStream, Builder> {
        private CharsetEncoder charsetEncoder = ReaderInputStream.newEncoder(getCharset());

        public /* synthetic */ CharsetEncoder lambda$setCharsetEncoder$0() {
            return ReaderInputStream.newEncoder(getCharsetDefault());
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public ReaderInputStream get() {
            return new ReaderInputStream(this);
        }

        public CharsetEncoder getCharsetEncoder() {
            return this.charsetEncoder;
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            super.setCharset(charset);
            this.charsetEncoder = ReaderInputStream.newEncoder(getCharset());
            return this;
        }

        public Builder setCharsetEncoder(CharsetEncoder charsetEncoder) {
            CharsetEncoder charsetEncoder2 = CharsetEncoders.toCharsetEncoder(charsetEncoder, new kotlin.streams.jdk8.a(2, this));
            this.charsetEncoder = charsetEncoder2;
            super.setCharset(charsetEncoder2.charset());
            return this;
        }
    }

    @Deprecated
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i10) {
        this.reader = reader;
        CharsetEncoder charsetEncoder2 = CharsetEncoders.toCharsetEncoder(charsetEncoder);
        this.charsetEncoder = charsetEncoder2;
        CharBuffer allocate = CharBuffer.allocate(checkMinBufferSize(charsetEncoder2, i10));
        this.encoderIn = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.encoderOut = allocate2;
        allocate2.flip();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static int checkMinBufferSize(CharsetEncoder charsetEncoder, int i10) {
        float minBufferSize = minBufferSize(charsetEncoder);
        if (i10 >= minBufferSize) {
            return i10;
        }
        n0.b.v("Buffer size %,d must be at least %s for a CharsetEncoder %s.", new Object[]{Integer.valueOf(i10), Float.valueOf(minBufferSize), charsetEncoder.charset().displayName()});
        return 0;
    }

    private void fillBuffer() {
        CoderResult coderResult;
        boolean z9 = this.endOfInput;
        if (z9) {
            return;
        }
        if (!z9 && ((coderResult = this.lastCoderResult) == null || coderResult.isUnderflow())) {
            this.encoderIn.compact();
            int position = this.encoderIn.position();
            int read = this.reader.read(this.encoderIn.array(), position, this.encoderIn.remaining());
            if (read == -1) {
                this.endOfInput = true;
            } else {
                this.encoderIn.position(position + read);
            }
            this.encoderIn.flip();
        }
        this.encoderOut.compact();
        this.lastCoderResult = this.charsetEncoder.encode(this.encoderIn, this.encoderOut, this.endOfInput);
        if (this.endOfInput) {
            this.lastCoderResult = this.charsetEncoder.flush(this.encoderOut);
        }
        if (this.lastCoderResult.isError()) {
            this.lastCoderResult.throwException();
        }
        this.encoderOut.flip();
    }

    public static float minBufferSize(CharsetEncoder charsetEncoder) {
        return charsetEncoder.maxBytesPerChar() * 2.0f;
    }

    public static CharsetEncoder newEncoder(Charset charset) {
        CharsetEncoder newEncoder = Charsets.toCharset(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.encoderOut.hasRemaining()) {
            return this.encoderOut.remaining();
        }
        return 0;
    }

    @Override // org.apache.commons.io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.reader.close();
        super.close();
    }

    public CharsetEncoder getCharsetEncoder() {
        return this.charsetEncoder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i11 > 0) {
            if (this.encoderOut.hasRemaining()) {
                int min = Math.min(this.encoderOut.remaining(), i11);
                this.encoderOut.get(bArr, i10, min);
                i10 += min;
                i11 -= min;
                i12 += min;
            } else {
                if (this.endOfInput) {
                    break;
                }
                fillBuffer();
            }
        }
        if (i12 == 0 && this.endOfInput) {
            return -1;
        }
        return i12;
    }

    private ReaderInputStream(Builder builder) {
        this(builder.getReader(), builder.charsetEncoder, builder.getBufferSize());
    }

    @Deprecated
    public ReaderInputStream(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    @Deprecated
    public ReaderInputStream(Reader reader, Charset charset) {
        this(reader, charset, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReaderInputStream(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ReaderInputStream.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    @Deprecated
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 8192);
    }

    public /* synthetic */ ReaderInputStream(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Deprecated
    public ReaderInputStream(Reader reader, String str) {
        this(reader, str, 8192);
    }

    @Deprecated
    public ReaderInputStream(Reader reader, String str, int i10) {
        this(reader, Charsets.toCharset(str), i10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        checkOpen();
        while (!this.encoderOut.hasRemaining()) {
            fillBuffer();
            if (this.endOfInput && !this.encoderOut.hasRemaining()) {
                return -1;
            }
        }
        return this.encoderOut.get() & UByte.MAX_VALUE;
    }
}
