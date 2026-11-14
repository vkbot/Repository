package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f662b;
    public final /* synthetic */ f c;

    public e(f fVar, View view) {
        this.c = fVar;
        this.f662b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        c0.p.f().post(new d(this, this));
    }
}
