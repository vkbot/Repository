package y8;

import kotlin.Unit;
import v8.i0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class o implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final q f6659b;
    public final long c;
    public final Object d;
    public final v8.e e;

    public o(q qVar, long j10, Object obj, v8.e eVar) {
        this.f6659b = qVar;
        this.c = j10;
        this.d = obj;
        this.e = eVar;
    }

    @Override // v8.i0
    public final void dispose() {
        q qVar = this.f6659b;
        synchronized (qVar) {
            if (this.c < qVar.l()) {
                return;
            }
            Object[] objArr = qVar.f6665g;
            objArr.getClass();
            long j10 = this.c;
            if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                return;
            }
            r.b(objArr, j10, r.f6670a);
            qVar.g();
            Unit unit = Unit.INSTANCE;
        }
    }
}
