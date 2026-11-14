package q0;

import com.example.navistart.MockGPS.MockGpsService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5192a = 1;

    /* renamed from: b, reason: collision with root package name */
    public String f5193b;
    public String c;
    public int d;

    public g(String str, String str2, int i10) {
        String f8 = MockGpsService.f(str);
        this.f5193b = f8;
        String str3 = null;
        if (str2 != null) {
            String trim = str2.trim();
            if (!trim.isEmpty()) {
                str3 = trim;
            }
        }
        this.c = str3;
        this.d = MockGpsService.c(i10, f8) ? i10 : MockGpsService.a(f8);
    }

    public String toString() {
        switch (this.f5192a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5193b);
                sb.append("://");
                int i10 = -1;
                if (this.c.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.c);
                    sb.append(']');
                } else {
                    sb.append(this.c);
                }
                int i11 = this.d;
                if (i11 == -1) {
                    String str = this.f5193b;
                    if (str.equals("http")) {
                        i11 = 80;
                    } else if (str.equals("https")) {
                        i11 = 443;
                    } else {
                        i11 = -1;
                    }
                }
                String str2 = this.f5193b;
                if (str2.equals("http")) {
                    i10 = 80;
                } else if (str2.equals("https")) {
                    i10 = 443;
                }
                if (i11 != i10) {
                    sb.append(':');
                    sb.append(i11);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g() {
    }
}
