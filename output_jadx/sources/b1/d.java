package b1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f268a;

    public d(f fVar) {
        this.f268a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f268a;
        fVar.f282m = false;
        fVar.f281l = true;
        fVar.f276g = iBinder;
        f fVar2 = this.f268a;
        fVar2.f274b.removeCallbacks(fVar2.f284o);
        this.f268a.a();
        f fVar3 = this.f268a;
        fVar3.f274b.removeCallbacks(fVar3.f285p);
        if (!fVar3.e.isEmpty() && fVar3.f276g != null) {
            fVar3.f274b.post(fVar3.f285p);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f268a.f276g = null;
        f fVar = this.f268a;
        fVar.f274b.removeCallbacks(fVar.f285p);
        this.f268a.c();
        this.f268a.d();
    }
}
