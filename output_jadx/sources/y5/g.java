package y5;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.b0;
import com.google.protobuf.g0;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends y {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final g DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private n4.b clientSignals_;
    private e requestingClientApp_;
    private String projectNumber_ = "";
    private a0 alreadySeenCampaigns_ = z0.e;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        y.l(g.class, gVar);
    }

    public static void n(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.projectNumber_ = str;
    }

    public static void o(g gVar, a0 a0Var) {
        int i10;
        a0 a0Var2 = gVar.alreadySeenCampaigns_;
        if (!((com.google.protobuf.b) a0Var2).f1534b) {
            int size = a0Var2.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            gVar.alreadySeenCampaigns_ = a0Var2.c(i10);
        }
        List list = gVar.alreadySeenCampaigns_;
        Charset charset = b0.f1535a;
        a0Var.getClass();
        if (a0Var instanceof g0) {
            List y9 = ((g0) a0Var).y();
            g0 g0Var = (g0) list;
            int size2 = list.size();
            for (Object obj : y9) {
                if (obj == null) {
                    String str = "Element at index " + (g0Var.size() - size2) + " is null.";
                    for (int size3 = g0Var.size() - 1; size3 >= size2; size3--) {
                        g0Var.remove(size3);
                    }
                    n0.b.n(str);
                    return;
                }
                if (obj instanceof com.google.protobuf.g) {
                    g0Var.b((com.google.protobuf.g) obj);
                } else {
                    g0Var.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(a0Var.size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : a0Var) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                n0.b.n(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public static void p(g gVar, n4.b bVar) {
        gVar.getClass();
        gVar.clientSignals_ = bVar;
        gVar.bitField0_ |= 2;
    }

    public static void q(g gVar, e eVar) {
        gVar.getClass();
        gVar.requestingClientApp_ = eVar;
        gVar.bitField0_ |= 1;
    }

    public static g r() {
        return DEFAULT_INSTANCE;
    }

    public static f s() {
        return (f) DEFAULT_INSTANCE.d();
    }

    @Override // com.google.protobuf.y
    public final Object e(int i10) {
        x0 x0Var;
        switch (com.bumptech.glide.g.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", a.class, "clientSignals_"});
            case 3:
                return new g();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (g.class) {
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
