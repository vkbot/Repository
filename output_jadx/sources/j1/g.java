package j1;

import android.content.Context;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3148b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i10, String str) {
        this.f3148b = i10;
        this.c = str;
        this.d = obj;
    }

    @Override // j1.u
    public final void c(Context context) {
        int i10 = this.f3148b;
        Object obj = this.d;
        String str = this.c;
        switch (i10) {
            case 0:
                String str2 = l.c;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(e0.m.h(new byte[]{-82, 113, -78, -23, 24, -104, 110}, new byte[]{-51, 30, -33, -124, 121, -10, 10, ByteCompanionObject.MAX_VALUE}), str);
                    jSONObject.put(e0.m.h(new byte[]{-91, 87, 30, 69, -4}, new byte[]{-45, 54, 114, 48, -103, 25, 82, 99}), obj);
                    h0.b.a();
                    h0.b.d().c(jSONObject);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 1:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e0.m.h(new byte[]{-18, -76, 92, -27, 82, -79, -99}, new byte[]{-115, -37, 49, -120, 51, -33, -7, -109}), str);
                    jSONObject2.put(e0.m.h(new byte[]{-73, -53, -9, 122, -5}, new byte[]{-63, -86, -101, 15, -98, 14, 24, -119}), obj);
                    h0.b.a();
                    h0.b.d().c(jSONObject2);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            default:
                o.i(obj, str);
                return;
        }
    }
}
