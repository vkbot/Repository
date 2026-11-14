package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PathUtils {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static float[] approximate(Path path, float f8) {
            return path.approximate(f8);
        }
    }

    private PathUtils() {
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f8) {
        float[] approximate = Api26Impl.approximate(path, f8);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f10 = approximate[i11];
            float f11 = approximate[i11 + 1];
            float f12 = approximate[i11 + 2];
            float f13 = approximate[i12];
            float f14 = approximate[i12 + 1];
            float f15 = approximate[i12 + 2];
            if (f10 != f13 && (f11 != f14 || f12 != f15)) {
                arrayList.add(new PathSegment(new PointF(f14, f15), f13, new PointF(f11, f12), f10));
            }
        }
        return arrayList;
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }
}
