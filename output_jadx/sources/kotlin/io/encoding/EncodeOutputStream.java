package kotlin.io.encoding;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@ExperimentalEncodingApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "base64", "Lkotlin/io/encoding/Base64;", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "isClosed", "", "lineLength", "", "symbolBuffer", "", "byteBuffer", "byteBufferLength", "write", "", "b", "source", TypedValues.CycleType.S_WAVE_OFFSET, "length", "flush", "close", "copyIntoByteBuffer", "startIndex", "endIndex", "encodeByteBufferIntoOutput", "encodeIntoOutput", "checkOpen", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class EncodeOutputStream extends OutputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    private final OutputStream output;
    private final byte[] symbolBuffer;

    public EncodeOutputStream(OutputStream outputStream, Base64 base64) {
        int i10;
        outputStream.getClass();
        base64.getClass();
        this.output = outputStream;
        this.base64 = base64;
        if (base64.getIsMimeScheme()) {
            i10 = base64.getMimeLineLength();
        } else {
            i10 = -1;
        }
        this.lineLength = i10;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    private final void checkOpen() {
        if (!this.isClosed) {
            return;
        }
        b.A("The output stream is closed.");
    }

    private final int copyIntoByteBuffer(byte[] source, int startIndex, int endIndex) {
        int min = Math.min(3 - this.byteBufferLength, endIndex - startIndex);
        ArraysKt.copyInto(source, this.byteBuffer, this.byteBufferLength, startIndex, startIndex + min);
        int i10 = this.byteBufferLength + min;
        this.byteBufferLength = i10;
        if (i10 == 3) {
            encodeByteBufferIntoOutput();
        }
        return min;
    }

    private final void encodeByteBufferIntoOutput() {
        if (encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength) == 4) {
            this.byteBufferLength = 0;
        } else {
            i.l("Check failed.");
        }
    }

    private final int encodeIntoOutput(byte[] source, int startIndex, int endIndex) {
        int encodeIntoByteArray = this.base64.encodeIntoByteArray(source, this.symbolBuffer, 0, startIndex, endIndex);
        if (this.lineLength == 0) {
            this.output.write(Base64.INSTANCE.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = this.base64.getMimeLineLength();
            if (encodeIntoByteArray > this.base64.getMimeLineLength()) {
                i.l("Check failed.");
                return 0;
            }
        }
        this.output.write(this.symbolBuffer, 0, encodeIntoByteArray);
        this.lineLength -= encodeIntoByteArray;
        return encodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            if (this.byteBufferLength != 0) {
                encodeByteBufferIntoOutput();
            }
            this.output.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] source, int offset, int length) {
        int i10;
        int length2;
        source.getClass();
        checkOpen();
        if (offset >= 0 && length >= 0 && (i10 = offset + length) <= source.length) {
            if (length != 0) {
                int i11 = this.byteBufferLength;
                if (i11 < 3) {
                    if (i11 != 0) {
                        offset += copyIntoByteBuffer(source, offset, i10);
                        if (this.byteBufferLength != 0) {
                            return;
                        }
                    }
                    while (offset + 3 <= i10) {
                        if (this.base64.getIsMimeScheme()) {
                            length2 = this.lineLength;
                        } else {
                            length2 = this.symbolBuffer.length;
                        }
                        int min = Math.min(length2 / 4, (i10 - offset) / 3);
                        int i12 = (min * 3) + offset;
                        if (encodeIntoOutput(source, offset, i12) == min * 4) {
                            offset = i12;
                        } else {
                            i.l("Check failed.");
                            return;
                        }
                    }
                    ArraysKt.copyInto(source, this.byteBuffer, 0, offset, i10);
                    this.byteBufferLength = i10 - offset;
                    return;
                }
                i.l("Check failed.");
                return;
            }
            return;
        }
        kotlin.text.b.a(a.v("offset: ", offset, length, ", length: ", ", source size: "), source.length);
    }

    @Override // java.io.OutputStream
    public void write(int b10) {
        checkOpen();
        byte[] bArr = this.byteBuffer;
        int i10 = this.byteBufferLength;
        int i11 = i10 + 1;
        this.byteBufferLength = i11;
        bArr[i10] = (byte) b10;
        if (i11 == 3) {
            encodeByteBufferIntoOutput();
        }
    }
}
