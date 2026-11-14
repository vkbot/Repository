package l7;

import android.content.Context;
import com.example.navistart.R;
import com.example.navistart.VJCT;
import com.wireguard.android.backend.GoBackend;
import d2.h;
import e0.m;
import f7.c;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3546b;
    public final /* synthetic */ h c;

    public /* synthetic */ a(h hVar, int i10) {
        this.f3546b = i10;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        int i10 = this.f3546b;
        h hVar = this.c;
        switch (i10) {
            case 0:
                hVar.getClass();
                try {
                    GoBackend goBackend = (GoBackend) hVar.d;
                    if (goBackend != null && (cVar = (c) hVar.e) != null) {
                        goBackend.c(3, cVar, (r5.c) hVar.f1741f);
                    } else {
                        hVar.q();
                    }
                    return;
                } catch (Exception e) {
                    e.getMessage();
                    return;
                }
            case 1:
                try {
                    GoBackend goBackend2 = (GoBackend) hVar.d;
                    if (goBackend2 != null) {
                        goBackend2.c(2, (c) hVar.e, (r5.c) hVar.f1741f);
                    } else {
                        hVar.q();
                    }
                    return;
                } catch (Exception unused) {
                    VJCT.u(((Context) hVar.c).getResources().getString(R.string.vpn_start_not_perm));
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(m.h(new byte[]{-44, 92, 70, -113}, new byte[]{-122, 36, 124, -81, -37, -114, 62, 27}));
                Iterator it = ((GoBackend) hVar.d).b((r5.c) hVar.f1741f).f626a.values().iterator();
                long j10 = 0;
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ((d7.c) it.next()).f1854a;
                }
                sb.append(j11);
                sb.append(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -30, -25, 20, 65}, new byte[]{-96, -74, -97, 46, 97, -84, -122, 85}));
                Iterator it2 = ((GoBackend) hVar.d).b((r5.c) hVar.f1741f).f626a.values().iterator();
                while (it2.hasNext()) {
                    j10 += ((d7.c) it2.next()).f1855b;
                }
                sb.append(j10);
                VJCT.u(sb.toString());
                return;
        }
    }
}
