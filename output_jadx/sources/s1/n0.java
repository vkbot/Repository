package s1;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n0 extends TextView {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.m f5574b;

    public n0(Context context) {
        super(context);
        this.f5574b = new com.bumptech.glide.m(28, this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bumptech.glide.m mVar = this.f5574b;
        removeCallbacks(mVar);
        mVar.run();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5574b);
        super.onDetachedFromWindow();
    }
}
