package org.apache.commons.io.function;

import java.io.IOException;
import java.util.function.BiFunction;
import org.apache.commons.io.IOIndexedException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4840a;

    public /* synthetic */ b0(int i10) {
        this.f4840a = i10;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        IOException lambda$forAll$0;
        IOException lambda$forAll$10;
        switch (this.f4840a) {
            case 0:
                lambda$forAll$0 = IOStreams.lambda$forAll$0((Integer) obj, (IOException) obj2);
                return lambda$forAll$0;
            case 1:
                return new IOIndexedException(((Integer) obj).intValue(), (IOException) obj2);
            default:
                lambda$forAll$10 = IOStream.lambda$forAll$10((Integer) obj, (IOException) obj2);
                return lambda$forAll$10;
        }
    }
}
