package r7;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import l9.a0;
import l9.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f5421b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5420a = new ArrayList();
    public b[] e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f5422f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f5423g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f5424h = 0;
    public int c = 4096;
    public int d = 4096;

    public c(f fVar) {
        this.f5421b = new a0(fVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i11 = this.f5422f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.e[length].c;
                i10 -= i13;
                this.f5424h -= i13;
                this.f5423g--;
                i12++;
            }
            b[] bVarArr = this.e;
            System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f5423g);
            this.f5422f += i12;
        }
        return i12;
    }

    public final o b(int i10) {
        if (i10 >= 0) {
            b[] bVarArr = e.f5428b;
            if (i10 <= bVarArr.length - 1) {
                return bVarArr[i10].f5418a;
            }
        }
        int length = this.f5422f + 1 + (i10 - e.f5428b.length);
        if (length >= 0) {
            b[] bVarArr2 = this.e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f5418a;
            }
        }
        n0.b.y(i10 + 1, "Header index too large ");
        return null;
    }

    public final void c(b bVar) {
        this.f5420a.add(bVar);
        int i10 = bVar.c;
        int i11 = this.d;
        if (i10 > i11) {
            Arrays.fill(this.e, (Object) null);
            this.f5422f = this.e.length - 1;
            this.f5423g = 0;
            this.f5424h = 0;
            return;
        }
        a((this.f5424h + i10) - i11);
        int i12 = this.f5423g + 1;
        b[] bVarArr = this.e;
        if (i12 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f5422f = this.e.length - 1;
            this.e = bVarArr2;
        }
        int i13 = this.f5422f;
        this.f5422f = i13 - 1;
        this.e[i13] = bVar;
        this.f5423g++;
        this.f5424h += i10;
    }

    public final o d() {
        boolean z9;
        a0 a0Var = this.f5421b;
        byte readByte = a0Var.readByte();
        int i10 = readByte & UByte.MAX_VALUE;
        if ((readByte & ByteCompanionObject.MIN_VALUE) == 128) {
            z9 = true;
        } else {
            z9 = false;
        }
        int e = e(i10, 127);
        if (z9) {
            k kVar = k.d;
            long j10 = e;
            a0Var.Y(j10);
            byte[] f02 = a0Var.c.f0(j10);
            kVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            p0.c cVar = kVar.f5440a;
            p0.c cVar2 = cVar;
            int i11 = 0;
            int i12 = 0;
            for (byte b10 : f02) {
                i11 = (i11 << 8) | (b10 & UByte.MAX_VALUE);
                i12 += 8;
                while (i12 >= 8) {
                    cVar2 = ((p0.c[]) cVar2.d)[(i11 >>> (i12 - 8)) & 255];
                    if (((p0.c[]) cVar2.d) == null) {
                        byteArrayOutputStream.write(cVar2.f4964b);
                        i12 -= cVar2.c;
                        cVar2 = cVar;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                p0.c cVar3 = ((p0.c[]) cVar2.d)[(i11 << (8 - i12)) & 255];
                p0.c[] cVarArr = (p0.c[]) cVar3.d;
                int i13 = cVar3.c;
                if (cVarArr != null || i13 > i12) {
                    break;
                }
                byteArrayOutputStream.write(cVar3.f4964b);
                i12 -= i13;
                cVar2 = cVar;
            }
            return o.g(byteArrayOutputStream.toByteArray());
        }
        return a0Var.f(e);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte readByte = this.f5421b.readByte();
            int i14 = readByte & UByte.MAX_VALUE;
            if ((readByte & ByteCompanionObject.MIN_VALUE) != 0) {
                i11 += (readByte & ByteCompanionObject.MAX_VALUE) << i13;
                i13 += 7;
            } else {
                return i11 + (i14 << i13);
            }
        }
    }
}
