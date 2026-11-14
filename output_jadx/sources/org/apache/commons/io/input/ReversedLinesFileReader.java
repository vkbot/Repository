package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileSystem;
import org.apache.commons.io.StandardLineSeparator;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOIterable;
import org.apache.commons.io.function.IOIterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ReversedLinesFileReader implements Closeable, IOIterable<String> {
    private static final int DEFAULT_BLOCK_SIZE = FileSystem.getCurrent().getBlockSize();
    private static final String EMPTY_STRING = "";
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private final SeekableByteChannel channel;
    private final Charset charset;
    private FilePart currentFilePart;
    private final byte[][] newLineSequences;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<ReversedLinesFileReader, Builder> {
        public Builder() {
            StandardOpenOption standardOpenOption;
            setBufferSizeDefault(ReversedLinesFileReader.DEFAULT_BLOCK_SIZE);
            setBufferSize(ReversedLinesFileReader.DEFAULT_BLOCK_SIZE);
            standardOpenOption = StandardOpenOption.READ;
            setOpenOptions(standardOpenOption);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public ReversedLinesFileReader get() {
            return new ReversedLinesFileReader(this);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public final class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long partNumber;

        private FilePart(long j10, int i10, byte[] bArr) {
            int i11;
            this.partNumber = j10;
            if (bArr != null) {
                i11 = bArr.length;
            } else {
                i11 = 0;
            }
            byte[] bArr2 = new byte[i11 + i10];
            this.data = bArr2;
            long j11 = (j10 - 1) * ReversedLinesFileReader.this.blockSize;
            if (j10 > 0) {
                ReversedLinesFileReader.this.channel.position(j11);
                if (ReversedLinesFileReader.this.channel.read(ByteBuffer.wrap(bArr2, 0, i10)) != i10) {
                    j1.i.l("Count of requested bytes and actually read bytes don't match");
                    throw null;
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i10, bArr.length);
            }
            this.currentLastBytePos = bArr2.length - 1;
            this.leftOver = null;
        }

        private void createLeftOver() {
            int i10 = this.currentLastBytePos + 1;
            if (i10 > 0) {
                this.leftOver = Arrays.copyOf(this.data, i10);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        private int getNewLineMatchByteCount(byte[] bArr, int i10) {
            boolean z9;
            for (byte[] bArr2 : ReversedLinesFileReader.this.newLineSequences) {
                boolean z10 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i10 + length) - (bArr2.length - 1);
                    if (length2 >= 0 && bArr[length2] == bArr2[length]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 &= z9;
                }
                if (z10) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String readLine() {
            boolean z9;
            String str;
            byte[] bArr;
            if (this.partNumber == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = this.currentLastBytePos;
            while (true) {
                if (i10 > -1) {
                    if (!z9 && i10 < ReversedLinesFileReader.this.avoidNewlineSplitBufferSize) {
                        createLeftOver();
                        break;
                    }
                    int newLineMatchByteCount = getNewLineMatchByteCount(this.data, i10);
                    if (newLineMatchByteCount > 0) {
                        int i11 = i10 + 1;
                        int i12 = (this.currentLastBytePos - i11) + 1;
                        if (i12 >= 0) {
                            str = new String(Arrays.copyOfRange(this.data, i11, i12 + i11), ReversedLinesFileReader.this.charset);
                            this.currentLastBytePos = i10 - newLineMatchByteCount;
                        } else {
                            j1.i.l(ai.onnxruntime.a.e(i12, "Unexpected negative line length="));
                            return null;
                        }
                    } else {
                        i10 -= ReversedLinesFileReader.this.byteDecrement;
                        if (i10 < 0) {
                            createLeftOver();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (z9 && (bArr = this.leftOver) != null) {
                String str2 = new String(bArr, ReversedLinesFileReader.this.charset);
                this.leftOver = null;
                return str2;
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FilePart rollOver() {
            if (this.currentLastBytePos <= -1) {
                long j10 = this.partNumber;
                if (j10 > 1) {
                    ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                    return new FilePart(j10 - 1, reversedLinesFileReader.blockSize, this.leftOver);
                }
                byte[] bArr = this.leftOver;
                if (bArr == null) {
                    return null;
                }
                j1.i.l("Unexpected leftover of the last block: leftOverOfThisFilePart=".concat(new String(bArr, ReversedLinesFileReader.this.charset)));
                return null;
            }
            ai.onnxruntime.b.b(this.currentLastBytePos, "Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=");
            return null;
        }
    }

    private ReversedLinesFileReader(Builder builder) {
        int i10;
        int bufferSize = builder.getBufferSize();
        this.blockSize = bufferSize;
        Charset charset = Charsets.toCharset(builder.getCharset());
        this.charset = charset;
        if (charset.newEncoder().maxBytesPerChar() != 1.0f && charset != StandardCharsets.UTF_8) {
            if (charset != Charset.forName("Shift_JIS") && charset != Charset.forName("windows-31j") && charset != Charset.forName("x-windows-949") && charset != Charset.forName("gbk") && charset != Charset.forName("x-windows-950")) {
                if (charset != StandardCharsets.UTF_16BE && charset != StandardCharsets.UTF_16LE) {
                    if (charset == StandardCharsets.UTF_16) {
                        throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                    }
                    throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
                }
                this.byteDecrement = 2;
            } else {
                this.byteDecrement = 1;
            }
        } else {
            this.byteDecrement = 1;
        }
        byte[][] bArr = {StandardLineSeparator.CRLF.getBytes(charset), StandardLineSeparator.LF.getBytes(charset), StandardLineSeparator.CR.getBytes(charset)};
        this.newLineSequences = bArr;
        this.avoidNewlineSplitBufferSize = bArr[0].length;
        SeekableByteChannel seekableByteChannel = (SeekableByteChannel) builder.getChannel(SeekableByteChannel.class);
        this.channel = seekableByteChannel;
        long size = seekableByteChannel.size();
        this.totalByteLength = size;
        int i11 = (int) (size % bufferSize);
        if (i11 > 0) {
            this.totalBlockCount = (size / bufferSize) + 1;
        } else {
            this.totalBlockCount = size / bufferSize;
            if (size > 0) {
                i10 = bufferSize;
                this.currentFilePart = new FilePart(this.totalBlockCount, i10, null);
            }
        }
        i10 = i11;
        this.currentFilePart = new FilePart(this.totalBlockCount, i10, null);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    @Override // org.apache.commons.io.function.IOIterable
    public IOIterator<String> iterator() {
        return new IOIterator<String>() { // from class: org.apache.commons.io.input.ReversedLinesFileReader.1
            private String next;

            @Override // org.apache.commons.io.function.IOIterator
            public boolean hasNext() {
                if (this.next == null) {
                    this.next = ReversedLinesFileReader.this.readLine();
                }
                if (this.next != null) {
                    return true;
                }
                return false;
            }

            @Override // org.apache.commons.io.function.IOIterator
            public String next() {
                if (this.next == null) {
                    this.next = ReversedLinesFileReader.this.readLine();
                }
                String str = this.next;
                this.next = null;
                return str;
            }

            @Override // org.apache.commons.io.function.IOIterator
            public Iterator<String> unwrap() {
                return null;
            }
        };
    }

    public String readLine() {
        String readLine = this.currentFilePart.readLine();
        while (readLine == null) {
            FilePart rollOver = this.currentFilePart.rollOver();
            this.currentFilePart = rollOver;
            if (rollOver == null) {
                break;
            }
            readLine = rollOver.readLine();
        }
        if ("".equals(readLine) && !this.trailingNewlineOfFileSkipped) {
            this.trailingNewlineOfFileSkipped = true;
            return readLine();
        }
        return readLine;
    }

    public List<String> readLines(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                String readLine = readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            return arrayList;
        }
        j1.i.k("lineCount < 0");
        return null;
    }

    public String toString(int i10) {
        List<String> readLines = readLines(i10);
        Collections.reverse(readLines);
        if (readLines.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String lineSeparator = System.lineSeparator();
        if (lineSeparator != null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<T> it = readLines.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) lineSeparator);
                }
            }
            sb.append(sb2.toString());
            sb.append(System.lineSeparator());
            return sb.toString();
        }
        n0.b.n("delimiter");
        return null;
    }

    @Override // org.apache.commons.io.function.IOIterable
    public Iterable<String> unwrap() {
        return null;
    }

    @Deprecated
    public ReversedLinesFileReader(File file) {
        this(file, DEFAULT_BLOCK_SIZE, Charset.defaultCharset());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReversedLinesFileReader(java.io.File r1, java.nio.charset.Charset r2) {
        /*
            r0 = this;
            java.nio.file.Path r1 = c5.h.i(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ReversedLinesFileReader.<init>(java.io.File, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReversedLinesFileReader(java.io.File r1, int r2, java.nio.charset.Charset r3) {
        /*
            r0 = this;
            java.nio.file.Path r1 = c5.h.i(r1)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ReversedLinesFileReader.<init>(java.io.File, int, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReversedLinesFileReader(java.io.File r1, int r2, java.lang.String r3) {
        /*
            r0 = this;
            java.nio.file.Path r1 = c5.h.i(r1)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ReversedLinesFileReader.<init>(java.io.File, int, java.lang.String):void");
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, Charset charset) {
        this(path, DEFAULT_BLOCK_SIZE, charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public ReversedLinesFileReader(Path path, int i10, Charset charset) {
        this(((Builder) builder().setPath(path)).setBufferSize(i10).setCharset(charset));
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, int i10, String str) {
        this(path, i10, Charsets.toCharset(str));
    }
}
