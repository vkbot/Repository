package androidx.constraintlayout.core.state;

import android.content.Context;
import b1.k;
import b1.l;
import b8.d;
import d5.f;
import e0.m;
import h0.b;
import j1.o;
import j1.u;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;
import x5.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Interpolator, k, d, u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f160b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(l lVar, String str, int i10) {
        this.f160b = i10;
        this.c = str;
    }

    @Override // j1.u
    public void c(Context context) {
        int i10 = this.f160b;
        String str = this.c;
        switch (i10) {
            case 5:
                String str2 = j1.l.c;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(m.h(new byte[]{-123, -19, 121, 85, 16, 84, 117}, new byte[]{-26, -126, 20, 56, 113, 58, 17, -118}), str);
                    b.a();
                    b.d().c(jSONObject);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                String str3 = o.c;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(m.h(new byte[]{-108, -59, -11, -8, Base64.padSymbol, 91, -33}, new byte[]{-9, -86, -104, -107, 92, 53, -69, 17}), str);
                    b.a();
                    b.d().c(jSONObject2);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f8) {
        float lambda$getInterpolator$0;
        lambda$getInterpolator$0 = Transition.lambda$getInterpolator$0(this.c, f8);
        return lambda$getInterpolator$0;
    }

    @Override // b1.k
    public String run() {
        switch (this.f160b) {
            case 1:
                return l.h(this.c);
            case 2:
                return l.f(this.c);
            default:
                return l.g(this.c);
        }
    }

    @Override // b8.d
    public boolean test(Object obj) {
        c cVar = (c) obj;
        String str = this.c;
        if (str.equals("ON_FOREGROUND") && cVar.q()) {
            return true;
        }
        for (f fVar : cVar.t()) {
            if (fVar.o().toString().equals(str) || fVar.n().o().equals(str)) {
                e3.d.m("The event " + str + " is contained in the list of triggers");
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ a(String str, int i10) {
        this.f160b = i10;
        this.c = str;
    }
}
