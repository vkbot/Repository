package e4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f2149a;

    /* renamed from: b, reason: collision with root package name */
    public int f2150b;
    public Object c;
    public Object d;

    public o(String str, String str2, int i10, int i11) {
        this.c = str;
        this.d = str2;
        this.f2149a = i10 != 1 ? 2 : 1;
        if (i11 != 30 && i11 != 70) {
            i11 = 50;
        }
        this.f2150b = i11;
    }

    public String a() {
        boolean z9;
        String str = (String) this.d;
        if (str != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str2 = (String) this.c;
        if (z9) {
            StringBuilder u8 = ai.onnxruntime.a.u(str2);
            com.google.protobuf.q.u(new byte[]{34}, new byte[]{14, 18, -30, -76, 51, 83, -66, -3}, u8, str);
            u8.append(e0.m.h(new byte[]{-82}, new byte[]{-126, -33, -36, 120, 121, -20, -75, -92}));
            u8.append(this.f2149a);
            u8.append(e0.m.h(new byte[]{75}, new byte[]{103, 72, 121, 50, 122, 40, -112, 12}));
            u8.append(this.f2150b);
            return u8.toString();
        }
        return str2;
    }

    public o() {
        this.f2150b = 50;
    }
}
