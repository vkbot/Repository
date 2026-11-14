package v7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public o f5964a;
    public Long d;
    public int e;

    /* renamed from: b, reason: collision with root package name */
    public volatile l.d f5965b = new l.d(20);
    public l.d c = new l.d(20);

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f5966f = new HashSet();

    public k(o oVar) {
        this.f5964a = oVar;
    }

    public final void a(s sVar) {
        if (d() && !sVar.f5980f) {
            sVar.s();
        } else if (!d() && sVar.f5980f) {
            sVar.f5980f = false;
            n7.k kVar = sVar.f5981g;
            if (kVar != null) {
                sVar.f5982h.a(kVar);
                sVar.f5983i.n(2, "Subchannel unejected: {0}", sVar);
            }
        }
        sVar.e = this;
        this.f5966f.add(sVar);
    }

    public final void b(long j10) {
        this.d = Long.valueOf(j10);
        this.e++;
        Iterator it = this.f5966f.iterator();
        while (it.hasNext()) {
            ((s) it.next()).s();
        }
    }

    public final long c() {
        return ((AtomicLong) this.c.d).get() + ((AtomicLong) this.c.c).get();
    }

    public final boolean d() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        boolean z9;
        if (this.d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "not currently ejected");
        this.d = null;
        Iterator it = this.f5966f.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            sVar.f5980f = false;
            n7.k kVar = sVar.f5981g;
            if (kVar != null) {
                sVar.f5982h.a(kVar);
                sVar.f5983i.n(2, "Subchannel unejected: {0}", sVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f5966f + '}';
    }
}
