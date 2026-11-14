package v8;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j0 implements l1, Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6035b;
    public final Object c;

    public /* synthetic */ j0(int i10, Object obj) {
        this.f6035b = i10;
        this.c = obj;
    }

    public final void a(Throwable th) {
        switch (this.f6035b) {
            case 0:
                ((y8.o) this.c).dispose();
                return;
            default:
                ((Function1) this.c).invoke(th);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f6035b) {
            case 0:
                a((Throwable) obj);
                return Unit.INSTANCE;
            default:
                a((Throwable) obj);
                return Unit.INSTANCE;
        }
    }

    public final String toString() {
        switch (this.f6035b) {
            case 0:
                return "DisposeOnCancel[" + ((y8.o) this.c) + ']';
            default:
                return "InvokeOnCancel[" + ((Function1) this.c).getClass().getSimpleName() + '@' + a0.a(this) + ']';
        }
    }
}
