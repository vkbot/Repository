package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3471b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ f(CharSequence charSequence, int i10) {
        this.f3471b = i10;
        this.c = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String splitToSequence$lambda$20$StringsKt__StringsKt;
        String splitToSequence$lambda$18$StringsKt__StringsKt;
        switch (this.f3471b) {
            case 0:
                splitToSequence$lambda$20$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$20$StringsKt__StringsKt(this.c, (IntRange) obj);
                return splitToSequence$lambda$20$StringsKt__StringsKt;
            default:
                splitToSequence$lambda$18$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$18$StringsKt__StringsKt(this.c, (IntRange) obj);
                return splitToSequence$lambda$18$StringsKt__StringsKt;
        }
    }
}
