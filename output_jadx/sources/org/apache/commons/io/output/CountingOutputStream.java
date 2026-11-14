package org.apache.commons.io.output;

import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CountingOutputStream extends ProxyOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i10) {
        this.count += i10;
    }

    public synchronized long getByteCount() {
        return this.count;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= 2147483647L) {
            return (int) byteCount;
        }
        n0.b.f(byteCount);
        return 0;
    }

    public synchronized long resetByteCount() {
        long j10;
        j10 = this.count;
        this.count = 0L;
        return j10;
    }

    public int resetCount() {
        long resetByteCount = resetByteCount();
        if (resetByteCount <= 2147483647L) {
            return (int) resetByteCount;
        }
        n0.b.f(resetByteCount);
        return 0;
    }
}
