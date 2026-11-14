package o2;

import androidx.recyclerview.widget.OrientationHelper;
import com.google.android.flexbox.FlexboxLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4331a;

    /* renamed from: b, reason: collision with root package name */
    public int f4332b;
    public int c;
    public int d = 0;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4333f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f4335h;

    public f(FlexboxLayoutManager flexboxLayoutManager) {
        this.f4335h = flexboxLayoutManager;
    }

    public static void a(f fVar) {
        int startAfterPadding;
        int width;
        FlexboxLayoutManager flexboxLayoutManager = fVar.f4335h;
        if (!flexboxLayoutManager.i() && flexboxLayoutManager.f1147f) {
            if (fVar.e) {
                width = flexboxLayoutManager.f1155n.getEndAfterPadding();
            } else {
                width = flexboxLayoutManager.getWidth() - flexboxLayoutManager.f1155n.getStartAfterPadding();
            }
            fVar.c = width;
            return;
        }
        boolean z9 = fVar.e;
        OrientationHelper orientationHelper = flexboxLayoutManager.f1155n;
        if (z9) {
            startAfterPadding = orientationHelper.getEndAfterPadding();
        } else {
            startAfterPadding = orientationHelper.getStartAfterPadding();
        }
        fVar.c = startAfterPadding;
    }

    public static void b(f fVar) {
        fVar.f4331a = -1;
        fVar.f4332b = -1;
        fVar.c = Integer.MIN_VALUE;
        boolean z9 = false;
        fVar.f4333f = false;
        fVar.f4334g = false;
        FlexboxLayoutManager flexboxLayoutManager = fVar.f4335h;
        boolean i10 = flexboxLayoutManager.i();
        int i11 = flexboxLayoutManager.c;
        if (i10) {
            if (i11 == 0) {
                if (flexboxLayoutManager.f1146b == 1) {
                    z9 = true;
                }
                fVar.e = z9;
                return;
            } else {
                if (i11 == 2) {
                    z9 = true;
                }
                fVar.e = z9;
                return;
            }
        }
        if (i11 == 0) {
            if (flexboxLayoutManager.f1146b == 3) {
                z9 = true;
            }
            fVar.e = z9;
        } else {
            if (i11 == 2) {
                z9 = true;
            }
            fVar.e = z9;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f4331a + ", mFlexLinePosition=" + this.f4332b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f4333f + ", mAssignedFromSavedState=" + this.f4334g + '}';
    }
}
