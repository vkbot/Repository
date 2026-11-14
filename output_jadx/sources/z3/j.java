package z3;

import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    public final int f6763a;

    public j(int i10) {
        super(ai.onnxruntime.a.e(i10, "cornerSizeAtIndex"));
        this.f6763a = i10;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        float[] fArr = ((k) obj).D;
        if (fArr != null) {
            return fArr[this.f6763a];
        }
        return 0.0f;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f8) {
        k kVar = (k) obj;
        float[] fArr = kVar.D;
        if (fArr != null) {
            int i10 = this.f6763a;
            if (fArr[i10] != f8) {
                fArr[i10] = f8;
                i iVar = kVar.F;
                if (iVar != null) {
                    float i11 = kVar.i();
                    MaterialButton materialButton = (MaterialButton) ((androidx.fragment.app.h) iVar).c;
                    int i12 = (int) (i11 * 0.11f);
                    if (materialButton.f1262v != i12) {
                        materialButton.f1262v = i12;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                kVar.invalidateSelf();
            }
        }
    }
}
