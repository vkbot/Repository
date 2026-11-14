package e9;

import i9.b1;
import i9.d1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2211b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        super(0);
        this.f2211b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f2211b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                g9.f b10 = com.bumptech.glide.c.b("e9.c", g9.c.d, new g9.e[0], new d9.h(1, eVar));
                KClass kClass = eVar.f2212a;
                kClass.getClass();
                return new g9.b(b10, kClass);
            case 1:
                return ((KType) ((ArrayList) obj).get(0)).getClassifier();
            case 2:
                g9.f fVar = (g9.f) obj;
                return Integer.valueOf(d1.e(fVar, fVar.f2513k));
            default:
                return com.bumptech.glide.c.b("kotlin.Unit", g9.j.f2519g, new g9.e[0], new d9.h(3, (b1) obj));
        }
    }
}
