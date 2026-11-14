package androidx.appcompat.graphics.drawable;

import ai.onnxruntime.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float lerp(float f8, float f10, float f11) {
        return a.b(f10, f8, f11, f8);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float f8;
        float f10;
        int i10;
        Rect bounds = getBounds();
        int i11 = this.mDirection;
        boolean z9 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z9 = true;
        }
        float f11 = this.mArrowHeadLength;
        float lerp = lerp(this.mBarLength, (float) Math.sqrt(f11 * f11 * 2.0f), this.mProgress);
        float lerp2 = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        float round = Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        float lerp3 = lerp(0.0f, ARROW_HEAD_ANGLE, this.mProgress);
        if (z9) {
            f8 = 0.0f;
        } else {
            f8 = -180.0f;
        }
        if (z9) {
            f10 = 180.0f;
        } else {
            f10 = 0.0f;
        }
        float lerp4 = lerp(f8, f10, this.mProgress);
        double d = lerp;
        double d10 = lerp3;
        boolean z10 = z9;
        float round2 = (float) Math.round(Math.cos(d10) * d);
        float round3 = (float) Math.round(Math.sin(d10) * d);
        this.mPath.rewind();
        float lerp5 = lerp(this.mPaint.getStrokeWidth() + this.mBarGap, -this.mMaxCutForBarSize, this.mProgress);
        float f12 = (-lerp2) / 2.0f;
        this.mPath.moveTo(f12 + round, 0.0f);
        this.mPath.rLineTo(lerp2 - (round * 2.0f), 0.0f);
        this.mPath.moveTo(f12, lerp5);
        this.mPath.rLineTo(round2, round3);
        this.mPath.moveTo(f12, -lerp5);
        this.mPath.rLineTo(round2, -round3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        float f13 = this.mBarGap;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f13 + ((((int) (height - (f13 * 2.0f))) / 4) * 2));
        if (this.mSpin) {
            if (this.mVerticalMirror ^ z10) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas.rotate(lerp4 * i10);
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }

    public int getDirection() {
        return this.mDirection;
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.mPaint;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.mProgress;
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f8) {
        if (this.mArrowHeadLength != f8) {
            this.mArrowHeadLength = f8;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f8) {
        if (this.mArrowShaftLength != f8) {
            this.mArrowShaftLength = f8;
            invalidateSelf();
        }
    }

    public void setBarLength(float f8) {
        if (this.mBarLength != f8) {
            this.mBarLength = f8;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f8) {
        if (this.mPaint.getStrokeWidth() != f8) {
            this.mPaint.setStrokeWidth(f8);
            this.mMaxCutForBarSize = (float) (Math.cos(ARROW_HEAD_ANGLE) * (f8 / 2.0f));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i10) {
        if (i10 != this.mPaint.getColor()) {
            this.mPaint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i10) {
        if (i10 != this.mDirection) {
            this.mDirection = i10;
            invalidateSelf();
        }
    }

    public void setGapSize(float f8) {
        if (f8 != this.mBarGap) {
            this.mBarGap = f8;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (this.mProgress != f8) {
            this.mProgress = f8;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z9) {
        if (this.mSpin != z9) {
            this.mSpin = z9;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z9) {
        if (this.mVerticalMirror != z9) {
            this.mVerticalMirror = z9;
            invalidateSelf();
        }
    }
}
