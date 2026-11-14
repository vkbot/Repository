package u;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import b4.k;
import com.bumptech.glide.l;
import com.bumptech.glide.p;
import j.m;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g.d f5848a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5849b;
    public final ArrayList c;
    public final p d;
    public final k.b e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5850f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5851g;

    /* renamed from: h, reason: collision with root package name */
    public l f5852h;

    /* renamed from: i, reason: collision with root package name */
    public d f5853i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5854j;

    /* renamed from: k, reason: collision with root package name */
    public d f5855k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f5856l;

    /* renamed from: m, reason: collision with root package name */
    public d f5857m;

    /* renamed from: n, reason: collision with root package name */
    public int f5858n;

    /* renamed from: o, reason: collision with root package name */
    public int f5859o;

    /* renamed from: p, reason: collision with root package name */
    public int f5860p;

    public f(com.bumptech.glide.b bVar, g.d dVar, int i10, int i11, Bitmap bitmap) {
        k.b bVar2 = bVar.f611b;
        com.bumptech.glide.e eVar = bVar.d;
        Context baseContext = eVar.getBaseContext();
        c0.g.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        p b10 = com.bumptech.glide.b.a(baseContext).f612f.b(baseContext);
        Context baseContext2 = eVar.getBaseContext();
        c0.g.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        p b11 = com.bumptech.glide.b.a(baseContext2).f612f.b(baseContext2);
        b11.getClass();
        l a10 = new l(b11.f683b, b11, Bitmap.class, b11.c).a(p.f682l).a(((y.e) ((y.e) ((y.e) new y.a().d(m.f3039b)).s()).o()).i(i10, i11));
        this.c = new ArrayList();
        this.d = b10;
        Handler handler = new Handler(Looper.getMainLooper(), new k(3, this));
        this.e = bVar2;
        this.f5849b = handler;
        this.f5852h = a10;
        this.f5848a = dVar;
        c(p.c.f4952b, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (this.f5850f && !this.f5851g) {
            d dVar = this.f5857m;
            if (dVar != null) {
                this.f5857m = null;
                b(dVar);
                return;
            }
            this.f5851g = true;
            g.d dVar2 = this.f5848a;
            g.b bVar = dVar2.f2408l;
            int i12 = bVar.c;
            if (i12 > 0 && (i11 = dVar2.f2407k) >= 0) {
                if (i11 >= 0 && i11 < i12) {
                    i10 = ((g.a) bVar.e.get(i11)).f2387i;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i10;
            int i13 = (dVar2.f2407k + 1) % dVar2.f2408l.c;
            dVar2.f2407k = i13;
            this.f5855k = new d(this.f5849b, i13, uptimeMillis);
            l z9 = this.f5852h.a((y.e) new y.a().n(new b0.b(Double.valueOf(Math.random())))).z(dVar2);
            z9.y(this.f5855k, z9);
        }
    }

    public final void b(d dVar) {
        int i10;
        this.f5851g = false;
        boolean z9 = this.f5854j;
        Handler handler = this.f5849b;
        if (z9) {
            handler.obtainMessage(2, dVar).sendToTarget();
            return;
        }
        if (!this.f5850f) {
            this.f5857m = dVar;
            return;
        }
        if (dVar.f5847h != null) {
            Bitmap bitmap = this.f5856l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.f5856l = null;
            }
            d dVar2 = this.f5853i;
            this.f5853i = dVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) ((e) arrayList.get(size));
                Object callback = bVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    bVar.stop();
                    bVar.invalidateSelf();
                } else {
                    bVar.invalidateSelf();
                    d dVar3 = ((f) bVar.f5835b.f5351b).f5853i;
                    if (dVar3 != null) {
                        i10 = dVar3.f5845f;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == r6.f5848a.f2408l.c - 1) {
                        bVar.f5837g++;
                    }
                    int i11 = bVar.f5838h;
                    if (i11 != -1 && bVar.f5837g >= i11) {
                        ArrayList arrayList2 = bVar.f5842l;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                ((Animatable2Compat.AnimationCallback) bVar.f5842l.get(i12)).onAnimationEnd(bVar);
                            }
                        }
                        bVar.stop();
                    }
                }
            }
            if (dVar2 != null) {
                handler.obtainMessage(2, dVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(h.l lVar, Bitmap bitmap) {
        c0.g.c(lVar, "Argument must not be null");
        c0.g.c(bitmap, "Argument must not be null");
        this.f5856l = bitmap;
        this.f5852h = this.f5852h.a(new y.a().p(lVar, true));
        this.f5858n = c0.p.c(bitmap);
        this.f5859o = bitmap.getWidth();
        this.f5860p = bitmap.getHeight();
    }
}
