package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f5288b;
    public final int c;

    public i(int i10, int i11, int i12) {
        super(i10);
        if (i11 >= 0 && i11 <= 10 && i12 >= 0 && i12 <= 10) {
            this.f5288b = i11;
            this.c = i12;
            return;
        }
        throw z5.e.a();
    }
}
