package k3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Animatable2Compat.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3396a;

    public a(c cVar) {
        this.f3396a = cVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ColorStateList colorStateList = this.f3396a.f3408l;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        super.onAnimationStart(drawable);
        c cVar = this.f3396a;
        ColorStateList colorStateList = cVar.f3408l;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f3412p, colorStateList.getDefaultColor()));
        }
    }
}
