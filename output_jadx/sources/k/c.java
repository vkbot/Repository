package k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3354a;

    public final int a(Object obj) {
        switch (this.f3354a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.f3354a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.f3354a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
