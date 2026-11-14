package y;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import c0.p;
import com.bumptech.glide.h;
import h.l;
import j.m;
import j1.i;
import java.util.Map;
import q.o;
import q.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int f6543b;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f6544f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6549k;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6553o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6554p;
    public boolean r;
    public m c = m.d;
    public h d = h.d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6545g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f6546h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f6547i = -1;

    /* renamed from: j, reason: collision with root package name */
    public h.e f6548j = b0.a.f262b;

    /* renamed from: l, reason: collision with root package name */
    public h.h f6550l = new h.h();

    /* renamed from: m, reason: collision with root package name */
    public c0.c f6551m = new ArrayMap();

    /* renamed from: n, reason: collision with root package name */
    public Class f6552n = Object.class;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6555q = true;

    public static boolean g(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public a a(a aVar) {
        if (this.f6554p) {
            return clone().a(aVar);
        }
        int i10 = aVar.f6543b;
        if (g(aVar.f6543b, 1048576)) {
            this.r = aVar.r;
        }
        if (g(aVar.f6543b, 4)) {
            this.c = aVar.c;
        }
        if (g(aVar.f6543b, 8)) {
            this.d = aVar.d;
        }
        if (g(aVar.f6543b, 16)) {
            this.e = 0;
            this.f6543b &= -33;
        }
        if (g(aVar.f6543b, 32)) {
            this.e = aVar.e;
            this.f6543b &= -17;
        }
        if (g(aVar.f6543b, 64)) {
            this.f6544f = 0;
            this.f6543b &= -129;
        }
        if (g(aVar.f6543b, 128)) {
            this.f6544f = aVar.f6544f;
            this.f6543b &= -65;
        }
        if (g(aVar.f6543b, 256)) {
            this.f6545g = aVar.f6545g;
        }
        if (g(aVar.f6543b, 512)) {
            this.f6547i = aVar.f6547i;
            this.f6546h = aVar.f6546h;
        }
        if (g(aVar.f6543b, 1024)) {
            this.f6548j = aVar.f6548j;
        }
        if (g(aVar.f6543b, 4096)) {
            this.f6552n = aVar.f6552n;
        }
        if (g(aVar.f6543b, 8192)) {
            this.f6543b &= -16385;
        }
        if (g(aVar.f6543b, 16384)) {
            this.f6543b &= -8193;
        }
        if (g(aVar.f6543b, 131072)) {
            this.f6549k = aVar.f6549k;
        }
        if (g(aVar.f6543b, 2048)) {
            this.f6551m.putAll((Map) aVar.f6551m);
            this.f6555q = aVar.f6555q;
        }
        this.f6543b |= aVar.f6543b;
        this.f6550l.f2525b.putAll((SimpleArrayMap) aVar.f6550l.f2525b);
        l();
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, androidx.collection.ArrayMap, c0.c] */
    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            h.h hVar = new h.h();
            aVar.f6550l = hVar;
            hVar.f2525b.putAll((SimpleArrayMap) this.f6550l.f2525b);
            ?? arrayMap = new ArrayMap();
            aVar.f6551m = arrayMap;
            arrayMap.putAll(this.f6551m);
            aVar.f6553o = false;
            aVar.f6554p = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            n0.b.w(e);
            return null;
        }
    }

    public final a c(Class cls) {
        if (this.f6554p) {
            return clone().c(cls);
        }
        this.f6552n = cls;
        this.f6543b |= 4096;
        l();
        return this;
    }

    public final a d(m mVar) {
        if (this.f6554p) {
            return clone().d(mVar);
        }
        this.c = mVar;
        this.f6543b |= 4;
        l();
        return this;
    }

    public final a e(int i10) {
        if (this.f6554p) {
            return clone().e(i10);
        }
        this.e = i10;
        this.f6543b = (this.f6543b | 32) & (-17);
        l();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return f((a) obj);
        }
        return false;
    }

    public final boolean f(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) == 0 && this.e == aVar.e) {
            char[] cArr = p.f446a;
            if (this.f6544f == aVar.f6544f && this.f6545g == aVar.f6545g && this.f6546h == aVar.f6546h && this.f6547i == aVar.f6547i && this.f6549k == aVar.f6549k && this.c.equals(aVar.c) && this.d == aVar.d && this.f6550l.equals(aVar.f6550l) && this.f6551m.equals(aVar.f6551m) && this.f6552n.equals(aVar.f6552n) && this.f6548j.equals(aVar.f6548j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final a h(o oVar, q.f fVar) {
        if (this.f6554p) {
            return clone().h(oVar, fVar);
        }
        m(o.f5141g, oVar);
        return p(fVar, false);
    }

    public int hashCode() {
        char[] cArr = p.f446a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.f6549k ? 1 : 0, p.g(this.f6547i, p.g(this.f6546h, p.g(this.f6545g ? 1 : 0, p.h(p.g(0, p.h(p.g(this.f6544f, p.h(p.g(this.e, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.c), this.d), this.f6550l), this.f6551m), this.f6552n), this.f6548j), null);
    }

    public final a i(int i10, int i11) {
        if (this.f6554p) {
            return clone().i(i10, i11);
        }
        this.f6547i = i10;
        this.f6546h = i11;
        this.f6543b |= 512;
        l();
        return this;
    }

    public final a j(int i10) {
        if (this.f6554p) {
            return clone().j(i10);
        }
        this.f6544f = i10;
        this.f6543b = (this.f6543b | 128) & (-65);
        l();
        return this;
    }

    public final a k() {
        if (this.f6554p) {
            return clone().k();
        }
        this.d = h.e;
        this.f6543b |= 8;
        l();
        return this;
    }

    public final void l() {
        if (!this.f6553o) {
            return;
        }
        i.l("You cannot modify locked T, consider clone()");
    }

    public final a m(h.g gVar, Object obj) {
        if (this.f6554p) {
            return clone().m(gVar, obj);
        }
        c0.g.b(gVar);
        this.f6550l.f2525b.put(gVar, obj);
        l();
        return this;
    }

    public final a n(b0.b bVar) {
        if (this.f6554p) {
            return clone().n(bVar);
        }
        this.f6548j = bVar;
        this.f6543b |= 1024;
        l();
        return this;
    }

    public final a o() {
        if (this.f6554p) {
            return clone().o();
        }
        this.f6545g = false;
        this.f6543b |= 256;
        l();
        return this;
    }

    public final a p(l lVar, boolean z9) {
        if (this.f6554p) {
            return clone().p(lVar, z9);
        }
        t tVar = new t(lVar, z9);
        q(Bitmap.class, lVar, z9);
        q(Drawable.class, tVar, z9);
        q(BitmapDrawable.class, tVar, z9);
        q(u.b.class, new u.c(lVar), z9);
        l();
        return this;
    }

    public final a q(Class cls, l lVar, boolean z9) {
        if (this.f6554p) {
            return clone().q(cls, lVar, z9);
        }
        c0.g.b(lVar);
        this.f6551m.put(cls, lVar);
        int i10 = this.f6543b;
        this.f6543b = 67584 | i10;
        this.f6555q = false;
        if (z9) {
            this.f6543b = i10 | 198656;
            this.f6549k = true;
        }
        l();
        return this;
    }

    public final a r(q.i iVar) {
        o oVar = o.d;
        if (this.f6554p) {
            return clone().r(iVar);
        }
        m(o.f5141g, oVar);
        return p(iVar, true);
    }

    public final a s() {
        if (this.f6554p) {
            return clone().s();
        }
        this.r = true;
        this.f6543b |= 1048576;
        l();
        return this;
    }
}
