package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import j1.i;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {
    private Path mOriginalPatternPath;

    @NonNull
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.PATTERN_PATH_MOTION);
        try {
            String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                setPatternPath(PathParser.createPathFromPathData(namedString));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float distance(float f8, float f10) {
        return (float) Math.sqrt((f10 * f10) + (f8 * f8));
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f8, float f10, float f11, float f12) {
        float f13 = f11 - f8;
        float f14 = f12 - f10;
        float distance = distance(f13, f14);
        double atan2 = Math.atan2(f14, f13);
        this.mTempMatrix.setScale(distance, distance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(atan2));
        this.mTempMatrix.postTranslate(f8, f10);
        Path path = new Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    @NonNull
    public Path getPatternPath() {
        return this.mOriginalPatternPath;
    }

    public void setPatternPath(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f8 = fArr[0];
        float f10 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        if (f11 == f8 && f12 == f10) {
            i.k("pattern must not end at the starting point");
            return;
        }
        this.mTempMatrix.setTranslate(-f11, -f12);
        float f13 = f8 - f11;
        float f14 = f10 - f12;
        float distance = 1.0f / distance(f13, f14);
        this.mTempMatrix.postScale(distance, distance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(-Math.atan2(f14, f13)));
        path.transform(this.mTempMatrix, this.mPatternPath);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion() {
        Path path = new Path();
        this.mPatternPath = path;
        this.mTempMatrix = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion(@NonNull Path path) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        setPatternPath(path);
    }
}
