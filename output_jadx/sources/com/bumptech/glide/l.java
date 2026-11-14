package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.bumptech.glide.manager.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends y.a {
    public l A;
    public final boolean B = true;
    public boolean C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public final Context f639s;
    public final p t;

    /* renamed from: u, reason: collision with root package name */
    public final Class f640u;

    /* renamed from: v, reason: collision with root package name */
    public final e f641v;
    public a w;

    /* renamed from: x, reason: collision with root package name */
    public Object f642x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f643y;

    /* renamed from: z, reason: collision with root package name */
    public l f644z;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(b bVar, p pVar, Class cls, Context context) {
        y.e eVar;
        this.t = pVar;
        this.f640u = cls;
        this.f639s = context;
        ArrayMap arrayMap = pVar.f683b.d.f621f;
        a aVar = (a) arrayMap.get(cls);
        if (aVar == null) {
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.w = aVar == null ? e.f618k : aVar;
        this.f641v = bVar.d;
        Iterator it2 = pVar.f688j.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                t();
            } else {
                n0.b.a();
                throw null;
            }
        }
        synchronized (pVar) {
            eVar = pVar.f689k;
        }
        a(eVar);
    }

    @Override // y.a
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (super.equals(lVar) && Objects.equals(this.f640u, lVar.f640u) && this.w.equals(lVar.w) && Objects.equals(this.f642x, lVar.f642x) && Objects.equals(this.f643y, lVar.f643y) && Objects.equals(this.f644z, lVar.f644z) && Objects.equals(this.A, lVar.A) && this.B == lVar.B && this.C == lVar.C) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // y.a
    public final int hashCode() {
        return c0.p.g(this.C ? 1 : 0, c0.p.g(this.B ? 1 : 0, c0.p.h(c0.p.h(c0.p.h(c0.p.h(c0.p.h(c0.p.h(c0.p.h(super.hashCode(), this.f640u), this.w), this.f642x), this.f643y), this.f644z), this.A), null)));
    }

    public final l t() {
        if (this.f6554p) {
            return clone().t();
        }
        l();
        return this;
    }

    @Override // y.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final l a(y.a aVar) {
        c0.g.b(aVar);
        return (l) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y.c v(Object obj, z.d dVar, y.d dVar2, a aVar, h hVar, int i10, int i11, y.a aVar2) {
        y.d dVar3;
        y.d dVar4;
        y.a aVar3;
        y.f fVar;
        a aVar4;
        h hVar2;
        if (this.A != null) {
            dVar4 = new y.b(obj, dVar2);
            dVar3 = dVar4;
        } else {
            dVar3 = null;
            dVar4 = dVar2;
        }
        l lVar = this.f644z;
        if (lVar != null) {
            if (!this.D) {
                a aVar5 = lVar.w;
                if (lVar.B) {
                    aVar4 = aVar;
                } else {
                    aVar4 = aVar5;
                }
                if (y.a.g(lVar.f6543b, 8)) {
                    hVar2 = this.f644z.d;
                } else {
                    int ordinal = hVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                hVar2 = h.d;
                            } else {
                                androidx.navigation.b.o(this.d, "unknown priority: ");
                                return null;
                            }
                        } else {
                            hVar2 = h.c;
                        }
                    } else {
                        hVar2 = h.f628b;
                    }
                }
                h hVar3 = hVar2;
                l lVar2 = this.f644z;
                int i12 = lVar2.f6547i;
                int i13 = lVar2.f6546h;
                if (c0.p.i(i10, i11)) {
                    l lVar3 = this.f644z;
                    if (!c0.p.i(lVar3.f6547i, lVar3.f6546h)) {
                        i12 = aVar2.f6547i;
                        i13 = aVar2.f6546h;
                    }
                }
                int i14 = i13;
                y.g gVar = new y.g(obj, dVar4);
                Context context = this.f639s;
                y.g gVar2 = gVar;
                e eVar = this.f641v;
                y.f fVar2 = new y.f(context, eVar, obj, this.f642x, this.f640u, aVar2, i10, i11, hVar, dVar, this.f643y, gVar2, eVar.f622g, aVar.f608b);
                this.D = true;
                l lVar4 = this.f644z;
                y.c v9 = lVar4.v(obj, dVar, gVar2, aVar4, hVar3, i12, i14, lVar4);
                this.D = false;
                gVar2.c = fVar2;
                gVar2.d = v9;
                aVar3 = aVar2;
                fVar = gVar2;
            } else {
                j1.i.l("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
        } else {
            Context context2 = this.f639s;
            e eVar2 = this.f641v;
            aVar3 = aVar2;
            fVar = new y.f(context2, eVar2, obj, this.f642x, this.f640u, aVar3, i10, i11, hVar, dVar, this.f643y, dVar4, eVar2.f622g, aVar.f608b);
        }
        if (dVar3 == null) {
            return fVar;
        }
        l lVar5 = this.A;
        int i15 = lVar5.f6547i;
        int i16 = lVar5.f6546h;
        if (c0.p.i(i10, i11)) {
            l lVar6 = this.A;
            if (!c0.p.i(lVar6.f6547i, lVar6.f6546h)) {
                i15 = aVar3.f6547i;
                i16 = aVar3.f6546h;
            }
        }
        int i17 = i16;
        l lVar7 = this.A;
        y.b bVar = dVar3;
        y.c v10 = lVar7.v(obj, dVar, bVar, lVar7.w, lVar7.d, i15, i17, lVar7);
        bVar.c = fVar;
        bVar.d = v10;
        return bVar;
    }

    @Override // y.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        l lVar = (l) super.clone();
        lVar.w = lVar.w.clone();
        if (lVar.f643y != null) {
            lVar.f643y = new ArrayList(lVar.f643y);
        }
        l lVar2 = lVar.f644z;
        if (lVar2 != null) {
            lVar.f644z = lVar2.clone();
        }
        l lVar3 = lVar.A;
        if (lVar3 != null) {
            lVar.A = lVar3.clone();
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Type inference failed for: r2v3, types: [q.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [q.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [q.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [q.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(android.widget.ImageView r5) {
        /*
            r4 = this;
            c0.p.a()
            c0.g.b(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.f6543b
            boolean r0 = y.a.g(r1, r0)
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.bumptech.glide.k.f637a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L6d
        L27:
            com.bumptech.glide.l r0 = r4.clone()
            q.o r2 = q.o.c
            q.j r3 = new q.j
            r3.<init>()
            y.a r0 = r0.h(r2, r3)
            r0.f6555q = r1
            goto L6e
        L39:
            com.bumptech.glide.l r0 = r4.clone()
            q.o r2 = q.o.f5139b
            q.v r3 = new q.v
            r3.<init>()
            y.a r0 = r0.h(r2, r3)
            r0.f6555q = r1
            goto L6e
        L4b:
            com.bumptech.glide.l r0 = r4.clone()
            q.o r2 = q.o.c
            q.j r3 = new q.j
            r3.<init>()
            y.a r0 = r0.h(r2, r3)
            r0.f6555q = r1
            goto L6e
        L5d:
            com.bumptech.glide.l r0 = r4.clone()
            q.o r1 = q.o.d
            q.i r2 = new q.i
            r2.<init>()
            y.a r0 = r0.h(r1, r2)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.bumptech.glide.e r1 = r4.f641v
            w7.c r1 = r1.c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.f640u
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L86
            z.a r1 = new z.a
            r2 = 0
            r1.<init>(r5, r2)
            goto L94
        L86:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L98
            z.a r1 = new z.a
            r2 = 1
            r1.<init>(r5, r2)
        L94:
            r4.y(r1, r0)
            return
        L98:
            java.lang.String r5 = "Unhandled class: "
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            androidx.navigation.b.p(r2, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.x(android.widget.ImageView):void");
    }

    public final void y(z.d dVar, y.a aVar) {
        c0.g.b(dVar);
        if (this.C) {
            y.c v9 = v(new Object(), dVar, null, this.w, aVar.d, aVar.f6547i, aVar.f6546h, aVar);
            y.c i10 = dVar.i();
            if (v9.k(i10) && (aVar.f6545g || !i10.j())) {
                c0.g.c(i10, "Argument must not be null");
                if (!i10.isRunning()) {
                    i10.i();
                    return;
                }
                return;
            }
            this.t.k(dVar);
            dVar.h(v9);
            p pVar = this.t;
            synchronized (pVar) {
                pVar.f685g.f678b.add(dVar);
                t tVar = pVar.e;
                ((Set) tVar.d).add(v9);
                if (!tVar.c) {
                    v9.i();
                } else {
                    v9.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((HashSet) tVar.e).add(v9);
                }
            }
            return;
        }
        j1.i.k("You must call #load() before calling #into()");
    }

    public final l z(Object obj) {
        if (this.f6554p) {
            return clone().z(obj);
        }
        this.f642x = obj;
        this.C = true;
        l();
        return this;
    }
}
