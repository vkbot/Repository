package org.apache.commons.io.input;

import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private boolean atEos;
    private boolean atSlashCr;
    private boolean atSlashLf;
    private final InputStream in;
    private boolean injectSlashLf;
    private final boolean lineFeedAtEos;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z9) {
        this.in = inputStream;
        this.lineFeedAtEos = z9;
    }

    private int handleEos() {
        if (!this.lineFeedAtEos) {
            return -1;
        }
        boolean z9 = this.atSlashLf;
        if (!z9 && !this.atSlashCr) {
            this.atSlashCr = true;
            return 13;
        }
        if (z9) {
            return -1;
        }
        this.atSlashCr = false;
        this.atSlashLf = true;
        return 10;
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
        boolean z9;
        boolean z10;
        if (this.atEos) {
            return handleEos();
        }
        boolean z11 = false;
        if (this.injectSlashLf) {
            this.injectSlashLf = false;
            return 10;
        }
        boolean z12 = this.atSlashCr;
        int read = this.in.read();
        if (read == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.atEos = z9;
        if (!z9) {
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
        }
        if (z9) {
            return handleEos();
        }
        if (read == 10 && !z12) {
            this.injectSlashLf = true;
            return 13;
        }
        return read;
    }
}
