package q0;

import org.json.JSONException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5215a;

    /* renamed from: b, reason: collision with root package name */
    public Double f5216b;
    public Double c;
    public Double d;
    public Float e;

    /* renamed from: f, reason: collision with root package name */
    public Float f5217f;

    /* renamed from: g, reason: collision with root package name */
    public Float f5218g;

    /* renamed from: h, reason: collision with root package name */
    public int f5219h;

    /* renamed from: i, reason: collision with root package name */
    public long f5220i;

    public n(String str) {
        this.f5215a = str;
    }

    public static String b(String[] strArr, int i10) {
        String str;
        if (i10 >= 0 && i10 < strArr.length && (str = strArr[i10]) != null) {
            return str;
        }
        return "";
    }

    public static Double d(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            try {
                double parseDouble = Double.parseDouble(str);
                double d = (int) (parseDouble / 100.0d);
                double d10 = ((parseDouble - (100.0d * d)) / 60.0d) + d;
                if (e0.m.h(new byte[]{68}, new byte[]{23, -123, -68, 116, 35, -123, 29, -55}).equalsIgnoreCase(str2) || e0.m.h(new byte[]{55}, new byte[]{96, 125, -84, -95, 59, -4, -126, -110}).equalsIgnoreCase(str2)) {
                    d10 = -d10;
                }
                return Double.valueOf(d10);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Float e(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return Float.valueOf(Float.parseFloat(str));
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final q a() {
        Double d = this.f5216b;
        if (d != null && this.c != null) {
            try {
                double doubleValue = d.doubleValue();
                double doubleValue2 = this.c.doubleValue();
                long j10 = this.f5220i;
                if (j10 <= 0) {
                    j10 = System.currentTimeMillis();
                }
                long j11 = j10;
                Double d10 = this.d;
                Float f8 = this.e;
                Float f10 = this.f5217f;
                Float f11 = this.f5218g;
                int i10 = this.f5219h;
                return q.a(doubleValue, doubleValue2, j11, d10, f8, f10, f11, i10, i10, i10, null, null, this.f5215a);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r10 == r8) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q0.q c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.n.c(java.lang.String):q0.q");
    }
}
