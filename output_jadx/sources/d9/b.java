package d9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1859b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, c cVar, int i10) {
        super(1);
        this.f1859b = i10;
        this.c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1859b) {
            case 0:
                this.c.c(null);
                return Unit.INSTANCE;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f1862g;
                e eVar = this.c;
                atomicReferenceFieldUpdater.set(eVar, null);
                eVar.c(null);
                return Unit.INSTANCE;
        }
    }
}
