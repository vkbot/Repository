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
public final class i extends y {
    private static final i DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile x0 PARSER;
    private long expirationEpochTimestampMillis_;
    private a0 messages_ = z0.e;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        y.l(i.class, iVar);
    }

    public static void n(i iVar, long j10) {
        iVar.expirationEpochTimestampMillis_ = j10;
    }

    public static i o() {
        return DEFAULT_INSTANCE;
    }

    public static h r() {
        return (h) DEFAULT_INSTANCE.d();
    }

    public static x0 s() {
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", x5.c.class, "expirationEpochTimestampMillis_"});
            case 3:
                return new i();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (i.class) {
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

    public final long p() {
        return this.expirationEpochTimestampMillis_;
    }

    public final a0 q() {
        return this.messages_;
    }
}
