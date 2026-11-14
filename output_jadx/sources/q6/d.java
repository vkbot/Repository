package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d extends o.b {
    public final void b(StringBuilder sb, int i10) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        c(sb, i10, length);
    }

    public final void c(StringBuilder sb, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            int h2 = a5.h.h((i13 * 10) + i10, 10, (f6.a) ((a5.h) this.c).c);
            if (h2 / 100 == 0) {
                sb.append('0');
            }
            if (h2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(h2);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 13; i15++) {
            int charAt = sb.charAt(i15 + i11) - '0';
            if ((i15 & 1) == 0) {
                charAt *= 3;
            }
            i14 += charAt;
        }
        int i16 = 10 - (i14 % 10);
        if (i16 != 10) {
            i12 = i16;
        }
        sb.append(i12);
    }
}
