package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.net.nntp.NNTPReply;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final String TAG = "TypefaceCompatBaseImpl";
    private ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface StyleExtractor<T> {
        int getWeight(T t);

        boolean isItalic(T t);
    }

    private void addFontFamily(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey != 0) {
            this.mFontFamilies.put(Long.valueOf(uniqueKey), fontFamilyFilesResourceEntry);
        }
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i10) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i10, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    private static <T> T findBestFont(T[] tArr, int i10, boolean z9, StyleExtractor<T> styleExtractor) {
        int i11;
        T t = null;
        int i12 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int abs = Math.abs(styleExtractor.getWeight(t3) - i10) * 2;
            if (styleExtractor.isItalic(t3) == z9) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (t == null || i12 > i13) {
                t = t3;
                i12 = i13;
            }
        }
        return t;
    }

    private static long getUniqueKey(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e6) {
            Log.e(TAG, "Could not retrieve font from family.", e6);
            return 0L;
        }
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10) {
        FontResourcesParserCompat.FontFileResourceEntry findBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i10);
        if (findBestEntry == null) {
            return null;
        }
        Typeface createFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, findBestEntry.getResourceId(), findBestEntry.getFileName(), 0, i10);
        addFontFamily(createFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return createFromResourcesFontFile;
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(findBestInfo(fontInfoArr, i10).getUri());
            try {
                Typeface createFromInputStream = createFromInputStream(context, inputStream);
                TypefaceCompatUtil.closeQuietly(inputStream);
                return createFromInputStream;
            } catch (IOException unused) {
                TypefaceCompatUtil.closeQuietly(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                TypefaceCompatUtil.closeQuietly(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @NonNull
    public Typeface createWeightStyle(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z9) {
        Typeface typeface2;
        try {
            typeface2 = WeightTypefaceApi14.createWeightStyle(this, context, typeface, i10, z9);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 != null) {
            return typeface2;
        }
        return typeface;
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        return (FontsContractCompat.FontInfo) findBestFont(fontInfoArr, i10, new StyleExtractor<FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.isItalic();
            }
        });
    }

    @Nullable
    public FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(Typeface typeface) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey == 0) {
            return null;
        }
        return this.mFontFamilies.get(Long.valueOf(uniqueKey));
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i10, boolean z9) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i10, z9, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.3
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10, boolean z9) {
        FontResourcesParserCompat.FontFileResourceEntry findBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i10, z9);
        if (findBestEntry == null) {
            return null;
        }
        Typeface createFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, findBestEntry.getResourceId(), findBestEntry.getFileName(), 0, 0);
        addFontFamily(createFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return createFromResourcesFontFile;
    }

    private static <T> T findBestFont(T[] tArr, int i10, StyleExtractor<T> styleExtractor) {
        return (T) findBestFont(tArr, (i10 & 1) == 0 ? NNTPReply.SERVICE_DISCONTINUED : TypedValues.TransitionType.TYPE_DURATION, (i10 & 2) != 0, styleExtractor);
    }
}
