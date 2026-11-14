package c0;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f445a;

    static {
        Bitmap.Config config;
        int[] iArr = new int[Bitmap.Config.values().length];
        f445a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f445a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f445a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            int[] iArr2 = f445a;
            config = Bitmap.Config.RGBA_F16;
            iArr2[config.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f445a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
