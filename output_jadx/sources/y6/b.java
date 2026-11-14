package y6;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import j1.i;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.net.ftp.FTPReply;
import p0.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6639a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f6640b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, LocationRequestCompat.QUALITY_LOW_POWER, 130, -1}, new int[]{6, 30, 56, 82, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, WebSocketProtocol.PAYLOAD_SHORT, FTPReply.FILE_STATUS_OK}, new int[]{6, 24, 50, 76, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(c cVar, boolean z9) {
        int i10;
        byte b10;
        int i11 = cVar.f4964b;
        int i12 = cVar.c;
        if (z9) {
            i10 = i12;
        } else {
            i10 = i11;
        }
        if (!z9) {
            i11 = i12;
        }
        byte[][] bArr = (byte[][]) cVar.d;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            byte b11 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                if (z9) {
                    b10 = bArr[i14][i16];
                } else {
                    b10 = bArr[i16][i14];
                }
                if (b10 == b11) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b11 = b10;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x01f7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(f6.a r29, int r30, w6.f r31, int r32, p0.c r33) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.b.b(f6.a, int, w6.f, int, p0.c):void");
    }

    public static int c(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
            int i12 = 32 - numberOfLeadingZeros;
            int i13 = i10 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i13) >= i12) {
                i13 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i13)) - i12);
            }
            return i13;
        }
        i.k("0 polynomial");
        return 0;
    }

    public static void d(int i10, int i11, c cVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (g(cVar.a(i13, i11))) {
                cVar.c(i13, i11, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i10, int i11, c cVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f6640b[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                cVar.c(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void f(int i10, int i11, c cVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (g(cVar.a(i10, i13))) {
                cVar.c(i10, i13, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i10) {
        if (i10 == -1) {
            return true;
        }
        return false;
    }
}
