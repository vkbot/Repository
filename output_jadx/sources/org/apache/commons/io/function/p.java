package org.apache.commons.io.function;

import java.util.function.Function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4865b;
    public final /* synthetic */ IOFunction c;
    public final /* synthetic */ Function d;

    public /* synthetic */ p(IOFunction iOFunction, Function function, int i10) {
        this.f4865b = i10;
        this.c = iOFunction;
        this.d = function;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        Object lambda$compose$5;
        Object lambda$andThen$1;
        switch (this.f4865b) {
            case 0:
                lambda$compose$5 = this.c.lambda$compose$5(this.d, obj);
                return lambda$compose$5;
            default:
                lambda$andThen$1 = this.c.lambda$andThen$1(this.d, obj);
                return lambda$andThen$1;
        }
    }
}
