package androidx.core.os;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(@Nullable String str) {
        super(ObjectsCompat.toString(str, "The operation has been canceled."));
    }

    public OperationCanceledException() {
        this(null);
    }
}
