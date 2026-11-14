package j;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements f, Runnable, Comparable, d0.e {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public final c0.h e;

    /* renamed from: f, reason: collision with root package name */
    public final Pools.Pool f3019f;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.e f3022i;

    /* renamed from: j, reason: collision with root package name */
    public h.e f3023j;

    /* renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.h f3024k;

    /* renamed from: l, reason: collision with root package name */
    public w f3025l;

    /* renamed from: m, reason: collision with root package name */
    public int f3026m;

    /* renamed from: n, reason: collision with root package name */
    public int f3027n;

    /* renamed from: o, reason: collision with root package name */
    public m f3028o;

    /* renamed from: p, reason: collision with root package name */
    public h.h f3029p;

    /* renamed from: q, reason: collision with root package name */
    public v f3030q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public long f3031s;
    public Object t;

    /* renamed from: u, reason: collision with root package name */
    public Thread f3032u;

    /* renamed from: v, reason: collision with root package name */
    public h.e f3033v;
    public h.e w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3034x;

    /* renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f3035y;

    /* renamed from: z, reason: collision with root package name */
    public volatile g f3036z;

    /* renamed from: b, reason: collision with root package name */
    public final h f3018b = new h();
    public final ArrayList c = new ArrayList();
    public final d0.h d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final a5.h f3020g = new a5.h(13);

    /* renamed from: h, reason: collision with root package name */
    public final j f3021h = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [d0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [j.j, java.lang.Object] */
    public k(c0.h hVar, d0.d dVar) {
        this.e = hVar;
        this.f3019f = dVar;
    }

    @Override // j.f
    public final void a(h.e eVar, Object obj, com.bumptech.glide.load.data.e eVar2, int i10, h.e eVar3) {
        this.f3033v = eVar;
        this.f3034x = obj;
        this.f3035y = eVar2;
        this.F = i10;
        this.w = eVar3;
        boolean z9 = false;
        if (eVar != this.f3018b.a().get(0)) {
            z9 = true;
        }
        this.C = z9;
        if (Thread.currentThread() != this.f3032u) {
            l(3);
        } else {
            f();
        }
    }

    @Override // j.f
    public final void b(h.e eVar, Exception exc, com.bumptech.glide.load.data.e eVar2, int i10) {
        eVar2.b();
        z zVar = new z("Fetching data failed", Collections.singletonList(exc));
        Class a10 = eVar2.a();
        zVar.c = eVar;
        zVar.d = i10;
        zVar.e = a10;
        this.c.add(zVar);
        if (Thread.currentThread() != this.f3032u) {
            l(2);
        } else {
            m();
        }
    }

    @Override // d0.e
    public final d0.h c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int ordinal = this.f3024k.ordinal() - kVar.f3024k.ordinal();
        if (ordinal == 0) {
            return this.r - kVar.r;
        }
        return ordinal;
    }

    public final d0 d(com.bumptech.glide.load.data.e eVar, Object obj, int i10) {
        if (obj == null) {
            return null;
        }
        try {
            int i11 = c0.j.f437b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            d0 e = e(i10, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(elapsedRealtimeNanos, "Decoded result " + e, null);
            }
            return e;
        } finally {
            eVar.b();
        }
    }

    public final d0 e(int i10, Object obj) {
        boolean z9;
        Class<?> cls = obj.getClass();
        h hVar = this.f3018b;
        b0 c = hVar.c(cls);
        h.h hVar2 = this.f3029p;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 != 4 && !hVar.r) {
                z9 = false;
            } else {
                z9 = true;
            }
            h.g gVar = q.q.f5147i;
            Boolean bool = (Boolean) hVar2.c(gVar);
            if (bool == null || (bool.booleanValue() && !z9)) {
                hVar2 = new h.h();
                c0.c cVar = this.f3029p.f2525b;
                c0.c cVar2 = hVar2.f2525b;
                cVar2.putAll((SimpleArrayMap) cVar);
                cVar2.put(gVar, Boolean.valueOf(z9));
            }
        }
        h.h hVar3 = hVar2;
        com.bumptech.glide.load.data.g g10 = this.f3022i.a().g(obj);
        try {
            return c.a(this.f3026m, this.f3027n, g10, hVar3, new i(this, i10));
        } finally {
            g10.b();
        }
    }

    public final void f() {
        d0 d0Var;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.f3031s, "Retrieved data", "data: " + this.f3034x + ", cache key: " + this.f3033v + ", fetcher: " + this.f3035y);
        }
        c0 c0Var = null;
        try {
            d0Var = d(this.f3035y, this.f3034x, this.F);
        } catch (z e) {
            h.e eVar = this.w;
            int i10 = this.F;
            e.c = eVar;
            e.d = i10;
            e.e = null;
            this.c.add(e);
            d0Var = null;
        }
        if (d0Var != null) {
            int i11 = this.F;
            if (d0Var instanceof a0) {
                ((a0) d0Var).a();
            }
            boolean z9 = false;
            if (((c0) this.f3020g.e) != null) {
                c0Var = (c0) c0.f2975f.acquire();
                c0Var.e = false;
                c0Var.d = true;
                c0Var.c = d0Var;
                d0Var = c0Var;
            }
            o();
            v vVar = this.f3030q;
            synchronized (vVar) {
                vVar.f3068o = d0Var;
                vVar.f3069p = i11;
            }
            synchronized (vVar) {
                try {
                    vVar.c.a();
                    if (vVar.f3073v) {
                        vVar.f3068o.recycle();
                        vVar.f();
                    } else if (!vVar.f3058b.f3057b.isEmpty()) {
                        if (!vVar.f3070q) {
                            p2.e eVar2 = vVar.f3059f;
                            d0 d0Var2 = vVar.f3068o;
                            boolean z10 = vVar.f3066m;
                            w wVar = vVar.f3065l;
                            r rVar = vVar.d;
                            eVar2.getClass();
                            vVar.t = new x(d0Var2, z10, true, wVar, rVar);
                            vVar.f3070q = true;
                            u uVar = vVar.f3058b;
                            uVar.getClass();
                            ArrayList arrayList = new ArrayList(uVar.f3057b);
                            vVar.d(arrayList.size() + 1);
                            vVar.f3060g.d(vVar, vVar.f3065l, vVar.t);
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                t tVar = (t) obj;
                                tVar.f3056b.execute(new s(vVar, tVar.f3055a, 1));
                            }
                            vVar.b();
                        } else {
                            throw new IllegalStateException("Already have resource");
                        }
                    } else {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                } finally {
                }
            }
            this.D = 5;
            try {
                a5.h hVar = this.f3020g;
                if (((c0) hVar.e) != null) {
                    z9 = true;
                }
                if (z9) {
                    try {
                        this.e.a().b((h.e) hVar.c, new a5.h((h.k) hVar.d, (c0) hVar.e, this.f3029p, 12));
                        ((c0) hVar.e).a();
                    } catch (Throwable th) {
                        ((c0) hVar.e).a();
                        throw th;
                    }
                }
                j jVar = this.f3021h;
                synchronized (jVar) {
                    jVar.f3017b = true;
                    a10 = jVar.a();
                }
                if (a10) {
                    k();
                    return;
                }
                return;
            } finally {
                if (c0Var != null) {
                    c0Var.a();
                }
            }
        }
        m();
    }

    public final g g() {
        int c = com.bumptech.glide.g.c(this.D);
        h hVar = this.f3018b;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    if (c == 5) {
                        return null;
                    }
                    j1.i.l("Unrecognized stage: ".concat(com.google.protobuf.q.z(this.D)));
                    return null;
                }
                return new g0(hVar, this);
            }
            return new d(hVar.a(), hVar, this);
        }
        return new e0(hVar, this);
    }

    public final int h(int i10) {
        boolean z9;
        boolean z10;
        int c = com.bumptech.glide.g.c(i10);
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3 && c != 5) {
                        j1.i.k("Unrecognized stage: ".concat(com.google.protobuf.q.z(i10)));
                        return 0;
                    }
                    return 6;
                }
                return 4;
            }
            switch (this.f3028o.f3040a) {
                case 0:
                    z10 = false;
                    break;
                case 1:
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                return 3;
            }
            return h(3);
        }
        switch (this.f3028o.f3040a) {
            case 0:
            case 1:
                z9 = false;
                break;
            default:
                z9 = true;
                break;
        }
        if (z9) {
            return 2;
        }
        return h(2);
    }

    public final void i(long j10, String str, String str2) {
        String str3;
        StringBuilder w = ai.onnxruntime.a.w(str, " in ");
        w.append(c0.j.a(j10));
        w.append(", load key: ");
        w.append(this.f3025l);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        w.append(str3);
        w.append(", thread: ");
        w.append(Thread.currentThread().getName());
        Log.v("DecodeJob", w.toString());
    }

    public final void j() {
        boolean a10;
        o();
        z zVar = new z("Failed to load resource", new ArrayList(this.c));
        v vVar = this.f3030q;
        synchronized (vVar) {
            vVar.r = zVar;
        }
        synchronized (vVar) {
            try {
                vVar.c.a();
                if (vVar.f3073v) {
                    vVar.f();
                } else if (!vVar.f3058b.f3057b.isEmpty()) {
                    if (!vVar.f3071s) {
                        vVar.f3071s = true;
                        w wVar = vVar.f3065l;
                        u uVar = vVar.f3058b;
                        uVar.getClass();
                        ArrayList arrayList = new ArrayList(uVar.f3057b);
                        vVar.d(arrayList.size() + 1);
                        vVar.f3060g.d(vVar, wVar, null);
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            t tVar = (t) obj;
                            tVar.f3056b.execute(new s(vVar, tVar.f3055a, 0));
                        }
                        vVar.b();
                    } else {
                        throw new IllegalStateException("Already failed once");
                    }
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } finally {
            }
        }
        j jVar = this.f3021h;
        synchronized (jVar) {
            jVar.c = true;
            a10 = jVar.a();
        }
        if (a10) {
            k();
        }
    }

    public final void k() {
        j jVar = this.f3021h;
        synchronized (jVar) {
            jVar.f3017b = false;
            jVar.f3016a = false;
            jVar.c = false;
        }
        a5.h hVar = this.f3020g;
        hVar.c = null;
        hVar.d = null;
        hVar.e = null;
        h hVar2 = this.f3018b;
        hVar2.c = null;
        hVar2.d = null;
        hVar2.f3011n = null;
        hVar2.f3004g = null;
        hVar2.f3008k = null;
        hVar2.f3006i = null;
        hVar2.f3012o = null;
        hVar2.f3007j = null;
        hVar2.f3013p = null;
        hVar2.f3001a.clear();
        hVar2.f3009l = false;
        hVar2.f3002b.clear();
        hVar2.f3010m = false;
        this.A = false;
        this.f3022i = null;
        this.f3023j = null;
        this.f3029p = null;
        this.f3024k = null;
        this.f3025l = null;
        this.f3030q = null;
        this.D = 0;
        this.f3036z = null;
        this.f3032u = null;
        this.f3033v = null;
        this.f3034x = null;
        this.F = 0;
        this.f3035y = null;
        this.f3031s = 0L;
        this.B = false;
        this.t = null;
        this.c.clear();
        this.f3019f.release(this);
    }

    public final void l(int i10) {
        m.e eVar;
        this.E = i10;
        v vVar = this.f3030q;
        if (vVar.f3067n) {
            eVar = vVar.f3063j;
        } else {
            eVar = vVar.f3062i;
        }
        eVar.execute(this);
    }

    public final void m() {
        this.f3032u = Thread.currentThread();
        int i10 = c0.j.f437b;
        this.f3031s = SystemClock.elapsedRealtimeNanos();
        boolean z9 = false;
        while (!this.B && this.f3036z != null && !(z9 = this.f3036z.c())) {
            this.D = h(this.D);
            this.f3036z = g();
            if (this.D == 4) {
                l(2);
                return;
            }
        }
        if ((this.D == 6 || this.B) && !z9) {
            j();
        }
    }

    public final void n() {
        String str;
        int c = com.bumptech.glide.g.c(this.E);
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    f();
                    return;
                }
                int i10 = this.E;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            str = "null";
                        } else {
                            str = "DECODE_DATA";
                        }
                    } else {
                        str = "SWITCH_TO_SOURCE_SERVICE";
                    }
                } else {
                    str = "INITIALIZE";
                }
                j1.i.l("Unrecognized run reason: ".concat(str));
                return;
            }
            m();
            return;
        }
        this.D = h(1);
        this.f3036z = g();
        m();
    }

    public final void o() {
        Throwable th;
        this.d.a();
        if (this.A) {
            if (this.c.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.c;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.A = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f3035y;
        try {
            try {
                if (this.B) {
                    j();
                    if (eVar != null) {
                        eVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (eVar != null) {
                    eVar.b();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.b();
                }
                throw th;
            }
        } catch (c e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.B + ", stage: " + com.google.protobuf.q.z(this.D), th2);
            }
            if (this.D != 5) {
                this.c.add(th2);
                j();
            }
            if (!this.B) {
                throw th2;
            }
            throw th2;
        }
    }
}
