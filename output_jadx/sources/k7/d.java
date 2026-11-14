package k7;

import android.content.Intent;
import com.woha.pogoda.WeatherService;
import e0.m;
import kotlin.io.encoding.Base64;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3427b;
    public final /* synthetic */ WeatherService c;

    public /* synthetic */ d(WeatherService weatherService, int i10) {
        this.f3427b = i10;
        this.c = weatherService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3427b) {
            case 0:
                WeatherService weatherService = this.c;
                boolean z9 = WeatherService.f1686f;
                weatherService.f();
                return;
            case 1:
                WeatherService weatherService2 = this.c;
                if (!WeatherService.b().equals(n0.f.f4115f.name())) {
                    WeatherService.e(weatherService2);
                    return;
                }
                Intent launchIntentForPackage = weatherService2.getPackageManager().getLaunchIntentForPackage(m.h(new byte[]{-94, -22, -51, 112, 92, 55, 24, 7, -88, -79, -108, 108, 92, 45, 20, 7, -94, -17, -113, 124, 90, 48, 18}, new byte[]{-48, -97, -29, 9, Base64.padSymbol, 89, 124, 98}));
                if (launchIntentForPackage != null) {
                    k.u(weatherService2, launchIntentForPackage, null);
                    return;
                }
                return;
            default:
                this.c.f1693b.setUpdateView(WeatherService.f1690j);
                return;
        }
    }
}
