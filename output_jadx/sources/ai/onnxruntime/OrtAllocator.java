package ai.onnxruntime;

import j1.i;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class OrtAllocator implements AutoCloseable {
    private boolean closed = false;
    final long handle;
    private final boolean isDefault;

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            b.o("Failed to load onnx-runtime library", e);
        }
    }

    public OrtAllocator(long j10, boolean z9) {
        this.handle = j10;
        this.isDefault = z9;
    }

    private native void closeAllocator(long j10, long j11);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            if (!this.isDefault) {
                closeAllocator(OnnxRuntime.ortApiHandle, this.handle);
                this.closed = true;
                return;
            }
            return;
        }
        i.l("Trying to close an already closed OrtAllocator.");
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
