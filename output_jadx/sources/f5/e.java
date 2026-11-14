package f5;

import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements b8.b, b8.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2279b;
    public final /* synthetic */ g c;

    public /* synthetic */ e(g gVar, int i10) {
        this.f2279b = i10;
        this.c = gVar;
    }

    @Override // b8.b
    public void accept(Object obj) {
        switch (this.f2279b) {
            case 0:
                this.c.d = (y5.i) obj;
                return;
            default:
                this.c.d = null;
                return;
        }
    }

    @Override // b8.d
    public boolean test(Object obj) {
        g gVar = this.c;
        gVar.getClass();
        long p9 = ((y5.i) obj).p();
        gVar.c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(gVar.f2283b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (p9 != 0) {
            if (currentTimeMillis >= p9) {
                return false;
            }
            return true;
        }
        if (file.exists() && currentTimeMillis >= file.lastModified() + 86400000) {
            return false;
        }
        return true;
    }
}
