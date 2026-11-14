package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class StartupException extends RuntimeException {
    public StartupException(@NonNull String str) {
        super(str);
    }

    public StartupException(@NonNull Throwable th) {
        super(th);
    }

    public StartupException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
    }
}
