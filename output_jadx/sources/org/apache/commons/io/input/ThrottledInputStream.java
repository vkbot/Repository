package org.apache.commons.io.input;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.InterruptedIOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.function.IOIntConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class ThrottledInputStream extends CountingInputStream {
    private final double maxBytesPerSecond;
    private final long startTime;
    private Duration totalSleepDuration;

    private ThrottledInputStream(Builder builder) {
        super(builder);
        Duration duration;
        this.startTime = System.currentTimeMillis();
        duration = Duration.ZERO;
        this.totalSleepDuration = duration;
        if (builder.maxBytesPerSecond <= 0.0d) {
            throw new IllegalArgumentException("Bandwidth " + builder.maxBytesPerSecond + " is invalid.");
        }
        this.maxBytesPerSecond = builder.maxBytesPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    private long getBytesPerSecond() {
        long currentTimeMillis = (System.currentTimeMillis() - this.startTime) / 1000;
        if (currentTimeMillis == 0) {
            return getByteCount();
        }
        return getByteCount() / currentTimeMillis;
    }

    private long getSleepMillis() {
        return toSleepMillis(getByteCount(), System.currentTimeMillis() - this.startTime, this.maxBytesPerSecond);
    }

    private void throttle() {
        Duration plus;
        ChronoUnit unused;
        long sleepMillis = getSleepMillis();
        if (sleepMillis > 0) {
            Duration duration = this.totalSleepDuration;
            unused = ChronoUnit.MILLIS;
            plus = duration.plus(sleepMillis, ChronoUnit.MILLIS);
            this.totalSleepDuration = plus;
            try {
                TimeUnit.MILLISECONDS.sleep(sleepMillis);
            } catch (InterruptedException unused2) {
                throw new InterruptedIOException("Thread aborted");
            }
        }
    }

    public static long toSleepMillis(long j10, long j11, double d) {
        if (j10 <= 0 || d <= 0.0d || j11 == 0) {
            return 0L;
        }
        long j12 = (long) (((j10 / d) * 1000.0d) - j11);
        if (j12 <= 0) {
            return 0L;
        }
        return j12;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public void beforeRead(int i10) {
        throttle();
    }

    public double getMaxBytesPerSecond() {
        return this.maxBytesPerSecond;
    }

    public Duration getTotalSleepDuration() {
        return this.totalSleepDuration;
    }

    public String toString() {
        return "ThrottledInputStream[bytesRead=" + getByteCount() + ", maxBytesPerSec=" + this.maxBytesPerSecond + ", bytesPerSec=" + getBytesPerSecond() + ", totalSleepDuration=" + this.totalSleepDuration + ']';
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<ThrottledInputStream, Builder> {
        private double maxBytesPerSecond = Double.MAX_VALUE;

        /* JADX WARN: Multi-variable type inference failed */
        private Builder setMaxBytesPerSecond(double d) {
            if (d > 0.0d) {
                this.maxBytesPerSecond = d;
                return (Builder) asThis();
            }
            throw new IllegalArgumentException("Bandwidth " + d + " must be > 0.");
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public ThrottledInputStream get() {
            return new ThrottledInputStream(this);
        }

        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        public double getMaxBytesPerSecond() {
            return this.maxBytesPerSecond;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.build.AbstractStreamBuilder, org.apache.commons.io.input.ThrottledInputStream$Builder] */
        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setMaxBytes(long j10, Duration duration) {
            long millis;
            Objects.requireNonNull(duration, TypedValues.TransitionType.S_DURATION);
            millis = org.apache.commons.io.filefilter.f.j(duration).toMillis();
            setMaxBytesPerSecond((millis / 1000.0d) * j10);
            return (Builder) asThis();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setMaxBytes(long j10, ChronoUnit chronoUnit) {
            Duration duration;
            duration = chronoUnit.getDuration();
            setMaxBytes(j10, duration);
            return (Builder) asThis();
        }

        public void setMaxBytesPerSecond(long j10) {
            setMaxBytesPerSecond(j10);
        }
    }
}
