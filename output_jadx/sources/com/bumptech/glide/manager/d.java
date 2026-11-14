package com.bumptech.glide.manager;

import android.view.View;
import q.w;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f661b;
    public final /* synthetic */ e c;

    public d(e eVar, e eVar2) {
        this.c = eVar;
        this.f661b = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w a10 = w.a();
        a10.getClass();
        c0.p.a();
        a10.d.set(true);
        this.c.c.c = true;
        View view = this.c.f662b;
        view.getViewTreeObserver().removeOnDrawListener(this.f661b);
        this.c.c.f663b.clear();
    }
}
