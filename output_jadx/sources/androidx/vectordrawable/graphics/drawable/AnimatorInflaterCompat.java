package androidx.vectordrawable.graphics.drawable;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import j1.i;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    private AnimatorInflaterCompat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10, float f8) {
        int i11;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i11 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = loadObjectAnimator(context, resources, theme, attributeSet, f8, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = loadAnimator(context, resources, theme, attributeSet, null, f8, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR_SET);
                        createAnimatorFromXml(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "ordering", 0, 0), f8);
                        obtainAttributes.recycle();
                        valueAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] loadValues = loadValues(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (loadValues != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(loadValues);
                        }
                        i11 = 1;
                    } else {
                        b.f(xmlPullParser.getName(), "Unknown animator name: ");
                        return null;
                    }
                    if (animatorSet != null && i11 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                animatorArr[i11] = (Animator) obj;
                i11++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
                return valueAnimator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return valueAnimator;
    }

    private static Keyframe createNewKeyframe(Keyframe keyframe, float f8) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f8);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f8);
        }
        return Keyframe.ofObject(f8);
    }

    private static void distributeKeyframes(Keyframe[] keyframeArr, float f8, int i10, int i11) {
        float f10 = f8 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f10);
            i10++;
        }
    }

    private static void dumpKeyframes(Object[] objArr, String str) {
        Object valueOf;
        if (objArr != null && objArr.length != 0) {
            Log.d(TAG, str);
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Keyframe keyframe = (Keyframe) objArr[i10];
                StringBuilder q8 = a.q(i10, "Keyframe ", ": fraction ");
                Object obj = "null";
                if (keyframe.getFraction() < 0.0f) {
                    valueOf = "null";
                } else {
                    valueOf = Float.valueOf(keyframe.getFraction());
                }
                q8.append(valueOf);
                q8.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                q8.append(obj);
                Log.d(TAG, q8.toString());
            }
        }
    }

    private static PropertyValuesHolder getPVH(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z9;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        ArgbEvaluator argbEvaluator;
        int i15;
        int i16;
        int i17;
        float f8;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z9 && isColorType(i13)) || (z10 && isColorType(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            PathParser.PathDataNode[] createNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] createNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (createNodesFromPathData != null || createNodesFromPathData2 != null) {
                if (createNodesFromPathData != null) {
                    PathDataEvaluator pathDataEvaluator = new PathDataEvaluator();
                    if (createNodesFromPathData2 != null) {
                        if (PathParser.canMorph(createNodesFromPathData, createNodesFromPathData2)) {
                            return PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData, createNodesFromPathData2);
                        }
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    return PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData);
                }
                if (createNodesFromPathData2 != null) {
                    return PropertyValuesHolder.ofObject(str, new PathDataEvaluator(), createNodesFromPathData2);
                }
            }
            return null;
        }
        if (i10 == 3) {
            argbEvaluator = ArgbEvaluator.getInstance();
        } else {
            argbEvaluator = null;
        }
        if (z11) {
            if (z9) {
                if (i13 == 5) {
                    f10 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i11, 0.0f);
                }
                if (z10) {
                    if (i14 == 5) {
                        f11 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f11 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i14 == 5) {
                    f8 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f8 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f8);
            }
            propertyValuesHolder = ofFloat;
        } else if (z9) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (isColorType(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z10) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (isColorType(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z10) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (isColorType(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && argbEvaluator != null) {
            propertyValuesHolder.setEvaluator(argbEvaluator);
        }
        return propertyValuesHolder;
    }

    private static int inferValueTypeFromValues(TypedArray typedArray, int i10, int i11) {
        boolean z9;
        int i12;
        int i13;
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z10 = true;
        if (peekValue != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 == null) {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (!z9 || !isColorType(i12)) {
            if (!z10 || !isColorType(i13)) {
                return 0;
            }
            return 3;
        }
        return 3;
    }

    private static int inferValueTypeOfKeyframe(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        int i10 = 0;
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        if (peekNamedValue != null && isColorType(peekNamedValue.type)) {
            i10 = 3;
        }
        obtainAttributes.recycle();
        return i10;
    }

    private static boolean isColorType(int i10) {
        if (i10 >= 28 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i10, float f8) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i10);
                    return createAnimatorFromXml(context, resources, theme, xmlResourceParser, f8);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e6) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e6);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static Keyframe loadKeyframe(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        boolean z9;
        Keyframe ofInt;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        if (peekNamedValue != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i10 == 4) {
            if (z9 && isColorType(peekNamedValue.type)) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (z9) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i10 == 0) {
            ofInt = Keyframe.ofFloat(namedFloat);
        } else {
            ofInt = Keyframe.ofInt(namedFloat);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            ofInt.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, resources, theme, attributeSet, objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder loadPvh(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i11 = i10;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe loadKeyframe = loadKeyframe(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser2);
                if (loadKeyframe != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(loadKeyframe);
                }
                xmlPullParser2.next();
                i10 = i11;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), createNewKeyframe(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, createNewKeyframe(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i12 = 0; i12 < size; i12++) {
            Keyframe keyframe3 = keyframeArr[i12];
            if (keyframe3.getFraction() < 0.0f) {
                if (i12 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i13 = size - 1;
                    if (i12 == i13) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i14 = i12;
                        for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                            i14 = i15;
                        }
                        distributeKeyframes(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                    }
                }
            }
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i10 == 3) {
            ofKeyframe.setEvaluator(ArgbEvaluator.getInstance());
        }
        return ofKeyframe;
    }

    private static PropertyValuesHolder[] loadValues(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
                    String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser2, "propertyName", 3);
                    int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder loadPvh = loadPvh(context, resources, theme, xmlPullParser2, namedString, namedInt);
                    if (loadPvh == null) {
                        loadPvh = getPVH(obtainAttributes, namedInt, 0, 1, namedString);
                    }
                    if (loadPvh != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(loadPvh);
                    }
                    obtainAttributes.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i10 = 0; i10 < size; i10++) {
            propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
        }
        return propertyValuesHolderArr;
    }

    private static void parseAnimatorFromTypeArray(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, TypedValues.TransitionType.S_DURATION, 1, 300);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                namedInt3 = inferValueTypeFromValues(typedArray, 5, 6);
            }
            PropertyValuesHolder pvh = getPVH(typedArray, namedInt3, 5, 6, "");
            if (pvh != null) {
                valueAnimator.setValues(pvh);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setupObjectAnimator(valueAnimator, typedArray2, namedInt3, f8, xmlPullParser);
        }
    }

    private static void setupObjectAnimator(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString != null) {
            String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
            String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
            if (i10 != 2) {
            }
            if (namedString2 == null && namedString3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            setupPathMotion(PathParser.createPathFromPathData(namedString), objectAnimator, f8 * 0.5f, namedString2, namedString3);
            return;
        }
        objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void setupPathMotion(Path path, ObjectAnimator objectAnimator, float f8, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z9 = false;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f11 = 0.0f;
        do {
            f11 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f11));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f11 / f8)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f12 = f11 / (min - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i10 >= min) {
                break;
            }
            boolean z10 = z9;
            pathMeasure2.getPosTan(f10 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[z10 ? 1 : 0];
            fArr2[i10] = fArr3[1];
            f10 += f12;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f10 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
            z9 = z10 ? 1 : 0;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] mNodeArray;

        public PathDataEvaluator(PathParser.PathDataNode[] pathDataNodeArr) {
            this.mNodeArray = pathDataNodeArr;
        }

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f8, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.canMorph(this.mNodeArray, pathDataNodeArr)) {
                    this.mNodeArray = PathParser.deepCopyNodes(pathDataNodeArr);
                }
                int i10 = 0;
                while (true) {
                    int length = pathDataNodeArr.length;
                    PathParser.PathDataNode[] pathDataNodeArr3 = this.mNodeArray;
                    if (i10 < length) {
                        pathDataNodeArr3[i10].interpolatePathDataNode(pathDataNodeArr[i10], pathDataNodeArr2[i10], f8);
                        i10++;
                    } else {
                        return pathDataNodeArr3;
                    }
                }
            } else {
                i.k("Can't interpolate between two incompatible pathData");
                return null;
            }
        }

        public PathDataEvaluator() {
        }
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i10) {
        return loadAnimator(context, resources, theme, i10, 1.0f);
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i10) {
        return AnimatorInflater.loadAnimator(context, i10);
    }

    private static ValueAnimator loadAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        parseAnimatorFromTypeArray(valueAnimator, obtainAttributes, obtainAttributes2, f8, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) {
        return createAnimatorFromXml(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f8);
    }
}
