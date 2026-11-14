package l9;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class y implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final n f3587b;
    public final l c;
    public b0 d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3588f;

    /* renamed from: g, reason: collision with root package name */
    public long f3589g;

    public y(n nVar) {
        int i10;
        this.f3587b = nVar;
        l a10 = nVar.a();
        this.c = a10;
        b0 b0Var = a10.f3577b;
        this.d = b0Var;
        if (b0Var != null) {
            i10 = b0Var.f3561b;
        } else {
            i10 = -1;
        }
        this.e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3588f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.f3561b) goto L16;
     */
    @Override // l9.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(l9.l r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r8.f3588f
            if (r3 != 0) goto L61
            l9.b0 r3 = r8.d
            l9.l r4 = r8.c
            if (r3 == 0) goto L29
            l9.b0 r5 = r4.f3577b
            if (r3 != r5) goto L21
            int r3 = r8.e
            r5.getClass()
            int r5 = r5.f3561b
            if (r3 != r5) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            j1.i.l(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            long r0 = r8.f3589g
            r2 = 1
            long r0 = r0 + r2
            l9.n r2 = r8.f3587b
            boolean r0 = r2.d(r0)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            l9.b0 r0 = r8.d
            if (r0 != 0) goto L4a
            l9.b0 r0 = r4.f3577b
            if (r0 == 0) goto L4a
            r8.d = r0
            int r0 = r0.f3561b
            r8.e = r0
        L4a:
            long r0 = r4.c
            long r2 = r8.f3589g
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            l9.l r2 = r8.c
            long r3 = r8.f3589g
            r5 = r9
            r2.S(r3, r5, r6)
            long r9 = r8.f3589g
            long r9 = r9 + r6
            r8.f3589g = r9
            return r6
        L61:
            java.lang.String r9 = "closed"
            j1.i.l(r9)
            goto L26
        L67:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = ai.onnxruntime.a.h(r10, r9)
            l9.i.d(r9)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.y.read(l9.l, long):long");
    }

    @Override // l9.g0
    public final j0 timeout() {
        return this.f3587b.timeout();
    }
}
