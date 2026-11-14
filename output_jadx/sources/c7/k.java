package c7;

import android.graphics.Rect;
import android.util.Log;
import b7.u;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f573a;

    @Override // c7.n
    public final float a(u uVar, u uVar2) {
        switch (this.f573a) {
            case 0:
                if (uVar.f424b > 0 && uVar.c > 0) {
                    u a10 = uVar.a(uVar2);
                    float f8 = a10.f424b * 1.0f;
                    float f10 = f8 / uVar.f424b;
                    if (f10 > 1.0f) {
                        f10 = (float) Math.pow(1.0f / f10, 1.1d);
                    }
                    float f11 = ((a10.c * 1.0f) / uVar2.c) + (f8 / uVar2.f424b);
                    return ((1.0f / f11) / f11) * f10;
                }
                return 0.0f;
            case 1:
                if (uVar.f424b > 0 && uVar.c > 0) {
                    float f12 = uVar.b(uVar2).f424b;
                    float f13 = (f12 * 1.0f) / uVar.f424b;
                    if (f13 > 1.0f) {
                        f13 = (float) Math.pow(1.0f / f13, 1.1d);
                    }
                    float f14 = ((uVar2.c * 1.0f) / r0.c) * ((uVar2.f424b * 1.0f) / f12);
                    return (((1.0f / f14) / f14) / f14) * f13;
                }
                return 0.0f;
            default:
                int i10 = uVar.f424b;
                int i11 = uVar.c;
                if (i10 > 0 && i11 > 0) {
                    int i12 = uVar2.f424b;
                    int i13 = uVar2.c;
                    float f15 = (i10 * 1.0f) / i12;
                    if (f15 < 1.0f) {
                        f15 = 1.0f / f15;
                    }
                    float f16 = i11;
                    float f17 = i13;
                    float f18 = (f16 * 1.0f) / f17;
                    if (f18 < 1.0f) {
                        f18 = 1.0f / f18;
                    }
                    float f19 = (1.0f / f15) / f18;
                    float f20 = ((i10 * 1.0f) / f16) / ((i12 * 1.0f) / f17);
                    if (f20 < 1.0f) {
                        f20 = 1.0f / f20;
                    }
                    return (((1.0f / f20) / f20) / f20) * f19;
                }
                return 0.0f;
        }
    }

    @Override // c7.n
    public final Rect b(u uVar, u uVar2) {
        switch (this.f573a) {
            case 0:
                u a10 = uVar.a(uVar2);
                Log.i("k", "Preview: " + uVar + "; Scaled: " + a10 + "; Want: " + uVar2);
                int i10 = a10.f424b;
                int i11 = (i10 - uVar2.f424b) / 2;
                int i12 = a10.c;
                int i13 = (i12 - uVar2.c) / 2;
                return new Rect(-i11, -i13, i10 - i11, i12 - i13);
            case 1:
                u b10 = uVar.b(uVar2);
                Log.i("k", "Preview: " + uVar + "; Scaled: " + b10 + "; Want: " + uVar2);
                int i14 = b10.f424b;
                int i15 = (i14 - uVar2.f424b) / 2;
                int i16 = b10.c;
                int i17 = (i16 - uVar2.c) / 2;
                return new Rect(-i15, -i17, i14 - i15, i16 - i17);
            default:
                return new Rect(0, 0, uVar2.f424b, uVar2.c);
        }
    }
}
