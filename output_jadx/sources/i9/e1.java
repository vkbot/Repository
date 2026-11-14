package i9;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e1 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2887b;
    public final /* synthetic */ f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, int i10) {
        super(0);
        this.f2887b = i10;
        this.c = f1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList;
        int i10 = this.f2887b;
        f1 f1Var = this.c;
        switch (i10) {
            case 0:
                return Integer.valueOf(d1.e(f1Var, (g9.e[]) f1Var.f2898j.getValue()));
            case 1:
                i0 i0Var = f1Var.f2893b;
                if (i0Var != null) {
                    return new e9.b[]{i0Var.f2906a};
                }
                return d1.f2880b;
            default:
                if (f1Var.f2893b != null) {
                    arrayList = new ArrayList(0);
                } else {
                    arrayList = null;
                }
                return d1.c(arrayList);
        }
    }
}
