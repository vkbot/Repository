package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1596b = Logger.getLogger(n.class.getName());
    public static final boolean c = s1.e;

    /* renamed from: a, reason: collision with root package name */
    public l0 f1597a;

    public static int a(int i10) {
        if (i10 >= 0) {
            return d(i10);
        }
        return 10;
    }

    public static int b(String str) {
        int length;
        try {
            length = v1.b(str);
        } catch (u1 unused) {
            length = str.getBytes(b0.f1535a).length;
        }
        return d(length) + length;
    }

    public static int c(int i10) {
        return d(i10 << 3);
    }

    public static int d(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int e(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            return i10 + 1;
        }
        return i10;
    }

    public abstract void A(long j10);

    public final void f(String str, u1 u1Var) {
        f1596b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) u1Var);
        byte[] bytes = str.getBytes(b0.f1535a);
        try {
            y(bytes.length);
            r(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new l(e);
        }
    }

    public abstract void g(byte b10);

    public abstract void h(int i10, boolean z9);

    public abstract void i(int i10, byte[] bArr);

    public abstract void j(int i10, g gVar);

    public abstract void k(g gVar);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10);

    public abstract void n(int i10, long j10);

    public abstract void o(long j10);

    public abstract void p(int i10, int i11);

    public abstract void q(int i10);

    public abstract void r(byte[] bArr, int i10, int i11);

    public abstract void s(int i10, a aVar, b1 b1Var);

    public abstract void t(a aVar);

    public abstract void u(int i10, String str);

    public abstract void v(String str);

    public abstract void w(int i10, int i11);

    public abstract void x(int i10, int i11);

    public abstract void y(int i10);

    public abstract void z(int i10, long j10);
}
