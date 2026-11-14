package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.h;
import androidx.annotation.Keep;
import b1.m;
import c2.k;
import com.google.firebase.components.ComponentRegistrar;
import d5.j;
import e0.s3;
import f5.b0;
import f5.i;
import f5.l0;
import f5.u;
import f6.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import l5.e;
import o4.f;
import s4.a;
import s4.b;
import s4.c;
import t4.n;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Keep
/* loaded from: classes.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private p backgroundExecutor = new p(a.class, Executor.class);
    private p blockingExecutor = new p(b.class, Executor.class);
    private p lightWeightExecutor = new p(c.class, Executor.class);
    private p legacyTransportFactory = new p(v4.a.class, a2.c.class);

    public j providesFirebaseInAppMessaging(t4.b bVar) {
        p4.c cVar;
        f fVar = (f) bVar.b(f.class);
        e eVar = (e) bVar.b(e.class);
        n d = bVar.d();
        b5.b bVar2 = (b5.b) bVar.b(b5.b.class);
        fVar.a();
        r5.c cVar2 = new r5.c(15, (Application) fVar.f4359a);
        h hVar = new h(d, bVar2);
        z3.f fVar2 = new z3.f(7);
        Object obj = new Object();
        r5.c cVar3 = new r5.c(18, false);
        cVar3.c = obj;
        g5.b bVar3 = new g5.b(new p2.e(8), new p2.e(9), cVar2, new c5.e(8), cVar3, fVar2, new z3.f(8), new p2.e(10), new c5.e(9), hVar, new a5.h((Executor) bVar.h(this.lightWeightExecutor), (Executor) bVar.h(this.backgroundExecutor), (Executor) bVar.h(this.blockingExecutor), 8, false));
        q4.a aVar = (q4.a) bVar.b(q4.a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f5282a.containsKey("fiam")) {
                    aVar.f5282a.put("fiam", new p4.c(aVar.f5283b));
                }
                cVar = (p4.c) aVar.f5282a.get("fiam");
            } catch (Throwable th) {
                throw th;
            }
        }
        f5.a aVar2 = new f5.a(cVar, (Executor) bVar.h(this.blockingExecutor));
        a5.h hVar2 = new a5.h(fVar, eVar, new Object(), 6);
        l0 l0Var = new l0(fVar);
        a2.c cVar4 = (a2.c) bVar.h(this.legacyTransportFactory);
        cVar4.getClass();
        g5.a aVar3 = new g5.a(bVar3, 2);
        g5.a aVar4 = new g5.a(bVar3, 11);
        g5.a aVar5 = new g5.a(bVar3, 5);
        z3.f fVar3 = new z3.f(6, bVar3);
        t8.a a10 = e5.a.a(new m(5, hVar2, e5.a.a(new f5.m(e5.a.a(new h(l0Var, new g5.a(bVar3, 8), new r5.c(17, l0Var), 15)), 0)), new g5.a(bVar3, 3), new g5.a(bVar3, 13)));
        g5.a aVar6 = new g5.a(bVar3, 1);
        g5.a aVar7 = new g5.a(bVar3, 15);
        g5.a aVar8 = new g5.a(bVar3, 9);
        g5.a aVar9 = new g5.a(bVar3, 14);
        w7.c cVar5 = new w7.c(6, bVar3);
        h5.a aVar10 = new h5.a(hVar2, 2);
        r5.c cVar6 = new r5.c(hVar2, aVar10);
        h5.a aVar11 = new h5.a(hVar2, 1);
        a5.h hVar3 = new a5.h(hVar2, aVar10, new g5.a(bVar3, 7), 7);
        e5.c cVar7 = new e5.c(0, aVar2);
        g5.a aVar12 = new g5.a(bVar3, 4);
        t8.a a11 = e5.a.a(new u(aVar3, aVar4, aVar5, fVar3, a10, aVar6, aVar7, aVar8, aVar9, cVar5, cVar6, aVar11, hVar3, cVar7, aVar12));
        g5.a aVar13 = new g5.a(bVar3, 12);
        h5.a aVar14 = new h5.a(hVar2, 0);
        e5.c cVar8 = new e5.c(0, cVar4);
        g5.a aVar15 = new g5.a(bVar3, 0);
        g5.a aVar16 = new g5.a(bVar3, 6);
        return (j) e5.a.a(new k(a11, aVar13, hVar3, aVar11, new i(aVar8, fVar3, aVar7, aVar9, aVar5, cVar5, e5.a.a(new s3(aVar14, cVar8, aVar15, aVar11, fVar3, aVar16, aVar12)), hVar3), aVar16, new g5.a(bVar3, 10), 1)).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<t4.a> getComponents() {
        d a10 = t4.a.a(j.class);
        a10.f2346a = LIBRARY_NAME;
        a10.a(t4.h.a(Context.class));
        a10.a(t4.h.a(e.class));
        a10.a(t4.h.a(f.class));
        a10.a(t4.h.a(q4.a.class));
        boolean z9 = false;
        a10.a(new t4.h(0, 2, b0.class));
        a10.a(new t4.h(this.legacyTransportFactory, 1, 0));
        a10.a(t4.h.a(b5.b.class));
        a10.a(new t4.h(this.backgroundExecutor, 1, 0));
        a10.a(new t4.h(this.blockingExecutor, 1, 0));
        a10.a(new t4.h(this.lightWeightExecutor, 1, 0));
        a10.f2348f = new androidx.fragment.app.h(5, this);
        if (a10.f2347b == 0) {
            z9 = true;
        }
        if (z9) {
            a10.f2347b = 2;
            return Arrays.asList(a10.b(), b1.u.d(LIBRARY_NAME, "21.0.1"));
        }
        j1.i.l("Instantiation type has already been set.");
        return null;
    }
}
