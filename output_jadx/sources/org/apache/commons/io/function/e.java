package org.apache.commons.io.function;

import java.util.function.BiConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOBiConsumer f4846b;

    public /* synthetic */ e(IOBiConsumer iOBiConsumer, int i10) {
        this.f4845a = i10;
        this.f4846b = iOBiConsumer;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f4845a) {
            case 0:
                IOBiConsumer.f(this.f4846b, obj, obj2);
                return;
            case 1:
                IOStream.i(this.f4846b, obj, obj2);
                return;
            default:
                IOStream.x(this.f4846b, obj, obj2);
                return;
        }
    }
}
