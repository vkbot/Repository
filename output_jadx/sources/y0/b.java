package y0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.example.navistart.Transport.TransportService;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final TransportService f6584b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final d d = g.e(e0.m.h(new byte[]{45, -43, 84, -121, -83, -20, -39, -96, 44, -38, 12, -127, -70, -24, -61}, new byte[]{67, -76, 34, -18, -54, -115, -83, -55}), new a(this));
    public final android.support.v4.media.h e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6585f;

    public b(TransportService transportService) {
        this.f6584b = transportService;
        int i10 = 14;
        this.e = new android.support.v4.media.h((Object) new p(i10, transportService.getSharedPreferences(e0.m.h(new byte[]{-53, -105, 58, -11, 77, 44, -34, -5, -54, -104, 19, -18, 79, 46, -49, -5, -45, -109, 40, -61, 92, 124}, new byte[]{-91, -10, 76, -100, 42, 77, -86, -110}), 0)), (Object) new a(this), false, 24);
    }

    public final void b(String str) {
        try {
            g.c(this.f6584b, e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -55, -123, 14, -23, -87, 73, -75, 126, -58, -35, 21, -21, -69, 72, -80, 101}, new byte[]{17, -88, -13, 103, -114, -56, Base64.padSymbol, -36}), str, e0.m.h(new byte[]{-13, 77, -55, -42, 65, -72, 125, -79}, new byte[]{-127, 40, -91, -65, 32, -38, 17, -44}));
        } catch (Exception e) {
            Log.w(e0.m.h(new byte[]{-66, -87, 104, -34, 94, -4, -59, 117, -97, -90, 76, -46, 90, -8, -40, 106, -107, -70}, new byte[]{-16, -56, 30, -73, 57, -99, -79, 28}), e0.m.h(new byte[]{10, 93, -92, 7, -76, 104, 116, -112, 44, 82, -82, 73, -75, 125, 34, -118, 46, 93, -66, 0, -76, 114, 116, -111, 44, 79, -65, 5, -81}, new byte[]{73, 60, -54, 105, -37, 28, 84, -29}), e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6585f = true;
        this.c.removeCallbacksAndMessages(null);
        try {
            kotlin.collections.unsigned.a.g(this.d);
        } catch (Exception unused) {
        }
    }
}
