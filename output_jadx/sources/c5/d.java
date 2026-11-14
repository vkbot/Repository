package c5;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final b f531a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f532b;
    public final k5.b c;
    public final Set d;
    public final Executor e;

    public d(Context context, String str, Set set, k5.b bVar, Executor executor) {
        this.f531a = new b(0, context, str);
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.f532b = context;
    }

    public final o7.a a() {
        if (!UserManagerCompat.isUserUnlocked(this.f532b)) {
            o7.a aVar = new o7.a();
            aVar.g("");
            return aVar;
        }
        c cVar = new c(this, 0);
        Executor executor = this.e;
        r2.a.c(executor, "Executor must not be null");
        o7.a aVar2 = new o7.a();
        executor.execute(new a9.i(aVar2, cVar));
        return aVar2;
    }

    public final void b() {
        if (this.d.size() <= 0) {
            new o7.a().g(null);
            return;
        }
        if (!UserManagerCompat.isUserUnlocked(this.f532b)) {
            new o7.a().g(null);
            return;
        }
        c cVar = new c(this, 1);
        Executor executor = this.e;
        r2.a.c(executor, "Executor must not be null");
        executor.execute(new a9.i(new o7.a(), cVar));
    }
}
