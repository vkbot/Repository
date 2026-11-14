package v3;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends AppCompatRadioButton {
    public static final int[][] d = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f5939b;
    public boolean c;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5939b == null) {
            int a10 = m3.a.a(androidx.appcompat.R.attr.colorControlActivated, this);
            int a11 = m3.a.a(com.example.navistart.R.attr.colorOnSurface, this);
            int a12 = m3.a.a(com.example.navistart.R.attr.colorSurface, this);
            this.f5939b = new ColorStateList(d, new int[]{m3.a.c(1.0f, a12, a10), m3.a.c(0.54f, a12, a11), m3.a.c(0.38f, a12, a11), m3.a.c(0.38f, a12, a11)});
        }
        return this.f5939b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.c = z9;
        if (z9) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }
}
