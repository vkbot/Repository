package n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4243a = new a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b, reason: collision with root package name */
    public static final a f4244b = new a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");
    public static final a c = new a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static List h(Class cls, Iterable iterable, ClassLoader classLoader, h hVar) {
        ?? r52;
        try {
            Class.forName("android.app.Application", false, classLoader);
            r52 = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    r52.add(obj);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                r52 = ServiceLoader.load(cls);
            } else {
                r52 = load;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : r52) {
            switch (hVar.f4209b) {
                case 6:
                    ((k0) obj2).getClass();
                    break;
                case 7:
                    ((n0) obj2).getClass();
                    break;
                default:
                    ((a1) obj2).getClass();
                    break;
            }
            arrayList.add(obj2);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new d1(hVar)));
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void a(String str, Throwable th);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n7.r b() {
        /*
            r4 = this;
            java.util.List r0 = r4.c()
            r1 = 0
            if (r0 == 0) goto Lf
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            java.lang.String r2 = "%s does not have exactly one group"
            o4.b.l(r2, r3, r0)
            java.lang.Object r0 = r0.get(r1)
            n7.r r0 = (n7.r) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.t.b():n7.r");
    }

    public abstract List c();

    public abstract b d();

    public abstract e e();

    public abstract Object f();

    public abstract void g();

    public abstract void i(f1 f1Var);

    public abstract void j(z0 z0Var);

    public abstract void k();

    public abstract void l();

    public abstract void m(y5.g gVar);

    public abstract void n();

    public abstract void o(e eVar, v0 v0Var);

    public abstract void p(i0 i0Var);

    public abstract void q(List list);
}
