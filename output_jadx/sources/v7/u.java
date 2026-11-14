package v7;

import java.util.List;
import java.util.Map;
import n7.f1;
import n7.j0;
import n7.k0;
import n7.l0;
import n7.y0;
import o7.o4;
import o7.p4;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends k0 {
    public static y0 d(Map map) {
        Long l10;
        Long l11;
        Long l12;
        Integer num;
        n nVar;
        n nVar2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num2;
        Integer num3;
        boolean z13;
        boolean z14;
        boolean z15;
        Integer num4 = 5;
        Integer num5 = 100;
        Long l13 = p4.l("interval", map);
        Long l14 = p4.l("baseEjectionTime", map);
        Long l15 = p4.l("maxEjectionTime", map);
        Integer i10 = p4.i("maxEjectionPercentage", map);
        Long valueOf = Long.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        if (l13 != null) {
            l10 = l13;
        } else {
            l10 = valueOf;
        }
        if (l14 != null) {
            l11 = l14;
        } else {
            l11 = 30000000000L;
        }
        if (l15 != null) {
            l12 = l15;
        } else {
            l12 = 300000000000L;
        }
        if (i10 != null) {
            num = i10;
        } else {
            num = 10;
        }
        Map j10 = p4.j("successRateEjection", map);
        List list = null;
        if (j10 != null) {
            Integer num6 = 1900;
            Integer i11 = p4.i("stdevFactor", j10);
            Integer i12 = p4.i("enforcementPercentage", j10);
            Integer i13 = p4.i("minimumHosts", j10);
            Integer i14 = p4.i("requestVolume", j10);
            if (i11 != null) {
                num6 = i11;
            }
            if (i12 != null) {
                if (i12.intValue() >= 0 && i12.intValue() <= 100) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                o4.b.f(z15);
                num2 = i12;
            } else {
                num2 = num5;
            }
            if (i13 != null) {
                if (i13.intValue() >= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                o4.b.f(z14);
                num3 = i13;
            } else {
                num3 = num4;
            }
            if (i14 != null) {
                if (i14.intValue() >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                o4.b.f(z13);
            } else {
                i14 = num5;
            }
            nVar = new n(num6, num2, num3, i14);
        } else {
            nVar = null;
        }
        Map j11 = p4.j("failurePercentageEjection", map);
        if (j11 != null) {
            Integer num7 = 85;
            Integer num8 = 50;
            Integer i15 = p4.i("threshold", j11);
            Integer i16 = p4.i("enforcementPercentage", j11);
            Integer i17 = p4.i("minimumHosts", j11);
            Integer i18 = p4.i("requestVolume", j11);
            if (i15 != null) {
                if (i15.intValue() >= 0 && i15.intValue() <= 100) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o4.b.f(z12);
                num7 = i15;
            }
            if (i16 != null) {
                if (i16.intValue() >= 0 && i16.intValue() <= 100) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o4.b.f(z11);
                num5 = i16;
            }
            if (i17 != null) {
                if (i17.intValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o4.b.f(z10);
                num4 = i17;
            }
            if (i18 != null) {
                if (i18.intValue() >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o4.b.f(z9);
                num8 = i18;
            }
            nVar2 = new n(num7, num5, num4, num8);
        } else {
            nVar2 = null;
        }
        List d = p4.d("childPolicy", map);
        if (d != null) {
            p4.a(d);
            list = d;
        }
        List s5 = p4.s(list);
        if (s5 != null && !s5.isEmpty()) {
            y0 r = p4.r(s5, l0.a());
            if (r.f4259a != null) {
                return r;
            }
            o4 o4Var = (o4) r.f4260b;
            if (o4Var != null) {
                if (o4Var != null) {
                    return new y0(new o(l10, l11, l12, num, nVar, nVar2, o4Var));
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        return new y0(f1.f4200l.h("No child policy in outlier_detection_experimental LB policy: " + map));
    }

    @Override // n7.k0
    public final String a() {
        return "outlier_detection_experimental";
    }

    @Override // n7.k0
    public final j0 b(n7.e eVar) {
        return new t(eVar);
    }

    @Override // n7.k0
    public final y0 c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e) {
            return new y0(f1.f4201m.g(e).h("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
