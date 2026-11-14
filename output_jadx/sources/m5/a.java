package m5;

import com.bumptech.glide.manager.s;
import j1.i;
import n7.k1;
import o7.d2;
import o7.h3;
import o7.i4;
import o7.m;
import o7.x1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3934a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3935b;
    public Object c;
    public Object d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3936f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3937g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3938h;

    public a(Integer num, h3 h3Var, k1 k1Var, i4 i4Var, d2 d2Var, m mVar, x1 x1Var) {
        this.f3935b = num.intValue();
        o4.b.i(h3Var, "proxyDetector not set");
        this.c = h3Var;
        this.d = k1Var;
        this.e = i4Var;
        this.f3936f = d2Var;
        this.f3937g = mVar;
        this.f3938h = x1Var;
    }

    public b a() {
        String str;
        if (this.f3935b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f3937g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f3938h) == null) {
            str = str.concat(" tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.c, this.f3935b, (String) this.d, (String) this.e, ((Long) this.f3937g).longValue(), ((Long) this.f3938h).longValue(), (String) this.f3936f);
        }
        i.l("Missing required properties:".concat(str));
        return null;
    }

    public String toString() {
        switch (this.f3934a) {
            case 1:
                s t = com.bumptech.glide.c.t(this);
                t.e("defaultPort", String.valueOf(this.f3935b));
                t.c((h3) this.c, "proxyDetector");
                t.c((k1) this.d, "syncContext");
                t.c((i4) this.e, "serviceConfigParser");
                t.c((d2) this.f3936f, "scheduledExecutorService");
                t.c((m) this.f3937g, "channelLogger");
                t.c((x1) this.f3938h, "executor");
                t.c(null, "overrideAuthority");
                return t.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a() {
    }
}
