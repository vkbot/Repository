package e4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2135f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2136g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2137h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.navigation.c f2138i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2139j;

    /* renamed from: k, reason: collision with root package name */
    public final k f2140k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2141l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2142m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2143n;

    /* renamed from: o, reason: collision with root package name */
    public long f2144o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2145p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2146q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [e4.k] */
    public l(p pVar) {
        super(pVar);
        this.f2138i = new androidx.navigation.c(8, this);
        this.f2139j = new a(this, 1);
        this.f2140k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: e4.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z9) {
                int i10;
                l lVar = l.this;
                AutoCompleteTextView autoCompleteTextView = lVar.f2137h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = lVar.d;
                if (z9) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                checkableImageButton.setImportantForAccessibility(i10);
            }
        };
        this.f2144o = Long.MAX_VALUE;
        this.f2135f = com.bumptech.glide.d.q(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = com.bumptech.glide.d.q(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f2136g = com.bumptech.glide.d.r(pVar.getContext(), R.attr.motionEasingLinearInterpolator, b3.a.f340a);
    }

    @Override // e4.q
    public final void a() {
        if (this.f2145p.isTouchExplorationEnabled() && this.f2137h.getInputType() != 0 && !this.d.hasFocus()) {
            this.f2137h.dismissDropDown();
        }
        this.f2137h.post(new a4.g(26, this));
    }

    @Override // e4.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // e4.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // e4.q
    public final View.OnFocusChangeListener e() {
        return this.f2139j;
    }

    @Override // e4.q
    public final View.OnClickListener f() {
        return this.f2138i;
    }

    @Override // e4.q
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f2140k;
    }

    @Override // e4.q
    public final boolean i(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    @Override // e4.q
    public final boolean k() {
        return this.f2143n;
    }

    @Override // e4.q
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f2137h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new i(0, this));
            this.f2137h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: e4.j
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    l lVar = l.this;
                    lVar.f2142m = true;
                    lVar.f2144o = SystemClock.uptimeMillis();
                    lVar.s(false);
                }
            });
            this.f2137h.setThreshold(0);
            TextInputLayout textInputLayout = this.f2167a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.f2145p.isTouchExplorationEnabled()) {
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        ai.onnxruntime.b.h("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // e4.q
    public final void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f2137h.getInputType() == 0) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // e4.q
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z9;
        if (!this.f2145p.isEnabled() || this.f2137h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2143n && !this.f2137h.isPopupShowing()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z9) {
            t();
            this.f2142m = true;
            this.f2144o = SystemClock.uptimeMillis();
        }
    }

    @Override // e4.q
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2136g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2135f);
        ofFloat.addUpdateListener(new h(0, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new h(0, this));
        this.f2146q = ofFloat2;
        ofFloat2.addListener(new e3.c(2, this));
        this.f2145p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // e4.q
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f2137h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2137h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z9) {
        if (this.f2143n != z9) {
            this.f2143n = z9;
            this.r.cancel();
            this.f2146q.start();
        }
    }

    public final void t() {
        if (this.f2137h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f2144o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f2142m = false;
        }
        if (!this.f2142m) {
            s(!this.f2143n);
            boolean z9 = this.f2143n;
            AutoCompleteTextView autoCompleteTextView = this.f2137h;
            if (z9) {
                autoCompleteTextView.requestFocus();
                this.f2137h.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f2142m = false;
    }
}
