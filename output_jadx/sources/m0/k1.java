package m0;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f3760a;

    public k1(l1 l1Var) {
        this.f3760a = l1Var;
    }

    @JavascriptInterface
    public void Exit() {
        this.f3760a.requireActivity().finish();
    }

    public final boolean a() {
        String url = this.f3760a.c.getUrl();
        if (url != null && url.startsWith(e0.m.h(new byte[]{49, -79, -127, -67, -118, -10, -2, -72, 51, -90, -108, -65, -115, -93, -66, -5, 42, -21, -121, -72}, new byte[]{89, -59, -11, -51, -7, -52, -47, -105}))) {
            return false;
        }
        return true;
    }

    @JavascriptInterface
    public void createMeeting(String str) {
        this.f3760a.requireActivity().runOnUiThread(new j1(this, str, 2));
    }

    @JavascriptInterface
    public void getProfile() {
        h0.b.a().j().gv(new androidx.fragment.app.h(22, this));
    }

    @JavascriptInterface
    public void joinMeeting(String str) {
        this.f3760a.requireActivity().runOnUiThread(new j1(this, str, 0));
    }

    @JavascriptInterface
    public void updateProfile(String str) {
        this.f3760a.requireActivity().runOnUiThread(new j1(this, str, 1));
    }
}
