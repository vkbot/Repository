package y0;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final Context f6593b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public h(Context context, String str) {
        this.f6593b = context;
    }

    public final void b(String str, String str2, String str3) {
        if (!this.c.get()) {
            if (!str.trim().isEmpty()) {
                if (str2 == null) {
                    str2 = "";
                }
                g.c(this.f6593b, str, str2, str3);
                return;
            }
            j1.i.k(e0.m.h(new byte[]{108, -59, -98, 98, -83, 125, 54, -19, 76, -105, -100, 100, -65, 99, 55, -6, 84, -105, -106, ByteCompanionObject.MAX_VALUE, -2, 104, 52, -17, 76, -50}, new byte[]{56, -73, -1, 12, -34, 13, 89, -97}));
            return;
        }
        j1.i.l(e0.m.h(new byte[]{-28, -109, -91, -93, 32, 83, 108, -100, -60, -63, -88, -88, 50, 80, 102, -50, -39, -110, -28, -82, 63, 76, 112, -117, -44}, new byte[]{-80, -31, -60, -51, 83, 35, 3, -18}));
    }

    public final void c(String str, String str2) {
        b(str, str2, e0.m.h(new byte[]{119, 78, -83, -52, 102, 91}, new byte[]{27, 47, -39, -87, 21, 47, -52, 124}));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            CopyOnWriteArrayList copyOnWriteArrayList = g.f6591a;
        }
    }

    public final void y(String str, String str2) {
        b(str, str2, e0.m.h(new byte[]{28, -95, -91, -3, -118, 41, 29, 100}, new byte[]{110, -60, -55, -108, -21, 75, 113, 1}));
    }
}
