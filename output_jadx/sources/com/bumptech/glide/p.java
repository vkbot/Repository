package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.manager.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements ComponentCallbacks2, com.bumptech.glide.manager.i {

    /* renamed from: l, reason: collision with root package name */
    public static final y.e f682l;

    /* renamed from: b, reason: collision with root package name */
    public final b f683b;
    public final Context c;
    public final com.bumptech.glide.manager.h d;
    public final t e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.n f684f;

    /* renamed from: g, reason: collision with root package name */
    public final u f685g;

    /* renamed from: h, reason: collision with root package name */
    public final m f686h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f687i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f688j;

    /* renamed from: k, reason: collision with root package name */
    public final y.e f689k;

    static {
        y.e eVar = (y.e) new y.a().c(Bitmap.class);
        eVar.f6553o = true;
        f682l = eVar;
        ((y.e) new y.a().c(u.b.class)).f6553o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bumptech.glide.manager.i, com.bumptech.glide.manager.b] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.bumptech.glide.manager.h] */
    /* JADX WARN: Type inference failed for: r8v10, types: [y.e, y.a] */
    public p(b bVar, com.bumptech.glide.manager.h hVar, com.bumptech.glide.manager.n nVar, Context context) {
        boolean z9;
        ?? r02;
        y.e eVar;
        String str;
        t tVar = new t(2);
        c5.e eVar2 = bVar.f613g;
        this.f685g = new u();
        m mVar = new m(0, this);
        this.f686h = mVar;
        this.f683b = bVar;
        this.d = hVar;
        this.f684f = nVar;
        this.e = tVar;
        this.c = context;
        Context applicationContext = context.getApplicationContext();
        o oVar = new o(this, tVar);
        eVar2.getClass();
        if (ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z9) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z9) {
            r02 = new com.bumptech.glide.manager.c(applicationContext, oVar);
        } else {
            r02 = new Object();
        }
        this.f687i = r02;
        synchronized (bVar.f614h) {
            if (!bVar.f614h.contains(this)) {
                bVar.f614h.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = c0.p.f446a;
        if ((Looper.myLooper() == Looper.getMainLooper() ? 1 : 0) == 0) {
            c0.p.f().post(mVar);
        } else {
            hVar.a(this);
        }
        hVar.a(r02);
        this.f688j = new CopyOnWriteArrayList(bVar.d.e);
        e eVar3 = bVar.d;
        synchronized (eVar3) {
            try {
                if (eVar3.f625j == null) {
                    eVar3.d.getClass();
                    ?? aVar = new y.a();
                    aVar.f6553o = true;
                    eVar3.f625j = aVar;
                }
                eVar = eVar3.f625j;
            } finally {
            }
        }
        synchronized (this) {
            y.e eVar4 = (y.e) eVar.clone();
            if (eVar4.f6553o && !eVar4.f6554p) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.f6554p = true;
            eVar4.f6553o = true;
            this.f689k = eVar4;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void c() {
        int i10;
        this.f685g.c();
        synchronized (this) {
            try {
                ArrayList e = c0.p.e(this.f685g.f678b);
                int size = e.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = e.get(i11);
                    i11++;
                    k((z.d) obj);
                }
                this.f685g.f678b.clear();
            } finally {
            }
        }
        t tVar = this.e;
        ArrayList e6 = c0.p.e((Set) tVar.d);
        int size2 = e6.size();
        while (i10 < size2) {
            Object obj2 = e6.get(i10);
            i10++;
            tVar.b((y.c) obj2);
        }
        ((HashSet) tVar.e).clear();
        this.d.b(this);
        this.d.b(this.f687i);
        c0.p.f().removeCallbacks(this.f686h);
        b bVar = this.f683b;
        synchronized (bVar.f614h) {
            if (bVar.f614h.contains(this)) {
                bVar.f614h.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void e() {
        this.f685g.e();
        l();
    }

    public final void k(z.d dVar) {
        if (dVar != null) {
            boolean n10 = n(dVar);
            y.c i10 = dVar.i();
            if (!n10) {
                b bVar = this.f683b;
                synchronized (bVar.f614h) {
                    try {
                        ArrayList arrayList = bVar.f614h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            if (((p) obj).n(dVar)) {
                                return;
                            }
                        }
                        if (i10 != null) {
                            dVar.h(null);
                            i10.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final synchronized void l() {
        t tVar = this.e;
        tVar.c = true;
        ArrayList e = c0.p.e((Set) tVar.d);
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            y.c cVar = (y.c) obj;
            if (cVar.isRunning()) {
                cVar.d();
                ((HashSet) tVar.e).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        t tVar = this.e;
        int i10 = 0;
        tVar.c = false;
        ArrayList e = c0.p.e((Set) tVar.d);
        int size = e.size();
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            y.c cVar = (y.c) obj;
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) tVar.e).clear();
    }

    public final synchronized boolean n(z.d dVar) {
        y.c i10 = dVar.i();
        if (i10 == null) {
            return true;
        }
        if (this.e.b(i10)) {
            this.f685g.f678b.remove(dVar);
            dVar.h(null);
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onStart() {
        m();
        this.f685g.onStart();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.e + ", treeNode=" + this.f684f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }
}
