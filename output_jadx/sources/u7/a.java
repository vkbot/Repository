package u7;

import com.bumptech.glide.manager.s;
import m4.m;
import n7.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: i, reason: collision with root package name */
    public final t f5900i;

    public a(t tVar) {
        this.f5900i = tVar;
    }

    @Override // m4.m
    public final void g() {
        this.f5900i.a("GrpcFuture was cancelled", null);
    }

    @Override // m4.m
    public final String h() {
        s t = com.bumptech.glide.c.t(this);
        t.c(this.f5900i, "clientCall");
        return t.toString();
    }
}
