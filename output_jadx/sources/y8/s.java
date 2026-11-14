package y8;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s extends z8.c {

    /* renamed from: a, reason: collision with root package name */
    public long f6672a;

    /* renamed from: b, reason: collision with root package name */
    public v8.e f6673b;

    @Override // z8.c
    public final boolean a(z8.a aVar) {
        q qVar = (q) aVar;
        if (this.f6672a >= 0) {
            return false;
        }
        long j10 = qVar.f6666h;
        if (j10 < qVar.f6667i) {
            qVar.f6667i = j10;
        }
        this.f6672a = j10;
        return true;
    }

    @Override // z8.c
    public final Continuation[] b(z8.a aVar) {
        long j10 = this.f6672a;
        this.f6672a = -1L;
        this.f6673b = null;
        return ((q) aVar).r(j10);
    }
}
