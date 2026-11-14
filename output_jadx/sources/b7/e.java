package b7;

import android.graphics.Rect;
import android.util.Log;
import com.example.navistart.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f374b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f373a = i10;
        this.f374b = obj;
    }

    public final void a() {
        int i10 = this.f373a;
        Object obj = this.f374b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ((BarcodeView) obj).f381k;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((e) obj2).a();
                }
                return;
            case 1:
                j jVar = (j) obj;
                if (jVar.f405k) {
                    Log.d("j", "Camera closed; finishing activity");
                    jVar.f398a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Exception exc) {
        switch (this.f373a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f374b).f381k;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((e) obj).c(exc);
                }
                return;
            case 1:
                j jVar = (j) this.f374b;
                jVar.b(jVar.f398a.getString(R.string.zxing_msg_camera_framework_bug));
                return;
            default:
                return;
        }
    }

    public final void e() {
        switch (this.f373a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f374b).f381k;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((e) obj).e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f374b;
                f fVar = viewfinderView.f1657j;
                if (fVar != null) {
                    Rect framingRect = fVar.getFramingRect();
                    u previewSize = viewfinderView.f1657j.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f1658k = framingRect;
                        viewfinderView.f1659l = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    public final void g() {
        switch (this.f373a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f374b).f381k;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((e) obj).g();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    public final void j() {
        switch (this.f373a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f374b).f381k;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((e) obj).j();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void d(Exception exc) {
    }
}
