package n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o7.f3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 {
    public static final Logger c;
    public static l0 d;
    public static final List e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4224a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4225b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(l0.class.getName());
        c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z9 = f3.f4511a;
            arrayList.add(f3.class);
        } catch (ClassNotFoundException e6) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e6);
        }
        try {
            arrayList.add(v7.y.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e10);
        }
        e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized l0 a() {
        l0 l0Var;
        synchronized (l0.class) {
            try {
                if (d == null) {
                    List<k0> h2 = t.h(k0.class, e, k0.class.getClassLoader(), new h(6));
                    d = new l0();
                    for (k0 k0Var : h2) {
                        c.fine("Service loader found " + k0Var);
                        l0 l0Var2 = d;
                        synchronized (l0Var2) {
                            k0Var.getClass();
                            l0Var2.f4224a.add(k0Var);
                        }
                    }
                    d.c();
                }
                l0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public final synchronized k0 b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f4225b;
        o4.b.i(str, "policy");
        return (k0) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.f4225b.clear();
        Iterator it = this.f4224a.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            String a10 = k0Var.a();
            if (((k0) this.f4225b.get(a10)) == null) {
                this.f4225b.put(a10, k0Var);
            }
        }
    }
}
