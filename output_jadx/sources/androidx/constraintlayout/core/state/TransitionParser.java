package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TransitionParser {
    private static void map(TypedBundle typedBundle, int i10, String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                typedBundle.add(i10, i11);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void parse(@NonNull CLObject cLObject, @NonNull Transition transition) {
        transition.resetProperties();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z9 = true;
        boolean z10 = false;
        if (stringOrNull != null) {
            char c = 65535;
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        c = 3;
                        break;
                    }
                    break;
                case 92611485:
                    if (stringOrNull.equals("above")) {
                        c = 4;
                        break;
                    }
                    break;
                case 93621297:
                    if (stringOrNull.equals("below")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    typedBundle.add(509, 1);
                    break;
                case 1:
                    typedBundle.add(509, 2);
                    break;
                case 2:
                    typedBundle.add(509, 3);
                    break;
                case 3:
                    typedBundle.add(509, 0);
                    break;
                case 4:
                    typedBundle.add(509, 5);
                    break;
                case 5:
                    typedBundle.add(509, 4);
                    break;
            }
            z10 = true;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z10 = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (!Float.isNaN(floatOrNaN)) {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        } else {
            z9 = z10;
        }
        if (z9) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            parseOnSwipe(objectOrNull, transition);
        }
        parseKeyFrames(cLObject, transition);
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        CustomVariable[] customVariableArr2;
        CLObject cLObject2;
        int i10;
        String[] strArr;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull(TypedValues.AttributesType.S_TARGET);
        if (arrayOrNull2 != null && (arrayOrNull = cLObject.getArrayOrNull("frames")) != null) {
            String stringOrNull = cLObject.getStringOrNull("transitionEasing");
            String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
            int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
            int size = arrayOrNull.size();
            TypedBundle[] typedBundleArr = new TypedBundle[size];
            for (int i11 = 0; i11 < arrayOrNull.size(); i11++) {
                typedBundleArr[i11] = new TypedBundle();
            }
            int i12 = 0;
            for (int i13 = 9; i12 < i13; i13 = 9) {
                String str = strArr2[i12];
                int i14 = iArr[i12];
                boolean z9 = zArr[i12];
                CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
                if (arrayOrNull3 != null && arrayOrNull3.size() != size) {
                    throw new CLParsingException(ai.onnxruntime.a.m("incorrect size for ", str, " array, not matching targets array!"), cLObject);
                }
                if (arrayOrNull3 != null) {
                    int i15 = 0;
                    while (i15 < size) {
                        float f8 = arrayOrNull3.getFloat(i15);
                        String[] strArr3 = strArr2;
                        if (z9) {
                            f8 = transition.mToPixel.toPixels(f8);
                        }
                        typedBundleArr[i15].add(i14, f8);
                        i15++;
                        strArr2 = strArr3;
                    }
                    strArr = strArr2;
                } else {
                    strArr = strArr2;
                    float floatOrNaN = cLObject.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        if (z9) {
                            floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                        }
                        for (int i16 = 0; i16 < size; i16++) {
                            typedBundleArr[i16].add(i14, floatOrNaN);
                        }
                    }
                }
                i12++;
                strArr2 = strArr;
            }
            int i17 = 0;
            CLElement orNull = cLObject.getOrNull("custom");
            if (orNull != null && (orNull instanceof CLObject)) {
                CLObject cLObject3 = (CLObject) orNull;
                int size2 = cLObject3.size();
                customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, arrayOrNull.size(), size2);
                int i18 = 0;
                while (i18 < size2) {
                    CLKey cLKey = (CLKey) cLObject3.get(i18);
                    String content = cLKey.content();
                    if (cLKey.getValue() instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLKey.getValue();
                        int size3 = cLArray.size();
                        if (size3 == size && size3 > 0) {
                            int i19 = i17;
                            if (cLArray.get(i19) instanceof CLNumber) {
                                int i20 = i19;
                                while (i20 < size) {
                                    customVariableArr[i20][i18] = new CustomVariable(content, TypedValues.Custom.TYPE_FLOAT, cLArray.get(i20).getFloat());
                                    i20++;
                                    cLObject3 = cLObject3;
                                }
                            } else {
                                cLObject2 = cLObject3;
                                int i21 = 0;
                                while (i21 < size) {
                                    long parseColorString = ConstraintSetParser.parseColorString(cLArray.get(i21).content());
                                    if (parseColorString != -1) {
                                        i10 = i21;
                                        customVariableArr[i21][i18] = new CustomVariable(content, TypedValues.Custom.TYPE_COLOR, (int) parseColorString);
                                    } else {
                                        i10 = i21;
                                    }
                                    i21 = i10 + 1;
                                }
                            }
                        }
                        cLObject2 = cLObject3;
                    } else {
                        cLObject2 = cLObject3;
                        CLElement value = cLKey.getValue();
                        if (value instanceof CLNumber) {
                            float f10 = value.getFloat();
                            for (int i22 = 0; i22 < size; i22++) {
                                customVariableArr[i22][i18] = new CustomVariable(content, TypedValues.Custom.TYPE_FLOAT, f10);
                            }
                        } else {
                            long parseColorString2 = ConstraintSetParser.parseColorString(value.content());
                            if (parseColorString2 != -1) {
                                int i23 = 0;
                                while (i23 < size) {
                                    customVariableArr[i23][i18] = new CustomVariable(content, TypedValues.Custom.TYPE_COLOR, (int) parseColorString2);
                                    i23++;
                                    size2 = size2;
                                    parseColorString2 = parseColorString2;
                                }
                            }
                        }
                    }
                    i18++;
                    size2 = size2;
                    cLObject3 = cLObject2;
                    i17 = 0;
                }
            } else {
                customVariableArr = null;
            }
            String stringOrNull2 = cLObject.getStringOrNull("curveFit");
            for (int i24 = 0; i24 < arrayOrNull2.size(); i24++) {
                for (int i25 = 0; i25 < size; i25++) {
                    String string = arrayOrNull2.getString(i24);
                    TypedBundle typedBundle = typedBundleArr[i25];
                    if (stringOrNull2 != null) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, map(stringOrNull2, "spline", "linear"));
                    }
                    typedBundle.addIfNotNull(501, stringOrNull);
                    typedBundle.add(100, arrayOrNull.getInt(i25));
                    if (customVariableArr != null) {
                        customVariableArr2 = customVariableArr[i25];
                    } else {
                        customVariableArr2 = null;
                    }
                    transition.addKeyAttribute(string, typedBundle, customVariableArr2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseKeyCycle(androidx.constraintlayout.core.parser.CLObject r19, androidx.constraintlayout.core.state.Transition r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parseKeyCycle(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) {
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull != null) {
            CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
            if (arrayOrNull != null) {
                for (int i10 = 0; i10 < arrayOrNull.size(); i10++) {
                    CLElement cLElement = arrayOrNull.get(i10);
                    if (cLElement instanceof CLObject) {
                        parseKeyPosition((CLObject) cLElement, transition);
                    }
                }
            }
            CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
            if (arrayOrNull2 != null) {
                for (int i11 = 0; i11 < arrayOrNull2.size(); i11++) {
                    CLElement cLElement2 = arrayOrNull2.get(i11);
                    if (cLElement2 instanceof CLObject) {
                        parseKeyAttribute((CLObject) cLElement2, transition);
                    }
                }
            }
            CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
            if (arrayOrNull3 != null) {
                for (int i12 = 0; i12 < arrayOrNull3.size(); i12++) {
                    CLElement cLElement3 = arrayOrNull3.get(i12);
                    if (cLElement3 instanceof CLObject) {
                        parseKeyCycle((CLObject) cLElement3, transition);
                    }
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) {
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                int i10 = 0;
                while (i10 < array.size()) {
                    String string = array.getString(i10);
                    int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.clear();
                    typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, map);
                    if (stringOrNull3 != null) {
                        map(typedBundle, TypedValues.PositionType.TYPE_CURVE_FIT, stringOrNull3, "spline", "linear");
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i11 = 0;
                    while (i11 < array2.size()) {
                        typedBundle.add(100, array2.getInt(i11));
                        set(typedBundle, TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull, i11);
                        set(typedBundle, TypedValues.PositionType.TYPE_PERCENT_Y, arrayOrNull2, i11);
                        set(typedBundle, 503, arrayOrNull3, i11);
                        set(typedBundle, 504, arrayOrNull4, i11);
                        transition.addKeyPosition(string, typedBundle);
                        i11++;
                        stringOrNull4 = stringOrNull4;
                    }
                    i10++;
                    stringOrNull4 = stringOrNull4;
                }
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        String stringOrNull = cLContainer.getStringOrNull("anchor");
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN("springDamping");
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe createOnSwipe = transition.createOnSwipe();
        createOnSwipe.setAnchorId(stringOrNull);
        createOnSwipe.setAnchorSide(map);
        createOnSwipe.setDragDirection(map2);
        createOnSwipe.setDragScale(floatOrNaN);
        createOnSwipe.setDragThreshold(floatOrNaN2);
        createOnSwipe.setMaxVelocity(floatOrNaN3);
        createOnSwipe.setMaxAcceleration(floatOrNaN4);
        createOnSwipe.setLimitBoundsTo(stringOrNull2);
        createOnSwipe.setAutoCompleteMode(map3);
        createOnSwipe.setOnTouchUp(map4);
        createOnSwipe.setSpringMass(floatOrNaN5);
        createOnSwipe.setSpringStiffness(floatOrNaN6);
        createOnSwipe.setSpringDamping(floatOrNaN7);
        createOnSwipe.setSpringStopThreshold(floatOrNaN8);
        createOnSwipe.setSpringBoundary(map5);
        createOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void set(TypedBundle typedBundle, int i10, CLArray cLArray, int i11) {
        if (cLArray != null) {
            typedBundle.add(i10, cLArray.getFloat(i11));
        }
    }

    private static int map(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) {
        parse(cLObject, transition);
    }
}
