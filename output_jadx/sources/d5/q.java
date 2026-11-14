package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q extends y {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final q DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile x0 PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private u body_;
    private p primaryActionButton_;
    private n primaryAction_;
    private p secondaryActionButton_;
    private n secondaryAction_;
    private u title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        y.l(q.class, qVar);
    }

    public static q p() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
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
                return new a1(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 3:
                return new q();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (q.class) {
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

    public final String n() {
        return this.backgroundHexColor_;
    }

    public final u o() {
        u uVar = this.body_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final String q() {
        return this.landscapeImageUrl_;
    }

    public final String r() {
        return this.portraitImageUrl_;
    }

    public final n s() {
        n nVar = this.primaryAction_;
        if (nVar == null) {
            return n.o();
        }
        return nVar;
    }

    public final p t() {
        p pVar = this.primaryActionButton_;
        if (pVar == null) {
            return p.o();
        }
        return pVar;
    }

    public final n u() {
        n nVar = this.secondaryAction_;
        if (nVar == null) {
            return n.o();
        }
        return nVar;
    }

    public final p v() {
        p pVar = this.secondaryActionButton_;
        if (pVar == null) {
            return p.o();
        }
        return pVar;
    }

    public final u w() {
        u uVar = this.title_;
        if (uVar == null) {
            return u.n();
        }
        return uVar;
    }

    public final boolean x() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }
}
