package j;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final h.e f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2972b;
    public d0 c;

    public b(h.e eVar, x xVar, ReferenceQueue referenceQueue) {
        super(xVar, referenceQueue);
        c0.g.c(eVar, "Argument must not be null");
        this.f2971a = eVar;
        boolean z9 = xVar.f3080b;
        this.c = null;
        this.f2972b = z9;
    }
}
