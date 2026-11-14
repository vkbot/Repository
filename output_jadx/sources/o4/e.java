package o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f4355b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4356a;

    public e(Context context) {
        this.f4356a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f4357j) {
            try {
                Iterator it = f.f4358k.values().iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4356a.unregisterReceiver(this);
    }
}
