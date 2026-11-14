package e5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements t8.a {
    public static final Object d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile b f2209b;
    public volatile Object c;

    /* JADX WARN: Type inference failed for: r0v1, types: [t8.a, java.lang.Object, e5.a] */
    public static t8.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.c = d;
        obj.f2209b = bVar;
        return obj;
    }

    @Override // t8.a
    public final Object get() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = d;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.c;
                    if (obj == obj3) {
                        obj = this.f2209b.get();
                        Object obj4 = this.c;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.c = obj;
                        this.f2209b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
