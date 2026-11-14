package org.apache.commons.io.function;

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOLongSupplier {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long lambda$asSupplier$0() {
        return Uncheck.getAsLong(this);
    }

    default LongSupplier asSupplier() {
        return new LongSupplier() { // from class: org.apache.commons.io.function.u
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                long lambda$asSupplier$0;
                lambda$asSupplier$0 = IOLongSupplier.this.lambda$asSupplier$0();
                return lambda$asSupplier$0;
            }
        };
    }

    long getAsLong();
}
