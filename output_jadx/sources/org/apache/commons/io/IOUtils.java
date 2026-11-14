package org.apache.commons.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.channels.FileChannels;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriFunction;
import org.apache.commons.io.input.BoundedInputStream;
import org.apache.commons.io.input.CharSequenceReader;
import org.apache.commons.io.input.QueueInputStream;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class IOUtils {
    public static final int CR = 13;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final int EOF = -1;
    public static final int LF = 10;
    public static final int SOFT_MAX_ARRAY_LENGTH = 2147483639;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String LINE_SEPARATOR_UNIX = StandardLineSeparator.LF.getString();
    public static final String LINE_SEPARATOR_WINDOWS = StandardLineSeparator.CRLF.getString();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class ScratchBytes implements AutoCloseable {
        private final byte[] buffer;
        private static final ThreadLocal<Object[]> LOCAL = new x(new w(0), 0);
        private static final ScratchBytes INSTANCE = new ScratchBytes(null);

        private ScratchBytes(byte[] bArr) {
            this.buffer = bArr;
        }

        public static ScratchBytes get() {
            Object[] objArr = LOCAL.get();
            if (((Boolean) objArr[0]).booleanValue()) {
                return new ScratchBytes(IOUtils.byteArray());
            }
            objArr[0] = Boolean.TRUE;
            return INSTANCE;
        }

        public static /* synthetic */ Object[] lambda$static$0() {
            return new Object[]{Boolean.FALSE, IOUtils.byteArray()};
        }

        public byte[] array() {
            byte[] bArr = this.buffer;
            if (bArr != null) {
                return bArr;
            }
            return (byte[]) LOCAL.get()[1];
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                Object[] objArr = LOCAL.get();
                Arrays.fill((byte[]) objArr[1], (byte) 0);
                objArr[0] = Boolean.FALSE;
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class ScratchChars implements AutoCloseable {
        private final char[] buffer;
        private static final ThreadLocal<Object[]> LOCAL = new x(new w(1), 1);
        private static final ScratchChars INSTANCE = new ScratchChars(null);

        private ScratchChars(char[] cArr) {
            this.buffer = cArr;
        }

        public static ScratchChars get() {
            Object[] objArr = LOCAL.get();
            if (((Boolean) objArr[0]).booleanValue()) {
                return new ScratchChars(IOUtils.access$000());
            }
            objArr[0] = Boolean.TRUE;
            return INSTANCE;
        }

        public static /* synthetic */ Object[] lambda$static$0() {
            return new Object[]{Boolean.FALSE, IOUtils.access$000()};
        }

        public char[] array() {
            char[] cArr = this.buffer;
            if (cArr != null) {
                return cArr;
            }
            return (char[]) LOCAL.get()[1];
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                Object[] objArr = LOCAL.get();
                Arrays.fill((char[]) objArr[1], (char) 0);
                objArr[0] = Boolean.FALSE;
            }
        }
    }

    @Deprecated
    public IOUtils() {
    }

    public static /* synthetic */ char[] access$000() {
        return charArray();
    }

    public static BufferedInputStream buffer(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    public static byte[] byteArray() {
        return byteArray(8192);
    }

    private static char[] charArray() {
        return charArray(8192);
    }

    public static void checkFromIndexSize(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) >= 0 && i12 - i11 >= i10) {
        } else {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void checkFromToIndex(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 >= i10 && i12 >= i11) {
            return;
        }
        kotlin.text.b.a(ai.onnxruntime.a.v("Range [", i10, i11, ", ", ") out of bounds for length "), i12);
    }

    public static void clear() {
        ScratchBytes.LOCAL.remove();
        ScratchChars.LOCAL.remove();
    }

    public static void close(Closeable closeable, IOConsumer<IOException> iOConsumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (iOConsumer != null) {
                    iOConsumer.accept(e);
                }
            } catch (Exception e6) {
                if (iOConsumer != null) {
                    iOConsumer.accept(new IOException(e6));
                }
            }
        }
    }

    private static void closeQ(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static void closeQuietly(Closeable closeable, Consumer<Exception> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                if (consumer != null) {
                    consumer.accept(e);
                }
            }
        }
    }

    public static long consume(InputStream inputStream) {
        return copyLarge(inputStream, NullOutputStream.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r6 == r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        r9 = r10.read(r3, r6, 8192 - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r9 == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r9 != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r6 = r6 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r7 != r5) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r11.read() != (-1)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        if (r7 != r5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r9 = r11.read(r4, r7, 8192 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        if (r9 == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r9 != (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        r7 = r7 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0048, code lost:
    
        if (r6 != r5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        if (r10.read() != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0052, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005b, code lost:
    
        if (r3[r5] == r4[r5]) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0061, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean contentEquals(java.io.Reader r10, java.io.Reader r11) {
        /*
            r0 = 1
            if (r10 != r11) goto L4
            return r0
        L4:
            r1 = 0
            if (r10 == 0) goto L6f
            if (r11 != 0) goto Lb
            goto L6f
        Lb:
            org.apache.commons.io.IOUtils$ScratchChars r2 = org.apache.commons.io.IOUtils.ScratchChars.get()
            char[] r3 = r2.array()     // Catch: java.lang.Throwable -> L34
            char[] r4 = charArray()     // Catch: java.lang.Throwable -> L34
        L17:
            r5 = r1
            r6 = r5
            r7 = r6
        L1a:
            r8 = 8192(0x2000, float:1.14794E-41)
            if (r5 >= r8) goto L17
            r8 = -1
            if (r6 != r5) goto L3c
        L21:
            int r9 = 8192 - r6
            int r9 = r10.read(r3, r6, r9)     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L21
            if (r9 != r8) goto L3b
            if (r7 != r5) goto L36
            int r10 = r11.read()     // Catch: java.lang.Throwable -> L34
            if (r10 != r8) goto L36
            goto L37
        L34:
            r10 = move-exception
            goto L64
        L36:
            r0 = r1
        L37:
            r2.close()
            return r0
        L3b:
            int r6 = r6 + r9
        L3c:
            if (r7 != r5) goto L57
        L3e:
            int r9 = 8192 - r7
            int r9 = r11.read(r4, r7, r9)     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L3e
            if (r9 != r8) goto L56
            if (r6 != r5) goto L51
            int r10 = r10.read()     // Catch: java.lang.Throwable -> L34
            if (r10 != r8) goto L51
            goto L52
        L51:
            r0 = r1
        L52:
            r2.close()
            return r0
        L56:
            int r7 = r7 + r9
        L57:
            char r8 = r3[r5]     // Catch: java.lang.Throwable -> L34
            char r9 = r4[r5]     // Catch: java.lang.Throwable -> L34
            if (r8 == r9) goto L61
            r2.close()
            return r1
        L61:
            int r5 = r5 + 1
            goto L1a
        L64:
            if (r2 == 0) goto L6e
            r2.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r11 = move-exception
            r10.addSuppressed(r11)
        L6e:
            throw r10
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.IOUtils.contentEquals(java.io.Reader, java.io.Reader):boolean");
    }

    private static boolean contentEqualsIgnoreEOL(BufferedReader bufferedReader, BufferedReader bufferedReader2) {
        if (bufferedReader == bufferedReader2) {
            return true;
        }
        if (bufferedReader != null && bufferedReader2 != null) {
            return contentEquals(bufferedReader.lines(), bufferedReader2.lines());
        }
        return false;
    }

    public static long copy(URL url, File file) {
        Path path;
        OutputStream newOutputStream;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
        try {
            long copy = copy(url, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
            return copy;
        } catch (Throwable th) {
            if (newOutputStream != null) {
                try {
                    newOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j10, long j11, byte[] bArr) {
        int i10;
        long j12 = 0;
        if (j10 > 0) {
            skipFully(inputStream, j10);
        }
        if (j11 == 0) {
            return 0L;
        }
        int length = bArr.length;
        if (j11 > 0 && j11 < length) {
            i10 = (int) j11;
        } else {
            i10 = length;
        }
        while (i10 > 0) {
            int read = inputStream.read(bArr, 0, i10);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j12 += read;
            if (j11 > 0) {
                i10 = (int) Math.min(j11 - j12, length);
            }
        }
        return j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UnsynchronizedByteArrayOutputStream copyToOutputStream(InputStream inputStream, long j10, int i10) {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = UnsynchronizedByteArrayOutputStream.builder().setBufferSize(i10).get();
        try {
            BoundedInputStream boundedInputStream = ((BoundedInputStream.Builder) ((BoundedInputStream.Builder) ((BoundedInputStream.Builder) BoundedInputStream.builder().setMaxCount(j10)).setPropagateClose(false)).setInputStream(inputStream)).get();
            try {
                unsynchronizedByteArrayOutputStream.write(boundedInputStream);
                if (boundedInputStream != null) {
                    boundedInputStream.close();
                }
                unsynchronizedByteArrayOutputStream.close();
                return unsynchronizedByteArrayOutputStream;
            } finally {
            }
        } catch (Throwable th) {
            if (unsynchronizedByteArrayOutputStream != null) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ String lambda$toString$0() {
        throw new NullPointerException("input");
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return remaining - byteBuffer.remaining();
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int read = read(readableByteChannel, byteBuffer);
        if (read == remaining) {
        } else {
            throw new EOFException(ai.onnxruntime.a.g(remaining, "Length to read: ", " actual: ", read));
        }
    }

    public static List<String> readLines(CharSequence charSequence) {
        CharSequenceReader charSequenceReader = new CharSequenceReader(charSequence);
        try {
            List<String> readLines = readLines(charSequenceReader);
            charSequenceReader.close();
            return readLines;
        } catch (Throwable th) {
            try {
                charSequenceReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) {
        URL resource;
        if (classLoader == null) {
            resource = IOUtils.class.getResource(str);
        } else {
            resource = classLoader.getResource(str);
        }
        if (resource != null) {
            return resource;
        }
        n0.b.A(ai.onnxruntime.a.l("Resource not found: ", str));
        return null;
    }

    public static long skip(Reader reader, long j10) {
        if (j10 >= 0) {
            ScratchChars scratchChars = ScratchChars.get();
            try {
                char[] array = scratchChars.array();
                long j11 = j10;
                while (j11 > 0) {
                    long read = reader.read(array, 0, (int) Math.min(j11, array.length));
                    if (read < 0) {
                        break;
                    }
                    j11 -= read;
                }
                scratchChars.close();
                return j10 - j11;
            } catch (Throwable th) {
                if (scratchChars != null) {
                    try {
                        scratchChars.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        j1.i.k(ai.onnxruntime.a.h(j10, "Skip count must be non-negative, actual: "));
        return 0L;
    }

    public static void skipFully(InputStream inputStream, long j10, Supplier<byte[]> supplier) {
        if (j10 >= 0) {
            long skip = skip(inputStream, j10, supplier);
            if (skip == j10) {
                return;
            }
            e.e("Bytes to skip: ", j10, skip);
            return;
        }
        j1.i.k(ai.onnxruntime.a.h(j10, "Bytes to skip must not be negative: "));
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static byte[] toByteArray(IOTriFunction<byte[], Integer, Integer, Integer> iOTriFunction, int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return EMPTY_BYTE_ARRAY;
            }
            byte[] byteArray = byteArray(i10);
            int i11 = 0;
            while (i11 < i10) {
                int intValue = iOTriFunction.apply(byteArray, Integer.valueOf(i11), Integer.valueOf(i10 - i11)).intValue();
                if (intValue == -1) {
                    break;
                }
                i11 += intValue;
            }
            if (i11 == i10) {
                return byteArray;
            }
            throw new EOFException(String.format("Expected read size: %,d, actual: %,d", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        n0.b.v("size < 0, size = %,d", new Object[]{Integer.valueOf(i10)});
        return null;
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(IOSupplier<InputStream> iOSupplier, Charset charset, IOSupplier<String> iOSupplier2) {
        String str;
        if (iOSupplier == null) {
            return iOSupplier2.get();
        }
        InputStream inputStream = iOSupplier.get();
        try {
            if (inputStream != null) {
                str = toString(inputStream, charset);
            } else {
                str = iOSupplier2.get();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return str;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void write(String str, OutputStream outputStream, Charset charset) {
        if (str != null) {
            Channels.newChannel(outputStream).write(Charsets.toCharset(charset).encode(str));
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i10, min);
                length -= min;
                i10 += min;
            }
        }
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) {
        if (collection != null) {
            if (str == null) {
                str = System.lineSeparator();
            }
            if (StandardCharsets.UTF_16.equals(charset)) {
                charset = StandardCharsets.UTF_16BE;
            }
            byte[] bytes = str.getBytes(charset);
            for (Object obj : collection) {
                if (obj != null) {
                    write(obj.toString(), outputStream, charset);
                }
                outputStream.write(bytes);
            }
        }
    }

    public static Writer writer(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        if (appendable instanceof StringBuilder) {
            return new StringBuilderWriter((StringBuilder) appendable);
        }
        return new AppendableWriter(appendable);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i10) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i10);
    }

    public static byte[] byteArray(int i10) {
        return new byte[i10];
    }

    private static char[] charArray(int i10) {
        return new char[i10];
    }

    public static long consume(Reader reader) {
        return copyLarge(reader, NullWriter.INSTANCE);
    }

    public static int length(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static byte[] resourceToByteArray(String str) {
        return resourceToByteArray(str, null);
    }

    public static String resourceToString(String str, Charset charset) {
        return resourceToString(str, charset, null);
    }

    public static int length(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static int length(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static void closeQuietly(Closeable... closeableArr) {
        if (closeableArr != null) {
            closeQuietly((Stream<Closeable>) Arrays.stream(closeableArr));
        }
    }

    public static BufferedReader toBufferedReader(Reader reader, int i10) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static char[] toCharArray(InputStream inputStream, String str) {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQ(inputStream);
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(Reader reader) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void closeQuietly(Iterable<Closeable> iterable) {
        if (iterable != 0) {
            iterable.forEach(new Object());
        }
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQ(outputStream);
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i10) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    public static void closeQuietly(Reader reader) {
        closeQ(reader);
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void closeQuietly(Selector selector) {
        closeQ(selector);
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    public static void writeChunked(char[] cArr, Writer writer) {
        if (cArr != null) {
            int length = cArr.length;
            int i10 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i10, min);
                length -= min;
                i10 += min;
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        closeQ(serverSocket);
    }

    public static void write(byte[] bArr, Writer writer, String str) {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static void checkFromToIndex(CharSequence charSequence, int i10, int i11) {
        checkFromToIndex(i10, i11, charSequence != null ? charSequence.length() : 4);
    }

    public static void closeQuietly(Socket socket) {
        closeQ(socket);
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void closeQuietly(Stream<Closeable> stream) {
        if (stream != 0) {
            stream.forEach(new Object());
        }
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) {
        if (cArr != null) {
            write(new String(cArr), outputStream, charset);
        }
    }

    public static void closeQuietly(Writer writer) {
        closeQ(writer);
    }

    public static int read(InputStream inputStream, byte[] bArr, int i10, int i11) {
        checkFromIndexSize(bArr, i10, i11);
        int i12 = i11;
        while (i12 > 0) {
            int read = inputStream.read(bArr, (i11 - i12) + i10, i12);
            if (-1 == read) {
                break;
            }
            i12 -= read;
        }
        return i11 - i12;
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i10) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) {
        if (reader == reader2) {
            return true;
        }
        if (reader == null || reader2 == null) {
            return false;
        }
        return contentEqualsIgnoreEOL(toBufferedReader(reader), toBufferedReader(reader2));
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static void write(char[] cArr, Writer writer) {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void close(Closeable... closeableArr) {
        IOConsumer.forAll(new s(2), closeableArr);
    }

    public static int read(InputStream inputStream, byte[] bArr) {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i10, int i11) {
        int read = read(inputStream, bArr, i10, i11);
        if (read != i11) {
            throw new EOFException(ai.onnxruntime.a.g(i11, "Length to read: ", " actual: ", read));
        }
    }

    public static List<String> readLines(InputStream inputStream, String str) {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static int read(Reader reader, char[] cArr) {
        return read(reader, cArr, 0, cArr.length);
    }

    public static List<String> readLines(Reader reader) {
        return (List) toBufferedReader(reader).lines().collect(Collectors.toList());
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static int read(Reader reader, char[] cArr, int i10, int i11) {
        checkFromIndexSize(cArr, i10, i11);
        int i12 = i11;
        while (i12 > 0) {
            int read = reader.read(cArr, (i11 - i12) + i10, i12);
            if (-1 == read) {
                break;
            }
            i12 -= read;
        }
        return i11 - i12;
    }

    public static URL resourceToURL(String str) {
        return resourceToURL(str, null);
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static BufferedReader buffer(Reader reader, int i10) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    public static void write(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    @Deprecated
    public static byte[] readFully(InputStream inputStream, int i10) {
        return toByteArray(inputStream, i10);
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static BufferedWriter buffer(Writer writer, int i10) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void write(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void readFully(Reader reader, char[] cArr) {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static void skipFully(InputStream inputStream, long j10) {
        long skip = skip(inputStream, j10);
        if (skip == j10) {
            return;
        }
        e.e("Bytes to skip: ", j10, skip);
    }

    public static void write(String str, OutputStream outputStream, String str2) {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void readFully(Reader reader, char[] cArr, int i10, int i11) {
        int read = read(reader, cArr, i10, i11);
        if (read != i11) {
            throw new EOFException(ai.onnxruntime.a.g(i11, "Length to read: ", " actual: ", read));
        }
    }

    public static void write(String str, Writer writer) {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j10) {
        if (j10 >= 0) {
            long skip = skip(readableByteChannel, j10);
            if (skip == j10) {
                return;
            }
            e.e("Bytes to skip: ", j10, skip);
            return;
        }
        j1.i.k(ai.onnxruntime.a.h(j10, "Bytes to skip must not be negative: "));
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) {
        if (stringBuffer != null) {
            write(stringBuffer.toString(), outputStream, Charsets.toCharset(str));
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void checkFromIndexSize(char[] cArr, int i10, int i11) {
        Objects.requireNonNull(cArr, "char array");
        checkFromIndexSize(i10, i11, cArr.length);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i10) {
        return copyLarge(inputStream, outputStream, byteArray(i10));
    }

    public static void skipFully(Reader reader, long j10) {
        long skip = skip(reader, j10);
        if (skip == j10) {
            return;
        }
        e.e("Chars to skip: ", j10, skip);
    }

    public static void checkFromIndexSize(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "byte array");
        checkFromIndexSize(i10, i11, bArr.length);
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static void checkFromIndexSize(String str, int i10, int i11) {
        Objects.requireNonNull(str, "str");
        checkFromIndexSize(i10, i11, str.length());
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static void copy(InputStream inputStream, Writer writer, String str) {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static QueueInputStream copy(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        Objects.requireNonNull(byteArrayOutputStream, "outputStream");
        QueueInputStream queueInputStream = new QueueInputStream();
        byteArrayOutputStream.writeTo(queueInputStream.newQueueOutputStream());
        return queueInputStream;
    }

    public static long copy(Reader reader, Appendable appendable) {
        return copy(reader, appendable, CharBuffer.allocate(8192));
    }

    public static long copy(Reader reader, Appendable appendable, CharBuffer charBuffer) {
        long j10 = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 == read) {
                return j10;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, read);
            j10 += read;
        }
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    @Deprecated
    public static String toString(InputStream inputStream) {
        return toString(inputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                stringBuilderWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static int copy(Reader reader, Writer writer) {
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static String toString(InputStream inputStream, String str) {
        return toString(inputStream, Charsets.toCharset(str));
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.apache.commons.io.function.IOSupplier] */
    public static String toString(IOSupplier<InputStream> iOSupplier, Charset charset) {
        return toString(iOSupplier, charset, new Object());
    }

    public static long copy(URL url, OutputStream outputStream) {
        Objects.requireNonNull(url, "url");
        InputStream openStream = url.openStream();
        try {
            long copyLarge = copyLarge(openStream, outputStream);
            if (openStream != null) {
                openStream.close();
            }
            return copyLarge;
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j10, long j11) {
        ScratchBytes scratchBytes = ScratchBytes.get();
        try {
            long copyLarge = copyLarge(inputStream, outputStream, j10, j11, scratchBytes.array());
            scratchBytes.close();
            return copyLarge;
        } catch (Throwable th) {
            if (scratchBytes == null) {
                throw th;
            }
            try {
                scratchBytes.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    public static String toString(Reader reader) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(reader, (Writer) stringBuilderWriter);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                stringBuilderWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, 8192);
    }

    public static long copyLarge(Reader reader, Writer writer) {
        ScratchChars scratchChars = ScratchChars.get();
        try {
            long copyLarge = copyLarge(reader, writer, scratchChars.array());
            scratchChars.close();
            return copyLarge;
        } catch (Throwable th) {
            if (scratchChars != null) {
                try {
                    scratchChars.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static String toString(URI uri) {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, Charset charset) {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static String toString(URI uri, String str) {
        return toString(uri, Charsets.toCharset(str));
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) {
        long j10 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j10;
            }
            writer.write(cArr, 0, read);
            j10 += read;
        }
    }

    @Deprecated
    public static String toString(URL url) {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, Charset charset) {
        Objects.requireNonNull(url);
        return toString(new r(0, url), charset);
    }

    public static long copyLarge(Reader reader, Writer writer, long j10, long j11) {
        ScratchChars scratchChars = ScratchChars.get();
        try {
            long copyLarge = copyLarge(reader, writer, j10, j11, scratchChars.array());
            scratchChars.close();
            return copyLarge;
        } catch (Throwable th) {
            if (scratchChars == null) {
                throw th;
            }
            try {
                scratchChars.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static String toString(URL url, String str) {
        return toString(url, Charsets.toCharset(str));
    }

    public static long skip(InputStream inputStream, long j10, Supplier<byte[]> supplier) {
        if (j10 < 0) {
            j1.i.k(ai.onnxruntime.a.h(j10, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            long read = inputStream.read(supplier.get(), 0, (int) Math.min(j11, r4.length));
            if (read < 0) {
                break;
            }
            j11 -= read;
        }
        return j10 - j11;
    }

    public static long copyLarge(Reader reader, Writer writer, long j10, long j11, char[] cArr) {
        long j12 = 0;
        if (j10 > 0) {
            skipFully(reader, j10);
        }
        if (j11 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j11 > 0 && j11 < cArr.length) {
            length = (int) j11;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j12 += read;
            if (j11 > 0) {
                length = (int) Math.min(j11 - j12, cArr.length);
            }
        }
        return j12;
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j10) {
        if (j10 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j10, 8192L));
            long j11 = j10;
            while (j11 > 0) {
                allocate.position(0);
                allocate.limit((int) Math.min(j11, 8192L));
                int read = readableByteChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                j11 -= read;
            }
            return j10 - j11;
        }
        j1.i.k(ai.onnxruntime.a.h(j10, "Skip count must be non-negative, actual: "));
        return 0L;
    }

    public static long skip(InputStream inputStream, long j10) {
        ScratchBytes scratchBytes = ScratchBytes.get();
        try {
            Objects.requireNonNull(scratchBytes);
            long skip = skip(inputStream, j10, new v(0, scratchBytes));
            scratchBytes.close();
            return skip;
        } catch (Throwable th) {
            if (scratchBytes != null) {
                try {
                    scratchBytes.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] toByteArray(InputStream inputStream, int i10) {
        Objects.requireNonNull(inputStream, "input");
        return toByteArray(new r(1, inputStream), i10);
    }

    public static byte[] toByteArray(InputStream inputStream, int i10, int i11) {
        Objects.requireNonNull(inputStream, "input");
        if (i11 <= 0) {
            n0.b.v("chunkSize <= 0, chunkSize = %,d", new Object[]{Integer.valueOf(i11)});
            return null;
        }
        if (i10 <= i11) {
            return toByteArray(new r(1, inputStream), i10);
        }
        UnsynchronizedByteArrayOutputStream copyToOutputStream = copyToOutputStream(inputStream, i10, i11);
        int size = copyToOutputStream.size();
        if (size == i10) {
            return copyToOutputStream.toByteArray();
        }
        throw new EOFException(String.format("Expected read size: %,d, actual: %,d", Integer.valueOf(i10), Integer.valueOf(size)));
    }

    public static byte[] toByteArray(InputStream inputStream, long j10) {
        if (j10 <= 2147483647L) {
            return toByteArray(inputStream, (int) j10);
        }
        n0.b.v("size > Integer.MAX_VALUE, size = %,d", new Object[]{Long.valueOf(j10)});
        return null;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        UnsynchronizedByteArrayOutputStream copyToOutputStream = copyToOutputStream(inputStream, 2147483640L, 8192);
        if (copyToOutputStream.size() <= 2147483639) {
            return copyToOutputStream.toByteArray();
        }
        throw new IOException(String.format("Cannot read more than %,d into a byte array", Integer.valueOf(SOFT_MAX_ARRAY_LENGTH)));
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, Charset charset) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] toByteArray(Reader reader, String str) {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri) {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url) {
        CloseableURLConnection open = CloseableURLConnection.open(url);
        try {
            byte[] byteArray = toByteArray(open);
            if (open != null) {
                open.close();
            }
            return byteArray;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static boolean contentEquals(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream == null || inputStream2 == null) {
            return false;
        }
        return FileChannels.contentEquals(Channels.newChannel(inputStream), Channels.newChannel(inputStream2), 8192);
    }

    private static boolean contentEquals(Stream<?> stream, Stream<?> stream2) {
        if (stream == stream2) {
            return true;
        }
        if (stream == null || stream2 == null) {
            return false;
        }
        return contentEquals(stream.iterator(), stream2.iterator());
    }
}
