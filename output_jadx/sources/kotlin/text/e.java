package kotlin.text;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3470b;

    public /* synthetic */ e(int i10) {
        this.f3470b = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3470b) {
            case 0:
                return StringsKt__IndentKt.a((String) obj);
            case 1:
                return StringsKt___StringsKt.i((CharSequence) obj);
            case 2:
                return StringsKt___StringsKt.h((CharSequence) obj);
            default:
                return StringsKt___StringsKt.j((CharSequence) obj);
        }
    }
}
