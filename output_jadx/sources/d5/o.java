package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o extends y {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile x0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private n action_;
    private int bitField0_;
    private u body_;
    private u title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        y.l(o.class, oVar);
    }

    public static o q() {
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 3:
                return new o();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (o.class) {
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

    public final String o() {
        return this.backgroundHexColor_;
    }

    public final u p() {
        u uVar = this.body_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final String r() {
        return this.imageUrl_;
    }

    public final u s() {
        u uVar = this.title_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final boolean t() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
