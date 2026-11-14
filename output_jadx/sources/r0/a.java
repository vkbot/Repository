package r0;

import android.app.ActivityOptions;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import com.example.navistart.LounchB;
import e0.d0;
import e0.m;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {
    public static final String c = m.h(new byte[]{37, -42, -90, 9, 91, 10, 96, 43, 60, -54, -91, 19, 109}, new byte[]{72, -93, -54, 125, 50, 85, 1, 72});

    /* renamed from: a, reason: collision with root package name */
    public final d0 f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final LounchB f5340b;

    public a(LounchB lounchB) {
        this.f5340b = lounchB;
        this.f5339a = new d0(lounchB);
    }

    public final void a(int i10, String str) {
        ActivityOptions activityOptions;
        LounchB lounchB = this.f5340b;
        try {
            Intent launchIntentForPackage = lounchB.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                Display[] displays = ((DisplayManager) lounchB.getApplicationContext().getSystemService(m.h(new byte[]{-89, -80, -49, 87, 43, -120, 15}, new byte[]{-61, -39, -68, 39, 71, -23, 118, 120}))).getDisplays();
                if (displays.length > i10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        activityOptions = ActivityOptions.makeBasic().setLaunchDisplayId(displays[i10].getDisplayId());
                    } else {
                        activityOptions = null;
                    }
                    launchIntentForPackage.addFlags(268435456);
                    Objects.requireNonNull(activityOptions, m.h(new byte[]{70, -29, 91, 97, -124, 72, Base64.padSymbol, -77, 106, -14, 65, 102, -124, 82, 110, -15, 108, -77, 65, 125, -121, 74}, new byte[]{9, -109, 47, 8, -21, 38, 78, -109}));
                    k.u(lounchB, launchIntentForPackage, activityOptions.toBundle());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
