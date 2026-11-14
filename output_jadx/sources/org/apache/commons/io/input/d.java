package org.apache.commons.io.input;

import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.input.CharSequenceInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements IOSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4884b;
    public final /* synthetic */ CharSequenceInputStream.Builder c;

    public /* synthetic */ d(CharSequenceInputStream.Builder builder, int i10) {
        this.f4884b = i10;
        this.c = builder;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final Object get() {
        CharSequence charSequence;
        CharSequenceInputStream lambda$get$0;
        switch (this.f4884b) {
            case 0:
                charSequence = this.c.getCharSequence();
                return charSequence;
            default:
                lambda$get$0 = this.c.lambda$get$0();
                return lambda$get$0;
        }
    }
}
