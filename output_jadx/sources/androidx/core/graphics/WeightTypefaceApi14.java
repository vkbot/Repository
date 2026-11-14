package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;
import n0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class WeightTypefaceApi14 {
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;

    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            field.setAccessible(true);
        } catch (Exception e) {
            Log.e(TAG, e.getClass().getName(), e);
            field = null;
        }
        sNativeInstance = field;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi14() {
    }

    @Nullable
    public static Typeface createWeightStyle(@NonNull TypefaceCompatBaseImpl typefaceCompatBaseImpl, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z9) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i11 = (i10 << 1) | (z9 ? 1 : 0);
        synchronized (sWeightCacheLock) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
                SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>(4);
                    longSparseArray.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = sparseArray.get(i11);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface bestFontFromFamily = getBestFontFromFamily(typefaceCompatBaseImpl, context, typeface, i10, z9);
                if (bestFontFromFamily == null) {
                    bestFontFromFamily = platformTypefaceCreate(typeface, i10, z9);
                }
                sparseArray.put(i11, bestFontFromFamily);
                return bestFontFromFamily;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static Typeface getBestFontFromFamily(@NonNull TypefaceCompatBaseImpl typefaceCompatBaseImpl, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z9) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i10, z9);
    }

    private static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return ((Number) sNativeInstance.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            b.w(e);
            return 0L;
        }
    }

    private static boolean isPrivateApiAvailable() {
        if (sNativeInstance != null) {
            return true;
        }
        return false;
    }

    private static Typeface platformTypefaceCreate(Typeface typeface, int i10, boolean z9) {
        boolean z10;
        int i11 = 0;
        if (i10 >= 600) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || z9) {
            if (!z10) {
                i11 = 2;
            } else if (!z9) {
                i11 = 1;
            } else {
                i11 = 3;
            }
        }
        return Typeface.create(typeface, i11);
    }
}
