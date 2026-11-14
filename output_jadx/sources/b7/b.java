package b7;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.example.navistart.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f370b;

    public /* synthetic */ b(BarcodeView barcodeView, int i10) {
        this.f369a = i10;
        this.f370b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        android.support.v4.media.h hVar;
        c7.l lVar;
        boolean z9 = false;
        switch (this.f369a) {
            case 0:
                BarcodeView barcodeView = this.f370b;
                int i10 = message.what;
                if (i10 == R.id.zxing_decode_succeeded) {
                    a aVar = (a) message.obj;
                    if (aVar != null && (hVar = barcodeView.C) != null) {
                        z9 = true;
                        if (barcodeView.B != 1) {
                            r5.c cVar = (r5.c) hVar.c;
                            ((j) cVar.c).f399b.f1650b.g();
                            d6.d dVar = ((j) cVar.c).f403i;
                            synchronized (dVar) {
                                if (dVar.f1842a) {
                                    dVar.a();
                                }
                            }
                            ((j) cVar.c).f404j.post(new a1.a(10, cVar, aVar));
                            if (barcodeView.B == 2) {
                                barcodeView.B = 1;
                                barcodeView.C = null;
                                barcodeView.i();
                                return true;
                            }
                        }
                    }
                    z9 = true;
                } else {
                    if (i10 != R.id.zxing_decode_failed) {
                        if (i10 == R.id.zxing_possible_result_points) {
                            List<z5.o> list = (List) message.obj;
                            android.support.v4.media.h hVar2 = barcodeView.C;
                            if (hVar2 != null) {
                                z9 = true;
                                if (barcodeView.B != 1) {
                                    hVar2.getClass();
                                    for (z5.o oVar : list) {
                                        ViewfinderView viewfinderView = ((DecoratedBarcodeView) hVar2.d).c;
                                        if (viewfinderView.f1655h.size() < 20) {
                                            viewfinderView.f1655h.add(oVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z9 = true;
                }
                return z9;
            default:
                BarcodeView barcodeView2 = this.f370b;
                e eVar = barcodeView2.f393z;
                int i11 = message.what;
                if (i11 == R.id.zxing_prewiew_size_ready) {
                    u uVar = (u) message.obj;
                    barcodeView2.f385o = uVar;
                    u uVar2 = barcodeView2.f384n;
                    if (uVar2 != null) {
                        if (uVar != null && (lVar = barcodeView2.f382l) != null) {
                            int i12 = uVar.f424b;
                            int i13 = uVar.c;
                            int i14 = uVar2.f424b;
                            int i15 = uVar2.c;
                            Rect b10 = ((c7.n) lVar.d).b(uVar, (u) lVar.c);
                            if (b10.width() > 0 && b10.height() > 0) {
                                barcodeView2.f386p = b10;
                                Rect rect = new Rect(0, 0, i14, i15);
                                Rect rect2 = barcodeView2.f386p;
                                Rect rect3 = new Rect(rect);
                                rect3.intersect(rect2);
                                if (barcodeView2.t != null) {
                                    rect3.inset(Math.max(0, (rect3.width() - barcodeView2.t.f424b) / 2), Math.max(0, (rect3.height() - barcodeView2.t.c) / 2));
                                } else {
                                    int min = (int) Math.min(rect3.width() * barcodeView2.f389u, rect3.height() * barcodeView2.f389u);
                                    rect3.inset(min, min);
                                    if (rect3.height() > rect3.width()) {
                                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                                    }
                                }
                                barcodeView2.r = rect3;
                                Rect rect4 = new Rect(barcodeView2.r);
                                Rect rect5 = barcodeView2.f386p;
                                rect4.offset(-rect5.left, -rect5.top);
                                Rect rect6 = new Rect((rect4.left * i12) / barcodeView2.f386p.width(), (rect4.top * i13) / barcodeView2.f386p.height(), (rect4.right * i12) / barcodeView2.f386p.width(), (rect4.bottom * i13) / barcodeView2.f386p.height());
                                barcodeView2.f388s = rect6;
                                if (rect6.width() > 0 && barcodeView2.f388s.height() > 0) {
                                    eVar.e();
                                } else {
                                    barcodeView2.f388s = null;
                                    barcodeView2.r = null;
                                    Log.w("f", "Preview frame is too small");
                                }
                            }
                            barcodeView2.requestLayout();
                            barcodeView2.e();
                        } else {
                            barcodeView2.f388s = null;
                            barcodeView2.r = null;
                            barcodeView2.f386p = null;
                            j1.i.l("containerSize or previewSize is not set yet");
                        }
                    }
                    return true;
                }
                if (i11 == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (barcodeView2.f375b != null) {
                        barcodeView2.g();
                        eVar.c(exc);
                    }
                } else if (i11 == R.id.zxing_camera_closed) {
                    eVar.a();
                }
                return false;
        }
    }
}
