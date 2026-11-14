package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class UnprecomputeTextOnModificationSpannable implements Spannable {

    @NonNull
    private Spannable mDelegate;
    private boolean mSafeToWrite = false;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
        }

        public static IntStream chars(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream codePoints(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class PrecomputedTextDetector {
        public boolean isPrecomputedText(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        public boolean isPrecomputedText(CharSequence charSequence) {
            if (!androidx.core.view.accessibility.a.s(charSequence) && !(charSequence instanceof PrecomputedTextCompat)) {
                return false;
            }
            return true;
        }
    }

    public UnprecomputeTextOnModificationSpannable(@NonNull Spanned spanned) {
        this.mDelegate = new SpannableString(spanned);
    }

    private void ensureSafeWrites() {
        Spannable spannable = this.mDelegate;
        if (!this.mSafeToWrite && precomputedTextDetector().isPrecomputedText(spannable)) {
            this.mDelegate = new SpannableString(spannable);
        }
        this.mSafeToWrite = true;
    }

    public static PrecomputedTextDetector precomputedTextDetector() {
        if (Build.VERSION.SDK_INT < 28) {
            return new PrecomputedTextDetector();
        }
        return new PrecomputedTextDetector_28();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.mDelegate.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public IntStream chars() {
        return CharSequenceHelper_API24.chars(this.mDelegate);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public IntStream codePoints() {
        return CharSequenceHelper_API24.codePoints(this.mDelegate);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.mDelegate.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.mDelegate.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.mDelegate.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.mDelegate.getSpans(i10, i11, cls);
    }

    public Spannable getUnwrappedSpannable() {
        return this.mDelegate;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mDelegate.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.mDelegate.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        ensureSafeWrites();
        this.mDelegate.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        ensureSafeWrites();
        this.mDelegate.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i10, int i11) {
        return this.mDelegate.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.mDelegate.toString();
    }

    public UnprecomputeTextOnModificationSpannable(@NonNull Spannable spannable) {
        this.mDelegate = spannable;
    }

    public UnprecomputeTextOnModificationSpannable(@NonNull CharSequence charSequence) {
        this.mDelegate = new SpannableString(charSequence);
    }
}
