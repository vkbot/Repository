package org.apache.commons.io.input;

import java.io.Closeable;
import org.apache.commons.io.function.IOIntConsumer;
import org.apache.commons.io.output.UncheckedFilterOutputStream;
import org.apache.commons.io.output.UncheckedFilterWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements IOIntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f4897b;

    public /* synthetic */ m(Closeable closeable, int i10) {
        this.f4896a = i10;
        this.f4897b = closeable;
    }

    @Override // org.apache.commons.io.function.IOIntConsumer
    public final void accept(int i10) {
        switch (this.f4896a) {
            case 0:
                ((UncheckedBufferedReader) this.f4897b).lambda$mark$1(i10);
                return;
            case 1:
                ((UncheckedFilterReader) this.f4897b).lambda$mark$1(i10);
                return;
            case 2:
                ((UncheckedFilterOutputStream) this.f4897b).lambda$write$4(i10);
                return;
            default:
                ((UncheckedFilterWriter) this.f4897b).lambda$write$7(i10);
                return;
        }
    }
}
