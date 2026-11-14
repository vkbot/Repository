package org.apache.commons.io.input;

import java.io.Writer;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4891b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, int i10, int i11, int i12) {
        this.f4890a = i12;
        this.d = obj;
        this.f4891b = i10;
        this.c = i11;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4890a) {
            case 0:
                ((ObservableInputStream.Observer) obj).data((byte[]) this.d, this.f4891b, this.c);
                return;
            case 1:
                ((Writer) obj).append((CharSequence) this.d, this.f4891b, this.c);
                return;
            case 2:
                ((Writer) obj).write((char[]) this.d, this.f4891b, this.c);
                return;
            default:
                ((Writer) obj).write((String) this.d, this.f4891b, this.c);
                return;
        }
    }
}
