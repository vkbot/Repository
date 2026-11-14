package kotlin.collections;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3436b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3436b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3436b) {
            case 0:
                return ArraysKt___ArraysKt.d((Object[]) this.c);
            case 1:
                return ArraysKt___ArraysKt.c((int[]) this.c);
            case 2:
                return ArraysKt___ArraysKt.e((double[]) this.c);
            case 3:
                return ArraysKt___ArraysKt.h((char[]) this.c);
            case 4:
                return ArraysKt___ArraysKt.i((short[]) this.c);
            case 5:
                return ArraysKt___ArraysKt.b((float[]) this.c);
            case 6:
                return ArraysKt___ArraysKt.g((boolean[]) this.c);
            case 7:
                return ArraysKt___ArraysKt.a((long[]) this.c);
            case 8:
                return ArraysKt___ArraysKt.f((byte[]) this.c);
            default:
                return CollectionsKt___CollectionsKt.b((Iterable) this.c);
        }
    }
}
