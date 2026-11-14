package q;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5152a = new c5.e(13);

    public static e a(k.b bVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z9 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = z.f5164b;
                lock.lock();
                Bitmap j10 = bVar.j(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(j10);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = j10;
                    z9 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z9 = true;
        } else {
            bitmap = null;
        }
        if (!z9) {
            bVar = f5152a;
        }
        return e.c(bitmap, bVar);
    }
}
