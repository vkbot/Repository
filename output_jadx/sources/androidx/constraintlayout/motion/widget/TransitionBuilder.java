package androidx.constraintlayout.motion.widget;

import ai.onnxruntime.b;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TransitionBuilder {
    private static final String TAG = "TransitionBuilder";

    public static MotionScene.Transition buildTransition(MotionScene motionScene, int i10, int i11, ConstraintSet constraintSet, int i12, ConstraintSet constraintSet2) {
        MotionScene.Transition transition = new MotionScene.Transition(i10, motionScene, i11, i12);
        updateConstraintSetInMotionScene(motionScene, transition, constraintSet, constraintSet2);
        return transition;
    }

    private static void updateConstraintSetInMotionScene(MotionScene motionScene, MotionScene.Transition transition, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
    }

    public static void validate(MotionLayout motionLayout) {
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene != null) {
            if (motionScene.validateLayout(motionLayout)) {
                if (motionScene.mCurrentTransition != null && !motionScene.getDefinedTransitions().isEmpty()) {
                    return;
                }
                b.h("Invalid motion layout. Motion Scene doesn't have any transition.");
                return;
            }
            b.h("MotionLayout doesn't have the right motion scene.");
            return;
        }
        b.h("Invalid motion layout. Layout missing Motion Scene.");
    }
}
