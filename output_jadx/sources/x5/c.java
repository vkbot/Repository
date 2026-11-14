package x5;

import com.bumptech.glide.g;
import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.o0;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import d5.f;
import d5.r;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends y {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile x0 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private r content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private d5.c priority_;
    private int payloadCase_ = 0;
    private o0 dataBundle_ = o0.c;
    private a0 triggeringConditions_ = z0.e;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        y.l(c.class, cVar);
    }

    @Override // com.google.protobuf.y
    public final Object e(int i10) {
        x0 x0Var;
        switch (g.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", d.class, a.class, "content_", "priority_", "triggeringConditions_", f.class, "isTestCampaign_", "dataBundle_", b.f6497a});
            case 3:
                return new c();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (c.class) {
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

    public final r n() {
        r rVar = this.content_;
        if (rVar == null) {
            return r.p();
        }
        return rVar;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.dataBundle_);
    }

    public final a p() {
        if (this.payloadCase_ == 2) {
            return (a) this.payload_;
        }
        return a.r();
    }

    public final boolean q() {
        return this.isTestCampaign_;
    }

    public final int r() {
        int i10 = this.payloadCase_;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 0;
                }
            }
            return i11;
        }
        return 3;
    }

    public final d5.c s() {
        d5.c cVar = this.priority_;
        if (cVar == null) {
            return d5.c.n();
        }
        return cVar;
    }

    public final a0 t() {
        return this.triggeringConditions_;
    }

    public final d u() {
        if (this.payloadCase_ == 1) {
            return (d) this.payload_;
        }
        return d.r();
    }
}
