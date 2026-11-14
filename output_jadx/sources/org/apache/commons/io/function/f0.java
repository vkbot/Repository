package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements IOFunction, IOSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOSpliterator f4850b;

    public /* synthetic */ f0(IOSpliterator iOSpliterator) {
        this.f4850b = iOSpliterator;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return Boolean.valueOf(this.f4850b.tryAdvance((IOConsumer) obj));
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        return this.f4850b.trySplit();
    }
}
