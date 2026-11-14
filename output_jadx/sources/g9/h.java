package g9;

import i9.a0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h implements Iterable, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2516b;

    public h(a0 a0Var) {
        this.f2516b = a0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f2516b);
    }
}
