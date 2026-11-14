package j1;

import android.content.Context;
import com.example.navistart.cores.ColorText;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public c5.e f3188a;

    /* renamed from: b, reason: collision with root package name */
    public c5.e f3189b;

    public static void i(int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.m.h(new byte[]{117, 24, 113, 48, 9, 25, -123}, new byte[]{22, 119, 28, 93, 104, 119, -31, 68}), e0.m.h(new byte[]{11, -80, 78, 110, -79, 54, -80, 38, 25, -83, ByteCompanionObject.MAX_VALUE, 122, -79, 50, -122, 33, 21, -74, 78}, new byte[]{124, -39, 32, 10, -34, 65, -17, 85}));
            jSONObject.put(e0.m.h(new byte[]{4, 123, 89, 17, 35, -60}, new byte[]{115, 18, 55, 117, 76, -77, 42, -97}), i10);
            jSONObject.put(e0.m.h(new byte[]{-99, 104, 120, 95, -8}, new byte[]{-21, 9, 20, 42, -99, 23, 70, -71}), i11);
            h0.b.a();
            h0.b.d().c(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // j1.v
    public final void a(Context context, i0.a aVar) {
        if (aVar != null && aVar.equals(i0.a.c)) {
            m7.k.c(context, true);
            h0.b.w(e0.m.h(new byte[]{40, -53, -126, 85, 117, -47, -112, -86, 63, -41, -102, ByteCompanionObject.MAX_VALUE, 59, -82, -43, -98, 51, -40, -123, 95, 117, -30, -105, -91, 63}, new byte[]{90, -66, -20, 26, 27, -125, -11, -55}), ColorText.RED);
        }
    }

    @Override // j1.v
    public final z0.a b() {
        if (this.f3188a == null) {
            this.f3188a = new c5.e(20);
        }
        return this.f3188a;
    }

    @Override // j1.v
    public final w d() {
        if (this.f3189b == null) {
            this.f3189b = new c5.e(12);
        }
        return this.f3189b;
    }

    @Override // j1.v
    public final t[] e() {
        j[] values = j.values();
        t[] tVarArr = new t[values.length];
        for (int i10 = 0; i10 < values.length; i10++) {
            tVarArr[i10] = values[i10].f3187b;
        }
        return tVarArr;
    }

    @Override // j1.v
    public final boolean h() {
        return true;
    }
}
