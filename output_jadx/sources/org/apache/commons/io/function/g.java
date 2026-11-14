package org.apache.commons.io.function;

import java.util.function.BiFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOBiFunction f4852b;

    public /* synthetic */ g(IOBiFunction iOBiFunction, int i10) {
        this.f4851a = i10;
        this.f4852b = iOBiFunction;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f4851a) {
            case 0:
                return IOBiFunction.b(this.f4852b, obj, obj2);
            default:
                return IOStream.lambda$reduce$21(this.f4852b, obj, obj2);
        }
    }
}
