package com.bumptech.glide.manager;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import e0.s3;
import f5.j0;
import java.io.InputStream;
import n.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements c0.i, n.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f669b;
    public Context c;

    public /* synthetic */ o(Context context, int i10) {
        this.f669b = i10;
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [d2.k, java.lang.Object] */
    public d2.k a() {
        Context context = this.c;
        if (context != null) {
            ?? obj = new Object();
            obj.f1747b = f2.a.a(d2.m.f1752a);
            e5.c cVar = new e5.c(1, context);
            obj.c = cVar;
            obj.d = f2.a.a(new android.support.v4.media.h((Object) cVar, (Object) new r5.c(10, cVar), false, 7));
            e5.c cVar2 = obj.c;
            obj.e = new f5.m(cVar2, 12);
            t8.a a10 = f2.a.a(new j0(obj.e, f2.a.a(new f5.m(cVar2, 11)), 1));
            obj.f1748f = a10;
            c5.e eVar = new c5.e(11);
            e5.c cVar3 = obj.c;
            a5.h hVar = new a5.h(cVar3, a10, eVar, 9);
            t8.a aVar = obj.f1747b;
            t8.a aVar2 = obj.d;
            obj.f1749g = f2.a.a(new a5.h(new s3(aVar, aVar2, hVar, a10, a10, 3), new c2.k(cVar3, aVar2, a10, hVar, aVar, a10, a10, 2), new b1.m(8, aVar, a10, hVar, a10), 2));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override // c0.i
    public Object get() {
        return (ConnectivityManager) this.c.getSystemService("connectivity");
    }

    @Override // n.s
    public n.r j(z zVar) {
        switch (this.f669b) {
            case 3:
                return new n.b(this.c, this);
            case 4:
                return new n.b(this.c, this);
            case 5:
                return new n.b(this.c, this);
            case 6:
                return new n.m(this.c, 0);
            case 7:
                return new n.b(this.c, zVar.b(Integer.class, AssetFileDescriptor.class));
            case 8:
                return new n.b(this.c, zVar.b(Integer.class, InputStream.class));
            case 9:
                return new n.m(this.c, 1);
            default:
                return new n.m(this.c, 2);
        }
    }

    public /* synthetic */ o() {
        this.f669b = 1;
    }
}
