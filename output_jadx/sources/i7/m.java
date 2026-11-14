package i7;

import com.example.navistart.LocServ;
import e0.h1;
import e0.p3;
import e0.x1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static ArrayList f2810k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final LocServ f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2812b;
    public final g e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2813f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2814g;

    /* renamed from: h, reason: collision with root package name */
    public h1 f2815h;
    public final WeakHashMap c = new WeakHashMap();
    public double d = 0.0d;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f2816i = Boolean.TRUE;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2817j = e0.w.c(-1, e0.m.h(new byte[]{41, 107, 50, 54, -123, 87, -122, -60, 7, 126, 51}, new byte[]{110, 27, 65, 120, -22, 35, -17, -94}));

    public m(LocServ locServ) {
        this.f2811a = locServ;
        this.f2814g = new j(locServ);
        this.e = new g(locServ);
        i iVar = new i(0);
        iVar.f2803b = new ArrayList();
        this.f2813f = iVar;
        this.f2815h = new h1(this);
        this.f2812b = h0.b.o().loadInt(e0.m.h(new byte[]{-45, -18, 81, 94, 44, 66}, new byte[]{-127, -81, 21, 23, 121, 17, 0, -119}), 1500);
    }

    public static Boolean a() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-36}, new byte[]{-20, -1, -2, -28, 12, 70, -18, 76}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }
}
