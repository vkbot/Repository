package org.apache.commons.io.output;

import org.apache.commons.io.function.IOConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedFilterWriter f4922b;

    public /* synthetic */ g(UncheckedFilterWriter uncheckedFilterWriter, int i10) {
        this.f4921a = i10;
        this.f4922b = uncheckedFilterWriter;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4921a) {
            case 0:
                this.f4922b.lambda$write$5((char[]) obj);
                return;
            default:
                this.f4922b.lambda$write$8((String) obj);
                return;
        }
    }
}
