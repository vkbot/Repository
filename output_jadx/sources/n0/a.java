package n0;

import com.example.navistart.R;
import com.example.navistart.cores.HUDMassageObj;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum a implements e {
    d(R.string.AradarApp_Not_Run_APP, HUDMassageObj.AradarSenderType.Not),
    e(R.string.AradarApp_BUILT_IN_APP, HUDMassageObj.AradarSenderType.GENARADAR),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(R.string.AradarApp_EXTERNAL_APP_STR, HUDMassageObj.AradarSenderType.STRELKA),
    f4047f(R.string.AradarApp_EXTERNAL_APP_HUDSPEED, HUDMassageObj.AradarSenderType.HUDSPEED);


    /* renamed from: b, reason: collision with root package name */
    public final int f4049b;
    public final HUDMassageObj.AradarSenderType c;

    a(int i10, HUDMassageObj.AradarSenderType aradarSenderType) {
        this.f4049b = i10;
        this.c = aradarSenderType;
    }

    @Override // n0.e
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // n0.e
    public final String b() {
        return com.bumptech.glide.d.b(this.f4049b);
    }
}
