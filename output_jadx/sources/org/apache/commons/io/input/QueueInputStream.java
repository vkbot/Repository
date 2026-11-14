package org.apache.commons.io.input;

import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.output.QueueOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class QueueInputStream extends InputStream {
    private final BlockingQueue<Integer> blockingQueue;
    private final long timeoutNanos;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<QueueInputStream, Builder> {
        private BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue();
        private Duration timeout;

        public Builder() {
            Duration duration;
            duration = Duration.ZERO;
            this.timeout = duration;
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public QueueInputStream get() {
            return new QueueInputStream(this);
        }

        public Builder setBlockingQueue(BlockingQueue<Integer> blockingQueue) {
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue<>();
            }
            this.blockingQueue = blockingQueue;
            return this;
        }

        public Builder setTimeout(Duration duration) {
            long nanos;
            if (duration != null) {
                nanos = duration.toNanos();
                if (nanos < 0) {
                    j1.i.k("timeout must not be negative");
                    return null;
                }
            }
            if (duration == null) {
                duration = Duration.ZERO;
            }
            this.timeout = duration;
            return this;
        }
    }

    private QueueInputStream(Builder builder) {
        long nanos;
        BlockingQueue<Integer> blockingQueue = builder.blockingQueue;
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
        Duration duration = builder.timeout;
        Objects.requireNonNull(duration, "timeout");
        nanos = org.apache.commons.io.filefilter.f.j(duration).toNanos();
        this.timeoutNanos = nanos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BlockingQueue<Integer> getBlockingQueue() {
        return this.blockingQueue;
    }

    public Duration getTimeout() {
        Duration ofNanos;
        ofNanos = Duration.ofNanos(this.timeoutNanos);
        return ofNanos;
    }

    public QueueOutputStream newQueueOutputStream() {
        return new QueueOutputStream(this.blockingQueue);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(Math.min(i11, this.blockingQueue.size()));
        this.blockingQueue.drainTo(arrayList, i11);
        if (arrayList.isEmpty()) {
            int read = read();
            if (read == -1) {
                return -1;
            }
            arrayList.add(Integer.valueOf(read));
            this.blockingQueue.drainTo(arrayList, i11 - 1);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            bArr[i10 + i12] = (byte) (((Integer) obj).intValue() & 255);
            i12++;
        }
        return i12;
    }

    public QueueInputStream() {
        this(new LinkedBlockingQueue());
    }

    @Deprecated
    public QueueInputStream(BlockingQueue<Integer> blockingQueue) {
        this(builder().setBlockingQueue(blockingQueue));
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            Integer poll = this.blockingQueue.poll(this.timeoutNanos, TimeUnit.NANOSECONDS);
            if (poll == null) {
                return -1;
            }
            return poll.intValue() & 255;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }
}
