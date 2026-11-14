package w8;

import a9.q;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import v8.h0;
import v8.y0;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c extends d {
    private volatile c _immediate;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6415b;
    public final boolean c;
    public final c d;

    public c(Handler handler, boolean z9) {
        c cVar;
        this.f6415b = handler;
        this.c = z9;
        if (z9) {
            cVar = this;
        } else {
            cVar = null;
        }
        this._immediate = cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, true);
            this._immediate = cVar2;
        }
        this.d = cVar2;
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f6415b.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            z0 z0Var = (z0) coroutineContext.get(y0.f6058b);
            if (z0Var != null) {
                z0Var.c(cancellationException);
            }
            h0.f6030b.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && ((c) obj).f6415b == this.f6415b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6415b);
    }

    @Override // v8.t
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        if (this.c && Intrinsics.areEqual(Looper.myLooper(), this.f6415b.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // v8.t
    public final String toString() {
        c cVar;
        String str;
        c9.d dVar = h0.f6029a;
        c cVar2 = q.f85a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.d;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f6415b.toString();
            if (this.c) {
                return ai.onnxruntime.a.C(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
