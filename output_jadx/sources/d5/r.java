package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends y {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final r DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile x0 PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        y.l(r.class, rVar);
    }

    public static r p() {
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", o.class, t.class, s.class, q.class});
            case 3:
                return new r();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (r.class) {
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

    public final o n() {
        if (this.messageDetailsCase_ == 1) {
            return (o) this.messageDetails_;
        }
        return o.q();
    }

    public final q o() {
        if (this.messageDetailsCase_ == 4) {
            return (q) this.messageDetails_;
        }
        return q.p();
    }

    public final s q() {
        if (this.messageDetailsCase_ == 3) {
            return (s) this.messageDetails_;
        }
        return s.o();
    }

    public final int r() {
        int i10 = this.messageDetailsCase_;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        i11 = 4;
                        if (i10 != 4) {
                            return 0;
                        }
                    }
                }
            }
            return i11;
        }
        return 5;
    }

    public final t s() {
        if (this.messageDetailsCase_ == 2) {
            return (t) this.messageDetails_;
        }
        return t.r();
    }
}
