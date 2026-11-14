package q6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends d {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f6.a aVar, int i10) {
        super(aVar);
        this.d = i10;
    }

    @Override // o.b
    public final String a() {
        switch (this.d) {
            case 0:
                a5.h hVar = (a5.h) this.c;
                if (((f6.a) this.f4273b).c >= 48) {
                    StringBuilder sb = new StringBuilder();
                    b(sb, 8);
                    int h2 = a5.h.h(48, 2, (f6.a) hVar.c);
                    sb.append("(392");
                    sb.append(h2);
                    sb.append(')');
                    sb.append(hVar.f(50, null).f5287b);
                    return sb.toString();
                }
                throw z5.i.d;
            case 1:
                a5.h hVar2 = (a5.h) this.c;
                if (((f6.a) this.f4273b).c >= 48) {
                    StringBuilder sb2 = new StringBuilder();
                    b(sb2, 8);
                    int h10 = a5.h.h(48, 2, (f6.a) hVar2.c);
                    sb2.append("(393");
                    sb2.append(h10);
                    sb2.append(')');
                    int h11 = a5.h.h(50, 10, (f6.a) hVar2.c);
                    if (h11 / 100 == 0) {
                        sb2.append('0');
                    }
                    if (h11 / 10 == 0) {
                        sb2.append('0');
                    }
                    sb2.append(h11);
                    sb2.append(hVar2.f(60, null).f5287b);
                    return sb2.toString();
                }
                throw z5.i.d;
            default:
                StringBuilder u8 = ai.onnxruntime.a.u("(01)");
                int length = u8.length();
                a5.h hVar3 = (a5.h) this.c;
                u8.append(a5.h.h(4, 4, (f6.a) hVar3.c));
                c(u8, 8, length);
                return hVar3.d(u8, 48);
        }
    }
}
