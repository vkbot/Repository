package kotlin.collections.unsigned;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3438b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3438b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3438b) {
            case 0:
                return UArraysKt___UArraysKt.a((int[]) this.c);
            case 1:
                return UArraysKt___UArraysKt.d((long[]) this.c);
            case 2:
                return UArraysKt___UArraysKt.c((byte[]) this.c);
            default:
                return UArraysKt___UArraysKt.b((short[]) this.c);
        }
    }
}
