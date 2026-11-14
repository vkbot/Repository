package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @DoNotInline
        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static Typeface create(Typeface typeface, int i10, boolean z9) {
            return Typeface.create(typeface, i10, z9);
        }
    }

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i10) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i10);
        if (tintList != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative[0];
            if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
                TextView textView = this.mView;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        TextView textView2 = this.mView;
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i10, float f8) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i10, f8);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        int i10;
        String string;
        boolean z9;
        boolean z10;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i12;
            if (i12 != -1) {
                this.mStyle &= 2;
            }
        }
        boolean z11 = true;
        if (!tintTypedArray.hasValue(R.styleable.TextAppearance_android_fontFamily) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_typeface)) {
                this.mAsyncFontPending = false;
                int i13 = tintTypedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.mFontTypeface = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                }
                this.mFontTypeface = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.mFontTypeface = null;
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            i10 = R.styleable.TextAppearance_fontFamily;
        } else {
            i10 = R.styleable.TextAppearance_android_fontFamily;
        }
        final int i14 = this.mFontWeight;
        final int i15 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i10, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrieved */
                    public void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
                        int i16;
                        boolean z12;
                        if (Build.VERSION.SDK_INT >= 28 && (i16 = i14) != -1) {
                            if ((i15 & 2) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            typeface = Api28Impl.create(typeface, i16, z12);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrievalFailed */
                    public void lambda$callbackFailAsync$1(int i16) {
                    }
                });
                if (font != null) {
                    if (i11 >= 28 && this.mFontWeight != -1) {
                        Typeface create = Typeface.create(font, 0);
                        int i16 = this.mFontWeight;
                        if ((this.mStyle & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.mFontTypeface = Api28Impl.create(create, i16, z10);
                    } else {
                        this.mFontTypeface = font;
                    }
                }
                if (this.mFontTypeface == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.mAsyncFontPending = z9;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface == null && (string = tintTypedArray.getString(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.mFontWeight;
                if ((this.mStyle & 2) == 0) {
                    z11 = false;
                }
                this.mFontTypeface = Api28Impl.create(create2, i17, z11);
                return;
            }
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        }
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i10) {
        boolean z9;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i11;
        float f8;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextHelper, i10, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), R.styleable.AppCompatTextHelper, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z12 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (!z12 && obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_textAllCaps)) {
                z9 = obtainStyledAttributes2.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
                z10 = true;
            } else {
                z9 = false;
                z10 = false;
            }
            updateTypefaceAndStyle(context, obtainStyledAttributes2);
            if (obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_textLocale)) {
                str = obtainStyledAttributes2.getString(R.styleable.TextAppearance_textLocale);
            } else {
                str = null;
            }
            if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes2.hasValue(R.styleable.TextAppearance_fontVariationSettings)) {
                str2 = obtainStyledAttributes2.getString(R.styleable.TextAppearance_fontVariationSettings);
            } else {
                str2 = null;
            }
            obtainStyledAttributes2.recycle();
        } else {
            z9 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i10, 0);
        if (!z12 && obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            z9 = obtainStyledAttributes3.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
            z11 = true;
        } else {
            z11 = z10;
        }
        if (obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_textLocale)) {
            str = obtainStyledAttributes3.getString(R.styleable.TextAppearance_textLocale);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_fontVariationSettings)) {
            str2 = obtainStyledAttributes3.getString(R.styleable.TextAppearance_fontVariationSettings);
        }
        if (i12 >= 28 && obtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes3.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes3);
        obtainStyledAttributes3.recycle();
        if (!z12 && z11) {
            setAllCaps(z9);
        }
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            int i13 = this.mFontWeight;
            TextView textView2 = this.mView;
            if (i13 == -1) {
                textView2.setTypeface(typeface, this.mStyle);
            } else {
                textView2.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            Api26Impl.setFontVariationSettings(this.mView, str2);
        }
        if (str != null) {
            Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(str));
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i10);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                float autoSizeStepGranularity = Api26Impl.getAutoSizeStepGranularity(this.mView);
                TextView textView3 = this.mView;
                if (autoSizeStepGranularity != -1.0f) {
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(textView3, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(textView3, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        TintTypedArray obtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
        int resourceId2 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        if (resourceId2 != -1) {
            drawable = appCompatDrawableManager.getDrawable(context, resourceId2);
        } else {
            drawable = null;
        }
        int resourceId3 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        if (resourceId3 != -1) {
            drawable2 = appCompatDrawableManager.getDrawable(context, resourceId3);
        } else {
            drawable2 = null;
        }
        int resourceId4 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        if (resourceId4 != -1) {
            drawable3 = appCompatDrawableManager.getDrawable(context, resourceId4);
        } else {
            drawable3 = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        if (resourceId5 != -1) {
            drawable4 = appCompatDrawableManager.getDrawable(context, resourceId5);
        } else {
            drawable4 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        if (resourceId6 != -1) {
            drawable5 = appCompatDrawableManager.getDrawable(context, resourceId6);
        } else {
            drawable5 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        if (resourceId7 != -1) {
            drawable6 = appCompatDrawableManager.getDrawable(context, resourceId7);
        } else {
            drawable6 = null;
        }
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
        if (obtainStyledAttributes4.hasValue(R.styleable.AppCompatTextView_drawableTint)) {
            TextViewCompat.setCompoundDrawableTintList(this.mView, obtainStyledAttributes4.getColorStateList(R.styleable.AppCompatTextView_drawableTint));
        }
        if (obtainStyledAttributes4.hasValue(R.styleable.AppCompatTextView_drawableTintMode)) {
            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes4.getInt(R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (obtainStyledAttributes4.hasValue(R.styleable.AppCompatTextView_lineHeight)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(R.styleable.AppCompatTextView_lineHeight);
            if (peekValue != null && peekValue.type == 5) {
                i11 = TypedValueCompat.getUnitFromComplexDimension(peekValue.data);
                f8 = TypedValue.complexToFloat(peekValue.data);
            } else {
                f8 = obtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_lineHeight, -1);
                i11 = -1;
            }
        } else {
            i11 = -1;
            f8 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize2);
        }
        if (f8 != -1.0f) {
            TextView textView4 = this.mView;
            if (i11 == -1) {
                TextViewCompat.setLineHeight(textView4, (int) f8);
            } else {
                TextViewCompat.setLineHeight(textView4, i11, f8);
            }
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                final int i10 = this.mStyle;
                if (isAttachedToWindow) {
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i10);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, i10);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            autoSizeText();
        }
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i10) {
        String string;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i10, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(R.styleable.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(R.styleable.TextAppearance_fontVariationSettings)) != null) {
            Api26Impl.setFontVariationSettings(this.mView, string);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    public void setAllCaps(boolean z9) {
        this.mView.setAllCaps(z9);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i10);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        boolean z9;
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        tintInfo.mHasTintList = z9;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        boolean z9;
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        if (mode != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        tintInfo.mHasTintMode = z9;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i10, float f8) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled()) {
            setTextSizeInternal(i10, f8);
        }
    }
}
