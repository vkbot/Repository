package j1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.chery.ivi.vdb.event.id.vr.bean.VDP2P;
import com.example.navistart.W;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3107b;

    public /* synthetic */ c(int i10) {
        this.f3107b = i10;
    }

    @Override // j1.u
    public final void c(Context context) {
        String h2;
        switch (this.f3107b) {
            case 0:
                e.i(e.t);
                return;
            case 1:
                String str = e.c;
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(e0.m.h(new byte[]{22, -109, 56, -50}, new byte[]{114, -14, 76, -81, -118, 14, 21, 25}), new VDP2P(e0.m.h(new byte[]{-84, 40, 4, -43, 126, -51, -75, 117, -88, 40, 0, -64, 124, -39, -113, 118, -67}, new byte[]{-55, 70, 97, -89, 25, -76, -22, 24}), 5511, "", true));
                    context.getContentResolver().call(e.B, e0.m.h(new byte[]{27, -24, 54, -88}, new byte[]{116, -104, 83, -58, -87, 42, 117, 112}), (String) null, bundle);
                    return;
                } catch (Throwable th) {
                    Log.e(e0.m.h(new byte[]{65, 17, -119, -68, -36, -54, -64, 67, 108, 23, -66, -73}, new byte[]{2, 112, -5, -17, -71, -66, -76, 42}), e0.m.h(new byte[]{106, 10, -21, -68, -87, 65, 40, 36, 80, 68, -27, -82, -96, 74, 40, 0, 119, 33, -36, -2, -96, 74, 109, 34, 88, 29, -86, -77, -92, 74, 105, 55, 90, 9, -17, -80, -79}, new byte[]{63, 100, -118, -34, -59, 36, 8, 80}), th);
                    return;
                }
            case 2:
                e.i(e.f3140u);
                return;
            case 3:
                e.i(e.f3141v);
                return;
            case 4:
                e.i(e.w);
                return;
            case 5:
                e.i(e.f3142x);
                return;
            case 6:
                e.i(e.f3143y);
                return;
            case 7:
                e.i(e.f3144z);
                return;
            case 8:
                e.i(e.A);
                return;
            case 9:
                e.i(e.d);
                return;
            case 10:
                e.i(e.f3132k);
                return;
            case 11:
                e.i(e.e);
                return;
            case 12:
                e.i(e.f3127f);
                return;
            case 13:
                e.i(e.c);
                return;
            case 14:
                e.i(e.f3128g);
                return;
            case 15:
                e.i(e.f3129h);
                return;
            case 16:
                e.i(e.f3130i);
                return;
            case 17:
                e.i(e.f3131j);
                return;
            case 18:
                e.i(e.f3133l);
                return;
            case 19:
                e.i(e.f3134m);
                return;
            case 20:
                e.i(e.f3135n);
                return;
            case 21:
                e.i(e.f3136o);
                return;
            case 22:
                e.i(e.f3137p);
                return;
            case 23:
                e.i(e.f3138q);
                return;
            case 24:
                e.i(e.r);
                return;
            case 25:
                e.i(e.f3139s);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                String h10 = e0.m.h(new byte[]{22, -127, 58}, new byte[]{114, -24, 73, -119, 3, -122, -50, 88});
                h0.b.a();
                bundle2.putInt(h10, h0.b.n().getGuDisplayID());
                W.t(context, f1.e.class, bundle2);
                return;
            case 27:
                u0.a o5 = h0.b.o();
                String str2 = l.e;
                boolean loadBoolean = o5.loadBoolean(str2, false);
                boolean z9 = !loadBoolean;
                try {
                    JSONObject jSONObject = new JSONObject();
                    String h11 = e0.m.h(new byte[]{49, 51, 86}, new byte[]{82, 94, 50, -87, -122, -82, -28, -86});
                    if (!loadBoolean) {
                        h2 = e0.m.h(new byte[]{106, 86, -121, 17, 65, -13, -32, 30, ByteCompanionObject.MAX_VALUE, 81, -116, 47, 85, -10, -30, 47, 107, 75, ByteCompanionObject.MIN_VALUE, 21}, new byte[]{14, 63, -12, 112, 35, -97, -123, 65});
                    } else {
                        h2 = e0.m.h(new byte[]{112, 24, -30, -92, -3, 51, 70, 13, 123, 14, -36, -80, -8, 49, 119, 25, 97, 2, -26}, new byte[]{21, 118, -125, -58, -111, 86, 25, 124});
                    }
                    jSONObject.put(h11, h2);
                    h0.b.a();
                    JSONObject c = h0.b.d().c(jSONObject);
                    if (c != null && c.optBoolean(e0.m.h(new byte[]{-76, -69, -60, 45, 20, -47, 9}, new byte[]{-57, -50, -89, 78, 113, -94, 122, -112}), false)) {
                        h0.b.o().saveBoolean(str2, z9);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                W.t(context, f1.e.class, null);
                return;
            default:
                k.i(1, 100);
                return;
        }
    }
}
