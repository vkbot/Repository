package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Set f678b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.i
    public final void c() {
        ArrayList e = c0.p.e(this.f678b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((z.d) obj).c();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        ArrayList e = c0.p.e(this.f678b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((z.d) obj).e();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        ArrayList e = c0.p.e(this.f678b);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            ((z.d) obj).onStart();
        }
    }
}
