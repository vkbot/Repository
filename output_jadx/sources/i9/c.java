package i9;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c extends n0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g9.e eVar, int i10) {
        super(eVar);
        this.f2874b = i10;
    }

    @Override // g9.e
    public final String a() {
        switch (this.f2874b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
