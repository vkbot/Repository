package m8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3990a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3991b;
    public static final AtomicReference c = new AtomicReference();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[LOOP:0: B:11:0x003f->B:19:0x0071, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[ORIG_RETURN, RETURN] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            m8.n.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            m8.n.d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L24
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 == 0) goto L38
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L38
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L38
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L38
            goto L39
        L38:
            r0 = r3
        L39:
            m8.n.f3990a = r1
            m8.n.f3991b = r0
            if (r1 == 0) goto L75
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = m8.n.c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L4a
            goto L75
        L4a:
            m8.k r2 = new m8.k
            java.lang.String r4 = "RxSchedulerPurge"
            r2.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)
        L55:
            boolean r2 = r0.compareAndSet(r1, r5)
            if (r2 == 0) goto L6b
            b4.e r6 = new b4.e
            r0 = 2
            r6.<init>(r0)
            int r0 = m8.n.f3991b
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r9 = r7
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L75
        L6b:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L55
            r5.shutdownNow()
            goto L3f
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.n.<clinit>():void");
    }
}
