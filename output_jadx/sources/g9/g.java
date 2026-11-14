package g9;

import i9.a0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public int f2515b;
    public final /* synthetic */ a0 c;

    public g(a0 a0Var) {
        this.c = a0Var;
        this.f2515b = a0Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2515b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a0 a0Var = this.c;
        int i10 = a0Var.c;
        int i11 = this.f2515b;
        this.f2515b = i11 - 1;
        return a0Var.e[i10 - i11];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
