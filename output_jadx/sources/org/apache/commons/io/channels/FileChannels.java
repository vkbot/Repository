package org.apache.commons.io.channels;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.Objects;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FileChannels {
    private FileChannels() {
    }

    public static boolean contentEquals(ReadableByteChannel readableByteChannel, ReadableByteChannel readableByteChannel2, int i10) {
        if (Objects.equals(readableByteChannel, readableByteChannel2)) {
            return true;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i10);
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!z9) {
                i11 = readToLimit(readableByteChannel, allocateDirect);
                allocateDirect.clear();
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                i12 = readToLimit(readableByteChannel2, allocateDirect2);
                allocateDirect2.clear();
                if (i12 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (i11 == -1 && i12 == -1) {
                return allocateDirect.equals(allocateDirect2);
            }
            if (i11 != 0 && i12 != 0) {
                if (i11 != i12 || !allocateDirect.equals(allocateDirect2)) {
                    return false;
                }
            } else {
                Thread.yield();
            }
        }
    }

    private static int readToLimit(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasRemaining()) {
            int i10 = 0;
            while (byteBuffer.hasRemaining() && (read = readableByteChannel.read(byteBuffer)) != -1) {
                if (read == 0) {
                    Thread.yield();
                } else {
                    i10 += read;
                }
            }
            if (i10 == 0) {
                return -1;
            }
            return i10;
        }
        i.a();
        return 0;
    }

    private static long size(SeekableByteChannel seekableByteChannel) {
        if (seekableByteChannel != null) {
            return seekableByteChannel.size();
        }
        return 0L;
    }

    @Deprecated
    public static boolean contentEquals(FileChannel fileChannel, FileChannel fileChannel2, int i10) {
        return contentEquals((SeekableByteChannel) fileChannel, (SeekableByteChannel) fileChannel2, i10);
    }

    public static boolean contentEquals(SeekableByteChannel seekableByteChannel, SeekableByteChannel seekableByteChannel2, int i10) {
        if (Objects.equals(seekableByteChannel, seekableByteChannel2)) {
            return true;
        }
        long size = size(seekableByteChannel);
        long size2 = size(seekableByteChannel2);
        if (size != size2) {
            return false;
        }
        return (size == 0 && size2 == 0) || contentEquals((ReadableByteChannel) seekableByteChannel, (ReadableByteChannel) seekableByteChannel2, i10);
    }
}
