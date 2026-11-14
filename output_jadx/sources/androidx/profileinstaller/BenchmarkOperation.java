package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class BenchmarkOperation {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(api = 21)
    /* loaded from: classes.dex */
    public static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        public static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(api = 24)
    /* loaded from: classes.dex */
    public static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        public static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    private BenchmarkOperation() {
    }

    public static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z9 = true;
            for (File file2 : listFiles) {
                if (deleteFilesRecursively(file2) && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            return z9;
        }
        file.delete();
        return true;
    }

    public static void dropShaderCache(@NonNull Context context, @NonNull ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        File codeCacheDir;
        if (Build.VERSION.SDK_INT >= 34) {
            codeCacheDir = Api24ContextHelper.createDeviceProtectedStorageContext(context).getCacheDir();
        } else {
            codeCacheDir = Api21ContextHelper.getCodeCacheDir(Api24ContextHelper.createDeviceProtectedStorageContext(context));
        }
        if (deleteFilesRecursively(codeCacheDir)) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }
}
