package androidx.constraintlayout.widget;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ConstraintAttribute {
    private static final boolean DEBUG = false;
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

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.mMethod = false;
        this.mName = constraintAttribute.mName;
        this.mType = constraintAttribute.mType;
        setValue(obj);
    }

    private static int clamp(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                StringBuilder x9 = a.x(" Custom Attribute \"", str, "\" not found on ");
                x9.append(cls.getName());
                Log.e(TAG, x9.toString(), e);
            } catch (NoSuchMethodException e6) {
                Log.e(TAG, cls.getName() + " must have a method " + str, e6);
            } catch (InvocationTargetException e10) {
                StringBuilder x10 = a.x(" Custom Attribute \"", str, "\" not found on ");
                x10.append(cls.getName());
                Log.e(TAG, x10.toString(), e10);
            }
        }
        return hashMap2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z9 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z9 = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z9));
        }
        obtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str2);
            if (!constraintAttribute.mMethod) {
                str = a.l("set", str2);
            } else {
                str = str2;
            }
            try {
                int ordinal = constraintAttribute.mType.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 1:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 2:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 6:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 7:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder x9 = a.x(" Custom Attribute \"", str2, "\" not found on ");
                x9.append(cls.getName());
                Log.e(TAG, x9.toString(), e);
            } catch (NoSuchMethodException e6) {
                Log.e(TAG, cls.getName() + " must have a method " + str, e6);
            } catch (InvocationTargetException e10) {
                StringBuilder x10 = a.x(" Custom Attribute \"", str2, "\" not found on ");
                x10.append(cls.getName());
                Log.e(TAG, x10.toString(), e10);
            }
        }
    }

    public void applyCustom(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.mName;
        if (!this.mMethod) {
            str = a.l("set", str2);
        } else {
            str = str2;
        }
        try {
            int ordinal = this.mType.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (ordinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.mIntegerValue));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.mFloatValue));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.mColorValue));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.mColorValue);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.mStringValue);
                    return;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.mBooleanValue));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.mFloatValue));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder x9 = a.x(" Custom Attribute \"", str2, "\" not found on ");
            x9.append(cls.getName());
            Log.e(TAG, x9.toString(), e);
        } catch (NoSuchMethodException e6) {
            Log.e(TAG, cls.getName() + " must have a method " + str, e6);
        } catch (InvocationTargetException e10) {
            StringBuilder x10 = a.x(" Custom Attribute \"", str2, "\" not found on ");
            x10.append(cls.getName());
            Log.e(TAG, x10.toString(), e10);
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute != null && (attributeType = this.mType) == constraintAttribute.mType) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.mIntegerValue == constraintAttribute.mIntegerValue) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    if (this.mFloatValue != constraintAttribute.mFloatValue) {
                        return false;
                    }
                    return true;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    if (this.mColorValue != constraintAttribute.mColorValue) {
                        return false;
                    }
                    return true;
                case STRING_TYPE:
                    if (this.mIntegerValue != constraintAttribute.mIntegerValue) {
                        return false;
                    }
                    return true;
                case BOOLEAN_TYPE:
                    if (this.mBooleanValue != constraintAttribute.mBooleanValue) {
                        return false;
                    }
                    return true;
                case DIMENSION_TYPE:
                    if (this.mFloatValue != constraintAttribute.mFloatValue) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public int getColorValue() {
        return this.mColorValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public String getName() {
        return this.mName;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
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

    public boolean isBooleanValue() {
        return this.mBooleanValue;
    }

    public boolean isContinuous() {
        int ordinal = this.mType.ordinal();
        if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
            return true;
        }
        return false;
    }

    public boolean isMethod() {
        return this.mMethod;
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
        boolean z9 = false;
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
                int HSVToColor = Color.HSVToColor(fArr);
                this.mColorValue = HSVToColor;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case STRING_TYPE:
                b.h("Color does not have a single color to interpolate");
                return;
            case BOOLEAN_TYPE:
                if (fArr[0] > 0.5d) {
                    z9 = true;
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

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z9) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z9;
        setValue(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
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
