package n0;

import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum f implements e {
    c(R.string.enum_BUILT_IN_APP),
    d(R.string.enum_YANDEX_WEB),
    e(R.string.enum_OPEN_METEO),
    f4115f(R.string.enum_EXTERNAL_APP);


    /* renamed from: b, reason: collision with root package name */
    public final int f4117b;

    f(int i10) {
        this.f4117b = i10;
    }

    @Override // n0.e
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // n0.e
    public final String b() {
        return com.bumptech.glide.d.b(this.f4117b);
    }
}
