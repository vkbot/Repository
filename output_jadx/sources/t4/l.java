package t4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements k5.b {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5813a = c;

    /* renamed from: b, reason: collision with root package name */
    public volatile k5.b f5814b;

    public l(k5.b bVar) {
        this.f5814b = bVar;
    }

    @Override // k5.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f5813a;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f5813a;
                    if (obj == obj3) {
                        obj = this.f5814b.get();
                        this.f5813a = obj;
                        this.f5814b = null;
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
