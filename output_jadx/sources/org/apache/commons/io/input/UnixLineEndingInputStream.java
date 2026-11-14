package org.apache.commons.io.input;

import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class UnixLineEndingInputStream extends InputStream {
    private boolean atEos;
    private boolean atSlashCr;
    private boolean atSlashLf;
    private final InputStream in;
    private final boolean lineFeedAtEndOfFile;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z9) {
        this.in = inputStream;
        this.lineFeedAtEndOfFile = z9;
    }

    private int handleEos(boolean z9) {
        if (z9 || !this.lineFeedAtEndOfFile || this.atSlashLf) {
            return -1;
        }
        this.atSlashLf = true;
        return 10;
    }

    private int readWithUpdate() {
        boolean z9;
        boolean z10;
        int read = this.in.read();
        boolean z11 = false;
        if (read == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.atEos = z9;
        if (z9) {
            return read;
        }
        if (read == 13) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.atSlashCr = z10;
        if (read == 10) {
            z11 = true;
        }
        this.atSlashLf = z11;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.in.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        throw UnsupportedOperationExceptions.mark();
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        boolean z9 = this.atSlashCr;
        if (this.atEos) {
            return handleEos(z9);
        }
        int readWithUpdate = readWithUpdate();
        if (this.atEos) {
            return handleEos(z9);
        }
        if (this.atSlashCr) {
            return 10;
        }
        if (z9 && this.atSlashLf) {
            return read();
        }
        return readWithUpdate;
    }
}
