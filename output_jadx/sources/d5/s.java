package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends y {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final s DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile x0 PARSER;
    private n action_;
    private int bitField0_;
    private String imageUrl_ = "";

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        y.l(s.class, sVar);
    }

    public static s o() {
        return DEFAULT_INSTANCE;
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
            case 3:
                return new s();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (s.class) {
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

    public final n n() {
        n nVar = this.action_;
        if (nVar == null) {
            return n.o();
        }
        return nVar;
    }

    public final String p() {
        return this.imageUrl_;
    }

    public final boolean q() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
