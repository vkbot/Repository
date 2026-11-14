package k;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.h f3359a = new android.support.v4.media.h(25);

    /* renamed from: b, reason: collision with root package name */
    public final f f3360b = new f(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3361f;

    public g(int i10) {
        this.e = i10;
    }

    public final void a(int i10, Class cls) {
        NavigableMap f8 = f(cls);
        Integer num = (Integer) f8.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                f8.remove(Integer.valueOf(i10));
                return;
            } else {
                f8.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void b(int i10) {
        while (this.f3361f > i10) {
            Object s5 = this.f3359a.s();
            c0.g.b(s5);
            c d = d(s5.getClass());
            this.f3361f -= d.b() * d.a(s5);
            a(d.a(s5), s5.getClass());
            if (Log.isLoggable(d.c(), 2)) {
                Log.v(d.c(), "evicted: " + d.a(s5));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Object c(int r4, java.lang.Class r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.NavigableMap r0 = r3.f(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L26
            int r1 = r3.f3361f     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L24
            int r2 = r3.e     // Catch: java.lang.Throwable -> L46
            int r2 = r2 / r1
            r1 = 2
            if (r2 < r1) goto L1c
            goto L24
        L1c:
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            int r2 = r4 * 8
            if (r1 > r2) goto L26
        L24:
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            k.f r2 = r3.f3360b
            if (r1 == 0) goto L48
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r2.f3353b     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L46
            k.i r0 = (k.i) r0     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L3f
            k.i r0 = r2.e()     // Catch: java.lang.Throwable -> L46
        L3f:
            k.e r0 = (k.e) r0     // Catch: java.lang.Throwable -> L46
            r0.f3358b = r4     // Catch: java.lang.Throwable -> L46
            r0.c = r5     // Catch: java.lang.Throwable -> L46
            goto L5e
        L46:
            r4 = move-exception
            goto L64
        L48:
            java.lang.Object r0 = r2.f3353b     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L46
            k.i r0 = (k.i) r0     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L58
            k.i r0 = r2.e()     // Catch: java.lang.Throwable -> L46
        L58:
            k.e r0 = (k.e) r0     // Catch: java.lang.Throwable -> L46
            r0.f3358b = r4     // Catch: java.lang.Throwable -> L46
            r0.c = r5     // Catch: java.lang.Throwable -> L46
        L5e:
            java.lang.Object r4 = r3.e(r0, r5)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            return r4
        L64:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.c(int, java.lang.Class):java.lang.Object");
    }

    public final c d(Class cls) {
        c cVar;
        HashMap hashMap = this.d;
        c cVar2 = (c) hashMap.get(cls);
        if (cVar2 == null) {
            if (cls.equals(int[].class)) {
                cVar = new c(1);
            } else if (cls.equals(byte[].class)) {
                cVar = new c(0);
            } else {
                j1.i.k("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            hashMap.put(cls, cVar);
            return cVar;
        }
        return cVar2;
    }

    public final Object e(e eVar, Class cls) {
        c d = d(cls);
        Object h2 = this.f3359a.h(eVar);
        if (h2 != null) {
            this.f3361f -= d.b() * d.a(h2);
            a(d.a(h2), cls);
        }
        if (h2 == null) {
            if (Log.isLoggable(d.c(), 2)) {
                Log.v(d.c(), "Allocated " + eVar.f3358b + " bytes");
            }
            int i10 = eVar.f3358b;
            switch (d.f3354a) {
                case 0:
                    return new byte[i10];
                default:
                    return new int[i10];
            }
        }
        return h2;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        c d = d(cls);
        int a10 = d.a(obj);
        int b10 = d.b() * a10;
        if (b10 <= this.e / 2) {
            f fVar = this.f3360b;
            i iVar = (i) ((ArrayDeque) fVar.f3353b).poll();
            if (iVar == null) {
                iVar = fVar.e();
            }
            e eVar = (e) iVar;
            eVar.f3358b = a10;
            eVar.c = cls;
            this.f3359a.q(eVar, obj);
            NavigableMap f8 = f(cls);
            Integer num = (Integer) f8.get(Integer.valueOf(eVar.f3358b));
            Integer valueOf = Integer.valueOf(eVar.f3358b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            f8.put(valueOf, Integer.valueOf(i10));
            this.f3361f += b10;
            b(this.e);
        }
    }
}
