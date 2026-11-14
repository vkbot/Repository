package kotlin.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\tH\u0087\b\u001a\u001d\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0002*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0014*\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0018\u001a\u00020\u0019*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u001c\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a\u0016\u0010\u001d\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0007\u001a\f\u0010\u001d\u001a\u00020\t*\u00020\u000eH\u0007¨\u0006\u001f"}, d2 = {"iterator", "Lkotlin/collections/ByteIterator;", "Ljava/io/BufferedInputStream;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "charset", "Ljava/nio/charset/Charset;", "inputStream", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "length", "buffered", "Ljava/io/InputStream;", "bufferSize", "reader", "Ljava/io/InputStreamReader;", "bufferedReader", "Ljava/io/BufferedReader;", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "writer", "Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "copyTo", "", "out", "readBytes", "estimatedSize", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "ByteStreamsKt")
/* loaded from: classes.dex */
public final class ByteStreamsKt {
    @InlineOnly
    private static final BufferedInputStream buffered(InputStream inputStream, int i10) {
        inputStream.getClass();
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i10);
    }

    public static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        inputStream.getClass();
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i10);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        inputStream.getClass();
        charset.getClass();
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        inputStream.getClass();
        charset.getClass();
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        outputStream.getClass();
        charset.getClass();
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        outputStream.getClass();
        charset.getClass();
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        str.getClass();
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return new ByteArrayInputStream(bytes);
    }

    public static final long copyTo(InputStream inputStream, OutputStream outputStream, int i10) {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return copyTo(inputStream, outputStream, i10);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        bArr.getClass();
        return new ByteArrayInputStream(bArr);
    }

    public static final ByteIterator iterator(final BufferedInputStream bufferedInputStream) {
        bufferedInputStream.getClass();
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt$iterator$1
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            private final void prepareNext() {
                if (!this.nextPrepared && !this.finished) {
                    int read = bufferedInputStream.read();
                    this.nextByte = read;
                    boolean z9 = true;
                    this.nextPrepared = true;
                    if (read != -1) {
                        z9 = false;
                    }
                    this.finished = z9;
                }
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final int getNextByte() {
                return this.nextByte;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                prepareNext();
                return !this.finished;
            }

            @Override // kotlin.collections.ByteIterator
            public byte nextByte() {
                prepareNext();
                if (!this.finished) {
                    byte b10 = (byte) this.nextByte;
                    this.nextPrepared = false;
                    return b10;
                }
                i.g("Input stream is over.");
                return (byte) 0;
            }

            public final void setFinished(boolean z9) {
                this.finished = z9;
            }

            public final void setNextByte(int i10) {
                this.nextByte = i10;
            }

            public final void setNextPrepared(boolean z9) {
                this.nextPrepared = z9;
            }
        };
    }

    @SinceKotlin(version = "1.3")
    public static final byte[] readBytes(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return readBytes(inputStream, i10);
    }

    @InlineOnly
    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        inputStream.getClass();
        charset.getClass();
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        inputStream.getClass();
        charset.getClass();
        return new InputStreamReader(inputStream, charset);
    }

    @InlineOnly
    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        outputStream.getClass();
        charset.getClass();
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        outputStream.getClass();
        charset.getClass();
        return new OutputStreamWriter(outputStream, charset);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @InlineOnly
    private static final BufferedOutputStream buffered(OutputStream outputStream, int i10) {
        outputStream.getClass();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        outputStream.getClass();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] readBytes(InputStream inputStream, int i10) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
