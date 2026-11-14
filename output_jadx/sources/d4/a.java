package d4;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends c5.e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(4);
        this.c = i10;
    }

    @Override // c5.e
    public final void u(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        float sin;
        float cos;
        float b10;
        switch (this.c) {
            case 0:
                RectF p9 = c5.e.p(tabLayout, view);
                RectF p10 = c5.e.p(tabLayout, view2);
                if (p9.left < p10.left) {
                    double d = (f8 * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d10 = (f8 * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d10);
                    cos = (float) (1.0d - Math.cos(d10));
                }
                drawable.setBounds(b3.a.c(sin, (int) p9.left, (int) p10.left), drawable.getBounds().top, b3.a.c(cos, (int) p9.right, (int) p10.right), drawable.getBounds().bottom);
                return;
            default:
                if (f8 >= 0.5f) {
                    view = view2;
                }
                RectF p11 = c5.e.p(tabLayout, view);
                if (f8 < 0.5f) {
                    b10 = b3.a.b(1.0f, 0.0f, 0.0f, 0.5f, f8);
                } else {
                    b10 = b3.a.b(0.0f, 1.0f, 0.5f, 1.0f, f8);
                }
                drawable.setBounds((int) p11.left, drawable.getBounds().top, (int) p11.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b10 * 255.0f));
                return;
        }
    }
}
