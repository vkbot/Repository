package e0;

import com.example.navistart.cores.ColorText;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f2056a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor.DiscardOldestPolicy f2057b;

    static {
        Runtime.getRuntime().availableProcessors();
        f2056a = new ConcurrentHashMap();
        f2057b = new ThreadPoolExecutor.DiscardOldestPolicy();
    }

    public static int a() {
        int i10;
        ConcurrentHashMap concurrentHashMap = f2056a;
        synchronized (concurrentHashMap) {
            try {
                i10 = 0;
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) entry.getValue();
                    if (scheduledThreadPoolExecutor != null && !scheduledThreadPoolExecutor.isShutdown()) {
                        int size = scheduledThreadPoolExecutor.getQueue().size();
                        i10 += size;
                        if (size > 30) {
                            h0.b.w(m.h(new byte[]{-113, -121, 108, -110, -125, -62, 9, -123, -71, -114, 41, -88}, new byte[]{-52, -21, 9, -13, -15, -109, 124, -32}) + str + m.h(new byte[]{81, 119, -78, -66}, new byte[]{12, 86, -109, -97, -125, 24, -2, -103}), ColorText.RED);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public static v b(long j10, String str) {
        return new v(c(-1, str), j10);
    }

    public static ScheduledThreadPoolExecutor c(int i10, final String str) {
        if (str == null || str.trim().isEmpty()) {
            str = m.h(new byte[]{-40, 30, -51, 64, -41, 0, 1, 24, -51, 20, -57, 85, -53, 16, 11, 24}, new byte[]{-99, 102, -88, 35, -94, 116, 110, 106});
        }
        ConcurrentHashMap concurrentHashMap = f2056a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) concurrentHashMap.get(str);
        if (scheduledThreadPoolExecutor != null && !scheduledThreadPoolExecutor.isShutdown()) {
            return scheduledThreadPoolExecutor;
        }
        ThreadFactory threadFactory = new ThreadFactory() { // from class: e0.t
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder u8 = ai.onnxruntime.a.u(str);
                u8.append(m.h(new byte[]{-121, ByteCompanionObject.MIN_VALUE, 43, -63, -87, 23, -118, 48}, new byte[]{-86, -44, 67, -77, -52, 118, -18, 29}));
                u8.append(thread.getId());
                thread.setName(u8.toString());
                thread.setPriority(5);
                thread.setUncaughtExceptionHandler(new Object());
                return thread;
            }
        };
        if (i10 <= 0) {
            i10 = 1;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(i10, threadFactory, f2057b);
        scheduledThreadPoolExecutor2.prestartAllCoreThreads();
        concurrentHashMap.put(str, scheduledThreadPoolExecutor2);
        return scheduledThreadPoolExecutor2;
    }
}
