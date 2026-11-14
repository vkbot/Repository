package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import m4.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    private ResolvableFuture() {
    }

    public static <V> ResolvableFuture<V> create() {
        return new ResolvableFuture<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(@Nullable V v9) {
        return super.set(v9);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(o oVar) {
        return super.setFuture(oVar);
    }
}
