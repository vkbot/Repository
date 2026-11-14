package org.apache.commons.io.output;

import java.io.Writer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOTriConsumer;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IOFunction, IOTriConsumer, IOTriFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4918b;
    public final /* synthetic */ UncheckedFilterWriter c;

    public /* synthetic */ e(UncheckedFilterWriter uncheckedFilterWriter, int i10) {
        this.f4918b = i10;
        this.c = uncheckedFilterWriter;
    }

    @Override // org.apache.commons.io.function.IOTriConsumer
    public void accept(Object obj, Object obj2, Object obj3) {
        switch (this.f4918b) {
            case 2:
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                this.c.lambda$write$9((String) obj, intValue, intValue2);
                return;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                int intValue4 = ((Integer) obj3).intValue();
                this.c.lambda$write$6((char[]) obj, intValue3, intValue4);
                return;
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        Writer lambda$append$1;
        Writer lambda$append$0;
        switch (this.f4918b) {
            case 0:
                lambda$append$1 = this.c.lambda$append$1((CharSequence) obj);
                return lambda$append$1;
            default:
                lambda$append$0 = this.c.lambda$append$0(((Character) obj).charValue());
                return lambda$append$0;
        }
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        Writer lambda$append$2;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        lambda$append$2 = this.c.lambda$append$2((CharSequence) obj, intValue, intValue2);
        return lambda$append$2;
    }
}
