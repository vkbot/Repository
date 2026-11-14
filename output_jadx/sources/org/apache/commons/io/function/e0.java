package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements IOSupplier, IOBooleanSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOIterator f4847b;

    public /* synthetic */ e0(IOIterator iOIterator) {
        this.f4847b = iOIterator;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        return this.f4847b.next();
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public boolean getAsBoolean() {
        return this.f4847b.hasNext();
    }
}
