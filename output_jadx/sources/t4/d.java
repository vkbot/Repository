package t4;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements k5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5799a;

    @Override // k5.b
    public final Object get() {
        switch (this.f5799a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                l lVar = ExecutorsRegistrar.f1526a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new u4.f(Executors.newFixedThreadPool(4, new u4.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                l lVar2 = ExecutorsRegistrar.f1526a;
                return new u4.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new u4.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                l lVar3 = ExecutorsRegistrar.f1526a;
                return new u4.f(Executors.newCachedThreadPool(new u4.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                l lVar4 = ExecutorsRegistrar.f1526a;
                return Executors.newSingleThreadScheduledExecutor(new u4.a("Firebase Scheduler", 0, null));
        }
    }
}
