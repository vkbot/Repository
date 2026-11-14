package s3;

import android.widget.ImageButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class r extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public int f5711b;

    public final void a(int i10, boolean z9) {
        super.setVisibility(i10);
        if (z9) {
            this.f5711b = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5711b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }
}
