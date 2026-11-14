package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f665a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final c5.e f666b;

    public k(c5.e eVar) {
        this.f666b = eVar;
    }

    public final com.bumptech.glide.p a(Context context, com.bumptech.glide.b bVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z9) {
        c0.p.a();
        c0.p.a();
        HashMap hashMap = this.f665a;
        com.bumptech.glide.p pVar = (com.bumptech.glide.p) hashMap.get(lifecycle);
        if (pVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
            z3.f fVar = new z3.f(this, fragmentManager);
            this.f666b.getClass();
            com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(bVar, lifecycleLifecycle, fVar, context);
            hashMap.put(lifecycle, pVar2);
            lifecycleLifecycle.a(new j(this, lifecycle));
            if (z9) {
                pVar2.onStart();
            }
            return pVar2;
        }
        return pVar;
    }
}
