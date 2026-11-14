package f5;

import com.google.protobuf.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {
    public static final y5.c c = y5.c.p();

    /* renamed from: a, reason: collision with root package name */
    public final y f2306a;

    /* renamed from: b, reason: collision with root package name */
    public x7.e f2307b = i8.d.f2846b;

    public o(y yVar) {
        this.f2306a = yVar;
    }

    public final x7.e a() {
        x7.e eVar = this.f2307b;
        x0 r = y5.c.r();
        y yVar = this.f2306a;
        yVar.getClass();
        i8.l lVar = new i8.l(new x(0, yVar, r));
        final int i10 = 0;
        b8.b bVar = new b8.b(this) { // from class: f5.n
            public final /* synthetic */ o c;

            {
                this.c = this;
            }

            @Override // b8.b
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.c.f2307b = x7.e.a((y5.c) obj);
                        return;
                    default:
                        this.c.f2307b = i8.d.f2846b;
                        return;
                }
            }
        };
        z3.f fVar = d8.b.d;
        x7.e e = eVar.e(new i8.r(lVar, bVar, fVar));
        final int i11 = 1;
        return new i8.r(e, fVar, new b8.b(this) { // from class: f5.n
            public final /* synthetic */ o c;

            {
                this.c = this;
            }

            @Override // b8.b
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.c.f2307b = x7.e.a((y5.c) obj);
                        return;
                    default:
                        this.c.f2307b = i8.d.f2846b;
                        return;
                }
            }
        });
    }
}
