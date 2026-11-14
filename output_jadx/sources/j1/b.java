package j1;

import android.content.Context;
import android.content.Intent;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.cores.ColorText;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public c5.e f3105a;

    /* renamed from: b, reason: collision with root package name */
    public p2.e f3106b;

    @Override // j1.v
    public final void a(Context context, i0.a aVar) {
        if (aVar != null && aVar.equals(i0.a.c)) {
            new MyCarReceiver().onReceive(context, new Intent(e0.m.h(new byte[]{20, 40, -110, -89, 30, 25, 94, 17, 28, 40, -126, -80, 31, 4, 20, 94, 22, 50, -97, -70, 31, 94, 105, 124, 39, 3, -77, -101, 46, 63, 116}, new byte[]{117, 70, -10, -43, 113, 112, 58, 63})));
            m7.k.c(context, true);
            h0.b.w(e0.m.h(new byte[]{-61, 96, 11, 81, -127, 22, 36, -87, -44, 124, 19, 123, -49, 105, 97, -99, -40, 115, 12, 91, -127, 37, 35, -90, -44}, new byte[]{-79, 21, 101, 30, -17, 68, 65, -54}), ColorText.RED);
        }
    }

    @Override // j1.v
    public final z0.a b() {
        if (this.f3105a == null) {
            this.f3105a = new c5.e(20);
        }
        return this.f3105a;
    }

    @Override // j1.v
    public final boolean c() {
        return true;
    }

    @Override // j1.v
    public final w d() {
        if (this.f3106b == null) {
            this.f3106b = new p2.e(12);
        }
        return this.f3106b;
    }

    @Override // j1.v
    public final boolean h() {
        return true;
    }
}
