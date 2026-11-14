package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4554b;
    public final int c;
    public final Object d;

    public /* synthetic */ i4(boolean z9, int i10, int i11, Object obj) {
        this.f4553a = z9;
        this.f4554b = i10;
        this.c = i11;
        this.d = obj;
    }

    public static i4 a(i4 i4Var, i4 i4Var2) {
        boolean z9;
        String str = (String) i4Var.d;
        if (str == null) {
            str = (String) i4Var2.d;
        }
        if (i4Var.f4553a && i4Var2.f4553a) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new i4(z9, i4Var.f4554b + i4Var2.f4554b, i4Var.c + i4Var2.c, str);
    }
}
