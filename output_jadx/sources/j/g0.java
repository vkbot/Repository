package j;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g0 implements g, f {

    /* renamed from: b, reason: collision with root package name */
    public final h f2997b;
    public final k c;
    public volatile int d;
    public volatile d e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2998f;

    /* renamed from: g, reason: collision with root package name */
    public volatile n.q f2999g;

    /* renamed from: h, reason: collision with root package name */
    public volatile e f3000h;

    public g0(h hVar, k kVar) {
        this.f2997b = hVar;
        this.c = kVar;
    }

    @Override // j.f
    public final void a(h.e eVar, Object obj, com.bumptech.glide.load.data.e eVar2, int i10, h.e eVar3) {
        this.c.a(eVar, obj, eVar2, this.f2999g.c.c(), eVar);
    }

    @Override // j.f
    public final void b(h.e eVar, Exception exc, com.bumptech.glide.load.data.e eVar2, int i10) {
        this.c.b(eVar, exc, eVar2, this.f2999g.c.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // j.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2998f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r6.f2998f
            r6.f2998f = r1
            boolean r0 = r6.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            j.d r0 = r6.e
            if (r0 == 0) goto L2d
            j.d r0 = r6.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r6.e = r1
            r6.f2999g = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L92
            int r1 = r6.d
            j.h r3 = r6.f2997b
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L92
            j.h r1 = r6.f2997b
            java.util.ArrayList r1 = r1.b()
            int r3 = r6.d
            int r4 = r3 + 1
            r6.d = r4
            java.lang.Object r1 = r1.get(r3)
            n.q r1 = (n.q) r1
            r6.f2999g = r1
            n.q r1 = r6.f2999g
            if (r1 == 0) goto L32
            j.h r1 = r6.f2997b
            j.m r1 = r1.f3013p
            n.q r3 = r6.f2999g
            com.bumptech.glide.load.data.e r3 = r3.c
            int r3 = r3.c()
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L7c
            j.h r1 = r6.f2997b
            n.q r3 = r6.f2999g
            com.bumptech.glide.load.data.e r3 = r3.c
            java.lang.Class r3 = r3.a()
            j.b0 r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            n.q r0 = r6.f2999g
            n.q r1 = r6.f2999g
            com.bumptech.glide.load.data.e r1 = r1.c
            j.h r3 = r6.f2997b
            com.bumptech.glide.h r3 = r3.f3012o
            android.support.v4.media.h r4 = new android.support.v4.media.h
            r5 = 22
            r4.<init>(r5, r6, r0)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g0.c():boolean");
    }

    @Override // j.g
    public final void cancel() {
        n.q qVar = this.f2999g;
        if (qVar != null) {
            qVar.c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i10 = c0.j.f437b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z9 = false;
        try {
            com.bumptech.glide.load.data.g g10 = this.f2997b.c.a().g(obj);
            Object d = g10.d();
            h.b d10 = this.f2997b.d(d);
            a5.h hVar = new a5.h(d10, d, this.f2997b.f3006i, 12);
            h.e eVar = this.f2999g.f4031a;
            h hVar2 = this.f2997b;
            e eVar2 = new e(eVar, hVar2.f3011n);
            l.a a10 = hVar2.f3005h.a();
            a10.b(eVar2, hVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar2 + ", data: " + obj + ", encoder: " + d10 + ", duration: " + c0.j.a(elapsedRealtimeNanos));
            }
            if (a10.c(eVar2) != null) {
                this.f3000h = eVar2;
                this.e = new d(Collections.singletonList(this.f2999g.f4031a), this.f2997b, this);
                this.f2999g.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f3000h + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.c.a(this.f2999g.f4031a, g10.d(), this.f2999g.c, this.f2999g.c.c(), this.f2999g.f4031a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z9 = true;
                if (!z9) {
                    this.f2999g.c.b();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
