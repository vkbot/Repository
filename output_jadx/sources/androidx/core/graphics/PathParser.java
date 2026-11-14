package androidx.core.graphics;

import ai.onnxruntime.b;
import android.graphics.Path;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
            if (pathDataNodeArr[i10].mType != pathDataNodeArr2[i10].mType || pathDataNodeArr[i10].mParams.length != pathDataNodeArr2[i10].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i10, int i11) {
        if (i10 <= i11) {
            int length = fArr.length;
            if (i10 >= 0 && i10 <= length) {
                int i12 = i11 - i10;
                int min = Math.min(i12, length - i10);
                float[] fArr2 = new float[i12];
                System.arraycopy(fArr, i10, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        i.a();
        return null;
    }

    @NonNull
    public static PathDataNode[] createNodesFromPathData(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            int nextStart = nextStart(str, i11);
            String trim = str.substring(i10, nextStart).trim();
            if (!trim.isEmpty()) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i10 = nextStart;
            i11 = nextStart + 1;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            addNode(arrayList, str.charAt(i10), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    @NonNull
    public static Path createPathFromPathData(@NonNull String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            b.o(ai.onnxruntime.a.l("Error in parsing ", str), e);
            return null;
        }
    }

    @NonNull
    public static PathDataNode[] deepCopyNodes(@NonNull PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
            pathDataNodeArr2[i10] = new PathDataNode(pathDataNodeArr[i10]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.mEndWithNegOrDot = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.mEndWithNegOrDot = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                ExtractFloatResult extractFloatResult = new ExtractFloatResult();
                int length = str.length();
                int i10 = 1;
                int i11 = 0;
                while (i10 < length) {
                    extract(str, i10, extractFloatResult);
                    int i12 = extractFloatResult.mEndPosition;
                    if (i10 < i12) {
                        fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                        i11++;
                    }
                    if (extractFloatResult.mEndWithNegOrDot) {
                        i10 = i12;
                    } else {
                        i10 = i12 + 1;
                    }
                }
                return copyOfRange(fArr, 0, i11);
            } catch (NumberFormatException e) {
                b.o(ai.onnxruntime.a.m("error in parsing \"", str, "\""), e);
                return null;
            }
        }
        return new float[0];
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3, float f8) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
                pathDataNodeArr[i10].interpolatePathDataNode(pathDataNodeArr2[i10], pathDataNodeArr3[i10], f8);
            }
            return true;
        }
        j1.i.k("The nodes to be interpolated and resulting nodes must have the same length");
        return false;
    }

    private static int nextStart(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if ((charAt - 'Z') * (charAt - 'A') > 0) {
                if ((charAt - 'z') * (charAt - 'a') > 0) {
                    continue;
                    i10++;
                }
            }
            if (charAt != 'e' && charAt != 'E') {
                break;
            }
            i10++;
        }
        return i10;
    }

    public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
            c = pathDataNode.mType;
        }
    }

    public static void updateNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2) {
        for (int i10 = 0; i10 < pathDataNodeArr2.length; i10++) {
            pathDataNodeArr[i10].mType = pathDataNodeArr2[i10].mType;
            for (int i11 = 0; i11 < pathDataNodeArr2[i10].mParams.length; i11++) {
                pathDataNodeArr[i10].mParams[i11] = pathDataNodeArr2[i10].mParams[i11];
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c, char c10, float[] fArr2) {
            int i10;
            int i11;
            boolean z9;
            boolean z10;
            char c11;
            char c12;
            int i12;
            float f8;
            boolean z11;
            boolean z12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            boolean z13;
            boolean z14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            Path path2 = path;
            boolean z15 = false;
            float f25 = fArr[0];
            boolean z16 = true;
            float f26 = fArr[1];
            char c13 = 2;
            float f27 = fArr[2];
            char c14 = 3;
            float f28 = fArr[3];
            float f29 = fArr[4];
            float f30 = fArr[5];
            switch (c10) {
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f29, f30);
                    f25 = f29;
                    f27 = f25;
                    f26 = f30;
                    f28 = f26;
                    i11 = 2;
                    break;
            }
            float f31 = f25;
            float f32 = f26;
            float f33 = f29;
            float f34 = f30;
            int i13 = 0;
            char c15 = c;
            while (i13 < fArr2.length) {
                if (c10 != 'A') {
                    if (c10 != 'C') {
                        if (c10 != 'H') {
                            if (c10 != 'Q') {
                                z9 = z15;
                                if (c10 != 'V') {
                                    if (c10 != 'a') {
                                        if (c10 != 'c') {
                                            z10 = z16;
                                            if (c10 != 'h') {
                                                if (c10 != 'q') {
                                                    c11 = c13;
                                                    if (c10 != 'v') {
                                                        if (c10 != 'L') {
                                                            if (c10 != 'M') {
                                                                c12 = c14;
                                                                if (c10 != 'S') {
                                                                    if (c10 != 'T') {
                                                                        if (c10 != 'l') {
                                                                            if (c10 != 'm') {
                                                                                if (c10 != 's') {
                                                                                    if (c10 == 't') {
                                                                                        if (c15 != 'q' && c15 != 't' && c15 != 'Q' && c15 != 'T') {
                                                                                            f24 = 0.0f;
                                                                                            f23 = 0.0f;
                                                                                        } else {
                                                                                            f23 = f31 - f27;
                                                                                            f24 = f32 - f28;
                                                                                        }
                                                                                        int i14 = i13 + 1;
                                                                                        path2.rQuadTo(f23, f24, fArr2[i13], fArr2[i14]);
                                                                                        float f35 = f23 + f31;
                                                                                        float f36 = f24 + f32;
                                                                                        f31 += fArr2[i13];
                                                                                        f32 += fArr2[i14];
                                                                                        f28 = f36;
                                                                                        f27 = f35;
                                                                                    }
                                                                                } else {
                                                                                    if (c15 != 'c' && c15 != 's' && c15 != 'C' && c15 != 'S') {
                                                                                        f22 = 0.0f;
                                                                                        f21 = 0.0f;
                                                                                    } else {
                                                                                        f21 = f32 - f28;
                                                                                        f22 = f31 - f27;
                                                                                    }
                                                                                    int i15 = i13 + 1;
                                                                                    int i16 = i13 + 2;
                                                                                    int i17 = i13 + 3;
                                                                                    path2.rCubicTo(f22, f21, fArr2[i13], fArr2[i15], fArr2[i16], fArr2[i17]);
                                                                                    f15 = fArr2[i13] + f31;
                                                                                    f16 = fArr2[i15] + f32;
                                                                                    f31 += fArr2[i16];
                                                                                    f17 = fArr2[i17];
                                                                                }
                                                                            } else {
                                                                                float f37 = fArr2[i13];
                                                                                f31 += f37;
                                                                                float f38 = fArr2[i13 + 1];
                                                                                f32 += f38;
                                                                                if (i13 > 0) {
                                                                                    path2.rLineTo(f37, f38);
                                                                                } else {
                                                                                    path2.rMoveTo(f37, f38);
                                                                                    f33 = f31;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i18 = i13 + 1;
                                                                            path2.rLineTo(fArr2[i13], fArr2[i18]);
                                                                            f31 += fArr2[i13];
                                                                            f18 = fArr2[i18];
                                                                        }
                                                                    } else {
                                                                        if (c15 == 'q' || c15 == 't' || c15 == 'Q' || c15 == 'T') {
                                                                            f31 = (f31 * 2.0f) - f27;
                                                                            f32 = (f32 * 2.0f) - f28;
                                                                        }
                                                                        int i19 = i13 + 1;
                                                                        path2.quadTo(f31, f32, fArr2[i13], fArr2[i19]);
                                                                        float f39 = fArr2[i13];
                                                                        f12 = fArr2[i19];
                                                                        f27 = f31;
                                                                        f28 = f32;
                                                                        i12 = i13;
                                                                        f31 = f39;
                                                                    }
                                                                } else {
                                                                    if (c15 == 'c' || c15 == 's' || c15 == 'C' || c15 == 'S') {
                                                                        f31 = (f31 * 2.0f) - f27;
                                                                        f32 = (f32 * 2.0f) - f28;
                                                                    }
                                                                    float f40 = f31;
                                                                    float f41 = f32;
                                                                    int i20 = i13 + 1;
                                                                    int i21 = i13 + 2;
                                                                    int i22 = i13 + 3;
                                                                    path2.cubicTo(f40, f41, fArr2[i13], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                                    f10 = fArr2[i13];
                                                                    f11 = fArr2[i20];
                                                                    f31 = fArr2[i21];
                                                                    f32 = fArr2[i22];
                                                                    i12 = i13;
                                                                }
                                                            } else {
                                                                c12 = c14;
                                                                f19 = fArr2[i13];
                                                                f20 = fArr2[i13 + 1];
                                                                if (i13 > 0) {
                                                                    path2.lineTo(f19, f20);
                                                                } else {
                                                                    path2.moveTo(f19, f20);
                                                                    f31 = f19;
                                                                    f33 = f31;
                                                                    f32 = f20;
                                                                }
                                                            }
                                                            f34 = f32;
                                                        } else {
                                                            c12 = c14;
                                                            int i23 = i13 + 1;
                                                            path2.lineTo(fArr2[i13], fArr2[i23]);
                                                            f19 = fArr2[i13];
                                                            f20 = fArr2[i23];
                                                        }
                                                        f31 = f19;
                                                        f32 = f20;
                                                    } else {
                                                        c12 = c14;
                                                        path2.rLineTo(0.0f, fArr2[i13]);
                                                        f18 = fArr2[i13];
                                                    }
                                                    f32 += f18;
                                                } else {
                                                    c11 = c13;
                                                    c12 = c14;
                                                    int i24 = i13 + 1;
                                                    int i25 = i13 + 2;
                                                    int i26 = i13 + 3;
                                                    path2.rQuadTo(fArr2[i13], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                    f15 = fArr2[i13] + f31;
                                                    f16 = fArr2[i24] + f32;
                                                    f31 += fArr2[i25];
                                                    f17 = fArr2[i26];
                                                }
                                                f32 += f17;
                                                f27 = f15;
                                                f28 = f16;
                                            } else {
                                                c11 = c13;
                                                c12 = c14;
                                                path2.rLineTo(fArr2[i13], 0.0f);
                                                f31 += fArr2[i13];
                                            }
                                        } else {
                                            z10 = z16;
                                            c11 = c13;
                                            c12 = c14;
                                            int i27 = i13 + 2;
                                            int i28 = i13 + 3;
                                            int i29 = i13 + 4;
                                            int i30 = i13 + 5;
                                            path2.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            float f42 = fArr2[i27] + f31;
                                            float f43 = fArr2[i28] + f32;
                                            f31 += fArr2[i29];
                                            f32 += fArr2[i30];
                                            f27 = f42;
                                            f28 = f43;
                                        }
                                        i12 = i13;
                                    } else {
                                        z10 = z16;
                                        c11 = c13;
                                        c12 = c14;
                                        int i31 = i13 + 5;
                                        float f44 = fArr2[i31] + f31;
                                        int i32 = i13 + 6;
                                        float f45 = fArr2[i32] + f32;
                                        float f46 = fArr2[i13];
                                        float f47 = fArr2[i13 + 1];
                                        float f48 = fArr2[i13 + 2];
                                        if (fArr2[i13 + 3] != 0.0f) {
                                            f13 = 0.0f;
                                            f14 = f32;
                                            z13 = z10;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = f32;
                                            z13 = z9;
                                        }
                                        i12 = i13;
                                        if (fArr2[i13 + 4] != f13) {
                                            z14 = z10;
                                        } else {
                                            z14 = z9;
                                        }
                                        float f49 = f31;
                                        drawArc(path, f49, f14, f44, f45, f46, f47, f48, z13, z14);
                                        f31 = f49 + fArr2[i31];
                                        f32 = f14 + fArr2[i32];
                                        f27 = f31;
                                        f28 = f32;
                                    }
                                } else {
                                    z10 = z16;
                                    c11 = c13;
                                    c12 = c14;
                                    i12 = i13;
                                    path2.lineTo(f31, fArr2[i12]);
                                    f12 = fArr2[i12];
                                }
                                f32 = f12;
                            } else {
                                z9 = z15;
                                z10 = z16;
                                c11 = c13;
                                c12 = c14;
                                i12 = i13;
                                int i33 = i12 + 1;
                                int i34 = i12 + 2;
                                int i35 = i12 + 3;
                                path2.quadTo(fArr2[i12], fArr2[i33], fArr2[i34], fArr2[i35]);
                                f10 = fArr2[i12];
                                f11 = fArr2[i33];
                                f31 = fArr2[i34];
                                f32 = fArr2[i35];
                            }
                            f27 = f10;
                            f28 = f11;
                        } else {
                            z9 = z15;
                            z10 = z16;
                            c11 = c13;
                            c12 = c14;
                            i12 = i13;
                            path2.lineTo(fArr2[i12], f32);
                            f31 = fArr2[i12];
                        }
                    } else {
                        z9 = z15;
                        z10 = z16;
                        c11 = c13;
                        c12 = c14;
                        i12 = i13;
                        int i36 = i12 + 2;
                        int i37 = i12 + 3;
                        int i38 = i12 + 4;
                        int i39 = i12 + 5;
                        path2.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                        float f50 = fArr2[i38];
                        float f51 = fArr2[i39];
                        float f52 = fArr2[i36];
                        float f53 = fArr2[i37];
                        f31 = f50;
                        f32 = f51;
                        f28 = f53;
                        f27 = f52;
                    }
                } else {
                    float f54 = f31;
                    float f55 = f32;
                    z9 = z15;
                    z10 = z16;
                    c11 = c13;
                    c12 = c14;
                    i12 = i13;
                    int i40 = i12 + 5;
                    float f56 = fArr2[i40];
                    int i41 = i12 + 6;
                    float f57 = fArr2[i41];
                    float f58 = fArr2[i12];
                    float f59 = fArr2[i12 + 1];
                    float f60 = fArr2[i12 + 2];
                    if (fArr2[i12 + 3] != 0.0f) {
                        f8 = 0.0f;
                        z11 = z10;
                    } else {
                        f8 = 0.0f;
                        z11 = z9;
                    }
                    if (fArr2[i12 + 4] != f8) {
                        z12 = z10;
                    } else {
                        z12 = z9;
                    }
                    drawArc(path, f54, f55, f56, f57, f58, f59, f60, z11, z12);
                    f27 = fArr2[i40];
                    f31 = f27;
                    f28 = fArr2[i41];
                    f32 = f28;
                }
                i13 = i12 + i11;
                path2 = path;
                c15 = c10;
                z15 = z9;
                z16 = z10;
                c13 = c11;
                c14 = c12;
            }
            fArr[z15 ? 1 : 0] = f31;
            fArr[z16 ? 1 : 0] = f32;
            fArr[c13] = f27;
            fArr[c14] = f28;
            fArr[4] = f33;
            fArr[5] = f34;
        }

        private static void arcToBezier(Path path, double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
            double d18 = d11;
            int ceil = (int) Math.ceil(Math.abs((d17 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d15);
            double sin = Math.sin(d15);
            double cos2 = Math.cos(d16);
            double sin2 = Math.sin(d16);
            double d19 = -d18;
            double d20 = d19 * cos;
            double d21 = d12 * sin;
            double d22 = (d20 * sin2) - (d21 * cos2);
            double d23 = d19 * sin;
            double d24 = d12 * cos;
            double d25 = (cos2 * d24) + (sin2 * d23);
            double d26 = d17 / ceil;
            double d27 = d25;
            double d28 = d22;
            int i10 = 0;
            double d29 = d13;
            double d30 = d14;
            double d31 = d16;
            while (i10 < ceil) {
                double d32 = d31 + d26;
                double sin3 = Math.sin(d32);
                double cos3 = Math.cos(d32);
                double d33 = (((d18 * cos) * cos3) + d) - (d21 * sin3);
                int i11 = i10;
                double d34 = (d24 * sin3) + (d11 * sin * cos3) + d10;
                double d35 = (d20 * sin3) - (d21 * cos3);
                double d36 = (cos3 * d24) + (sin3 * d23);
                double d37 = d32 - d31;
                double tan = Math.tan(d37 / 2.0d);
                double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d37)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d28 * sqrt) + d29), (float) ((d27 * sqrt) + d30), (float) (d33 - (sqrt * d35)), (float) (d34 - (sqrt * d36)), (float) d33, (float) d34);
                sin = sin;
                d26 = d26;
                d29 = d33;
                d23 = d23;
                cos = cos;
                d27 = d36;
                d28 = d35;
                d18 = d11;
                d30 = d34;
                i10 = i11 + 1;
                ceil = ceil;
                d31 = d32;
            }
        }

        private static void drawArc(Path path, float f8, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10) {
            double d;
            double d10;
            boolean z11;
            double radians = Math.toRadians(f15);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d11 = f8;
            double d12 = f10;
            double d13 = f13;
            double d14 = ((d12 * sin) + (d11 * cos)) / d13;
            double d15 = f14;
            double d16 = ((d12 * cos) + ((-f8) * sin)) / d15;
            double d17 = f12;
            double d18 = ((d17 * sin) + (f11 * cos)) / d13;
            double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
            double d20 = d14 - d18;
            double d21 = d16 - d19;
            double d22 = (d14 + d18) / 2.0d;
            double d23 = (d16 + d19) / 2.0d;
            double d24 = (d21 * d21) + (d20 * d20);
            if (d24 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d24);
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                drawArc(path, f8, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z9, z10);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = sqrt2 * d20;
            double d27 = sqrt2 * d21;
            if (z9 == z10) {
                d = d22 - d27;
                d10 = d23 + d26;
            } else {
                d = d22 + d27;
                d10 = d23 - d26;
            }
            double atan2 = Math.atan2(d16 - d10, d14 - d);
            double atan22 = Math.atan2(d19 - d10, d18 - d) - atan2;
            if (atan22 >= 0.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d28 = d * d13;
            double d29 = d10 * d15;
            arcToBezier(path, (d28 * cos) - (d29 * sin), (d29 * cos) + (d28 * sin), d13, d15, d11, d12, radians, atan2, atan22);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        @NonNull
        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(@NonNull PathDataNode pathDataNode, @NonNull PathDataNode pathDataNode2, float f8) {
            this.mType = pathDataNode.mType;
            int i10 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i10 < fArr.length) {
                    this.mParams[i10] = (pathDataNode2.mParams[i10] * f8) + ((1.0f - f8) * fArr[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }
    }

    public static void interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, float f8, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3) {
        if (interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f8)) {
            return;
        }
        j1.i.k("Can't interpolate between two incompatible pathData");
    }
}
