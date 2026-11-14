package i;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {
    public static final String[] c = {"_data"};
    public static final String[] d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2741a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f2742b;

    public /* synthetic */ a(ContentResolver contentResolver, int i10) {
        this.f2741a = i10;
        this.f2742b = contentResolver;
    }

    public final Cursor a(Uri uri) {
        switch (this.f2741a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f2742b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f2742b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
