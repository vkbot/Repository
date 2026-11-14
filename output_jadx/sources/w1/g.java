package w1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum g {
    NORMAL(0, 720, false, 1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT(90, 270, true, 2, 1),
    /* JADX INFO: Fake field, exist only in values array */
    TOP(180, 360, true, 1, 2),
    RIGHT(270, 450, true, 2, 1),
    BOTTOM(0, 180, true, 1, 2),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEFT(180, 270, false, 1, 1),
    TOP_RIGHT(270, 360, false, 1, 1),
    BOTTOM_RIGHT(0, 90, false, 1, 1),
    BOTTOM_LEFT(90, 180, false, 1, 1);


    /* renamed from: b, reason: collision with root package name */
    public final int f6336b;
    public final int c;
    public final boolean d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6337f;

    g(int i10, int i11, boolean z9, int i12, int i13) {
        this.f6336b = i10;
        this.c = i11;
        this.d = z9;
        this.e = i12;
        this.f6337f = i13;
    }
}
