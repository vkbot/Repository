package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends y {
    private static final f DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile x0 PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        y.l(f.class, fVar);
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", b.class});
            case 3:
                return new f();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (f.class) {
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

    public final b n() {
        if (this.conditionCase_ == 2) {
            return (b) this.condition_;
        }
        return b.n();
    }

    public final d o() {
        int i10 = this.conditionCase_;
        d dVar = d.UNKNOWN_TRIGGER;
        if (i10 == 1) {
            int intValue = ((Integer) this.condition_).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        dVar = null;
                    } else {
                        dVar = d.ON_FOREGROUND;
                    }
                } else {
                    dVar = d.APP_LAUNCH;
                }
            }
            if (dVar == null) {
                return d.UNRECOGNIZED;
            }
        }
        return dVar;
    }
}
