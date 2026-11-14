package ai.onnxruntime.providers;

import ai.onnxruntime.OrtProvider;
import ai.onnxruntime.OrtProviderOptions;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class OrtTensorRTProviderOptions extends StringConfigProviderOptions {
    private static final OrtProvider PROVIDER = OrtProvider.TENSOR_RT;

    public OrtTensorRTProviderOptions(int i10) {
        super(OrtProviderOptions.loadLibraryAndCreate(PROVIDER, new a(1)));
        if (i10 >= 0) {
            this.options.put("device_id", ai.onnxruntime.a.e(i10, ""));
        } else {
            close();
            i.k(ai.onnxruntime.a.e(i10, "Device id must be non-negative, received "));
            throw null;
        }
    }

    private static native long create(long j10);

    public static /* synthetic */ long lambda$new$0() {
        return create(OrtProviderOptions.getApiHandle());
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ void add(String str, String str2) {
        super.add(str, str2);
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public native void applyToNative(long j10, long j11, String[] strArr, String[] strArr2);

    @Override // ai.onnxruntime.OrtProviderOptions
    public native void close(long j10, long j11);

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ String getOptionsString() {
        return super.getOptionsString();
    }

    @Override // ai.onnxruntime.OrtProviderOptions
    public OrtProvider getProvider() {
        return PROVIDER;
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ void parseOptionsString(String str) {
        super.parseOptionsString(str);
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public OrtTensorRTProviderOptions() {
        this(0);
    }
}
