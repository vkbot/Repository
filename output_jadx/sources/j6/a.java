package j6;

import e0.m;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3309a;

    /* renamed from: b, reason: collision with root package name */
    public int f3310b;

    public /* synthetic */ a(int i10, byte[] bArr) {
        this.f3310b = i10;
        this.f3309a = bArr;
    }

    public static IOException a() {
        return new IOException(m.h(new byte[]{-68, 123, -64, 119, -53, 64, -105, -27, -107, 58, -36, 99, -53, 70, -107, -30, -124, 124, -116, 124, -63, 65, -119, -31, -106, ByteCompanionObject.MAX_VALUE}, new byte[]{-15, 26, -84, 17, -92, 50, -6, ByteCompanionObject.MIN_VALUE}));
    }

    public byte[] b() {
        long e = e();
        if (e >= 0 && e <= 2147483647L) {
            int i10 = (int) e;
            f(i10);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3309a, this.f3310b, bArr, 0, i10);
            this.f3310b += i10;
            return bArr;
        }
        throw a();
    }

    public int c() {
        f(4);
        int i10 = this.f3310b;
        byte[] bArr = this.f3309a;
        int i11 = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        this.f3310b = i10 + 4;
        return i11;
    }

    public long d() {
        f(8);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 |= (this.f3309a[this.f3310b + i10] & UByte.MAX_VALUE) << (i10 * 8);
        }
        this.f3310b += 8;
        return j10;
    }

    public long e() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            f(1);
            int i11 = this.f3310b;
            this.f3310b = i11 + 1;
            j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
            if ((this.f3309a[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw a();
    }

    public void f(int i10) {
        if (i10 >= 0 && this.f3310b <= this.f3309a.length - i10) {
        } else {
            throw a();
        }
    }

    public void g(int i10) {
        if (i10 == 0) {
            e();
            return;
        }
        if (i10 == 1) {
            f(8);
            this.f3310b += 8;
            return;
        }
        if (i10 == 2) {
            long e = e();
            if (e >= 0 && e <= 2147483647L) {
                int i11 = (int) e;
                f(i11);
                this.f3310b += i11;
                return;
            }
            throw a();
        }
        if (i10 == 5) {
            f(4);
            this.f3310b += 4;
            return;
        }
        throw a();
    }

    public a(byte[] bArr) {
        this.f3309a = bArr;
    }
}
