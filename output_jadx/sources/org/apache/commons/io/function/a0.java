package org.apache.commons.io.function;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4839b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(int i10, Object obj) {
        this.f4839b = i10;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4839b) {
            case 0:
                IOStreams.b((IOConsumer) this.c, obj);
                return;
            case 1:
                IOConsumer.b((IOConsumer) this.c, obj);
                return;
            case 2:
                IOStream.h((IOConsumer) this.c, obj);
                return;
            case 3:
                IOStream.R((IOConsumer) this.c, obj);
                return;
            case 4:
                IOStream.C((IOConsumer) this.c, obj);
                return;
            default:
                IOIntConsumer.c((IOIntConsumer) this.c, (Integer) obj);
                return;
        }
    }
}
