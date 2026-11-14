package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w0 extends b1 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6055g = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_invoked");

    @Volatile
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f6056f;

    public w0(Function1 function1) {
        this.f6056f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // v8.d1
    public final void j(Throwable th) {
        if (f6055g.compareAndSet(this, 0, 1)) {
            this.f6056f.invoke(th);
        }
    }
}
