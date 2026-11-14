package com.google.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f1588b = new v(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1589a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.k0, java.lang.Object] */
    public l0() {
        r0 r0Var;
        try {
            r0Var = (r0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = f1588b;
        }
        r0[] r0VarArr = {v.f1637b, r0Var};
        ?? obj = new Object();
        obj.f1587a = r0VarArr;
        Charset charset = b0.f1535a;
        this.f1589a = obj;
    }

    public void a(int i10, Object obj, b1 b1Var) {
        n nVar = (n) this.f1589a;
        nVar.w(i10, 3);
        b1Var.a((a) obj, nVar.f1597a);
        nVar.w(i10, 4);
    }

    public l0(n nVar) {
        b0.a(nVar, "output");
        this.f1589a = nVar;
        nVar.f1597a = this;
    }
}
