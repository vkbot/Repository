package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.net.nntp.NNTPReply;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FontProvider {
    private static final Comparator<byte[]> sByteArrayComparator = new Object();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface ContentQueryWrapper {
        static ContentQueryWrapper make(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }

        void close();

        Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        public ContentQueryWrapperApi16Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    private FontProvider() {
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    @NonNull
    public static FontsContractCompat.FontFamilyResult getFontFamilyResult(@NonNull Context context, @NonNull FontRequest fontRequest, @Nullable CancellationSignal cancellationSignal) {
        ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        if (provider == null) {
            return FontsContractCompat.FontFamilyResult.create(1, null);
        }
        return FontsContractCompat.FontFamilyResult.create(0, query(context, fontRequest, provider.authority, cancellationSignal));
    }

    @Nullable
    @VisibleForTesting
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
                List<byte[]> convertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(convertToByteArrayList, sByteArrayComparator);
                List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
                for (int i10 = 0; i10 < certificates.size(); i10++) {
                    ArrayList arrayList = new ArrayList(certificates.get(i10));
                    Collections.sort(arrayList, sByteArrayComparator);
                    if (equalsByteArrayList(convertToByteArrayList, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            StringBuilder x9 = ai.onnxruntime.a.x("Found content provider ", providerAuthority, ", but package was not ");
            x9.append(fontRequest.getProviderPackage());
            throw new PackageManager.NameNotFoundException(x9.toString());
        }
        throw new PackageManager.NameNotFoundException(ai.onnxruntime.a.l("No package found for authority: ", providerAuthority));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    @NonNull
    @VisibleForTesting
    public static FontsContractCompat.FontInfo[] query(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        ContentQueryWrapper contentQueryWrapper;
        ContentQueryWrapper contentQueryWrapper2;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        ContentQueryWrapper make = ContentQueryWrapper.make(context, build);
        Cursor cursor = null;
        try {
            cursor = make.query(build, new String[]{"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                int columnIndex4 = cursor.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                int columnIndex5 = cursor.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                int columnIndex6 = cursor.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = cursor.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = cursor.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        contentQueryWrapper = make;
                        try {
                            withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            contentQueryWrapper.close();
                            throw th;
                        }
                    } else {
                        contentQueryWrapper = make;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i12 = cursor.getInt(columnIndex5);
                    } else {
                        i12 = NNTPReply.SERVICE_DISCONTINUED;
                    }
                    if (columnIndex6 != -1) {
                        z9 = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            arrayList2.add(FontsContractCompat.FontInfo.create(withAppendedId, i11, i12, z9, i10));
                            make = contentQueryWrapper;
                        }
                    }
                    z9 = false;
                    arrayList2.add(FontsContractCompat.FontInfo.create(withAppendedId, i11, i12, z9, i10));
                    make = contentQueryWrapper;
                }
                contentQueryWrapper2 = make;
                arrayList = arrayList2;
            } else {
                contentQueryWrapper2 = make;
            }
            if (cursor != null) {
                cursor.close();
            }
            contentQueryWrapper2.close();
            return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
        } catch (Throwable th2) {
            th = th2;
            contentQueryWrapper = make;
        }
    }
}
