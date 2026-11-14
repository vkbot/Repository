package q0;

import android.content.Context;
import android.util.Log;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import com.example.navistart.Transport.TransportService;
import e0.d2;
import e0.p3;
import e0.x1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.b3;
import org.json.JSONException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final String f5223o = e0.m.h(new byte[]{55, 50, -75, -74, -127, 26, 70, 100, 55}, new byte[]{71, 90, -38, -40, -28, 69, 39, 20});

    /* renamed from: p, reason: collision with root package name */
    public static final String f5224p = e0.m.h(new byte[]{119, -17, -1, -94, 40, -120, 97, 107, 96, -9, -29, -97, 34, -68, 99, 120, 66}, new byte[]{39, -121, -112, -52, 77, -55, 17, 27});

    /* renamed from: a, reason: collision with root package name */
    public final Context f5225a;

    /* renamed from: b, reason: collision with root package name */
    public final MockGpsService f5226b;
    public volatile boolean e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f5227f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f5228g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f5229h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f5230i;

    /* renamed from: k, reason: collision with root package name */
    public y0.d f5232k;

    /* renamed from: l, reason: collision with root package name */
    public y0.d f5233l;

    /* renamed from: m, reason: collision with root package name */
    public y0.d f5234m;

    /* renamed from: n, reason: collision with root package name */
    public y0.h f5235n;
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f5231j = true;

    public p(MockGpsService mockGpsService, MockGpsService mockGpsService2) {
        this.f5225a = mockGpsService.getApplicationContext();
        this.f5226b = mockGpsService2;
    }

    public static Boolean c() {
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
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{107}, new byte[]{91, 73, -28, 22, 64, 24, 37, -19}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    @Override // q0.h
    public final String a() {
        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
        String str = TransportService.f920y;
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        return this.f5225a.getString(R.string.transport_title);
    }

    public final void d(boolean z9) {
        y0.h hVar = this.f5235n;
        if (hVar != null && this.f5227f) {
            try {
                hVar.c(e0.m.h(new byte[]{100, -29, -120, 52, -60, 117, -37, 33, 100, -65, -103, 40, -46, 118, -47, Base64.padSymbol, 115, -12, -57, Base64.padSymbol, -57, 118}, new byte[]{16, -111, -23, 90, -73, 5, -76, 83}), com.bumptech.glide.d.e(e0.m.h(new byte[]{75, -33, 78}, new byte[]{44, -81, Base64.padSymbol, -61, -2, 103, 112, 119}), z9));
            } catch (RuntimeException | JSONException e) {
                Log.w(f5224p, e0.m.h(new byte[]{-112, -119, -90, -54, -111, 29, -81, -81, -86, -57, -73, -35, -97, 20, -26, -88, -83, -57, ByteCompanionObject.MIN_VALUE, -8, -82, 88, -1, -87, -96, -108, -94, -58, -98, 29}, new byte[]{-59, -25, -57, -88, -3, 120, -113, -37}), e);
            }
        }
    }

    public final void e() {
        y0.h hVar = this.f5235n;
        if (hVar != null && this.f5227f) {
            try {
                hVar.c(e0.m.h(new byte[]{55, 6, -118, 50, 69, 11, -5, -6, 62, 18}, new byte[]{80, 118, -7, 28, 33, 110, -106, -101}), com.bumptech.glide.d.e(e0.m.h(new byte[]{88, 124, -83}, new byte[]{63, 12, -34, -112, 67, 78, -13, 87}), this.f5231j));
            } catch (RuntimeException | JSONException e) {
                Log.w(f5224p, e0.m.h(new byte[]{27, -102, -41, -18, 37, 54, 22, -47, 33, -44, -58, -7, 43, 63, 95, -42, 38, -44, -15, -36, 26, 115, 82, -64, 35, -107, -40, -24}, new byte[]{78, -12, -74, -116, 73, 83, 54, -91}), e);
            }
        }
    }

    @Override // q0.h
    public final String getTitle() {
        return this.f5225a.getString(R.string.mock_gps_source_phone_app);
    }

    @Override // q0.h
    public final String getType() {
        return f5223o;
    }

    @Override // q0.h
    public final void start() {
        final int i10 = 0;
        final int i11 = 1;
        if (!this.d.compareAndSet(false, true)) {
            return;
        }
        if (!this.e) {
            try {
                if (c().booleanValue()) {
                    this.e = true;
                }
            } catch (Exception unused) {
            }
        }
        this.f5235n = y0.g.a(this.f5225a, e0.m.h(new byte[]{-29, 70, -11, -109, -30, 97, -31, 99, -25, 83}, new byte[]{-124, 54, -122, -66, -111, 14, -108, 17}));
        this.f5232k = y0.g.e(e0.m.h(new byte[]{-126, 80, 36, 97, 37, 46, 126, 44, -111, 73, 56, 33}, new byte[]{-27, 32, 87, 79, 73, 65, 29, 77}), new y0.e(this) { // from class: q0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f5222b;

            {
                this.f5222b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                boolean z9;
                switch (i10) {
                    case 0:
                        p pVar = this.f5222b;
                        if (pVar.d.get()) {
                            try {
                                q b10 = q.b(str);
                                if (b10 != null) {
                                    pVar.f5229h = System.currentTimeMillis();
                                    pVar.f5230i = false;
                                    MockGpsService mockGpsService = pVar.f5226b;
                                    String string = pVar.f5225a.getString(R.string.mock_gps_connected);
                                    String a10 = pVar.a();
                                    mockGpsService.getClass();
                                    MockGpsService.j(string, a10, true);
                                    pVar.f5226b.i(b10);
                                    return;
                                }
                                return;
                            } catch (JSONException e) {
                                Log.w(p.f5224p, com.google.protobuf.q.l(new byte[]{-62, -12, 48, 68, -123, 27, -101, 98, -13, -27, 59, 22, -123, 73, -67, 92, -45, -75, 36, 5, -110, 2, -97, 120, -70, -75}, new byte[]{ByteCompanionObject.MIN_VALUE, -107, 84, 100, -15, 105, -6, 12}, new StringBuilder(), str), e);
                                return;
                            }
                        }
                        return;
                    default:
                        p pVar2 = this.f5222b;
                        if (pVar2.d.get()) {
                            try {
                                b3 c = com.bumptech.glide.d.c(str);
                                if (e0.m.h(new byte[]{90, -55, -21}, new byte[]{Base64.padSymbol, -71, -104, ByteCompanionObject.MIN_VALUE, 23, -112, 112, -5}).equals(c.f3611b)) {
                                    pVar2.f5228g = c.f3610a;
                                    if (c.f3610a) {
                                        pVar2.d(true);
                                        pVar2.e();
                                    }
                                    if (pVar2.f5227f && pVar2.f5228g) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    MockGpsService mockGpsService2 = pVar2.f5226b;
                                    Context context = pVar2.f5225a;
                                    if (z9) {
                                        String string2 = context.getString(R.string.mock_gps_connecting);
                                        String a11 = pVar2.a();
                                        mockGpsService2.getClass();
                                        MockGpsService.j(string2, a11, true);
                                        return;
                                    }
                                    String string3 = context.getString(R.string.mock_gps_connecting);
                                    String a12 = pVar2.a();
                                    mockGpsService2.getClass();
                                    MockGpsService.j(string3, a12, false);
                                    pVar2.f5226b.h();
                                    return;
                                }
                                return;
                            } catch (RuntimeException e6) {
                                e = e6;
                                Log.w(p.f5224p, e0.m.h(new byte[]{33, 39, 63, -126, 93, -12, 43, 25, 19, 52, 62, -47, ByteCompanionObject.MAX_VALUE, -54, 27, 92, 67, 54, 58, -63, 113, -63, 12}, new byte[]{99, 70, 91, -94, 26, -92, 120, 57}), e);
                                return;
                            } catch (JSONException e10) {
                                e = e10;
                                Log.w(p.f5224p, e0.m.h(new byte[]{33, 39, 63, -126, 93, -12, 43, 25, 19, 52, 62, -47, ByteCompanionObject.MAX_VALUE, -54, 27, 92, 67, 54, 58, -63, 113, -63, 12}, new byte[]{99, 70, 91, -94, 26, -92, 120, 57}), e);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        this.f5234m = y0.g.e(e0.m.h(new byte[]{-58, -34, -70, -106, 90, -68, -119, -91, -58, -126, -85, -118, 76, -65, -125, -71, -47, -55, -11, -97, 89, -65}, new byte[]{-78, -84, -37, -8, 41, -52, -26, -41}), new y0.e(this) { // from class: q0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f5222b;

            {
                this.f5222b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                boolean z9;
                switch (i11) {
                    case 0:
                        p pVar = this.f5222b;
                        if (pVar.d.get()) {
                            try {
                                q b10 = q.b(str);
                                if (b10 != null) {
                                    pVar.f5229h = System.currentTimeMillis();
                                    pVar.f5230i = false;
                                    MockGpsService mockGpsService = pVar.f5226b;
                                    String string = pVar.f5225a.getString(R.string.mock_gps_connected);
                                    String a10 = pVar.a();
                                    mockGpsService.getClass();
                                    MockGpsService.j(string, a10, true);
                                    pVar.f5226b.i(b10);
                                    return;
                                }
                                return;
                            } catch (JSONException e) {
                                Log.w(p.f5224p, com.google.protobuf.q.l(new byte[]{-62, -12, 48, 68, -123, 27, -101, 98, -13, -27, 59, 22, -123, 73, -67, 92, -45, -75, 36, 5, -110, 2, -97, 120, -70, -75}, new byte[]{ByteCompanionObject.MIN_VALUE, -107, 84, 100, -15, 105, -6, 12}, new StringBuilder(), str), e);
                                return;
                            }
                        }
                        return;
                    default:
                        p pVar2 = this.f5222b;
                        if (pVar2.d.get()) {
                            try {
                                b3 c = com.bumptech.glide.d.c(str);
                                if (e0.m.h(new byte[]{90, -55, -21}, new byte[]{Base64.padSymbol, -71, -104, ByteCompanionObject.MIN_VALUE, 23, -112, 112, -5}).equals(c.f3611b)) {
                                    pVar2.f5228g = c.f3610a;
                                    if (c.f3610a) {
                                        pVar2.d(true);
                                        pVar2.e();
                                    }
                                    if (pVar2.f5227f && pVar2.f5228g) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    MockGpsService mockGpsService2 = pVar2.f5226b;
                                    Context context = pVar2.f5225a;
                                    if (z9) {
                                        String string2 = context.getString(R.string.mock_gps_connecting);
                                        String a11 = pVar2.a();
                                        mockGpsService2.getClass();
                                        MockGpsService.j(string2, a11, true);
                                        return;
                                    }
                                    String string3 = context.getString(R.string.mock_gps_connecting);
                                    String a12 = pVar2.a();
                                    mockGpsService2.getClass();
                                    MockGpsService.j(string3, a12, false);
                                    pVar2.f5226b.h();
                                    return;
                                }
                                return;
                            } catch (RuntimeException e6) {
                                e = e6;
                                Log.w(p.f5224p, e0.m.h(new byte[]{33, 39, 63, -126, 93, -12, 43, 25, 19, 52, 62, -47, ByteCompanionObject.MAX_VALUE, -54, 27, 92, 67, 54, 58, -63, 113, -63, 12}, new byte[]{99, 70, 91, -94, 26, -92, 120, 57}), e);
                                return;
                            } catch (JSONException e10) {
                                e = e10;
                                Log.w(p.f5224p, e0.m.h(new byte[]{33, 39, 63, -126, 93, -12, 43, 25, 19, 52, 62, -47, ByteCompanionObject.MAX_VALUE, -54, 27, 92, 67, 54, 58, -63, 113, -63, 12}, new byte[]{99, 70, 91, -94, 26, -92, 120, 57}), e);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        d2 d2Var = new d2(1, this);
        y0.g.f6592b.add(d2Var);
        d2Var.a(TransportService.f919x.get());
        this.f5233l = new y0.d(1, d2Var);
        this.c.execute(new f5.j(12, this));
    }

    @Override // q0.h
    public final void stop() {
        this.d.set(false);
        y0.d dVar = this.f5232k;
        if (dVar != null) {
            try {
                ai.onnxruntime.a.A(dVar);
            } catch (Exception unused) {
            }
        }
        this.f5232k = null;
        y0.d dVar2 = this.f5233l;
        if (dVar2 != null) {
            try {
                ai.onnxruntime.a.A(dVar2);
            } catch (Exception unused2) {
            }
        }
        this.f5233l = null;
        d(false);
        y0.d dVar3 = this.f5234m;
        if (dVar3 != null) {
            try {
                ai.onnxruntime.a.A(dVar3);
            } catch (Exception unused3) {
            }
        }
        this.f5234m = null;
        y0.h hVar = this.f5235n;
        if (hVar != null) {
            hVar.close();
            this.f5235n = null;
        }
        this.c.shutdownNow();
    }

    @Override // q0.h
    public final void b(j.i iVar) {
    }
}
