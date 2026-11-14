package i7;

import android.media.SoundPool;
import com.woha.atir.CameraInfoView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2786b;
    public final /* synthetic */ g c;

    public /* synthetic */ e(g gVar, int i10) {
        this.f2786b = i10;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2786b) {
            case 0:
                g gVar = this.c;
                gVar.f2795j.setVisibility(8);
                gVar.f2796k.setVisibility(0);
                return;
            case 1:
                g gVar2 = this.c;
                CameraInfoView cameraInfoView = gVar2.f2795j;
                if (cameraInfoView != null) {
                    cameraInfoView.setVisibility(8);
                }
                w wVar = gVar2.f2796k;
                if (wVar != null) {
                    wVar.setVisibility(0);
                }
                v1.d.a().c().c.postValue(Boolean.TRUE);
                return;
            case 2:
                g gVar3 = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (gVar3.e) {
                    try {
                        if (!gVar3.f2791f.isEmpty() && currentTimeMillis - gVar3.f2799n > 10000) {
                            gVar3.f2791f.remove();
                            if (gVar3.f2791f.isEmpty()) {
                                gVar3.c();
                                gVar3.g();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                g gVar4 = this.c;
                gVar4.getClass();
                int loadInt = h0.b.o().loadInt(e0.m.h(new byte[]{24, -114, -124, -79, -71, 42, 18, -61, 10, -123, -107, -77, -119, 42, 4, -3, 25, -76, -105, -75, -105, 62, 13, -61, 32, -82, -72}, new byte[]{107, -21, -31, -38, -5, 75, 96, -100}), 0);
                if (loadInt > 0) {
                    s0.c cVar = gVar4.f2798m;
                    cVar.getClass();
                    int max = Math.max(0, Math.min(loadInt, 100));
                    cVar.e = max / 100.0f;
                    if (max >= 70) {
                        cVar.f5460f = 6;
                    } else if (max >= 50) {
                        cVar.f5460f = 4;
                    } else if (max >= 30) {
                        cVar.f5460f = 2;
                    } else {
                        cVar.f5460f = 1;
                    }
                    s0.c cVar2 = gVar4.f2798m;
                    if (cVar2.d && cVar2.f5458a != null) {
                        for (int i10 = 0; i10 < cVar2.f5460f; i10++) {
                            int[] iArr = cVar2.c;
                            SoundPool soundPool = cVar2.f5458a;
                            int i11 = cVar2.f5459b;
                            float f8 = cVar2.e;
                            iArr[i10] = soundPool.play(i11, f8, f8, 1, 0, 1.0f);
                        }
                    }
                }
                gVar4.f2789a = false;
                return;
        }
    }
}
