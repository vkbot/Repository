package w0;

import com.example.navistart.cores.BTProxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i0 implements BTProxy.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6120b;
    public final /* synthetic */ l0 c;

    public i0(l0 l0Var, int i10, int i11) {
        this.c = l0Var;
        this.f6119a = i10;
        this.f6120b = i11;
    }

    @Override // com.example.navistart.cores.BTProxy.Listener
    public final void onContactsChanged(List list, int i10, int i11) {
        ArrayList arrayList;
        if (i11 >= 0) {
            if (i11 <= 0 || i10 >= i11 - 1) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(list);
                }
                this.c.g0(new m0.d1(this, this.f6119a, this.f6120b, arrayList));
            }
        }
    }

    @Override // com.example.navistart.cores.BTProxy.Listener
    public final void onError(String str, Throwable th) {
        this.c.g0(new p0.f(this, this.f6119a, this.f6120b, 2));
    }
}
