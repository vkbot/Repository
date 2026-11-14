package kotlin.sequences;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3462b;

    public /* synthetic */ d(int i10) {
        this.f3462b = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3462b) {
            case 0:
                return SequencesKt___SequencesKt.n(obj, obj2);
            default:
                return SequencesKt___SequencesKt.j(obj, obj2);
        }
    }
}
