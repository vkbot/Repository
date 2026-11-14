package ai.onnxruntime.providers;

import ai.onnxruntime.OrtProviderOptions;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OrtProviderOptions.OrtProviderSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;

    public /* synthetic */ a(int i10) {
        this.f94a = i10;
    }

    @Override // ai.onnxruntime.OrtProviderOptions.OrtProviderSupplier
    public final long create() {
        switch (this.f94a) {
            case 0:
                return OrtCUDAProviderOptions.c();
            default:
                return OrtTensorRTProviderOptions.c();
        }
    }
}
