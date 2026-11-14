package d5;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;
import com.google.protobuf.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends y {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile x0 PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private a0 triggerParams_ = z0.e;
    private String name_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        y.l(b.class, bVar);
    }

    public static b n() {
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", e.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 3:
                return new b();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (b.class) {
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

    public final String o() {
        return this.name_;
    }
}
