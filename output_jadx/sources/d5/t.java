package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends y {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final t DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile x0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private p actionButton_;
    private n action_;
    private int bitField0_;
    private u body_;
    private u title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        y.l(t.class, tVar);
    }

    public static t r() {
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 3:
                return new t();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (t.class) {
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

    public final p o() {
        p pVar = this.actionButton_;
        if (pVar == null) {
            return p.o();
        }
        return pVar;
    }

    public final String p() {
        return this.backgroundHexColor_;
    }

    public final u q() {
        u uVar = this.body_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final String s() {
        return this.imageUrl_;
    }

    public final u t() {
        u uVar = this.title_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final boolean u() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
