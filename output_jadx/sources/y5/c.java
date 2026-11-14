package y5;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;
import com.google.protobuf.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends y {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final c DEFAULT_INSTANCE;
    private static volatile x0 PARSER;
    private a0 alreadySeenCampaigns_ = z0.e;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        y.l(c.class, cVar);
    }

    public static void n(c cVar, a aVar) {
        int i10;
        cVar.getClass();
        a0 a0Var = cVar.alreadySeenCampaigns_;
        if (!((com.google.protobuf.b) a0Var).f1534b) {
            int size = a0Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            cVar.alreadySeenCampaigns_ = a0Var.c(i10);
        }
        cVar.alreadySeenCampaigns_.add(aVar);
    }

    public static c p() {
        return DEFAULT_INSTANCE;
    }

    public static b q() {
        return (b) DEFAULT_INSTANCE.d();
    }

    public static x0 r() {
        return (x0) DEFAULT_INSTANCE.e(7);
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", a.class});
            case 3:
                return new c();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (c.class) {
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

    public final a0 o() {
        return this.alreadySeenCampaigns_;
    }
}
