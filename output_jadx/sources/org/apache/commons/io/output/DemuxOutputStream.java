package org.apache.commons.io.output;

import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class DemuxOutputStream extends OutputStream {
    private final InheritableThreadLocal<OutputStream> outputStreamThreadLocal = new InheritableThreadLocal<>();

    public OutputStream bindStream(OutputStream outputStream) {
        OutputStream outputStream2 = this.outputStreamThreadLocal.get();
        this.outputStreamThreadLocal.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(this.outputStreamThreadLocal.get());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.outputStreamThreadLocal.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        OutputStream outputStream = this.outputStreamThreadLocal.get();
        if (outputStream != null) {
            outputStream.write(i10);
        }
    }
}
