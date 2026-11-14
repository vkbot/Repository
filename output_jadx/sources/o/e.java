package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import h.h;
import n.q;
import n.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4282a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4283b;
    public final r c;
    public final Class d;

    public e(Context context, r rVar, r rVar2, Class cls) {
        this.f4282a = context.getApplicationContext();
        this.f4283b = rVar;
        this.c = rVar2;
        this.d = cls;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && a.a.n(uri)) {
            return true;
        }
        return false;
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new q(new b0.b(uri), new d(this.f4282a, this.f4283b, this.c, uri, i10, i11, hVar, this.d));
    }
}
