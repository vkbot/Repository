package f5;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import n7.n0;
import n7.p0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements e5.b, f2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2302b;
    public final t8.a c;

    public /* synthetic */ m(Object obj, t8.a aVar, int i10) {
        this.f2302b = i10;
        this.c = aVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Comparator] */
    @Override // t8.a
    public final Object get() {
        p0 p0Var;
        List list;
        n0 n0Var = null;
        switch (this.f2302b) {
            case 0:
                return new l((y5.j) this.c.get());
            case 1:
                return new o((y) this.c.get());
            case 2:
                return new z((Application) this.c.get());
            case 3:
                h8.p0 p0Var2 = ((b) this.c.get()).f2273b;
                a.a.e(p0Var2);
                return p0Var2;
            case 4:
                return new b((b0) this.c.get());
            case 5:
                return new h((Executor) this.c.get());
            case 6:
                Application application = (Application) this.c.get();
                k kVar = new k();
                s8.b bVar = kVar.f2297f;
                bVar.getClass();
                h8.l lVar = new h8.l(3, bVar);
                int i10 = x7.b.f6507b;
                d8.b.b(i10, "bufferSize");
                h8.p0 c = new h8.l0(lVar, i10).c();
                c.f();
                application.registerActivityLifecycleCallbacks(kVar);
                return c;
            case 7:
                String str = (String) this.c.get();
                Logger logger = p0.c;
                synchronized (p0.class) {
                    try {
                        if (p0.d == null) {
                            List<n0> h2 = n7.t.h(n0.class, p0.a(), n0.class.getClassLoader(), new n7.h(7));
                            p0.d = new p0();
                            for (n0 n0Var2 : h2) {
                                p0.c.fine("Service loader found " + n0Var2);
                                p0 p0Var3 = p0.d;
                                synchronized (p0Var3) {
                                    n0Var2.getClass();
                                    p0Var3.f4235a.add(n0Var2);
                                }
                            }
                            p0 p0Var4 = p0.d;
                            synchronized (p0Var4) {
                                ArrayList arrayList = new ArrayList(p0Var4.f4235a);
                                Collections.sort(arrayList, Collections.reverseOrder(new Object()));
                                p0Var4.f4236b = Collections.unmodifiableList(arrayList);
                            }
                        }
                        p0Var = p0.d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (p0Var) {
                    list = p0Var.f4236b;
                }
                if (!list.isEmpty()) {
                    n0Var = (n0) list.get(0);
                }
                if (n0Var != null) {
                    return new p7.h(str).f5048b.E();
                }
                throw new a8.a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact", 2);
            case 8:
                return new y((Application) this.c.get(), "fiam_eligible_campaigns_cache_file");
            case 9:
                return new y((Application) this.c.get(), "fiam_impressions_store_file");
            case 10:
                return new y((Application) this.c.get(), "rate_limit_store_file");
            case 11:
                String packageName = ((Context) this.c.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                n0.b.n("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new k2.j((Context) this.c.get(), "com.google.android.datatransport.events", Integer.valueOf(k2.j.e).intValue());
        }
    }

    public /* synthetic */ m(t8.a aVar, int i10) {
        this.f2302b = i10;
        this.c = aVar;
    }
}
