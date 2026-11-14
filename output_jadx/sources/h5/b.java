package h5;

import android.support.v4.media.h;
import f5.b0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements e5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2584b;
    public final h c;

    public /* synthetic */ b(h hVar, int i10) {
        this.f2584b = i10;
        this.c = hVar;
    }

    @Override // t8.a
    public final Object get() {
        switch (this.f2584b) {
            case 0:
                b0 b0Var = (b0) this.c.c;
                a.a.e(b0Var);
                return b0Var;
            default:
                b5.b bVar = (b5.b) this.c.d;
                a.a.e(bVar);
                return bVar;
        }
    }
}
