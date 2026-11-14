package v7;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n7.f1;
import n7.g0;
import n7.i1;
import n7.j0;
import n7.j1;
import n7.k1;
import o7.o4;
import o7.u2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: n, reason: collision with root package name */
    public static final n7.a f5985n = new n7.a("addressTrackerKey");

    /* renamed from: f, reason: collision with root package name */
    public final l f5986f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f5987g;

    /* renamed from: h, reason: collision with root package name */
    public final e f5988h;

    /* renamed from: i, reason: collision with root package name */
    public final u2 f5989i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f5990j;

    /* renamed from: k, reason: collision with root package name */
    public l.d f5991k;

    /* renamed from: l, reason: collision with root package name */
    public Long f5992l;

    /* renamed from: m, reason: collision with root package name */
    public final n7.e f5993m;

    public t(n7.e eVar) {
        u2 u2Var = u2.d;
        n7.e c = eVar.c();
        this.f5993m = c;
        this.f5988h = new e(new d(this, eVar));
        this.f5986f = new l();
        k1 f8 = eVar.f();
        o4.b.i(f8, "syncContext");
        this.f5987g = f8;
        ScheduledExecutorService d = eVar.d();
        o4.b.i(d, "timeService");
        this.f5990j = d;
        this.f5989i = u2Var;
        c.m(1, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((n7.r) it.next()).f4239a.size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(l lVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : lVar.f5967b.values()) {
            if (kVar.c() >= i10) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // n7.j0
    public final f1 a(g0 g0Var) {
        Long valueOf;
        e eVar = this.f5988h;
        l lVar = this.f5986f;
        n7.e eVar2 = this.f5993m;
        eVar2.n(1, "Received resolution result: {0}", g0Var);
        o oVar = (o) g0Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = g0Var.f4206a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((n7.r) it.next()).f4239a);
        }
        lVar.f5967b.keySet().retainAll(arrayList);
        Iterator it2 = lVar.f5967b.values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f5964a = oVar;
        }
        HashMap hashMap = lVar.f5967b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SocketAddress socketAddress = (SocketAddress) obj;
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new k(oVar));
            }
        }
        o4 o4Var = oVar.f5975g;
        Long l10 = oVar.f5972a;
        eVar.i(o4Var.f4632a);
        if (oVar.e == null && oVar.f5974f == null) {
            l.d dVar = this.f5991k;
            if (dVar != null) {
                dVar.j();
                this.f5992l = null;
                for (k kVar : lVar.f5967b.values()) {
                    if (kVar.d()) {
                        kVar.e();
                    }
                    kVar.e = 0;
                }
            }
        } else {
            if (this.f5992l == null) {
                valueOf = l10;
            } else {
                valueOf = Long.valueOf(Math.max(0L, l10.longValue() - (this.f5989i.q() - this.f5992l.longValue())));
            }
            l.d dVar2 = this.f5991k;
            if (dVar2 != null) {
                dVar2.j();
                for (k kVar2 : lVar.f5967b.values()) {
                    l.d dVar3 = kVar2.f5965b;
                    ((AtomicLong) dVar3.c).set(0L);
                    ((AtomicLong) dVar3.d).set(0L);
                    l.d dVar4 = kVar2.c;
                    ((AtomicLong) dVar4.c).set(0L);
                    ((AtomicLong) dVar4.d).set(0L);
                }
            }
            k1 k1Var = this.f5987g;
            c3.e eVar3 = new c3.e(this, oVar, eVar2, 6);
            long longValue = valueOf.longValue();
            long longValue2 = l10.longValue();
            ScheduledExecutorService scheduledExecutorService = this.f5990j;
            k1Var.getClass();
            j1 j1Var = new j1(eVar3);
            this.f5991k = new l.d(j1Var, scheduledExecutorService.scheduleWithFixedDelay(new i1(k1Var, j1Var, eVar3, longValue2), longValue, longValue2, TimeUnit.NANOSECONDS));
        }
        n7.b bVar = n7.b.f4157b;
        eVar.d(new g0(g0Var.f4206a, g0Var.f4207b, oVar.f5975g.f4633b));
        return f1.e;
    }

    @Override // n7.j0
    public final void c(f1 f1Var) {
        this.f5988h.c(f1Var);
    }

    @Override // n7.j0
    public final void f() {
        this.f5988h.f();
    }
}
