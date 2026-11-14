package d2;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static volatile k f1757b;

    /* renamed from: a, reason: collision with root package name */
    public final j2.i f1758a;

    public s(j2.i iVar, b1.m mVar) {
        this.f1758a = iVar;
        ((Executor) mVar.c).execute(new f5.j(5, mVar));
    }

    public static s a() {
        k kVar = f1757b;
        if (kVar != null) {
            return (s) kVar.f1749g.get();
        }
        j1.i.l("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (f1757b == null) {
            synchronized (s.class) {
                try {
                    if (f1757b == null) {
                        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o();
                        context.getClass();
                        oVar.c = context;
                        f1757b = oVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final r c(b2.a aVar) {
        Set singleton;
        if (aVar instanceof b2.a) {
            singleton = Collections.unmodifiableSet(b2.a.d);
        } else {
            singleton = Collections.singleton(new a2.a("proto"));
        }
        aVar.getClass();
        String str = aVar.f332a;
        String str2 = aVar.f333b;
        if (str2 == null) {
            str2 = "";
        }
        return new r(singleton, new j("cct", ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8")), a2.b.f6b), this);
    }
}
