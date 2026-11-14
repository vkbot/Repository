package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Set f663b = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean c;

    @Override // com.bumptech.glide.manager.g
    public final void b(FragmentActivity fragmentActivity) {
        if (this.c || !this.f663b.add(fragmentActivity)) {
            return;
        }
        View decorView = fragmentActivity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new e(this, decorView));
    }
}
