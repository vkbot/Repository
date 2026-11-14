package i7;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2787b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, float f8, int i10) {
        this.f2787b = i10;
        this.d = obj;
        this.c = f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2787b) {
            case 0:
                w wVar = ((g) this.d).f2796k;
                if (wVar != null) {
                    wVar.a(this.c);
                    return;
                }
                return;
            case 1:
                m0.v vVar = (m0.v) this.d;
                vVar.d.setLayoutManager(new GridLayoutManager(vVar.requireContext(), Math.max(1, vVar.d.getWidth() / ((int) (this.c * 280.0f)))));
                vVar.d.setAdapter(vVar.e);
                return;
            default:
                v0.d dVar = (v0.d) this.d;
                dVar.c.k(this.c);
                return;
        }
    }
}
