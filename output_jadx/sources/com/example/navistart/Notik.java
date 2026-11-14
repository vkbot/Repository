package com.example.navistart;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.widget.LinearLayout;
import com.example.navistart.Notik;
import com.example.navistart.Transport.TransportService;
import e0.d2;
import e0.m;
import e0.w;
import g0.a;
import h0.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.n1;
import org.json.JSONException;
import org.json.JSONObject;
import ru.transfer.MessageData;
import y0.d;
import y0.e;
import y0.g;
import y0.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Notik extends Service {

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayList f855l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final String f856m = m.h(new byte[]{-43, 77, -99, -19, -127, 75, -18, 24, -1, 98, -121, -27, -104, 69, -17, 8, -44, 77, -127, -19, -101, 80, -34, 3, -7, 114, -100, -23, -121, 80}, new byte[]{-105, 33, -24, -120, -11, 36, -127, 108});

    /* renamed from: n, reason: collision with root package name */
    public static boolean f857n;

    /* renamed from: b, reason: collision with root package name */
    public a f858b;
    public b1.m c;
    public final ScheduledThreadPoolExecutor d = w.c(-1, m.h(new byte[]{25, 125, -22, -47, -106}, new byte[]{87, 18, -98, -72, -3, 67, -6, 47}));
    public final ConcurrentHashMap e;

    /* renamed from: f, reason: collision with root package name */
    public h f859f;

    /* renamed from: g, reason: collision with root package name */
    public d f860g;

    /* renamed from: h, reason: collision with root package name */
    public d f861h;

    /* renamed from: i, reason: collision with root package name */
    public d f862i;

    /* renamed from: j, reason: collision with root package name */
    public d f863j;

    /* renamed from: k, reason: collision with root package name */
    public d f864k;

    static {
        m.h(new byte[]{34, 101, -109, -15, -7, -84, -120, 47, 8, 74, -119, -7, -32, -94, -119, 63, 35, 101, -113, -15, -29, -73, -72, 25, 12, 124, -125, -32, -30, -84, -109, 51, 36, 108, -112, -3, -18, -90}, new byte[]{96, 9, -26, -108, -115, -61, -25, 91});
        f857n = true;
    }

    public Notik() {
        w.b(100L, m.h(new byte[]{113, 111, -107, 14, -119, -7, -68, -28, 124, 75}, new byte[]{63, 0, -31, 103, -30, -90, -16, -85}));
        new AtomicBoolean(false);
        this.e = new ConcurrentHashMap();
    }

    public static void f(Context context, List list) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(m.h(new byte[]{-56, -94, 22, -55, 36, 94, 9, -45, -60, -77, 4}, new byte[]{-91, -57, 101, -70, 69, 57, 108, -105}), new ArrayList(list));
        bundle.putBoolean(m.h(new byte[]{74, 58, -15, 85, 59, -75, -122, -18, 119, 56, -7, 75, 53, -78, -73, -30, 65, 63, -13, 73}, new byte[]{40, 91, -106, 39, 90, -64, -24, -118}), true);
        W.u(context, n1.class, bundle);
    }

    public static void g(Context context) {
        if (b.o().loadBoolean(f856m, false) && f857n) {
            context.startService(new Intent(context.getApplicationContext(), (Class<?>) Notik.class));
        }
    }

    public final synchronized void a(MessageData messageData) {
        try {
            e(messageData);
            ArrayList arrayList = f855l;
            if (arrayList.size() >= 20) {
                arrayList.remove(0);
            }
            arrayList.add(messageData);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(boolean z9) {
        h hVar = this.f859f;
        if (hVar != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = g.f6591a;
            if (TransportService.f919x.get()) {
                try {
                    hVar.c(m.h(new byte[]{-81, -34, 43, -56, 51, 7, 90, -16, -81, -126, 58, -44, 37, 4, 80, -20, -72, -55, 100, -53, 37, 4, 70, -29, -68, -55, 57}, new byte[]{-37, -84, 74, -90, 64, 119, 53, -126}), com.bumptech.glide.d.e(m.h(new byte[]{-121, -99, -81, 19, 16, 16, 76, 54}, new byte[]{-22, -8, -36, 96, 113, 119, 41, 69}), z9));
                } catch (RuntimeException | JSONException e) {
                    Log.w(m.h(new byte[]{-74, 86, 10, -26, 8}, new byte[]{-8, 57, 126, -113, 99, -114, -8, 7}), m.h(new byte[]{41, -122, 17, -66, -56, -24, -59, 117, 19, -56, 0, -87, -58, -31, -116, 114, 20, -56, 29, -71, -41, -2, -124, 102, 25, -101, 80, -84, -42, -24, -106, 100, 18, -117, 21}, new byte[]{124, -24, 112, -36, -92, -115, -27, 1}), e);
                }
            }
        }
    }

    public final synchronized MessageData c(String str) {
        ArrayList arrayList = f855l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MessageData messageData = (MessageData) obj;
            if (messageData.getKey().equals(str)) {
                return messageData;
            }
        }
        return null;
    }

    public final void d(MessageData messageData) {
        Log.d(m.h(new byte[]{-101, -45, -121, -40, 5}, new byte[]{-43, -68, -13, -79, 110, -11, -46, -63}), m.h(new byte[]{119, -1, -95, 122, 97, 108, 80, 56, 91, -18, -77, 51, 32}, new byte[]{58, -102, -46, 9, 0, 11, 53, 124}) + messageData.getKey() + m.h(new byte[]{87, 116, -102}, new byte[]{119, 89, -70, 68, -121, 107, 118, 44}) + messageData.gethasReply());
        a(messageData);
        new Handler(Looper.getMainLooper()).post(new a1.a(28, this, messageData));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r0.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(ru.transfer.MessageData r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = com.example.navistart.Notik.f855l     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L25
            ru.transfer.MessageData r1 = (ru.transfer.MessageData) r1     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.getKey()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r4.getKey()     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L7
            r0.remove()     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r3)
            return
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.Notik.e(ru.transfer.MessageData):void");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new b1.m(this, this);
        this.f858b = new a();
        this.f859f = g.a(this, m.h(new byte[]{-3, 96, 0, -5, 101, ByteCompanionObject.MAX_VALUE, Base64.padSymbol, -78}, new byte[]{-112, 5, 115, -120, 4, 24, 88, -63}));
        final int i10 = 0;
        this.f860g = g.e(m.h(new byte[]{72, -11, -61, 106, -8, 7, -92, 106, 11, -27, -64, 106, -4, 18, -75}, new byte[]{37, -112, -80, 25, -103, 96, -63, 25}), new e(this) { // from class: e0.c2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Notik f1895b;

            {
                this.f1895b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                int i11 = i10;
                Notik notik = this.f1895b;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = Notik.f855l;
                        try {
                            MessageData g10 = com.bumptech.glide.c.g(str);
                            notik.d(g10);
                            y0.h hVar = notik.f859f;
                            if (hVar != null) {
                                hVar.y(m.h(new byte[]{-58, -42, -40, 21, 85, -90, 63, -67, -123, -63, -50, 5, 81, -88, 44, -85, -49}, new byte[]{-85, -77, -85, 102, 52, -63, 90, -50}), new JSONObject().put(m.h(new byte[]{84, 77, -1}, new byte[]{63, 40, -122, 18, -43, -127, 67, -51}), g10.getKey()).toString());
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e) {
                            Log.w(m.h(new byte[]{46, 11, -121, -77, 14}, new byte[]{96, 100, -13, -38, 101, 54, 99, -81}), m.h(new byte[]{57, -100, -19, Base64.padSymbol, 73, 100, -60, 48, 8, -115, -26, 111, 73, 54, -56, 59, 8, -114, -24, 122, 88}, new byte[]{123, -3, -119, 29, Base64.padSymbol, 22, -91, 94}), e);
                            return;
                        }
                    case 1:
                        ArrayList arrayList2 = Notik.f855l;
                        try {
                            String string = new JSONObject(str).getString(m.h(new byte[]{-84, -81, -76}, new byte[]{-57, -54, -51, -35, 124, 70, 44, -64}));
                            MessageData c = notik.c(string);
                            if (c != null) {
                                notik.e(c);
                            }
                            notik.e.remove(string);
                            return;
                        } catch (RuntimeException e6) {
                            e = e6;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        } catch (JSONException e10) {
                            e = e10;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        }
                    case 2:
                        ArrayList arrayList3 = Notik.f855l;
                        try {
                            m0.b3 h2 = com.bumptech.glide.c.h(str);
                            MessageData messageData = (MessageData) notik.e.remove(h2.f3611b);
                            if (!h2.f3610a && messageData != null) {
                                notik.a(messageData);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e11) {
                            Log.w(m.h(new byte[]{13, 48, -98, 25, -96}, new byte[]{67, 95, -22, 112, -53, -66, 72, -117}), m.h(new byte[]{15, -35, 15, 9, -83, -92, -17, 88, 52, -100, 25, 76, -84, -76, -13, 64}, new byte[]{77, -68, 107, 41, -33, -63, -97, 52}), e11);
                            return;
                        }
                    default:
                        ArrayList arrayList4 = Notik.f855l;
                        try {
                            m0.b3 c10 = com.bumptech.glide.d.c(str);
                            if (m.h(new byte[]{-76, 126, 46, 119, -19, 58, -27, 43}, new byte[]{-39, 27, 93, 4, -116, 93, ByteCompanionObject.MIN_VALUE, 88}).equals(c10.f3611b) && c10.f3610a) {
                                notik.b(true);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e12) {
                            Log.w(m.h(new byte[]{28, 33, -113, 15, -125}, new byte[]{82, 78, -5, 102, -24, 30, 25, -39}), m.h(new byte[]{-122, 101, 97, -92, 30, 83, 76, 51, -91, 99, 96, -9, 83, 70, 77, 37, -73, 97, 107, -25, 22, 22, 79, 33, -89, 111, 96, -16}, new byte[]{-60, 4, 5, -124, 115, 54, 63, 64}), e12);
                            return;
                        }
                }
            }
        });
        final int i11 = 1;
        this.f861h = g.e(m.h(new byte[]{-94, 5, 87, 21, ByteCompanionObject.MIN_VALUE, -7, -15, -7, -31, 18, 65, 11, -114, -24, -15}, new byte[]{-49, 96, 36, 102, -31, -98, -108, -118}), new e(this) { // from class: e0.c2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Notik f1895b;

            {
                this.f1895b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                int i112 = i11;
                Notik notik = this.f1895b;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = Notik.f855l;
                        try {
                            MessageData g10 = com.bumptech.glide.c.g(str);
                            notik.d(g10);
                            y0.h hVar = notik.f859f;
                            if (hVar != null) {
                                hVar.y(m.h(new byte[]{-58, -42, -40, 21, 85, -90, 63, -67, -123, -63, -50, 5, 81, -88, 44, -85, -49}, new byte[]{-85, -77, -85, 102, 52, -63, 90, -50}), new JSONObject().put(m.h(new byte[]{84, 77, -1}, new byte[]{63, 40, -122, 18, -43, -127, 67, -51}), g10.getKey()).toString());
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e) {
                            Log.w(m.h(new byte[]{46, 11, -121, -77, 14}, new byte[]{96, 100, -13, -38, 101, 54, 99, -81}), m.h(new byte[]{57, -100, -19, Base64.padSymbol, 73, 100, -60, 48, 8, -115, -26, 111, 73, 54, -56, 59, 8, -114, -24, 122, 88}, new byte[]{123, -3, -119, 29, Base64.padSymbol, 22, -91, 94}), e);
                            return;
                        }
                    case 1:
                        ArrayList arrayList2 = Notik.f855l;
                        try {
                            String string = new JSONObject(str).getString(m.h(new byte[]{-84, -81, -76}, new byte[]{-57, -54, -51, -35, 124, 70, 44, -64}));
                            MessageData c = notik.c(string);
                            if (c != null) {
                                notik.e(c);
                            }
                            notik.e.remove(string);
                            return;
                        } catch (RuntimeException e6) {
                            e = e6;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        } catch (JSONException e10) {
                            e = e10;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        }
                    case 2:
                        ArrayList arrayList3 = Notik.f855l;
                        try {
                            m0.b3 h2 = com.bumptech.glide.c.h(str);
                            MessageData messageData = (MessageData) notik.e.remove(h2.f3611b);
                            if (!h2.f3610a && messageData != null) {
                                notik.a(messageData);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e11) {
                            Log.w(m.h(new byte[]{13, 48, -98, 25, -96}, new byte[]{67, 95, -22, 112, -53, -66, 72, -117}), m.h(new byte[]{15, -35, 15, 9, -83, -92, -17, 88, 52, -100, 25, 76, -84, -76, -13, 64}, new byte[]{77, -68, 107, 41, -33, -63, -97, 52}), e11);
                            return;
                        }
                    default:
                        ArrayList arrayList4 = Notik.f855l;
                        try {
                            m0.b3 c10 = com.bumptech.glide.d.c(str);
                            if (m.h(new byte[]{-76, 126, 46, 119, -19, 58, -27, 43}, new byte[]{-39, 27, 93, 4, -116, 93, ByteCompanionObject.MIN_VALUE, 88}).equals(c10.f3611b) && c10.f3610a) {
                                notik.b(true);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e12) {
                            Log.w(m.h(new byte[]{28, 33, -113, 15, -125}, new byte[]{82, 78, -5, 102, -24, 30, 25, -39}), m.h(new byte[]{-122, 101, 97, -92, 30, 83, 76, 51, -91, 99, 96, -9, 83, 70, 77, 37, -73, 97, 107, -25, 22, 22, 79, 33, -89, 111, 96, -16}, new byte[]{-60, 4, 5, -124, 115, 54, 63, 64}), e12);
                            return;
                        }
                }
            }
        });
        final int i12 = 2;
        this.f862i = g.e(m.h(new byte[]{-34, 34, -86, 43, -71, 40, -125, 121, -99, 53, -68, 40, -76, 54, -56, 120, -42, 52, -84, 52, -84}, new byte[]{-77, 71, -39, 88, -40, 79, -26, 10}), new e(this) { // from class: e0.c2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Notik f1895b;

            {
                this.f1895b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                int i112 = i12;
                Notik notik = this.f1895b;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = Notik.f855l;
                        try {
                            MessageData g10 = com.bumptech.glide.c.g(str);
                            notik.d(g10);
                            y0.h hVar = notik.f859f;
                            if (hVar != null) {
                                hVar.y(m.h(new byte[]{-58, -42, -40, 21, 85, -90, 63, -67, -123, -63, -50, 5, 81, -88, 44, -85, -49}, new byte[]{-85, -77, -85, 102, 52, -63, 90, -50}), new JSONObject().put(m.h(new byte[]{84, 77, -1}, new byte[]{63, 40, -122, 18, -43, -127, 67, -51}), g10.getKey()).toString());
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e) {
                            Log.w(m.h(new byte[]{46, 11, -121, -77, 14}, new byte[]{96, 100, -13, -38, 101, 54, 99, -81}), m.h(new byte[]{57, -100, -19, Base64.padSymbol, 73, 100, -60, 48, 8, -115, -26, 111, 73, 54, -56, 59, 8, -114, -24, 122, 88}, new byte[]{123, -3, -119, 29, Base64.padSymbol, 22, -91, 94}), e);
                            return;
                        }
                    case 1:
                        ArrayList arrayList2 = Notik.f855l;
                        try {
                            String string = new JSONObject(str).getString(m.h(new byte[]{-84, -81, -76}, new byte[]{-57, -54, -51, -35, 124, 70, 44, -64}));
                            MessageData c = notik.c(string);
                            if (c != null) {
                                notik.e(c);
                            }
                            notik.e.remove(string);
                            return;
                        } catch (RuntimeException e6) {
                            e = e6;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        } catch (JSONException e10) {
                            e = e10;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        }
                    case 2:
                        ArrayList arrayList3 = Notik.f855l;
                        try {
                            m0.b3 h2 = com.bumptech.glide.c.h(str);
                            MessageData messageData = (MessageData) notik.e.remove(h2.f3611b);
                            if (!h2.f3610a && messageData != null) {
                                notik.a(messageData);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e11) {
                            Log.w(m.h(new byte[]{13, 48, -98, 25, -96}, new byte[]{67, 95, -22, 112, -53, -66, 72, -117}), m.h(new byte[]{15, -35, 15, 9, -83, -92, -17, 88, 52, -100, 25, 76, -84, -76, -13, 64}, new byte[]{77, -68, 107, 41, -33, -63, -97, 52}), e11);
                            return;
                        }
                    default:
                        ArrayList arrayList4 = Notik.f855l;
                        try {
                            m0.b3 c10 = com.bumptech.glide.d.c(str);
                            if (m.h(new byte[]{-76, 126, 46, 119, -19, 58, -27, 43}, new byte[]{-39, 27, 93, 4, -116, 93, ByteCompanionObject.MIN_VALUE, 88}).equals(c10.f3611b) && c10.f3610a) {
                                notik.b(true);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e12) {
                            Log.w(m.h(new byte[]{28, 33, -113, 15, -125}, new byte[]{82, 78, -5, 102, -24, 30, 25, -39}), m.h(new byte[]{-122, 101, 97, -92, 30, 83, 76, 51, -91, 99, 96, -9, 83, 70, 77, 37, -73, 97, 107, -25, 22, 22, 79, 33, -89, 111, 96, -16}, new byte[]{-60, 4, 5, -124, 115, 54, 63, 64}), e12);
                            return;
                        }
                }
            }
        });
        final int i13 = 3;
        this.f864k = g.e(m.h(new byte[]{35, -78, 126, -117, 68, 83, 6, 26, 35, -18, 111, -105, 82, 80, 12, 6, 52, -91, 49, -120, 82, 80, 26, 9, 48, -91, 108}, new byte[]{87, -64, 31, -27, 55, 35, 105, 104}), new e(this) { // from class: e0.c2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Notik f1895b;

            {
                this.f1895b = this;
            }

            @Override // y0.e
            public final void a(String str) {
                int i112 = i13;
                Notik notik = this.f1895b;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = Notik.f855l;
                        try {
                            MessageData g10 = com.bumptech.glide.c.g(str);
                            notik.d(g10);
                            y0.h hVar = notik.f859f;
                            if (hVar != null) {
                                hVar.y(m.h(new byte[]{-58, -42, -40, 21, 85, -90, 63, -67, -123, -63, -50, 5, 81, -88, 44, -85, -49}, new byte[]{-85, -77, -85, 102, 52, -63, 90, -50}), new JSONObject().put(m.h(new byte[]{84, 77, -1}, new byte[]{63, 40, -122, 18, -43, -127, 67, -51}), g10.getKey()).toString());
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e) {
                            Log.w(m.h(new byte[]{46, 11, -121, -77, 14}, new byte[]{96, 100, -13, -38, 101, 54, 99, -81}), m.h(new byte[]{57, -100, -19, Base64.padSymbol, 73, 100, -60, 48, 8, -115, -26, 111, 73, 54, -56, 59, 8, -114, -24, 122, 88}, new byte[]{123, -3, -119, 29, Base64.padSymbol, 22, -91, 94}), e);
                            return;
                        }
                    case 1:
                        ArrayList arrayList2 = Notik.f855l;
                        try {
                            String string = new JSONObject(str).getString(m.h(new byte[]{-84, -81, -76}, new byte[]{-57, -54, -51, -35, 124, 70, 44, -64}));
                            MessageData c = notik.c(string);
                            if (c != null) {
                                notik.e(c);
                            }
                            notik.e.remove(string);
                            return;
                        } catch (RuntimeException e6) {
                            e = e6;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        } catch (JSONException e10) {
                            e = e10;
                            Log.w(m.h(new byte[]{30, 79, -88, 93, -8}, new byte[]{80, 32, -36, 52, -109, -33, -70, 121}), m.h(new byte[]{79, 9, 126, 76, 44, -71, 6, -94, 126, 24, 117, 30, 44, -21, 21, -87, 96, 7, 108, 9}, new byte[]{13, 104, 26, 108, 88, -53, 103, -52}), e);
                            return;
                        }
                    case 2:
                        ArrayList arrayList3 = Notik.f855l;
                        try {
                            m0.b3 h2 = com.bumptech.glide.c.h(str);
                            MessageData messageData = (MessageData) notik.e.remove(h2.f3611b);
                            if (!h2.f3610a && messageData != null) {
                                notik.a(messageData);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e11) {
                            Log.w(m.h(new byte[]{13, 48, -98, 25, -96}, new byte[]{67, 95, -22, 112, -53, -66, 72, -117}), m.h(new byte[]{15, -35, 15, 9, -83, -92, -17, 88, 52, -100, 25, 76, -84, -76, -13, 64}, new byte[]{77, -68, 107, 41, -33, -63, -97, 52}), e11);
                            return;
                        }
                    default:
                        ArrayList arrayList4 = Notik.f855l;
                        try {
                            m0.b3 c10 = com.bumptech.glide.d.c(str);
                            if (m.h(new byte[]{-76, 126, 46, 119, -19, 58, -27, 43}, new byte[]{-39, 27, 93, 4, -116, 93, ByteCompanionObject.MIN_VALUE, 88}).equals(c10.f3611b) && c10.f3610a) {
                                notik.b(true);
                                return;
                            }
                            return;
                        } catch (RuntimeException | JSONException e12) {
                            Log.w(m.h(new byte[]{28, 33, -113, 15, -125}, new byte[]{82, 78, -5, 102, -24, 30, 25, -39}), m.h(new byte[]{-122, 101, 97, -92, 30, 83, 76, 51, -91, 99, 96, -9, 83, 70, 77, 37, -73, 97, 107, -25, 22, 22, 79, 33, -89, 111, 96, -16}, new byte[]{-60, 4, 5, -124, 115, 54, 63, 64}), e12);
                            return;
                        }
                }
            }
        });
        d2 d2Var = new d2(0, this);
        g.f6592b.add(d2Var);
        d2Var.a(TransportService.f919x.get());
        this.f863j = new d(1, d2Var);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b(false);
        d dVar = this.f860g;
        if (dVar != null) {
            try {
                ai.onnxruntime.a.A(dVar);
            } catch (Exception unused) {
            }
        }
        this.f860g = null;
        d dVar2 = this.f861h;
        if (dVar2 != null) {
            try {
                ai.onnxruntime.a.A(dVar2);
            } catch (Exception unused2) {
            }
        }
        this.f861h = null;
        d dVar3 = this.f862i;
        if (dVar3 != null) {
            try {
                ai.onnxruntime.a.A(dVar3);
            } catch (Exception unused3) {
            }
        }
        this.f862i = null;
        d dVar4 = this.f863j;
        if (dVar4 != null) {
            try {
                ai.onnxruntime.a.A(dVar4);
            } catch (Exception unused4) {
            }
        }
        this.f863j = null;
        d dVar5 = this.f864k;
        if (dVar5 != null) {
            try {
                ai.onnxruntime.a.A(dVar5);
            } catch (Exception unused5) {
            }
        }
        this.f864k = null;
        h hVar = this.f859f;
        if (hVar != null) {
            hVar.close();
            this.f859f = null;
        }
        this.e.clear();
        a aVar = this.f858b;
        if (aVar != null) {
            aVar.a();
        }
        b1.m mVar = this.c;
        if (mVar != null) {
            LinearLayout linearLayout = (LinearLayout) mVar.d;
            mVar.e = null;
            linearLayout.removeAllViews();
        }
        g(this);
        n1.e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        g.d(this);
        this.f858b.a();
        n1.e = this;
        return 1;
    }
}
