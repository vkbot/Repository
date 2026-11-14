package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
final class LifecycleLifecycle implements h, LifecycleObserver {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f659b = new HashSet();
    public final Lifecycle c;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.c = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.h
    public final void a(i iVar) {
        this.f659b.add(iVar);
        Lifecycle lifecycle = this.c;
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            iVar.c();
        } else if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            iVar.onStart();
        } else {
            iVar.e();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void b(i iVar) {
        this.f659b.remove(iVar);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        ArrayList e = c0.p.e(this.f659b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((i) obj).c();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        ArrayList e = c0.p.e(this.f659b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((i) obj).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        ArrayList e = c0.p.e(this.f659b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((i) obj).e();
        }
    }
}
