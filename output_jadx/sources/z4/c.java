package z4;

import a5.e;
import java.util.Date;
import java.util.HashMap;
import x4.f;
import x4.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements y4.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f6827f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f6828g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6831b;
    public final e c;
    public boolean d;
    public static final e e = new e(2);

    /* renamed from: h, reason: collision with root package name */
    public static final b f6829h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [z4.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [z4.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [z4.b, java.lang.Object] */
    static {
        final int i10 = 0;
        f6827f = new f() { // from class: z4.a
            @Override // x4.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i11 = 1;
        f6828g = new f() { // from class: z4.a
            @Override // x4.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public c() {
        HashMap hashMap = new HashMap();
        this.f6830a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f6831b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f6827f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f6828g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f6829h);
        hashMap.remove(Date.class);
    }

    public final y4.a a(Class cls, x4.d dVar) {
        this.f6830a.put(cls, dVar);
        this.f6831b.remove(cls);
        return this;
    }
}
