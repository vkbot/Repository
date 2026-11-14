package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        public DesignElement(String str, String str2, HashMap<String, String> hashMap) {
            this.mId = str;
            this.mType = str2;
            this.mParams = hashMap;
        }

        public String getId() {
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        public String getType() {
            return this.mType;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        public FiniteGenerator(float f8, float f10, float f11, String str, String str2) {
            this.mFrom = f8;
            this.mTo = f10;
            this.mStep = f11;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f10;
            this.mInitial = f8;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i10 = (int) this.mInitial;
            int i11 = (int) this.mMax;
            int i12 = i10;
            while (i10 <= i11) {
                arrayList.add(this.mPrefix + i12 + this.mPostfix);
                i12 += (int) this.mStep;
                i10++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f8 = this.mCurrent;
            if (f8 >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f8 + this.mStep;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface GeneratedValue {
        float value();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        public Generator(float f8, float f10) {
            this.mStart = f8;
            this.mIncrementBy = f10;
            this.mCurrent = f8;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class OverrideValue implements GeneratedValue {
        float mValue;

        public OverrideValue(float f8) {
            this.mValue = f8;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0168, code lost:
    
        if (r8.equals("visible") == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void applyAttribute(androidx.constraintlayout.core.state.State r8, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r9, androidx.constraintlayout.core.state.ConstraintReference r10, androidx.constraintlayout.core.parser.CLObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.applyAttribute(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.parser.CLObject, java.lang.String):void");
    }

    private static int indexOf(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static String lookForType(CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        int size = names.size();
        int i10 = 0;
        while (i10 < size) {
            String str = names.get(i10);
            i10++;
            if (str.equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        switch(r7) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L34;
            default: goto L33;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r8.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r8.remove("width");
        r8.remove("height");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r8.remove("start");
        r8.remove("end");
        r8.remove("top");
        r8.remove("bottom");
        r8.remove("baseline");
        r8.remove("center");
        r8.remove("centerHorizontally");
        r8.remove("centerVertically");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        r8.remove("visibility");
        r8.remove("alpha");
        r8.remove("pivotX");
        r8.remove("pivotY");
        r8.remove("rotationX");
        r8.remove("rotationY");
        r8.remove("rotationZ");
        r8.remove("scaleX");
        r8.remove("scaleY");
        r8.remove("translationX");
        r8.remove("translationY");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void override(androidx.constraintlayout.core.parser.CLObject r8, java.lang.String r9, androidx.constraintlayout.core.parser.CLObject r10) {
        /*
            boolean r0 = r8.has(r9)
            if (r0 != 0) goto La
            r8.put(r9, r10)
            return
        La:
            androidx.constraintlayout.core.parser.CLObject r8 = r8.getObject(r9)
            java.util.ArrayList r9 = r10.names()
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L18:
            if (r2 >= r0) goto Le4
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "clear"
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L32
            androidx.constraintlayout.core.parser.CLElement r4 = r10.get(r3)
            r8.put(r3, r4)
            goto L18
        L32:
            androidx.constraintlayout.core.parser.CLArray r3 = r10.getArray(r4)
            r4 = r1
        L37:
            int r5 = r3.size()
            if (r4 >= r5) goto L18
            java.lang.String r5 = r3.getStringOrNull(r4)
            if (r5 != 0) goto L45
            goto Le0
        L45:
            int r6 = r5.hashCode()
            r7 = -1
            switch(r6) {
                case -1727069561: goto L64;
                case -1606703562: goto L59;
                case 414334925: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L6e
        L4e:
            java.lang.String r6 = "dimensions"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L57
            goto L6e
        L57:
            r7 = 2
            goto L6e
        L59:
            java.lang.String r6 = "constraints"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L62
            goto L6e
        L62:
            r7 = 1
            goto L6e
        L64:
            java.lang.String r6 = "transforms"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L6d
            goto L6e
        L6d:
            r7 = r1
        L6e:
            switch(r7) {
                case 0: goto La9;
                case 1: goto L80;
                case 2: goto L75;
                default: goto L71;
            }
        L71:
            r8.remove(r5)
            goto Le0
        L75:
            java.lang.String r5 = "width"
            r8.remove(r5)
            java.lang.String r5 = "height"
            r8.remove(r5)
            goto Le0
        L80:
            java.lang.String r5 = "start"
            r8.remove(r5)
            java.lang.String r5 = "end"
            r8.remove(r5)
            java.lang.String r5 = "top"
            r8.remove(r5)
            java.lang.String r5 = "bottom"
            r8.remove(r5)
            java.lang.String r5 = "baseline"
            r8.remove(r5)
            java.lang.String r5 = "center"
            r8.remove(r5)
            java.lang.String r5 = "centerHorizontally"
            r8.remove(r5)
            java.lang.String r5 = "centerVertically"
            r8.remove(r5)
            goto Le0
        La9:
            java.lang.String r5 = "visibility"
            r8.remove(r5)
            java.lang.String r5 = "alpha"
            r8.remove(r5)
            java.lang.String r5 = "pivotX"
            r8.remove(r5)
            java.lang.String r5 = "pivotY"
            r8.remove(r5)
            java.lang.String r5 = "rotationX"
            r8.remove(r5)
            java.lang.String r5 = "rotationY"
            r8.remove(r5)
            java.lang.String r5 = "rotationZ"
            r8.remove(r5)
            java.lang.String r5 = "scaleX"
            r8.remove(r5)
            java.lang.String r5 = "scaleY"
            r8.remove(r5)
            java.lang.String r5 = "translationX"
            r8.remove(r5)
            java.lang.String r5 = "translationY"
            r8.remove(r5)
        Le0:
            int r4 = r4 + 1
            goto L37
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.override(androidx.constraintlayout.core.parser.CLObject, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
    
        if (r5.equals("top") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseBarrier(androidx.constraintlayout.core.state.State r10, java.lang.String r11, androidx.constraintlayout.core.parser.CLObject r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseBarrier(androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseChain(int r8, androidx.constraintlayout.core.state.State r9, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r10, androidx.constraintlayout.core.parser.CLArray r11) {
        /*
            if (r8 != 0) goto L7
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r8 = r9.horizontalChain()
            goto Lb
        L7:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r8 = r9.verticalChain()
        Lb:
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r1 = r11.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Lae
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Lae
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L34
            java.lang.String r4 = r1.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r8.add(r4)
            int r3 = r3 + 1
            goto L20
        L34:
            int r1 = r11.size()
            r3 = 2
            if (r1 <= r3) goto Lae
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r3)
            boolean r1 = r11 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L44
            goto Lae
        L44:
            androidx.constraintlayout.core.parser.CLObject r11 = (androidx.constraintlayout.core.parser.CLObject) r11
            java.util.ArrayList r1 = r11.names()
            int r3 = r1.size()
            r4 = r2
        L4f:
            if (r4 >= r3) goto Lae
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r6 = "style"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L68
            parseConstraint(r9, r10, r11, r8, r5)
            goto L4f
        L68:
            androidx.constraintlayout.core.parser.CLElement r5 = r11.get(r5)
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r6 == 0) goto L85
            r6 = r5
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            int r7 = r6.size()
            if (r7 <= r0) goto L85
            java.lang.String r5 = r6.getString(r2)
            float r6 = r6.getFloat(r0)
            r8.bias(r6)
            goto L89
        L85:
            java.lang.String r5 = r5.content()
        L89:
            r5.getClass()
            java.lang.String r6 = "packed"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto La8
            java.lang.String r6 = "spread_inside"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto La2
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r8.style(r5)
            goto L4f
        La2:
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r8.style(r5)
            goto L4f
        La8:
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r8.style(r5)
            goto L4f
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChain(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChainType(java.lang.String r21, androidx.constraintlayout.core.state.State r22, java.lang.String r23, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r24, androidx.constraintlayout.core.parser.CLObject r25) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChainType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static long parseColorString(String str) {
        if (str.startsWith("#")) {
            String substring = str.substring(1);
            if (substring.length() == 6) {
                substring = "FF".concat(substring);
            }
            return Long.parseLong(substring, 16);
        }
        return -1L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x00d0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) {
        ConstraintReference constraints;
        char c;
        float f8;
        float f10;
        ConstraintReference constraints2;
        char c10;
        boolean z9;
        char c11;
        char c12;
        char c13;
        boolean z10;
        char c14;
        boolean z11;
        ?? r16;
        boolean z12;
        boolean isRtl = state.isRtl();
        boolean z13 = !isRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull != null && arrayOrNull.size() > 1) {
            String string = arrayOrNull.getString(0);
            String stringOrNull = arrayOrNull.getStringOrNull(1);
            float f11 = 0.0f;
            if (arrayOrNull.size() > 2) {
                f8 = toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2)));
            } else {
                f8 = 0.0f;
            }
            if (arrayOrNull.size() > 3) {
                f10 = toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3)));
            } else {
                f10 = 0.0f;
            }
            if (string.equals("parent")) {
                constraints2 = state.constraints(State.PARENT);
            } else {
                constraints2 = state.constraints(string);
            }
            str.getClass();
            float f12 = f8;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    z9 = true;
                    c11 = 2;
                    stringOrNull.getClass();
                    switch (stringOrNull.hashCode()) {
                        case -1720785339:
                            if (stringOrNull.equals("baseline")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1383228885:
                            if (stringOrNull.equals("bottom")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 115029:
                            if (stringOrNull.equals("top")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            state.baselineNeededFor(constraintReference.getKey());
                            state.baselineNeededFor(constraints2.getKey());
                            constraintReference.baselineToBaseline(constraints2);
                            break;
                        case 1:
                            state.baselineNeededFor(constraintReference.getKey());
                            constraintReference.baselineToBottom(constraints2);
                            break;
                        case 2:
                            state.baselineNeededFor(constraintReference.getKey());
                            constraintReference.baselineToTop(constraints2);
                            break;
                    }
                    z10 = z9;
                    z11 = false;
                    break;
                case 1:
                    z9 = true;
                    float f13 = layoutVariables.get(arrayOrNull.get(1));
                    c11 = 2;
                    if (arrayOrNull.size() > 2) {
                        f11 = toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2)));
                    }
                    constraintReference.circularConstraint(constraints2, f13, f11);
                    z10 = z9;
                    z11 = false;
                    break;
                case 2:
                    stringOrNull.getClass();
                    switch (stringOrNull.hashCode()) {
                        case -1720785339:
                            if (stringOrNull.equals("baseline")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1383228885:
                            if (stringOrNull.equals("bottom")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 115029:
                            if (stringOrNull.equals("top")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            state.baselineNeededFor(constraints2.getKey());
                            constraintReference.bottomToBaseline(constraints2);
                            break;
                        case 1:
                            constraintReference.bottomToBottom(constraints2);
                            break;
                        case 2:
                            constraintReference.bottomToTop(constraints2);
                            break;
                    }
                    z9 = true;
                    c11 = 2;
                    z10 = z9;
                    z11 = false;
                    break;
                case 3:
                    z10 = isRtl;
                    z9 = true;
                    c11 = 2;
                    z11 = true;
                    break;
                case 4:
                    stringOrNull.getClass();
                    switch (stringOrNull.hashCode()) {
                        case -1720785339:
                            if (stringOrNull.equals("baseline")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1383228885:
                            if (stringOrNull.equals("bottom")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 115029:
                            if (stringOrNull.equals("top")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            state.baselineNeededFor(constraints2.getKey());
                            constraintReference.topToBaseline(constraints2);
                            break;
                        case 1:
                            constraintReference.topToBottom(constraints2);
                            break;
                        case 2:
                            constraintReference.topToTop(constraints2);
                            break;
                    }
                    z9 = true;
                    c11 = 2;
                    z10 = z9;
                    z11 = false;
                    break;
                case 5:
                    z10 = true;
                    z9 = true;
                    c11 = 2;
                    z11 = true;
                    break;
                case 6:
                    z10 = false;
                    z9 = true;
                    c11 = 2;
                    z11 = true;
                    break;
                case 7:
                    z10 = z13;
                    z9 = true;
                    c11 = 2;
                    z11 = true;
                    break;
                default:
                    z9 = true;
                    c11 = 2;
                    z10 = z9;
                    z11 = false;
                    break;
            }
            if (z11) {
                stringOrNull.getClass();
                switch (stringOrNull.hashCode()) {
                    case 100571:
                        if (stringOrNull.equals("end")) {
                            r16 = 0;
                            break;
                        }
                        r16 = -1;
                        break;
                    case 3317767:
                        if (stringOrNull.equals("left")) {
                            r16 = z9;
                            break;
                        }
                        r16 = -1;
                        break;
                    case 108511772:
                        if (stringOrNull.equals("right")) {
                            r16 = c11;
                            break;
                        }
                        r16 = -1;
                        break;
                    case 109757538:
                        if (stringOrNull.equals("start")) {
                            r16 = 3;
                            break;
                        }
                        r16 = -1;
                        break;
                    default:
                        r16 = -1;
                        break;
                }
                switch (r16) {
                    case 0:
                        z12 = isRtl;
                        break;
                    case 1:
                    default:
                        z12 = z9;
                        break;
                    case 2:
                        z12 = false;
                        break;
                    case 3:
                        z12 = z13;
                        break;
                }
                if (z10) {
                    if (z12) {
                        constraintReference.leftToLeft(constraints2);
                    } else {
                        constraintReference.leftToRight(constraints2);
                    }
                } else if (z12) {
                    constraintReference.rightToLeft(constraints2);
                } else {
                    constraintReference.rightToRight(constraints2);
                }
            }
            constraintReference.margin(Float.valueOf(f12)).marginGone(Float.valueOf(f10));
            return;
        }
        String stringOrNull2 = cLObject.getStringOrNull(str);
        if (stringOrNull2 != null) {
            if (stringOrNull2.equals("parent")) {
                constraints = state.constraints(State.PARENT);
            } else {
                constraints = state.constraints(stringOrNull2);
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    state.baselineNeededFor(constraintReference.getKey());
                    state.baselineNeededFor(constraints.getKey());
                    constraintReference.baselineToBaseline(constraints);
                    return;
                case 1:
                    constraintReference.bottomToBottom(constraints);
                    return;
                case 2:
                    if (!isRtl) {
                        constraintReference.rightToRight(constraints);
                        return;
                    } else {
                        constraintReference.leftToLeft(constraints);
                        return;
                    }
                case 3:
                    constraintReference.topToTop(constraints);
                    return;
                case 4:
                    if (!isRtl) {
                        constraintReference.leftToLeft(constraints);
                        return;
                    } else {
                        constraintReference.rightToRight(constraints);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                String str2 = str;
                CLObject object = cLObject.getObject(str2);
                String stringOrNull = object.getStringOrNull("Extends");
                if (stringOrNull != null && !stringOrNull.isEmpty()) {
                    String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                    if (constraintSet != null) {
                        CLObject parse = CLParser.parse(constraintSet);
                        ArrayList<String> names2 = object.names();
                        if (names2 != null) {
                            int size2 = names2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                String str3 = names2.get(i11);
                                i11++;
                                String str4 = str3;
                                CLElement cLElement = object.get(str4);
                                if (cLElement instanceof CLObject) {
                                    override(parse, str4, (CLObject) cLElement);
                                }
                            }
                            coreMotionScene.setConstraintSetContent(str2, parse.toJSON());
                        }
                    }
                } else {
                    coreMotionScene.setConstraintSetContent(str2, object.toJSON());
                }
            }
        }
    }

    public static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) {
        ArrayList<String> names;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull != null && (names = objectOrNull.names()) != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str2 = names.get(i10);
                i10++;
                String str3 = str2;
                CLElement cLElement = objectOrNull.get(str3);
                if (cLElement instanceof CLNumber) {
                    constraintReference.addCustomFloat(str3, cLElement.getFloat());
                } else if (cLElement instanceof CLString) {
                    long parseColorString = parseColorString(cLElement.content());
                    if (parseColorString != -1) {
                        constraintReference.addCustomColor(str3, (int) parseColorString);
                    }
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) {
        CLObject parse = CLParser.parse(str);
        ArrayList<String> names = parse.names();
        if (names != null && names.size() > 0) {
            String str2 = names.get(0);
            CLElement cLElement = parse.get(str2);
            str2.getClass();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject = (CLObject) cLElement;
                ArrayList<String> names2 = cLObject.names();
                for (int i10 = 0; i10 < names2.size(); i10++) {
                    String str3 = names2.get(i10);
                    CLObject cLObject2 = (CLObject) cLObject.get(str3);
                    System.out.printf(ai.onnxruntime.a.m("element found ", str3, ""), new Object[0]);
                    String stringOrNull = cLObject2.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap hashMap = new HashMap();
                        int size = cLObject2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            CLKey cLKey = (CLKey) cLObject2.get(i10);
                            String content = cLKey.content();
                            String content2 = cLKey.getValue().content();
                            if (content2 != null) {
                                hashMap.put(content, content2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, hashMap));
                    }
                }
            }
        }
    }

    public static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) {
        CLElement cLElement = cLObject.get(str);
        Dimension createFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                createFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    createFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    createFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    createFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return createFixed;
                }
                if (orNull2 instanceof CLString) {
                    createFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return createFixed;
    }

    public static Dimension parseDimensionMode(String str) {
        Dimension createFixed = Dimension.createFixed(0);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case 1:
                return Dimension.createParent();
            case 2:
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case 3:
                return Dimension.createWrap();
            default:
                if (str.endsWith("%")) {
                    return Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
                }
                if (str.contains(":")) {
                    return Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION);
                }
                return createFixed;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:57|(2:59|(11:61|(1:63)(1:76)|64|65|(1:67)|68|(1:70)|71|72|73|14))|77|64|65|(0)|68|(0)|71|72|73|14) */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c5 A[Catch: NumberFormatException -> 0x0257, TryCatch #0 {NumberFormatException -> 0x0257, blocks: (B:65:0x0232, B:67:0x0241, B:68:0x0248, B:70:0x0250, B:138:0x03b6, B:140:0x03c5, B:141:0x03cc, B:143:0x03d4), top: B:64:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d4 A[Catch: NumberFormatException -> 0x0257, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0257, blocks: (B:65:0x0232, B:67:0x0241, B:68:0x0248, B:70:0x0250, B:138:0x03b6, B:140:0x03c5, B:141:0x03cc, B:143:0x03d4), top: B:64:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0241 A[Catch: NumberFormatException -> 0x0257, TryCatch #0 {NumberFormatException -> 0x0257, blocks: (B:65:0x0232, B:67:0x0241, B:68:0x0248, B:70:0x0250, B:138:0x03b6, B:140:0x03c5, B:141:0x03cc, B:143:0x03d4), top: B:64:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0250 A[Catch: NumberFormatException -> 0x0257, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0257, blocks: (B:65:0x0232, B:67:0x0241, B:68:0x0248, B:70:0x0250, B:138:0x03b6, B:140:0x03c5, B:141:0x03cc, B:143:0x03d4), top: B:64:0x0232 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseFlowType(java.lang.String r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r21, androidx.constraintlayout.core.parser.CLObject r22) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseFlowType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                String str2 = str;
                CLElement cLElement = cLObject.get(str2);
                ArrayList<String> list = layoutVariables.getList(str2);
                if (list != null && (cLElement instanceof CLObject)) {
                    int size2 = list.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        String str3 = list.get(i11);
                        i11++;
                        parseWidget(state, layoutVariables, str3, (CLObject) cLElement);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) {
        float f8;
        float f10;
        float f11;
        float f12;
        int i10;
        CLElement cLElement;
        GridReference grid = state.getGrid(str2, str);
        ArrayList<String> names = cLObject.names();
        int size = names.size();
        int i11 = 0;
        while (i11 < size) {
            String str3 = names.get(i11);
            i11++;
            String str4 = str3;
            str4.getClass();
            char c = 65535;
            switch (str4.hashCode()) {
                case -1439500848:
                    if (str4.equals("orientation")) {
                        c = 0;
                        break;
                    }
                    break;
                case -806339567:
                    if (str4.equals("padding")) {
                        c = 1;
                        break;
                    }
                    break;
                case -567445985:
                    if (str4.equals("contains")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3169614:
                    if (str4.equals("hGap")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3506649:
                    if (str4.equals("rows")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3586688:
                    if (str4.equals("vGap")) {
                        c = 5;
                        break;
                    }
                    break;
                case 97513095:
                    if (str4.equals("flags")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109497044:
                    if (str4.equals("skips")) {
                        c = 7;
                        break;
                    }
                    break;
                case 109638249:
                    if (str4.equals("spans")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 144441793:
                    if (str4.equals("rowWeights")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 949721053:
                    if (str4.equals("columns")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2033353925:
                    if (str4.equals("columnWeights")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    grid.setOrientation(cLObject.get(str4).getInt());
                    break;
                case 1:
                    CLElement cLElement2 = cLObject.get(str4);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement2;
                        if (cLArray.size() > 1) {
                            f8 = cLArray.getInt(0);
                            f12 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f11 = cLArray.getInt(2);
                                try {
                                    f10 = ((CLArray) cLElement2).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f10 = 0.0f;
                                }
                            } else {
                                f10 = f12;
                                f11 = f8;
                            }
                            grid.setPaddingStart(Math.round(toPix(state, f8)));
                            grid.setPaddingTop(Math.round(toPix(state, f12)));
                            grid.setPaddingEnd(Math.round(toPix(state, f11)));
                            grid.setPaddingBottom(Math.round(toPix(state, f10)));
                            break;
                        }
                    }
                    f8 = cLElement2.getInt();
                    f10 = f8;
                    f11 = f10;
                    f12 = f11;
                    grid.setPaddingStart(Math.round(toPix(state, f8)));
                    grid.setPaddingTop(Math.round(toPix(state, f12)));
                    grid.setPaddingEnd(Math.round(toPix(state, f11)));
                    grid.setPaddingBottom(Math.round(toPix(state, f10)));
                case 2:
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str4);
                    if (arrayOrNull != null) {
                        for (int i12 = 0; i12 < arrayOrNull.size(); i12++) {
                            grid.add(state.constraints(arrayOrNull.get(i12).content()));
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    grid.setHorizontalGaps(toPix(state, cLObject.get(str4).getFloat()));
                    break;
                case 4:
                    int i13 = cLObject.get(str4).getInt();
                    if (i13 > 0) {
                        grid.setRowsSet(i13);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    grid.setVerticalGaps(toPix(state, cLObject.get(str4).getFloat()));
                    break;
                case 6:
                    String str5 = "";
                    try {
                        cLElement = cLObject.get(str4);
                    } catch (Exception e) {
                        System.err.println("Error parsing grid flags " + e);
                    }
                    if (cLElement instanceof CLNumber) {
                        i10 = cLElement.getInt();
                        if (str5 == null && !str5.isEmpty()) {
                            grid.setFlags(str5);
                            break;
                        } else {
                            grid.setFlags(i10);
                            break;
                        }
                    } else {
                        str5 = cLElement.content();
                        i10 = 0;
                        if (str5 == null) {
                        }
                        grid.setFlags(i10);
                    }
                case 7:
                    String content = cLObject.get(str4).content();
                    if (content != null && content.contains(":")) {
                        grid.setSkips(content);
                        break;
                    }
                    break;
                case '\b':
                    String content2 = cLObject.get(str4).content();
                    if (content2 != null && content2.contains(":")) {
                        grid.setSpans(content2);
                        break;
                    }
                    break;
                case '\t':
                    String content3 = cLObject.get(str4).content();
                    if (content3 != null && content3.contains(",")) {
                        grid.setRowWeights(content3);
                        break;
                    }
                    break;
                case '\n':
                    int i14 = cLObject.get(str4).getInt();
                    if (i14 > 0) {
                        grid.setColumnsSet(i14);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    String content4 = cLObject.get(str4).content();
                    if (content4 != null && content4.contains(",")) {
                        grid.setColumnWeights(content4);
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, str4);
                    break;
            }
        }
    }

    public static void parseGuideline(int i10, State state, CLArray cLArray) {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if (!(cLElement instanceof CLObject) || (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) == null) {
            return;
        }
        parseGuidelineParams(i10, state, stringOrNull, cLObject);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0104. Please report as an issue. */
    public static void parseGuidelineParams(int i10, State state, String str, CLObject cLObject) {
        boolean z9;
        char c;
        float pix;
        char c10;
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        ConstraintReference constraints = state.constraints(str);
        if (i10 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        if (state.isRtl() && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        GuidelineReference guidelineReference = (GuidelineReference) constraints.getFacade();
        int size = names.size();
        float f8 = 0.0f;
        boolean z10 = false;
        boolean z11 = true;
        int i11 = 0;
        while (i11 < size) {
            String str2 = names.get(i11);
            i11++;
            String str3 = str2;
            str3.getClass();
            switch (str3.hashCode()) {
                case -678927291:
                    if (str3.equals("percent")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100571:
                    if (str3.equals("end")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3317767:
                    if (str3.equals("left")) {
                        c = 2;
                        break;
                    }
                    break;
                case 108511772:
                    if (str3.equals("right")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (str3.equals("start")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str3);
                    if (arrayOrNull == null) {
                        f8 = cLObject.getFloat(str3);
                        z10 = true;
                        z11 = true;
                        break;
                    } else {
                        if (arrayOrNull.size() > 1) {
                            String string = arrayOrNull.getString(0);
                            float f10 = arrayOrNull.getFloat(1);
                            string.getClass();
                            switch (string.hashCode()) {
                                case 100571:
                                    if (string.equals("end")) {
                                        c10 = 0;
                                        break;
                                    }
                                    break;
                                case 3317767:
                                    if (string.equals("left")) {
                                        c10 = 1;
                                        break;
                                    }
                                    break;
                                case 108511772:
                                    if (string.equals("right")) {
                                        c10 = 2;
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (string.equals("start")) {
                                        c10 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c10 = 65535;
                            switch (c10) {
                                case 0:
                                    z11 = !z9;
                                    f8 = f10;
                                    break;
                                case 1:
                                    f8 = f10;
                                    z10 = true;
                                    z11 = true;
                                    break;
                                case 2:
                                    f8 = f10;
                                    z11 = false;
                                    break;
                                case 3:
                                    z11 = z9;
                                    f8 = f10;
                                    break;
                                default:
                                    f8 = f10;
                                    break;
                            }
                        }
                        z10 = true;
                        break;
                    }
                case 1:
                    pix = toPix(state, cLObject.getFloat(str3));
                    z11 = !z9;
                    f8 = pix;
                    break;
                case 2:
                    f8 = toPix(state, cLObject.getFloat(str3));
                    z11 = true;
                    break;
                case 3:
                    f8 = toPix(state, cLObject.getFloat(str3));
                    z11 = false;
                    break;
                case 4:
                    pix = toPix(state, cLObject.getFloat(str3));
                    z11 = z9;
                    f8 = pix;
                    break;
            }
        }
        if (z10) {
            if (z11) {
                guidelineReference.percent(f8);
                return;
            } else {
                guidelineReference.percent(1.0f - f8);
                return;
            }
        }
        if (z11) {
            guidelineReference.start(Float.valueOf(f8));
        } else {
            guidelineReference.end(Float.valueOf(f8));
        }
    }

    public static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0025. Please report as an issue. */
    public static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) {
        for (int i10 = 0; i10 < cLArray.size(); i10++) {
            CLElement cLElement = cLArray.get(i10);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.getClass();
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1785507558:
                            if (string.equals("vGuideline")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1252464839:
                            if (string.equals("hChain")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -851656725:
                            if (string.equals("vChain")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 965681512:
                            if (string.equals("hGuideline")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            parseGuideline(1, state, cLArray2);
                            break;
                        case 1:
                            parseChain(0, state, layoutVariables, cLArray2);
                            break;
                        case 2:
                            parseChain(1, state, layoutVariables, cLArray2);
                            break;
                        case 3:
                            parseGuideline(0, state, cLArray2);
                            break;
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i10) {
        CLObject objectOrNull;
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names != null) {
                int size = names.size();
                int i11 = 0;
                while (i11 < size) {
                    String str2 = names.get(i11);
                    i11++;
                    String str3 = str2;
                    CLElement cLElement = parse.get(str3);
                    if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                        ArrayList<String> names2 = objectOrNull.names();
                        int size2 = names2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            String str4 = names2.get(i12);
                            i12++;
                            String str5 = str4;
                            CLElement cLElement2 = objectOrNull.get(str5);
                            if (cLElement2 instanceof CLNumber) {
                                transition.addCustomFloat(i10, str3, str5, cLElement2.getFloat());
                            } else if (cLElement2 instanceof CLString) {
                                long parseColorString = parseColorString(cLElement2.content());
                                if (parseColorString != -1) {
                                    transition.addCustomColor(i10, str3, str5, (int) parseColorString);
                                }
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) {
        char c;
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> names = cLObject.names();
            if (names == null) {
                return;
            }
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                String str2 = str;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1897525331:
                        if (str2.equals("stagger")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1310311125:
                        if (str2.equals("easing")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1285003983:
                        if (str2.equals("quantize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -791482387:
                        if (str2.equals("pathArc")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -236944793:
                        if (str2.equals("relativeTo")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                c = 65535;
                switch (c) {
                    case 0:
                        typedBundle.add(600, cLObject.getFloat(str2));
                        break;
                    case 1:
                        typedBundle.add(TypedValues.MotionType.TYPE_EASING, cLObject.getString(str2));
                        break;
                    case 2:
                        CLElement cLElement2 = cLObject.get(str2);
                        if (cLElement2 instanceof CLArray) {
                            CLArray cLArray = (CLArray) cLElement2;
                            int size2 = cLArray.size();
                            if (size2 <= 0) {
                                break;
                            } else {
                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                if (size2 <= 1) {
                                    break;
                                } else {
                                    typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                    if (size2 <= 2) {
                                        break;
                                    } else {
                                        typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, cLArray.getFloat(2));
                                        break;
                                    }
                                }
                            }
                        } else {
                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject.getInt(str2));
                            break;
                        }
                    case 3:
                        String string = cLObject.getString(str2);
                        int indexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (indexOf == -1) {
                            System.err.println(cLObject.getLine() + " pathArc = '" + string + "'");
                            break;
                        } else {
                            typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, indexOf);
                            break;
                        }
                    case 4:
                        typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject.getString(str2));
                        break;
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names != null) {
                int size = names.size();
                int i10 = 0;
                while (i10 < size) {
                    String str2 = names.get(i10);
                    i10++;
                    String str3 = str2;
                    CLElement cLElement = parse.get(str3);
                    if (cLElement instanceof CLObject) {
                        CLObject cLObject = (CLObject) cLElement;
                        int hashCode = str3.hashCode();
                        if (hashCode != -2137403731) {
                            if (hashCode != -241441378) {
                                if (hashCode == 1101852654 && str3.equals("ConstraintSets")) {
                                    parseConstraintSets(coreMotionScene, cLObject);
                                }
                            } else if (str3.equals(TypedValues.TransitionType.NAME)) {
                                parseTransitions(coreMotionScene, cLObject);
                            }
                        } else if (str3.equals("Header")) {
                            parseHeader(coreMotionScene, cLObject);
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    public static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                String str2 = str;
                coreMotionScene.setTransitionContent(str2, cLObject.getObject(str2).toJSON());
            }
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                String str2 = str;
                CLElement cLElement = cLObject.get(str2);
                if (cLElement instanceof CLNumber) {
                    layoutVariables.put(str2, cLElement.getInt());
                } else if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                        layoutVariables.put(str2, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_TO)), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                    } else if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has("step")) {
                        layoutVariables.put(str2, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get("step")));
                    } else if (cLObject2.has("ids")) {
                        CLArray array = cLObject2.getArray("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i11 = 0; i11 < array.size(); i11++) {
                            arrayList.add(array.getString(i11));
                        }
                        layoutVariables.put(str2, arrayList);
                    } else if (cLObject2.has("tag")) {
                        layoutVariables.put(str2, state.getIdsForTag(cLObject2.getString("tag")));
                    }
                }
            }
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            int size = names.size();
            int i10 = 0;
            while (i10 < size) {
                String str = names.get(i10);
                i10++;
                applyAttribute(state, layoutVariables, constraintReference, cLObject, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00bb, code lost:
    
        if (r6.equals("hChain") == false) goto L29;
     */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void populateState(@androidx.annotation.NonNull androidx.constraintlayout.core.parser.CLObject r11, @androidx.annotation.NonNull androidx.constraintlayout.core.state.State r12, @androidx.annotation.NonNull androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r13) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.populateState(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
    }

    private static float toPix(State state, float f8) {
        return state.getDpToPixel().toPixels(f8);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        public float get(Object obj) {
            if (obj instanceof CLString) {
                String content = ((CLString) obj).content();
                if (this.mGenerators.containsKey(content)) {
                    return this.mGenerators.get(content).value();
                }
                if (this.mMargins.containsKey(content)) {
                    return this.mMargins.get(content).floatValue();
                }
                return 0.0f;
            }
            if (obj instanceof CLNumber) {
                return ((CLNumber) obj).getFloat();
            }
            return 0.0f;
        }

        public ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        public void put(String str, float f8, float f10, float f11, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f8, f10, f11, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        public void putOverride(String str, float f8) {
            this.mGenerators.put(str, new OverrideValue(f8));
        }

        public void put(String str, float f8, float f10) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f8, f10));
        }

        public void put(String str, int i10) {
            this.mMargins.put(str, Integer.valueOf(i10));
        }

        public void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }
}
