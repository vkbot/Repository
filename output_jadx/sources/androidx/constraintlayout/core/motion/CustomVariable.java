package androidx.constraintlayout.core.motion;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CustomVariable {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    String mName;
    private String mStringValue;
    private int mType;

    public CustomVariable(CustomVariable customVariable) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        this.mIntegerValue = customVariable.mIntegerValue;
        this.mFloatValue = customVariable.mFloatValue;
        this.mStringValue = customVariable.mStringValue;
        this.mBooleanValue = customVariable.mBooleanValue;
    }

    private static int clamp(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String colorString(int i10) {
        return "#".concat(("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8));
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

    public static int rgbaTocColor(float f8, float f10, float f11, float f12) {
        int clamp = clamp((int) (f8 * 255.0f));
        int clamp2 = clamp((int) (f10 * 255.0f));
        return (clamp << 16) | (clamp((int) (f12 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f11 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i10 = this.mType;
        switch (i10) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.mName, i10, this.mIntegerValue);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i10, this.mFloatValue);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.mName, i10, this.mStringValue);
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.mName, i10, this.mBooleanValue);
                return;
            default:
                return;
        }
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable) {
        int i10;
        if (customVariable != null && (i10 = this.mType) == customVariable.mType) {
            switch (i10) {
                case TypedValues.Custom.TYPE_INT /* 900 */:
                case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                    if (this.mIntegerValue == customVariable.mIntegerValue) {
                        return true;
                    }
                    break;
                case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                    if (this.mFloatValue != customVariable.mFloatValue) {
                        return false;
                    }
                    return true;
                case TypedValues.Custom.TYPE_COLOR /* 902 */:
                    if (this.mIntegerValue != customVariable.mIntegerValue) {
                        return false;
                    }
                    return true;
                case TypedValues.Custom.TYPE_STRING /* 903 */:
                    if (this.mIntegerValue != customVariable.mIntegerValue) {
                        return false;
                    }
                    return true;
                case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                    if (this.mBooleanValue != customVariable.mBooleanValue) {
                        return false;
                    }
                    return true;
                case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                    if (this.mFloatValue != customVariable.mFloatValue) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean getBooleanValue() {
        return this.mBooleanValue;
    }

    public int getColorValue() {
        return this.mIntegerValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.mName;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public int getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                return this.mIntegerValue;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return this.mFloatValue;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                b.h("Color does not have a single color to interpolate");
                return 0.0f;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                b.h("Cannot interpolate String");
                return 0.0f;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.mBooleanValue) {
                    return 1.0f;
                }
                return 0.0f;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f8;
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                fArr[0] = this.mIntegerValue;
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                fArr[0] = this.mFloatValue;
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                int i10 = (this.mIntegerValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i10 / 255.0f;
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                b.h("Cannot interpolate String");
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.mBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr[0] = f8;
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i10 = this.mType;
        if (i10 != 903 && i10 != 904 && i10 != 906) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        if (this.mType != 902) {
            return 1;
        }
        return 4;
    }

    public void setBooleanValue(boolean z9) {
        this.mBooleanValue = z9;
    }

    public void setFloatValue(float f8) {
        this.mFloatValue = f8;
    }

    public void setIntValue(int i10) {
        this.mIntegerValue = i10;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i10 = this.mType;
        boolean z9 = true;
        switch (i10) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                motionWidget.setCustomAttribute(this.mName, i10, (int) fArr[0]);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i10, fArr[0]);
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                motionWidget.setCustomAttribute(this.mName, this.mType, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                b.f(this.mName, "unable to interpolate ");
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                String str = this.mName;
                if (fArr[0] <= 0.5f) {
                    z9 = false;
                }
                motionWidget.setCustomAttribute(str, i10, z9);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        boolean z9 = true;
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.mIntegerValue = (int) fArr[0];
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = fArr[0];
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                float f8 = fArr[0];
                float f10 = fArr[1];
                float f11 = fArr[2];
                this.mIntegerValue = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(f8, 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(f10, 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(f11, 0.5d)) * 255.0f) & 255);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                b.h("Cannot interpolate String");
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (fArr[0] <= 0.5d) {
                    z9 = false;
                }
                this.mBooleanValue = z9;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.mName + ':';
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                StringBuilder u8 = a.u(str);
                u8.append(this.mIntegerValue);
                return u8.toString();
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                StringBuilder u9 = a.u(str);
                u9.append(this.mFloatValue);
                return u9.toString();
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                StringBuilder u10 = a.u(str);
                u10.append(colorString(this.mIntegerValue));
                return u10.toString();
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                StringBuilder u11 = a.u(str);
                u11.append(this.mStringValue);
                return u11.toString();
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                StringBuilder u12 = a.u(str);
                u12.append(Boolean.valueOf(this.mBooleanValue));
                return u12.toString();
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                StringBuilder u13 = a.u(str);
                u13.append(this.mFloatValue);
                return u13.toString();
            default:
                return str.concat("????");
        }
    }

    public CustomVariable(String str, int i10, String str2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mName = str;
        this.mType = i10;
        this.mStringValue = str2;
    }

    public CustomVariable(String str, int i10, int i11) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i10;
        if (i10 == 901) {
            this.mFloatValue = i11;
        } else {
            this.mIntegerValue = i11;
        }
    }

    public CustomVariable(String str, int i10, float f8) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i10;
        this.mFloatValue = f8;
    }

    public CustomVariable(String str, int i10, boolean z9) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i10;
        this.mBooleanValue = z9;
    }

    public CustomVariable(String str, int i10) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i10;
    }

    public CustomVariable(String str, int i10, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i10;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                this.mStringValue = (String) obj;
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
