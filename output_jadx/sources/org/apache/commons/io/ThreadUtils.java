package org.apache.commons.io;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import kotlin.time.DurationKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class ThreadUtils {
    @Deprecated
    public ThreadUtils() {
    }

    private static int getNanosOfMilli(Duration duration) {
        int nano;
        nano = duration.getNano();
        return nano % DurationKt.NANOS_IN_MILLIS;
    }

    public static void sleep(Duration duration) {
        Instant now;
        Instant plus;
        long millis;
        Instant now2;
        boolean isNegative;
        long nanos;
        long millis2;
        Duration ofNanos;
        try {
            long nanoTime = System.nanoTime();
            nanos = duration.toNanos();
            long j10 = nanoTime + nanos;
            Duration duration2 = duration;
            while (true) {
                millis2 = duration2.toMillis();
                Thread.sleep(millis2, getNanosOfMilli(duration2));
                long nanoTime2 = System.nanoTime();
                ofNanos = Duration.ofNanos(j10 - nanoTime2);
                if (nanoTime2 - j10 < 0) {
                    duration2 = ofNanos;
                } else {
                    return;
                }
            }
        } catch (ArithmeticException unused) {
            now = Instant.now();
            plus = now.plus((TemporalAmount) duration);
            do {
                millis = duration.toMillis();
                Thread.sleep(millis, getNanosOfMilli(duration));
                now2 = Instant.now();
                duration = Duration.between(now2, plus);
                isNegative = duration.isNegative();
            } while (!isNegative);
        }
    }
}
