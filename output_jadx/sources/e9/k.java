package e9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class k extends Lambda implements Function1 {
    public static final k c;
    public static final k d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2216b;

    static {
        int i10 = 1;
        c = new k(i10, 0);
        d = new k(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f2216b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2216b) {
            case 0:
                KClass kClass = (KClass) obj;
                kClass.getClass();
                return com.bumptech.glide.d.t(kClass);
            default:
                KClass kClass2 = (KClass) obj;
                kClass2.getClass();
                b t = com.bumptech.glide.d.t(kClass2);
                if (t != null) {
                    return f9.a.a(t);
                }
                return null;
        }
    }
}
