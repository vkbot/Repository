package l9;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3560a;

    /* renamed from: b, reason: collision with root package name */
    public int f3561b;
    public int c;
    public boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f3562f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f3563g;

    public b0(byte[] bArr, int i10, int i11, boolean z9, boolean z10) {
        bArr.getClass();
        this.f3560a = bArr;
        this.f3561b = i10;
        this.c = i11;
        this.d = z9;
        this.e = z10;
    }

    public final b0 a() {
        b0 b0Var = this.f3562f;
        if (b0Var == this) {
            b0Var = null;
        }
        b0 b0Var2 = this.f3563g;
        b0Var2.getClass();
        b0Var2.f3562f = this.f3562f;
        b0 b0Var3 = this.f3562f;
        b0Var3.getClass();
        b0Var3.f3563g = this.f3563g;
        this.f3562f = null;
        this.f3563g = null;
        return b0Var;
    }

    public final void b(b0 b0Var) {
        b0Var.getClass();
        b0Var.f3563g = this;
        b0Var.f3562f = this.f3562f;
        b0 b0Var2 = this.f3562f;
        b0Var2.getClass();
        b0Var2.f3563g = b0Var;
        this.f3562f = b0Var;
    }

    public final b0 c() {
        this.d = true;
        return new b0(this.f3560a, this.f3561b, this.c, true, false);
    }

    public final void d(b0 b0Var, int i10) {
        b0Var.getClass();
        byte[] bArr = b0Var.f3560a;
        if (b0Var.e) {
            int i11 = b0Var.c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!b0Var.d) {
                    int i13 = b0Var.f3561b;
                    if (i12 - i13 <= 8192) {
                        ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i13, i11, 2, (Object) null);
                        b0Var.c -= b0Var.f3561b;
                        b0Var.f3561b = 0;
                    } else {
                        i.a();
                        return;
                    }
                } else {
                    i.a();
                    return;
                }
            }
            int i14 = b0Var.c;
            int i15 = this.f3561b;
            ArraysKt.copyInto(this.f3560a, bArr, i14, i15, i15 + i10);
            b0Var.c += i10;
            this.f3561b += i10;
            return;
        }
        j1.i.l("only owner can write");
    }

    public b0() {
        this.f3560a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
