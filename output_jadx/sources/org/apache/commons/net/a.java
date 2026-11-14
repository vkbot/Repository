package org.apache.commons.net;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4935b;
    public final /* synthetic */ ProtocolCommandEvent c;

    public /* synthetic */ a(ProtocolCommandEvent protocolCommandEvent, int i10) {
        this.f4935b = i10;
        this.c = protocolCommandEvent;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4935b) {
            case 0:
                ProtocolCommandSupport.a(this.c, (ProtocolCommandListener) obj);
                return;
            default:
                ProtocolCommandSupport.b(this.c, (ProtocolCommandListener) obj);
                return;
        }
    }
}
