package androidx.vectordrawable.graphics.drawable;

import ai.onnxruntime.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import j1.i;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;
    private float[] mX;
    private float[] mY;

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }

    private void initCubic(float f8, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f8, f10, f11, f12, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(MAX_NUM_POINTS, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.mX = new float[min];
            this.mY = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((i11 * length) / (min - 1), fArr, null);
                this.mX[i11] = fArr[0];
                this.mY[i11] = fArr[1];
            }
            if (Math.abs(this.mX[0]) <= 1.0E-5d && Math.abs(this.mY[0]) <= 1.0E-5d) {
                int i12 = min - 1;
                if (Math.abs(this.mX[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.mY[i12] - 1.0f) <= 1.0E-5d) {
                    float f8 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.mX;
                        int i14 = i13 + 1;
                        float f10 = fArr2[i13];
                        if (f10 >= f8) {
                            fArr2[i10] = f10;
                            i10++;
                            f8 = f10;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f10);
                        }
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    }
                    i.k("The Path should be continuous, can't have 2+ contours");
                    return;
                }
            }
            int i15 = min - 1;
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.mX[0] + "," + this.mY[0] + " end:" + this.mX[i15] + "," + this.mY[i15]);
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void initQuad(float f8, float f10) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f8, f10, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData != null) {
                initPath(createPathFromPathData);
                return;
            }
            throw new InflateException(a.l("The path is null, which is created from ", namedString));
        }
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
                float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
                if (hasAttribute == TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                    if (!hasAttribute) {
                        initQuad(namedFloat, namedFloat2);
                        return;
                    } else {
                        initCubic(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                        return;
                    }
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        float[] fArr;
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i10 = 0;
        while (true) {
            int i11 = length - i10;
            fArr = this.mX;
            if (i11 <= 1) {
                break;
            }
            int i12 = (i10 + length) / 2;
            if (f8 < fArr[i12]) {
                length = i12;
            } else {
                i10 = i12;
            }
        }
        float f10 = fArr[length];
        float f11 = fArr[i10];
        float f12 = f10 - f11;
        float[] fArr2 = this.mY;
        if (f12 == 0.0f) {
            return fArr2[i10];
        }
        float f13 = fArr2[i10];
        return a.b(fArr2[length], f13, (f8 - f11) / f12, f13);
    }

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }
}
