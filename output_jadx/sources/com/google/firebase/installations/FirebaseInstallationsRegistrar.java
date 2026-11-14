package com.google.firebase.installations;

import androidx.annotation.Keep;
import b1.u;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l5.d;
import l5.e;
import o4.f;
import s4.a;
import t4.b;
import t4.h;
import t4.p;
import u4.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(b bVar) {
        return new d((f) bVar.b(f.class), bVar.c(c5.f.class), (ExecutorService) bVar.h(new p(a.class, ExecutorService.class)), new i((Executor) bVar.h(new p(s4.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<t4.a> getComponents() {
        f6.d a10 = t4.a.a(e.class);
        a10.f2346a = LIBRARY_NAME;
        a10.a(h.a(f.class));
        a10.a(new h(0, 1, c5.f.class));
        a10.a(new h(new p(a.class, ExecutorService.class), 1, 0));
        a10.a(new h(new p(s4.b.class, Executor.class), 1, 0));
        a10.f2348f = new j1.i(25);
        t4.a b10 = a10.b();
        c5.e eVar = new c5.e(0);
        f6.d a11 = t4.a.a(c5.e.class);
        a11.c = 1;
        a11.f2348f = new q0.f(4, eVar);
        return Arrays.asList(b10, a11.b(), u.d(LIBRARY_NAME, "17.2.0"));
    }
}
