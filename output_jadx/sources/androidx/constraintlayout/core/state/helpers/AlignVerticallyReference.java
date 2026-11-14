package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AlignVerticallyReference extends HelperReference {
    private float mBias;

    public AlignVerticallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ConstraintReference constraints = this.mHelperState.constraints(obj);
            constraints.clearVertical();
            Object obj2 = this.mTopToTop;
            if (obj2 != null) {
                constraints.topToTop(obj2);
            } else {
                Object obj3 = this.mTopToBottom;
                if (obj3 != null) {
                    constraints.topToBottom(obj3);
                } else {
                    constraints.topToTop(State.PARENT);
                }
            }
            Object obj4 = this.mBottomToTop;
            if (obj4 != null) {
                constraints.bottomToTop(obj4);
            } else {
                Object obj5 = this.mBottomToBottom;
                if (obj5 != null) {
                    constraints.bottomToBottom(obj5);
                } else {
                    constraints.bottomToBottom(State.PARENT);
                }
            }
            float f8 = this.mBias;
            if (f8 != 0.5f) {
                constraints.verticalBias(f8);
            }
        }
    }
}
