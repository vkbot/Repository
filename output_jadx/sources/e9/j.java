package e9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j extends Lambda implements Function2 {
    public static final j c;
    public static final j d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2215b;

    static {
        int i10 = 2;
        c = new j(i10, 0);
        d = new j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        super(i10);
        this.f2215b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2215b) {
            case 0:
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                kClass.getClass();
                list.getClass();
                ArrayList u8 = com.bumptech.glide.d.u(j9.c.f3352a, list, true);
                u8.getClass();
                return com.bumptech.glide.d.o(kClass, u8, new i(list, 0));
            default:
                KClass kClass2 = (KClass) obj;
                List list2 = (List) obj2;
                kClass2.getClass();
                list2.getClass();
                ArrayList u9 = com.bumptech.glide.d.u(j9.c.f3352a, list2, true);
                u9.getClass();
                b o5 = com.bumptech.glide.d.o(kClass2, u9, new i(list2, 1));
                if (o5 != null) {
                    return f9.a.a(o5);
                }
                return null;
        }
    }
}
