package ai.onnxruntime;

import ai.onnxruntime.OrtException;
import j1.i;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class OrtProviderOptions implements AutoCloseable {
    private static final Logger logger = Logger.getLogger(OrtProviderOptions.class.getName());
    protected boolean closed = false;
    protected final long nativeHandle;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: ai.onnxruntime.OrtProviderOptions$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OrtProvider;

        static {
            int[] iArr = new int[OrtProvider.values().length];
            $SwitchMap$ai$onnxruntime$OrtProvider = iArr;
            try {
                iArr[OrtProvider.CUDA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.DNNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.OPEN_VINO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.ROCM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.TENSOR_RT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface OrtProviderSupplier {
        long create();
    }

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            b.o("Failed to load onnx-runtime library", e);
        }
    }

    public OrtProviderOptions(long j10) {
        this.nativeHandle = j10;
    }

    public static long getApiHandle() {
        return OnnxRuntime.ortApiHandle;
    }

    public static long loadLibraryAndCreate(OrtProvider ortProvider, OrtProviderSupplier ortProviderSupplier) {
        int i10 = AnonymousClass1.$SwitchMap$ai$onnxruntime$OrtProvider[ortProvider.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && !OnnxRuntime.extractTensorRT()) {
                            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find TensorRT shared provider");
                        }
                    } else if (!OnnxRuntime.extractROCM()) {
                        throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find ROCm shared provider");
                    }
                } else if (!OnnxRuntime.extractOpenVINO()) {
                    throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find OpenVINO shared provider");
                }
            } else if (!OnnxRuntime.extractDNNL()) {
                throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find DNNL shared provider");
            }
        } else if (!OnnxRuntime.extractCUDA()) {
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find CUDA shared provider");
        }
        return ortProviderSupplier.create();
    }

    public abstract void applyToNative();

    public void checkClosed() {
        if (!this.closed) {
            return;
        }
        i.l("Trying to use a closed OrtProviderOptions");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        } else {
            logger.warning("Closing an already closed tensor.");
        }
    }

    public abstract void close(long j10, long j11);

    public abstract OrtProvider getProvider();

    public synchronized boolean isClosed() {
        return this.closed;
    }
}
