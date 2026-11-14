package kotlin.text;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3469b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f3469b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String prependIndent$lambda$5$StringsKt__IndentKt;
        String indentFunction$lambda$9$StringsKt__IndentKt;
        switch (this.f3469b) {
            case 0:
                prependIndent$lambda$5$StringsKt__IndentKt = StringsKt__IndentKt.prependIndent$lambda$5$StringsKt__IndentKt((String) this.c, (String) obj);
                return prependIndent$lambda$5$StringsKt__IndentKt;
            case 1:
                indentFunction$lambda$9$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$9$StringsKt__IndentKt((String) this.c, (String) obj);
                return indentFunction$lambda$9$StringsKt__IndentKt;
            default:
                return MatcherMatchResult$groups$1.d((MatcherMatchResult$groups$1) this.c, ((Integer) obj).intValue());
        }
    }
}
