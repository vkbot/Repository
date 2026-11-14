package e4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f2151b;
    public final FrameLayout c;
    public final CheckableImageButton d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2152f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f2153g;

    /* renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f2154h;

    /* renamed from: i, reason: collision with root package name */
    public final o f2155i;

    /* renamed from: j, reason: collision with root package name */
    public int f2156j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2157k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2158l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2159m;

    /* renamed from: n, reason: collision with root package name */
    public int f2160n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f2161o;

    /* renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f2162p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2163q;
    public final AppCompatTextView r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2164s;
    public EditText t;

    /* renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f2165u;

    /* renamed from: v, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f2166v;
    public final m w;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, e4.o] */
    public p(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f2156j = 0;
        this.f2157k = new LinkedHashSet();
        this.w = new m(this);
        n nVar = new n(this);
        this.f2165u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2151b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.d = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f2154h = a11;
        ?? obj = new Object();
        obj.c = new SparseArray();
        obj.d = this;
        obj.f2149a = tintTypedArray.getResourceId(28, 0);
        obj.f2150b = tintTypedArray.getResourceId(53, 0);
        this.f2155i = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.r = appCompatTextView;
        if (tintTypedArray.hasValue(38)) {
            this.e = w3.c.b(getContext(), tintTypedArray, 38);
        }
        if (tintTypedArray.hasValue(39)) {
            this.f2152f = s3.q.b(tintTypedArray.getInt(39, -1), null);
        }
        if (tintTypedArray.hasValue(37)) {
            i(tintTypedArray.getDrawable(37));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a10.setImportantForAccessibility(2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setCheckable(false);
        a10.setFocusable(false);
        if (!tintTypedArray.hasValue(54)) {
            if (tintTypedArray.hasValue(32)) {
                this.f2158l = w3.c.b(getContext(), tintTypedArray, 32);
            }
            if (tintTypedArray.hasValue(33)) {
                this.f2159m = s3.q.b(tintTypedArray.getInt(33, -1), null);
            }
        }
        if (tintTypedArray.hasValue(30)) {
            g(tintTypedArray.getInt(30, 0));
            if (tintTypedArray.hasValue(27) && a11.getContentDescription() != (text = tintTypedArray.getText(27))) {
                a11.setContentDescription(text);
            }
            a11.setCheckable(tintTypedArray.getBoolean(26, true));
        } else if (tintTypedArray.hasValue(54)) {
            if (tintTypedArray.hasValue(55)) {
                this.f2158l = w3.c.b(getContext(), tintTypedArray, 55);
            }
            if (tintTypedArray.hasValue(56)) {
                this.f2159m = s3.q.b(tintTypedArray.getInt(56, -1), null);
            }
            g(tintTypedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = tintTypedArray.getText(52);
            if (a11.getContentDescription() != text2) {
                a11.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f2160n) {
                this.f2160n = dimensionPixelSize;
                a11.setMinimumWidth(dimensionPixelSize);
                a11.setMinimumHeight(dimensionPixelSize);
                a10.setMinimumWidth(dimensionPixelSize);
                a10.setMinimumHeight(dimensionPixelSize);
            }
            if (tintTypedArray.hasValue(31)) {
                ImageView.ScaleType d = y5.k.d(tintTypedArray.getInt(31, -1));
                this.f2161o = d;
                a11.setScaleType(d);
                a10.setScaleType(d);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(73, 0));
            if (tintTypedArray.hasValue(74)) {
                appCompatTextView.setTextColor(tintTypedArray.getColorStateList(74));
            }
            CharSequence text3 = tintTypedArray.getText(72);
            this.f2163q = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a11);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f1451g0.add(nVar);
            if (textInputLayout.f1448f != null) {
                nVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new e3.b(2, this));
            return;
        }
        j1.i.k("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (w3.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q eVar;
        int i10 = this.f2156j;
        o oVar = this.f2155i;
        SparseArray sparseArray = (SparseArray) oVar.c;
        q qVar = (q) sparseArray.get(i10);
        if (qVar == null) {
            p pVar = (p) oVar.d;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                eVar = new l(pVar);
                            } else {
                                j1.i.k(ai.onnxruntime.a.e(i10, "Invalid end icon mode: "));
                                return null;
                            }
                        } else {
                            eVar = new d(pVar);
                        }
                    } else {
                        eVar = new x(pVar, oVar.f2150b);
                    }
                } else {
                    eVar = new e(pVar, 1);
                }
            } else {
                eVar = new e(pVar, 0);
            }
            sparseArray.append(i10, eVar);
            return eVar;
        }
        return qVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f2154h;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.r.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.c.getVisibility() == 0 && this.f2154h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z9) {
        boolean z10;
        boolean isActivated;
        boolean z11;
        q b10 = b();
        boolean j10 = b10.j();
        CheckableImageButton checkableImageButton = this.f2154h;
        boolean z12 = true;
        if (j10 && (z11 = checkableImageButton.f1374b) != b10.k()) {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        } else {
            z10 = false;
        }
        if ((b10 instanceof l) && (isActivated = checkableImageButton.isActivated()) != ((l) b10).f2141l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z10;
        }
        if (!z9 && !z12) {
            return;
        }
        y5.k.o(this.f2151b, checkableImageButton, this.f2158l);
    }

    public final void g(int i10) {
        boolean z9;
        Drawable drawable;
        if (this.f2156j == i10) {
            return;
        }
        q b10 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2166v;
        AccessibilityManager accessibilityManager = this.f2165u;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.f2166v = null;
        b10.r();
        this.f2156j = i10;
        Iterator it = this.f2157k.iterator();
        if (!it.hasNext()) {
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            h(z9);
            q b11 = b();
            int i11 = this.f2155i.f2149a;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = AppCompatResources.getDrawable(getContext(), i11);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f2154h;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f2151b;
            if (drawable != null) {
                y5.k.b(textInputLayout, checkableImageButton, this.f2158l, this.f2159m);
                y5.k.o(textInputLayout, checkableImageButton, this.f2158l);
            }
            int c = b11.c();
            if (c != 0) {
                charSequence = getResources().getText(c);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.j());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.q();
                AccessibilityManager.TouchExplorationStateChangeListener h2 = b11.h();
                this.f2166v = h2;
                if (h2 != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.f2166v);
                }
                View.OnClickListener f8 = b11.f();
                View.OnLongClickListener onLongClickListener = this.f2162p;
                checkableImageButton.setOnClickListener(f8);
                y5.k.s(checkableImageButton, onLongClickListener);
                EditText editText = this.t;
                if (editText != null) {
                    b11.l(editText);
                    j(b11);
                }
                y5.k.b(textInputLayout, checkableImageButton, this.f2158l, this.f2159m);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        throw com.bumptech.glide.g.b(it);
    }

    public final void h(boolean z9) {
        int i10;
        if (d() != z9) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f2154h.setVisibility(i10);
            k();
            m();
            this.f2151b.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        y5.k.b(this.f2151b, checkableImageButton, this.e, this.f2152f);
    }

    public final void j(q qVar) {
        if (this.t != null) {
            if (qVar.e() != null) {
                this.t.setOnFocusChangeListener(qVar.e());
            }
            if (qVar.g() != null) {
                this.f2154h.setOnFocusChangeListener(qVar.g());
            }
        }
    }

    public final void k() {
        int i10;
        boolean z9;
        int i11 = 8;
        if (this.f2154h.getVisibility() == 0 && !e()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.c.setVisibility(i10);
        if (this.f2163q != null && !this.f2164s) {
            z9 = false;
        } else {
            z9 = 8;
        }
        if (d() || e() || !z9) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void l() {
        int i10;
        CheckableImageButton checkableImageButton = this.d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2151b;
        if (drawable != null && textInputLayout.f1460l.f2185q && textInputLayout.o()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        k();
        m();
        if (this.f2156j != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i10;
        TextInputLayout textInputLayout = this.f2151b;
        if (textInputLayout.f1448f == null) {
            return;
        }
        if (!d() && !e()) {
            i10 = textInputLayout.f1448f.getPaddingEnd();
        } else {
            i10 = 0;
        }
        this.r.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1448f.getPaddingTop(), i10, textInputLayout.f1448f.getPaddingBottom());
    }

    public final void n() {
        int i10;
        AppCompatTextView appCompatTextView = this.r;
        int visibility = appCompatTextView.getVisibility();
        boolean z9 = false;
        if (this.f2163q != null && !this.f2164s) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            q b10 = b();
            if (i10 == 0) {
                z9 = true;
            }
            b10.o(z9);
        }
        k();
        appCompatTextView.setVisibility(i10);
        this.f2151b.s();
    }
}
