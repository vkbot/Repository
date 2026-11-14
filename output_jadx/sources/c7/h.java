package c7;

import android.hardware.Camera;
import android.util.Log;
import b7.u;
import b7.v;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public r5.c f560a;

    /* renamed from: b, reason: collision with root package name */
    public u f561b;
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        u uVar = this.f561b;
        r5.c cVar = this.f560a;
        if (uVar != null && cVar != null) {
            try {
                if (bArr != null) {
                    v vVar = new v(uVar.f424b, uVar.c, camera.getParameters().getPreviewFormat(), this.c.f570k, bArr);
                    if (this.c.f564b.facing == 1) {
                        vVar.e = true;
                    }
                    synchronized (((b7.n) cVar.c).f415h) {
                        try {
                            b7.n nVar = (b7.n) cVar.c;
                            if (nVar.f414g) {
                                nVar.c.obtainMessage(R.id.zxing_decode, vVar).sendToTarget();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                throw new NullPointerException("No preview data received");
            } catch (RuntimeException e) {
                Log.e("i", "Camera preview failed", e);
                cVar.k();
                return;
            }
        }
        Log.d("i", "Got preview callback, but no handler or resolution available");
        if (cVar != null) {
            new Exception("No resolution available");
            cVar.k();
        }
    }
}
