package org.apache.commons.io.function;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4862b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(IOFunction iOFunction, IOConsumer iOConsumer) {
        this.f4861a = 1;
        this.c = iOFunction;
        this.f4862b = iOConsumer;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4861a) {
            case 0:
                ((IOConsumer) this.f4862b).lambda$andThen$1((IOConsumer) this.c, obj);
                return;
            case 1:
                IOFunction.m((IOFunction) this.c, (IOConsumer) this.f4862b, obj);
                return;
            default:
                IOFunction.d((IOFunction) this.f4862b, (Consumer) this.c, obj);
                return;
        }
    }

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f4861a = i10;
        this.f4862b = obj;
        this.c = obj2;
    }
}
