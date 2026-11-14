package org.apache.commons.io.input;

import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOIntSupplier;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements IOIntSupplier, IOTriFunction, IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4900b;
    public final /* synthetic */ UncheckedFilterInputStream c;

    public /* synthetic */ o(UncheckedFilterInputStream uncheckedFilterInputStream, int i10) {
        this.f4900b = i10;
        this.c = uncheckedFilterInputStream;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        Long lambda$skip$6;
        Integer lambda$read$3;
        switch (this.f4900b) {
            case 3:
                lambda$skip$6 = this.c.lambda$skip$6(((Long) obj).longValue());
                return lambda$skip$6;
            default:
                lambda$read$3 = this.c.lambda$read$3((byte[]) obj);
                return lambda$read$3;
        }
    }

    @Override // org.apache.commons.io.function.IOIntSupplier
    public int getAsInt() {
        int lambda$read$2;
        int lambda$available$0;
        switch (this.f4900b) {
            case 0:
                lambda$read$2 = this.c.lambda$read$2();
                return lambda$read$2;
            default:
                lambda$available$0 = this.c.lambda$available$0();
                return lambda$available$0;
        }
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        Integer lambda$read$4;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        lambda$read$4 = this.c.lambda$read$4((byte[]) obj, intValue, intValue2);
        return lambda$read$4;
    }
}
