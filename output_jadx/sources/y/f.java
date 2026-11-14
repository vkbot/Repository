package y;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c0.j;
import c0.p;
import com.google.protobuf.q;
import d0.h;
import j.d0;
import j.m;
import j.r;
import j.v;
import j.z;
import j1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements c {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final String f6559a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6560b;
    public final Object c;
    public final d d;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.e f6561f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6562g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f6563h;

    /* renamed from: i, reason: collision with root package name */
    public final a f6564i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6565j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6566k;

    /* renamed from: l, reason: collision with root package name */
    public final com.bumptech.glide.h f6567l;

    /* renamed from: m, reason: collision with root package name */
    public final z.d f6568m;

    /* renamed from: n, reason: collision with root package name */
    public final List f6569n;

    /* renamed from: o, reason: collision with root package name */
    public final a0.a f6570o;

    /* renamed from: p, reason: collision with root package name */
    public final c0.f f6571p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f6572q;
    public a5.h r;

    /* renamed from: s, reason: collision with root package name */
    public long f6573s;
    public volatile r t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f6574u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f6575v;
    public Drawable w;

    /* renamed from: x, reason: collision with root package name */
    public int f6576x;

    /* renamed from: y, reason: collision with root package name */
    public int f6577y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6578z;

    /* JADX WARN: Type inference failed for: r1v3, types: [d0.h, java.lang.Object] */
    public f(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.h hVar, z.d dVar, ArrayList arrayList, d dVar2, r rVar, a0.a aVar2) {
        c0.f fVar = c0.g.f433a;
        this.f6559a = C ? String.valueOf(hashCode()) : null;
        this.f6560b = new Object();
        this.c = obj;
        this.e = context;
        this.f6561f = eVar;
        this.f6562g = obj2;
        this.f6563h = cls;
        this.f6564i = aVar;
        this.f6565j = i10;
        this.f6566k = i11;
        this.f6567l = hVar;
        this.f6568m = dVar;
        this.f6569n = arrayList;
        this.d = dVar2;
        this.t = rVar;
        this.f6570o = aVar2;
        this.f6571p = fVar;
        this.B = 1;
        if (this.A == null && ((Map) eVar.f623h.c).containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // y.c
    public final boolean a() {
        boolean z9;
        synchronized (this.c) {
            if (this.B == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void b() {
        if (!this.f6578z) {
            this.f6560b.a();
            this.f6568m.f(this);
            a5.h hVar = this.r;
            if (hVar != null) {
                synchronized (((r) hVar.e)) {
                    ((v) hVar.c).g((f) hVar.d);
                }
                this.r = null;
                return;
            }
            return;
        }
        i.l("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable c() {
        if (this.f6575v == null) {
            a aVar = this.f6564i;
            aVar.getClass();
            this.f6575v = null;
            int i10 = aVar.f6544f;
            if (i10 > 0) {
                aVar.getClass();
                Context context = this.e;
                this.f6575v = com.bumptech.glide.c.m(context, context, i10, context.getTheme());
            }
        }
        return this.f6575v;
    }

    @Override // y.c
    public final void clear() {
        synchronized (this.c) {
            try {
                if (!this.f6578z) {
                    this.f6560b.a();
                    if (this.B == 6) {
                        return;
                    }
                    b();
                    d0 d0Var = this.f6572q;
                    if (d0Var != null) {
                        this.f6572q = null;
                    } else {
                        d0Var = null;
                    }
                    d dVar = this.d;
                    if (dVar == null || dVar.f(this)) {
                        this.f6568m.j(c());
                    }
                    this.B = 6;
                    if (d0Var != null) {
                        this.t.getClass();
                        r.f(d0Var);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.c
    public final void d() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str) {
        StringBuilder w = ai.onnxruntime.a.w(str, " this: ");
        w.append(this.f6559a);
        Log.v("GlideRequest", w.toString());
    }

    public final void f(z zVar, int i10) {
        Drawable drawable;
        this.f6560b.a();
        synchronized (this.c) {
            try {
                zVar.getClass();
                int i11 = this.f6561f.f624i;
                if (i11 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f6562g + "] with dimensions [" + this.f6576x + "x" + this.f6577y + "]", zVar);
                    if (i11 <= 4) {
                        zVar.d();
                    }
                }
                this.r = null;
                this.B = 5;
                d dVar = this.d;
                if (dVar != null) {
                    dVar.b(this);
                }
                boolean z9 = true;
                this.f6578z = true;
                try {
                    List list = this.f6569n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                d dVar2 = this.d;
                                if (dVar2 != null) {
                                    dVar2.getRoot().a();
                                    throw null;
                                }
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    d dVar3 = this.d;
                    if (dVar3 != null && !dVar3.g(this)) {
                        z9 = false;
                    }
                    if (this.f6562g == null) {
                        if (this.w == null) {
                            this.f6564i.getClass();
                            this.w = null;
                        }
                        drawable = this.w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f6574u == null) {
                            a aVar = this.f6564i;
                            aVar.getClass();
                            this.f6574u = null;
                            int i12 = aVar.e;
                            if (i12 > 0) {
                                Context context = this.e;
                                this.f6564i.getClass();
                                this.f6574u = com.bumptech.glide.c.m(context, context, i12, context.getTheme());
                            }
                        }
                        drawable = this.f6574u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f6568m.d(drawable);
                } finally {
                    this.f6578z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(d0 d0Var, int i10) {
        Object obj;
        String str;
        this.f6560b.a();
        d0 d0Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (d0Var == null) {
                        f(new z("Expected to receive a Resource<R> with an object of " + this.f6563h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = d0Var.get();
                    try {
                        if (obj2 != null && this.f6563h.isAssignableFrom(obj2.getClass())) {
                            d dVar = this.d;
                            if (dVar != null && !dVar.e(this)) {
                                this.f6572q = null;
                                this.B = 4;
                                this.t.getClass();
                                r.f(d0Var);
                            }
                            l(d0Var, obj2, i10);
                            return;
                        }
                        this.f6572q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f6563h);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(d0Var);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        f(new z(sb.toString()), 5);
                        this.t.getClass();
                        r.f(d0Var);
                    } catch (Throwable th) {
                        d0Var2 = d0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (d0Var2 != null) {
                this.t.getClass();
                r.f(d0Var2);
            }
            throw th3;
        }
    }

    @Override // y.c
    public final boolean h() {
        boolean z9;
        synchronized (this.c) {
            if (this.B == 6) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001a, B:10:0x0024, B:11:0x0030, B:13:0x0034, B:14:0x003c, B:17:0x0041, B:18:0x004b, B:21:0x004d, B:25:0x0055, B:26:0x005a, B:28:0x005c, B:31:0x0078, B:33:0x0084, B:34:0x0091, B:37:0x00b0, B:39:0x00b4, B:40:0x00ce, B:42:0x0097, B:44:0x009b, B:49:0x00a7, B:51:0x008c, B:52:0x0061, B:53:0x0065, B:55:0x006b, B:59:0x0072, B:60:0x0077, B:62:0x00d0, B:63:0x00d7, B:64:0x00d8, B:65:0x00df), top: B:3:0x0003 }] */
    @Override // y.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.f.i():void");
    }

    @Override // y.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.c) {
            int i10 = this.B;
            if (i10 != 2 && i10 != 3) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // y.c
    public final boolean j() {
        boolean z9;
        synchronized (this.c) {
            if (this.B == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // y.c
    public final boolean k(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.h hVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.h hVar2;
        int i15;
        boolean equals;
        boolean f8;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i10 = this.f6565j;
                i11 = this.f6566k;
                obj = this.f6562g;
                cls = this.f6563h;
                aVar = this.f6564i;
                hVar = this.f6567l;
                List list = this.f6569n;
                if (list != null) {
                    i12 = list.size();
                } else {
                    i12 = 0;
                }
            } finally {
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.c) {
            try {
                i13 = fVar.f6565j;
                i14 = fVar.f6566k;
                obj2 = fVar.f6562g;
                cls2 = fVar.f6563h;
                aVar2 = fVar.f6564i;
                hVar2 = fVar.f6567l;
                List list2 = fVar.f6569n;
                if (list2 != null) {
                    i15 = list2.size();
                } else {
                    i15 = 0;
                }
            } finally {
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = p.f446a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (aVar == null) {
                    if (aVar2 == null) {
                        f8 = true;
                    } else {
                        f8 = false;
                    }
                } else {
                    f8 = aVar.f(aVar2);
                }
                if (f8 && hVar == hVar2 && i12 == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l(d0 d0Var, Object obj, int i10) {
        d dVar = this.d;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.B = 4;
        this.f6572q = d0Var;
        if (this.f6561f.f624i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + q.y(i10) + " for " + this.f6562g + " with size [" + this.f6576x + "x" + this.f6577y + "] in " + j.a(this.f6573s) + " ms");
        }
        if (dVar != null) {
            dVar.c(this);
        }
        this.f6578z = true;
        try {
            List list = this.f6569n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            this.f6570o.getClass();
            this.f6568m.b(obj);
            this.f6578z = false;
        } catch (Throwable th) {
            this.f6578z = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i10, int i11) {
        int round;
        f fVar = this;
        int i12 = i10;
        fVar.f6560b.a();
        Object obj = fVar.c;
        synchronized (obj) {
            try {
                try {
                    boolean z9 = C;
                    if (z9) {
                        fVar.e("Got onSizeReady in " + j.a(fVar.f6573s));
                    }
                    if (fVar.B == 3) {
                        fVar.B = 2;
                        fVar.f6564i.getClass();
                        if (i12 != Integer.MIN_VALUE) {
                            i12 = Math.round(i12 * 1.0f);
                        }
                        fVar.f6576x = i12;
                        if (i11 == Integer.MIN_VALUE) {
                            round = i11;
                        } else {
                            round = Math.round(1.0f * i11);
                        }
                        fVar.f6577y = round;
                        if (z9) {
                            fVar.e("finished setup for calling load in " + j.a(fVar.f6573s));
                        }
                        r rVar = fVar.t;
                        com.bumptech.glide.e eVar = fVar.f6561f;
                        Object obj2 = fVar.f6562g;
                        a aVar = fVar.f6564i;
                        h.e eVar2 = aVar.f6548j;
                        try {
                            int i13 = fVar.f6576x;
                            int i14 = fVar.f6577y;
                            Class cls = aVar.f6552n;
                            try {
                                Class cls2 = fVar.f6563h;
                                com.bumptech.glide.h hVar = fVar.f6567l;
                                m mVar = aVar.c;
                                try {
                                    c0.c cVar = aVar.f6551m;
                                    boolean z10 = aVar.f6549k;
                                    boolean z11 = aVar.f6555q;
                                    try {
                                        h.h hVar2 = aVar.f6550l;
                                        boolean z12 = aVar.f6545g;
                                        boolean z13 = aVar.r;
                                        c0.f fVar2 = fVar.f6571p;
                                        fVar = obj;
                                        try {
                                            fVar.r = rVar.a(eVar, obj2, eVar2, i13, i14, cls, cls2, hVar, mVar, cVar, z10, z11, hVar2, z12, z13, fVar, fVar2);
                                            if (fVar.B != 2) {
                                                fVar.r = null;
                                            }
                                            if (z9) {
                                                fVar.e("finished onSizeReady in " + j.a(fVar.f6573s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                fVar = obj;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.f6562g;
            cls = this.f6563h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
