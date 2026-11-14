package w0;

import android.media.AudioManager;
import android.util.Log;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f6081b;

    public /* synthetic */ f(y yVar, int i10) {
        this.f6080a = i10;
        this.f6081b = yVar;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public final void onModeChanged(int i10) {
        switch (this.f6080a) {
            case 0:
                g gVar = (g) this.f6081b;
                Log.d(e0.m.h(new byte[]{-112, 95, -98, 35, -15, -32, 106, -3, -76}, new byte[]{-47, 42, -6, 74, -98, -83, 5, -103}), e0.m.h(new byte[]{-93, 24, -90, 104, 21, 97, -79}, new byte[]{-50, 119, -62, 13, 53, 92, -111, 21}) + i10);
                if (i10 != 3 && i10 != 2) {
                    if (gVar.f6094h) {
                        gVar.c();
                        return;
                    }
                    return;
                } else {
                    gVar.b();
                    gVar.f6094h = true;
                    return;
                }
            case 1:
                o oVar = (o) this.f6081b;
                Log.d(e0.m.h(new byte[]{22, -122, -21, -23, 107, -118, -56, 24, 50}, new byte[]{87, -13, -113, ByteCompanionObject.MIN_VALUE, 4, -57, -89, 124}), e0.m.h(new byte[]{-43, -122, -54, -83, -107, -90, 8}, new byte[]{-72, -23, -82, -56, -75, -101, 40, 73}) + i10);
                if (i10 != 3 && i10 != 2) {
                    if (oVar.f6210s) {
                        oVar.c();
                        return;
                    }
                    return;
                } else {
                    oVar.b();
                    oVar.f6210s = true;
                    return;
                }
            default:
                x xVar = (x) this.f6081b;
                if (!xVar.f6284o) {
                    Log.d(e0.m.h(new byte[]{-82, 13, 75, -20, -5, -11, 93, 51, -118}, new byte[]{-17, 120, 47, -123, -108, -72, 50, 87}), e0.m.h(new byte[]{59, -50, -55, 73, -32, -82, 89}, new byte[]{86, -95, -83, 44, -64, -109, 121, -39}) + i10);
                    if (i10 != 3 && i10 != 2) {
                        if (xVar.K) {
                            xVar.c();
                            return;
                        }
                        return;
                    } else {
                        xVar.b();
                        xVar.K = true;
                        return;
                    }
                }
                return;
        }
    }
}
