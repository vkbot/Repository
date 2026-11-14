package org.apache.commons.io.output;

import j1.i;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private final int chunkSize;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<ChunkedOutputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public ChunkedOutputStream get() {
            return new ChunkedOutputStream(this);
        }
    }

    private ChunkedOutputStream(Builder builder) {
        super(builder.getOutputStream());
        int bufferSize = builder.getBufferSize();
        if (bufferSize > 0) {
            this.chunkSize = bufferSize;
        } else {
            i.k("chunkSize <= 0");
            throw null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        while (i11 > 0) {
            int min = Math.min(i11, this.chunkSize);
            ((FilterOutputStream) this).out.write(bArr, i10, min);
            i11 -= min;
            i10 += min;
        }
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream outputStream, int i10) {
        super(outputStream);
        if (i10 > 0) {
            this.chunkSize = i10;
        } else {
            i.k("chunkSize <= 0");
            throw null;
        }
    }
}
