package com.bumptech.glide.manager;

import o7.e0;
import o7.p0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f671b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, boolean z9, int i10) {
        this.f671b = i10;
        this.d = obj;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f671b) {
            case 0:
                r rVar = (r) this.d;
                c0.p.a();
                s sVar = (s) rVar.f673b;
                boolean z9 = sVar.f675b;
                boolean z10 = this.c;
                sVar.f675b = z10;
                if (z9 != z10) {
                    ((p) sVar.c).a(z10);
                    return;
                }
                return;
            default:
                p0 p0Var = (p0) ((e0) this.d).c;
                if (this.c) {
                    p0Var.f4646l = true;
                    if (p0Var.f4643i > 0) {
                        i4.f fVar = p0Var.f4645k;
                        fVar.f2774a = false;
                        fVar.b();
                    }
                }
                p0Var.f4651q = false;
                return;
        }
    }
}
