package l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {
    public static final int e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f3484b;
    public final r5.c c;
    public final float d;

    static {
        int i10;
        if (Build.VERSION.SDK_INT < 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        e = i10;
    }

    public g(Context context) {
        this.d = e;
        this.f3483a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3484b = activityManager;
        this.c = new r5.c(26, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.d = 0.0f;
        }
    }
}
