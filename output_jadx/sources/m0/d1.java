package m0;

import com.example.navistart.cores.BTProxy;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3647b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3648f;

    public /* synthetic */ d1(e1 e1Var, h1 h1Var, int i10, int i11) {
        this.e = e1Var;
        this.f3648f = h1Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = 0;
        switch (this.f3647b) {
            case 0:
                e1 e1Var = (e1) this.e;
                h1 h1Var = (h1) this.f3648f;
                int i11 = this.c;
                int i12 = this.d;
                StringBuilder sb = new StringBuilder();
                sb.append(i11);
                h1Var.f3717j = com.google.protobuf.q.i(new byte[]{106}, new byte[]{79, -104, -67, 101, -78, 1, -87, 23}, sb);
                i1.v((i1) e1Var.f3675i, i12);
                return;
            default:
                w0.i0 i0Var = (w0.i0) this.e;
                int i13 = this.c;
                int i14 = this.d;
                ArrayList arrayList = (ArrayList) this.f3648f;
                if (i0Var.c.y(i13, i14)) {
                    w0.l0 l0Var = i0Var.c;
                    if (l0Var.f6173s == null && l0Var.r) {
                        if (l0Var.j0()) {
                            w0.l0 l0Var2 = i0Var.c;
                            synchronized (l0Var2) {
                                String str2 = l0Var2.f6167l;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    BTProxy.Contact contact = (BTProxy.Contact) obj;
                                    if (contact != null && (str = contact.bluetoothAddress) != null && !str.isEmpty()) {
                                        if (str2.isEmpty() || str2.equalsIgnoreCase(contact.bluetoothAddress)) {
                                            str2 = contact.bluetoothAddress.toUpperCase(Locale.ROOT);
                                        }
                                    }
                                }
                                l0Var2.f6167l = str2;
                                w0.w0 w0Var = new w0.w0(arrayList);
                                if (i0Var.c.y(i13, i14)) {
                                    w0.l0 l0Var3 = i0Var.c;
                                    l0Var3.f6173s = w0Var;
                                    if (l0Var3.c(l0Var3.f6172q)) {
                                        w0.l0 l0Var4 = i0Var.c;
                                        w0.n0 n0Var = l0Var4.f6161f;
                                        w0.m0 m0Var = n0Var.f6191a;
                                        if (m0Var == w0.m0.d || m0Var == w0.m0.e) {
                                            n.p pVar = l0Var4.c;
                                            n0Var.c = l0Var4.f6173s;
                                            n0Var.f6195h = true;
                                            pVar.f(n0Var.f());
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        i0Var.c.b(w0.k0.c, i13, i14);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d1(w0.i0 i0Var, int i10, int i11, ArrayList arrayList) {
        this.e = i0Var;
        this.c = i10;
        this.d = i11;
        this.f3648f = arrayList;
    }
}
