package l9;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class r implements g0 {
    private final g0 delegate;

    public r(g0 g0Var) {
        g0Var.getClass();
        this.delegate = g0Var;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final g0 m1560deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final g0 delegate() {
        return this.delegate;
    }

    @Override // l9.g0
    public long read(l lVar, long j10) {
        lVar.getClass();
        return this.delegate.read(lVar, j10);
    }

    @Override // l9.g0
    public j0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
