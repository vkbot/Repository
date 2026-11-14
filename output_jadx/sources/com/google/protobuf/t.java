package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d1 f1616a = new d1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f1617b;

    static {
        new t(0);
    }

    public t(int i10) {
        a();
        a();
    }

    public static void b(n nVar, a2 a2Var, int i10, Object obj) {
        if (a2Var == a2.e) {
            nVar.w(i10, 3);
            ((a) obj).c(nVar);
            nVar.w(i10, 4);
            return;
        }
        nVar.w(i10, a2Var.c);
        switch (a2Var.ordinal()) {
            case 0:
                nVar.o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                nVar.m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                nVar.A(((Long) obj).longValue());
                return;
            case 3:
                nVar.A(((Long) obj).longValue());
                return;
            case 4:
                nVar.q(((Integer) obj).intValue());
                return;
            case 5:
                nVar.o(((Long) obj).longValue());
                return;
            case 6:
                nVar.m(((Integer) obj).intValue());
                return;
            case 7:
                nVar.g(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof g) {
                    nVar.k((g) obj);
                    return;
                } else {
                    nVar.v((String) obj);
                    return;
                }
            case 9:
                ((a) obj).c(nVar);
                return;
            case 10:
                nVar.t((a) obj);
                return;
            case 11:
                if (obj instanceof g) {
                    nVar.k((g) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    nVar.i(bArr.length, bArr);
                    return;
                }
            case 12:
                nVar.y(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof z) {
                    nVar.q(((z) obj).a());
                    return;
                } else {
                    nVar.q(((Integer) obj).intValue());
                    return;
                }
            case 14:
                nVar.m(((Integer) obj).intValue());
                return;
            case 15:
                nVar.o(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                nVar.y((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                nVar.A((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        d1 d1Var;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f1617b) {
            return;
        }
        int i10 = 0;
        while (true) {
            d1Var = this.f1616a;
            if (i10 >= d1Var.c.size()) {
                break;
            }
            Map.Entry c10 = d1Var.c(i10);
            if (c10.getValue() instanceof y) {
                y yVar = (y) c10.getValue();
                yVar.getClass();
                y0 y0Var = y0.c;
                y0Var.getClass();
                y0Var.a(yVar.getClass()).c(yVar);
                yVar.j();
            }
            i10++;
        }
        if (!d1Var.e) {
            if (d1Var.c.size() <= 0) {
                Iterator it = d1Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    n0.b.a();
                    return;
                }
            } else {
                d1Var.c(0).getKey().getClass();
                n0.b.a();
                return;
            }
        }
        if (!d1Var.e) {
            if (d1Var.d.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(d1Var.d);
            }
            d1Var.d = unmodifiableMap;
            if (d1Var.f1553g.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(d1Var.f1553g);
            }
            d1Var.f1553g = unmodifiableMap2;
            d1Var.e = true;
        }
        this.f1617b = true;
    }

    public final Object clone() {
        t tVar = new t();
        d1 d1Var = this.f1616a;
        if (d1Var.c.size() <= 0) {
            Iterator it = d1Var.d().iterator();
            if (!it.hasNext()) {
                return tVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                n0.b.a();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry c10 = d1Var.c(0);
        if (c10.getKey() != null) {
            n0.b.a();
            return null;
        }
        c10.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f1616a.equals(((t) obj).f1616a);
    }

    public final int hashCode() {
        return this.f1616a.hashCode();
    }

    public t() {
    }
}
