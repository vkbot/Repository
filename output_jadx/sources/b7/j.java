package b7;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.example.navistart.R;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f397n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f398a;

    /* renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f399b;

    /* renamed from: h, reason: collision with root package name */
    public final d6.g f402h;

    /* renamed from: i, reason: collision with root package name */
    public final d6.d f403i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f404j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f407m;
    public int c = -1;
    public boolean d = false;
    public boolean e = true;

    /* renamed from: f, reason: collision with root package name */
    public String f400f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f401g = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f405k = false;

    /* renamed from: l, reason: collision with root package name */
    public final r5.c f406l = new r5.c(2, this);

    /* JADX WARN: Type inference failed for: r5v5, types: [d6.d, java.lang.Object] */
    public j(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        e eVar = new e(1, this);
        this.f407m = false;
        this.f398a = captureActivity;
        this.f399b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f381k.add(eVar);
        this.f404j = new Handler();
        this.f402h = new d6.g(captureActivity, new g(this, 0));
        ?? obj = new Object();
        obj.f1842a = true;
        captureActivity.setVolumeControlStream(3);
        obj.f1843b = captureActivity.getApplicationContext();
        this.f403i = obj;
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f399b;
        c7.g gVar = decoratedBarcodeView.getBarcodeView().f375b;
        if (gVar != null && !gVar.f554g) {
            this.f405k = true;
        } else {
            this.f398a.finish();
        }
        decoratedBarcodeView.f1650b.g();
        this.f402h.a();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.f398a;
        if (!captureActivity.isFinishing() && !this.f401g && !this.f405k) {
            if (str.isEmpty()) {
                str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
            builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(R.string.zxing_button_ok, new h(0, this));
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: b7.i
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    j.this.f398a.finish();
                }
            });
            builder.show();
        }
    }
}
