package f6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f2352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2353b;
    public final float c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2354f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2355g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2356h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2357i;

    public f(float f8, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f2352a = f8;
        this.f2353b = f12;
        this.c = f15;
        this.d = f10;
        this.e = f13;
        this.f2354f = f16;
        this.f2355g = f11;
        this.f2356h = f14;
        this.f2357i = f17;
    }

    public static f a(float f8, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        f b10 = b(f8, f10, f11, f12, f13, f14, f15, f16);
        float f25 = b10.e;
        float f26 = b10.f2357i;
        float f27 = b10.f2354f;
        float f28 = b10.f2356h;
        float f29 = (f25 * f26) - (f27 * f28);
        float f30 = b10.f2355g;
        float f31 = b10.d;
        float f32 = (f27 * f30) - (f31 * f26);
        float f33 = (f31 * f28) - (f25 * f30);
        float f34 = b10.c;
        float f35 = b10.f2353b;
        float f36 = (f34 * f28) - (f35 * f26);
        float f37 = b10.f2352a;
        float f38 = (f26 * f37) - (f34 * f30);
        float f39 = (f30 * f35) - (f28 * f37);
        float f40 = (f35 * f27) - (f34 * f25);
        float f41 = (f34 * f31) - (f27 * f37);
        float f42 = (f37 * f25) - (f35 * f31);
        f b11 = b(f17, f18, f19, f20, f21, f22, f23, f24);
        float f43 = b11.f2352a;
        float f44 = b11.d;
        float f45 = b11.f2355g;
        float f46 = (f45 * f40) + (f44 * f36) + (f43 * f29);
        float f47 = (f45 * f41) + (f44 * f38) + (f43 * f32);
        float f48 = f45 * f42;
        float f49 = f48 + (f44 * f39) + (f43 * f33);
        float f50 = b11.f2353b;
        float f51 = b11.e;
        float f52 = b11.f2356h;
        float f53 = (f52 * f40) + (f51 * f36) + (f50 * f29);
        float f54 = (f52 * f41) + (f51 * f38) + (f50 * f32);
        float f55 = f52 * f42;
        float f56 = f55 + (f51 * f39) + (f50 * f33);
        float f57 = b11.c;
        float f58 = b11.f2354f;
        float f59 = f36 * f58;
        float f60 = b11.f2357i;
        return new f(f46, f47, f49, f53, f54, f56, (f40 * f60) + f59 + (f29 * f57), (f41 * f60) + (f38 * f58) + (f32 * f57), (f60 * f42) + (f58 * f39) + (f57 * f33));
    }

    public static f b(float f8, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f8 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new f(f11 - f8, f13 - f11, f8, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float f24 = ((f22 * f17) - (f20 * f18)) / f23;
        float f25 = ((f19 * f18) - (f17 * f21)) / f23;
        return new f((f24 * f11) + (f11 - f8), (f25 * f15) + (f15 - f8), f8, (f24 * f12) + (f12 - f10), (f25 * f16) + (f16 - f10), f10, f24, f25, 1.0f);
    }
}
