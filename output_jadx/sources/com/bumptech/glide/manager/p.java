package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f670a;

    public p(t tVar) {
        this.f670a = tVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z9) {
        ArrayList arrayList;
        c0.p.a();
        synchronized (this.f670a) {
            arrayList = new ArrayList((HashSet) this.f670a.e);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).a(z9);
        }
    }
}
