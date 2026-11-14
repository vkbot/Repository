package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y0 {
    public static final y0 c = new y0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1646b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final l0 f1645a = new l0();

    public final b1 a(Class cls) {
        b1 w;
        Class cls2;
        b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1646b;
        b1 b1Var = (b1) concurrentHashMap.get(cls);
        if (b1Var == null) {
            l0 l0Var = this.f1645a;
            l0Var.getClass();
            Class cls3 = c1.f1546a;
            if (!y.class.isAssignableFrom(cls) && (cls2 = c1.f1546a) != null && !cls2.isAssignableFrom(cls)) {
                j1.i.k("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                return null;
            }
            a1 a10 = ((k0) l0Var.f1589a).a(cls);
            int i10 = a10.d;
            a aVar = a10.f1529a;
            if ((i10 & 2) == 2) {
                if (y.class.isAssignableFrom(cls)) {
                    w = new u0(c1.c, s.f1609a, aVar);
                } else {
                    k1 k1Var = c1.f1547b;
                    r rVar = s.f1610b;
                    if (rVar != null) {
                        w = new u0(k1Var, rVar, aVar);
                    } else {
                        j1.i.l("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (y.class.isAssignableFrom(cls)) {
                if (com.bumptech.glide.g.c(a10.a()) != 1) {
                    w = t0.w(a10, w0.f1642b, j0.f1582b, c1.c, s.f1609a, q0.f1607b);
                } else {
                    w = t0.w(a10, w0.f1642b, j0.f1582b, c1.c, null, q0.f1607b);
                }
            } else if (com.bumptech.glide.g.c(a10.a()) != 1) {
                v0 v0Var = w0.f1641a;
                h0 h0Var = j0.f1581a;
                k1 k1Var2 = c1.f1547b;
                r rVar2 = s.f1610b;
                if (rVar2 != null) {
                    w = t0.w(a10, v0Var, h0Var, k1Var2, rVar2, q0.f1606a);
                } else {
                    j1.i.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
            } else {
                w = t0.w(a10, w0.f1641a, j0.f1581a, c1.f1547b, null, q0.f1606a);
            }
            b1 b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, w);
            if (b1Var2 != null) {
                return b1Var2;
            }
            return w;
        }
        return b1Var;
    }
}
