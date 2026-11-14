package org.apache.commons.io.function;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4854b;

    public /* synthetic */ g0(int i10, Object obj) {
        this.f4853a = i10;
        this.f4854b = obj;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4853a) {
            case 0:
                ((Consumer) this.f4854b).accept(obj);
                return;
            default:
                ((IOSpliterator) this.f4854b).forEachRemaining((IOConsumer) obj);
                return;
        }
    }
}
