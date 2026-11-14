package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f660b;
    public final com.bumptech.glide.o c;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f660b = context.getApplicationContext();
        this.c = oVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        t c = t.c(this.f660b);
        com.bumptech.glide.o oVar = this.c;
        synchronized (c) {
            ((HashSet) c.e).remove(oVar);
            if (c.c && ((HashSet) c.e).isEmpty()) {
                s sVar = (s) c.d;
                ((ConnectivityManager) ((c0.h) sVar.d).get()).unregisterNetworkCallback((r) sVar.e);
                c.c = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        t c = t.c(this.f660b);
        com.bumptech.glide.o oVar = this.c;
        synchronized (c) {
            ((HashSet) c.e).add(oVar);
            c.g();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void c() {
    }
}
