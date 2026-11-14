package e4;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2122f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2123g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2124h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2125i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.navigation.c f2126j;

    /* renamed from: k, reason: collision with root package name */
    public final a f2127k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2128l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2129m;

    public d(p pVar) {
        super(pVar);
        this.f2126j = new androidx.navigation.c(7, this);
        this.f2127k = new a(this, 0);
        this.e = com.bumptech.glide.d.q(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2122f = com.bumptech.glide.d.q(pVar.getContext(), R.attr.motionDurationShort3, FTPReply.FILE_STATUS_OK);
        this.f2123g = com.bumptech.glide.d.r(pVar.getContext(), R.attr.motionEasingLinearInterpolator, b3.a.f340a);
        this.f2124h = com.bumptech.glide.d.r(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, b3.a.d);
    }

    @Override // e4.q
    public final void a() {
        if (this.f2168b.f2163q != null) {
            return;
        }
        s(t());
    }

    @Override // e4.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // e4.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // e4.q
    public final View.OnFocusChangeListener e() {
        return this.f2127k;
    }

    @Override // e4.q
    public final View.OnClickListener f() {
        return this.f2126j;
    }

    @Override // e4.q
    public final View.OnFocusChangeListener g() {
        return this.f2127k;
    }

    @Override // e4.q
    public final void l(EditText editText) {
        this.f2125i = editText;
        this.f2167a.setEndIconVisible(t());
    }

    @Override // e4.q
    public final void o(boolean z9) {
        if (this.f2168b.f2163q == null) {
            return;
        }
        s(z9);
    }

    @Override // e4.q
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f2124h);
        ofFloat.setDuration(this.f2122f);
        final int i10 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e4.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2118b;

            {
                this.f2118b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        this.f2118b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f2118b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2123g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.e;
        ofFloat2.setDuration(i11);
        final int i12 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e4.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2118b;

            {
                this.f2118b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        this.f2118b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f2118b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2128l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2128l.addListener(new c(this, i12));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e4.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2118b;

            {
                this.f2118b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        this.f2118b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f2118b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f2129m = ofFloat3;
        ofFloat3.addListener(new c(this, i10));
    }

    @Override // e4.q
    public final void r() {
        EditText editText = this.f2125i;
        if (editText != null) {
            editText.post(new a4.g(25, this));
        }
    }

    public final void s(boolean z9) {
        boolean z10;
        if (this.f2168b.d() == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && !this.f2128l.isRunning()) {
            this.f2129m.cancel();
            this.f2128l.start();
            if (z10) {
                this.f2128l.end();
                return;
            }
            return;
        }
        if (!z9) {
            this.f2128l.cancel();
            this.f2129m.start();
            if (z10) {
                this.f2129m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.f2125i;
        if (editText != null) {
            if ((editText.hasFocus() || this.d.hasFocus()) && this.f2125i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
