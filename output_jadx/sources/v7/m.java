package v7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5968a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5969b;
    public final n7.e c;

    public m(o oVar, n7.e eVar, int i10) {
        boolean z9;
        this.f5968a = i10;
        switch (i10) {
            case 1:
                if (oVar.e != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o4.b.d("success rate ejection config is null", z9);
                this.f5969b = oVar;
                this.c = eVar;
                return;
            default:
                this.f5969b = oVar;
                this.c = eVar;
                return;
        }
    }
}
