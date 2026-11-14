package q0;

import android.content.Context;
import android.net.Network;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import org.json.JSONException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final String f5177n = e0.m.h(new byte[]{-103, 78, 13, -84, 67, 70, 31, 91, -101, 76, 33, -102, 95, 80}, new byte[]{-2, 62, 126, -13, 48, 35, 109, 45});

    /* renamed from: o, reason: collision with root package name */
    public static final String f5178o = e0.m.h(new byte[]{-41, 39, -7, -7, -63, -92, -67, 50, -30, 4, -27, -33, -42, -75, -82}, new byte[]{-112, 87, -118, -86, -92, -42, -53, 87});

    /* renamed from: a, reason: collision with root package name */
    public final Context f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final MockGpsService f5180b;

    /* renamed from: g, reason: collision with root package name */
    public volatile String f5182g;

    /* renamed from: i, reason: collision with root package name */
    public volatile Socket f5184i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f5185j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f5186k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f5187l;

    /* renamed from: m, reason: collision with root package name */
    public volatile c f5188m;
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final Object f5181f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile int f5183h = 8887;

    public d(MockGpsService mockGpsService, MockGpsService mockGpsService2) {
        this.f5179a = mockGpsService.getApplicationContext();
        this.f5180b = mockGpsService2;
    }

    public static void c(LinkedHashMap linkedHashMap, c cVar) {
        String network;
        Network network2 = cVar.f5176b;
        if (network2 == null) {
            network = e0.m.h(new byte[]{76, -106, -85, 97, 2, -121, 118}, new byte[]{40, -13, -51, 0, 119, -21, 2, 54});
        } else {
            network = network2.toString();
        }
        StringBuilder u8 = ai.onnxruntime.a.u(network);
        u8.append(e0.m.h(new byte[]{11}, new byte[]{119, -22, -8, 104, -57, 34, -106, 73}));
        u8.append(cVar.f5175a);
        linkedHashMap.putIfAbsent(u8.toString(), cVar);
    }

    public static void d(LinkedHashMap linkedHashMap, Inet4Address inet4Address, Network network) {
        byte[] address = inet4Address.getAddress();
        int i10 = address[3] & UByte.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        sb.append(address[0] & UByte.MAX_VALUE);
        sb.append(e0.m.h(new byte[]{64}, new byte[]{110, 45, -60, 25, -62, 94, -31, -15}));
        sb.append(address[1] & UByte.MAX_VALUE);
        sb.append(e0.m.h(new byte[]{126}, new byte[]{80, -7, 122, 121, -104, 83, 69, 2}));
        sb.append(address[2] & UByte.MAX_VALUE);
        String i11 = com.google.protobuf.q.i(new byte[]{65}, new byte[]{111, Base64.padSymbol, -3, -69, -118, 81, 117, 62}, sb);
        for (int i12 = 1; i12 <= 254; i12++) {
            if (i12 != i10) {
                c(linkedHashMap, new c(i11 + i12, network));
            }
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    @Override // q0.h
    public final String a() {
        String g10 = g(this.f5182g);
        if (g10 == null && this.f5188m != null) {
            g10 = this.f5188m.f5175a;
        }
        if (g10 == null) {
            return this.f5179a.getString(R.string.mock_gps_auto_wifi_gateway, Integer.valueOf(this.f5183h));
        }
        StringBuilder u8 = ai.onnxruntime.a.u(g10);
        u8.append(e0.m.h(new byte[]{34}, new byte[]{24, -12, 54, 40, 97, -61, 54, 75}));
        u8.append(this.f5183h);
        return u8.toString();
    }

    @Override // q0.h
    public final void b(j.i iVar) {
        boolean equals;
        String str = this.f5182g;
        int i10 = this.f5183h;
        this.f5182g = g((String) iVar.c);
        int i11 = iVar.f3015b;
        if (i11 <= 0 || i11 > 65535) {
            i11 = 8887;
        }
        this.f5183h = i11;
        String str2 = this.f5182g;
        String g10 = g(str);
        String g11 = g(str2);
        boolean z9 = false;
        if (g10 == null) {
            if (g11 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = g10.equals(g11);
        }
        if (!equals) {
            this.f5188m = null;
        }
        if (this.e.get()) {
            if (i10 == this.f5183h) {
                String str3 = this.f5182g;
                String g12 = g(str);
                String g13 = g(str3);
                if (g12 == null) {
                    if (g13 == null) {
                        z9 = true;
                    }
                } else {
                    z9 = g12.equals(g13);
                }
                if (z9) {
                    return;
                }
            }
            e(this.f5184i);
        }
    }

    public final void e(Socket socket) {
        if (socket == null) {
            return;
        }
        if (this.f5184i == socket) {
            this.f5184i = null;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    public final void f(c cVar, String str) {
        Socket createSocket;
        Double d;
        Float f8;
        Float f10;
        Network network = cVar.f5176b;
        if (network == null) {
            createSocket = new Socket();
        } else {
            createSocket = network.getSocketFactory().createSocket();
        }
        this.f5184i = createSocket;
        boolean z9 = true;
        createSocket.setTcpNoDelay(true);
        createSocket.setKeepAlive(true);
        createSocket.connect(new InetSocketAddress(cVar.f5175a, this.f5183h), 1200);
        this.f5185j = System.currentTimeMillis();
        this.f5186k = 0L;
        this.f5187l = false;
        MockGpsService mockGpsService = this.f5180b;
        Context context = this.f5179a;
        int i10 = R.string.mock_gps_connected;
        String string = context.getString(R.string.mock_gps_connected);
        mockGpsService.getClass();
        MockGpsService.j(string, str, true);
        synchronized (this.f5181f) {
            OutputStream outputStream = createSocket.getOutputStream();
            outputStream.write(1);
            outputStream.flush();
        }
        DataInputStream dataInputStream = new DataInputStream(createSocket.getInputStream());
        while (this.e.get() && !createSocket.isClosed()) {
            try {
                int readInt = dataInputStream.readInt();
                if (readInt > 0 && readInt <= 65536) {
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    this.f5185j = System.currentTimeMillis();
                    j4.b c = j4.b.c(bArr);
                    MockGpsService mockGpsService2 = this.f5180b;
                    String string2 = this.f5179a.getString(i10);
                    mockGpsService2.getClass();
                    MockGpsService.j(string2, str, z9);
                    b bVar = (b) c.d;
                    if (bVar != null) {
                        try {
                            double d10 = bVar.f5167b;
                            double d11 = bVar.c;
                            long j10 = bVar.f5166a;
                            Float f11 = null;
                            if (bVar.f5171i) {
                                d = Double.valueOf(bVar.d);
                            } else {
                                d = null;
                            }
                            if (bVar.f5172j) {
                                f8 = Float.valueOf(bVar.e);
                            } else {
                                f8 = null;
                            }
                            if (bVar.f5173k) {
                                f10 = Float.valueOf(bVar.f5168f);
                            } else {
                                f10 = null;
                            }
                            if (bVar.f5174l) {
                                f11 = Float.valueOf(bVar.f5169g);
                            }
                            int i11 = c.f3268b;
                            q a10 = q.a(d10, d11, j10, d, f8, f10, f11, i11, i11, 0, null, null, bVar.f5170h);
                            this.f5186k = System.currentTimeMillis();
                            this.f5187l = false;
                            this.f5180b.i(a10);
                        } catch (JSONException e) {
                            throw new IOException(this.f5179a.getString(R.string.mock_gps_ios_invalid_packet), e);
                        }
                    }
                    z9 = true;
                    i10 = R.string.mock_gps_connected;
                } else {
                    n0.b.A(this.f5179a.getString(R.string.mock_gps_ios_invalid_packet));
                    return;
                }
            } catch (EOFException e6) {
                throw new IOException(this.f5179a.getString(R.string.mock_gps_phone_connection_closed), e6);
            }
        }
    }

    @Override // q0.h
    public final String getTitle() {
        return this.f5179a.getString(R.string.mock_gps_source_ios_server);
    }

    @Override // q0.h
    public final String getType() {
        return f5177n;
    }

    @Override // q0.h
    public final void start() {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        final int i10 = 0;
        this.d.scheduleAtFixedRate(new Runnable(this) { // from class: q0.a
            public final /* synthetic */ d c;

            {
                this.c = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:221:0x0127, code lost:
            
                continue;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1306
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q0.a.run():void");
            }
        }, 1000L, 1000L, TimeUnit.MILLISECONDS);
        final int i11 = 1;
        this.c.execute(new Runnable(this) { // from class: q0.a
            public final /* synthetic */ d c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instructions count: 1306
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q0.a.run():void");
            }
        });
    }

    @Override // q0.h
    public final void stop() {
        this.e.set(false);
        e(this.f5184i);
        this.d.shutdownNow();
        this.c.shutdownNow();
    }
}
