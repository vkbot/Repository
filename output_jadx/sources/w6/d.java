package w6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum d {
    TERMINATOR(0, new int[]{0, 0, 0}),
    NUMERIC(1, new int[]{10, 12, 14}),
    ALPHANUMERIC(2, new int[]{9, 11, 13}),
    STRUCTURED_APPEND(3, new int[]{0, 0, 0}),
    BYTE(4, new int[]{8, 16, 16}),
    ECI(7, new int[]{0, 0, 0}),
    KANJI(8, new int[]{8, 10, 12}),
    FNC1_FIRST_POSITION(5, new int[]{0, 0, 0}),
    FNC1_SECOND_POSITION(9, new int[]{0, 0, 0}),
    HANZI(13, new int[]{8, 10, 12});


    /* renamed from: b, reason: collision with root package name */
    public final int[] f6407b;
    public final int c;

    d(int i10, int[] iArr) {
        this.f6407b = iArr;
        this.c = i10;
    }

    public final int a(f fVar) {
        char c;
        int i10 = fVar.f6409a;
        if (i10 <= 9) {
            c = 0;
        } else if (i10 <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.f6407b[c];
    }
}
