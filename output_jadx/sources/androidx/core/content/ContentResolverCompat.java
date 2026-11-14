package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
    }

    @Nullable
    @Deprecated
    public static Cursor query(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        android.os.CancellationSignal cancellationSignal2;
        if (cancellationSignal != null) {
            cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
        } else {
            cancellationSignal2 = null;
        }
        return query(contentResolver, uri, strArr, str, strArr2, str2, cancellationSignal2);
    }

    @Nullable
    public static Cursor query(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable android.os.CancellationSignal cancellationSignal) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e;
        }
    }
}
