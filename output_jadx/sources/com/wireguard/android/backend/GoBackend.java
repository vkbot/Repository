package com.wireguard.android.backend;

import ai.onnxruntime.d;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.support.v4.media.h;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.f;
import d7.a;
import f7.c;
import f7.e;
import f7.g;
import f7.j;
import g7.b;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class GoBackend {
    public static h e = new h(5);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1660a;

    /* renamed from: b, reason: collision with root package name */
    public c f1661b;
    public r5.c c;
    public int d = -1;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class VpnService extends android.net.VpnService {

        /* renamed from: b, reason: collision with root package name */
        public GoBackend f1662b;

        @Override // android.app.Service
        public final void onCreate() {
            h hVar = GoBackend.e;
            if (((LinkedBlockingQueue) hVar.c).offer(this)) {
                ((FutureTask) hVar.d).run();
            }
            super.onCreate();
        }

        @Override // android.app.Service
        public final void onDestroy() {
            r5.c cVar;
            GoBackend goBackend = this.f1662b;
            if (goBackend != null && (cVar = goBackend.c) != null) {
                int i10 = goBackend.d;
                if (i10 != -1) {
                    GoBackend.wgTurnOff(i10);
                }
                GoBackend goBackend2 = this.f1662b;
                goBackend2.c = null;
                goBackend2.d = -1;
                goBackend2.f1661b = null;
                cVar.l(1);
            }
            GoBackend.e.getClass();
            GoBackend.e = new h(5);
            super.onDestroy();
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i10, int i11) {
            h hVar = GoBackend.e;
            if (((LinkedBlockingQueue) hVar.c).offer(this)) {
                ((FutureTask) hVar.d).run();
            }
            if (intent == null || intent.getComponent() == null || !intent.getComponent().getPackageName().equals(getPackageName())) {
                Log.d("WireGuard/GoBackend", "Service started by Always-on VPN feature");
            }
            return super.onStartCommand(intent, i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r0 instanceof java.lang.RuntimeException) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        throw ((java.lang.RuntimeException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        n0.b.w(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoBackend(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.d = r0
            java.lang.String r0 = "wg-go"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> Lc
            goto L31
        Lc:
            r0 = move-exception
            java.lang.String r1 = "Failed to load library normally, so attempting to extract from apk"
            java.lang.String r2 = "WireGuard/SharedLibraryLoader"
            android.util.Log.d(r2, r1, r0)
            r1 = 0
            java.lang.String r3 = "lib"
            java.lang.String r4 = ".so"
            java.io.File r5 = r7.getCodeCacheDir()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.io.File r1 = java.io.File.createTempFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            boolean r3 = e7.a.a(r7, r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            if (r3 == 0) goto L39
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r1.delete()
        L31:
            r6.f1660a = r7
            return
        L34:
            r7 = move-exception
            goto L53
        L36:
            r7 = move-exception
            r0 = r7
            goto L3f
        L39:
            if (r1 == 0) goto L47
        L3b:
            r1.delete()
            goto L47
        L3f:
            java.lang.String r7 = "Failed to load library apk:/wg-go"
            android.util.Log.d(r2, r7, r0)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L47
            goto L3b
        L47:
            boolean r7 = r0 instanceof java.lang.RuntimeException
            if (r7 == 0) goto L4e
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L4e:
            n0.b.w(r0)
            r7 = 0
            throw r7
        L53:
            if (r1 == 0) goto L58
            r1.delete()
        L58:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wireguard.android.backend.GoBackend.<init>(android.content.Context):void");
    }

    @Nullable
    private static native String wgGetConfig(int i10);

    private static native int wgGetSocketV4(int i10);

    private static native int wgGetSocketV6(int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void wgTurnOff(int i10);

    private static native int wgTurnOn(String str, int i10, String str2);

    private static native String wgVersion();

    public final f b(r5.c cVar) {
        int i10;
        String wgGetConfig;
        char[] charArray;
        f fVar = new f(1);
        if (cVar == this.c && (i10 = this.d) != -1 && (wgGetConfig = wgGetConfig(i10)) != null) {
            String[] split = wgGetConfig.split("\\n");
            int length = split.length;
            int i11 = 0;
            b bVar = null;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (true) {
                HashMap hashMap = fVar.f626a;
                if (i11 < length) {
                    String str = split[i11];
                    if (str.startsWith("public_key=")) {
                        if (bVar != null) {
                            hashMap.put(bVar, new d7.c(j10, j11, j12));
                            SystemClock.elapsedRealtime();
                        }
                        try {
                            charArray = str.substring(11).toCharArray();
                        } catch (g7.c unused) {
                            bVar = null;
                        }
                        if (charArray.length == 64) {
                            byte[] bArr = new byte[32];
                            int i12 = 0;
                            int i13 = 0;
                            for (int i14 = 32; i12 < i14; i14 = 32) {
                                int i15 = i12 * 2;
                                char c = charArray[i15];
                                int i16 = c ^ '0';
                                int i17 = c & 65503;
                                int i18 = (((((r15 | r13) >>> 8) & 255) - 1) >>> 8) | i13;
                                char c10 = charArray[i15 + 1];
                                int i19 = c10 ^ '0';
                                int i20 = c10 & 65503;
                                bArr[i12] = (byte) ((((((i16 - 10) >>> 8) & 255 & i16) | ((((i17 - 65) ^ (i17 - 71)) >>> 8) & 255 & (i17 - 55))) * 16) | (((i19 - 10) >>> 8) & 255 & i19) | ((((i20 - 71) ^ (i20 - 65)) >>> 8) & 255 & (i20 - 55)));
                                i12++;
                                i13 = (((((r6 | r12) >>> 8) & 255) - 1) >>> 8) | i18;
                            }
                            if (i13 == 0) {
                                bVar = new b(bArr);
                                j10 = 0;
                                j11 = 0;
                            } else {
                                throw new Exception();
                            }
                        } else {
                            throw new Exception();
                        }
                    } else {
                        if (str.startsWith("rx_bytes=")) {
                            if (bVar != null) {
                                try {
                                    j10 = Long.parseLong(str.substring(9));
                                } catch (NumberFormatException unused2) {
                                    j10 = 0;
                                }
                            }
                        } else if (str.startsWith("tx_bytes=")) {
                            if (bVar != null) {
                                try {
                                    j11 = Long.parseLong(str.substring(9));
                                } catch (NumberFormatException unused3) {
                                    j11 = 0;
                                }
                            }
                        } else if (str.startsWith("last_handshake_time_sec=")) {
                            if (bVar != null) {
                                try {
                                    j12 += Long.parseLong(str.substring(24)) * 1000;
                                } catch (NumberFormatException unused4) {
                                }
                            }
                        } else if (str.startsWith("last_handshake_time_nsec=") && bVar != null) {
                            j12 += Long.parseLong(str.substring(25)) / 1000000;
                        }
                        i11++;
                    }
                    j12 = 0;
                    i11++;
                } else if (bVar != null) {
                    hashMap.put(bVar, new d7.c(j10, j11, j12));
                    SystemClock.elapsedRealtime();
                }
            }
        }
        return fVar;
    }

    public final void c(int i10, c cVar, r5.c cVar2) {
        int i11;
        r5.c cVar3 = this.c;
        if (cVar3 == cVar2) {
            i11 = 3;
        } else {
            i11 = 1;
        }
        if (i10 == 2) {
            if (i11 == 3) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        }
        if (i10 != i11 || cVar2 != cVar3 || cVar != this.f1661b) {
            if (i10 == 3) {
                c cVar4 = this.f1661b;
                if (cVar3 != null) {
                    d(1, null, cVar3);
                }
                try {
                    d(i10, cVar, cVar2);
                    return;
                } catch (Exception e6) {
                    if (cVar3 != null) {
                        d(3, cVar4, cVar3);
                    }
                    throw e6;
                }
            }
            if (i10 == 1 && cVar2 == cVar3) {
                d(1, null, cVar2);
            }
        }
    }

    public final void d(int i10, c cVar, r5.c cVar2) {
        String str;
        StringBuilder sb = new StringBuilder("Bringing tunnel ");
        cVar2.getClass();
        sb.append(r5.c.i());
        sb.append(' ');
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    str = "null";
                } else {
                    str = "UP";
                }
            } else {
                str = "TOGGLE";
            }
        } else {
            str = "DOWN";
        }
        sb.append(str);
        Log.i("WireGuard/GoBackend", sb.toString());
        if (i10 == 3) {
            if (cVar != null) {
                List<j> list = cVar.f2363b;
                f7.h hVar = cVar.f2362a;
                Context context = this.f1660a;
                if (android.net.VpnService.prepare(context) == null) {
                    if (((LinkedBlockingQueue) e.c).isEmpty()) {
                        Log.d("WireGuard/GoBackend", "Requesting to start VpnService");
                        context.startService(new Intent(context, (Class<?>) VpnService.class));
                    }
                    try {
                        VpnService vpnService = (VpnService) ((FutureTask) e.d).get(2L, TimeUnit.SECONDS);
                        vpnService.f1662b = this;
                        if (this.d != -1) {
                            Log.w("WireGuard/GoBackend", "Tunnel already up");
                            return;
                        }
                        loop0: for (int i11 = 0; i11 < 10; i11++) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                e eVar = (e) ((j) it.next()).f2381b.orElse(null);
                                if (eVar != null) {
                                    String str2 = eVar.f2368a;
                                    if (eVar.a().orElse(null) == null) {
                                        if (i11 < 9) {
                                            Log.w("WireGuard/GoBackend", "DNS host \"" + str2 + "\" failed to resolve; trying again");
                                            Thread.sleep(1000L);
                                        } else {
                                            throw new a(str2);
                                        }
                                    }
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        hVar.getClass();
                        StringBuilder u8 = ai.onnxruntime.a.u("private_key=");
                        u8.append(((b) hVar.f2376f.c).e());
                        u8.append('\n');
                        hVar.f2377g.ifPresent(new g(u8, 1));
                        sb2.append(u8.toString());
                        sb2.append("replace_peers=true\n");
                        for (j jVar : list) {
                            jVar.getClass();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("public_key=");
                            sb3.append(jVar.e.e());
                            sb3.append('\n');
                            for (f7.f fVar : jVar.f2380a) {
                                sb3.append("allowed_ip=");
                                sb3.append(fVar);
                                sb3.append('\n');
                            }
                            jVar.f2381b.flatMap(new d(2)).ifPresent(new g(sb3, 3));
                            jVar.c.ifPresent(new g(sb3, 4));
                            jVar.d.ifPresent(new g(sb3, 5));
                            sb2.append(sb3.toString());
                        }
                        String sb4 = sb2.toString();
                        VpnService.Builder builder = new VpnService.Builder(vpnService);
                        builder.setSession(r5.c.i());
                        Iterator it2 = hVar.d.iterator();
                        while (it2.hasNext()) {
                            builder.addDisallowedApplication((String) it2.next());
                        }
                        Iterator it3 = hVar.e.iterator();
                        while (it3.hasNext()) {
                            builder.addAllowedApplication((String) it3.next());
                        }
                        for (f7.f fVar2 : hVar.f2374a) {
                            builder.addAddress(fVar2.f2371a, fVar2.f2372b);
                        }
                        Iterator it4 = hVar.f2375b.iterator();
                        while (it4.hasNext()) {
                            builder.addDnsServer(((InetAddress) it4.next()).getHostAddress());
                        }
                        Iterator it5 = hVar.c.iterator();
                        while (it5.hasNext()) {
                            builder.addSearchDomain((String) it5.next());
                        }
                        Iterator it6 = list.iterator();
                        boolean z9 = false;
                        while (it6.hasNext()) {
                            for (f7.f fVar3 : ((j) it6.next()).f2380a) {
                                int i12 = fVar3.f2372b;
                                if (i12 == 0) {
                                    z9 = true;
                                }
                                builder.addRoute(fVar3.f2371a, i12);
                            }
                        }
                        if (!z9 || list.size() != 1) {
                            builder.allowFamily(OsConstants.AF_INET);
                            builder.allowFamily(OsConstants.AF_INET6);
                        }
                        builder.setMtu(((Integer) hVar.f2378h.orElse(1280)).intValue());
                        if (Build.VERSION.SDK_INT >= 29) {
                            builder.setMetered(false);
                        }
                        vpnService.setUnderlyingNetworks(null);
                        builder.setBlocking(true);
                        ParcelFileDescriptor establish = builder.establish();
                        try {
                            if (establish != null) {
                                Log.d("WireGuard/GoBackend", "Go backend " + wgVersion());
                                this.d = wgTurnOn(r5.c.i(), establish.detachFd(), sb4);
                                establish.close();
                                int i13 = this.d;
                                if (i13 >= 0) {
                                    this.c = cVar2;
                                    this.f1661b = cVar;
                                    vpnService.protect(wgGetSocketV4(i13));
                                    vpnService.protect(wgGetSocketV6(this.d));
                                } else {
                                    throw new a(Integer.valueOf(this.d));
                                }
                            } else {
                                throw new a(new Object[0]);
                            }
                        } finally {
                        }
                    } catch (TimeoutException e6) {
                        a aVar = new a(new Object[0]);
                        aVar.initCause(e6);
                        throw aVar;
                    }
                } else {
                    throw new a(new Object[0]);
                }
            } else {
                throw new a(new Object[0]);
            }
        } else {
            int i14 = this.d;
            if (i14 == -1) {
                Log.w("WireGuard/GoBackend", "Tunnel already down");
                return;
            }
            this.c = null;
            this.d = -1;
            this.f1661b = null;
            wgTurnOff(i14);
            try {
                ((VpnService) ((FutureTask) e.d).get(0L, TimeUnit.NANOSECONDS)).stopSelf();
            } catch (TimeoutException unused) {
            }
        }
        cVar2.l(i10);
    }
}
