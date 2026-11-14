package a4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.u;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27b;
    public final SideSheetBehavior c;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f27b = i10;
        this.c = sideSheetBehavior;
    }

    @Override // b1.u
    public final void C(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        switch (this.f27b) {
            case 0:
                if (i10 <= this.c.f1409m) {
                    marginLayoutParams.leftMargin = i11;
                    return;
                }
                return;
            default:
                int i12 = this.c.f1409m;
                if (i10 <= i12) {
                    marginLayoutParams.rightMargin = i12 - i10;
                    return;
                }
                return;
        }
    }

    @Override // b1.u
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f27b) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // b1.u
    public final float b(int i10) {
        switch (this.f27b) {
            case 0:
                float k6 = k();
                return (i10 - k6) / (j() - k6);
            default:
                float f8 = this.c.f1409m;
                return (f8 - i10) / (f8 - j());
        }
    }

    @Override // b1.u
    public final int j() {
        switch (this.f27b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.c;
                return Math.max(0, sideSheetBehavior.f1410n + sideSheetBehavior.f1411o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.c;
                return Math.max(0, (sideSheetBehavior2.f1409m - sideSheetBehavior2.f1408l) - sideSheetBehavior2.f1411o);
        }
    }

    @Override // b1.u
    public final int k() {
        switch (this.f27b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.c;
                return (-sideSheetBehavior.f1408l) - sideSheetBehavior.f1411o;
            default:
                return this.c.f1409m;
        }
    }

    @Override // b1.u
    public final int l() {
        switch (this.f27b) {
            case 0:
                return this.c.f1411o;
            default:
                return this.c.f1409m;
        }
    }

    @Override // b1.u
    public final int m() {
        switch (this.f27b) {
            case 0:
                return -this.c.f1408l;
            default:
                return j();
        }
    }

    @Override // b1.u
    public final int n(View view) {
        switch (this.f27b) {
            case 0:
                return view.getRight() + this.c.f1411o;
            default:
                return view.getLeft() - this.c.f1411o;
        }
    }

    @Override // b1.u
    public final int o(CoordinatorLayout coordinatorLayout) {
        switch (this.f27b) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // b1.u
    public final int p() {
        switch (this.f27b) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // b1.u
    public final boolean s(float f8) {
        switch (this.f27b) {
            case 0:
                if (f8 > 0.0f) {
                    return true;
                }
                return false;
            default:
                if (f8 < 0.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // b1.u
    public final boolean t(View view) {
        switch (this.f27b) {
            case 0:
                if (view.getRight() < (j() - k()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (j() + this.c.f1409m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // b1.u
    public final boolean u(float f8, float f10) {
        switch (this.f27b) {
            case 0:
                if (Math.abs(f8) > Math.abs(f10) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f8) > Math.abs(f10) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
        }
    }

    @Override // b1.u
    public final boolean x(View view, float f8) {
        switch (this.f27b) {
            case 0:
                if (Math.abs((f8 * this.c.f1407k) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f8 * this.c.f1407k) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }
}
