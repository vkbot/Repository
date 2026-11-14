package org.apache.commons.io.input;

import java.io.IOException;
import java.util.function.Supplier;
import org.apache.commons.io.output.BrokenWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOException f4883b;

    public /* synthetic */ c(IOException iOException, int i10) {
        this.f4882a = i10;
        this.f4883b = iOException;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Throwable lambda$new$1;
        switch (this.f4882a) {
            case 0:
                lambda$new$1 = BrokenInputStream.lambda$new$1(this.f4883b);
                return lambda$new$1;
            case 1:
                return BrokenReader.b(this.f4883b);
            default:
                return BrokenWriter.b(this.f4883b);
        }
    }
}
