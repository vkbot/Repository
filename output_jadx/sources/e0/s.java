package e0;

import android.os.Build;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2021a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2022b;
    public final int c = Build.VERSION.SDK_INT;
    public final String d = Build.FINGERPRINT;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2023f;

    public s(boolean z9, boolean z10, String str, String str2) {
        this.f2021a = z9;
        this.f2022b = z10;
        this.e = str;
        this.f2023f = str2;
    }

    public final String a() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(m.h(new byte[]{110, 124, -28, 62, -92, 64}, new byte[]{1, 11, -118, 91, -42, 125, 103, -48}));
        sb.append(this.f2021a);
        sb.append(m.h(new byte[]{-30, -28, 47, -7, 57, 92, 99, -68, -83, -80, 39, -21, 49, 8}, new byte[]{-50, -60, 78, -99, 84, 53, 13, -3}));
        sb.append(this.f2022b);
        sb.append(m.h(new byte[]{122, 75, 126, 106, 89, -83}, new byte[]{86, 107, 13, 14, 50, -112, 58, -47}));
        sb.append(this.c);
        sb.append(m.h(new byte[]{-124, -117, 109, -126, -56, -108, -94, 71, -40, -39, 98, -123, -46, -50}, new byte[]{-88, -85, 11, -21, -90, -13, -57, 53}));
        sb.append(this.d);
        sb.append(m.h(new byte[]{119, 102, 120, -70, -18, 50, 14, -44, 26, 34, 116, -80, -12, 40, 69}, new byte[]{91, 70, 25, -39, -102, 91, 120, -79}));
        sb.append(this.e);
        String str = this.f2023f;
        if (str == null) {
            concat = "";
        } else {
            concat = m.h(new byte[]{-45, -1, 111, -113, -115, -33, 59, -99}, new byte[]{-1, -33, 10, -3, -1, -80, 73, -96}).concat(str);
        }
        sb.append(concat);
        return sb.toString();
    }
}
