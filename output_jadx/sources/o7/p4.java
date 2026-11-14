package o7;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final n7.a f4664a = new n7.a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* renamed from: b, reason: collision with root package name */
    public static final n7.a f4665b = new n7.a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
    }

    public static r1 b() {
        if (l3.e == null) {
            return new l3();
        }
        return new f(0);
    }

    public static Boolean c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List d(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static Set e(String str, Map map) {
        n7.e1 valueOf;
        boolean z9;
        List d = d(str, map);
        if (d == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(n7.e1.class);
        for (Object obj : d) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                boolean z10 = false;
                if (intValue == d10.doubleValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                y5.k.z("Status code %s is not integral", z9, obj);
                valueOf = n7.f1.d(intValue).f4204a;
                if (valueOf.f4189b == d10.intValue()) {
                    z10 = true;
                }
                y5.k.z("Status code %s is not valid", z10, obj);
            } else if (obj instanceof String) {
                try {
                    valueOf = n7.e1.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new a8.a("Status code " + obj + " is not valid", 1, e);
                }
            } else {
                StringBuilder sb = new StringBuilder("Can not convert status code ");
                sb.append(obj);
                Class<?> cls = obj.getClass();
                sb.append(" to Status.Code, because its type is ");
                sb.append(cls);
                throw new a8.a(sb.toString(), 1);
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List f(String str, Map map) {
        List d = d(str, map);
        if (d == null) {
            return null;
        }
        for (int i10 = 0; i10 < d.size(); i10++) {
            if (!(d.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", d.get(i10), Integer.valueOf(i10), d));
            }
        }
        return d;
    }

    public static List g(Map map) {
        String k6;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List d = d("loadBalancingConfig", map);
            if (d == null) {
                d = null;
            } else {
                a(d);
            }
            arrayList.addAll(d);
        }
        if (arrayList.isEmpty() && (k6 = k("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(k6.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Double h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                n0.b.v("value '%s' for key '%s' is not a double", new Object[]{obj, str});
                return null;
            }
        }
        n0.b.v("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
        return null;
    }

    public static Integer i(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d = (Double) obj;
            int intValue = d.intValue();
            if (intValue == d.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d);
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                n0.b.v("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
        }
        n0.b.v("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
        return null;
    }

    public static Map j(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String k(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long l(String str, Map map) {
        String k6 = k(str, map);
        if (k6 == null) {
            return null;
        }
        try {
            return Long.valueOf(n(k6));
        } catch (ParseException e) {
            n0.b.w(e);
            return null;
        }
    }

    public static long m(int i10, long j10) {
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11 = i10;
        long j12 = i11;
        boolean z12 = true;
        if (j12 > -1000000000 && j12 < 1000000000) {
            j11 = j10;
        } else {
            long j13 = j12 / 1000000000;
            j11 = j10 + j13;
            if ((j10 ^ j13) < 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((j10 ^ j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 | z10) {
                i11 = (int) (j12 % 1000000000);
            } else {
                StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
                sb.append(j10);
                sb.append(", ");
                throw new ArithmeticException(ai.onnxruntime.a.n(sb, j13, ")"));
            }
        }
        if (j11 > 0 && i11 < 0) {
            i11 = (int) (i11 + 1000000000);
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 = (int) (i11 - 1000000000);
            j11++;
        }
        if (j11 >= -315576000000L && j11 <= 315576000000L) {
            long j14 = i11;
            if (j14 >= -999999999 && j14 < 1000000000 && ((j11 >= 0 && i11 >= 0) || (j11 <= 0 && i11 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j11);
                long j15 = i11;
                long j16 = nanos + j15;
                if ((j15 ^ nanos) < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((nanos ^ j16) < 0) {
                    z12 = false;
                }
                if (z11 | z12) {
                    return j16;
                }
                return ((j16 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j11 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i11 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long n(String str) {
        boolean z9;
        String str2;
        int i10;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z9 = true;
            } else {
                z9 = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            if (str2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (int i11 = 0; i11 < 9; i11++) {
                    i10 *= 10;
                    if (i11 < str2.length()) {
                        if (str2.charAt(i11) >= '0' && str2.charAt(i11) <= '9') {
                            i10 = (str2.charAt(i11) - '0') + i10;
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
            }
            if (parseLong >= 0) {
                if (z9) {
                    parseLong = -parseLong;
                    i10 = -i10;
                }
                try {
                    return m(i10, parseLong);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        throw new ParseException("Invalid duration string: ".concat(str), 0);
    }

    public static n7.y0 r(List list, n7.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n4 n4Var = (n4) it.next();
            String str = n4Var.f4625a;
            n7.k0 b10 = l0Var.b(str);
            if (b10 == null) {
                arrayList.add(str);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(p4.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                n7.y0 c = b10.c(n4Var.f4626b);
                if (c.f4259a != null) {
                    return c;
                }
                return new n7.y0(new o4(b10, c.f4260b));
            }
        }
        return new n7.y0(n7.f1.f4195g.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List s(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() == 1) {
                String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
                arrayList.add(new n4(str, j(str, map)));
            } else {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract int o();

    public abstract boolean p(m4 m4Var);

    public abstract void q(m4 m4Var);
}
