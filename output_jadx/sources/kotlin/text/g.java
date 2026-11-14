package kotlin.text;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3472b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z9, int i10) {
        this.f3472b = i10;
        this.d = obj;
        this.c = z9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3472b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return StringsKt__StringsKt.f((char[]) this.d, this.c, (CharSequence) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return StringsKt__StringsKt.d((List) this.d, this.c, (CharSequence) obj, intValue2);
        }
    }
}
