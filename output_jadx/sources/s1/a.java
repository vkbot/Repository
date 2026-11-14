package s1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5461a;

    public a(b bVar) {
        this.f5461a = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f5461a;
        if (bVar.f5469j) {
            return;
        }
        bVar.f5466g = ((y) iBinder).c;
        bVar.a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar = this.f5461a;
        bVar.f5466g = null;
        bVar.f5474o = -1;
        bVar.f5472m = true;
        bVar.f(e0.m.h(new byte[]{-68, -54, 89, 17, -19, 36, -9, 35, -68, -45, 88, 37, 28, 116, -103, 65, -42, -69, 55, 116, -127, -124, -9, 47, -67, -23, 89, 30, -20, 31, -10, 31, -67, -20, 88, 53, -20, 25}, new byte[]{108, 107, -119, -92, 60, -92, 39, -111}));
    }
}
