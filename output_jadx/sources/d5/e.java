package d5;

import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends y {
    private static final e DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile x0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        y.l(e.class, eVar);
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 3:
                return new e();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (e.class) {
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
}
