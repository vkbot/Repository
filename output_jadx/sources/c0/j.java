package c0;

import android.os.SystemClock;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final double f436a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f437b = 0;

    public static double a(long j10) {
        return (SystemClock.elapsedRealtimeNanos() - j10) * f436a;
    }
}
