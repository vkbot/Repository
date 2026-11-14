package c0;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f446a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f447b = new char[64];
    public static volatile Handler c;

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        j1.i.k("You must call this method on the main thread");
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = o.f445a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                if (i10 != 4) {
                    return 4;
                }
                return 8;
            }
        }
        return i11;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (c == null) {
            synchronized (p.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static int g(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int h(int i10, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return g(hashCode, i10);
    }

    public static boolean i(int i10, int i11) {
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (i11 <= 0 && i11 != Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }
}
