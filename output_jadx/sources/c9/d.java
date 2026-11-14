package c9;

import v8.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends g {
    public static final d c;

    /* JADX WARN: Type inference failed for: r0v0, types: [c9.d, c9.g, v8.t] */
    static {
        int i10 = k.c;
        int i11 = k.d;
        long j10 = k.e;
        String str = k.f600a;
        ?? tVar = new t();
        tVar.f597b = new b(i10, i11, j10, str);
        c = tVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // v8.t
    public final t limitedParallelism(int i10) {
        a9.a.a(i10);
        if (i10 >= k.c) {
            return this;
        }
        return super.limitedParallelism(i10);
    }

    @Override // v8.t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
