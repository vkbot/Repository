package d9;

import a9.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class l extends u {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f1873f;

    public l(long j10, l lVar, int i10) {
        super(j10, lVar, i10);
        this.f1873f = new AtomicReferenceArray(k.f1872f);
    }

    @Override // a9.u
    public final int f() {
        return k.f1872f;
    }

    @Override // a9.u
    public final void g(int i10, CoroutineContext coroutineContext) {
        this.f1873f.set(i10, k.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
