package com.bumptech.glide;

import com.bumptech.glide.manager.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements com.bumptech.glide.manager.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f681b;

    public o(p pVar, t tVar) {
        this.f681b = pVar;
        this.f680a = tVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z9) {
        if (z9) {
            synchronized (this.f681b) {
                t tVar = this.f680a;
                ArrayList e = c0.p.e((Set) tVar.d);
                int size = e.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = e.get(i10);
                    i10++;
                    y.c cVar = (y.c) obj;
                    if (!cVar.j() && !cVar.h()) {
                        cVar.clear();
                        if (!tVar.c) {
                            cVar.i();
                        } else {
                            ((HashSet) tVar.e).add(cVar);
                        }
                    }
                }
            }
        }
    }
}
