package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends e {
    public final String d;
    public final String e;

    public c(f6.a aVar, String str, String str2) {
        super(aVar);
        this.d = str2;
        this.e = str;
    }

    @Override // o.b
    public final String a() {
        if (((f6.a) this.f4273b).c == 84) {
            StringBuilder sb = new StringBuilder();
            b(sb, 8);
            f(sb, 48, 20);
            int h2 = a5.h.h(68, 16, (f6.a) ((a5.h) this.c).c);
            if (h2 != 38400) {
                sb.append('(');
                sb.append(this.d);
                sb.append(')');
                int i10 = h2 % 32;
                int i11 = h2 / 32;
                int i12 = (i11 % 12) + 1;
                int i13 = i11 / 12;
                if (i13 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i13);
                if (i12 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i12);
                if (i10 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i10);
            }
            return sb.toString();
        }
        throw z5.i.d;
    }

    @Override // q6.e
    public final void d(StringBuilder sb, int i10) {
        sb.append('(');
        sb.append(this.e);
        sb.append(i10 / 100000);
        sb.append(')');
    }

    @Override // q6.e
    public final int e(int i10) {
        return i10 % 100000;
    }
}
