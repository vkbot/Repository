package o7;

import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f3 extends n7.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4511a;

    static {
        boolean z9;
        if (!i4.d.a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"))) {
            z9 = true;
        } else {
            z9 = false;
        }
        f4511a = z9;
    }

    @Override // n7.k0
    public final String a() {
        return "pick_first";
    }

    @Override // n7.k0
    public final n7.j0 b(n7.e eVar) {
        if (f4511a) {
            return new a3(eVar);
        }
        return new e3(eVar);
    }

    @Override // n7.k0
    public final n7.y0 c(Map map) {
        try {
            return new n7.y0(new c3(p4.c("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new n7.y0(n7.f1.f4201m.g(e).h("Failed parsing configuration for pick_first"));
        }
    }
}
