package j;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v implements d0.e {
    public static final p2.e w = new p2.e(11);
    public final r d;
    public final Pools.Pool e;

    /* renamed from: g, reason: collision with root package name */
    public final r f3060g;

    /* renamed from: h, reason: collision with root package name */
    public final m.e f3061h;

    /* renamed from: i, reason: collision with root package name */
    public final m.e f3062i;

    /* renamed from: j, reason: collision with root package name */
    public final m.e f3063j;

    /* renamed from: l, reason: collision with root package name */
    public w f3065l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3066m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3067n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f3068o;

    /* renamed from: p, reason: collision with root package name */
    public int f3069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3070q;
    public z r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3071s;
    public x t;

    /* renamed from: u, reason: collision with root package name */
    public k f3072u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f3073v;

    /* renamed from: b, reason: collision with root package name */
    public final u f3058b = new u(new ArrayList(2));
    public final d0.h c = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3064k = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final p2.e f3059f = w;

    /* JADX WARN: Type inference failed for: r5v2, types: [d0.h, java.lang.Object] */
    public v(m.e eVar, m.e eVar2, m.e eVar3, m.e eVar4, r rVar, r rVar2, d0.d dVar) {
        this.f3061h = eVar;
        this.f3062i = eVar2;
        this.f3063j = eVar4;
        this.f3060g = rVar;
        this.d = rVar2;
        this.e = dVar;
    }

    public final synchronized void a(y.f fVar, Executor executor) {
        try {
            this.c.a();
            this.f3058b.f3057b.add(new t(fVar, executor));
            if (this.f3070q) {
                d(1);
                executor.execute(new s(this, fVar, 1));
            } else if (this.f3071s) {
                d(1);
                executor.execute(new s(this, fVar, 0));
            } else {
                c0.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f3073v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        boolean z9;
        x xVar;
        synchronized (this) {
            try {
                this.c.a();
                c0.g.a("Not yet complete!", e());
                int decrementAndGet = this.f3064k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0.g.a("Can't decrement below 0", z9);
                if (decrementAndGet == 0) {
                    xVar = this.t;
                    f();
                } else {
                    xVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.c();
        }
    }

    @Override // d0.e
    public final d0.h c() {
        return this.c;
    }

    public final synchronized void d(int i10) {
        x xVar;
        c0.g.a("Not yet complete!", e());
        if (this.f3064k.getAndAdd(i10) == 0 && (xVar = this.t) != null) {
            xVar.a();
        }
    }

    public final boolean e() {
        if (!this.f3071s && !this.f3070q && !this.f3073v) {
            return false;
        }
        return true;
    }

    public final synchronized void f() {
        boolean a10;
        if (this.f3065l != null) {
            this.f3058b.f3057b.clear();
            this.f3065l = null;
            this.t = null;
            this.f3068o = null;
            this.f3071s = false;
            this.f3073v = false;
            this.f3070q = false;
            k kVar = this.f3072u;
            j jVar = kVar.f3021h;
            synchronized (jVar) {
                jVar.f3016a = true;
                a10 = jVar.a();
            }
            if (a10) {
                kVar.k();
            }
            this.f3072u = null;
            this.r = null;
            this.f3069p = 0;
            this.e.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(y.f fVar) {
        try {
            this.c.a();
            this.f3058b.f3057b.remove(new t(fVar, c0.g.f434b));
            if (this.f3058b.f3057b.isEmpty()) {
                if (!e()) {
                    this.f3073v = true;
                    k kVar = this.f3072u;
                    kVar.B = true;
                    g gVar = kVar.f3036z;
                    if (gVar != null) {
                        gVar.cancel();
                    }
                    r rVar = this.f3060g;
                    w wVar = this.f3065l;
                    synchronized (rVar) {
                        com.bumptech.glide.f fVar2 = rVar.f3050a;
                        fVar2.getClass();
                        HashMap hashMap = fVar2.f626a;
                        if (equals(hashMap.get(wVar))) {
                            hashMap.remove(wVar);
                        }
                    }
                }
                if (!this.f3070q) {
                    if (this.f3071s) {
                    }
                }
                if (this.f3064k.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
