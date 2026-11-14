package y0;

import android.content.Intent;
import android.net.Uri;
import com.example.navistart.Transport.TransportService;
import com.google.protobuf.q;
import java.util.List;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import s1.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6583a;

    public /* synthetic */ a(b bVar) {
        this.f6583a = bVar;
    }

    @Override // y0.e
    public void a(String str) {
        b bVar = this.f6583a;
        bVar.c.post(new x0(15, bVar, str));
    }

    public String b(j7.b bVar) {
        c1.a b10;
        TransportService transportService = this.f6583a.f6584b;
        j7.a aVar = bVar.d;
        List list = bVar.e;
        if (aVar == null) {
            b10 = c1.c.c(transportService, bVar.f3322b);
        } else {
            int size = list.size();
            c1.b[] bVarArr = new c1.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                j7.a aVar2 = (j7.a) list.get(i10);
                bVarArr[i10] = new c1.b(aVar2.f3319a, aVar2.f3320b);
            }
            c1.b bVar2 = new c1.b(aVar.f3319a, aVar.f3320b);
            String str = c1.c.f451a;
            e0.m.h(new byte[]{-3, -63}, new byte[]{-119, -82, 43, 30, 55, 63, -41, 0});
            e0.m.h(new byte[]{-46, 92, -81}, new byte[]{-92, 53, -50, 103, 104, 100, 92, 99});
            Uri.Builder authority = new Uri.Builder().scheme(e0.m.h(new byte[]{-91, -95, -37, 25, 103, 33, 125, 13, -86, -87}, new byte[]{-36, -64, -75, 125, 2, 89, 19, 108})).authority(e0.m.h(new byte[]{-9, -35, -100, 20, 24, 56, -52, -103, -32, -36, -112, 39, 19, 9, -31, -101, -12, -40}, new byte[]{-107, -88, -11, 120, 124, 103, -66, -10}));
            authority.appendQueryParameter(e0.m.h(new byte[]{49, 6, -87, 24, -66, -68, 89, -87, 52, 27, -81, 11, -66, -118, 88, -90}, new byte[]{66, 114, -56, 106, -54, -29, 55, -56}), Boolean.toString(true));
            authority.appendQueryParameter(e0.m.h(new byte[]{-120, 116, 38}, new byte[]{-6, 0, 82, 70, 14, 31, -50, -28}), e0.m.h(new byte[]{108, 86, 26, 29}, new byte[]{13, 35, 110, 114, 112, -53, 115, 83}));
            c1.c.a(authority, e0.m.h(new byte[]{37, 109}, new byte[]{81, 2, 88, -78, 115, -116, 65, -45}), bVar2);
            for (int i11 = 0; i11 < size; i11++) {
                String j10 = q.j(new byte[]{-33, -118, 89, 121}, new byte[]{-87, -29, 56, 38, 21, -40, -20, -92}, new StringBuilder(), i11);
                c1.b bVar3 = bVarArr[i11];
                StringBuilder sb = new StringBuilder();
                q.t(new byte[]{64, 14, 56, 26}, new byte[]{54, 103, 89, 65, -71, 84, -40, 51}, sb, i11);
                sb.append(e0.m.h(new byte[]{104}, new byte[]{53, -19, 82, 7, -15, 69, -6, -52}));
                Objects.requireNonNull(bVar3, sb.toString());
                c1.c.a(authority, j10, bVar3);
            }
            b10 = c1.c.b(transportService, new Intent(e0.m.h(new byte[]{58, 27, 74, 48, -19, 97, -126, -88, 50, 27, 90, 39, -20, 124, -56, -25, 56, 1, 71, 45, -20, 38, -80, -49, 30, 34}, new byte[]{91, 117, 46, 66, -126, 8, -26, -122}), authority.build()).setPackage(c1.c.f451a));
        }
        if (b10 == c1.a.f448b) {
            if (aVar == null) {
                return e0.m.h(new byte[]{-46, 21, 29, 50, 76, 64, -80, 24, -60, 30, 8}, new byte[]{-95, 112, 124, 64, 47, 40, -17, 107});
            }
            return e0.m.h(new byte[]{0, 117, -27, 38, 64, 68, 112, 11, 28, 110}, new byte[]{114, 26, -112, 82, 37, 27, 3, 110});
        }
        if (b10 == c1.a.c) {
            return e0.m.h(new byte[]{-34, 45, -81, 46, -105, -110, 20, -109, -36, 35, -71, 29, -109}, new byte[]{-80, 66, -37, 113, -10, -28, 117, -6});
        }
        return e0.m.h(new byte[]{-43, -4, 30, 68, 84, -42, -86, 66, -54, -9, 51, 77, 88, -53, -80, 78, -63}, new byte[]{-91, -103, 108, 41, Base64.padSymbol, -91, -39, 43});
    }
}
