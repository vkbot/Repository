package ai.onnxruntime;

import j1.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class OrtLoraAdapter implements AutoCloseable {
    private boolean closed = false;
    private final long nativeHandle;

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            b.o("Failed to load onnx-runtime library", e);
        }
    }

    private OrtLoraAdapter(long j10) {
        this.nativeHandle = j10;
    }

    private static native void close(long j10, long j11);

    public static OrtLoraAdapter create(ByteBuffer byteBuffer, OrtAllocator ortAllocator) {
        long j10;
        Objects.requireNonNull(byteBuffer, "LoRA buffer must not be null");
        if (byteBuffer.remaining() != 0) {
            if (byteBuffer.isDirect()) {
                if (ortAllocator == null) {
                    j10 = 0;
                } else {
                    j10 = ortAllocator.handle;
                }
                return new OrtLoraAdapter(createLoraAdapterFromBuffer(OnnxRuntime.ortApiHandle, byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j10));
            }
            throw new OrtException("ByteBuffer is not direct.");
        }
        throw new OrtException("Invalid LoRA buffer, no elements remaining.");
    }

    private static native long createLoraAdapter(long j10, String str, long j11);

    private static native long createLoraAdapterFromArray(long j10, byte[] bArr, long j11);

    private static native long createLoraAdapterFromBuffer(long j10, ByteBuffer byteBuffer, int i10, int i11, long j11);

    public void checkClosed() {
        if (!this.closed) {
            return;
        }
        i.l("Trying to use a closed OrtLoraAdapter");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        } else {
            i.l("Trying to close an already closed OrtLoraAdapter");
        }
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public static OrtLoraAdapter create(byte[] bArr, OrtAllocator ortAllocator) {
        Objects.requireNonNull(bArr, "LoRA array must not be null");
        return new OrtLoraAdapter(createLoraAdapterFromArray(OnnxRuntime.ortApiHandle, bArr, ortAllocator == null ? 0L : ortAllocator.handle));
    }

    public static OrtLoraAdapter create(ByteBuffer byteBuffer) {
        return create(byteBuffer, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(byte[] bArr) {
        return create(bArr, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(String str) {
        return create(str, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(String str, OrtAllocator ortAllocator) {
        return new OrtLoraAdapter(createLoraAdapter(OnnxRuntime.ortApiHandle, str, ortAllocator == null ? 0L : ortAllocator.handle));
    }
}
