package j7;

import e0.m;
import j1.i;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3320b;

    public a(double d, double d10) {
        if (Double.isFinite(d) && Double.isFinite(d10) && Math.abs(d) <= 90.0d && Math.abs(d10) <= 180.0d) {
            this.f3319a = d;
            this.f3320b = d10;
        } else {
            i.k(m.h(new byte[]{104, -37, 5, 107, -11, -55, 68, -106, 105, -58, 4, 94, -11, -58, 68, -110, 105, -60, 5, 99, -12, -8, 68, -99, -104, -106, 111, 14, -101, -93, 42, -7, 56, -106, 97, 14, -99, -93, 41, -8, 8, -105, 87, 15, -82}, new byte[]{-72, 70, -43, -34, 37, 115, -108, 40}));
            throw null;
        }
    }

    public static a a(JSONObject jSONObject) {
        return new a(jSONObject.getDouble(m.h(new byte[]{35, 69, -3, 119, 41, -18, 14, -37}, new byte[]{79, 36, -119, 30, 93, -101, 106, -66})), jSONObject.getDouble(m.h(new byte[]{-58, -92, -114, -66, -15, -52, 84, -58, -49}, new byte[]{-86, -53, -32, -39, -104, -72, 33, -94})));
    }
}
