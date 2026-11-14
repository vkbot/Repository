package org.apache.commons.io.file.attribute;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FileTimes {
    public static final FileTime EPOCH;
    private static final long HUNDRED = 100;
    private static final BigDecimal HUNDRED_BD;
    static final long HUNDRED_NANOS_PER_MILLISECOND;
    static final BigDecimal HUNDRED_NANOS_PER_MILLISECOND_BD;
    private static final long HUNDRED_NANOS_PER_SECOND;
    private static final BigDecimal HUNDRED_NANOS_PER_SECOND_BD;
    static final long UNIX_TO_NTFS_OFFSET = -116444736000000000L;
    private static final BigDecimal UNIX_TO_NTFS_OFFSET_BD;
    private static final BigDecimal LONG_MIN_VALUE_BD = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal LONG_MAX_VALUE_BD = BigDecimal.valueOf(Long.MAX_VALUE);
    private static final MathContext MATH_CONTEXT = new MathContext(0, RoundingMode.FLOOR);

    static {
        FileTime from;
        Instant unused;
        unused = Instant.EPOCH;
        from = FileTime.from(Instant.EPOCH);
        EPOCH = from;
        UNIX_TO_NTFS_OFFSET_BD = BigDecimal.valueOf(UNIX_TO_NTFS_OFFSET);
        HUNDRED_NANOS_PER_SECOND = 10000000L;
        HUNDRED_NANOS_PER_SECOND_BD = BigDecimal.valueOf(10000000L);
        HUNDRED_NANOS_PER_MILLISECOND = 10000L;
        HUNDRED_NANOS_PER_MILLISECOND_BD = BigDecimal.valueOf(10000L);
        HUNDRED_BD = BigDecimal.valueOf(HUNDRED);
    }

    private FileTimes() {
    }

    public static FileTime fromUnixTime(long j10) {
        FileTime from;
        from = FileTime.from(j10, TimeUnit.SECONDS);
        return from;
    }

    public static boolean isUnixTime(long j10) {
        if (-2147483648L <= j10 && j10 <= 2147483647L) {
            return true;
        }
        return false;
    }

    public static FileTime minusMillis(FileTime fileTime, long j10) {
        Instant instant;
        Instant minusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        minusMillis = instant.minusMillis(j10);
        from = FileTime.from(minusMillis);
        return from;
    }

    public static FileTime minusNanos(FileTime fileTime, long j10) {
        Instant instant;
        Instant minusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        minusNanos = instant.minusNanos(j10);
        from = FileTime.from(minusNanos);
        return from;
    }

    public static FileTime minusSeconds(FileTime fileTime, long j10) {
        Instant instant;
        Instant minusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        minusSeconds = instant.minusSeconds(j10);
        from = FileTime.from(minusSeconds);
        return from;
    }

    public static FileTime now() {
        Instant now;
        FileTime from;
        now = Instant.now();
        from = FileTime.from(now);
        return from;
    }

    public static Date ntfsTimeToDate(BigDecimal bigDecimal) {
        long epochMilli;
        epochMilli = ntfsTimeToInstant(bigDecimal).toEpochMilli();
        return new Date(epochMilli);
    }

    public static FileTime ntfsTimeToFileTime(long j10) {
        FileTime from;
        from = FileTime.from(ntfsTimeToInstant(j10));
        return from;
    }

    public static Instant ntfsTimeToInstant(BigDecimal bigDecimal) {
        Instant ofEpochSecond;
        BigDecimal[] divideAndRemainder = bigDecimal.add(UNIX_TO_NTFS_OFFSET_BD).divideAndRemainder(HUNDRED_NANOS_PER_SECOND_BD, MATH_CONTEXT);
        ofEpochSecond = Instant.ofEpochSecond(divideAndRemainder[0].longValueExact(), divideAndRemainder[1].multiply(HUNDRED_BD).longValueExact());
        return ofEpochSecond;
    }

    public static FileTime plusMillis(FileTime fileTime, long j10) {
        Instant instant;
        Instant plusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        plusMillis = instant.plusMillis(j10);
        from = FileTime.from(plusMillis);
        return from;
    }

    public static FileTime plusNanos(FileTime fileTime, long j10) {
        Instant instant;
        Instant plusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        plusNanos = instant.plusNanos(j10);
        from = FileTime.from(plusNanos);
        return from;
    }

    public static FileTime plusSeconds(FileTime fileTime, long j10) {
        Instant instant;
        Instant plusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        plusSeconds = instant.plusSeconds(j10);
        from = FileTime.from(plusSeconds);
        return from;
    }

    public static void setLastModifiedTime(Path path) {
        Files.setLastModifiedTime(path, now());
    }

    public static Date toDate(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return new Date(millis);
        }
        return null;
    }

    public static FileTime toFileTime(Date date) {
        FileTime fromMillis;
        if (date != null) {
            fromMillis = FileTime.fromMillis(date.getTime());
            return fromMillis;
        }
        return null;
    }

    public static long toNtfsTime(long j10) {
        BigDecimal subtract = BigDecimal.valueOf(j10).multiply(HUNDRED_NANOS_PER_MILLISECOND_BD).subtract(UNIX_TO_NTFS_OFFSET_BD);
        if (subtract.compareTo(LONG_MAX_VALUE_BD) >= 0) {
            return Long.MAX_VALUE;
        }
        if (subtract.compareTo(LONG_MIN_VALUE_BD) <= 0) {
            return Long.MIN_VALUE;
        }
        return subtract.longValue();
    }

    public static long toUnixTime(FileTime fileTime) {
        long j10;
        if (fileTime != null) {
            j10 = fileTime.to(TimeUnit.SECONDS);
            return j10;
        }
        return 0L;
    }

    public static Date ntfsTimeToDate(long j10) {
        return ntfsTimeToDate(BigDecimal.valueOf(j10));
    }

    public static boolean isUnixTime(FileTime fileTime) {
        return isUnixTime(toUnixTime(fileTime));
    }

    public static Instant ntfsTimeToInstant(long j10) {
        return ntfsTimeToInstant(BigDecimal.valueOf(j10));
    }

    public static long toNtfsTime(FileTime fileTime) {
        Instant instant;
        instant = fileTime.toInstant();
        return toNtfsTime(instant);
    }

    public static long toNtfsTime(Instant instant) {
        long epochSecond;
        int nano;
        epochSecond = instant.getEpochSecond();
        BigDecimal multiply = BigDecimal.valueOf(epochSecond).multiply(HUNDRED_NANOS_PER_SECOND_BD);
        nano = instant.getNano();
        return multiply.add(BigDecimal.valueOf(nano / 100)).subtract(UNIX_TO_NTFS_OFFSET_BD).longValueExact();
    }

    public static long toNtfsTime(Date date) {
        return toNtfsTime(date.getTime());
    }
}
