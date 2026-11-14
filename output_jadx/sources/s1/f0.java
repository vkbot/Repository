package s1;

import e0.j2;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5488b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ f0(q0 q0Var, int i10) {
        this.f5488b = i10;
        this.c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5488b) {
            case 0:
                if (!this.c.E) {
                    q0 q0Var = this.c;
                    if (q0Var.f5591n && q0Var.isAttachedToWindow()) {
                        x a10 = x.a(this.c.getContext());
                        q0.f fVar = new q0.f(2, this);
                        synchronized (a10) {
                            if (!a10.f5641g) {
                                a10.f5641g = true;
                                a10.d.execute(new j2(26, a10, fVar));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (!this.c.E && this.c.isAttachedToWindow()) {
                    ArrayList arrayList = this.c.f5594q;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (q0.r(((j0) obj).f5512b)) {
                            this.c.f5590m.execute(new f5.j(17, this));
                            return;
                        }
                    }
                    this.c.r.postDelayed(this, 4000L);
                    return;
                }
                return;
        }
    }
}
