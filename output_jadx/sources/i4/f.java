package i4;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2774a;

    /* renamed from: b, reason: collision with root package name */
    public long f2775b;

    public final long a() {
        if (this.f2774a) {
            return System.nanoTime() - this.f2775b;
        }
        return 0L;
    }

    public final void b() {
        o4.b.m(!this.f2774a, "This stopwatch is already running.");
        this.f2774a = true;
        this.f2775b = System.nanoTime();
    }

    public final String toString() {
        long j10;
        TimeUnit timeUnit;
        String str;
        if (this.f2774a) {
            j10 = System.nanoTime() - this.f2775b;
        } else {
            j10 = 0;
        }
        long j11 = j10 / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j11 > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (j10 / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (j10 / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (j10 / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (j10 / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (j10 / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        double convert = j10 / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        int i10 = d.f2772a;
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
        sb.append(" ");
        switch (e.f2773a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
