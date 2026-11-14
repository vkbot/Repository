package org.apache.commons.io.input;

import java.io.Writer;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4888b;

    public /* synthetic */ g(int i10, int i11) {
        this.f4887a = i11;
        this.f4888b = i10;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4887a) {
            case 0:
                ObservableInputStream.b(this.f4888b, (ObservableInputStream.Observer) obj);
                return;
            default:
                ((Writer) obj).write(this.f4888b);
                return;
        }
    }
}
