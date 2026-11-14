package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q0 extends s0 {
    public final r0 e;

    public q0(String str, r0 r0Var) {
        super(str, false, r0Var);
        if (!str.endsWith("-bin")) {
            o4.b.i(r0Var, "marshaller");
            this.e = r0Var;
        } else {
            j1.i.k(e3.d.l("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
    }

    @Override // n7.s0
    public final Object a(byte[] bArr) {
        return this.e.j(new String(bArr, i4.b.f2770a));
    }

    @Override // n7.s0
    public final byte[] b(Object obj) {
        String b10 = this.e.b(obj);
        o4.b.i(b10, "null marshaller.toAsciiString()");
        return b10.getBytes(i4.b.f2770a);
    }
}
