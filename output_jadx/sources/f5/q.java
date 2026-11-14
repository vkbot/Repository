package f5;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.protobuf.x0;
import e0.j2;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements b8.b, b8.c, b8.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2309b;
    public final /* synthetic */ t c;

    public /* synthetic */ q(t tVar, String str) {
        this.f2309b = 3;
        this.c = tVar;
    }

    @Override // b8.b
    public void accept(Object obj) {
        String o5;
        y5.i iVar = (y5.i) obj;
        switch (this.f2309b) {
            case 0:
                o oVar = this.c.f2316g;
                oVar.getClass();
                HashSet hashSet = new HashSet();
                for (x5.c cVar : iVar.q()) {
                    if (com.bumptech.glide.g.a(cVar.r(), 1)) {
                        o5 = cVar.u().o();
                    } else {
                        o5 = cVar.p().o();
                    }
                    hashSet.add(o5);
                }
                e3.d.m("Potential impressions to clear: " + hashSet.toString());
                x7.e a10 = oVar.a();
                y5.c cVar2 = o.c;
                d8.b.a(cVar2, "item is null");
                new i8.i(a10.e(x7.e.a(cVar2)), new f(1, oVar, hashSet)).z();
                return;
            default:
                g gVar = this.c.c;
                y yVar = gVar.f2282a;
                yVar.getClass();
                g8.b bVar = new g8.b(new x(1, yVar, iVar));
                f fVar = new f(0, gVar, iVar);
                z3.f fVar2 = d8.b.d;
                new g8.b(new g8.d(new g8.d(new g8.d(bVar, fVar2, fVar), fVar2, new e0.g(19)), new e0.g(20), d8.b.c), new e0.g(21)).z();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [j5.g, j5.h] */
    @Override // b8.c
    public Object apply(Object obj) {
        boolean z9;
        String str;
        String str2;
        String str3;
        j5.f fVar;
        j5.a aVar;
        j5.l lVar;
        j5.l lVar2;
        j5.h cVar;
        j5.h hVar;
        String str4;
        j5.f fVar2;
        j5.a aVar2;
        j5.l lVar3;
        j5.l lVar4;
        j5.f fVar3;
        j5.a aVar3;
        j5.l lVar5;
        j5.l lVar6;
        String str5;
        j5.a f8;
        j5.a f10;
        j5.f fVar4;
        j5.f fVar5;
        String o5;
        x7.g hVar2;
        int i10 = 1;
        int i11 = 0;
        switch (this.f2309b) {
            case 1:
                final t tVar = this.c;
                final String str6 = (String) obj;
                g gVar = tVar.c;
                gVar.getClass();
                i8.l lVar7 = new i8.l(new d7.b(1, gVar));
                y yVar = gVar.f2282a;
                x0 s5 = y5.i.s();
                yVar.getClass();
                i8.l lVar8 = new i8.l(new x(0, yVar, s5));
                e eVar = new e(gVar, 0);
                z3.f fVar6 = d8.b.d;
                x7.e b10 = new i8.r(new i8.r(new i8.r(new i8.f(lVar7.e(new i8.r(lVar8, eVar, fVar6)), new e(gVar, 1), 0), fVar6, new e(gVar, 2)), new e0.g(24), fVar6), fVar6, new e0.g(25)).b(i8.d.f2846b);
                int i12 = 4;
                q qVar = new q(tVar, i12);
                final q qVar2 = new q(tVar, 5);
                final f fVar7 = new f(6, tVar, str6);
                final e0.g gVar2 = new e0.g(26);
                b8.c cVar2 = new b8.c() { // from class: f5.s
                    @Override // b8.c
                    public final Object apply(Object obj2) {
                        t tVar2 = t.this;
                        tVar2.getClass();
                        com.google.protobuf.a0 q8 = ((y5.i) obj2).q();
                        int i13 = x7.b.f6507b;
                        d8.b.a(q8, "source is null");
                        h8.w wVar = new h8.w(new h8.l(2, q8), new q(tVar2, 2), 0);
                        String str7 = str6;
                        h8.w wVar2 = new h8.w(new h8.w(new h8.w(wVar, new androidx.constraintlayout.core.state.a(str7, 4), 0).b(qVar2).b(fVar7).b(gVar2)), new r5.c(6, new androidx.constraintlayout.core.utils.a(2)), 1);
                        int i14 = x7.b.f6507b;
                        d8.b.b(i14, "bufferSize");
                        return new i8.k(new h8.s(new h8.a0(wVar2, i14)), new q(tVar2, str7), 0);
                    }
                };
                i8.r rVar = new i8.r(tVar.f2316g.a(), fVar6, new e0.g(27));
                y5.c p9 = y5.c.p();
                d8.b.a(p9, "item is null");
                x7.e b11 = rVar.e(x7.e.a(p9)).b(x7.e.a(y5.c.p()));
                l5.d dVar = (l5.d) tVar.f2322m;
                o7.a c = dVar.c();
                Executor executor = tVar.f2324o;
                i8.c cVar3 = new i8.c(new f(i12, c, executor));
                dVar.d();
                n.p pVar = new n.p(17);
                l5.g gVar3 = new l5.g(dVar.d, pVar);
                synchronized (dVar.f3531g) {
                    dVar.f3536l.add(gVar3);
                }
                o7.a aVar4 = (o7.a) pVar.c;
                dVar.f3532h.execute(new l5.c(dVar, 2));
                i8.g gVar4 = new i8.g(i10, new x7.e[]{cVar3, new i8.c(new f(4, aVar4, executor))}, new p2.e(new e0.g(13)));
                x7.k kVar = tVar.f2315f.f2298a;
                d8.b.a(kVar, "scheduler is null");
                f fVar8 = new f(3, tVar, new i8.f(gVar4, kVar, 1));
                m0 m0Var = tVar.f2320k;
                if (m0Var.c) {
                    z9 = str6.equals("ON_FOREGROUND");
                } else {
                    z9 = m0Var.f2304b;
                }
                if (z9) {
                    e3.d.n("Forcing fetch from service rather than cache. Test Device: " + m0Var.f2304b + " | App Fresh Install: " + m0Var.c);
                    return new h8.l(4, new i8.k(new i8.k(b11, fVar8, 0), cVar2, 0));
                }
                e3.d.m("Attempting to fetch campaigns using cache");
                return new h8.l(4, new i8.k(b10.e(new i8.r(new i8.k(b11, fVar8, 0), qVar, fVar6)), cVar2, 0));
            case 2:
            default:
                t tVar2 = this.c;
                x5.c cVar4 = (x5.c) obj;
                tVar2.getClass();
                if (cVar4.q()) {
                    return x7.e.a(cVar4);
                }
                o oVar = tVar2.f2316g;
                oVar.getClass();
                if (com.bumptech.glide.g.a(cVar4.r(), 1)) {
                    o5 = cVar4.u().o();
                } else {
                    o5 = cVar4.p().o();
                }
                i8.k kVar2 = new i8.k(oVar.a(), new e0.g(9), 1);
                e0.g gVar5 = new e0.g(10);
                i8.u uVar = new i8.u(0, kVar2);
                int i13 = x7.b.f6507b;
                d8.b.b(Integer.MAX_VALUE, "maxConcurrency");
                d8.b.b(i13, "bufferSize");
                if (uVar instanceof e8.e) {
                    Object call = ((e8.e) uVar).call();
                    if (call == null) {
                        hVar2 = j8.e.f3328b;
                    } else {
                        hVar2 = new j8.l(call, gVar5);
                    }
                } else {
                    hVar2 = new j8.h(uVar, gVar5, i13);
                }
                j8.c cVar5 = new j8.c(hVar2, new e0.g(11), 1);
                d8.b.a(o5, "element is null");
                return new i8.k(new i8.g(i11, new k8.a(new k8.a(new k8.a(new j8.d(cVar5, new a9.w(o5, 1)), new e0.g(22), 0), new d8.a(0, new Object()), 2), new p(cVar4), 1), new e0.g(23)), new p(cVar4), 1);
            case 3:
                i8.d dVar2 = i8.d.f2846b;
                t tVar3 = this.c;
                x5.c cVar6 = (x5.c) obj;
                tVar3.getClass();
                if (com.bumptech.glide.g.a(cVar6.r(), 1)) {
                    str = cVar6.u().o();
                    str2 = cVar6.u().p();
                } else if (com.bumptech.glide.g.a(cVar6.r(), 2)) {
                    String o9 = cVar6.p().o();
                    String p10 = cVar6.p().p();
                    if (!cVar6.q()) {
                        a aVar5 = tVar3.f2321l;
                        aVar5.f2269b.execute(new j2(8, aVar5, cVar6.p().s()));
                    }
                    str = o9;
                    str2 = p10;
                } else {
                    return dVar2;
                }
                d5.r n10 = cVar6.n();
                Map o10 = cVar6.o();
                o4.b.i(n10, "FirebaseInAppMessaging content cannot be null.");
                o4.b.i(str, "FirebaseInAppMessaging campaign id cannot be null.");
                o4.b.i(str2, "FirebaseInAppMessaging campaign name cannot be null.");
                e3.d.m("Decoding message: ".concat(n10.toString()));
                int c10 = com.bumptech.glide.g.c(n10.r());
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                hVar = new j5.h(MessageType.UNSUPPORTED, o10);
                            } else {
                                d5.q o11 = n10.o();
                                if (o11.C()) {
                                    lVar5 = w7.c.g(o11.w());
                                } else {
                                    lVar5 = null;
                                }
                                if (o11.x()) {
                                    lVar6 = w7.c.g(o11.o());
                                } else {
                                    lVar6 = null;
                                }
                                if (!TextUtils.isEmpty(o11.n())) {
                                    str5 = o11.n();
                                } else {
                                    str5 = null;
                                }
                                if (!o11.y() && !o11.z()) {
                                    f8 = null;
                                } else {
                                    f8 = w7.c.f(o11.s(), o11.t());
                                }
                                if (!o11.A() && !o11.B()) {
                                    f10 = null;
                                } else {
                                    f10 = w7.c.f(o11.u(), o11.v());
                                }
                                if (!TextUtils.isEmpty(o11.r())) {
                                    String r = o11.r();
                                    if (TextUtils.isEmpty(r)) {
                                        r = null;
                                    }
                                    if (!TextUtils.isEmpty(r)) {
                                        fVar4 = new j5.f(r);
                                    } else {
                                        j1.i.k("ImageData model must have an imageUrl");
                                        return null;
                                    }
                                } else {
                                    fVar4 = null;
                                }
                                if (!TextUtils.isEmpty(o11.q())) {
                                    String q8 = o11.q();
                                    if (TextUtils.isEmpty(q8)) {
                                        q8 = null;
                                    }
                                    if (!TextUtils.isEmpty(q8)) {
                                        fVar5 = new j5.f(q8);
                                    } else {
                                        j1.i.k("ImageData model must have an imageUrl");
                                        return null;
                                    }
                                } else {
                                    fVar5 = null;
                                }
                                if (f8 != null) {
                                    if (f8.f3290b != null) {
                                        if (f10 != null && f10.f3290b == null) {
                                            j1.i.k("Card model secondary action must be null or have a button");
                                        } else if (lVar5 != null) {
                                            if (fVar4 == null && fVar5 == null) {
                                                j1.i.k("Card model must have at least one image");
                                            } else if (!TextUtils.isEmpty(str5)) {
                                                cVar = new j5.e(lVar5, lVar6, fVar4, fVar5, str5, f8, f10, o10);
                                                hVar = cVar;
                                            } else {
                                                j1.i.k("Card model must have a background color");
                                            }
                                        } else {
                                            j1.i.k("Card model must have a title");
                                        }
                                    } else {
                                        j1.i.k("Card model must have a primary action button");
                                    }
                                } else {
                                    j1.i.k("Card model must have a primary action");
                                }
                                return null;
                            }
                        } else {
                            d5.s q9 = n10.q();
                            if (!TextUtils.isEmpty(q9.p())) {
                                String p11 = q9.p();
                                if (TextUtils.isEmpty(p11)) {
                                    p11 = null;
                                }
                                if (!TextUtils.isEmpty(p11)) {
                                    fVar3 = new j5.f(p11);
                                } else {
                                    j1.i.k("ImageData model must have an imageUrl");
                                    return null;
                                }
                            } else {
                                fVar3 = null;
                            }
                            if (q9.q()) {
                                android.support.v4.media.h d = w7.c.d(q9.n());
                                aVar3 = new j5.a((String) d.c, (j5.d) d.d);
                            } else {
                                aVar3 = null;
                            }
                            if (fVar3 != null) {
                                ?? hVar3 = new j5.h(MessageType.IMAGE_ONLY, o10);
                                hVar3.c = fVar3;
                                hVar3.d = aVar3;
                                hVar = hVar3;
                            } else {
                                j1.i.k("ImageOnly model must have image data");
                                return null;
                            }
                        }
                    } else {
                        d5.t s9 = n10.s();
                        if (!TextUtils.isEmpty(s9.p())) {
                            str4 = s9.p();
                        } else {
                            str4 = null;
                        }
                        if (!TextUtils.isEmpty(s9.s())) {
                            String s10 = s9.s();
                            if (TextUtils.isEmpty(s10)) {
                                s10 = null;
                            }
                            if (!TextUtils.isEmpty(s10)) {
                                fVar2 = new j5.f(s10);
                            } else {
                                j1.i.k("ImageData model must have an imageUrl");
                                return null;
                            }
                        } else {
                            fVar2 = null;
                        }
                        if (s9.u()) {
                            aVar2 = w7.c.f(s9.n(), s9.o());
                        } else {
                            aVar2 = null;
                        }
                        if (s9.v()) {
                            lVar3 = w7.c.g(s9.q());
                        } else {
                            lVar3 = null;
                        }
                        if (s9.w()) {
                            lVar4 = w7.c.g(s9.t());
                        } else {
                            lVar4 = null;
                        }
                        if (lVar4 != null) {
                            if (aVar2 != null && aVar2.f3290b == null) {
                                j1.i.k("Modal model action must be null or have a button");
                            } else if (!TextUtils.isEmpty(str4)) {
                                cVar = new j5.i(lVar4, lVar3, fVar2, aVar2, str4, o10);
                                hVar = cVar;
                            } else {
                                j1.i.k("Modal model must have a background color");
                            }
                        } else {
                            j1.i.k("Modal model must have a title");
                        }
                        return null;
                    }
                } else {
                    d5.o n11 = n10.n();
                    if (!TextUtils.isEmpty(n11.o())) {
                        str3 = n11.o();
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.isEmpty(n11.r())) {
                        String r9 = n11.r();
                        if (TextUtils.isEmpty(r9)) {
                            r9 = null;
                        }
                        if (!TextUtils.isEmpty(r9)) {
                            fVar = new j5.f(r9);
                        } else {
                            j1.i.k("ImageData model must have an imageUrl");
                            return null;
                        }
                    } else {
                        fVar = null;
                    }
                    if (n11.t()) {
                        android.support.v4.media.h d10 = w7.c.d(n11.n());
                        aVar = new j5.a((String) d10.c, (j5.d) d10.d);
                    } else {
                        aVar = null;
                    }
                    if (n11.u()) {
                        lVar = w7.c.g(n11.p());
                    } else {
                        lVar = null;
                    }
                    if (n11.v()) {
                        lVar2 = w7.c.g(n11.s());
                    } else {
                        lVar2 = null;
                    }
                    if (lVar2 != null) {
                        if (!TextUtils.isEmpty(str3)) {
                            cVar = new j5.c(lVar2, lVar, fVar, aVar, str3, o10);
                            hVar = cVar;
                        } else {
                            j1.i.k("Banner model must have a background color");
                        }
                    } else {
                        j1.i.k("Banner model must have a title");
                    }
                    return null;
                }
                if (!hVar.f3302a.equals(MessageType.UNSUPPORTED)) {
                    return x7.e.a(new Object());
                }
                return dVar2;
        }
    }

    @Override // b8.d
    public boolean test(Object obj) {
        long q8;
        long n10;
        x5.c cVar = (x5.c) obj;
        t tVar = this.c;
        if (!tVar.f2320k.f2304b) {
            i5.a aVar = tVar.d;
            if (com.bumptech.glide.g.a(cVar.r(), 1)) {
                q8 = cVar.u().q();
                n10 = cVar.u().n();
            } else if (com.bumptech.glide.g.a(cVar.r(), 2)) {
                q8 = cVar.p().q();
                n10 = cVar.p().n();
            } else {
                return false;
            }
            aVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= q8 || currentTimeMillis >= n10) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ q(t tVar, int i10) {
        this.f2309b = i10;
        this.c = tVar;
    }
}
