package org.apache.commons.io.input;

import java.io.Writer;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4889a;

    public /* synthetic */ h(int i10) {
        this.f4889a = i10;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4889a) {
            case 0:
                ((ObservableInputStream.Observer) obj).finished();
                return;
            case 1:
                ((ObservableInputStream.Observer) obj).closed();
                return;
            case 2:
                ((Writer) obj).close();
                return;
            default:
                ((Writer) obj).flush();
                return;
        }
    }
}
