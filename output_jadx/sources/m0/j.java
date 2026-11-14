package m0;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3747b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ l0.b e;

    public /* synthetic */ j(l0.b bVar, float f8, Context context, int i10) {
        this.f3747b = i10;
        this.e = bVar;
        this.c = f8;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3747b) {
            case 0:
                o oVar = (o) this.e;
                oVar.f3821b.setLayoutManager(new GridLayoutManager(this.d, Math.max(1, oVar.f3821b.getWidth() / ((int) (this.c * 120.0f)))));
                return;
            default:
                k2 k2Var = (k2) this.e;
                k2Var.d.setLayoutManager(new GridLayoutManager(this.d, Math.max(1, k2Var.d.getWidth() / ((int) (this.c * 120.0f)))));
                return;
        }
    }
}
