package androidx.activity;

import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ Person f(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ Person g(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder m(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText p(Object obj) {
        return (PrecomputedText) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
