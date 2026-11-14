package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Supplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199b;
    public final /* synthetic */ ViewConfiguration c;

    public /* synthetic */ k(ViewConfiguration viewConfiguration, int i10) {
        this.f199b = i10;
        this.c = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        int scaledMaximumFlingVelocity;
        switch (this.f199b) {
            case 0:
                scaledMaximumFlingVelocity = this.c.getScaledMaximumFlingVelocity();
                break;
            default:
                scaledMaximumFlingVelocity = this.c.getScaledMinimumFlingVelocity();
                break;
        }
        return Integer.valueOf(scaledMaximumFlingVelocity);
    }
}
