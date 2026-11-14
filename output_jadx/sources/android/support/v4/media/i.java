package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f115b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final e f116a;

    public i(Context context, ComponentName componentName, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f116a = new e(context, componentName, dVar);
        } else {
            this.f116a = new e(context, componentName, dVar);
        }
    }
}
