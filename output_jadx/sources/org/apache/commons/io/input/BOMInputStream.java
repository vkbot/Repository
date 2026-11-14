package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOIntConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = Comparator.comparing(new ai.onnxruntime.d(4)).reversed();
    private final List<ByteOrderMark> bomList;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<BOMInputStream, Builder> {
        private static final ByteOrderMark[] DEFAULT = {ByteOrderMark.UTF_8};
        private ByteOrderMark[] byteOrderMarks = DEFAULT;
        private boolean include;

        public static ByteOrderMark getDefaultByteOrderMark() {
            return DEFAULT[0];
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public BOMInputStream get() {
            return new BOMInputStream(this);
        }

        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.build.AbstractStreamBuilder, org.apache.commons.io.input.BOMInputStream$Builder] */
        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public Builder setByteOrderMarks(ByteOrderMark... byteOrderMarkArr) {
            ByteOrderMark[] byteOrderMarkArr2;
            if (byteOrderMarkArr != null) {
                byteOrderMarkArr2 = (ByteOrderMark[]) byteOrderMarkArr.clone();
            } else {
                byteOrderMarkArr2 = DEFAULT;
            }
            this.byteOrderMarks = byteOrderMarkArr2;
            return this;
        }

        public Builder setInclude(boolean z9) {
            this.include = z9;
            return this;
        }
    }

    private BOMInputStream(Builder builder) {
        super(builder);
        if (IOUtils.length(builder.byteOrderMarks) != 0) {
            this.include = builder.include;
            List<ByteOrderMark> asList = Arrays.asList(builder.byteOrderMarks);
            asList.sort(ByteOrderMarkLengthComparator);
            this.bomList = asList;
            return;
        }
        j1.i.k("No ByteOrderMark specified.");
        throw null;
    }

    public static Builder builder() {
        return new Builder();
    }

    private ByteOrderMark find() {
        return this.bomList.stream().filter(new i7.c(5, this)).findFirst().orElse(null);
    }

    public boolean matches(ByteOrderMark byteOrderMark) {
        return byteOrderMark.matches(this.firstBytes);
    }

    private ByteOrderMark readBom() {
        int length = this.bomList.get(0).length();
        int[] iArr = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int read = ((FilterInputStream) this).in.read();
            iArr[i11] = read;
            afterRead(read);
            i10++;
            if (iArr[i11] < 0) {
                break;
            }
        }
        this.firstBytes = Arrays.copyOf(iArr, i10);
        ByteOrderMark find = find();
        if (find != null && !this.include) {
            if (find.length() < this.firstBytes.length) {
                this.fbIndex = find.length();
                return find;
            }
            this.firstBytes = new int[0];
        }
        return find;
    }

    private int readFirstBytes() {
        getBOM();
        int i10 = this.fbIndex;
        int[] iArr = this.firstBytes;
        if (i10 < iArr.length) {
            this.fbIndex = i10 + 1;
            return iArr[i10];
        }
        return -1;
    }

    public ByteOrderMark getBOM() {
        if (this.firstBytes == null) {
            this.byteOrderMark = readBom();
        }
        return this.byteOrderMark;
    }

    public String getBOMCharsetName() {
        getBOM();
        ByteOrderMark byteOrderMark = this.byteOrderMark;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) {
        if (this.bomList.contains(byteOrderMark)) {
            return Objects.equals(getBOM(), byteOrderMark);
        }
        androidx.navigation.b.t(byteOrderMark, "Stream not configured to detect ");
        return false;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        boolean z9;
        this.markFbIndex = this.fbIndex;
        if (this.firstBytes == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.markedAtStart = z9;
        ((FilterInputStream) this).in.mark(i10);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        int i13 = 0;
        while (i11 > 0 && i12 >= 0) {
            i12 = readFirstBytes();
            if (i12 >= 0) {
                bArr[i10] = (byte) (i12 & 255);
                i11--;
                i13++;
                i10++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        afterRead(read);
        if (read < 0) {
            if (i13 > 0) {
                return i13;
            }
            return -1;
        }
        return i13 + read;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            this.fbIndex = this.markFbIndex;
            if (this.markedAtStart) {
                this.firstBytes = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long j11;
        int i10 = 0;
        while (true) {
            j11 = i10;
            if (j10 <= j11 || readFirstBytes() < 0) {
                break;
            }
            i10++;
        }
        return ((FilterInputStream) this).in.skip(j10 - j11) + j11;
    }

    public boolean hasBOM() {
        return getBOM() != null;
    }

    public /* synthetic */ BOMInputStream(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, Builder.DEFAULT);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z9) {
        this(inputStream, z9, Builder.DEFAULT);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z9, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (IOUtils.length(byteOrderMarkArr) != 0) {
            this.include = z9;
            List<ByteOrderMark> asList = Arrays.asList(byteOrderMarkArr);
            asList.sort(ByteOrderMarkLengthComparator);
            this.bomList = asList;
            return;
        }
        j1.i.k("No BOMs specified");
        throw null;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        checkOpen();
        int readFirstBytes = readFirstBytes();
        return readFirstBytes >= 0 ? readFirstBytes : ((FilterInputStream) this).in.read();
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }
}
