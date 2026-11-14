package x5;

import com.bumptech.glide.g;
import com.google.protobuf.a1;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.x0;
import com.google.protobuf.y;
import d5.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends y {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final a DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile x0 PARSER;
    private int bitField0_;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private i experimentPayload_;

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        y.l(a.class, aVar);
    }

    public static a r() {
        return DEFAULT_INSTANCE;
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
                return new a1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 3:
                return new a();
            case 4:
                return new w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (a.class) {
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

    public final long n() {
        return this.campaignEndTimeMillis_;
    }

    public final String o() {
        return this.campaignId_;
    }

    public final String p() {
        return this.campaignName_;
    }

    public final long q() {
        return this.campaignStartTimeMillis_;
    }

    public final i s() {
        i iVar = this.experimentPayload_;
        if (iVar == null) {
            return i.n();
        }
        return iVar;
    }
}
