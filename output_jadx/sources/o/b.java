package o;

import a5.h;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import n.r;
import n.s;
import n.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4273b;
    public final Object c;

    public b(f6.a aVar) {
        this.f4273b = aVar;
        this.c = new h(aVar);
    }

    public abstract String a();

    @Override // n.s
    public r j(z zVar) {
        Context context = (Context) this.f4273b;
        Class cls = (Class) this.c;
        return new e(context, zVar.b(File.class, cls), zVar.b(Uri.class, cls), cls);
    }

    public b(Context context, Class cls) {
        this.f4273b = context;
        this.c = cls;
    }
}
