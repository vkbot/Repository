package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.j;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import j1.i;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.ULong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {
    private static final char LINE_FEED = '\n';

    @NonNull
    @GuardedBy("sLock")
    private static Executor sExecutor;
    private static final Object sLock = new Object();

    @NonNull
    private final int[] mParagraphEnds;

    @NonNull
    private final Params mParams;

    @NonNull
    private final Spannable mText;

    @Nullable
    private final PrecomputedText mWrapped;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static Spannable castToSpannable(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            private Params mParams;
            private CharSequence mText;

            public PrecomputedTextCallback(@NonNull Params params, @NonNull CharSequence charSequence) {
                this.mParams = params;
                this.mText = charSequence;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PrecomputedTextCompat call() {
                return PrecomputedTextCompat.create(this.mText, this.mParams);
            }
        }

        public PrecomputedTextFutureTask(@NonNull Params params, @NonNull CharSequence charSequence) {
            super(new PrecomputedTextCallback(params, charSequence));
        }
    }

    @RequiresApi(28)
    private PrecomputedTextCompat(@NonNull PrecomputedText precomputedText, @NonNull Params params) {
        this.mText = Api28Impl.castToSpannable(precomputedText);
        this.mParams = params;
        this.mParagraphEnds = null;
        this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence, @NonNull Params params) {
        PrecomputedText.Params params2;
        PrecomputedText create;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.mWrapped) != null) {
                create = PrecomputedText.create(charSequence, params2);
                return new PrecomputedTextCompat(create, params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int indexOf = TextUtils.indexOf(charSequence, LINE_FEED, i10, length);
                if (indexOf < 0) {
                    i10 = length;
                } else {
                    i10 = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(params.getBreakStrategy()).setHyphenationFrequency(params.getHyphenationFrequency()).setTextDirection(params.getTextDirection()).build();
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            Trace.endSection();
        }
    }

    @UiThread
    public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        PrecomputedTextFutureTask precomputedTextFutureTask = new PrecomputedTextFutureTask(params, charSequence);
        if (executor == null) {
            synchronized (sLock) {
                try {
                    if (sExecutor == null) {
                        sExecutor = Executors.newFixedThreadPool(1);
                    }
                    executor = sExecutor;
                } finally {
                }
            }
        }
        executor.execute(precomputedTextFutureTask);
        return precomputedTextFutureTask;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.mText.charAt(i10);
    }

    @IntRange(from = ULong.MIN_VALUE)
    public int getParagraphCount() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphCount = this.mWrapped.getParagraphCount();
            return paragraphCount;
        }
        return this.mParagraphEnds.length;
    }

    @IntRange(from = ULong.MIN_VALUE)
    public int getParagraphEnd(@IntRange(from = 0) int i10) {
        int paragraphEnd;
        Preconditions.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphEnd = this.mWrapped.getParagraphEnd(i10);
            return paragraphEnd;
        }
        return this.mParagraphEnds[i10];
    }

    @IntRange(from = ULong.MIN_VALUE)
    public int getParagraphStart(@IntRange(from = 0) int i10) {
        int paragraphStart;
        Preconditions.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.mWrapped.getParagraphStart(i10);
            return paragraphStart;
        }
        if (i10 == 0) {
            return 0;
        }
        return this.mParagraphEnds[i10 - 1];
    }

    @NonNull
    public Params getParams() {
        return this.mParams;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        if (j.y(this.mText)) {
            return j.p(this.mText);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.mText.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.mText.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.mText.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.mWrapped.getSpans(i10, i11, cls);
            return (T[]) spans;
        }
        return (T[]) this.mText.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mText.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.mText.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.mWrapped.removeSpan(obj);
                return;
            } else {
                this.mText.removeSpan(obj);
                return;
            }
        }
        i.k("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.mWrapped.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.mText.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        i.k("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.mText.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.mText.toString();
    }

    private PrecomputedTextCompat(@NonNull CharSequence charSequence, @NonNull Params params, @NonNull int[] iArr) {
        this.mText = new SpannableString(charSequence);
        this.mParams = params;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;

        @NonNull
        private final TextPaint mPaint;

        @Nullable
        private final TextDirectionHeuristic mTextDir;
        final PrecomputedText.Params mWrapped;

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public static class Builder {

            @NonNull
            private final TextPaint mPaint;
            private int mBreakStrategy = 1;
            private int mHyphenationFrequency = 1;
            private TextDirectionHeuristic mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public Builder(@NonNull TextPaint textPaint) {
                this.mPaint = textPaint;
            }

            @NonNull
            public Params build() {
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int i10) {
                this.mBreakStrategy = i10;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int i10) {
                this.mHyphenationFrequency = i10;
                return this;
            }

            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.mTextDir = textDirectionHeuristic;
                return this;
            }
        }

        public Params(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = j.m(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.mWrapped = build;
            } else {
                this.mWrapped = null;
            }
            this.mPaint = textPaint;
            this.mTextDir = textDirectionHeuristic;
            this.mBreakStrategy = i10;
            this.mHyphenationFrequency = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (equalsWithoutTextDirection(params) && this.mTextDir == params.getTextDirection()) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params params) {
            if (this.mBreakStrategy != params.getBreakStrategy() || this.mHyphenationFrequency != params.getHyphenationFrequency() || this.mPaint.getTextSize() != params.getTextPaint().getTextSize() || this.mPaint.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.mPaint.getTextSkewX() != params.getTextPaint().getTextSkewX() || this.mPaint.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !TextUtils.equals(this.mPaint.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) || this.mPaint.getFlags() != params.getTextPaint().getFlags() || !this.mPaint.getTextLocales().equals(params.getTextPaint().getTextLocales())) {
                return false;
            }
            if (this.mPaint.getTypeface() == null) {
                if (params.getTextPaint().getTypeface() != null) {
                    return false;
                }
                return true;
            }
            if (!this.mPaint.getTypeface().equals(params.getTextPaint().getTypeface())) {
                return false;
            }
            return true;
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        @Nullable
        public TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.mPaint;
        }

        public int hashCode() {
            return ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocales(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.mPaint.getTextSize());
            sb.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb.append(", textSkewX=" + this.mPaint.getTextSkewX());
            sb.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            sb.append(", textLocale=" + this.mPaint.getTextLocales());
            sb.append(", typeface=" + this.mPaint.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb2 = new StringBuilder(", variationSettings=");
                fontVariationSettings = this.mPaint.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.mTextDir);
            sb.append(", breakStrategy=" + this.mBreakStrategy);
            sb.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.mPaint = textPaint;
            textDirection = params.getTextDirection();
            this.mTextDir = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.mBreakStrategy = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.mHyphenationFrequency = hyphenationFrequency;
            this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
