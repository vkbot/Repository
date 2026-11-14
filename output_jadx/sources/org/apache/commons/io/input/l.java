package org.apache.commons.io.input;

import java.nio.CharBuffer;
import org.apache.commons.io.function.IOBooleanSupplier;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOIntSupplier;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements IOFunction, IOSupplier, IOTriFunction, IOIntSupplier, IOBooleanSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4895b;
    public final /* synthetic */ UncheckedBufferedReader c;

    public /* synthetic */ l(UncheckedBufferedReader uncheckedBufferedReader, int i10) {
        this.f4895b = i10;
        this.c = uncheckedBufferedReader;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        Integer lambda$read$3;
        Integer lambda$read$5;
        Long lambda$skip$9;
        switch (this.f4895b) {
            case 0:
                lambda$read$3 = this.c.lambda$read$3((char[]) obj);
                return lambda$read$3;
            case 1:
            default:
                lambda$skip$9 = this.c.lambda$skip$9(((Long) obj).longValue());
                return lambda$skip$9;
            case 2:
                lambda$read$5 = this.c.lambda$read$5((CharBuffer) obj);
                return lambda$read$5;
        }
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        String lambda$readLine$6;
        lambda$readLine$6 = this.c.lambda$readLine$6();
        return lambda$readLine$6;
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public boolean getAsBoolean() {
        boolean lambda$ready$7;
        lambda$ready$7 = this.c.lambda$ready$7();
        return lambda$ready$7;
    }

    @Override // org.apache.commons.io.function.IOIntSupplier
    public int getAsInt() {
        int lambda$read$2;
        lambda$read$2 = this.c.lambda$read$2();
        return lambda$read$2;
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        Integer lambda$read$4;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        lambda$read$4 = this.c.lambda$read$4((char[]) obj, intValue, intValue2);
        return lambda$read$4;
    }
}
