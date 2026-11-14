package org.apache.commons.io;

import java.io.RandomAccessFile;
import java.nio.channels.SeekableByteChannel;
import java.util.Objects;
import org.apache.commons.io.channels.FileChannels;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class RandomAccessFiles {
    @Deprecated
    public RandomAccessFiles() {
    }

    public static boolean contentEquals(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        if (Objects.equals(randomAccessFile, randomAccessFile2)) {
            return true;
        }
        long length = length(randomAccessFile);
        long length2 = length(randomAccessFile2);
        if (length != length2) {
            return false;
        }
        if (length == 0 && length2 == 0) {
            return true;
        }
        return FileChannels.contentEquals((SeekableByteChannel) randomAccessFile.getChannel(), (SeekableByteChannel) randomAccessFile2.getChannel(), 8192);
    }

    private static long length(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            return randomAccessFile.length();
        }
        return 0L;
    }

    public static byte[] read(RandomAccessFile randomAccessFile, long j10, int i10) {
        randomAccessFile.seek(j10);
        return IOUtils.toByteArray(new r(2, randomAccessFile), i10);
    }

    public static RandomAccessFile reset(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0L);
        return randomAccessFile;
    }
}
