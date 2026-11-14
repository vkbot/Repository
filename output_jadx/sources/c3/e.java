package c3;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l9.a0;
import n7.c1;
import n7.f1;
import n7.g1;
import n7.h0;
import n7.j1;
import n7.k1;
import n7.u;
import n7.v0;
import o7.b2;
import o7.f2;
import o7.i0;
import o7.p4;
import o7.y0;
import o7.y1;
import p7.m;
import p7.n;
import p7.t;
import v7.k;
import v7.l;
import v7.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f514b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f514b = i10;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [l9.g0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        n nVar;
        m mVar;
        Socket socket;
        SSLSession sSLSession;
        Socket socket2;
        c1 c1Var;
        j4.c cVar;
        o oVar;
        double d;
        int i10;
        int i11 = 0;
        switch (this.f514b) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.c;
                f fVar = (f) this.e;
                View view = (View) this.d;
                if (view != null && (overScroller = fVar.d) != null) {
                    if (overScroller.computeScrollOffset()) {
                        fVar.e(coordinatorLayout, view, fVar.d.getCurrY());
                        view.postOnAnimation(this);
                        return;
                    }
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) fVar).k(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f1171l) {
                        appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.h(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((k1) this.e).execute((j1) this.c);
                return;
            case 2:
                ((b2) this.e).f4432i.o((n7.e) this.c, (v0) this.d);
                return;
            case 3:
                ((i0) this.e).f4548b.o((f1) this.c, (v0) this.d);
                return;
            case 4:
                n7.j jVar = (n7.j) this.d;
                h0 h0Var = (h0) this.c;
                y1 y1Var = (y1) this.e;
                f2 f2Var = y1Var.c;
                if (y1Var == f2Var.f4508x) {
                    f2Var.f4509y = h0Var;
                    f2Var.E.g(h0Var);
                    if (jVar != n7.j.f4215f) {
                        y1Var.c.N.n(2, "Entering {0} state with picker: {1}", jVar, h0Var);
                        y1Var.c.r.c(jVar);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                try {
                    ((CountDownLatch) this.c).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                a0 a0Var = new a0(new Object());
                try {
                    try {
                        try {
                            n nVar2 = (n) this.e;
                            u uVar = nVar2.N;
                            if (uVar == null) {
                                socket = nVar2.A.createSocket(nVar2.f5071a.getAddress(), ((n) this.e).f5071a.getPort());
                            } else {
                                SocketAddress socketAddress = uVar.f4246b;
                                if (socketAddress instanceof InetSocketAddress) {
                                    socket = n.f(nVar2, uVar.c, (InetSocketAddress) socketAddress, uVar.d, uVar.e);
                                } else {
                                    throw new g1(f1.f4200l.h("Unsupported SocketAddress implementation " + ((n) this.e).N.f4246b.getClass()));
                                }
                            }
                            n nVar3 = (n) this.e;
                            SSLSocketFactory sSLSocketFactory = nVar3.B;
                            if (sSLSocketFactory != null) {
                                String str = nVar3.f5072b;
                                URI a10 = y0.a(str);
                                if (a10.getHost() != null) {
                                    str = a10.getHost();
                                }
                                SSLSocket a11 = t.a(sSLSocketFactory, socket, str, ((n) this.e).j(), ((n) this.e).E);
                                sSLSession = a11.getSession();
                                socket2 = a11;
                            } else {
                                sSLSession = null;
                                socket2 = socket;
                            }
                            socket2.setTcpNoDelay(true);
                            a0 b10 = l9.b.b(l9.b.h(socket2));
                            ((p7.c) this.d).b(l9.b.g(socket2), socket2);
                            n nVar4 = (n) this.e;
                            n7.b bVar = nVar4.f5086u;
                            bVar.getClass();
                            l.d dVar = new l.d(3, bVar);
                            dVar.M(n7.t.f4243a, socket2.getRemoteSocketAddress());
                            dVar.M(n7.t.f4244b, socket2.getLocalSocketAddress());
                            dVar.M(n7.t.c, sSLSession);
                            n7.a aVar = p4.f4664a;
                            if (sSLSession == null) {
                                c1Var = c1.f4170b;
                            } else {
                                c1Var = c1.c;
                            }
                            dVar.M(aVar, c1Var);
                            nVar4.f5086u = dVar.g();
                            n nVar5 = (n) this.e;
                            nVar5.f5074g.getClass();
                            nVar5.t = new m(nVar5, new r7.h(b10));
                            synchronized (((n) this.e).f5078k) {
                                if (sSLSession != null) {
                                    try {
                                        new n7.h(sSLSession);
                                    } finally {
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            n nVar6 = (n) this.e;
                            nVar6.f5074g.getClass();
                            nVar6.t = new m(nVar6, new r7.h(a0Var));
                            throw th;
                        }
                    } catch (g1 e) {
                        ((n) this.e).r(0, r7.a.INTERNAL_ERROR, e.f4208b);
                        nVar = (n) this.e;
                        nVar.f5074g.getClass();
                        mVar = new m(nVar, new r7.h(a0Var));
                        nVar.t = mVar;
                        return;
                    }
                } catch (Exception e6) {
                    ((n) this.e).n(e6);
                    nVar = (n) this.e;
                    nVar.f5074g.getClass();
                    mVar = new m(nVar, new r7.h(a0Var));
                    nVar.t = mVar;
                    return;
                }
            default:
                v7.t tVar = (v7.t) this.e;
                tVar.f5992l = Long.valueOf(tVar.f5989i.q());
                for (k kVar : ((v7.t) this.e).f5986f.f5967b.values()) {
                    l.d dVar2 = kVar.c;
                    ((AtomicLong) dVar2.c).set(0L);
                    ((AtomicLong) dVar2.d).set(0L);
                    l.d dVar3 = kVar.f5965b;
                    kVar.f5965b = kVar.c;
                    kVar.c = dVar3;
                }
                o oVar2 = (o) this.c;
                n7.e eVar = (n7.e) this.d;
                j4.c cVar2 = j4.e.c;
                j4.b bVar2 = new j4.b(0);
                b1.u.c(4, "initialCapacity");
                bVar2.d = new Object[4];
                bVar2.f3268b = 0;
                if (oVar2.e != null) {
                    bVar2.a(new v7.m(oVar2, eVar, 1));
                }
                if (oVar2.f5974f != null) {
                    bVar2.a(new v7.m(oVar2, eVar, 0));
                }
                bVar2.c = true;
                j4.c listIterator = j4.e.i(bVar2.f3268b, (Object[]) bVar2.d).listIterator(0);
                while (listIterator.hasNext()) {
                    v7.m mVar2 = (v7.m) listIterator.next();
                    v7.t tVar2 = (v7.t) this.e;
                    l lVar = tVar2.f5986f;
                    long longValue = tVar2.f5992l.longValue();
                    switch (mVar2.f5968a) {
                        case 0:
                            cVar = listIterator;
                            o oVar3 = mVar2.f5969b;
                            ArrayList h2 = v7.t.h(lVar, oVar3.f5974f.d.intValue());
                            int size = h2.size();
                            v7.n nVar7 = oVar3.f5974f;
                            if (size >= nVar7.c.intValue() && h2.size() != 0) {
                                int size2 = h2.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    Object obj = h2.get(i12);
                                    i12++;
                                    k kVar2 = (k) obj;
                                    if (lVar.a() >= oVar3.d.intValue()) {
                                        break;
                                    }
                                    if (kVar2.c() >= nVar7.d.intValue()) {
                                        ArrayList arrayList = h2;
                                        int i13 = size2;
                                        if (((AtomicLong) kVar2.c.d).get() / kVar2.c() > nVar7.f5970a.intValue() / 100.0d) {
                                            mVar2.c.n(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", kVar2, Double.valueOf(((AtomicLong) kVar2.c.d).get() / kVar2.c()));
                                            if (new Random().nextInt(100) < nVar7.f5971b.intValue()) {
                                                kVar2.b(longValue);
                                            }
                                        }
                                        h2 = arrayList;
                                        size2 = i13;
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            o oVar4 = mVar2.f5969b;
                            ArrayList h10 = v7.t.h(lVar, oVar4.e.d.intValue());
                            int size3 = h10.size();
                            v7.n nVar8 = oVar4.e;
                            if (size3 >= nVar8.c.intValue() && h10.size() != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                int size4 = h10.size();
                                int i14 = i11;
                                while (i14 < size4) {
                                    Object obj2 = h10.get(i14);
                                    i14++;
                                    k kVar3 = (k) obj2;
                                    arrayList2.add(Double.valueOf(((AtomicLong) kVar3.c.c).get() / kVar3.c()));
                                    h10 = h10;
                                }
                                ArrayList arrayList3 = h10;
                                int size5 = arrayList2.size();
                                double d10 = 0.0d;
                                double d11 = 0.0d;
                                int i15 = 0;
                                while (i15 < size5) {
                                    Object obj3 = arrayList2.get(i15);
                                    i15++;
                                    d11 = ((Double) obj3).doubleValue() + d11;
                                }
                                double size6 = d11 / arrayList2.size();
                                int size7 = arrayList2.size();
                                int i16 = 0;
                                while (i16 < size7) {
                                    Object obj4 = arrayList2.get(i16);
                                    i16++;
                                    double doubleValue = ((Double) obj4).doubleValue() - size6;
                                    d10 = (doubleValue * doubleValue) + d10;
                                }
                                double sqrt = Math.sqrt(d10 / arrayList2.size());
                                double intValue = size6 - ((nVar8.f5970a.intValue() / 1000.0f) * sqrt);
                                int size8 = arrayList3.size();
                                int i17 = 0;
                                while (i17 < size8) {
                                    cVar = listIterator;
                                    ArrayList arrayList4 = arrayList3;
                                    Object obj5 = arrayList4.get(i17);
                                    i17++;
                                    k kVar4 = (k) obj5;
                                    double d12 = sqrt;
                                    if (lVar.a() >= oVar4.d.intValue()) {
                                        break;
                                    }
                                    if (((AtomicLong) kVar4.c.c).get() / kVar4.c() < intValue) {
                                        oVar = oVar4;
                                        d = intValue;
                                        i10 = size8;
                                        mVar2.c.n(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", kVar4, Double.valueOf(((AtomicLong) kVar4.c.c).get() / kVar4.c()), Double.valueOf(size6), Double.valueOf(d12), Double.valueOf(d));
                                        if (new Random().nextInt(100) < nVar8.f5971b.intValue()) {
                                            kVar4.b(longValue);
                                        }
                                    } else {
                                        oVar = oVar4;
                                        d = intValue;
                                        i10 = size8;
                                    }
                                    oVar4 = oVar;
                                    listIterator = cVar;
                                    arrayList3 = arrayList4;
                                    intValue = d;
                                    sqrt = d12;
                                    size8 = i10;
                                }
                            }
                            cVar = listIterator;
                            break;
                    }
                    listIterator = cVar;
                    i11 = 0;
                }
                v7.t tVar3 = (v7.t) this.e;
                l lVar2 = tVar3.f5986f;
                Long l10 = tVar3.f5992l;
                for (k kVar5 : lVar2.f5967b.values()) {
                    if (!kVar5.d()) {
                        int i18 = kVar5.e;
                        kVar5.e = i18 == 0 ? 0 : i18 - 1;
                    }
                    if (kVar5.d()) {
                        if (l10.longValue() > Math.min(kVar5.f5964a.f5973b.longValue() * kVar5.e, Math.max(kVar5.f5964a.f5973b.longValue(), kVar5.f5964a.c.longValue())) + kVar5.d.longValue()) {
                            kVar5.e();
                        }
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f514b) {
            case 1:
                return ((Runnable) this.d).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }
}
