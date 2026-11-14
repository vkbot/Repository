package h5;

import a5.h;
import f5.l0;
import l5.e;
import o4.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements e5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2583b;
    public final h c;

    public /* synthetic */ a(h hVar, int i10) {
        this.f2583b = i10;
        this.c = hVar;
    }

    @Override // t8.a
    public final Object get() {
        switch (this.f2583b) {
            case 0:
                return (f) this.c.c;
            case 1:
                e eVar = (e) this.c.d;
                a.a.e(eVar);
                return eVar;
            default:
                return new l0((f) this.c.c);
        }
    }
}
