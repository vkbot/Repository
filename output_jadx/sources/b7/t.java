package b7;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f423a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, Context context) {
        super(context, 3);
        this.f423a = pVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        int rotation;
        p pVar = this.f423a;
        WindowManager windowManager = (WindowManager) pVar.c;
        r5.c cVar = (r5.c) pVar.e;
        if (windowManager != null && cVar != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != pVar.f420b) {
            pVar.f420b = rotation;
            ((BarcodeView) cVar.c).d.postDelayed(new a4.g(5, cVar), 250L);
        }
    }
}
