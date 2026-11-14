package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import j1.i;
import java.util.Locale;
import kotlin.ULong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z9, @NonNull Object obj) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static float checkArgumentFinite(float f8, @NonNull String str) {
        if (!Float.isNaN(f8)) {
            if (!Float.isInfinite(f8)) {
                return f8;
            }
            i.k(ai.onnxruntime.a.C(str, " must not be infinite"));
            return 0.0f;
        }
        i.k(ai.onnxruntime.a.C(str, " must not be NaN"));
        return 0.0f;
    }

    public static int checkArgumentInRange(int i10, int i11, int i12, @NonNull String str) {
        if (i10 >= i11) {
            if (i10 <= i12) {
                return i10;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too low)");
    }

    @IntRange(from = ULong.MIN_VALUE)
    public static int checkArgumentNonnegative(int i10, @Nullable String str) {
        if (i10 >= 0) {
            return i10;
        }
        i.k(str);
        return 0;
    }

    public static int checkFlagsArgument(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        androidx.navigation.b.w("Requested flags 0x", Integer.toHexString(i10), ", but only 0x", Integer.toHexString(i11), " are allowed");
        return 0;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z9, @Nullable String str) {
        if (z9) {
            return;
        }
        i.l(str);
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t, @NonNull Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkState(boolean z9) {
        checkState(z9, null);
    }

    @IntRange(from = ULong.MIN_VALUE)
    public static int checkArgumentNonnegative(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        l9.i.a();
        return 0;
    }

    public static void checkArgument(boolean z9) {
        if (z9) {
            return;
        }
        l9.i.a();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    public static void checkArgument(boolean z9, @NonNull String str, @NonNull Object... objArr) {
        if (!z9) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        l9.i.a();
        return null;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }

    public static long checkArgumentInRange(long j10, long j11, long j12, @NonNull String str) {
        if (j10 < j11) {
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is out of range of [");
            sb.append(j11);
            sb.append(", ");
            i.k(ai.onnxruntime.a.n(sb, j12, "] (too low)"));
            return 0L;
        }
        if (j10 <= j12) {
            return j10;
        }
        Locale locale2 = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" is out of range of [");
        sb2.append(j11);
        sb2.append(", ");
        i.k(ai.onnxruntime.a.n(sb2, j12, "] (too high)"));
        return 0L;
    }

    public static float checkArgumentInRange(float f8, float f10, float f11, @NonNull String str) {
        if (f8 < f10) {
            i.k(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f10), Float.valueOf(f11)));
            return 0.0f;
        }
        if (f8 <= f11) {
            return f8;
        }
        i.k(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f10), Float.valueOf(f11)));
        return 0.0f;
    }

    public static double checkArgumentInRange(double d, double d10, double d11, @NonNull String str) {
        if (d < d10) {
            i.k(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d10), Double.valueOf(d11)));
            return 0.0d;
        }
        if (d <= d11) {
            return d;
        }
        i.k(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d10), Double.valueOf(d11)));
        return 0.0d;
    }
}
