package com.google.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p1 extends r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f1605b = i10;
    }

    @Override // com.google.protobuf.r1
    public final boolean c(Object obj, long j10) {
        switch (this.f1605b) {
            case 0:
                if (s1.f1615g) {
                    if (s1.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (s1.i(obj, j10) == 0) {
                    return false;
                }
                return true;
            default:
                if (s1.f1615g) {
                    if (s1.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (s1.i(obj, j10) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.r1
    public final byte d(Object obj, long j10) {
        switch (this.f1605b) {
            case 0:
                if (s1.f1615g) {
                    return s1.h(obj, j10);
                }
                return s1.i(obj, j10);
            default:
                if (s1.f1615g) {
                    return s1.h(obj, j10);
                }
                return s1.i(obj, j10);
        }
    }

    @Override // com.google.protobuf.r1
    public final double e(Object obj, long j10) {
        switch (this.f1605b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j10));
            default:
                return Double.longBitsToDouble(h(obj, j10));
        }
    }

    @Override // com.google.protobuf.r1
    public final float f(Object obj, long j10) {
        switch (this.f1605b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j10));
            default:
                return Float.intBitsToFloat(g(obj, j10));
        }
    }

    @Override // com.google.protobuf.r1
    public final void k(Object obj, long j10, boolean z9) {
        switch (this.f1605b) {
            case 0:
                if (s1.f1615g) {
                    s1.l(obj, j10, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s1.m(obj, j10, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (s1.f1615g) {
                    s1.l(obj, j10, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s1.m(obj, j10, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.r1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f1605b) {
            case 0:
                if (s1.f1615g) {
                    s1.l(obj, j10, b10);
                    return;
                } else {
                    s1.m(obj, j10, b10);
                    return;
                }
            default:
                if (s1.f1615g) {
                    s1.l(obj, j10, b10);
                    return;
                } else {
                    s1.m(obj, j10, b10);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.r1
    public final void m(Object obj, long j10, double d) {
        switch (this.f1605b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j10, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // com.google.protobuf.r1
    public final void n(Object obj, long j10, float f8) {
        switch (this.f1605b) {
            case 0:
                o(Float.floatToIntBits(f8), j10, obj);
                return;
            default:
                o(Float.floatToIntBits(f8), j10, obj);
                return;
        }
    }

    @Override // com.google.protobuf.r1
    public final boolean s() {
        switch (this.f1605b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
