package j;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f3049h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.f f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.c f3051b;
    public final l.f c;
    public final q d;
    public final d6.d e;

    /* renamed from: f, reason: collision with root package name */
    public final o f3052f;

    /* renamed from: g, reason: collision with root package name */
    public final b1.m f3053g;

    /* JADX WARN: Type inference failed for: r11v5, types: [d6.d, java.lang.Object] */
    public r(l.f fVar, r5.c cVar, m.e eVar, m.e eVar2, m.e eVar3, m.e eVar4) {
        this.c = fVar;
        c0.h hVar = new c0.h(cVar);
        b1.m mVar = new b1.m(6);
        this.f3053g = mVar;
        synchronized (this) {
            try {
                try {
                    synchronized (mVar) {
                        try {
                            mVar.f305f = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                    }
                    this.f3051b = new w7.c(11);
                    this.f3050a = new com.bumptech.glide.f(2);
                    this.d = new q(eVar, eVar2, eVar3, eVar4, this, this);
                    this.f3052f = new o(hVar);
                    ?? obj = new Object();
                    obj.f1843b = new Handler(Looper.getMainLooper(), new b4.c(1));
                    this.e = obj;
                    fVar.d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void c(String str, long j10, w wVar) {
        StringBuilder w = ai.onnxruntime.a.w(str, " in ");
        w.append(c0.j.a(j10));
        w.append("ms, key: ");
        w.append(wVar);
        Log.v("Engine", w.toString());
    }

    public static void f(d0 d0Var) {
        if (d0Var instanceof x) {
            ((x) d0Var).c();
        } else {
            j1.i.k("Cannot release anything but an EngineResource");
        }
    }

    public final a5.h a(com.bumptech.glide.e eVar, Object obj, h.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, m mVar, c0.c cVar, boolean z9, boolean z10, h.h hVar2, boolean z11, boolean z12, y.f fVar, c0.f fVar2) {
        long j10;
        if (f3049h) {
            int i12 = c0.j.f437b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        this.f3051b.getClass();
        w wVar = new w(obj, eVar2, i10, i11, cVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                x b10 = b(wVar, z11, j10);
                if (b10 == null) {
                    return g(eVar, obj, eVar2, i10, i11, cls, cls2, hVar, mVar, cVar, z9, z10, hVar2, z11, z12, fVar, fVar2, wVar, j10);
                }
                fVar.g(b10, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final x b(w wVar, boolean z9, long j10) {
        Throwable th;
        x xVar;
        Object obj;
        r rVar;
        w wVar2;
        x xVar2;
        if (z9) {
            b1.m mVar = this.f3053g;
            synchronized (mVar) {
                try {
                    b bVar = (b) ((HashMap) mVar.d).get(wVar);
                    if (bVar == null) {
                        xVar = null;
                    } else {
                        xVar = (x) bVar.get();
                        if (xVar == null) {
                            try {
                                mVar.b(bVar);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                                throw th;
                            }
                        }
                    }
                    if (xVar != null) {
                        xVar.a();
                    }
                    if (xVar != null) {
                        if (f3049h) {
                            c("Loaded resource from active resources", j10, wVar);
                        }
                        return xVar;
                    }
                    l.f fVar = this.c;
                    synchronized (fVar) {
                        try {
                            c0.k kVar = (c0.k) fVar.f440a.remove(wVar);
                            if (kVar == null) {
                                obj = null;
                            } else {
                                fVar.c -= kVar.f439b;
                                obj = kVar.f438a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            throw th;
                        }
                    }
                    d0 d0Var = (d0) obj;
                    if (d0Var == null) {
                        rVar = this;
                        wVar2 = wVar;
                        xVar2 = null;
                    } else if (d0Var instanceof x) {
                        xVar2 = (x) d0Var;
                        rVar = this;
                        wVar2 = wVar;
                    } else {
                        rVar = this;
                        wVar2 = wVar;
                        xVar2 = new x(d0Var, true, true, wVar2, rVar);
                    }
                    if (xVar2 != null) {
                        xVar2.a();
                        rVar.f3053g.a(wVar2, xVar2);
                    }
                    if (xVar2 != null) {
                        if (f3049h) {
                            c("Loaded resource from cache", j10, wVar2);
                        }
                        return xVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    public final synchronized void d(v vVar, h.e eVar, x xVar) {
        if (xVar != null) {
            try {
                if (xVar.f3080b) {
                    this.f3053g.a(eVar, xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.bumptech.glide.f fVar = this.f3050a;
        fVar.getClass();
        vVar.getClass();
        HashMap hashMap = fVar.f626a;
        if (vVar.equals(hashMap.get(eVar))) {
            hashMap.remove(eVar);
        }
    }

    public final void e(h.e eVar, x xVar) {
        b1.m mVar = this.f3053g;
        synchronized (mVar) {
            b bVar = (b) ((HashMap) mVar.d).remove(eVar);
            if (bVar != null) {
                bVar.c = null;
                bVar.clear();
            }
        }
        if (xVar.f3080b) {
        } else {
            this.e.b(xVar, false);
        }
    }

    public final a5.h g(com.bumptech.glide.e eVar, Object obj, h.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, m mVar, Map map, boolean z9, boolean z10, h.h hVar2, boolean z11, boolean z12, y.f fVar, Executor executor, w wVar, long j10) {
        m.e eVar3;
        v vVar = (v) this.f3050a.f626a.get(wVar);
        if (vVar != null) {
            vVar.a(fVar, executor);
            if (f3049h) {
                c("Added to existing load", j10, wVar);
            }
            return new a5.h(this, fVar, vVar);
        }
        v vVar2 = (v) this.d.f3048g.acquire();
        synchronized (vVar2) {
            vVar2.f3065l = wVar;
            vVar2.f3066m = z11;
            vVar2.f3067n = z12;
        }
        o oVar = this.f3052f;
        k kVar = (k) oVar.f3043b.acquire();
        int i12 = oVar.c;
        oVar.c = i12 + 1;
        h hVar3 = kVar.f3018b;
        c0.h hVar4 = kVar.e;
        hVar3.c = eVar;
        hVar3.d = obj;
        hVar3.f3011n = eVar2;
        hVar3.e = i10;
        hVar3.f3003f = i11;
        hVar3.f3013p = mVar;
        hVar3.f3004g = cls;
        hVar3.f3005h = hVar4;
        hVar3.f3008k = cls2;
        hVar3.f3012o = hVar;
        hVar3.f3006i = hVar2;
        hVar3.f3007j = map;
        hVar3.f3014q = z9;
        hVar3.r = z10;
        kVar.f3022i = eVar;
        kVar.f3023j = eVar2;
        kVar.f3024k = hVar;
        kVar.f3025l = wVar;
        kVar.f3026m = i10;
        kVar.f3027n = i11;
        kVar.f3028o = mVar;
        kVar.f3029p = hVar2;
        kVar.f3030q = vVar2;
        kVar.r = i12;
        kVar.E = 1;
        kVar.t = obj;
        com.bumptech.glide.f fVar2 = this.f3050a;
        fVar2.getClass();
        fVar2.f626a.put(wVar, vVar2);
        vVar2.a(fVar, executor);
        synchronized (vVar2) {
            vVar2.f3072u = kVar;
            int h2 = kVar.h(1);
            if (h2 != 2 && h2 != 3) {
                eVar3 = vVar2.f3067n ? vVar2.f3063j : vVar2.f3062i;
                eVar3.execute(kVar);
            }
            eVar3 = vVar2.f3061h;
            eVar3.execute(kVar);
        }
        if (f3049h) {
            c("Started new load", j10, wVar);
        }
        return new a5.h(this, fVar, vVar2);
    }
}
