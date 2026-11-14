package com.example.navistart;

import a4.g;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.profileinstaller.c;
import b1.n;
import com.example.navistart.MainActivity;
import com.example.navistart.MyA11yService;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.boot;
import com.example.navistart.cores.BezFunEnum;
import com.example.navistart.cores.CarCmdProxy;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.HFunEnum;
import com.example.navistart.home.WebLauncherActivity;
import com.google.protobuf.q;
import e0.a2;
import e0.b2;
import e0.m;
import e0.m2;
import e0.p3;
import e0.v0;
import e0.v1;
import e0.w;
import e0.x;
import e0.x1;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;
import u0.a;
import v1.d;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MyCarReceiver extends BroadcastReceiver {
    public static final ScheduledThreadPoolExecutor c = w.c(-1, m.h(new byte[]{24, 20, -26, -103, 53, -92, 122, -85, 48, 4, -45, -99, 53}, new byte[]{85, 109, -91, -8, 71, -10, 31, -56}));
    public static final Object d;
    public static final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public static long f839f;

    /* renamed from: g, reason: collision with root package name */
    public static int f840g;

    /* renamed from: h, reason: collision with root package name */
    public static m2 f841h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f842i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f843j;

    /* renamed from: k, reason: collision with root package name */
    public static int f844k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f845l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f846m;

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f847n;

    /* renamed from: o, reason: collision with root package name */
    public static int f848o;

    /* renamed from: p, reason: collision with root package name */
    public static int f849p;

    /* renamed from: q, reason: collision with root package name */
    public static int f850q;
    public static ScheduledFuture r;

    /* renamed from: s, reason: collision with root package name */
    public static ScheduledFuture f851s;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f852a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public Context f853b;

    static {
        w.b(10L, m.h(new byte[]{115, 117, 100, 107, 45, 52, -16, -36, 91, 101, 81, 111, 45, 52, -32, -47}, new byte[]{62, 12, 39, 10, 95, 102, -107, -65}));
        d = new Object();
        e = new ArrayList();
        f839f = 0L;
        f840g = 2;
        f842i = false;
        f843j = false;
        f844k = 0;
        f845l = false;
        f846m = true;
        f847n = Boolean.FALSE;
        f848o = 0;
        f849p = 0;
    }

    public static void b(Context context) {
        if (b.o().loadBoolean(m.h(new byte[]{-124, -23, 87, 8, 97, 121, 91}, new byte[]{-58, -123, 34, 87, 23, 22, 63, 9}), false)) {
            for (int i10 = 1; i10 < 4; i10++) {
                if (b.o().loadString(q.j(new byte[]{23, -51, 76, 23, -16, 63, 37, -74, -123, 19, -55, -10, 110, -54, -72, 75, -124, 3, -55, -3, 110, -59, -71, ByteCompanionObject.MAX_VALUE, 117}, new byte[]{85, -127, 25, 72, -66, 126, 104, -13}, new StringBuilder(), i10), context.getString(R.string.blu_vod_not_set)).equals(m.f1968b) && f848o != i10 && c(m.h(new byte[]{-17, -127, 57, 37, -120, -59, -92, -67, -63, -112, 36, 62}, new byte[]{-82, -12, 77, 74, -37, -96, -48, -21})).booleanValue()) {
                    k.u(context, new Intent(context, (Class<?>) AutoVibVodActivity.class).addFlags(268435456).putExtra(m.h(new byte[]{-73, 106, 23, -37, -114, 97, 94, -7, -78, 96, 7}, new byte[]{-63, 5, 115, -78, -6, 4, 50, -90}), i10), null);
                    d(m.h(new byte[]{70, 13, 124, -6, 1, -51, -91, -1, 104, 28, 97, -31}, new byte[]{7, 120, 8, -107, 82, -88, -47, -87}), Boolean.FALSE);
                }
            }
        }
    }

    public static Boolean c(String str) {
        return Boolean.valueOf(b.o().loadBoolean(str.concat(m.h(new byte[]{-67, 107, -99, -57, 121, 115, -61, 45, -99}, new byte[]{-14, 5, -46, -95, 31, 50, -74, 89})), true));
    }

    public static void d(String str, Boolean bool) {
        b.o().saveBoolean(str.concat(m.h(new byte[]{-36, 107, 60, 51, -38, 56, -59, 73, -4}, new byte[]{-109, 5, 115, 85, -68, 121, -80, Base64.padSymbol})), bool.booleanValue());
    }

    public static void e() {
        String h2;
        int i10;
        HFunEnum hFunEnum;
        boolean booleanValue = c(m.h(new byte[]{-27, -36, 84, -40, -39, 40, 1, 81}, new byte[]{-106, -85, 11, -85, -83, 71, 109, 58})).booleanValue();
        boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{76, 59, 41, -76, -26, 79, -43, 6, 94, 63, 24, -71, -16, 65}, new byte[]{63, 76, 118, -42, -125, 53, -70, 118}), false);
        if (booleanValue) {
            if (loadBoolean) {
                if (b.o().loadBoolean(m.h(new byte[]{50, 9, -56, 104, -80, 17, 22, -51}, new byte[]{65, 126, -105, 27, -60, 126, 122, -90}), false)) {
                    f(BezFunEnum.ID_CAR_AEB);
                }
                if (b.o().loadBoolean(m.h(new byte[]{90, 67, 91, 18, 95, 101, 94, -106}, new byte[]{41, 52, 4, 97, 43, 10, 50, -3}), false)) {
                    f(BezFunEnum.ID_CAR_FCW_SENSITIVITY);
                }
                for (BezFunEnum bezFunEnum : BezFunEnum.values()) {
                    if (b.o().loadBoolean(bezFunEnum.name(), false)) {
                        f(bezFunEnum);
                    }
                }
            }
            boolean equals = m.h(new byte[]{120, 121, -55, 43, -80, -9, -95, -120, 120, 117}, new byte[]{Base64.padSymbol, 33, -123, 106, -2, -93, -24, -48}).equals(b.o().loadString(m.h(new byte[]{-67, 79, 17, 24, 29, 9, 46, 64, -110, 107}, new byte[]{-2, 14, 67, 72, 111, 102, 72, 41}), ""));
            if (equals) {
                x.a();
            } else {
                a o5 = b.o();
                if (equals) {
                    h2 = m.h(new byte[]{-24, 124, -3, 98, 62, -35, -22, -21, -46, 96, -29, 106, 38, -52, -36, -2, -30, 96, -12, 92, 35, -52, -17, -10, -18, 112, -8, 108, 62}, new byte[]{-115, 4, -111, 3, 80, -87, -125, -109});
                } else {
                    h2 = m.h(new byte[]{-92, -123, 35, -27, -94, 60, 3, 18, -92, -110, 21, -32, -94, 15, 11, 30, -76, -98, 37, -3}, new byte[]{-64, -9, 74, -109, -57, 99, 110, 125});
                }
                int loadInt = o5.loadInt(h2, 0);
                if (loadInt >= 1) {
                    if (equals) {
                        i10 = 4;
                    } else {
                        i10 = 3;
                    }
                    if (loadInt <= i10) {
                        int i11 = loadInt - 1;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(m.h(new byte[]{124, 77, -46}, new byte[]{31, 32, -74, 93, -108, 53, -55, -74}), m.h(new byte[]{-15, -102, -117, 56, -26, -24, Base64.padSymbol, Base64.padSymbol, -25, -96, -110, 8, -26, -1}, new byte[]{-126, -1, -1, 103, -126, -102, 84, 75}));
                            jSONObject.put(m.h(new byte[]{62, 87, 120, -13, 57}, new byte[]{72, 54, 20, -122, 92, 10, 107, 5}), i11);
                            b.w(m.h(new byte[]{-24, 49, -116, 77, 71, -15, -127, 106, -10, 59, -100, 108, 21, -75, -41}, new byte[]{-69, 84, -8, 9, 53, -104, -9, 15}) + i11, ColorText.RED);
                            b.a();
                            b.d().c(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            int loadInt2 = b.o().loadInt(m.h(new byte[]{30, 90, -5, -66, -91, 17, 112, -108, 27, 76, -5, -81, -107, 19, 64, ByteCompanionObject.MIN_VALUE, 17}, new byte[]{116, 59, -98, -35, -54, 126, 47, -28}), 0);
            if (loadInt2 == 1 || loadInt2 == 2) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(m.h(new byte[]{122, 53, -100}, new byte[]{25, 88, -8, -105, -75, 49, -90, 20}), m.h(new byte[]{-116, 64, 82, 126, -46, -116, -66, -12, -115, 122, 75, 78, -58, -122}, new byte[]{-1, 37, 38, 33, -94, -29, -55, -111}));
                    jSONObject2.put(m.h(new byte[]{96, -65, 7, 88, -1}, new byte[]{22, -34, 107, 45, -102, -52, -15, -116}), loadInt2);
                    b.w(m.h(new byte[]{64, 26, 118, 70, 99, 67, -39, 120, 94, 16, 102, 115, 44, 25, -100}, new byte[]{19, ByteCompanionObject.MAX_VALUE, 2, 22, 12, 52, -68, 10}) + loadInt2, ColorText.RED);
                    b.a();
                    b.d().c(jSONObject2);
                } catch (Throwable unused2) {
                }
            }
            String h10 = m.h(new byte[]{-126, -97, -84, 24, -2, -74, -14, -10, -122, -101, -69, 28, -24, -122, -33, -10, -117, -121, -86, 23, -12, -122, -63, -10, -98, -101, -91}, new byte[]{-24, -2, -55, 123, -111, -39, -83, -109});
            int loadInt3 = b.o().loadInt(m.h(new byte[]{-109, 24, -117, 24, 66, 121, -113, 113, -105, 28, -100, 28, 84, 73, -94, 113, -102, 0, -115, 23, 72, 73, -68, 113, -113, 28, -126}, new byte[]{-7, 121, -18, 123, 45, 22, -48, 20}), 0);
            HFunEnum hFunEnum2 = null;
            if (loadInt3 != 1) {
                if (loadInt3 != 2) {
                    if (loadInt3 != 3) {
                        hFunEnum = null;
                    } else {
                        hFunEnum = HFunEnum.ID_ENERGY_RECYCLE_HIGH;
                    }
                } else {
                    hFunEnum = HFunEnum.ID_ENERGY_RECYCLE_MEDIUM;
                }
            } else {
                hFunEnum = HFunEnum.ID_ENERGY_RECYCLE_LOW;
            }
            g(h10, hFunEnum);
            String h11 = m.h(new byte[]{-103, -103, -62, -88, -36, -42, 96, -110, -110, -116, -45, -82, -63, -64, 96, ByteCompanionObject.MIN_VALUE, -127, -105, -45, -82, -48, -51, 86, -97, -99, -89, -54, -92, -41, -36}, new byte[]{-13, -8, -89, -53, -77, -71, 63, -16});
            int loadInt4 = b.o().loadInt(m.h(new byte[]{3, -51, 16, 40, 67, 14, -127, -82, 8, -40, 1, 46, 94, 24, -127, -68, 27, -61, 1, 46, 79, 21, -73, -93, 7, -13, 24, 36, 72, 4}, new byte[]{105, -84, 117, 75, 44, 97, -34, -52}), 0);
            if (loadInt4 != 1) {
                if (loadInt4 != 2) {
                    if (loadInt4 == 4) {
                        hFunEnum2 = HFunEnum.ID_SOC_MANAGER_FORCED;
                    }
                } else {
                    hFunEnum2 = HFunEnum.ID_SOC_MANAGER_SMART;
                }
            } else {
                hFunEnum2 = HFunEnum.ID_SOC_MANAGER_INITIAL;
            }
            g(h11, hFunEnum2);
            h(HFunEnum.ID_VCU_DISCHARGE_SWITCH);
            h(HFunEnum.ID_VCU_ELECTRONIC_LOCKING_UNLOCKS);
            d(m.h(new byte[]{16, -34, 121, 7, 0, -47, 4, -110}, new byte[]{99, -87, 38, 116, 116, -66, 104, -7}), Boolean.FALSE);
        }
    }

    public static void f(BezFunEnum bezFunEnum) {
        b.w(m.h(new byte[]{75, -109, -21, -108, 30, 20, -100, -48, 36}, new byte[]{4, -11, -115, -42, 123, 110, -68, -3}) + bezFunEnum + m.h(new byte[]{-73, 78, -77}, new byte[]{-105, 99, -109, -93, 18, -121, 26, ByteCompanionObject.MIN_VALUE}) + false, ColorText.RED);
        b.a();
        b.d().bezoff(bezFunEnum, false);
    }

    public static void g(String str, HFunEnum hFunEnum) {
        if (hFunEnum == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        q.u(new byte[]{-116, -22, 26, -110, 115, -59, -5}, new byte[]{-61, -116, 124, -38, 83, -24, -37, -5}, sb, str);
        sb.append(m.h(new byte[]{-87, -95, -39}, new byte[]{-119, -116, -7, -116, 49, 89, 121, -15}));
        sb.append(hFunEnum);
        b.w(sb.toString(), ColorText.RED);
        b.a();
        b.d().hybrid(hFunEnum, true);
    }

    public static void h(HFunEnum hFunEnum) {
        boolean loadBoolean = b.o().loadBoolean(hFunEnum.name(), false);
        b.w(m.h(new byte[]{15, 111, -77, 11, -48, -5, 4}, new byte[]{64, 9, -43, 67, -16, -42, 36, 109}) + hFunEnum + m.h(new byte[]{-110, 58, 122}, new byte[]{-78, 23, 90, -122, 12, -94, 89, -67}) + loadBoolean, ColorText.RED);
        b.a();
        b.d().hybrid(hFunEnum, loadBoolean);
    }

    public static void j() {
        b.v(m.h(new byte[]{-11, 15, 54, -58, 43, 53, 34, -25, -56, 31, 43, -41, 58, 24, -127, 25, -26, 31, 49, -52, 0, 37, -68}, new byte[]{-89, 106, 69, -93, 95, 106, -14, 70}));
        String h2 = m.h(new byte[]{19, 29, 93, 47, 26, -47, 45, -73, 8, 16, 84, 41, 9, -36, 33, -74, 27, 13, 93, 58, 30, -51, 38, -70, 22, 24, 86, 37, 20, -51}, new byte[]{90, 89, 2, 108, 91, -125, 114, -13});
        Boolean bool = Boolean.TRUE;
        d(h2, bool);
        d(m.h(new byte[]{-2, 16, -41, 29, 95, -99, 114, -46, -8, 4, -63, 18, 81, -101, 114, -62, -14, 21, -36, 1, 72, -118, 99, -59, -2, 24, -55, 10, 87, ByteCompanionObject.MIN_VALUE, 99}, new byte[]{-73, 84, -120, 94, 30, -49, 45, -111}), bool);
        d(m.h(new byte[]{-46, 82, -6, 47, 65, -102, -50, -1, -55, 95, -13, 41, 82, -105, -62, -2, -38, 66, -6, 36, 69, -119, -59}, new byte[]{-101, 22, -91, 108, 0, -56, -111, -69}), bool);
        d(m.h(new byte[]{-8, 94, -44, 6, 3, -38, -20, -19, -2, 74, -62, 9, 13, -36, -20, -3, -12, 91, -33, 26, 10, -51, -14, -6}, new byte[]{-79, 26, -117, 69, 66, -120, -77, -82}), bool);
        d(m.h(new byte[]{120, -76, -38, 72, 22, 68, -13, -91, 112, -94, -38, 77, 16, 93, -13, -81, 98, -92}, new byte[]{49, -16, -123, 9, 85, 27, -95, -32}), bool);
        d(m.h(new byte[]{-77, 33, 54, 17, 64, -109, -35, 116, -75, 43, Base64.padSymbol, 15, 68, ByteCompanionObject.MIN_VALUE, -38, 117, -87, 58, 33, 21, 66, -104}, new byte[]{-6, 101, 105, 80, 3, -52, -101, 38}), bool);
        d(m.h(new byte[]{39, 38, 24, 66, -107, -8, -91, 96, 58, 39, 2, 83, -117, -3, -78, 118, 43, 46, 24, 73, -111, -21, -82}, new byte[]{110, 98, 71, 1, -44, -86, -6, 51}), bool);
        d(m.h(new byte[]{96, 19, -90, -66, 80, -114, -39, 21, 124, 25, -86, -75, 80, -104, -61}, new byte[]{41, 87, -7, -3, 17, -36, -122, 70}), bool);
        d(m.h(new byte[]{35, 26, 106, -102, 126, 59, -35, 3, 13, 11, 119, -127}, new byte[]{98, 111, 30, -11, 45, 94, -87, 85}), bool);
        d(m.h(new byte[]{-45, 13, 95, 5, 42, -61, 95, -75, -56, 0, 86, 3, 57, -50, 83, -76, -37, 29, 95, 16, 46, -33, 84, -72, -42, 8, 84, 15, 36, -33, 95, -91, -45, 4, 69, 20}, new byte[]{-102, 73, 0, 70, 107, -111, 0, -15}), bool);
        d(m.h(new byte[]{-6, 79, -54, 7, 64, -11, -56, 21, -4, 91, -36, 8, 78, -13, -56, 5, -10, 74, -63, 27, 87, -30, -39, 2, -6, 71, -44, 16, 72, -24, -39, 9, -25, 66, -40, 1, 83}, new byte[]{-77, 11, -107, 68, 1, -89, -105, 86}), bool);
        d(m.h(new byte[]{-68, 105, -73, -4, -34, 83, 65, 50, -89, 100, -66, -6, -51, 94, 77, 51, -76, 121, -73, -9, -38, 64, 74, 41, -95, 100, -91, -6, -51}, new byte[]{-11, 45, -24, -65, -97, 1, 30, 118}), bool);
        d(m.h(new byte[]{-124, 40, 54, -69, 121, 93, -43, -17, -126, 60, 32, -76, 119, 91, -43, -1, -120, 45, Base64.padSymbol, -89, 112, 74, -53, -8, -110, 56, 32, -75, 125, 93}, new byte[]{-51, 108, 105, -8, 56, 15, -118, -84}), bool);
        d(m.h(new byte[]{-104, 67, 114, -96, -111, -126, 93, -53, -123, 66, 104, -79, -113, -121, 74, -35, -108, 75, 114, -85, -107, -111, 86, -57, -123, 78, 96, -90, -126}, new byte[]{-47, 7, 45, -29, -48, -48, 2, -104}), bool);
        d(m.h(new byte[]{-102, -45, 63, 73, 2, 75, -63, -99, -110, -59, 63, 76, 4, 82, -63, -105, ByteCompanionObject.MIN_VALUE, -61, 63, 92, 8, 89, -42, -118}, new byte[]{-45, -105, 96, 8, 65, 20, -109, -40}), bool);
        d(m.h(new byte[]{107, 25, -97, 81, -94, -101, 96, 36, 109, 19, -108, 79, -90, -120, 103, 37, 113, 2, -120, 85, -96, -112, 121, 34, 107, 16, -123, 66}, new byte[]{34, 93, -64, 16, -31, -60, 38, 118}), bool);
        d(m.h(new byte[]{91, -104, 115, 117, 4, 5, -106, -86}, new byte[]{40, -17, 44, 6, 112, 106, -6, -63}), bool);
        d(m.h(new byte[]{-87, -125, 32, -31, 83, 0, -45, -17, -123, -104, 22, -1, 74, 17, -23, -22, -74, -107, 13, -1, 124, 10, -48, -19}, new byte[]{-38, -12, ByteCompanionObject.MAX_VALUE, -110, 35, 101, -74, -117}), bool);
    }

    public static Boolean k() {
        StringBuilder sb = new StringBuilder();
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{79}, new byte[]{ByteCompanionObject.MAX_VALUE, 125, 56, -75, -47, -65, 60, -122}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static void n() {
        f844k = b.o().loadInt(m.h(new byte[]{-90, 76, -14, -30, -49, 107, 30, 41, -97, 72, -20, -6}, new byte[]{-21, 45, -127, -118, -112, 5, ByteCompanionObject.MAX_VALUE, 91}), 0);
        b.a().u();
        v1.b bVar = (v1.b) d.a().f5928a.get(v1.b.class);
        bVar.f5922b.postValue(b.a().e());
    }

    public static void q(Context context, boolean z9) {
        ArrayList arrayList = Notik.f855l;
        context.getApplicationContext().stopService(new Intent(context.getApplicationContext(), (Class<?>) Notik.class));
        ScheduledFuture scheduledFuture = f851s;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            f851s.cancel(true);
        }
        Notik.f857n = z9;
        if (z9) {
            f851s = c.schedule(new c(context, 2), 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public static void r(Context context, boolean z9) {
        boolean z10 = Si.d;
        Context applicationContext = context.getApplicationContext();
        applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
        ScheduledFuture scheduledFuture = r;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            r.cancel(true);
        }
        Si.d = z9;
        if (z9) {
            r = c.schedule(new c(context, 3), 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        int i10 = f840g;
        if (i10 < 0) {
            if (!MyA11yService.f()) {
                b.v(m.h(new byte[]{-14, 101, 68, -7, -3, -17, -7, 99, -60, 98, 86, -30, -21, -57, -10, 105, -43, 104, 96, -27, -24, -52, -10, 101}, new byte[]{-95, 17, 37, -117, -119, -82, -102, 0}));
                b a10 = b.a();
                synchronized (b.f2543p) {
                    try {
                        if (a10.f2548b == null) {
                            Log.d(b.c, m.h(new byte[]{-9, -3, -69, -87, 76, -55, -79, -16, -8, -10, -83, -98, 76, -55}, new byte[]{-103, -104, -52, -7, 41, -69, -36, -67}));
                            a10.f2548b = new b1.m(b.h());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                b1.m mVar = a10.f2548b;
                Context context = (Context) mVar.c;
                int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission(m.h(new byte[]{-61, 18, -53, -27, 125, 11, -78, -127, -46, 25, -35, -6, 123, 17, -91, -58, -51, 18, -127, -64, 64, 43, -126, -22, -3, 47, -22, -44, 71, 48, -109, -16, -15, 57, -5, -61, 91, 44, -111, -4}, new byte[]{-94, 124, -81, -105, 18, 98, -42, -81}));
                context.getPackageManager();
                if (checkCallingOrSelfPermission == 0 && !MyA11yService.f()) {
                    b1.m.j((ContentResolver) mVar.f305f, (String) mVar.d);
                }
            }
            f840g = 2;
        } else {
            f840g = i10 - 1;
        }
        if (MyA11yService.f()) {
            c.schedule(new g(15, this), 500L, TimeUnit.MILLISECONDS);
        }
    }

    public final void i() {
        r(this.f853b, true);
        b.a();
        x1 k6 = b.k();
        k6.f2077n.post(new v1(k6, 2));
        if (b.o().loadBoolean(m.h(new byte[]{44, -90, 21, -86, -29, -24, -36, 27, 0, -95, 56, -74, -56, -18, -37}, new byte[]{95, -47, 74, -39, -105, -119, -82, 111}), false) && k().booleanValue()) {
            b.a();
            b.c().StartProGu(b.o().loadString(m.h(new byte[]{84, 109, 43, -105, -99, -99, -102, 80, 123, 88, 9, -105, -113, -104, -121, 81, 74, 78, 15, -87, -100, -103, -84, 89, 96}, new byte[]{21, Base64.padSymbol, 123, -56, -18, -19, -13, 62}), null));
        }
        if (b.o().loadBoolean(m.h(new byte[]{25, 49, -83, ByteCompanionObject.MIN_VALUE, -56, -92, 60, -103, 25, 50, -109, -109, -55, -113, 49, -86, 11, 37, -103}, new byte[]{106, 70, -14, -31, -67, -48, 83, -58}), false) && k().booleanValue()) {
            k.u(this.f853b, new Intent(this.f853b, (Class<?>) BlackActivity.class).addFlags(268435456), null);
        }
        if (b.o().loadBoolean(m.h(new byte[]{-26, 53, -90, 120, 75, -5, 53, 108, -26, 54, -104, 107, 74, -48, 45, 86, -9, 29, -107, 120, 75, -31, 57, 91, -16, 48}, new byte[]{-107, 66, -7, 25, 62, -113, 90, 51}), false) && k().booleanValue()) {
            k.u(this.f853b, new Intent(this.f853b, (Class<?>) WebLauncherActivity.class).addFlags(872415232), null);
        }
        if (b.o().loadBoolean(m.h(new byte[]{9, -115, 23, 90, 31, -127, -86, -54, 10, -118, 23, 69, 5, -99, -112}, new byte[]{122, -6, 72, 40, 106, -17, -11, -85}), false) && k().booleanValue()) {
            b.a();
            b.f().a(m.h(new byte[]{-109, -40, 26, -72, 31, -120, 50, -123, -116, -62, 6, -126, 33, -117, 39, -82, -107, -60, 26, ByteCompanionObject.MIN_VALUE, 13}, new byte[]{-31, -83, 116, -25, 126, -8, 66, -38}));
        }
    }

    public final void l() {
        if (f843j) {
            e();
            a o5 = b.o();
            long loadInt = o5.loadInt(m.h(new byte[]{108, 106, -117, 111, 36, -97, -113, -43, 65, 92, -87, 100, 63, -79, -123, -46, 103, 80, -91, 88, 37, -69, -83}, new byte[]{56, 3, -26, 10, 96, -2, -29, -76}) + f848o, 0) * 60000;
            long loadLong = b.o().loadLong(m.h(new byte[]{-102, -103, -44, -71, -20, -123, 0, -40, -104, -120, -59, -75, -19, -108, 16, -59, -124, -114, -55, -67, -26, -103, 0, -49, -98, -106, -63, -87}, new byte[]{-37, -38, ByteCompanionObject.MIN_VALUE, -16, -93, -53, 95, -117}), 0L) - b.o().loadLong(m.h(new byte[]{5, 86, 21, -7, -21, -83, 115, 20, 7, 71, 4, -11, -22, -68, 99, 1, 2, 74, 21, -7, -23, -90, 126, 24, 0, 80, 13, -15, -3}, new byte[]{68, 21, 65, -80, -92, -29, 44, 71}), 0L);
            if (loadInt != 0 && loadInt >= loadLong) {
                b.v(m.h(new byte[]{47, -76, 35, -3, 77, 119, 5, 49, 78, 17, -54, 66, -73, 57, -11, -93, -65, 65, -121, 44, -45, -111, -11, -89, -66, ByteCompanionObject.MAX_VALUE, 119, 66, -74, -55, -101, -51, -17, 16, -43, 66, -78, -56, -89, -52, -48, 16, -48, 66, -65, -55, -101, 60, -66, 115, -122, 18, -46, -84, -11, -96, -66, 116, -121, 47, -46, -95, 5, -51, -17, -31, -121, 45, -45, -103, -11, -87, -66, 117, -122, 25, -46, -83, -12, -97, -65, 72, -121, 39, -46, -96, 5, -52, -47, 17, -23, 66, -73, -55, -110, -52, -38, 17, -19, 66, -70, 57}, new byte[]{110, -63, 87, -110, 2, 25, 37, 28}) + (loadLong / 60000.0d) + m.h(new byte[]{-126, -89, -79, 121, -74, 122}, new byte[]{82, 27, 97, -63, 102, -57, 12, 2}));
            } else {
                String h2 = m.h(new byte[]{115, 49, 83, 24, -64, -27, -84, 89, 104, 60, 90, 30, -45, -24, -96, 88, 123, 33, 83, 13, -60, -7, -89, 84, 118, 52, 88, 18, -50, -7}, new byte[]{58, 117, 12, 91, -127, -73, -13, 29});
                b2 b2Var = b2.c;
                s(b2Var, h2, new a2(h2, 1), new v0(12));
                String h10 = m.h(new byte[]{-99, 110, -74, 45, 89, 0, 62, 63, -101, 122, -96, 34, 87, 6, 62, 47, -111, 107, -67, 49, 78, 23, 47, 40, -99, 102, -88, 58, 81, 29, 47}, new byte[]{-44, 42, -23, 110, 24, 82, 97, 124});
                s(b2Var, h10, new a2(h10, 2), new v0(13));
                String h11 = m.h(new byte[]{52, -14, 9, -44, -55, -53, 75, 105, 47, -1, 0, -46, -38, -58, 71, 104, 60, -30, 9, -33, -51, -40, 64}, new byte[]{125, -74, 86, -105, -120, -103, 20, 45});
                b2 b2Var2 = b2.f1890b;
                s(b2Var2, h11, new a2(h11, 3), new v0(2));
                String h12 = m.h(new byte[]{100, 87, 103, -36, -63, -99, -71, 117, 98, 67, 113, -45, -49, -101, -71, 101, 104, 82, 108, -64, -56, -118, -89, 98}, new byte[]{45, 19, 56, -97, ByteCompanionObject.MIN_VALUE, -49, -26, 54});
                s(b2Var2, h12, new a2(h12, 0), new v0(3));
                s(b2Var2, m.h(new byte[]{124, -4, 6, 109, 97, 116, -62, 111, 97, -3, 28, 124, ByteCompanionObject.MAX_VALUE, 113, -43, 121, 112, -12, 6, 102, 101, 103, -55}, new byte[]{53, -72, 89, 46, 32, 38, -99, 60}), new v0(4), new v0(5));
                s(b2Var2, m.h(new byte[]{103, 31, 46, -109, 5, 9, 84, -45, 111, 9, 46, -106, 3, 16, 84, -39, 125, 15}, new byte[]{46, 91, 113, -46, 70, 86, 6, -106}), new v0(8), new v0(9));
                s(b2Var2, m.h(new byte[]{-109, -60, -123, -109, -92, -4, -102, 125, -107, -50, -114, -115, -96, -17, -99, 124, -119, -33, -110, -105, -90, -9}, new byte[]{-38, ByteCompanionObject.MIN_VALUE, -38, -46, -25, -93, -36, 47}), new v0(10), new v0(11));
            }
            if (b.o().loadBoolean(m.h(new byte[]{24, 52, -11, -125, -81, 77, -84, -113, 4, 62, -7, -120, -81, 91, -74}, new byte[]{81, 112, -86, -64, -18, 31, -13, -36}) + f848o, false) && c(m.h(new byte[]{-63, 101, -25, -64, 37, 111, -115, -29, -35, 111, -21, -53, 37, 121, -105}, new byte[]{-120, 33, -72, -125, 100, Base64.padSymbol, -46, -80})).booleanValue() && f842i) {
                b.a();
                b.d().sunupdown(Boolean.TRUE);
                d(m.h(new byte[]{-127, 46, 16, -60, 9, 0, -125, 14, -99, 36, 28, -49, 9, 22, -103}, new byte[]{-56, 106, 79, -121, 72, 82, -36, 93}), Boolean.FALSE);
                b.w(m.h(new byte[]{89, 50, -26, -21, -45, 85, 89, -124, 69, 56, -22, -32, -45, 67, 67, -120, 95, 38, -4, -26}, new byte[]{16, 118, -71, -88, -110, 7, 6, -41}), ColorText.RED);
                return;
            }
            return;
        }
        b.v(m.h(new byte[]{13, -91, 12, -35, 5, -54, -53, -23, 108, 0, -20, 98, -8, 116, 83, 20, -1, 0, -56, 99, -56, 116, 94, 20, -9, 1, -12, -110, -102, 25, 59, 113, 108, 0, -49, 98, -6, 116, 84, 21, -49, 1, -15, 98, -1, 116, 86}, new byte[]{76, -48, 120, -78, 74, -92, -21, -60}));
    }

    public final i0.a m() {
        m2 m2Var = f841h;
        if (m2Var == null) {
            f841h = new m2(this.f853b);
            return null;
        }
        SharedPreferences sharedPreferences = m2Var.f1978a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = m2.f1977b;
        if (sharedPreferences.getLong(str, -1L) > elapsedRealtime) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, elapsedRealtime);
            edit.apply();
            j();
            b.a();
            i0.a c10 = b.l().c();
            i0.a aVar = i0.a.c;
            if (c10.equals(aVar)) {
                i();
                boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{116, 124, -47, -58}, new byte[]{22, 19, -66, -78, -84, 30, -37, 54}), false);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c;
                if (loadBoolean) {
                    scheduledThreadPoolExecutor.schedule(new v0(6, this), 10000L, timeUnit);
                }
                if (b.o().loadBoolean(m.h(new byte[]{34, -45, 7, -93, -52, -27, 121, 2, 60, -12, 8, -77, -51, -9, ByteCompanionObject.MAX_VALUE, 25}, new byte[]{81, -92, 88, -32, -71, -106, 13, 109}), false)) {
                    scheduledThreadPoolExecutor.schedule(new v0(7, this), 10000L, timeUnit);
                }
            }
            b.v(m.h(new byte[]{113, 73, 60, -90, 117, 56, 15, 38, 112, 83, 44, -68, 116}, new byte[]{35, 12, 126, -23, 58, 108, 80, 105}));
            return aVar;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putLong(str, elapsedRealtime);
        edit2.apply();
        return null;
    }

    public native boolean m3643p(String str, boolean z9);

    public final void o() {
        b.a();
        b.l().a(new Intent(i0.a.e.name()));
        if (c(m.h(new byte[]{-20, 18, 14, 117, 106, -94, 94, -4, -64, 9, 56, 107, 115, -77, 100, -7, -13, 4, 35, 107, 69, -88, 93, -2}, new byte[]{-97, 101, 81, 6, 26, -57, 59, -104})).booleanValue() && b.o().loadBoolean(m.h(new byte[]{-48, -89, -59, -95, 18, 85, -43, 37, -4, -68, -13, -65, 11, 68, -17, 32, -49, -79, -24, -65, Base64.padSymbol, 95, -42, 39}, new byte[]{-93, -48, -102, -46, 98, 48, -80, 65}), false)) {
            b.a();
            b.d().offSpeedLimitAlarm();
            d(m.h(new byte[]{33, 44, 90, -43, -25, -3, -73, 106, 13, 55, 108, -53, -2, -20, -115, 111, 62, 58, 119, -53, -56, -9, -76, 104}, new byte[]{82, 91, 5, -90, -105, -104, -46, 14}), Boolean.FALSE);
            b.w(m.h(new byte[]{-95, 51, 71, -30, 47, 84, 56, -57, -65, 42, 86, -40, 42, 103, 53, -36, -65, 28, 77, -31, 45}, new byte[]{-46, 67, 34, -121, 75, 11, 84, -82}), ColorText.RED);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        boolean z9;
        final Context applicationContext = context.getApplicationContext();
        final Intent intent2 = new Intent(intent);
        final String action = intent2.getAction();
        if (action != null && action.equals(m.h(new byte[]{-12, -35, 8, -98, 8, 3, -8, -16, -9, -33, 25, -119, 19, 5, -13, -86, -3, -99, 8, -119, 17, 3, -1, -69, -69, -46, 15, -104, 14, 5, -14, -16, -44, -16, 32, -77, 36, 37, -46, -112, -48, -16, 56, -87, 35}, new byte[]{-107, -77, 108, -20, 103, 106, -100, -34}))) {
            r(context, true);
            q(context, true);
        }
        boolean z10 = false;
        if (!k().booleanValue()) {
            String action2 = intent2.getAction();
            if (action2 != null && !m.h(new byte[]{62, 98, 8, 82, 9, 70, -33, 112, 54, 98, 24, 69, 8, 91, -107, 63, 60, 120, 5, 79, 8, 1, -17, 23, 18, 73, 51, 116, 47, 108, -16}, new byte[]{95, 12, 108, 32, 102, 47, -69, 94}).equals(action2)) {
                synchronized (d) {
                    try {
                        ArrayList arrayList = e;
                        if (arrayList.size() >= 20) {
                            arrayList.remove(0);
                        }
                        arrayList.add(new Intent(intent2));
                    } finally {
                    }
                }
                b.w(m.h(new byte[]{-102, 101, 26, 56, 84, -101, 12, 88, -92, 116, 17, 50, 73, -90, 10, 103, -81, 32, 89, 124}, new byte[]{-54, 0, 116, 92, Base64.padSymbol, -11, 107, 17}).concat(action2), ColorText.RED);
                return;
            }
            return;
        }
        synchronized (d) {
            try {
                ArrayList arrayList2 = e;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    arrayList2.clear();
                    b.w(m.h(new byte[]{32, 55, -94, -8, -117, 2, -29, 42, 30, 38, -87, -14, -106, 62, -15, 13, 80, ByteCompanionObject.MAX_VALUE, -20}, new byte[]{112, 82, -52, -100, -30, 108, -124, 99}) + arrayList3.size(), ColorText.RED);
                    int size = arrayList3.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        Intent intent3 = (Intent) obj;
                        if (!m.h(new byte[]{-15, -67, 5, 100, -44, -16, -40, 82, -7, -67, 21, 115, -43, -19, -110, 29, -13, -89, 8, 121, -43, -73, -24, 53, -35, -106, 62, 66, -14, -38, -9}, new byte[]{-112, -45, 97, 22, -69, -103, -68, 124}).equals(intent3.getAction())) {
                            z9 = z10;
                            c.schedule(new n(this, applicationContext, intent3, 3), i10 * 250, TimeUnit.MILLISECONDS);
                            i10++;
                        } else {
                            z9 = z10;
                        }
                        z10 = z9;
                    }
                }
            } finally {
            }
        }
        boolean z11 = z10;
        if (action.equals(m.h(new byte[]{37, -52, 72, 10, -59, 106, 122, -57, 45, -52, 88, 29, -60, 119, 48, -120, 39, -42, 69, 23, -60, 45, 77, -86, 22, -25, 105, 54, -11, 76, 88, -81}, new byte[]{68, -94, 44, 120, -86, 3, 30, -23})) && k().booleanValue()) {
            Log.e(m.h(new byte[]{-19, 84, 64, 32, -113, -101, -67, 119, -59, 68, 117, 36, -113}, new byte[]{-96, 45, 3, 65, -3, -55, -40, 20}), m.h(new byte[]{-109, -71, -37, -104, -101, 94, 112, 102, -103, -120, -56, -66, -84, 114, 86, 94, -93, -124, -54, -81, -67, 126, 87, 79, -77, -111, -49}, new byte[]{-4, -41, -119, -3, -8, 59, 25, 16}));
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - b.o().loadLong(m.h(new byte[]{45, 43, ByteCompanionObject.MAX_VALUE, -58, 60, -3, -9, -73, 47, 58, 110, -54, Base64.padSymbol, -20, -25, -86, 51, 60, 98, -62, 54, -31, -9, -96, 41, 36, 106, -42}, new byte[]{108, 104, 43, -113, 115, -77, -88, -28}), currentTimeMillis) > 10000) {
                b.o().saveLong(m.h(new byte[]{-110, 19, 42, -32, 71, 16, -25, -106, -112, 2, 59, -20, 70, 1, -9, -125, -107, 15, 42, -32, 69, 27, -22, -102, -105, 21, 50, -24, 81}, new byte[]{-45, 80, 126, -87, 8, 94, -72, -59}), currentTimeMillis);
            } else {
                b.o().saveLong(m.h(new byte[]{43, 29, -48, 121, -75, 38, -89, -12, 41, 12, -63, 117, -76, 55, -73, -23, 53, 10, -51, 125, -65, 58, -89, -29, 47, 18, -59, 105}, new byte[]{106, 94, -124, 48, -6, 104, -8, -89}), f839f);
            }
            b.v(m.h(new byte[]{-70, 125, 117, -22, -111, 90, -102, -25, -80, 76, 102, -52, -90, 118, -68, -33, -118, 64, 100, -35, -73, 122, -67, -50, -102, 85, 97}, new byte[]{-43, 19, 39, -113, -14, 63, -13, -111}));
            f845l = z11;
            j();
            f843j = z11;
            r(context, z11);
            q(context, z11);
        }
        c.execute(new Runnable() { // from class: e0.z1
            @Override // java.lang.Runnable
            public final void run() {
                ColorText colorText;
                int i12;
                MyCarReceiver myCarReceiver = MyCarReceiver.this;
                myCarReceiver.f853b = applicationContext;
                i0.a m10 = myCarReceiver.m();
                String h2 = m.h(new byte[]{30, 56, -102, 27, 24}, new byte[]{110, 87, -19, 126, 106, 90, -80, 43});
                Context context2 = context;
                if (((PowerManager) context2.getSystemService(h2)).isInteractive()) {
                    if (!MyCarReceiver.f847n.booleanValue()) {
                        h0.b.v(m.h(new byte[]{3, 10, 101, 85, -41, 90, -80, 104, Base64.padSymbol, 4, 117, 85, -41, 90, -86, 104, 56, 0, 77, 101, -43}, new byte[]{83, 101, 18, 48, -91, 5, -3, 9}));
                        MyCarReceiver.f847n = Boolean.TRUE;
                    }
                } else if (MyCarReceiver.f847n.booleanValue()) {
                    h0.b.v(m.h(new byte[]{-7, 34, -119, -103, -95, -14, 29, 55, -57, 44, -103, -103, -95, -14, 7, 55, -62, 40, -95, -77, -75, -53}, new byte[]{-87, 77, -2, -4, -45, -83, 80, 86}));
                    MyCarReceiver.f847n = Boolean.FALSE;
                }
                m.c();
                if (MyCarReceiver.f849p == 0) {
                    MyCarReceiver.f849p = h0.b.o().loadInt(m.h(new byte[]{4, -127, 69, 59, -98, -88, 41, 0, 17, -110, 75}, new byte[]{112, -28, 46, 77, -15, -52, 118, 115}), 1);
                }
                d0.d(context2);
                if (!MainActivity.w()) {
                    if (!MainActivity.v(context2)) {
                        if (MyCarReceiver.k().booleanValue()) {
                            String h10 = m.h(new byte[]{-67, 103, -61, 18, 6, -46, Base64.padSymbol, 115, -75, 103, -45, 5, 7, -49, 119, 60, -65, 125, -50, 15, 7, -107, 13, 20, -111, 76, -8, 52, 32, -8, 18}, new byte[]{-36, 9, -89, 96, 105, -69, 89, 93});
                            String str = action;
                            if (str.equals(h10)) {
                                MyCarReceiver.n();
                                MyCarReceiver.f842i = h0.b.a().e().f1996b;
                                Boolean bool = h0.b.a().e().c;
                                if (!MyCarReceiver.f843j && bool.booleanValue()) {
                                    myCarReceiver.p();
                                    h0.b.v(m.h(new byte[]{-27, 2, 105, 41, -79, 106, 35, 7, -8, 25, 120, 51, -66, 110, 62, 0, -14, 8, 116, 34, -79, 125, 50, 17, -8, 25}, new byte[]{-73, 87, 39, 118, -16, 41, 119, 78}));
                                }
                                if (MyCarReceiver.f843j && !bool.booleanValue()) {
                                    ConcurrentHashMap concurrentHashMap = myCarReceiver.f852a;
                                    Iterator it = concurrentHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((ScheduledFuture) it.next()).cancel(true);
                                    }
                                    concurrentHashMap.clear();
                                    h0.b.v(m.h(new byte[]{13, -47, -77, -74, 57, 118, 21, 103, 16, -54, -94, -84, 54, 114, 8, 96, 26, -37, -82, -67, 57, 97, 4, 113, 16, -62, -69}, new byte[]{95, -124, -3, -23, 120, 53, 65, 46}));
                                }
                                MyCarReceiver.f843j = bool.booleanValue();
                                MyCarReceiver.f844k = h0.b.a().e().d;
                                MyCarReceiver.f850q = h0.b.a().e().f1997f;
                                MyCarReceiver.f848o = h0.b.a().e().e;
                                d0.d(context2);
                                h0.b.v(m.h(new byte[]{36, -119, -35, 99, 91, -119, 23, 16, 36, -94, -35, 110, 91, -122, 23, 28, -44, -59, -113, 3, 63, -39, 122, 67, 65, -60, -78, 3, 63, -40, 70, 67, 68, -59, -113, 2, 9, -40, 70, 67, 68, 46, 45}, new byte[]{-12, 20, 13, -45, -118, 9, -58, -109}) + h0.b.a().e().d + m.h(new byte[]{70, -35, -49, 44, 28, -32, -112, 117, -49, -36, -28, 44, 17, -32, -109, -124, -100, -65, -67, 66, 121, -124, -6, 28, -99, -113, -67, 73, 121, -117, -5, 40, 118, 45}, new byte[]{76, 13, 109, -4, -87, 48, 42, -92}) + MyCarReceiver.f848o + m.h(new byte[]{-121, 93, -18, -107, 67, -6, 106, 87, 62, 93, -54, -108, 115, -6, 103, 87, 54, 92, -10, 101, 33, -99, 2, 55, 93, 50, -85, -58, 32, -93, 2, 50, 93, 48, 64, 101}, new byte[]{-115, -115, 122, 69, -15, 42, -46, -121}) + h0.b.a().e().c + m.h(new byte[]{-12, 74, 124, -12, 124, 125, -98, 76, 126, 74, 99, -11, 71, 124, -94, 76, 114, -70, 13, -108, 22, 31, -15, 31, 46, 36, 13, -104, 22, 19, -16, 44, 46, 34, 13, -97, 23, 34, 26, -67}, new byte[]{-2, -102, -35, 36, -58, -83, 32, -99}) + h0.b.a().e().f1997f + "\n");
                                Set<Thread> keySet = Thread.getAllStackTraces().keySet();
                                int a10 = w.a();
                                int i13 = (((int) Runtime.getRuntime().totalMemory()) / 1024) / 1024;
                                StringBuilder sb = new StringBuilder();
                                com.google.protobuf.q.t(new byte[]{54, -60, -48, -23, 33, 109, 56, -2}, new byte[]{123, -95, -67, -122, 83, 20, 2, -34}, sb, i13);
                                sb.append(m.h(new byte[]{-115, 70, -66, 26, -62, 62, -76, 77, -74, 97, -78, 110, -21, 47, -91, 69, -92, 119, -88, 26}, new byte[]{-64, 4, -110, 58, -125, 93, -64, 36}));
                                sb.append(Thread.activeCount());
                                sb.append(m.h(new byte[]{-114, 51, 41, -7, 69, -3, 99, -55, -42, 123, 15, -13, 80, -8, 124, -45, -126}, new byte[]{-94, 19, 125, -106, 49, -100, 15, -23}));
                                sb.append(keySet.size());
                                String j10 = com.google.protobuf.q.j(new byte[]{-118, 16, 95, -52, 115, -115, -97, 51, -11, 89, 116, -36, 44, -40}, new byte[]{-90, 48, 14, -71, 22, -8, -6, 19}, sb, a10);
                                if (a10 >= 50 && i13 >= 50) {
                                    colorText = ColorText.RED;
                                } else {
                                    colorText = ColorText.GREEN;
                                }
                                h0.b.w(j10, colorText);
                                ((v1.b) v1.d.a().f5928a.get(v1.b.class)).f5921a.postValue(Boolean.valueOf(MyA11yService.f()));
                                d0.d(context2);
                                int i14 = MyCarReceiver.f849p;
                                int i15 = MyCarReceiver.f848o;
                                if (i14 == i15) {
                                    myCarReceiver.l();
                                } else if (i15 != 0) {
                                    h0.b.a();
                                    h0.b.d().carsetvent(1, 1);
                                    h0.b.a();
                                    h0.b.d().carsetheat(1, 1);
                                    h0.b.a();
                                    h0.b.d().carsetvent(1, 2);
                                    h0.b.a();
                                    h0.b.d().carsetheat(1, 2);
                                    d0.d(context2);
                                    h0.b.a();
                                    CarCmdProxy d10 = h0.b.d();
                                    Boolean bool2 = Boolean.FALSE;
                                    d10.rulheatonoff(bool2);
                                    h0.b.a();
                                    h0.b.d().lobheatonoff(bool2);
                                    h0.b.a();
                                    h0.b.d().zadheatonoff(bool2);
                                    MyCarReceiver.j();
                                    MyCarReceiver.f849p = MyCarReceiver.f848o;
                                    h0.b.o().saveInt(m.h(new byte[]{-9, 47, 64, -120, -70, -59, 7, 9, -30, 60, 78}, new byte[]{-125, 74, 43, -2, -43, -95, 88, 122}), MyCarReceiver.f848o);
                                }
                                MyCarReceiver.b(context2);
                                d0.d(context2);
                                if (h0.b.o().loadBoolean(m.h(new byte[]{-83, 54, ByteCompanionObject.MAX_VALUE, 9, -90, -80, -3, -126, -78, 57, 94, 18, -126, -96, -19}, new byte[]{-3, 87, 13, 98, -25, -59, -119, -19}), false) && (i12 = MyCarReceiver.f850q) > 0 && i12 < h0.b.o().loadInt(m.h(new byte[]{-108, -125, -92, 26, -102, -96, 74, 93, -95, -121, -78, 39, -76, -94, 108, 72}, new byte[]{-60, -30, -42, 113, -43, -50, 25, 45}), 0)) {
                                    h0.b.a();
                                    h0.b.d().parkonoff(Boolean.TRUE);
                                }
                                myCarReceiver.m3643p(boot.c(context2), true);
                            }
                            if (str.equals(m.h(new byte[]{97, 66, -64, 65, 80, -117, -80, -25, 105, 66, -48, 86, 81, -106, -6, -88, 99, 88, -51, 92, 81, -52, -127, -102, 69, 126, -5, 99, 109, -89, -121, -116, 78, 120}, new byte[]{0, 44, -92, 51, 63, -30, -44, -55}))) {
                                h0.b.v(m.h(new byte[]{-32, -63, -91, 96, 24, -63, -60, -103, -22, -16, -74, 70, 47, -19, -30, -95, -48, -6, -92, 64, 41, -5, -3, -67, -54, -4, -78, 75, 47, -124}, new byte[]{-113, -81, -9, 5, 123, -92, -83, -17}));
                            }
                            if (str.equals(m.h(new byte[]{96, -57, 88, 55, -64, 48, -50, 79, 104, -57, 72, 32, -63, 45, -124, 0, 98, -35, 85, 42, -63, 119, -7, 34, 83, -20, 121, 11, -16, 22, -28}, new byte[]{1, -87, 60, 69, -81, 89, -86, 97})) && MyCarReceiver.k().booleanValue()) {
                                Log.e(m.h(new byte[]{-63, -68, -125, 36, -58, 15, -94, -74, -23, -84, -74, 32, -58}, new byte[]{-116, -59, -64, 69, -76, 93, -57, -43}), m.h(new byte[]{4, 73, -5, 96, -103, -29, -119, 69, 14, 120, -24, 70, -82, -49, -81, 125, 52, 116, -22, 87, -65, -61, -82, 108, 36, 105}, new byte[]{107, 39, -87, 5, -6, -122, -32, 51}));
                                long currentTimeMillis2 = System.currentTimeMillis();
                                MyCarReceiver.f839f = h0.b.o().loadLong(m.h(new byte[]{-28, 97, 95, -24, 65, -68, 115, -99, -26, 112, 78, -28, 64, -83, 99, ByteCompanionObject.MIN_VALUE, -6, 118, 66, -20, 75, -96, 115, -118, -32, 110, 74, -8}, new byte[]{-91, 34, 11, -95, 14, -14, 44, -50}), currentTimeMillis2);
                                h0.b.o().saveLong(m.h(new byte[]{46, 68, 98, 30, 41, 10, 89, -127, 44, 85, 115, 18, 40, 27, 73, -100, 48, 83, ByteCompanionObject.MAX_VALUE, 26, 35, 22, 89, -106, 42, 75, 119, 14}, new byte[]{111, 7, 54, 87, 102, 68, 6, -46}), currentTimeMillis2);
                                h0.b.v(m.h(new byte[]{35, -63, 78, -106, -53, -51, 36, -77, 41, -16, 93, -80, -4, -31, 2, -117, 19, -4, 95, -95, -19, -19, 3, -102, 3, -31}, new byte[]{76, -81, 28, -13, -88, -88, 77, -59}));
                                MyCarReceiver.f845l = true;
                                h0.b.a().u();
                                ((v1.b) v1.d.a().f5928a.get(v1.b.class)).f5922b.postValue(h0.b.a().e());
                                d0.d(context2);
                                MyCarReceiver.n();
                                MyCarReceiver.f848o = h0.b.a().e().e;
                                h0.b.a();
                                if (h0.b.l().c().equals(i0.a.f2746b)) {
                                    myCarReceiver.i();
                                }
                                MyCarReceiver.q(context2, true);
                            }
                            if (str.equals(m.h(new byte[]{-123, 119, 126, -104, -127, -36, -23, -43, -122, 117, 111, -113, -102, -38, -30, -113, -116, 55, 126, -113, -104, -36, -18, -98, -54, 120, 121, -98, -121, -38, -29, -43, -91, 90, 86, -75, -83, -6, -61, -75, -95, 90, 78, -81, -86}, new byte[]{-28, 25, 26, -22, -18, -75, -115, -5})) && MyCarReceiver.k().booleanValue()) {
                                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent2.getParcelableExtra(m.h(new byte[]{-5, -9, 35, 44, -15, -60, -43, -97, -8, -11, 50, 59, -22, -62, -34, -59, -14, -73, 35, 59, -24, -60, -46, -44, -76, -4, 63, 42, -20, -52, -97, -11, -33, -49, 14, 29, -37}, new byte[]{-102, -103, 71, 94, -98, -83, -79, -79}));
                                if (bluetoothDevice != null && (ContextCompat.checkSelfPermission(context2, m.h(new byte[]{-82, -11, 75, 38, 87, 94, 122, -40, -65, -2, 93, 57, 81, 68, 109, -97, -96, -11, 1, 22, 116, 98, 91, -94, ByteCompanionObject.MIN_VALUE, -44, 123, 28, 103, 116, 81, -72, -127, -34, 108, 0}, new byte[]{-49, -101, 47, 84, 56, 55, 30, -10})) == 0 || Build.VERSION.SDK_INT < 31)) {
                                    m.f1967a = Boolean.TRUE;
                                    m.f1968b = bluetoothDevice.getName();
                                }
                                MyCarReceiver.f848o = h0.b.a().e().e;
                                MyCarReceiver.b(context2);
                                h0.b.v(m.h(new byte[]{93, 99, -95, -52, 59, -56, -18, -3, 119, 80, -105, -26, 1, -23, -60, -54, 75, 74, -112, -119, 98, -121}, new byte[]{31, 15, -44, -87, 79, -89, -127, -119}) + m.f1968b);
                            }
                            d0.d(context2);
                        }
                        boolean z12 = MyCarReceiver.f843j;
                        if (z12 && MyCarReceiver.f845l && MyCarReceiver.f846m) {
                            MyCarReceiver.f846m = false;
                            myCarReceiver.o();
                            h0.b.w(m.h(new byte[]{49, -88, -118, -9, 40, -69, 27, 117, 55, -76, -120, -5, 40, -95, 11, 104, 43, -76, -104, -16}, new byte[]{116, -26, -51, -66, 102, -2, 68, 38}), ColorText.RED);
                        } else if (!z12 && !MyCarReceiver.f845l && !MyCarReceiver.f846m) {
                            MyCarReceiver.f846m = true;
                        }
                        try {
                            h0.b.a();
                            h0.b.g().a(context2, m10);
                        } catch (Exception unused) {
                        }
                        if (h0.b.o().loadBoolean(m.h(new byte[]{-51, 52, -77, -38, 103, -122, -110, 73, -43, 28, -125, -46, 81, -126, -121, 70}, new byte[]{-66, 67, -20, -68, 14, -19, -31, 32}), false)) {
                            k0.a.a(context2, false);
                        }
                        myCarReceiver.a();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        });
    }

    public final void p() {
        if (b.o().loadBoolean(m.h(new byte[]{46, 66, -74, -84, -39, -60, -8, 35, 40, 72, -120, -71, -13, -60, -8, 35, 33, 88, -99, -94, -13, -61, -29, 29, 50, 89, -74, -88, -62, -41, -2, 18, 37}, new byte[]{64, 45, -23, -51, -84, -80, -105, 124}), true)) {
            b.o().saveLong(m.h(new byte[]{-81, 36, 88, 70, 37, 93, 22, 44, -83, 53, 73, 74, 36, 76, 6, 49, -79, 51, 69, 66, 47, 65, 22, 59, -85, 43, 77, 86}, new byte[]{-18, 103, 12, 15, 106, 19, 73, ByteCompanionObject.MAX_VALUE}), System.currentTimeMillis());
        }
        b.a();
        if (b.l().c().equals(i0.a.d)) {
            i();
        }
        if (b.o().loadBoolean(m.h(new byte[]{3, -97, 79, -92, -59, -110, -113, 32, 47, -101, 100, -72, -63, -84, -110, 50, 22}, new byte[]{112, -24, 16, -41, -79, -13, -3, 84}), false)) {
            b.a();
            b.d().offStartStop();
            b.w(m.h(new byte[]{79, -53, -46, 87, 65, -48, 23, -24, 83, -49, -52, 74, 83, -55}, new byte[]{28, -97, -109, 5, 21, -113, 68, -68}), ColorText.RED);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(e0.b2 r21, java.lang.String r22, java.lang.Runnable r23, java.lang.Runnable r24) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.MyCarReceiver.s(e0.b2, java.lang.String, java.lang.Runnable, java.lang.Runnable):void");
    }
}
