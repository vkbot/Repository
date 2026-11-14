package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void close(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        @DoNotInline
        public static FileDescriptor dup(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        @DoNotInline
        public static long lseek(FileDescriptor fileDescriptor, long j10, int i10) {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    private ExifInterfaceUtils() {
    }

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb.toString();
    }

    public static void closeFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Api21Impl.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e(TAG, "Error closing fd.");
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] convertToLongArray(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int min = Math.min(i10, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i10 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                b.A("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            }
        }
    }

    public static long parseSubSeconds(String str) {
        try {
            int min = Math.min(str.length(), 3);
            long parseLong = Long.parseLong(str.substring(0, min));
            while (min < 3) {
                parseLong *= 10;
                min++;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i10;
            }
            i10 += read;
            outputStream.write(bArr, 0, read);
        }
    }
}
