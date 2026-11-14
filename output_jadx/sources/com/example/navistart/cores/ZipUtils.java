package com.example.navistart.cores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ZipUtils {
    public static void unzip(File file, File file2) {
        byte[] bArr = new byte[4096];
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                File file3 = new File(file2, nextEntry.getName());
                if (nextEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    file3.getParentFile().mkdirs();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileOutputStream.close();
                }
                zipInputStream.closeEntry();
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
