package t1;

import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.example.navistart.LounchB;
import e0.u1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f5783a;

    /* renamed from: b, reason: collision with root package name */
    public final j f5784b;
    public final r0.a c;
    public final LounchB d;
    public final int e;

    public k(LounchB lounchB, int i10, String str) {
        this.d = lounchB;
        this.e = i10;
        if (a()) {
            this.c = new r0.a(lounchB);
            this.f5784b = new j(lounchB);
            u1 u1Var = new u1(lounchB, str);
            h0.b.a();
            WindowManager g10 = h0.b.g().b().g(this.f5784b, i10, u1Var.c);
            this.f5783a = g10;
            u1Var.a(this.f5784b, g10, new f5.j(19, this));
            u1Var.d();
            this.f5784b.e(new a4.c(this, 0, 12), new a4.c(this, 1, 12), new a4.c(this, 2, 12), new a4.c(this, 3, 12), new a4.c(this, 4, 12), new a4.c(this, 5, 12), new a4.c(this, 6, 12), new a4.c(this, 7, 12));
            Drawable[] a10 = r0.e.a(lounchB);
            j jVar = this.f5784b;
            if (jVar != null) {
                jVar.setImageRun(a10);
            }
        }
    }

    public final boolean a() {
        Display[] displays = ((DisplayManager) this.d.getSystemService(e0.m.h(new byte[]{-125, 47, 65, -24, 84, -65, 28}, new byte[]{-25, 70, 50, -104, 56, -34, 101, -83}))).getDisplays();
        int i10 = this.e;
        if (i10 > -1 && i10 < displays.length) {
            return true;
        }
        return false;
    }
}
