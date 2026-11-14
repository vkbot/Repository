package y0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.example.navistart.Transport.TransportService;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f6591a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f6592b = new CopyOnWriteArrayList();

    public static h a(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        StringBuilder u8 = ai.onnxruntime.a.u(str);
        u8.append(e0.m.h(new byte[]{113}, new byte[]{75, -4, -124, 87, -103, -16, 69, -67}));
        u8.append(UUID.randomUUID());
        String sb = u8.toString();
        d(applicationContext);
        return new h(applicationContext, sb);
    }

    public static void b(long j10, String str, String str2) {
        Iterator it = f6591a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.f6589a.equals(str)) {
                try {
                    fVar.f6590b.a(str2);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        String str4 = TransportService.f914p;
        context.startService(new Intent(context, (Class<?>) TransportService.class).setAction(TransportService.r).putExtra(TransportService.f916s, str).putExtra(TransportService.t, str2).putExtra(TransportService.f917u, str3));
    }

    public static void d(Context context) {
        Context applicationContext = context.getApplicationContext();
        String str = TransportService.f914p;
        Intent action = new Intent(applicationContext, (Class<?>) TransportService.class).setAction(TransportService.f915q);
        if (Build.VERSION.SDK_INT >= 26) {
            applicationContext.startForegroundService(action);
        } else {
            applicationContext.startService(action);
        }
    }

    public static d e(String str, e eVar) {
        f fVar = new f(str, eVar);
        f6591a.add(fVar);
        return new d(0, fVar);
    }
}
