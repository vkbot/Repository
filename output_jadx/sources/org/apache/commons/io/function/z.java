package org.apache.commons.io.function;

import java.util.function.Supplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOSupplier f4877b;

    public /* synthetic */ z(IOSupplier iOSupplier, int i10) {
        this.f4876a = i10;
        this.f4877b = iOSupplier;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        switch (this.f4876a) {
            case 0:
                obj = Erase.get(this.f4877b);
                return obj;
            default:
                return this.f4877b.getUnchecked();
        }
    }
}
