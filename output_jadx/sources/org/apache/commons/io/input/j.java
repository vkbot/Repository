package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ObservableInputStream;
import org.apache.commons.io.output.ProxyOutputStream;
import org.apache.commons.io.output.ProxyWriter;
import org.apache.commons.io.output.UncheckedFilterOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4893b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f4892a = i10;
        this.f4893b = obj;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4892a) {
            case 0:
                ObservableInputStream.c((IOException) this.f4893b, (ObservableInputStream.Observer) obj);
                return;
            case 1:
                ((ProxyInputStream) this.f4893b).handleIOException((IOException) obj);
                return;
            case 2:
                XmlStreamReader.b((StringBuilder) this.f4893b, (String) obj);
                return;
            case 3:
                ((Writer) obj).write((String) this.f4893b);
                return;
            case 4:
                ((Writer) obj).append((CharSequence) this.f4893b);
                return;
            case 5:
                ((Writer) obj).write((char[]) this.f4893b);
                return;
            case 6:
                ((ProxyOutputStream) this.f4893b).handleIOException((IOException) obj);
                return;
            case 7:
                ((ProxyWriter) this.f4893b).handleIOException((IOException) obj);
                return;
            default:
                ((UncheckedFilterOutputStream) this.f4893b).lambda$write$2((byte[]) obj);
                return;
        }
    }
}
