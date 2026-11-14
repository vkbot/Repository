package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.function.IOIntConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class ChecksumInputStream extends CountingInputStream {
    private final long countThreshold;
    private final long expectedChecksumValue;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<ChecksumInputStream, Builder> {
        private Checksum checksum;
        private long countThreshold = -1;
        private long expectedChecksumValue;

        @Override // org.apache.commons.io.function.IOSupplier
        public ChecksumInputStream get() {
            return new ChecksumInputStream(this);
        }

        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.input.ChecksumInputStream$Builder, org.apache.commons.io.build.AbstractStreamBuilder] */
        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public Builder setChecksum(Checksum checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder setCountThreshold(long j10) {
            this.countThreshold = j10;
            return this;
        }

        public Builder setExpectedChecksumValue(long j10) {
            this.expectedChecksumValue = j10;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ChecksumInputStream(org.apache.commons.io.input.ChecksumInputStream.Builder r5) {
        /*
            r4 = this;
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            java.io.InputStream r1 = r5.getInputStream()
            java.util.zip.Checksum r2 = org.apache.commons.io.input.ChecksumInputStream.Builder.access$100(r5)
            java.lang.String r3 = "builder.checksum"
            java.util.Objects.requireNonNull(r2, r3)
            java.util.zip.Checksum r2 = (java.util.zip.Checksum) r2
            r0.<init>(r1, r2)
            r4.<init>(r0, r5)
            long r0 = org.apache.commons.io.input.ChecksumInputStream.Builder.access$200(r5)
            r4.countThreshold = r0
            long r0 = org.apache.commons.io.input.ChecksumInputStream.Builder.access$300(r5)
            r4.expectedChecksumValue = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ChecksumInputStream.<init>(org.apache.commons.io.input.ChecksumInputStream$Builder):void");
    }

    public static Builder builder() {
        return new Builder();
    }

    private Checksum getChecksum() {
        return ((CheckedInputStream) ((FilterInputStream) this).in).getChecksum();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        if (r5 == (-1)) goto L12;
     */
    @Override // org.apache.commons.io.input.CountingInputStream, org.apache.commons.io.input.ProxyInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void afterRead(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            super.afterRead(r5)     // Catch: java.lang.Throwable -> L17
            long r0 = r4.countThreshold     // Catch: java.lang.Throwable -> L17
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19
            long r0 = r4.getByteCount()     // Catch: java.lang.Throwable -> L17
            long r2 = r4.countThreshold     // Catch: java.lang.Throwable -> L17
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1c
            goto L19
        L17:
            r5 = move-exception
            goto L35
        L19:
            r0 = -1
            if (r5 != r0) goto L33
        L1c:
            long r0 = r4.expectedChecksumValue     // Catch: java.lang.Throwable -> L17
            java.util.zip.Checksum r5 = r4.getChecksum()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.getValue()     // Catch: java.lang.Throwable -> L17
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2b
            goto L33
        L2b:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Checksum verification failed."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L33:
            monitor-exit(r4)
            return
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ChecksumInputStream.afterRead(int):void");
    }

    public long getRemaining() {
        return this.countThreshold - getByteCount();
    }
}
