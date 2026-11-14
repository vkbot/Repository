package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends e {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f6.a aVar, int i10) {
        super(aVar);
        this.d = i10;
    }

    @Override // o.b
    public final String a() {
        if (((f6.a) this.f4273b).c == 60) {
            StringBuilder sb = new StringBuilder();
            b(sb, 5);
            f(sb, 45, 15);
            return sb.toString();
        }
        throw z5.i.d;
    }

    @Override // q6.e
    public final void d(StringBuilder sb, int i10) {
        switch (this.d) {
            case 0:
                sb.append("(3103)");
                return;
            default:
                if (i10 < 10000) {
                    sb.append("(3202)");
                    return;
                } else {
                    sb.append("(3203)");
                    return;
                }
        }
    }

    @Override // q6.e
    public final int e(int i10) {
        switch (this.d) {
            case 0:
                return i10;
            default:
                if (i10 >= 10000) {
                    return i10 - 10000;
                }
                return i10;
        }
    }
}
