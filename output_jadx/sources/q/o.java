package q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f5139b = new o(2);
    public static final o c = new o(0);
    public static final o d;
    public static final o e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f5140f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.g f5141g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f5142h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5143a;

    static {
        o oVar = new o(1);
        d = oVar;
        e = new o(3);
        f5140f = oVar;
        f5141g = h.g.a(oVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f5142h = true;
    }

    public /* synthetic */ o(int i10) {
        this.f5143a = i10;
    }

    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f5143a) {
            case 0:
                if (b(i10, i11, i12, i13) == 1.0f) {
                    return 2;
                }
                return f5139b.a(i10, i11, i12, i13);
            case 1:
                return 2;
            case 2:
                if (f5142h) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float b(int i10, int i11, int i12, int i13) {
        switch (this.f5143a) {
            case 0:
                return Math.min(1.0f, f5139b.b(i10, i11, i12, i13));
            case 1:
                return Math.max(i12 / i10, i13 / i11);
            case 2:
                if (f5142h) {
                    return Math.min(i12 / i10, i13 / i11);
                }
                if (Math.max(i11 / i13, i10 / i12) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
