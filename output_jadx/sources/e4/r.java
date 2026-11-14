package e4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2170b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ t e;

    public r(t tVar, int i10, TextView textView, int i11, TextView textView2) {
        this.e = tVar;
        this.f2169a = i10;
        this.f2170b = textView;
        this.c = i11;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.f2169a;
        t tVar = this.e;
        tVar.f2182n = i10;
        tVar.f2180l = null;
        TextView textView = this.f2170b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (appCompatTextView = tVar.r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
