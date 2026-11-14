package b1;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f307b;
    public final /* synthetic */ r c;

    public /* synthetic */ o(r rVar, int i10) {
        this.f307b = i10;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f307b;
        r rVar = this.c;
        switch (i10) {
            case 0:
                rVar.getClass();
                try {
                    WebView webView = rVar.c;
                    if (webView != null) {
                        webView.loadUrl(e0.m.h(new byte[]{-67, 41, 105, 24, -111, 41, 123, -67, -67, 37, 109}, new byte[]{-36, 75, 6, 109, -27, 19, 25, -47}));
                        rVar.c.stopLoading();
                        rVar.c.clearHistory();
                        rVar.c.clearCache(true);
                        rVar.c.removeAllViews();
                        ViewParent parent = rVar.c.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(rVar.c);
                        }
                        rVar.c.destroy();
                        rVar.c = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                r.d(rVar);
                return;
        }
    }
}
