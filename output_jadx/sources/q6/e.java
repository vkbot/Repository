package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e extends d {
    public abstract void d(StringBuilder sb, int i10);

    public abstract int e(int i10);

    public final void f(StringBuilder sb, int i10, int i11) {
        int h2 = a5.h.h(i10, i11, (f6.a) ((a5.h) this.c).c);
        d(sb, h2);
        int e = e(h2);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (e / i12 == 0) {
                sb.append('0');
            }
            i12 /= 10;
        }
        sb.append(e);
    }
}
