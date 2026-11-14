package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4619b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10, int i11) {
        this.f4619b = i11;
        this.d = obj;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4619b) {
            case 0:
                ((k0) this.d).d.m(this.c);
                return;
            case 1:
                ((k0) this.d).d.c(this.c);
                return;
            default:
                ((com.google.android.material.datepicker.n) this.d).f1318i.smoothScrollToPosition(this.c);
                return;
        }
    }
}
