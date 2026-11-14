package v7;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import n7.e0;
import n7.f1;
import n7.i0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends b {
    public final n7.t d;
    public k e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5980f;

    /* renamed from: g, reason: collision with root package name */
    public n7.k f5981g;

    /* renamed from: h, reason: collision with root package name */
    public i0 f5982h;

    /* renamed from: i, reason: collision with root package name */
    public final n7.e f5983i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f5984j;

    public s(t tVar, e0 e0Var, h hVar) {
        this.f5984j = tVar;
        i0 i0Var = (i0) e0Var.c();
        if (i0Var != null) {
            this.f5982h = i0Var;
            f fVar = new f(this, i0Var, 1);
            e0Var.getClass();
            e0 d = e0.d();
            d.e(e0Var.f4174b);
            n7.b bVar = e0Var.c;
            o4.b.i(bVar, "attrs");
            d.c = bVar;
            Object[][] objArr = e0Var.d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            d.d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            d.a(fVar);
            this.d = hVar.b(d.b());
        } else {
            this.d = hVar.b(e0Var);
        }
        this.f5983i = this.d.e();
    }

    @Override // n7.t
    public final n7.b d() {
        k kVar = this.e;
        n7.t tVar = this.d;
        if (kVar != null) {
            n7.b d = tVar.d();
            d.getClass();
            k kVar2 = this.e;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(t.f5985n, kVar2);
            for (Map.Entry entry : d.f4158a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put((n7.a) entry.getKey(), entry.getValue());
                }
            }
            return new n7.b(identityHashMap);
        }
        return tVar.d();
    }

    @Override // v7.b, n7.t
    public final void n() {
        k kVar = this.e;
        if (kVar != null) {
            this.e = null;
            kVar.f5966f.remove(this);
        }
        super.n();
    }

    @Override // n7.t
    public final void p(i0 i0Var) {
        if (this.f5982h != null) {
            r().p(i0Var);
            return;
        }
        this.f5982h = i0Var;
        r().p(new f(this, i0Var, 1));
    }

    @Override // v7.b, n7.t
    public final void q(List list) {
        t tVar = this.f5984j;
        if (t.g(c()) && t.g(list)) {
            l lVar = tVar.f5986f;
            if (lVar.f5967b.containsValue(this.e)) {
                k kVar = this.e;
                kVar.getClass();
                this.e = null;
                kVar.f5966f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((n7.r) list.get(0)).f4239a.get(0);
            if (tVar.f5986f.f5967b.containsKey(socketAddress)) {
                ((k) tVar.f5986f.f5967b.get(socketAddress)).a(this);
            }
        } else if (t.g(c()) && !t.g(list)) {
            l lVar2 = tVar.f5986f;
            if (lVar2.f5967b.containsKey(b().f4239a.get(0))) {
                l lVar3 = tVar.f5986f;
                k kVar2 = (k) lVar3.f5967b.get(b().f4239a.get(0));
                kVar2.getClass();
                this.e = null;
                kVar2.f5966f.remove(this);
                l.d dVar = kVar2.f5965b;
                ((AtomicLong) dVar.c).set(0L);
                ((AtomicLong) dVar.d).set(0L);
                l.d dVar2 = kVar2.c;
                ((AtomicLong) dVar2.c).set(0L);
                ((AtomicLong) dVar2.d).set(0L);
            }
        } else if (!t.g(c()) && t.g(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((n7.r) list.get(0)).f4239a.get(0);
            if (tVar.f5986f.f5967b.containsKey(socketAddress2)) {
                ((k) tVar.f5986f.f5967b.get(socketAddress2)).a(this);
            }
        }
        this.d.q(list);
    }

    @Override // v7.b
    public final n7.t r() {
        return this.d;
    }

    public final void s() {
        this.f5980f = true;
        i0 i0Var = this.f5982h;
        f1 f1Var = f1.f4201m;
        o4.b.d("The error status must not be OK", true ^ f1Var.f());
        i0Var.a(new n7.k(n7.j.d, f1Var));
        this.f5983i.n(2, "Subchannel ejected: {0}", this);
    }

    @Override // v7.b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.d.c() + '}';
    }
}
