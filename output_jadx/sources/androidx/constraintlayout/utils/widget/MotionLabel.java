package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.view.GravityCompat;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    static final String TAG = "MotionLabel";
    private boolean mAutoSize;
    private int mAutoSizeTextType;
    float mBackgroundPanX;
    float mBackgroundPanY;
    private float mBaseTextSize;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private String mFontFamily;
    private int mGravity;
    private Layout mLayout;
    boolean mNotBuilt;
    Matrix mOutlinePositionMatrix;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    TextPaint mPaint;
    Paint mPaintCache;
    float mPaintTextSize;
    Path mPath;
    RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    private int mStyleIndex;
    Paint mTempPaint;
    Rect mTempRect;
    private String mText;
    private Drawable mTextBackground;
    private Bitmap mTextBackgroundBitmap;
    private Rect mTextBounds;
    private int mTextFillColor;
    private int mTextOutlineColor;
    private float mTextOutlineThickness;
    private float mTextPanX;
    private float mTextPanY;
    private BitmapShader mTextShader;
    private Matrix mTextShaderMatrix;
    private float mTextSize;
    private int mTextureEffect;
    private float mTextureHeight;
    private float mTextureWidth;
    private int mTypefaceIndex;
    private boolean mUseOutline;
    ViewOutlineProvider mViewOutlineProvider;
    float mZoom;

    public MotionLabel(Context context) {
        super(context);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, null);
    }

    private void adjustTexture(float f8, float f10, float f11, float f12) {
        if (this.mTextShaderMatrix == null) {
            return;
        }
        this.mFloatWidth = f11 - f8;
        this.mFloatHeight = f12 - f10;
        updateShaderMatrix();
    }

    private float getHorizontalOffset() {
        float f8;
        float f10;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        TextPaint textPaint = this.mPaint;
        String str = this.mText;
        float measureText = textPaint.measureText(str, 0, str.length()) * f8;
        if (Float.isNaN(this.mFloatWidth)) {
            f10 = getMeasuredWidth();
        } else {
            f10 = this.mFloatWidth;
        }
        return ((this.mTextPanX + 1.0f) * (((f10 - getPaddingLeft()) - getPaddingRight()) - measureText)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f8;
        float f10;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        if (Float.isNaN(this.mFloatHeight)) {
            f10 = getMeasuredHeight();
        } else {
            f10 = this.mFloatHeight;
        }
        float paddingTop = (f10 - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.mTextPanY) * (paddingTop - ((f11 - f12) * f8))) / 2.0f) - (f8 * f12);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.mFontFamily = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.mBaseTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mBaseTextSize);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.mTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mTextSize);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.mStyleIndex = obtainStyledAttributes.getInt(index, this.mStyleIndex);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.mTypefaceIndex = obtainStyledAttributes.getInt(index, this.mTypefaceIndex);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.mTextFillColor = obtainStyledAttributes.getColor(index, this.mTextFillColor);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.mRound);
                    this.mRound = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f8 = obtainStyledAttributes.getFloat(index, this.mRoundPercent);
                    this.mRoundPercent = f8;
                    setRoundPercent(f8);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.mAutoSizeTextType = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.mTextOutlineColor = obtainStyledAttributes.getInt(index, this.mTextOutlineColor);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.mTextOutlineThickness = obtainStyledAttributes.getDimension(index, this.mTextOutlineThickness);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.mTextBackground = obtainStyledAttributes.getDrawable(index);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.mBackgroundPanX = obtainStyledAttributes.getFloat(index, this.mBackgroundPanX);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.mBackgroundPanY = obtainStyledAttributes.getFloat(index, this.mBackgroundPanY);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.mTextPanX = obtainStyledAttributes.getFloat(index, this.mTextPanX);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.mTextPanY = obtainStyledAttributes.getFloat(index, this.mTextPanY);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.mRotate = obtainStyledAttributes.getFloat(index, this.mRotate);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.mZoom = obtainStyledAttributes.getFloat(index, this.mZoom);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.mTextureHeight = obtainStyledAttributes.getDimension(index, this.mTextureHeight);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.mTextureWidth = obtainStyledAttributes.getDimension(index, this.mTextureWidth);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.mTextureEffect = obtainStyledAttributes.getInt(index, this.mTextureEffect);
                }
            }
            obtainStyledAttributes.recycle();
        }
        setupTexture();
        setupPath();
    }

    private void setTypefaceFromAttrs(String str, int i10, int i11) {
        Typeface typeface;
        Typeface create;
        int i12;
        if (str != null) {
            typeface = Typeface.create(str, i11);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z9 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f8 = 0.0f;
        if (i11 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i11);
            } else {
                create = Typeface.create(typeface, i11);
            }
            setTypeface(create);
            if (create != null) {
                i12 = create.getStyle();
            } else {
                i12 = 0;
            }
            int i13 = (~i12) & i11;
            TextPaint textPaint = this.mPaint;
            if ((i13 & 1) == 0) {
                z9 = false;
            }
            textPaint.setFakeBoldText(z9);
            TextPaint textPaint2 = this.mPaint;
            if ((i13 & 2) != 0) {
                f8 = -0.25f;
            }
            textPaint2.setTextSkewX(f8);
            return;
        }
        this.mPaint.setFakeBoldText(false);
        this.mPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.mPaint;
        int i10 = typedValue.data;
        this.mTextFillColor = i10;
        textPaint.setColor(i10);
    }

    private void setupTexture() {
        if (this.mTextBackground != null) {
            this.mTextShaderMatrix = new Matrix();
            int intrinsicWidth = this.mTextBackground.getIntrinsicWidth();
            int intrinsicHeight = this.mTextBackground.getIntrinsicHeight();
            int i10 = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.mTextureWidth)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.mTextureWidth;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.mTextureHeight)) {
                    i10 = (int) this.mTextureHeight;
                }
                intrinsicHeight = i10;
            }
            if (this.mTextureEffect != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.mTextBackgroundBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mTextBackgroundBitmap);
            this.mTextBackground.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.mTextBackground.setFilterBitmap(true);
            this.mTextBackground.draw(canvas);
            if (this.mTextureEffect != 0) {
                this.mTextBackgroundBitmap = blur(this.mTextBackgroundBitmap, 4);
            }
            Bitmap bitmap = this.mTextBackgroundBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.mTextShader = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void updateShaderMatrix() {
        float f8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (Float.isNaN(this.mBackgroundPanX)) {
            f8 = 0.0f;
        } else {
            f8 = this.mBackgroundPanX;
        }
        if (Float.isNaN(this.mBackgroundPanY)) {
            f10 = 0.0f;
        } else {
            f10 = this.mBackgroundPanY;
        }
        if (Float.isNaN(this.mZoom)) {
            f11 = 1.0f;
        } else {
            f11 = this.mZoom;
        }
        if (!Float.isNaN(this.mRotate)) {
            f15 = this.mRotate;
        }
        this.mTextShaderMatrix.reset();
        float width = this.mTextBackgroundBitmap.getWidth();
        float height = this.mTextBackgroundBitmap.getHeight();
        if (Float.isNaN(this.mTextureWidth)) {
            f12 = this.mFloatWidth;
        } else {
            f12 = this.mTextureWidth;
        }
        if (Float.isNaN(this.mTextureHeight)) {
            f13 = this.mFloatHeight;
        } else {
            f13 = this.mTextureHeight;
        }
        if (width * f13 < height * f12) {
            f14 = f12 / width;
        } else {
            f14 = f13 / height;
        }
        float f16 = f11 * f14;
        this.mTextShaderMatrix.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f12 - f17;
        float f19 = f16 * height;
        float f20 = f13 - f19;
        if (!Float.isNaN(this.mTextureHeight)) {
            f20 = this.mTextureHeight / 2.0f;
        }
        if (!Float.isNaN(this.mTextureWidth)) {
            f18 = this.mTextureWidth / 2.0f;
        }
        this.mTextShaderMatrix.postTranslate((((f8 * f18) + f12) - f17) * 0.5f, (((f10 * f20) + f13) - f19) * 0.5f);
        this.mTextShaderMatrix.postRotate(f15, f12 / 2.0f, f13 / 2.0f);
        this.mTextShader.setLocalMatrix(this.mTextShaderMatrix);
    }

    public Bitmap blur(Bitmap bitmap, int i10) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i11 = 0; i11 < i10 && width >= 32 && height >= 32; i11++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    public void buildShape(float f8) {
        if (!this.mUseOutline && f8 == 1.0f) {
            return;
        }
        this.mPath.reset();
        String str = this.mText;
        int length = str.length();
        this.mPaint.getTextBounds(str, 0, length, this.mTextBounds);
        this.mPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.mPath);
        if (f8 != 1.0f) {
            Log.v(TAG, Debug.getLoc() + " scale " + f8);
            Matrix matrix = new Matrix();
            matrix.postScale(f8, f8);
            this.mPath.transform(matrix);
        }
        Rect rect = this.mTextBounds;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.mNotBuilt = false;
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getScaleFromTextSize() {
        return this.mBaseTextSize;
    }

    public float getTextBackgroundPanX() {
        return this.mBackgroundPanX;
    }

    public float getTextBackgroundPanY() {
        return this.mBackgroundPanY;
    }

    public float getTextBackgroundRotate() {
        return this.mRotate;
    }

    public float getTextBackgroundZoom() {
        return this.mZoom;
    }

    public int getTextOutlineColor() {
        return this.mTextOutlineColor;
    }

    public float getTextPanX() {
        return this.mTextPanX;
    }

    public float getTextPanY() {
        return this.mTextPanY;
    }

    public float getTextureHeight() {
        return this.mTextureHeight;
    }

    public float getTextureWidth() {
        return this.mTextureWidth;
    }

    public Typeface getTypeface() {
        return this.mPaint.getTypeface();
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f8, float f10, float f11, float f12) {
        float f13;
        int i10 = (int) (f8 + 0.5f);
        this.mDeltaLeft = f8 - i10;
        int i11 = (int) (f11 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f12 + 0.5f);
        int i14 = (int) (0.5f + f10);
        int i15 = i13 - i14;
        float f14 = f11 - f8;
        this.mFloatWidth = f14;
        float f15 = f12 - f10;
        this.mFloatHeight = f15;
        adjustTexture(f8, f10, f11, f12);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i15, BasicMeasure.EXACTLY));
            super.layout(i10, i14, i11, i13);
        }
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            this.mFloatWidth = f14;
            this.mFloatHeight = f15;
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            float height = this.mTempRect.height() * 1.3f;
            float f16 = (f14 - this.mPaddingRight) - this.mPaddingLeft;
            float f17 = (f15 - this.mPaddingBottom) - this.mPaddingTop;
            float width = this.mTempRect.width();
            float f18 = width * f17;
            float f19 = height * f16;
            TextPaint textPaint = this.mPaint;
            if (f18 > f19) {
                textPaint.setTextSize((this.mPaintTextSize * f16) / width);
            } else {
                textPaint.setTextSize((this.mPaintTextSize * f17) / height);
            }
            if (this.mUseOutline || !Float.isNaN(this.mBaseTextSize)) {
                if (Float.isNaN(this.mBaseTextSize)) {
                    f13 = 1.0f;
                } else {
                    f13 = this.mTextSize / this.mBaseTextSize;
                }
                buildShape(f13);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        float f8;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        super.onDraw(canvas);
        if (!this.mUseOutline && f8 == 1.0f) {
            canvas.drawText(this.mText, this.mDeltaLeft + this.mPaddingLeft + getHorizontalOffset(), this.mPaddingTop + getVerticalOffset(), this.mPaint);
            return;
        }
        if (this.mNotBuilt) {
            buildShape(f8);
        }
        if (this.mOutlinePositionMatrix == null) {
            this.mOutlinePositionMatrix = new Matrix();
        }
        if (this.mUseOutline) {
            this.mPaintCache.set(this.mPaint);
            this.mOutlinePositionMatrix.reset();
            float horizontalOffset = this.mPaddingLeft + getHorizontalOffset();
            float verticalOffset = this.mPaddingTop + getVerticalOffset();
            this.mOutlinePositionMatrix.postTranslate(horizontalOffset, verticalOffset);
            this.mOutlinePositionMatrix.preScale(f8, f8);
            this.mPath.transform(this.mOutlinePositionMatrix);
            BitmapShader bitmapShader = this.mTextShader;
            TextPaint textPaint = this.mPaint;
            if (bitmapShader != null) {
                textPaint.setFilterBitmap(true);
                this.mPaint.setShader(this.mTextShader);
            } else {
                textPaint.setColor(this.mTextFillColor);
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            if (this.mTextShader != null) {
                this.mPaint.setShader(null);
            }
            this.mPaint.setColor(this.mTextOutlineColor);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.postTranslate(-horizontalOffset, -verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            this.mPaint.set(this.mPaintCache);
            return;
        }
        float horizontalOffset2 = this.mPaddingLeft + getHorizontalOffset();
        float verticalOffset2 = this.mPaddingTop + getVerticalOffset();
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(horizontalOffset2, verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.mAutoSize = false;
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.mAutoSizeTextType != 0) {
                this.mAutoSize = true;
            }
        } else {
            TextPaint textPaint = this.mPaint;
            String str = this.mText;
            textPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
            if (mode != 1073741824) {
                size = (int) (this.mTextBounds.width() + 0.99999f);
            }
            size += this.mPaddingLeft + this.mPaddingRight;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.mPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.mPaddingTop + this.mPaddingBottom + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i10) {
        if ((i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i10 |= GravityCompat.START;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.mGravity) {
            invalidate();
        }
        this.mGravity = i10;
        int i11 = i10 & 112;
        if (i11 != 48) {
            if (i11 != 80) {
                this.mTextPanY = 0.0f;
            } else {
                this.mTextPanY = 1.0f;
            }
        } else {
            this.mTextPanY = -1.0f;
        }
        int i12 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.mTextPanX = 0.0f;
                        return;
                    }
                }
            }
            this.mTextPanX = 1.0f;
            return;
        }
        this.mTextPanX = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f8) {
        boolean z9;
        if (Float.isNaN(f8)) {
            this.mRound = f8;
            float f10 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f10);
            return;
        }
        if (this.mRound != f8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mRound = f8;
        if (f8 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.mRound);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f11 = this.mRound;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z9) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f8) {
        boolean z9;
        if (this.mRoundPercent != f8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mRoundPercent = f8;
        if (f8 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (MotionLabel.this.mRoundPercent * Math.min(r3, r4)) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z9) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f8) {
        this.mBaseTextSize = f8;
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f8) {
        this.mBackgroundPanX = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundPanY(float f8) {
        this.mBackgroundPanY = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundRotate(float f8) {
        this.mRotate = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundZoom(float f8) {
        this.mZoom = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.mTextFillColor = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.mTextOutlineColor = i10;
        this.mUseOutline = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f8) {
        this.mTextOutlineThickness = f8;
        this.mUseOutline = true;
        if (Float.isNaN(f8)) {
            this.mTextOutlineThickness = 1.0f;
            this.mUseOutline = false;
        }
        invalidate();
    }

    public void setTextPanX(float f8) {
        this.mTextPanX = f8;
        invalidate();
    }

    public void setTextPanY(float f8) {
        this.mTextPanY = f8;
        invalidate();
    }

    public void setTextSize(float f8) {
        float f10;
        this.mTextSize = f8;
        TextPaint textPaint = this.mPaint;
        if (!Float.isNaN(this.mBaseTextSize)) {
            f8 = this.mBaseTextSize;
        }
        textPaint.setTextSize(f8);
        if (Float.isNaN(this.mBaseTextSize)) {
            f10 = 1.0f;
        } else {
            f10 = this.mTextSize / this.mBaseTextSize;
        }
        buildShape(f10);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f8) {
        this.mTextureHeight = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextureWidth(float f8) {
        this.mTextureWidth = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (!Objects.equals(this.mPaint.getTypeface(), typeface)) {
            this.mPaint.setTypeface(typeface);
            if (this.mLayout != null) {
                this.mLayout = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public void setupPath() {
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        setTypefaceFromAttrs(this.mFontFamily, this.mTypefaceIndex, this.mStyleIndex);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setFlags(128);
        setTextSize(this.mTextSize);
        this.mPaint.setAntiAlias(true);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean isNaN = Float.isNaN(this.mBaseTextSize);
        float f8 = isNaN ? 1.0f : this.mTextSize / this.mBaseTextSize;
        this.mFloatWidth = i12 - i10;
        this.mFloatHeight = i13 - i11;
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int width = this.mTempRect.width();
            int height = (int) (this.mTempRect.height() * 1.3f);
            float f10 = (this.mFloatWidth - this.mPaddingRight) - this.mPaddingLeft;
            float f11 = (this.mFloatHeight - this.mPaddingBottom) - this.mPaddingTop;
            if (isNaN) {
                float f12 = width;
                float f13 = f12 * f11;
                float f14 = height;
                float f15 = f14 * f10;
                TextPaint textPaint = this.mPaint;
                if (f13 > f15) {
                    textPaint.setTextSize((this.mPaintTextSize * f10) / f12);
                } else {
                    textPaint.setTextSize((this.mPaintTextSize * f11) / f14);
                }
            } else {
                float f16 = width;
                float f17 = height;
                f8 = f16 * f11 > f17 * f10 ? f10 / f16 : f11 / f17;
            }
        }
        if (this.mUseOutline || !isNaN) {
            adjustTexture(i10, i11, i12, i13);
            buildShape(f8);
        }
    }
}
