package o7;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: g, reason: collision with root package name */
    public static final a9.w f4559g = new a9.w("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 3);

    /* renamed from: a, reason: collision with root package name */
    public final Long f4560a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f4561b;
    public final Integer c;
    public final Integer d;
    public final e4 e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f4562f;

    public j2(Map map, boolean z9, int i10, int i11) {
        Map map2;
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        e4 e4Var;
        Map map3;
        boolean z18;
        boolean z19;
        a1 a1Var;
        boolean z20;
        boolean z21;
        this.f4560a = p4.l("timeout", map);
        this.f4561b = p4.c("waitForReady", map);
        Integer i12 = p4.i("maxResponseMessageBytes", map);
        this.c = i12;
        if (i12 != null) {
            if (i12.intValue() >= 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            o4.b.e("maxInboundMessageSize %s exceeds bounds", z21, i12);
        }
        Integer i13 = p4.i("maxRequestMessageBytes", map);
        this.d = i13;
        if (i13 != null) {
            if (i13.intValue() >= 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            o4.b.e("maxOutboundMessageSize %s exceeds bounds", z20, i13);
        }
        if (z9) {
            map2 = p4.j("retryPolicy", map);
        } else {
            map2 = null;
        }
        if (map2 == null) {
            j10 = 0;
            e4Var = null;
            z13 = true;
        } else {
            Integer i14 = p4.i("maxAttempts", map2);
            o4.b.i(i14, "maxAttempts cannot be empty");
            int intValue = i14.intValue();
            if (intValue >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            o4.b.c(intValue, "maxAttempts must be greater than 1: %s", z10);
            int min = Math.min(intValue, i10);
            Long l10 = p4.l("initialBackoff", map2);
            o4.b.i(l10, "initialBackoff cannot be empty");
            long longValue = l10.longValue();
            if (longValue > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            o4.b.g(z11, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long l11 = p4.l("maxBackoff", map2);
            o4.b.i(l11, "maxBackoff cannot be empty");
            long longValue2 = l11.longValue();
            if (longValue2 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            j10 = 0;
            z13 = true;
            o4.b.g(z12, "maxBackoff must be greater than 0: %s", longValue2);
            Double h2 = p4.h("backoffMultiplier", map2);
            o4.b.i(h2, "backoffMultiplier cannot be empty");
            double doubleValue = h2.doubleValue();
            if (doubleValue > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            o4.b.e("backoffMultiplier must be greater than 0: %s", z14, h2);
            Long l12 = p4.l("perAttemptRecvTimeout", map2);
            if (l12 != null && l12.longValue() < 0) {
                z15 = false;
            } else {
                z15 = true;
            }
            o4.b.e("perAttemptRecvTimeout cannot be negative: %s", z15, l12);
            Set e = p4.e("retryableStatusCodes", map2);
            if (e != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            y5.k.z("%s is required in retry policy", z16, "retryableStatusCodes");
            y5.k.z("%s must not contain OK", !e.contains(n7.e1.OK), "retryableStatusCodes");
            if (l12 == null && e.isEmpty()) {
                z17 = false;
            } else {
                z17 = true;
            }
            o4.b.d("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", z17);
            e4Var = new e4(min, longValue, longValue2, doubleValue, l12, e);
        }
        this.e = e4Var;
        if (z9) {
            map3 = p4.j("hedgingPolicy", map);
        } else {
            map3 = null;
        }
        if (map3 == null) {
            a1Var = null;
        } else {
            Integer i15 = p4.i("maxAttempts", map3);
            o4.b.i(i15, "maxAttempts cannot be empty");
            int intValue2 = i15.intValue();
            if (intValue2 >= 2) {
                z18 = z13;
            } else {
                z18 = false;
            }
            o4.b.c(intValue2, "maxAttempts must be greater than 1: %s", z18);
            int min2 = Math.min(intValue2, i11);
            Long l13 = p4.l("hedgingDelay", map3);
            o4.b.i(l13, "hedgingDelay cannot be empty");
            long longValue3 = l13.longValue();
            if (longValue3 >= j10) {
                z19 = z13;
            } else {
                z19 = false;
            }
            o4.b.g(z19, "hedgingDelay must not be negative: %s", longValue3);
            Set e6 = p4.e("nonFatalStatusCodes", map3);
            if (e6 == null) {
                e6 = Collections.unmodifiableSet(EnumSet.noneOf(n7.e1.class));
            } else {
                y5.k.z("%s must not contain OK", !e6.contains(n7.e1.OK), "nonFatalStatusCodes");
            }
            a1Var = new a1(min2, longValue3, e6);
        }
        this.f4562f = a1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (!com.bumptech.glide.d.f(this.f4560a, j2Var.f4560a) || !com.bumptech.glide.d.f(this.f4561b, j2Var.f4561b) || !com.bumptech.glide.d.f(this.c, j2Var.c) || !com.bumptech.glide.d.f(this.d, j2Var.d) || !com.bumptech.glide.d.f(this.e, j2Var.e) || !com.bumptech.glide.d.f(this.f4562f, j2Var.f4562f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4560a, this.f4561b, this.c, this.d, this.e, this.f4562f});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4560a, "timeoutNanos");
        t.c(this.f4561b, "waitForReady");
        t.c(this.c, "maxInboundMessageSize");
        t.c(this.d, "maxOutboundMessageSize");
        t.c(this.e, "retryPolicy");
        t.c(this.f4562f, "hedgingPolicy");
        return t.toString();
    }
}
