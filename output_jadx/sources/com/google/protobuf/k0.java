package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public r0[] f1587a;

    @Override // com.google.protobuf.r0
    public final a1 a(Class cls) {
        for (r0 r0Var : this.f1587a) {
            if (r0Var.b(cls)) {
                return r0Var.a(cls);
            }
        }
        androidx.navigation.b.g("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.protobuf.r0
    public final boolean b(Class cls) {
        for (r0 r0Var : this.f1587a) {
            if (r0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
