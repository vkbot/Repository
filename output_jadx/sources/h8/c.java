package h8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: n, reason: collision with root package name */
    public final x7.d f2646n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2647o;

    public c(x7.d dVar, f5.q qVar, int i10, boolean z9) {
        super(qVar, i10);
        this.f2646n = dVar;
        this.f2647o = z9;
    }

    @Override // h8.b
    public final void b() {
        boolean z9;
        if (getAndIncrement() == 0) {
            while (!this.f2632j) {
                if (!this.f2634l) {
                    boolean z10 = this.f2631i;
                    if (z10 && !this.f2647o && ((Throwable) this.f2633k.get()) != null) {
                        x7.d dVar = this.f2646n;
                        p8.b bVar = this.f2633k;
                        bVar.getClass();
                        dVar.onError(p8.d.b(bVar));
                        return;
                    }
                    try {
                        Object poll = this.f2630h.poll();
                        if (poll == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z10 && z9) {
                            p8.b bVar2 = this.f2633k;
                            bVar2.getClass();
                            Throwable b10 = p8.d.b(bVar2);
                            x7.d dVar2 = this.f2646n;
                            if (b10 != null) {
                                dVar2.onError(b10);
                                return;
                            } else {
                                dVar2.a();
                                return;
                            }
                        }
                        if (!z9) {
                            try {
                                Object apply = this.c.apply(poll);
                                d8.b.a(apply, "The mapper returned a null Publisher");
                                n9.a aVar = (n9.a) apply;
                                if (this.f2635m != 1) {
                                    int i10 = this.f2629g + 1;
                                    if (i10 == this.e) {
                                        this.f2629g = 0;
                                        this.f2628f.d(i10);
                                    } else {
                                        this.f2629g = i10;
                                    }
                                }
                                if (aVar instanceof Callable) {
                                    try {
                                        Object call = ((Callable) aVar).call();
                                        if (call == null) {
                                            continue;
                                        } else if (this.f2627b.f2657h) {
                                            this.f2646n.e(call);
                                        } else {
                                            this.f2634l = true;
                                            e eVar = this.f2627b;
                                            eVar.i(new f(call, eVar));
                                        }
                                    } catch (Throwable th) {
                                        com.bumptech.glide.d.v(th);
                                        this.f2628f.cancel();
                                        p8.b bVar3 = this.f2633k;
                                        bVar3.getClass();
                                        p8.d.a(bVar3, th);
                                        x7.d dVar3 = this.f2646n;
                                        p8.b bVar4 = this.f2633k;
                                        bVar4.getClass();
                                        dVar3.onError(p8.d.b(bVar4));
                                        return;
                                    }
                                } else {
                                    this.f2634l = true;
                                    aVar.a(this.f2627b);
                                }
                            } catch (Throwable th2) {
                                com.bumptech.glide.d.v(th2);
                                this.f2628f.cancel();
                                p8.b bVar5 = this.f2633k;
                                bVar5.getClass();
                                p8.d.a(bVar5, th2);
                                x7.d dVar4 = this.f2646n;
                                p8.b bVar6 = this.f2633k;
                                bVar6.getClass();
                                dVar4.onError(p8.d.b(bVar6));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        com.bumptech.glide.d.v(th3);
                        this.f2628f.cancel();
                        p8.b bVar7 = this.f2633k;
                        bVar7.getClass();
                        p8.d.a(bVar7, th3);
                        x7.d dVar5 = this.f2646n;
                        p8.b bVar8 = this.f2633k;
                        bVar8.getClass();
                        dVar5.onError(p8.d.b(bVar8));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // h8.b
    public final void c(Throwable th) {
        p8.b bVar = this.f2633k;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            if (!this.f2647o) {
                this.f2628f.cancel();
                this.f2631i = true;
            }
            this.f2634l = false;
            b();
            return;
        }
        a.a.s(th);
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f2632j) {
            this.f2632j = true;
            this.f2627b.cancel();
            this.f2628f.cancel();
        }
    }

    @Override // n9.b
    public final void d(long j10) {
        this.f2627b.d(j10);
    }

    @Override // h8.b
    public final void h(Object obj) {
        this.f2646n.e(obj);
    }

    @Override // h8.b
    public final void i() {
        this.f2646n.f(this);
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        p8.b bVar = this.f2633k;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            this.f2631i = true;
            b();
        } else {
            a.a.s(th);
        }
    }
}
