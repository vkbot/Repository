package l9;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class q implements e0 {
    private final e0 delegate;

    public q(e0 e0Var) {
        e0Var.getClass();
        this.delegate = e0Var;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final e0 m1559deprecated_delegate() {
        return this.delegate;
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final e0 delegate() {
        return this.delegate;
    }

    @Override // l9.e0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // l9.e0
    public j0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // l9.e0
    public void write(l lVar, long j10) {
        lVar.getClass();
        this.delegate.write(lVar, j10);
    }
}
