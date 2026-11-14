package w0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f6233a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f6234b;
    public final String c;
    public boolean d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f6235f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public float[] f6236g = new float[0];

    /* renamed from: h, reason: collision with root package name */
    public String f6237h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f6238i = "";

    public u(String str, j0.e eVar, String str2) {
        boolean z9 = false;
        this.e = new i1(str, eVar != null ? eVar.f3099i : "");
        this.f6233a = str;
        this.f6234b = eVar;
        this.c = str2;
        if (eVar != null && a.a.f(j0.f.g(eVar)) != null) {
            z9 = true;
        }
        this.d = z9;
    }
}
