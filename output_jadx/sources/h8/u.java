package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends n8.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2712g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(e8.a aVar, Object obj, int i10) {
        super(aVar);
        this.f2712g = i10;
        this.f2713h = obj;
    }

    @Override // x7.d
    public final void e(Object obj) {
        switch (this.f2712g) {
            case 0:
                if (!g(obj)) {
                    this.c.d(1L);
                    return;
                }
                return;
            default:
                if (!this.e) {
                    int i10 = this.f4264f;
                    e8.a aVar = this.f4263b;
                    if (i10 != 0) {
                        aVar.e(null);
                        return;
                    }
                    try {
                        Object apply = ((b8.c) this.f2713h).apply(obj);
                        d8.b.a(apply, "The mapper function returned a null value.");
                        aVar.e(apply);
                        return;
                    } catch (Throwable th) {
                        b(th);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r1.g(r4) != false) goto L23;
     */
    @Override // e8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f2712g
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.e
            if (r0 == 0) goto Lb
            r4 = 0
            goto L24
        Lb:
            java.lang.Object r0 = r3.f2713h     // Catch: java.lang.Throwable -> L1f
            b8.c r0 = (b8.c) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "The mapper function returned a null value."
            d8.b.a(r4, r0)     // Catch: java.lang.Throwable -> L1f
            e8.a r0 = r3.f4263b
            boolean r4 = r0.g(r4)
            goto L24
        L1f:
            r4 = move-exception
            r3.b(r4)
            r4 = 1
        L24:
            return r4
        L25:
            boolean r0 = r3.e
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            int r0 = r3.f4264f
            e8.a r1 = r3.f4263b
            if (r0 == 0) goto L36
            r4 = 0
            boolean r4 = r1.g(r4)
            goto L50
        L36:
            r0 = 1
            java.lang.Object r2 = r3.f2713h     // Catch: java.lang.Throwable -> L4b
            b8.d r2 = (b8.d) r2     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L49
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L49
        L47:
            r4 = r0
            goto L50
        L49:
            r4 = 0
            goto L50
        L4b:
            r4 = move-exception
            r3.b(r4)
            goto L47
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.u.g(java.lang.Object):boolean");
    }

    @Override // e8.g
    public final Object poll() {
        switch (this.f2712g) {
            case 0:
                e8.d dVar = this.d;
                b8.d dVar2 = (b8.d) this.f2713h;
                while (true) {
                    Object poll = dVar.poll();
                    if (poll == null) {
                        return null;
                    }
                    if (dVar2.test(poll)) {
                        return poll;
                    }
                    if (this.f4264f == 2) {
                        dVar.d(1L);
                    }
                }
            default:
                Object poll2 = this.d.poll();
                if (poll2 != null) {
                    Object apply = ((b8.c) this.f2713h).apply(poll2);
                    d8.b.a(apply, "The mapper function returned a null value.");
                    return apply;
                }
                return null;
        }
    }
}
