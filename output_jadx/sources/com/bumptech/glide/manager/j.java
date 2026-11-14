package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f664b;
    public final /* synthetic */ k c;

    public j(k kVar, Lifecycle lifecycle) {
        this.c = kVar;
        this.f664b = lifecycle;
    }

    @Override // com.bumptech.glide.manager.i
    public final void c() {
        this.c.f665a.remove(this.f664b);
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }
}
