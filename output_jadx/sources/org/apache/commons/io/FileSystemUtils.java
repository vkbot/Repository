package org.apache.commons.io;

import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes2.dex */
public class FileSystemUtils {
    @Deprecated
    public FileSystemUtils() {
    }

    @Deprecated
    public static long freeSpace(String str) {
        return getFreeSpace(str);
    }

    @Deprecated
    public static long freeSpaceKb(long j10) {
        return freeSpaceKb(FileUtils.current().getAbsolutePath(), j10);
    }

    public static long getFreeSpace(String str) {
        Path path;
        boolean exists;
        String path2;
        Path absolutePath;
        FileStore fileStore;
        long usableSpace;
        Objects.requireNonNull(str, "pathStr");
        path = Paths.get(str, new String[0]);
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            absolutePath = path.toAbsolutePath();
            fileStore = Files.getFileStore(absolutePath);
            usableSpace = fileStore.getUsableSpace();
            return usableSpace;
        }
        path2 = path.toString();
        j1.i.k(path2);
        return 0L;
    }

    @Deprecated
    public static long freeSpaceKb() {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str) {
        return freeSpaceKb(str, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j10) {
        return getFreeSpace(str) / 1024;
    }
}
