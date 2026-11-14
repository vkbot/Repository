package n4;

import com.bumptech.glide.g;
import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends y {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile x0 PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        y.l(b.class, bVar);
    }

    public static void n(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.appVersion_ = str;
    }

    public static void o(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.timeZone_ = str;
    }

    public static void p(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.platformVersion_ = str;
    }

    public static void q(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.languageCode_ = str;
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.d();
    }

    @Override // com.google.protobuf.y
    public final Object e(int i10) {
        x0 x0Var;
        switch (g.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 3:
                return new b();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (b.class) {
                        try {
                            x0Var = PARSER;
                            if (x0Var == null) {
                                x0Var = new x(DEFAULT_INSTANCE);
                                PARSER = x0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return x0Var;
                }
                return x0Var2;
            default:
                androidx.navigation.b.a();
                return null;
        }
    }
}
