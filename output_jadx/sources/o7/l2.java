package o7;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4608b;
    public final Map c;
    public final d4 d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4609f;

    public l2(j2 j2Var, HashMap hashMap, HashMap hashMap2, d4 d4Var, Object obj, Map map) {
        Map map2;
        this.f4607a = j2Var;
        this.f4608b = Collections.unmodifiableMap(new HashMap(hashMap));
        this.c = Collections.unmodifiableMap(new HashMap(hashMap2));
        this.d = d4Var;
        this.e = obj;
        if (map != null) {
            map2 = Collections.unmodifiableMap(new HashMap(map));
        } else {
            map2 = null;
        }
        this.f4609f = map2;
    }

    public static l2 a(Map map, boolean z9, int i10, int i11, Object obj) {
        d4 d4Var;
        Map j10;
        boolean z10;
        Map j11;
        boolean z11;
        boolean z12;
        d4 d4Var2;
        if (z9) {
            if (map == null || (j11 = p4.j("retryThrottling", map)) == null) {
                d4Var2 = null;
            } else {
                float floatValue = p4.h("maxTokens", j11).floatValue();
                float floatValue2 = p4.h("tokenRatio", j11).floatValue();
                if (floatValue > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o4.b.m(z11, "maxToken should be greater than zero");
                if (floatValue2 > 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o4.b.m(z12, "tokenRatio should be greater than zero");
                d4Var2 = new d4(floatValue, floatValue2);
            }
            d4Var = d4Var2;
        } else {
            d4Var = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (map == null) {
            j10 = null;
        } else {
            j10 = p4.j("healthCheckConfig", map);
        }
        List<Map> d = p4.d("methodConfig", map);
        if (d == null) {
            d = null;
        } else {
            p4.a(d);
        }
        if (d == null) {
            return new l2(null, hashMap, hashMap2, d4Var, obj, j10);
        }
        j2 j2Var = null;
        for (Map map2 : d) {
            j2 j2Var2 = new j2(map2, z9, i10, i11);
            List<Map> d10 = p4.d("name", map2);
            if (d10 == null) {
                d10 = null;
            } else {
                p4.a(d10);
            }
            if (d10 != null && !d10.isEmpty()) {
                for (Map map3 : d10) {
                    String k6 = p4.k(NotificationCompat.CATEGORY_SERVICE, map3);
                    String k10 = p4.k("method", map3);
                    if (i4.d.a(k6)) {
                        o4.b.e("missing service name for method %s", i4.d.a(k10), k10);
                        if (j2Var == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o4.b.e("Duplicate default method config in service config %s", z10, map);
                        j2Var = j2Var2;
                    } else if (i4.d.a(k10)) {
                        o4.b.e("Duplicate service %s", !hashMap2.containsKey(k6), k6);
                        hashMap2.put(k6, j2Var2);
                    } else {
                        String a10 = n7.x0.a(k6, k10);
                        o4.b.e("Duplicate method name %s", !hashMap.containsKey(a10), a10);
                        hashMap.put(a10, j2Var2);
                    }
                }
            }
        }
        return new l2(j2Var, hashMap, hashMap2, d4Var, obj, j10);
    }

    public final k2 b() {
        if (this.c.isEmpty() && this.f4608b.isEmpty() && this.f4607a == null) {
            return null;
        }
        return new k2(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2.class == obj.getClass()) {
            l2 l2Var = (l2) obj;
            if (com.bumptech.glide.d.f(this.f4607a, l2Var.f4607a) && com.bumptech.glide.d.f(this.f4608b, l2Var.f4608b) && com.bumptech.glide.d.f(this.c, l2Var.c) && com.bumptech.glide.d.f(this.d, l2Var.d) && com.bumptech.glide.d.f(this.e, l2Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4607a, this.f4608b, this.c, this.d, this.e});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4607a, "defaultMethodConfig");
        t.c(this.f4608b, "serviceMethodMap");
        t.c(this.c, "serviceMap");
        t.c(this.d, "retryThrottling");
        t.c(this.e, "loadBalancingConfig");
        return t.toString();
    }
}
