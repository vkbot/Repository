package com.example.navistart.Transport;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.example.navistart.R;
import com.example.navistart.Transport.TransportService;
import com.example.navistart.cores.ColorText;
import e0.d2;
import e0.m;
import e0.s3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import s1.x0;
import w0.d;
import y0.b;
import y0.g;
import y0.i;
import y0.j;
import y0.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class TransportService extends Service {

    /* renamed from: p, reason: collision with root package name */
    public static final String f914p = m.h(new byte[]{29, 54, 30, -45, 67, 102, -7, -52, 39, 58, 24, -13}, new byte[]{87, 85, 106, -121, 49, 7, -105, -65});

    /* renamed from: q, reason: collision with root package name */
    public static final String f915q = m.h(new byte[]{70, -101, -6, 75, 45, 91, 75, 56, 85, -104, -14, 75, 38, 66, 92, 60, 86, ByteCompanionObject.MIN_VALUE, -10, 23, 60, 13, 94, 39, 68, -102, -28, 21, 39, 81, 94, 123, 100, -73, -58, 48, 1, 113, 111}, new byte[]{37, -12, -105, 101, 72, 35, 42, 85});
    public static final String r = m.h(new byte[]{-61, 79, -108, -60, -99, -104, -92, -113, -48, 76, -100, -60, -106, -127, -77, -117, -45, 84, -104, -104, -116, -50, -79, -112, -63, 78, -118, -102, -105, -110, -79, -52, -16, 117, -69, -90, -79, -77, -115}, new byte[]{-96, 32, -7, -22, -8, -32, -59, -30});

    /* renamed from: s, reason: collision with root package name */
    public static final String f916s = m.h(new byte[]{-120, -28, 101, 28, -94, -97, 81}, new byte[]{-21, -116, 4, 114, -52, -6, Base64.padSymbol, 59});
    public static final String t = m.h(new byte[]{-67, 91, 48, 115, -42, -11, 5}, new byte[]{-51, 58, 73, 31, -71, -108, 97, 63});

    /* renamed from: u, reason: collision with root package name */
    public static final String f917u = m.h(new byte[]{-115, -2, -65, 126, ByteCompanionObject.MAX_VALUE, 111, 52, -14}, new byte[]{-23, -101, -45, 23, 9, 10, 70, -117});

    /* renamed from: v, reason: collision with root package name */
    public static final String f918v = m.h(new byte[]{92, -37, 80, 34, 88, 46, -77, -1, 69, -56, 75, 15, 88}, new byte[]{54, -72, 36, 125, 44, 92, -46, -111});
    public static final AtomicBoolean w = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicBoolean f919x = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public static volatile String f920y = "";

    /* renamed from: z, reason: collision with root package name */
    public static volatile TransportService f921z;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f924g;

    /* renamed from: h, reason: collision with root package name */
    public ExecutorService f925h;

    /* renamed from: i, reason: collision with root package name */
    public ExecutorService f926i;

    /* renamed from: j, reason: collision with root package name */
    public ScheduledExecutorService f927j;

    /* renamed from: k, reason: collision with root package name */
    public b f928k;

    /* renamed from: l, reason: collision with root package name */
    public volatile s3 f929l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f930m;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f931n;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f922b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView d = ConcurrentHashMap.newKeySet();
    public final AtomicLong e = new AtomicLong(System.currentTimeMillis());

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f923f = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f932o = new ConcurrentHashMap();

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String e(Throwable th) {
        String concat;
        if (th == null) {
            return m.h(new byte[]{48, -11, -91, -96, 35, 17, 86, 92, 32, -23, -68, -95, 62}, new byte[]{69, -101, -50, -50, 76, 102, 56, 124});
        }
        String message = th.getMessage();
        String simpleName = th.getClass().getSimpleName();
        if (message == null) {
            concat = "";
        } else {
            concat = m.h(new byte[]{121, 60}, new byte[]{67, 28, 83, 86, 86, -85, 56, 0}).concat(message);
        }
        return simpleName.concat(concat);
    }

    public final Notification a(String str) {
        String string;
        if (str == null) {
            string = getString(R.string.transport_waiting_for_phone);
        } else {
            string = getString(R.string.transport_connected_via, str);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return d.b(this, f918v).setSmallIcon(R.drawable.ic_transport).setContentTitle(getString(R.string.transport_title)).setContentText(string).setOnlyAlertOnce(true).setOngoing(true).build();
        }
        return new Notification.Builder(this).setSmallIcon(R.drawable.ic_transport).setContentTitle(getString(R.string.transport_title)).setContentText(string).setOnlyAlertOnce(true).setOngoing(true).build();
    }

    public final s3 c() {
        BluetoothDevice bluetoothDevice;
        ExecutionException e;
        Throwable e6;
        BluetoothSocket bluetoothSocket;
        Future future;
        if (Build.VERSION.SDK_INT >= 31 && checkSelfPermission(m.h(new byte[]{4, -43, -113, -39, -107, -31, -52, -114, 21, -34, -103, -58, -109, -5, -37, -55, 10, -43, -59, -23, -74, -35, -19, -12, 42, -12, -65, -29, -91, -53, -25, -18, 43, -2, -88, -1}, new byte[]{101, -69, -21, -85, -6, -120, -88, -96})) != 0) {
            i(m.h(new byte[]{108, -123, 67, -58, -25, 64, 106, -50, 102, -106, 85, -52, -3, 65, 96, -39, 122, -23, 102, -26, -63, 98, 76, -23, 93, -96, 121, -19, -109, 98, 76, -23, 93, -96, 120, -28}, new byte[]{46, -55, 22, -125, -77, 15, 37, -102}));
            return null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            i(m.h(new byte[]{-66, -80, -84, -8, -5, 85, 102, -122, -108, -4, -72, -7, -18, 74, 125, -105, -114, -4, -84, -13, -18, 76, 104, -101, -112, -67, -69, -15, -22}, new byte[]{-4, -36, -39, -99, -113, 58, 9, -14}));
            return null;
        }
        if (!defaultAdapter.isEnabled()) {
            i(m.h(new byte[]{7, -83, -103, 58, -99, 36, 24, -42, 45, -31, -123, 44, -55, 47, 30, -47, 36, -93, ByteCompanionObject.MIN_VALUE, 58, -115}, new byte[]{69, -63, -20, 95, -23, 75, 119, -94}));
            return null;
        }
        String d = y0.m.d(y0.m.c(this).getString(y0.m.e, ""));
        if (d != null && !d.trim().isEmpty()) {
            String trim = d.trim();
            try {
                Iterator<BluetoothDevice> it = defaultAdapter.getBondedDevices().iterator();
                while (it.hasNext()) {
                    bluetoothDevice = it.next();
                    if (trim.equals(bluetoothDevice.getName())) {
                        break;
                    }
                }
            } catch (SecurityException e10) {
                i(m.h(new byte[]{-68, 53, 49, 10, -126, -8, 2, -28, -100, 55, 58, 23, -98, -84, 82, -28, -106, 38, 58, 0, -51, -24, 71, -13, -106, 55, 58, 23, -41, -84}, new byte[]{-1, 84, 95, 100, -19, -116, 34, -123}).concat(e(e10)));
            }
            bluetoothDevice = null;
            if (bluetoothDevice == null) {
                i(m.h(new byte[]{-11, -30, 115, -14, 79, -79, 22, 98, -64, -11, 115, -29, 79, -11, 88, 105, -47, -93, 124, -17, 95, -69, 82, 60, -123}, new byte[]{-91, -125, 26, ByteCompanionObject.MIN_VALUE, 42, -43, 54, 6}).concat(d));
                return null;
            }
            try {
                try {
                } catch (InterruptedException unused) {
                    bluetoothSocket = null;
                    future = null;
                } catch (TimeoutException unused2) {
                    bluetoothSocket = null;
                    future = null;
                }
            } catch (IOException e11) {
                e = e11;
                e6 = e;
                bluetoothSocket = null;
                i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                b(bluetoothSocket);
                return null;
            } catch (SecurityException e12) {
                e = e12;
                e6 = e;
                bluetoothSocket = null;
                i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                b(bluetoothSocket);
                return null;
            } catch (ExecutionException e13) {
                e = e13;
            }
            try {
                i(m.h(new byte[]{-8, -71, 11, -111, -46, 85, 92, -64, -43, -79, 69, -117, -40, 22}, new byte[]{-69, -42, 101, -1, -73, 54, 40, -87}).concat(d));
                defaultAdapter.cancelDiscovery();
                bluetoothSocket = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(j.f6598a);
                try {
                    try {
                        future = this.f925h.submit(new d7.b(2, bluetoothSocket));
                    } catch (InterruptedException unused3) {
                        future = null;
                    } catch (TimeoutException unused4) {
                        future = null;
                    }
                    try {
                        future.get(5000L, TimeUnit.MILLISECONDS);
                        i(m.h(new byte[]{19, 83, 51, 117, -35, 32, 118, -31, 47, 82, 62, 123, -37, 32, 51, -26, 96, 72, 63, 62}, new byte[]{64, 60, 80, 30, -72, 84, 86, -126}).concat(d));
                        String h2 = m.h(new byte[]{-4, -10, 47, -3, 41, -47, 83, 78, -42}, new byte[]{-66, -102, 90, -104, 93, -66, 60, 58});
                        InputStream inputStream = bluetoothSocket.getInputStream();
                        Charset charset = StandardCharsets.UTF_8;
                        return new s3(h2, bluetoothSocket, new BufferedReader(new InputStreamReader(inputStream, charset)), new BufferedWriter(new OutputStreamWriter(bluetoothSocket.getOutputStream(), charset)));
                    } catch (InterruptedException unused5) {
                        i(m.h(new byte[]{-60, 17, 14, -106, -34, -64, 49, 5, -24, 16, 64, -111, -43, -41, 32, 30, -11, 11, 16, -116, -34, -57}, new byte[]{-121, 126, 96, -8, -69, -93, 69, 108}));
                        Thread.currentThread().interrupt();
                        if (future != null) {
                            future.cancel(true);
                        }
                        b(bluetoothSocket);
                        return null;
                    } catch (TimeoutException unused6) {
                        i(m.h(new byte[]{31, 60, 55, -67, -86, -126, 23, -28, 51, Base64.padSymbol, 121, -89, -90, -116, 6, -23, 124, 60, 44, -89, -17, ByteCompanionObject.MIN_VALUE, 5, -7, 57, 33, 121, -26, -17, -110, 89, -83}, new byte[]{92, 83, 89, -45, -49, -31, 99, -115}).concat(d));
                        if (future != null) {
                            future.cancel(true);
                        }
                        b(bluetoothSocket);
                        return null;
                    }
                } catch (IOException e14) {
                    e6 = e14;
                    i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                    b(bluetoothSocket);
                    return null;
                } catch (SecurityException e15) {
                    e6 = e15;
                    i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                    b(bluetoothSocket);
                    return null;
                } catch (ExecutionException e16) {
                    e = e16;
                    i(m.h(new byte[]{-83, 7, 52, -46, -57, 51, -66, -56, -127, 6, 122, -38, -61, 57, -90, -60, -118, 82, 122}, new byte[]{-18, 104, 90, -68, -94, 80, -54, -95}).concat(e(e.getCause())));
                    b(bluetoothSocket);
                    return null;
                }
            } catch (IOException e17) {
                e6 = e17;
                bluetoothSocket = null;
                i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                b(bluetoothSocket);
                return null;
            } catch (SecurityException e18) {
                e6 = e18;
                bluetoothSocket = null;
                i(m.h(new byte[]{-88, -62, -34, -60, ByteCompanionObject.MAX_VALUE, -47, -86, -9, -126, -114, -50, -45, 121, -47, -73, -71, -54}, new byte[]{-22, -82, -85, -95, 11, -66, -59, -125}).concat(e(e6)));
                b(bluetoothSocket);
                return null;
            } catch (ExecutionException e19) {
                e = e19;
                bluetoothSocket = null;
                i(m.h(new byte[]{-83, 7, 52, -46, -57, 51, -66, -56, -127, 6, 122, -38, -61, 57, -90, -60, -118, 82, 122}, new byte[]{-18, 104, 90, -68, -94, 80, -54, -95}).concat(e(e.getCause())));
                b(bluetoothSocket);
                return null;
            }
        }
        i(m.h(new byte[]{-58, -115, 1, 21, -41, 8, -88, 122, -20, -62, 69, 0, -64, 8, -71, 122, -88, -111, 68, 9, -45, 2, -82, 122, -20}, new byte[]{-120, -30, 33, 101, -74, 97, -38, 31}));
        return null;
    }

    public final s3 d() {
        DhcpInfo dhcpInfo;
        String d = y0.m.d(y0.m.c(this).getString(y0.m.c, ""));
        Context applicationContext = getApplicationContext();
        String str = y0.m.f6605a;
        if (applicationContext.getSharedPreferences(str, 0).getBoolean(y0.m.f6606b, true)) {
            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(m.h(new byte[]{-31, -86, -13, -53}, new byte[]{-106, -61, -107, -94, 113, -110, 107, -45}));
            if (wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null || dhcpInfo.gateway == 0) {
                d = null;
            } else {
                d = String.format(Locale.US, m.h(new byte[]{95, 90, 84, 71, 23, 49, -100, 8, 84, 27, 30}, new byte[]{122, 62, 122, 98, 115, 31, -71, 108}), Integer.valueOf(dhcpInfo.gateway & 255), Integer.valueOf((dhcpInfo.gateway >> 8) & 255), Integer.valueOf((dhcpInfo.gateway >> 16) & 255), Integer.valueOf((dhcpInfo.gateway >> 24) & 255));
            }
        }
        if (d != null && !d.trim().isEmpty()) {
            int i10 = 8897;
            int i11 = getApplicationContext().getSharedPreferences(str, 0).getInt(y0.m.d, 8897);
            if (i11 > 0 && i11 <= 65535) {
                i10 = i11;
            }
            Socket socket = new Socket();
            try {
                socket.setTcpNoDelay(true);
                socket.connect(new InetSocketAddress(d.trim(), i10), 1200);
                socket.setSoTimeout(7000);
                String h2 = m.h(new byte[]{-63, 101, -54, -11, -2}, new byte[]{-106, 12, -25, -77, -105, 88, -120, 28});
                InputStream inputStream = socket.getInputStream();
                Charset charset = StandardCharsets.UTF_8;
                return new s3(h2, socket, new BufferedReader(new InputStreamReader(inputStream, charset)), new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), charset)));
            } catch (IOException unused) {
                b(socket);
            }
        }
        return null;
    }

    public final void f() {
        Iterator it = this.f922b.values().iterator();
        while (it.hasNext()) {
            k((l) it.next());
        }
        Iterator it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            k((l) it2.next());
        }
    }

    public final void g(s3 s3Var, i iVar) {
        String str = iVar.f6594a;
        String str2 = iVar.e;
        String str3 = iVar.f6595b;
        long j10 = iVar.c;
        switch (str.hashCode()) {
            case 96393:
                if (str.equals(m.h(new byte[]{82, -24, 78}, new byte[]{51, -117, 37, 98, ByteCompanionObject.MAX_VALUE, -68, 55, 79}))) {
                    this.c.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 3076010:
                if (str.equals(m.h(new byte[]{-124, -59, 17, -7}, new byte[]{-32, -92, 101, -104, 90, 114, 63, -109}))) {
                    if (m.h(new byte[]{77, -31, -71, -10, -124, 84, -28, -8}, new byte[]{63, -124, -43, -97, -27, 54, -120, -99}).equals(iVar.d)) {
                        if (this.d.add(Long.valueOf(j10))) {
                            g.b(j10, str3, str2);
                        }
                        try {
                            s3Var.r(j.b(j.f6600f).put(m.h(new byte[]{-14, -28, -5, 110, 11, 71, 123, 0}, new byte[]{-127, -127, -118, 27, 110, 41, 24, 101}), j10).toString());
                            return;
                        } catch (JSONException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    g.b(j10, str3, str2);
                    return;
                }
                return;
            case 3441010:
                if (str.equals(m.h(new byte[]{-30, -90, -38, -21}, new byte[]{-110, -49, -76, -116, -36, 49, 87, -92}))) {
                    s3Var.r(j.c(m.h(new byte[]{66, 120, 108, 101}, new byte[]{50, 23, 2, 2, 74, 70, 32, 42}), m.h(new byte[]{107, -30, -20}, new byte[]{8, -125, -98, 69, -81, 30, -77, 60})));
                    return;
                }
                return;
            case 3446776:
                str.equals(m.h(new byte[]{-78, -61, -29, -96}, new byte[]{-62, -84, -115, -57, -28, -50, 8, -86}));
                return;
            default:
                return;
        }
    }

    public final void h() {
        s3 s3Var = this.f929l;
        if (this.f923f.get() && s3Var != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f930m > 7000) {
                Log.i(f914p, m.h(new byte[]{62, -110, 13, -101, 7, -3, 66, 6, 30, -64, 28, -112, 17, -1, 13, 0, 3, -115, 9, -111, 84, -30, 88, 0, 81, -64, 30, -112, 23, -30, 67, 26, 15, -125, 24, -100, 26, -22}, new byte[]{106, -32, 108, -11, 116, -115, 45, 116}));
                if (m.h(new byte[]{-44, 7, 46, -27, 96, 67, 0, 80, -2}, new byte[]{-106, 107, 91, ByteCompanionObject.MIN_VALUE, 20, 44, 111, 36}).equals((String) s3Var.c)) {
                    i(m.h(new byte[]{-80, 30, -110, -118, 43, 46, 49, 86, -112, 2, -41, -40, 40, 47, 46, 84, -34, 1, -38, -105, 32, 56, 97, 95, -111, 3, -110, -49, 110, 46}, new byte[]{-2, 113, -78, -8, 78, 93, 65, 57}));
                }
                s3Var.e();
                return;
            }
            if (f919x.get()) {
                if (m.h(new byte[]{28, 88, -78, -21, -23, 107, -38, -66, 54}, new byte[]{94, 52, -57, -114, -99, 4, -75, -54}).equals((String) s3Var.c) && currentTimeMillis - this.f931n >= 5000) {
                    this.f931n = currentTimeMillis;
                    s3 d = d();
                    if (d != null) {
                        d.e();
                        s3Var.e();
                        return;
                    }
                }
                try {
                    s3Var.r(j.c(m.h(new byte[]{27, 23, 85, -14}, new byte[]{107, 126, 59, -107, -70, -5, 120, -34}), m.h(new byte[]{-77, -114, 123}, new byte[]{-48, -17, 9, 105, 66, 84, 78, 125})));
                } catch (IOException unused) {
                    s3Var.e();
                }
            }
        }
    }

    public final void i(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap = this.f932o;
        Long l10 = (Long) concurrentHashMap.get(str);
        if (l10 != null && currentTimeMillis - l10.longValue() < 30000) {
            return;
        }
        concurrentHashMap.put(str, Long.valueOf(currentTimeMillis));
        String concat = m.h(new byte[]{117, 53, -59, 33, 123, 40, 60, -118, 79, 57, -61, 1, 41, 11, 62, -116, 90, 34, -34, 26, 125, 33, 104, -39}, new byte[]{63, 86, -79, 117, 9, 73, 82, -7}).concat(str);
        Log.i(f914p, concat);
        h0.b.w(concat, ColorText.GREEN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b2, code lost:
    
        if (r10.f929l == r11) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        if (r10.f929l == r11) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0231, code lost:
    
        r10.f929l = null;
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0236, code lost:
    
        r11.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243 A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:3:0x0012, B:4:0x002b, B:6:0x0033, B:8:0x003d, B:10:0x0043, B:13:0x0047, B:64:0x005d, B:66:0x0072, B:68:0x00b2, B:69:0x00cf, B:16:0x00ef, B:49:0x010a, B:54:0x0129, B:56:0x0156, B:51:0x0174, B:20:0x0181, B:38:0x0199, B:40:0x01c6, B:41:0x01d7, B:23:0x01e9, B:35:0x01ff, B:28:0x0210, B:78:0x0216, B:96:0x023b, B:98:0x0243, B:100:0x028a), top: B:2:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(e0.s3 r11) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.Transport.TransportService.j(e0.s3):void");
    }

    public final void k(l lVar) {
        s3 s3Var = this.f929l;
        if (s3Var != null && f919x.get()) {
            try {
                s3Var.r(j.d(lVar.d, lVar.f6603a, lVar.c, lVar.f6604b));
                if (m.h(new byte[]{-2, -69, -73, -55, -56, -116}, new byte[]{-110, -38, -61, -84, -69, -8, -22, 34}).equals(lVar.c)) {
                    this.f922b.remove(lVar.f6603a, lVar);
                }
            } catch (IOException unused) {
                s3Var.e();
            }
        }
    }

    public final void l(String str) {
        f919x.set(true);
        f920y = str;
        Log.i(f914p, m.h(new byte[]{-51, 1, 67, 28, -61, 45, -4, -126, -22, 78, 91, 27, -57, 110}, new byte[]{-114, 110, 45, 114, -90, 78, -120, -25}).concat(str));
        if (m.h(new byte[]{50, 64, 108, -39, 23, 12, 32, 108, 24}, new byte[]{112, 44, 25, -68, 99, 99, 79, 24}).equals(str)) {
            i(m.h(new byte[]{102, -85, 58, -41, -10, -102, 121, -101, 65, -28, 53, -41, -9, -39, 108, -117, 81, -84, 49, -41, -25, -112, 110, -97, 81, -95, 48}, new byte[]{37, -60, 84, -71, -109, -7, 13, -2}));
        }
        startForeground(1907, a(str));
        Iterator it = g.f6592b.iterator();
        while (it.hasNext()) {
            try {
                ((d2) it.next()).a(true);
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void m() {
        String str = f920y;
        if (f919x.getAndSet(false)) {
            Log.i(f914p, m.h(new byte[]{-90, 37, 120, 50, 12, -40, 114, -107, -122, 119, 125, 53, 12, -53, 114, -119, -100, 50, 122, 40, 26, -52}, new byte[]{-14, 87, 25, 92, ByteCompanionObject.MAX_VALUE, -88, 29, -25}));
            if (m.h(new byte[]{-104, 17, 116, 105, -100, 75, -81, -83, -78}, new byte[]{-38, 125, 1, 12, -24, 36, -64, -39}).equals(str)) {
                i(m.h(new byte[]{76, -4, 79, 10, -90, -109, -28, -106, 96, -3, 1, 7, -81, -97, -29, -102, 107}, new byte[]{15, -109, 33, 100, -61, -16, -112, -1}));
            }
        }
        f920y = "";
        Iterator it = g.f6592b.iterator();
        while (it.hasNext()) {
            try {
                ((d2) it.next()).a(false);
            } catch (RuntimeException unused) {
            }
        }
        if (w.get()) {
            startForeground(1907, a(null));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        NotificationManager notificationManager;
        super.onCreate();
        f921z = this;
        this.f924g = Executors.newSingleThreadExecutor();
        this.f925h = Executors.newCachedThreadPool();
        this.f926i = Executors.newSingleThreadExecutor();
        this.f927j = Executors.newSingleThreadScheduledExecutor();
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService(NotificationManager.class)) != null) {
            d.g();
            notificationManager.createNotificationChannel(d.c(f918v, getString(R.string.transport_channel)));
        }
        this.f928k = new b(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b bVar = this.f928k;
        if (bVar != null) {
            bVar.close();
        }
        this.f923f.set(false);
        w.set(false);
        Log.i(f914p, m.h(new byte[]{-24, 20, -81, -112, -13, 125, -123, -115, -56, 70, -94, -105, -26, 104, -119, -122, -33, 10, -85, -34, -13, 121, -123, -113, -52, 3, -86}, new byte[]{-68, 102, -50, -2, ByteCompanionObject.MIN_VALUE, 13, -22, -1}));
        m();
        s3 s3Var = this.f929l;
        this.f929l = null;
        if (s3Var != null) {
            s3Var.e();
        }
        this.f924g.shutdownNow();
        this.f925h.shutdownNow();
        this.f926i.shutdownNow();
        this.f927j.shutdownNow();
        if (f921z == this) {
            f921z = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        String h2;
        if (intent == null) {
            action = null;
        } else {
            action = intent.getAction();
        }
        startForeground(1907, a(null));
        final int i12 = 0;
        final int i13 = 1;
        boolean compareAndSet = this.f923f.compareAndSet(false, true);
        String str = f914p;
        if (compareAndSet) {
            w.set(true);
            Log.i(str, m.h(new byte[]{-120, -82, 112, 93, -35, 11, 26, 41, -88, -4, 125, 90, -56, 30, 22, 34, -65, -80, 116, 19, -35, 15, 20, 41, -88, -71, 117}, new byte[]{-36, -36, 17, 51, -82, 123, 117, 91}));
            this.f927j.scheduleWithFixedDelay(new Runnable(this) { // from class: y0.k
                public final /* synthetic */ TransportService c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            TransportService transportService = this.c;
                            String str2 = TransportService.f914p;
                            try {
                                transportService.h();
                                return;
                            } catch (RuntimeException e) {
                                Log.w(TransportService.f914p, e0.m.h(new byte[]{59, 105, -80, 1, -123, -75, 3, -48, 27, 59, -71, 10, -105, -73, 24, -64, 10, 122, -91, 79, -112, -92, 5, -50, 10, ByteCompanionObject.MAX_VALUE, -22, 79, -99, -96, 9, -46, 6, 117, -74, 79, -102, -84, 10, -57, 12, 98, -78, 3, -109, -27, 13, -50, 6, 109, -76}, new byte[]{111, 27, -47, 111, -10, -59, 108, -94}), e);
                                s3 s3Var = transportService.f929l;
                                if (s3Var != null) {
                                    s3Var.e();
                                    return;
                                }
                                return;
                            }
                        default:
                            TransportService transportService2 = this.c;
                            while (transportService2.f923f.get()) {
                                try {
                                    s3 d = transportService2.d();
                                    if (d == null) {
                                        d = transportService2.c();
                                    }
                                    if (d != null) {
                                        transportService2.j(d);
                                    }
                                } catch (RuntimeException e6) {
                                    Log.w(TransportService.f914p, e0.m.h(new byte[]{63, -50, 91, -84, -19, 122, -103, 59, 31, -100, 89, -83, -16, 100, -109, 42, 31, -43, 85, -84, -66, 105, -113, 42, 7, -39, 26, -92, -1, 99, -102, 44, 15, -121, 26, -80, -5, 126, -124, 48, 2, -46, 93}, new byte[]{107, -68, 58, -62, -98, 10, -10, 73}), e6);
                                    transportService2.m();
                                    s3 s3Var2 = transportService2.f929l;
                                    transportService2.f929l = null;
                                    if (s3Var2 != null) {
                                        s3Var2.e();
                                    }
                                }
                                if (transportService2.f923f.get()) {
                                    try {
                                        Thread.sleep(1500L);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            }
                            return;
                    }
                }
            }, 2000L, 2000L, TimeUnit.MILLISECONDS);
            this.f924g.execute(new Runnable(this) { // from class: y0.k
                public final /* synthetic */ TransportService c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            TransportService transportService = this.c;
                            String str2 = TransportService.f914p;
                            try {
                                transportService.h();
                                return;
                            } catch (RuntimeException e) {
                                Log.w(TransportService.f914p, e0.m.h(new byte[]{59, 105, -80, 1, -123, -75, 3, -48, 27, 59, -71, 10, -105, -73, 24, -64, 10, 122, -91, 79, -112, -92, 5, -50, 10, ByteCompanionObject.MAX_VALUE, -22, 79, -99, -96, 9, -46, 6, 117, -74, 79, -102, -84, 10, -57, 12, 98, -78, 3, -109, -27, 13, -50, 6, 109, -76}, new byte[]{111, 27, -47, 111, -10, -59, 108, -94}), e);
                                s3 s3Var = transportService.f929l;
                                if (s3Var != null) {
                                    s3Var.e();
                                    return;
                                }
                                return;
                            }
                        default:
                            TransportService transportService2 = this.c;
                            while (transportService2.f923f.get()) {
                                try {
                                    s3 d = transportService2.d();
                                    if (d == null) {
                                        d = transportService2.c();
                                    }
                                    if (d != null) {
                                        transportService2.j(d);
                                    }
                                } catch (RuntimeException e6) {
                                    Log.w(TransportService.f914p, e0.m.h(new byte[]{63, -50, 91, -84, -19, 122, -103, 59, 31, -100, 89, -83, -16, 100, -109, 42, 31, -43, 85, -84, -66, 105, -113, 42, 7, -39, 26, -92, -1, 99, -102, 44, 15, -121, 26, -80, -5, 126, -124, 48, 2, -46, 93}, new byte[]{107, -68, 58, -62, -98, 10, -10, 73}), e6);
                                    transportService2.m();
                                    s3 s3Var2 = transportService2.f929l;
                                    transportService2.f929l = null;
                                    if (s3Var2 != null) {
                                        s3Var2.e();
                                    }
                                }
                                if (transportService2.f923f.get()) {
                                    try {
                                        Thread.sleep(1500L);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            }
                            return;
                    }
                }
            });
        }
        if (r.equals(action)) {
            String stringExtra = intent.getStringExtra(f916s);
            String stringExtra2 = intent.getStringExtra(t);
            String stringExtra3 = intent.getStringExtra(f917u);
            if (stringExtra != null && !stringExtra.trim().isEmpty()) {
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String str2 = stringExtra2;
                if (m.h(new byte[]{119, 122, 84, 45, 7, -104, -43, -32}, new byte[]{5, 31, 56, 68, 102, -6, -71, -123}).equals(stringExtra3)) {
                    h2 = m.h(new byte[]{-66, -70, 27, -47, -11, -97, -124, 116}, new byte[]{-52, -33, 119, -72, -108, -3, -24, 17});
                } else {
                    h2 = m.h(new byte[]{-115, 115, -48, 110, -48, 1}, new byte[]{-31, 18, -92, 11, -93, 117, -104, 96});
                }
                String str3 = h2;
                long incrementAndGet = this.e.incrementAndGet();
                l lVar = new l(incrementAndGet, stringExtra, str2, str3);
                if (m.h(new byte[]{-114, 49, ByteCompanionObject.MAX_VALUE, 9, -61, 82, 52, 94}, new byte[]{-4, 84, 19, 96, -94, 48, 88, 59}).equals(str3)) {
                    this.c.put(Long.valueOf(incrementAndGet), lVar);
                } else {
                    this.f922b.put(stringExtra, lVar);
                }
                try {
                    this.f926i.execute(new x0(16, this, lVar));
                } catch (RuntimeException e) {
                    Log.w(str, m.h(new byte[]{75, 107, -15, 35, 62, -48, -60, 40, 113, 37, -31, 52, 55, -64, -127, 124, 106, 119, -15, 47, 33, -59, -117, 46, 106, 37, -3, 36, 33, -58, -123, 59, 123}, new byte[]{30, 5, -112, 65, 82, -75, -28, 92}), e);
                }
            }
        }
        return 1;
    }
}
