package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class k {
    @Nullable
    @DoNotInline
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    @DoNotInline
    public static void b(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setMediaUri(uri);
    }
}
