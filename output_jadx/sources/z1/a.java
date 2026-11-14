package z1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6687a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f6687a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            default:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
        }
    }
}
