package j1;

import android.content.Context;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3103a;

    /* renamed from: b, reason: collision with root package name */
    public c5.e f3104b;
    public w c;

    public /* synthetic */ a(int i10) {
        this.f3103a = i10;
    }

    @Override // j1.v
    public final void a(Context context, i0.a aVar) {
        int i10 = this.f3103a;
    }

    @Override // j1.v
    public final z0.a b() {
        switch (this.f3103a) {
            case 0:
                if (this.f3104b == null) {
                    this.f3104b = new c5.e(20);
                }
                return this.f3104b;
            default:
                if (this.f3104b == null) {
                    this.f3104b = new c5.e(20);
                }
                return this.f3104b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [j1.w, j1.x, java.lang.Object] */
    @Override // j1.v
    public final w d() {
        switch (this.f3103a) {
            case 0:
                if (((c5.e) this.c) == null) {
                    this.c = new c5.e(12);
                }
                return (c5.e) this.c;
            default:
                if (((x) this.c) == null) {
                    ?? obj = new Object();
                    obj.f3240b = true;
                    obj.c = false;
                    this.c = obj;
                }
                return (x) this.c;
        }
    }

    private final void i(Context context, i0.a aVar) {
    }

    private final void j(Context context, i0.a aVar) {
    }
}
