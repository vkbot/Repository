package i9;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2938b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        super(0);
        this.f2938b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2938b) {
            case 0:
                return new k((e9.b) ((Function1) ((android.support.v4.media.h) this.c).c).invoke((KClass) this.d));
            default:
                b0 b0Var = (b0) this.c;
                String str = (String) this.d;
                Enum[] enumArr = b0Var.f2868a;
                a0 a0Var = new a0(str, enumArr.length);
                for (Enum r02 : enumArr) {
                    String name = r02.name();
                    name.getClass();
                    int i10 = a0Var.d + 1;
                    a0Var.d = i10;
                    String[] strArr = a0Var.e;
                    strArr[i10] = name;
                    a0Var.f2895g[i10] = false;
                    a0Var.f2894f[i10] = null;
                    if (i10 == a0Var.c - 1) {
                        HashMap hashMap = new HashMap();
                        int length = strArr.length;
                        for (int i11 = 0; i11 < length; i11++) {
                            hashMap.put(strArr[i11], Integer.valueOf(i11));
                        }
                        a0Var.f2896h = hashMap;
                    }
                }
                return a0Var;
        }
    }
}
