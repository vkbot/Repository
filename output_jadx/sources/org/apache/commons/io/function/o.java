package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4864b;
    public final /* synthetic */ IOFunction c;
    public final /* synthetic */ IOFunction d;

    public /* synthetic */ o(IOFunction iOFunction, IOFunction iOFunction2, int i10) {
        this.f4864b = i10;
        this.c = iOFunction;
        this.d = iOFunction2;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        switch (this.f4864b) {
            case 0:
                return this.c.lambda$andThen$3(this.d, obj);
            default:
                return this.c.lambda$compose$6(this.d, obj);
        }
    }
}
