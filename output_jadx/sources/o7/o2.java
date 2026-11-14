package o7;

import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o2 implements q.m {

    /* renamed from: b, reason: collision with root package name */
    public InputStream f4631b;

    public o2(InputStream inputStream) {
        this.f4631b = inputStream;
    }

    public InputStream a() {
        InputStream inputStream = this.f4631b;
        this.f4631b = null;
        return inputStream;
    }

    @Override // q.m
    public int c() {
        return (e() << 8) | e();
    }

    @Override // q.m
    public short e() {
        int read = this.f4631b.read();
        if (read != -1) {
            return (short) read;
        }
        throw new q.l();
    }

    @Override // q.m
    public int read(byte[] bArr, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = this.f4631b.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new q.l();
        }
        return i11;
    }

    @Override // q.m
    public long skip(long j10) {
        InputStream inputStream = this.f4631b;
        if (j10 < 0) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            long skip = inputStream.skip(j11);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j11 -= skip;
        }
        return j10 - j11;
    }
}
