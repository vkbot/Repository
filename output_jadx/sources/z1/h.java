package z1;

import com.github.clans.fab.FloatingActionMenu;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6708b;
    public final /* synthetic */ FloatingActionMenu c;

    public /* synthetic */ h(FloatingActionMenu floatingActionMenu, int i10) {
        this.f6708b = i10;
        this.c = floatingActionMenu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6708b) {
            case 0:
                this.c.f1116k = true;
                return;
            default:
                this.c.f1116k = false;
                return;
        }
    }
}
