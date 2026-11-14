package org.apache.commons.io.build;

import org.apache.commons.io.build.AbstractSupplier;
import org.apache.commons.io.function.IOSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractSupplier<T, B extends AbstractSupplier<T, B>> implements IOSupplier<T> {
    public B asThis() {
        return this;
    }
}
