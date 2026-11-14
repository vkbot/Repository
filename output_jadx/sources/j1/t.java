package j1;

import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f3238a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3239b;
    public final int c;
    public final int d;
    public final u e;

    public t(String str, String str2, int i10, int i11, u uVar) {
        this.f3238a = str;
        this.f3239b = str2;
        this.c = i10;
        this.d = i11;
        this.e = uVar;
    }

    public final boolean a() {
        String str = this.f3238a;
        if (str != null && !str.trim().isEmpty() && this.e != null) {
            return true;
        }
        return false;
    }

    public t(String str, String str2, u uVar) {
        this(str, str2, 0, R.drawable.ic_j6_climate_action, uVar);
    }
}
