package w0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6224b;
    public final /* synthetic */ x c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ r(x xVar, String str, int i10, int i11) {
        this.f6224b = i11;
        this.c = xVar;
        this.d = str;
        this.e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6224b) {
            case 0:
                String str = this.d;
                this.c.Z(this.e, str);
                return;
            default:
                String str2 = this.d;
                this.c.Z(this.e, str2);
                return;
        }
    }
}
