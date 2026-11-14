package e4;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2167a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2168b;
    public final Context c;
    public final CheckableImageButton d;

    public q(p pVar) {
        this.f2167a = pVar.f2151b;
        this.f2168b = pVar;
        this.c = pVar.getContext();
        this.d = pVar.f2154h;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return this instanceof l;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f2168b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z9) {
    }
}
