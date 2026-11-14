package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int hash(@Nullable Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int hashCode(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        n0.b.n(str);
        return null;
    }

    @Nullable
    public static String toString(@Nullable Object obj, @Nullable String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t) {
        t.getClass();
        return t;
    }
}
