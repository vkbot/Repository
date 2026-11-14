package org.vosk.android;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.vosk.Model;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class StorageService {
    protected static final String TAG = "StorageService";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface Callback<R> {
        void onComplete(R r);
    }

    private static void copyAssets(AssetManager assetManager, String str, File file) {
        String[] list = assetManager.list(str);
        if (list != null) {
            if (list.length == 0) {
                if (!str.endsWith("uuid")) {
                    copyFile(assetManager, str, file);
                    return;
                }
                return;
            }
            File file2 = new File(file, str);
            if (!file2.exists()) {
                String str2 = TAG;
                Log.v(str2, "Making directory " + file2.getAbsolutePath());
                if (!file2.mkdirs()) {
                    Log.v(str2, "Failed to create directory " + file2.getAbsolutePath());
                }
            }
            for (String str3 : list) {
                copyAssets(assetManager, ai.onnxruntime.a.D(str, "/", str3), file);
            }
        }
    }

    private static void copyFile(AssetManager assetManager, String str, File file) {
        Log.v(TAG, "Copy " + str + " to " + file);
        InputStream open = assetManager.open(str);
        FileOutputStream fileOutputStream = new FileOutputStream(file + "/" + str);
        byte[] bArr = new byte[4000];
        while (true) {
            int read = open.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    private static boolean deleteContents(File file) {
        File[] listFiles = file.listFiles();
        boolean z9 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z9 &= deleteContents(file2);
                }
                if (!file2.delete()) {
                    z9 = false;
                }
            }
        }
        return z9;
    }

    public static /* synthetic */ void lambda$unpack$2(Context context, String str, String str2, Handler handler, Callback callback, Callback callback2) {
        try {
            handler.post(new a(2, callback, new Model(sync(context, str, str2))));
        } catch (IOException e) {
            handler.post(new a(3, callback2, e));
        }
    }

    private static String readLine(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream)).readLine();
    }

    public static String sync(Context context, String str, String str2) {
        AssetManager assets = context.getAssets();
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir, str2);
            String absolutePath = new File(file, str).getAbsolutePath();
            try {
                if (readLine(new FileInputStream(new File(file, str + "/uuid"))).equals(readLine(assets.open(str + "/uuid")))) {
                    return absolutePath;
                }
            } catch (FileNotFoundException unused) {
            }
            deleteContents(file);
            copyAssets(assets, str, file);
            copyFile(assets, ai.onnxruntime.a.C(str, "/uuid"), file);
            return absolutePath;
        }
        ai.onnxruntime.b.w(Environment.getExternalStorageState(), "cannot get external files dir, external storage state is ");
        return null;
    }

    public static void unpack(final Context context, final String str, final String str2, final Callback<Model> callback, final Callback<IOException> callback2) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() { // from class: org.vosk.android.e
            @Override // java.lang.Runnable
            public final void run() {
                StorageService.lambda$unpack$2(context, str, str2, handler, callback, callback2);
            }
        });
    }
}
