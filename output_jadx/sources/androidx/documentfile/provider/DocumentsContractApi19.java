package androidx.documentfile.provider;

import ai.onnxruntime.a;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class DocumentsContractApi19 {
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri))) {
            return true;
        }
        return false;
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(rawType) && (queryForInt & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(rawType) || (queryForInt & 2) == 0) {
            return false;
        }
        return true;
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                a.A(autoCloseable);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean exists(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z9 = false;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursor.getCount() > 0) {
                    z9 = true;
                }
                closeQuietly(cursor);
                return z9;
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                return false;
            }
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if (!"vnd.android.document/directory".equals(rawType) && !TextUtils.isEmpty(rawType)) {
            return true;
        }
        return false;
    }

    public static boolean isVirtual(Context context, Uri uri) {
        if (!DocumentsContract.isDocumentUri(context, uri) || (getFlags(context, uri) & 512) == 0) {
            return false;
        }
        return true;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    private static int queryForInt(Context context, Uri uri, String str, int i10) {
        return (int) queryForLong(context, uri, str, i10);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j11 = cursor.getLong(0);
                    closeQuietly(cursor);
                    return j11;
                }
                closeQuietly(cursor);
                return j10;
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                return j10;
            }
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    private static String queryForString(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    String string = cursor.getString(0);
                    closeQuietly(cursor);
                    return string;
                }
                closeQuietly(cursor);
                return str2;
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                return str2;
            }
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }
}
