package org.apache.commons.net.ftp;

import java.time.Duration;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class DurationUtils {
    public static boolean isPositive(Duration duration) {
        boolean isNegative;
        boolean isZero;
        if (duration != null) {
            isNegative = duration.isNegative();
            if (!isNegative) {
                isZero = duration.isZero();
                if (!isZero) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static int toMillisInt(Duration duration) {
        long millis;
        long max;
        millis = duration.toMillis();
        if (millis > 0) {
            max = Math.min(millis, 2147483647L);
        } else {
            max = Math.max(millis, -2147483648L);
        }
        return (int) max;
    }

    public static Duration zeroIfNull(Duration duration) {
        Duration duration2;
        if (duration == null) {
            duration2 = Duration.ZERO;
            return duration2;
        }
        return duration;
    }
}
