package org.apache.commons.io.output;

import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements IOFunction, IOTriFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4915b;
    public final /* synthetic */ Appendable c;

    public /* synthetic */ c(Appendable appendable, int i10) {
        this.f4915b = i10;
        this.c = appendable;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        switch (this.f4915b) {
            case 0:
                return this.c.append(((Character) obj).charValue());
            default:
                return this.c.append((CharSequence) obj);
        }
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        return this.c.append((CharSequence) obj, intValue, intValue2);
    }
}
