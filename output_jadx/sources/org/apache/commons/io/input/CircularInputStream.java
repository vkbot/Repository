package org.apache.commons.io.input;

import java.util.Objects;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CircularInputStream extends AbstractInputStream {
    private long byteCount;
    private int position = -1;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    public CircularInputStream(byte[] bArr, long j10) {
        this.repeatedContent = validate(bArr);
        if (bArr.length != 0) {
            this.targetByteCount = j10;
        } else {
            j1.i.k("repeatContent is empty.");
            throw null;
        }
    }

    private static byte[] validate(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b10 : bArr) {
            if (b10 == -1) {
                j1.i.k("repeatContent contains the end-of-stream marker -1");
                return null;
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int available() {
        if (isClosed()) {
            return 0;
        }
        long j10 = this.targetByteCount;
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return Math.max(Integer.MAX_VALUE, (int) j10);
    }

    @Override // org.apache.commons.io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.byteCount = this.targetByteCount;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.targetByteCount >= 0 || isClosed()) {
            long j10 = this.byteCount;
            if (j10 == this.targetByteCount) {
                return -1;
            }
            this.byteCount = j10 + 1;
        }
        int i10 = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i10 % bArr.length;
        this.position = length;
        return bArr[length] & UByte.MAX_VALUE;
    }
}
