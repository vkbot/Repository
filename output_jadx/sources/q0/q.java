package q0;

import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final double f5236a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5237b;
    public final long c;
    public final Double d;
    public final Float e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f5238f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f5239g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5240h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5241i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5242j;

    /* renamed from: k, reason: collision with root package name */
    public final Float f5243k;

    /* renamed from: l, reason: collision with root package name */
    public final Float f5244l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5245m;

    public q(double d, double d10, long j10, Double d11, Float f8, Float f10, Float f11, int i10, int i11, int i12, Float f12, Float f13, String str) {
        this.f5236a = d;
        this.f5237b = d10;
        this.c = j10;
        this.d = d11;
        this.e = f8;
        this.f5238f = f10;
        this.f5239g = f11;
        this.f5240h = i10;
        this.f5241i = i11;
        this.f5242j = i12;
        this.f5243k = f12;
        this.f5244l = f13;
        this.f5245m = str;
    }

    public static q a(double d, double d10, long j10, Double d11, Float f8, Float f10, Float f11, int i10, int i11, int i12, Float f12, Float f13, String str) {
        long currentTimeMillis;
        String h2;
        if (d >= -90.0d && d <= 90.0d && d10 >= -180.0d && d10 <= 180.0d) {
            if (j10 > 0) {
                currentTimeMillis = j10;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (str != null && !str.trim().isEmpty()) {
                h2 = str;
            } else {
                h2 = e0.m.h(new byte[]{-59, -36, -44, 29, 88, -69, -121, -7, -57, -54}, new byte[]{-73, -71, -71, 114, 44, -34, -40, -98});
            }
            return new q(d, d10, currentTimeMillis, d11, f8, f10, f11, i10, i11, i12, f12, f13, h2);
        }
        throw new JSONException(e0.m.h(new byte[]{-1, -100, 109, 57, 114, 39, 14, -54, -43, -99, 116, 42, 122, 39, 4, -117, -62, -105, 104}, new byte[]{-74, -14, 27, 88, 30, 78, 106, -22}));
    }

    public static q b(String str) {
        double d;
        double d10;
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(e0.m.h(new byte[]{-122, 2, 57, 109}, new byte[]{-14, 123, 73, 8, -43, -56, -113, 124}), e0.m.h(new byte[]{92, -119, -64}, new byte[]{59, -7, -77, -49, 12, 36, 40, -4}));
        Double d11 = null;
        if (!e0.m.h(new byte[]{-40, -120, -14}, new byte[]{-65, -8, -127, 111, 105, 5, -29, -57}).equalsIgnoreCase(optString) && !e0.m.h(new byte[]{101, -34, -125, -87, 3, -124, -65, 106}, new byte[]{9, -79, -32, -56, 119, -19, -48, 4}).equalsIgnoreCase(optString)) {
            return null;
        }
        String h2 = e0.m.h(new byte[]{2, -127, 84}, new byte[]{110, -32, 32, -24, -53, -103, -31, -6});
        String h10 = e0.m.h(new byte[]{-113, -22, 29, 32, -74, -32, -71, -37}, new byte[]{-29, -117, 105, 73, -62, -107, -35, -66});
        if (jSONObject.has(h2)) {
            d = jSONObject.getDouble(h2);
        } else {
            d = jSONObject.getDouble(h10);
        }
        double d12 = d;
        String h11 = e0.m.h(new byte[]{-123, 96, 89}, new byte[]{-23, 15, 55, -114, 114, 79, -121, -38});
        String h12 = e0.m.h(new byte[]{-41, 33, -105, 40, 93, 40, 89, 72, -34}, new byte[]{-69, 78, -7, 79, 52, 92, 44, 44});
        if (jSONObject.has(h11)) {
            d10 = jSONObject.getDouble(h11);
        } else {
            d10 = jSONObject.getDouble(h12);
        }
        double d13 = d10;
        long optLong = jSONObject.optLong(e0.m.h(new byte[]{-82, -65, -41, 60}, new byte[]{-38, -42, -70, 89, -42, -50, 17, -98}), jSONObject.optLong(e0.m.h(new byte[]{-61, -7, 29, -17, 94, -33, -6, -79, -57}, new byte[]{-73, -112, 112, -118, 45, -85, -101, -36}), System.currentTimeMillis()));
        String h13 = e0.m.h(new byte[]{28, 114, 122, 84, 55, 66, -90, -67}, new byte[]{125, 30, 14, Base64.padSymbol, 67, 55, -62, -40});
        if (jSONObject.has(h13) && !jSONObject.isNull(h13)) {
            d11 = Double.valueOf(jSONObject.getDouble(h13));
        }
        return a(d12, d13, optLong, d11, c(jSONObject, e0.m.h(new byte[]{-16, 13, 35, -100, ByteCompanionObject.MAX_VALUE, -70, 20, -72}, new byte[]{-111, 110, 64, -23, 13, -37, 119, -63})), c(jSONObject, e0.m.h(new byte[]{86, 15, 60, 86, 123, 58, -84}, new byte[]{52, 106, 93, 36, 18, 84, -53, 51})), c(jSONObject, e0.m.h(new byte[]{70, 84, 11, -76, -3}, new byte[]{53, 36, 110, -47, -103, -9, 19, -95})), jSONObject.optInt(e0.m.h(new byte[]{94, 65, 115, 26, 66, 76, -37, -95, 72, 83}, new byte[]{45, 32, 7, ByteCompanionObject.MAX_VALUE, 46, 32, -78, -43}), 0), jSONObject.optInt(e0.m.h(new byte[]{118, 118, 73, 13, -13, 58, -97, 63, 96, 100, 107, 1, -20, 63, -108, 39, 96}, new byte[]{5, 23, Base64.padSymbol, 104, -97, 86, -10, 75}), 0), jSONObject.optInt(e0.m.h(new byte[]{-123, -14, -8, ByteCompanionObject.MAX_VALUE, -89, 12, 96, 39, -109, -32, -39, 105, -82, 4, 64, Base64.padSymbol, -80, -6, -12}, new byte[]{-10, -109, -116, 26, -53, 96, 9, 83}), 0), c(jSONObject, e0.m.h(new byte[]{-32, 113, -100, 12, 26, 117, -105}, new byte[]{-115, 20, -3, 98, 89, 27, -89, 124}), e0.m.h(new byte[]{-10, 12, 69, 60, -1, -107, -21, 43, -7, 33, 94}, new byte[]{-101, 105, 36, 82, -68, -5, -37, 111})), c(jSONObject, e0.m.h(new byte[]{46, 110, -64, 116, 88, 64}, new byte[]{67, 15, -72, 55, 54, 112, 9, 101}), e0.m.h(new byte[]{-107, -80, -83, 99, -67, -96, -51, -21, -80, -85}, new byte[]{-8, -47, -43, 32, -45, -112, -119, -119})), jSONObject.optString(e0.m.h(new byte[]{-123, 78, -121, 23, -47, 7, 19, 91}, new byte[]{-11, 60, -24, 97, -72, 99, 118, 41}), e0.m.h(new byte[]{-21, 68, 29, 9, -47, 113, 27, -58, -23, 82}, new byte[]{-103, 33, 112, 102, -91, 20, 68, -95})));
    }

    public static Float c(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                return Float.valueOf((float) jSONObject.getDouble(str));
            }
        }
        return null;
    }
}
