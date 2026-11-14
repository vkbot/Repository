package l;

import android.util.Log;
import com.bumptech.glide.manager.s;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements a {
    public final File c;

    /* renamed from: f, reason: collision with root package name */
    public f.c f3482f;
    public final d e = new d(0);
    public final long d = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final j f3481b = new j();

    public e(File file) {
        this.c = file;
    }

    public final synchronized f.c a() {
        try {
            if (this.f3482f == null) {
                this.f3482f = f.c.e0(this.c, this.d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3482f;
    }

    @Override // l.a
    public final void b(h.e eVar, a5.h hVar) {
        b bVar;
        boolean z9;
        String a10 = this.f3481b.a(eVar);
        d dVar = this.e;
        synchronized (dVar) {
            bVar = (b) ((HashMap) dVar.c).get(a10);
            if (bVar == null) {
                c cVar = (c) dVar.d;
                synchronized (cVar.f3479a) {
                    bVar = (b) cVar.f3479a.poll();
                }
                if (bVar == null) {
                    bVar = new b();
                }
                ((HashMap) dVar.c).put(a10, bVar);
            }
            bVar.f3478b++;
        }
        bVar.f3477a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a10 + " for for Key: " + eVar);
            }
            try {
                f.c a11 = a();
                if (a11.c0(a10) == null) {
                    s S = a11.S(a10);
                    if (S != null) {
                        try {
                            if (((h.b) hVar.c).h(hVar.d, S.g(), (h.h) hVar.e)) {
                                f.c.b((f.c) S.e, S, true);
                                S.f675b = true;
                            }
                            if (!z9) {
                                try {
                                    S.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!S.f675b) {
                                try {
                                    S.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a10));
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.e.K(a10);
        }
    }

    @Override // l.a
    public final File c(h.e eVar) {
        String a10 = this.f3481b.a(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + eVar);
        }
        try {
            r5.c c02 = a().c0(a10);
            if (c02 != null) {
                return ((File[]) c02.c)[0];
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }
}
