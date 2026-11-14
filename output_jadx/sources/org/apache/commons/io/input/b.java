package org.apache.commons.io.input;

import java.util.function.Supplier;
import org.apache.commons.io.output.BrokenWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f4881b;

    public /* synthetic */ b(int i10, Throwable th) {
        this.f4880a = i10;
        this.f4881b = th;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f4880a) {
            case 0:
                return BrokenInputStream.c(this.f4881b);
            case 1:
                return BrokenReader.y(this.f4881b);
            default:
                return BrokenWriter.c(this.f4881b);
        }
    }
}
