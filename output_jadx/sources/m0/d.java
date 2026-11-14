package m0;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3640b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ l0.b e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f3641f;

    public /* synthetic */ d(i iVar, int i10, boolean z9, String str) {
        this.e = iVar;
        this.c = i10;
        this.d = z9;
        this.f3641f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3640b) {
            case 0:
                i iVar = (i) this.e;
                int i10 = this.c;
                boolean z9 = this.d;
                String str = (String) this.f3641f;
                if (i10 == iVar.f3731j && iVar.isAdded()) {
                    iVar.f3730i = false;
                    if (z9) {
                        iVar.f3729h = false;
                    }
                    iVar.f3726b.setEnabled(true);
                    iVar.u();
                    iVar.d.setText(str);
                    return;
                }
                return;
            default:
                n3 n3Var = (n3) this.e;
                int i11 = this.c;
                ArrayList arrayList = (ArrayList) this.f3641f;
                boolean z10 = this.d;
                ArrayList arrayList2 = n3Var.f3804b;
                if (i11 == n3Var.f3806g && n3Var.f3807h != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    n3Var.t = false;
                    n3Var.f3818u = z10;
                    n3Var.u();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(n3 n3Var, int i10, ArrayList arrayList, boolean z9) {
        this.e = n3Var;
        this.c = i10;
        this.f3641f = arrayList;
        this.d = z9;
    }
}
