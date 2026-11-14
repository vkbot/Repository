package m;

import android.os.Process;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3591b = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f3591b) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
            default:
                super.run();
                return;
            case 2:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ a(String str, Runnable runnable) {
        super(runnable, str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
