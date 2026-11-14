package q0;

import android.content.Context;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import e0.p3;
import e0.x1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5246a;

    /* renamed from: b, reason: collision with root package name */
    public final MockGpsService f5247b;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5248f;

    /* renamed from: h, reason: collision with root package name */
    public final String f5250h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5251i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5252j;

    /* renamed from: k, reason: collision with root package name */
    public final org.apache.commons.net.ftp.a f5253k;

    /* renamed from: l, reason: collision with root package name */
    public final n f5254l;

    /* renamed from: m, reason: collision with root package name */
    public volatile String f5255m;

    /* renamed from: o, reason: collision with root package name */
    public volatile Socket f5257o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f5258p;
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final int f5249g = 11010;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f5256n = 11010;

    public r(MockGpsService mockGpsService, MockGpsService mockGpsService2, String str, String str2, String str3, String str4, String str5, org.apache.commons.net.ftp.a aVar, String str6) {
        this.f5246a = mockGpsService.getApplicationContext();
        this.f5247b = mockGpsService2;
        this.e = str;
        this.f5248f = str2;
        this.f5250h = str3;
        this.f5251i = str4;
        this.f5252j = str5;
        this.f5253k = aVar;
        this.f5254l = new n(str6);
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
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{101}, new byte[]{85, 118, -111, 22, -120, 104, 29, 100}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    @Override // q0.h
    public final String a() {
        int i10;
        int i11;
        String g10 = g();
        if (g10 == null) {
            Context context = this.f5246a;
            String str = this.f5250h;
            if (this.f5256n > 0) {
                i11 = this.f5256n;
            } else {
                i11 = this.f5249g;
            }
            return context.getString(R.string.mock_gps_target_with_port, str, Integer.valueOf(i11));
        }
        if (this.f5256n > 0) {
            i10 = this.f5256n;
        } else {
            i10 = this.f5249g;
        }
        return f(i10, g10);
    }

    @Override // q0.h
    public final void b(j.i iVar) {
        String trim;
        String str = this.f5255m;
        int i10 = this.f5256n;
        this.f5255m = (String) iVar.c;
        int i11 = iVar.f3015b;
        if (i11 > 0 && i11 <= 65535) {
            this.f5256n = i11;
        }
        if (this.d.get()) {
            if (i10 == this.f5256n) {
                String str2 = this.f5255m;
                String str3 = "";
                if (str == null) {
                    trim = "";
                } else {
                    trim = str.trim();
                }
                if (str2 != null) {
                    str3 = str2.trim();
                }
                if (trim.equals(str3)) {
                    return;
                }
            }
            d();
        }
    }

    public final void d() {
        Socket socket = this.f5257o;
        this.f5257o = null;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void e(String str, String str2) {
        int i10;
        String readLine;
        Socket socket = new Socket();
        this.f5257o = socket;
        if (this.f5256n > 0) {
            i10 = this.f5256n;
        } else {
            i10 = this.f5249g;
        }
        socket.connect(new InetSocketAddress(str, i10), 1200);
        socket.setSoTimeout(1200);
        MockGpsService mockGpsService = this.f5247b;
        String string = this.f5246a.getString(R.string.mock_gps_connected);
        mockGpsService.getClass();
        MockGpsService.j(string, str2, true);
        long currentTimeMillis = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        long j10 = 0;
        while (this.d.get() && !socket.isClosed()) {
            try {
                readLine = bufferedReader.readLine();
            } catch (SocketTimeoutException unused) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (j10 > 0 && currentTimeMillis2 - j10 > 4000) {
                    this.f5247b.g();
                    MockGpsService mockGpsService2 = this.f5247b;
                    String string2 = this.f5246a.getString(R.string.mock_gps_connected_stale);
                    mockGpsService2.getClass();
                    MockGpsService.j(string2, str2, true);
                    j10 = 0;
                }
                if (currentTimeMillis2 - currentTimeMillis > 8000) {
                    n0.b.A(this.f5246a.getString(R.string.mock_gps_no_nmea_data));
                    return;
                }
            }
            if (readLine != null) {
                String trim = readLine.trim();
                if (!trim.isEmpty()) {
                    currentTimeMillis = System.currentTimeMillis();
                    q c = this.f5254l.c(trim);
                    if (c != null) {
                        j10 = System.currentTimeMillis();
                        this.f5247b.i(c);
                    }
                }
            } else {
                throw new IOException(this.f5246a.getString(R.string.mock_gps_source_connection_closed));
                break;
            }
        }
    }

    public final String f(int i10, String str) {
        if (str.trim().isEmpty()) {
            return this.f5246a.getString(R.string.mock_gps_target_with_port, this.f5250h, Integer.valueOf(i10));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.trim());
        return com.google.protobuf.q.j(new byte[]{5}, new byte[]{63, 108, 122, -84, -45, 8, 78, -59}, sb, i10);
    }

    public final String g() {
        if (this.f5255m != null && !this.f5255m.trim().isEmpty()) {
            return this.f5255m.trim();
        }
        org.apache.commons.net.ftp.a aVar = this.f5253k;
        if (aVar == null) {
            return null;
        }
        Context context = this.f5246a;
        aVar.getClass();
        String g10 = y5.k.g(context);
        if (g10 != null) {
            return g10;
        }
        return y5.k.e(context);
    }

    @Override // q0.h
    public final String getTitle() {
        return this.f5248f;
    }

    @Override // q0.h
    public final String getType() {
        return this.e;
    }

    @Override // q0.h
    public final void start() {
        if (!this.d.compareAndSet(false, true)) {
            return;
        }
        if (!this.f5258p) {
            try {
                if (c().booleanValue()) {
                    this.f5258p = true;
                }
            } catch (Exception unused) {
            }
        }
        this.c.execute(new f5.j(13, this));
    }

    @Override // q0.h
    public final void stop() {
        this.d.set(false);
        d();
        this.c.shutdownNow();
    }
}
