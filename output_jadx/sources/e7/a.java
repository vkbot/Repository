package e7;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(Context context, File file) {
        HashSet hashSet = new HashSet();
        if (context.getApplicationInfo().sourceDir != null) {
            hashSet.add(context.getApplicationInfo().sourceDir);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            hashSet.addAll(Arrays.asList(context.getApplicationInfo().splitSourceDirs));
        }
        for (String str : Build.SUPPORTED_ABIS) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ZipFile zipFile = new ZipFile(new File((String) it.next()), 1);
                try {
                    String mapLibraryName = System.mapLibraryName("wg-go");
                    StringBuilder sb = new StringBuilder();
                    sb.append("lib");
                    char c = File.separatorChar;
                    sb.append(c);
                    sb.append(str);
                    sb.append(c);
                    sb.append(mapLibraryName);
                    String sb2 = sb.toString();
                    ZipEntry entry = zipFile.getEntry(sb2);
                    if (entry == null) {
                        zipFile.close();
                    } else {
                        Log.d("WireGuard/SharedLibraryLoader", "Extracting apk:/" + sb2 + " to " + file.getAbsolutePath());
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            try {
                                byte[] bArr = new byte[32768];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read != -1) {
                                        fileOutputStream.write(bArr, 0, read);
                                    } else {
                                        fileOutputStream.getFD().sync();
                                        inputStream.close();
                                        fileOutputStream.close();
                                        zipFile.close();
                                        return true;
                                    }
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        zipFile.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        return false;
    }
}
