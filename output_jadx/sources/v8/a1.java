package v8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a1 extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient z0 f6011b;

    public a1(String str, Throwable th, h1 h1Var) {
        super(str);
        this.f6011b = h1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                if (!Intrinsics.areEqual(a1Var.getMessage(), getMessage()) || !Intrinsics.areEqual(a1Var.f6011b, this.f6011b) || !Intrinsics.areEqual(a1Var.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i10;
        String message = getMessage();
        message.getClass();
        int hashCode = (this.f6011b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f6011b;
    }
}
