package androidx.constraintlayout.core.dsl;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class KeyPositions extends Keys {
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing = null;
    private Type mPositionType = null;
    private float[] mPercentWidth = null;
    private float[] mPercentHeight = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int i10, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        this.mFrames = new int[i10];
        float length = 100.0f / (r3.length + 1);
        int i11 = 0;
        while (true) {
            int[] iArr = this.mFrames;
            if (i11 < iArr.length) {
                iArr[i11] = (int) ((i11 * length) + length);
                i11++;
            } else {
                return;
            }
        }
    }

    public int[] getFrames() {
        return this.mFrames;
    }

    public float[] getPercentHeight() {
        return this.mPercentHeight;
    }

    public float[] getPercentWidth() {
        return this.mPercentWidth;
    }

    public float[] getPercentX() {
        return this.mPercentX;
    }

    public float[] getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int... iArr) {
        this.mFrames = iArr;
    }

    public void setPercentHeight(float... fArr) {
        this.mPercentHeight = fArr;
    }

    public void setPercentWidth(float... fArr) {
        this.mPercentWidth = fArr;
    }

    public void setPercentX(float... fArr) {
        this.mPercentX = fArr;
    }

    public void setPercentY(float... fArr) {
        this.mPercentY = fArr;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder u8 = a.u("KeyPositions:{\n");
        append(u8, TypedValues.AttributesType.S_TARGET, this.mTarget);
        u8.append("frame:");
        u8.append(Arrays.toString(this.mFrames));
        u8.append(",\n");
        if (this.mPositionType != null) {
            u8.append("type:'");
            u8.append(this.mPositionType);
            u8.append("',\n");
        }
        append(u8, "easing", this.mTransitionEasing);
        append(u8, "percentX", this.mPercentX);
        append(u8, "percentX", this.mPercentY);
        append(u8, "percentWidth", this.mPercentWidth);
        append(u8, "percentHeight", this.mPercentHeight);
        u8.append("},\n");
        return u8.toString();
    }
}
