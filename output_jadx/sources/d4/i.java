package d4;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import m0.d0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public d0 f1805a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f1806b;
    public CharSequence c;
    public CharSequence d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public View f1807f;

    /* renamed from: g, reason: collision with root package name */
    public TabLayout f1808g;

    /* renamed from: h, reason: collision with root package name */
    public l f1809h;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
            this.f1809h.setContentDescription(charSequence);
        }
        this.c = charSequence;
        l lVar = this.f1809h;
        if (lVar != null) {
            lVar.e();
        }
    }
}
