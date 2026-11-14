package j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f3039b = new m(0);
    public static final m c = new m(1);
    public static final m d = new m(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3040a;

    public /* synthetic */ m(int i10) {
        this.f3040a = i10;
    }

    public final boolean a(int i10) {
        switch (this.f3040a) {
            case 0:
                return false;
            case 1:
                if (i10 != 3 && i10 != 5) {
                    return true;
                }
                return false;
            default:
                if (i10 == 2) {
                    return true;
                }
                return false;
        }
    }
}
