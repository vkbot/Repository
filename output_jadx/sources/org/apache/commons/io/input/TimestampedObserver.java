package org.apache.commons.io.input;

import java.time.Duration;
import java.time.Instant;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TimestampedObserver extends ObservableInputStream.Observer {
    private volatile Instant closeInstant;
    private final Instant openInstant;

    public TimestampedObserver() {
        Instant now;
        now = Instant.now();
        this.openInstant = now;
    }

    @Override // org.apache.commons.io.input.ObservableInputStream.Observer
    public void closed() {
        Instant now;
        now = Instant.now();
        this.closeInstant = now;
    }

    public Instant getCloseInstant() {
        return this.closeInstant;
    }

    public Instant getOpenInstant() {
        return this.openInstant;
    }

    public Duration getOpenToCloseDuration() {
        Duration between;
        between = Duration.between(this.openInstant, this.closeInstant);
        return between;
    }

    public Duration getOpenToNowDuration() {
        Instant now;
        Duration between;
        Instant instant = this.openInstant;
        now = Instant.now();
        between = Duration.between(instant, now);
        return between;
    }

    public boolean isClosed() {
        if (this.closeInstant != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "TimestampedObserver [openInstant=" + this.openInstant + ", closeInstant=" + this.closeInstant + "]";
    }
}
