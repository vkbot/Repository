package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ThresholdingOutputStream extends OutputStream {
    private static final IOFunction<ThresholdingOutputStream, OutputStream> NOOP_OS_GETTER = new n0.b(27);
    private final IOFunction<ThresholdingOutputStream, OutputStream> outputStreamGetter;
    private final int threshold;
    private final IOConsumer<ThresholdingOutputStream> thresholdConsumer;
    private boolean thresholdExceeded;
    private long written;

    public ThresholdingOutputStream(int i10, IOConsumer<ThresholdingOutputStream> iOConsumer, IOFunction<ThresholdingOutputStream, OutputStream> iOFunction) {
        this.threshold = i10 < 0 ? 0 : i10;
        this.thresholdConsumer = iOConsumer == null ? IOConsumer.noop() : iOConsumer;
        this.outputStreamGetter = iOFunction == null ? NOOP_OS_GETTER : iOFunction;
    }

    public static /* synthetic */ OutputStream lambda$static$0(ThresholdingOutputStream thresholdingOutputStream) {
        return NullOutputStream.INSTANCE;
    }

    public void checkThreshold(int i10) {
        if (!this.thresholdExceeded && this.written + i10 > this.threshold) {
            this.thresholdExceeded = true;
            thresholdReached();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        getStream().close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        getStream().flush();
    }

    public long getByteCount() {
        return this.written;
    }

    public OutputStream getOutputStream() {
        return this.outputStreamGetter.apply(this);
    }

    @Deprecated
    public OutputStream getStream() {
        return getOutputStream();
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isThresholdExceeded() {
        if (this.written > this.threshold) {
            return true;
        }
        return false;
    }

    public void resetByteCount() {
        this.thresholdExceeded = false;
        this.written = 0L;
    }

    public void setByteCount(long j10) {
        this.written = j10;
    }

    public void thresholdReached() {
        this.thresholdConsumer.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        checkThreshold(i11);
        getStream().write(bArr, i10, i11);
        this.written += i11;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.written += bArr.length;
    }

    public ThresholdingOutputStream(int i10) {
        this(i10, IOConsumer.noop(), NOOP_OS_GETTER);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        checkThreshold(1);
        getStream().write(i10);
        this.written++;
    }
}
