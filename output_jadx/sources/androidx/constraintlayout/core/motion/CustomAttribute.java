package androidx.constraintlayout.core.motion;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    private static int clamp(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static int hsvToRgb(float f8, float f10, float f11) {
        float f12 = f8 * 6.0f;
        int i10 = (int) f12;
        float f13 = f12 - i10;
        float f14 = f11 * 255.0f;
        int b10 = (int) a.b(1.0f, f10, f14, 0.5f);
        int i11 = (int) (((1.0f - (f13 * f10)) * f14) + 0.5f);
        int i12 = (int) (((1.0f - ((1.0f - f13) * f10)) * f14) + 0.5f);
        int i13 = (int) (f14 + 0.5f);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return 0;
                            }
                            return ((i13 << 16) + (b10 << 8) + i11) | ViewCompat.MEASURED_STATE_MASK;
                        }
                        return ((i12 << 16) + (b10 << 8) + i13) | ViewCompat.MEASURED_STATE_MASK;
                    }
                    return ((b10 << 16) + (i11 << 8) + i13) | ViewCompat.MEASURED_STATE_MASK;
                }
                return ((b10 << 16) + (i13 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
            }
            return ((i11 << 16) + (i13 << 8) + b10) | ViewCompat.MEASURED_STATE_MASK;
        }
        return ((i13 << 16) + (i12 << 8) + b10) | ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute != null && (attributeType = this.mType) == customAttribute.mType) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.mIntegerValue == customAttribute.mIntegerValue) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    if (this.mFloatValue != customAttribute.mFloatValue) {
                        return false;
                    }
                    return true;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    if (this.mColorValue != customAttribute.mColorValue) {
                        return false;
                    }
                    return true;
                case STRING_TYPE:
                    if (this.mIntegerValue != customAttribute.mIntegerValue) {
                        return false;
                    }
                    return true;
                case BOOLEAN_TYPE:
                    if (this.mBooleanValue != customAttribute.mBooleanValue) {
                        return false;
                    }
                    return true;
                case DIMENSION_TYPE:
                    if (this.mFloatValue != customAttribute.mFloatValue) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                b.h("Color does not have a single color to interpolate");
                return 0.0f;
            case STRING_TYPE:
                b.h("Cannot interpolate String");
                return 0.0f;
            case BOOLEAN_TYPE:
                if (this.mBooleanValue) {
                    return 1.0f;
                }
                return 0.0f;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f8;
        switch (this.mType) {
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i10 / 255.0f;
                return;
            case STRING_TYPE:
                b.h("Color does not have a single color to interpolate");
                return;
            case BOOLEAN_TYPE:
                if (this.mBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr[0] = f8;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int ordinal = this.mType.ordinal();
        if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.mType.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return 1;
        }
        return 4;
    }

    public void setColorValue(int i10) {
        this.mColorValue = i10;
    }

    public void setFloatValue(float f8) {
        this.mFloatValue = f8;
    }

    public void setIntValue(int i10) {
        this.mIntegerValue = i10;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        boolean z9 = true;
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.mFloatValue = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case STRING_TYPE:
                b.h("Color does not have a single color to interpolate");
                return;
            case BOOLEAN_TYPE:
                if (fArr[0] <= 0.5d) {
                    z9 = false;
                }
                this.mBooleanValue = z9;
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z9) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z9;
        setValue(obj);
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case FLOAT_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.mColorValue = ((Integer) obj).intValue();
                return;
            case STRING_TYPE:
                this.mStringValue = (String) obj;
                return;
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
