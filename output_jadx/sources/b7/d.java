package b7;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f372a;

    public d(BarcodeView barcodeView) {
        this.f372a = barcodeView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder == null) {
            int i13 = f.A;
            Log.e("f", "*** WARNING *** surfaceChanged() gave us a null surface!");
        } else {
            u uVar = new u(i11, i12);
            BarcodeView barcodeView = this.f372a;
            barcodeView.f387q = uVar;
            barcodeView.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f372a.f387q = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
