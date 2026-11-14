package z1;

import com.example.navistart.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6707b;
    public final /* synthetic */ FloatingActionButton c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ FloatingActionMenu e;

    public /* synthetic */ g(FloatingActionMenu floatingActionMenu, FloatingActionButton floatingActionButton, boolean z9, int i10) {
        this.f6707b = i10;
        this.e = floatingActionMenu;
        this.c = floatingActionButton;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6707b) {
            case 0:
                FloatingActionMenu floatingActionMenu = this.e;
                if (!floatingActionMenu.f1116k) {
                    FloatingActionButton floatingActionButton = floatingActionMenu.f1106f;
                    boolean z9 = this.d;
                    FloatingActionButton floatingActionButton2 = this.c;
                    if (floatingActionButton2 != floatingActionButton) {
                        floatingActionButton2.m(z9);
                    }
                    k kVar = (k) floatingActionButton2.getTag(R.id.fab_label);
                    if (kVar != null && kVar.r) {
                        if (z9 && kVar.f6721o != null) {
                            kVar.f6722p.cancel();
                            kVar.startAnimation(kVar.f6721o);
                        }
                        kVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                FloatingActionMenu floatingActionMenu2 = this.e;
                if (floatingActionMenu2.f1116k) {
                    FloatingActionButton floatingActionButton3 = floatingActionMenu2.f1106f;
                    boolean z10 = this.d;
                    FloatingActionButton floatingActionButton4 = this.c;
                    if (floatingActionButton4 != floatingActionButton3) {
                        floatingActionButton4.g(z10);
                    }
                    k kVar2 = (k) floatingActionButton4.getTag(R.id.fab_label);
                    if (kVar2 != null && kVar2.r) {
                        if (z10 && kVar2.f6722p != null) {
                            kVar2.f6721o.cancel();
                            kVar2.startAnimation(kVar2.f6722p);
                        }
                        kVar2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
