package b4;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m8.n;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f351b;

    public e(j jVar) {
        this.f351b = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f351b) {
            case 0:
                throw null;
            case 1:
                return;
            default:
                ArrayList arrayList = new ArrayList(n.d.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        n.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f351b) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    private final void a() {
    }
}
