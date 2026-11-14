package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i10, int i11, boolean z9, int i12) {
        if (i10 <= 99 && (!z9 || i12 < 3)) {
            if (i10 <= 9 && (!z9 || i12 < 2)) {
                if (!z9 && i10 <= 0) {
                    return 0;
                }
                return i11 + 1;
            }
            return i11 + 2;
        }
        return i11 + 3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j10, PrintWriter printWriter, int i10) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j10, i10)));
        }
    }

    private static int formatDurationLocked(long j10, int i10) {
        char c;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        boolean z15;
        int i19;
        long j11 = j10;
        if (sFormatStr.length < i10) {
            sFormatStr = new char[i10];
        }
        char[] cArr = sFormatStr;
        if (j11 == 0) {
            int i20 = i10 - 1;
            while (i20 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c = '+';
        } else {
            j11 = -j11;
            c = '-';
        }
        int i21 = (int) (j11 % 1000);
        int floor = (int) Math.floor(j11 / 1000);
        if (floor > SECONDS_PER_DAY) {
            i11 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i11;
        } else {
            i11 = 0;
        }
        if (floor > SECONDS_PER_HOUR) {
            i12 = floor / SECONDS_PER_HOUR;
            floor -= i12 * SECONDS_PER_HOUR;
        } else {
            i12 = 0;
        }
        if (floor > SECONDS_PER_MINUTE) {
            int i22 = floor / SECONDS_PER_MINUTE;
            floor -= i22 * SECONDS_PER_MINUTE;
            i13 = i22;
        } else {
            i13 = 0;
        }
        if (i10 != 0) {
            int accumField = accumField(i11, 1, false, 0);
            if (accumField > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            int accumField2 = accumField + accumField(i12, 1, z13, 2);
            if (accumField2 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            int accumField3 = accumField2 + accumField(i13, 1, z14, 2);
            if (accumField3 > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            int accumField4 = accumField3 + accumField(floor, 1, z15, 2);
            if (accumField4 > 0) {
                i19 = 3;
            } else {
                i19 = 0;
            }
            i14 = 0;
            for (int accumField5 = accumField(i21, 2, true, i19) + 1 + accumField4; accumField5 < i10; accumField5++) {
                cArr[i14] = ' ';
                i14++;
            }
        } else {
            i14 = 0;
        }
        cArr[i14] = c;
        int i23 = i14 + 1;
        if (i10 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int printField = printField(cArr, i11, 'd', i23, false, 0);
        if (printField != i23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9) {
            i15 = 2;
        } else {
            i15 = 0;
        }
        int printField2 = printField(cArr, i12, 'h', printField, z10, i15);
        if (printField2 != i23) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9) {
            i16 = 2;
        } else {
            i16 = 0;
        }
        int printField3 = printField(cArr, i13, 'm', printField2, z11, i16);
        if (printField3 != i23) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z9) {
            i17 = 2;
        } else {
            i17 = 0;
        }
        int printField4 = printField(cArr, floor, 's', printField3, z12, i17);
        if (z9 && printField4 != i23) {
            i18 = 3;
        } else {
            i18 = 0;
        }
        int printField5 = printField(cArr, i21, 'm', printField4, true, i18);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    private static int printField(char[] cArr, int i10, char c, int i11, boolean z9, int i12) {
        int i13;
        if (!z9 && i10 <= 0) {
            return i11;
        }
        if ((z9 && i12 >= 3) || i10 > 99) {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        } else {
            i13 = i11;
        }
        if ((z9 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        cArr[i13 + 1] = c;
        return i13 + 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j10, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j10, 0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j10, PrintWriter printWriter) {
        formatDuration(j10, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j10 - j11, printWriter, 0);
        }
    }
}
