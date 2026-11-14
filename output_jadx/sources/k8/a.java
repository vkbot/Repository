package k8;

import android.support.v4.media.h;
import j8.d;
import x7.l;
import x7.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3432a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3433b;
    public final Object c;

    public /* synthetic */ a(l lVar, Object obj, int i10) {
        this.f3432a = i10;
        this.f3433b = lVar;
        this.c = obj;
    }

    @Override // x7.l
    public final void b(m mVar) {
        switch (this.f3432a) {
            case 0:
                ((d) this.f3433b).a(new h(28, this, mVar));
                return;
            case 1:
                this.f3433b.a(new h(29, this, mVar));
                return;
            default:
                this.f3433b.a(new i8.h(2, mVar, (d8.a) this.c));
                return;
        }
    }
}
