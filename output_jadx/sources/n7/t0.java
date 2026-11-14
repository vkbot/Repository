package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t0 extends s0 {
    public final u0 e;

    public t0(String str, boolean z9, u0 u0Var) {
        super(str, z9, u0Var);
        if (!str.endsWith("-bin")) {
            this.e = u0Var;
        } else {
            j1.i.k(e3.d.l("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
    }

    @Override // n7.s0
    public final Object a(byte[] bArr) {
        return this.e.k(bArr);
    }

    @Override // n7.s0
    public final byte[] b(Object obj) {
        byte[] mo1561b = this.e.mo1561b(obj);
        o4.b.i(mo1561b, "null marshaller.toAsciiString()");
        return mo1561b;
    }
}
