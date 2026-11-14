package f5;

import com.google.protobuf.a1;
import com.google.protobuf.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d0 extends com.google.protobuf.y {
    private static final d0 DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.y, f5.d0] */
    static {
        ?? yVar = new com.google.protobuf.y();
        DEFAULT_INSTANCE = yVar;
        com.google.protobuf.y.l(d0.class, yVar);
    }

    public static void n(d0 d0Var) {
        d0Var.value_ = 0L;
    }

    public static void o(d0 d0Var, long j10) {
        d0Var.startTimeEpoch_ = j10;
    }

    public static d0 p() {
        return DEFAULT_INSTANCE;
    }

    public static c0 s() {
        return (c0) DEFAULT_INSTANCE.d();
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 3:
                return new com.google.protobuf.y();
            case 4:
                return new com.google.protobuf.w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (d0.class) {
                        try {
                            x0Var = PARSER;
                            if (x0Var == null) {
                                x0Var = new com.google.protobuf.x(DEFAULT_INSTANCE);
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

    public final long q() {
        return this.startTimeEpoch_;
    }

    public final long r() {
        return this.value_;
    }
}
