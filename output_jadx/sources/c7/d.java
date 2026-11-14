package c7;

import android.hardware.Camera;
import android.util.Log;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f547b;
    public final /* synthetic */ g c;
    public final /* synthetic */ r5.c d;

    public /* synthetic */ d(g gVar, r5.c cVar, int i10) {
        this.f547b = i10;
        this.c = gVar;
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f547b;
        r5.c cVar = this.d;
        g gVar = this.c;
        switch (i10) {
            case 0:
                if (!gVar.f553f) {
                    Log.d("g", "Camera is closed, not requesting preview");
                    return;
                } else {
                    gVar.f551a.d(new d(gVar, cVar, 1));
                    return;
                }
            default:
                i iVar = gVar.c;
                Camera camera = iVar.f563a;
                if (camera != null && iVar.e) {
                    h hVar = iVar.f571l;
                    hVar.f560a = cVar;
                    camera.setOneShotPreviewCallback(hVar);
                    return;
                }
                return;
        }
    }
}
