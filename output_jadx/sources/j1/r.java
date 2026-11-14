package j1;

import android.content.Context;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3234a;

    /* renamed from: b, reason: collision with root package name */
    public z0.a f3235b;
    public w c;

    public r(int i10) {
        this.f3234a = i10;
        switch (i10) {
            case 1:
                int i11 = 14;
                this.f3235b = new p2.e(i11);
                this.c = new c5.e(i11);
                return;
            default:
                return;
        }
    }

    @Override // j1.v
    public final void a(Context context, i0.a aVar) {
        int i10 = this.f3234a;
    }

    @Override // j1.v
    public final z0.a b() {
        switch (this.f3234a) {
            case 0:
                if (((p2.e) this.f3235b) == null) {
                    this.f3235b = new p2.e(20);
                }
                return (p2.e) this.f3235b;
            default:
                return (p2.e) this.f3235b;
        }
    }

    @Override // j1.v
    public final w d() {
        switch (this.f3234a) {
            case 0:
                if (((c5.e) this.c) == null) {
                    this.c = new c5.e(12);
                }
                return (c5.e) this.c;
            default:
                return (c5.e) this.c;
        }
    }

    @Override // j1.v
    public final boolean f() {
        switch (this.f3234a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    private final void i(Context context, i0.a aVar) {
    }

    private final void j(Context context, i0.a aVar) {
    }
}
