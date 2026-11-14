package e0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.example.navistart.cores.HUDMassageObj;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n3 extends BroadcastReceiver {
    public static final String d = m.h(new byte[]{78, 109, 87, 30, -13, -3, -108, -102, 99, 79, 85, 24, -21, -5, -126, -113, ByteCompanionObject.MAX_VALUE, 45, 57, 124, -123, -109, -23, -18, 98, 66, 80, 18, -18, -16, -122, -104, 115, 76, 74, 8, -12, -100, -28, -120, 116, 79, 77, 16, -1, -17, -119, -113, 96, 64, 85, 30, -22, -16, -108, -99, 101, 45, 53, 15, -8, -97, -28, -97, 15, 77, 91, 2, -31, -1, -126, -108}, new byte[]{42, 11, 31, 86, -90, -71, -63, -51});
    public static final v e = w.b(300, m.h(new byte[]{99, -64, 4, -6, -83, -19, 78, -39, 72}, new byte[]{58, -110, 97, -103, -56, -124, 56, -68}));

    /* renamed from: f, reason: collision with root package name */
    public static final HUDMassageObj f1984f = new HUDMassageObj();

    /* renamed from: g, reason: collision with root package name */
    public static String f1985g = "";

    /* renamed from: h, reason: collision with root package name */
    public static int f1986h = 20;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1987a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f1988b;
    public Boolean c;

    public static void a(Context context) {
        e.execute(new androidx.profileinstaller.c(context, 6));
    }

    public static Boolean b() {
        try {
            if (c().booleanValue()) {
                long longValue = h0.b.a().j().l(Long.MAX_VALUE).longValue();
                u0.a o5 = h0.b.o();
                u0.a o9 = h0.b.o();
                byte[] bArr = m.f1969f;
                String[] strArr = p3.f2001a;
                String loadString = o9.loadString(new String(bArr), new String(m.f1970g));
                boolean z9 = true;
                if (longValue >= Long.parseLong(new String(Base64.decode(o5.loadString(loadString, m.h(new byte[]{-50}, new byte[]{-2, -40, -22, 46, -44, 8, -86, -70})), 0)))) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            }
        } catch (Exception unused) {
        }
        return Boolean.FALSE;
    }

    public static Boolean c() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        return Boolean.valueOf(com.google.protobuf.q.g(sb, x1.f2066q).equals(h0.b.o().loadString(new String(m.f1969f), "")));
    }

    public static int d(String str, String str2) {
        if (str.contains(m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 27, 1, 125}, new byte[]{-81, -95, -47, -63, 68, -61, -64, -48})) | str.contains(m.h(new byte[]{-30, -110}, new byte[]{-119, -1, -44, -6, 43, 53, -54, 20}))) {
            return Double.valueOf(Double.valueOf(String.valueOf(str2).replace(m.h(new byte[]{104}, new byte[]{68, -45, ByteCompanionObject.MAX_VALUE, 64, -87, 17, -19, 115}), m.h(new byte[]{-79}, new byte[]{-97, -34, -61, 87, 58, 51, -78, -84}))).doubleValue() * 1000.0d).intValue();
        }
        return Double.valueOf(String.valueOf(str2).replace(m.h(new byte[]{-13}, new byte[]{-33, 115, -9, 101, -92, 76, -30, kotlin.io.encoding.Base64.padSymbol}), m.h(new byte[]{-9}, new byte[]{-39, -103, -73, 28, 112, -95, -50, 1}))).intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r8.equals(e0.m.h(new byte[]{43, 100, 60, -36, 6, -4, 83, 102, 58, 106, 13, -51, 27, -19, 83, 102, 58, 98, 53, -64, 23}, new byte[]{72, 11, 82, -88, 99, -124, 39, 57})) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if (r8.equals(e0.m.h(new byte[]{-71, 49, -32, -30, 2, 118, 60, 3, -88, 63, -47, -30, 18, 124, 38, 3, -88, 55, -23, -2, 19}, new byte[]{-38, 94, -114, -106, 103, 14, 72, 92})) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (r8.equals(e0.m.h(new byte[]{-113, 29, -87, -104, 123, 35, 10, -33, -98, 19, -104, -104, kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE, 48, 27, -33, -98, 27, -96, -124, 106}, new byte[]{-20, 114, -57, -20, 30, 91, 126, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE})) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (r8.equals(e0.m.h(new byte[]{36, -15, 43, -41, -61, 90, -101, -20, 53, -1, 26, -58, -34, 75, -101, -20, 43, -5, 35, -41}, new byte[]{71, -98, 69, -93, -90, 34, -17, -77})) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018a, code lost:
    
        if (r8.equals(e0.m.h(new byte[]{-58, 0, -80, 95, -114, 28, -90, -59, -41, 14, -127, 95, -118, 15, -73, -59, -55, 10, -72, 95}, new byte[]{-91, 111, -34, 43, -21, 100, -46, -102})) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n3.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void f(String str) {
        if (!m.h(new byte[]{124, 19, 53, 119}, new byte[]{18, 102, 89, 27, -57, -90, -18, 52}).contains(str)) {
            m.h(new byte[]{-79, -39, 115, 23, -89, -52, 95, 118, -80, -61, 115, 23}, new byte[]{97, 67, -93, -89, 119, 112, -113, -61});
            String[] split = str.split(m.h(new byte[]{90, -14, 55, -59}, new byte[]{1, -82, 68, -104, 104, -121, 111, 39}));
            d(split[1], split[0]);
            this.f1987a = false;
        }
    }

    public final void g() {
        boolean booleanValue = this.c.booleanValue();
        HUDMassageObj hUDMassageObj = f1984f;
        if (booleanValue) {
            hUDMassageObj.v_mNextRoad = f1985g + m.h(new byte[]{-43, -127, 3, 18, 0, -116, -99}, new byte[]{-66, -20, 44, 122, 32, -95, -67, 51}) + hUDMassageObj.v_mNextRoad;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(f1985g);
            hUDMassageObj.v_mNextRoad = com.google.protobuf.q.i(new byte[]{-55, 106, -47, 31}, new byte[]{-94, 7, -2, 119, -127, 30, -112, -124}, sb);
        }
        hUDMassageObj.hudSenderType = HUDMassageObj.HudSenderType.NAVI;
        try {
            h0.b.a();
            h0.b.i().e(hUDMassageObj);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (b().booleanValue()) {
            Context applicationContext = context.getApplicationContext();
            Intent intent2 = new Intent(intent);
            String action = intent2.getAction();
            if (action != null) {
                int i10 = 0;
                this.f1988b = Boolean.valueOf(h0.b.o().loadBoolean(m.h(new byte[]{-38, 74, -40, -89, -85, -70, -126, 31, -15, 91, -36, -87, -104, -70, -121, 19, -31, 116, -40}, new byte[]{-125, 24, -67, -60, -50, -45, -12, 122}), false));
                this.c = Boolean.valueOf(h0.b.o().loadBoolean(m.h(new byte[]{92, -66, 36, -104, -24, 77, 58, -94, 82, -69, 44}, new byte[]{48, -41, 73, -57, -98, 36, 73, -53}), false));
                h0.b.o().loadBoolean(m.h(new byte[]{-2, 14, -119, -67, 33}, new byte[]{-82, 124, -26, -18, 118, -47, 60, -65}), false);
                h0.b.a();
                boolean equals = action.equals(m.h(new byte[]{-61, -8, 46, -93, 111, -58, 80, 2, -1, -92, 109, -91, 116, -54, 65, 17}, new byte[]{-102, -42, 67, -62, 1, -93, 37, 116}));
                HUDMassageObj hUDMassageObj = f1984f;
                if (equals) {
                    try {
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            if (!m.h(new byte[]{-125, -90, -94, 15}, new byte[]{-19, -45, -50, 99, 91, -76, -86, 123}).contains(String.valueOf(extras.getString(m.h(new byte[]{-82, -30, 46, 59, 55, 36, -116, -36, -76, -26}, new byte[]{-35, -110, 75, 94, 83, 72, -27, -79}))))) {
                                String valueOf = String.valueOf(extras.getString(m.h(new byte[]{33, 70, -107, 116, 21, 117, -119, -4, 59, 66}, new byte[]{82, 54, -16, 17, 113, 25, -32, -111})));
                                f1985g = valueOf;
                                try {
                                    i10 = Integer.parseInt(valueOf);
                                } catch (NumberFormatException unused) {
                                }
                                hUDMassageObj.setspeedlimit(i10);
                            }
                            if (m.h(new byte[]{-2, -76, 64}, new byte[]{-71, -15, 20, 65, -32, -33, 94, 113}).equals(extras.getString(m.h(new byte[]{3, -54, -67, 46, 38, 67, -8, 16, 58, -26, -74, 54, 58, 91}, new byte[]{83, -97, -23, 113, ByteCompanionObject.MAX_VALUE, 15, -105, 102})))) {
                                a(applicationContext);
                            }
                            if (this.f1987a && b().booleanValue()) {
                                e(String.valueOf(extras.getString(m.h(new byte[]{-88, 94, -57, -35, -81, -94, -89, -17, -109, 95}, new byte[]{-38, 59, -76, -78, -38, -48, -60, -118}))), String.valueOf(extras.getString(m.h(new byte[]{-95, -4, 26, 35, 110, 98, -122, 13}, new byte[]{-59, -107, 105, 87, 15, 12, -27, 104}))), String.valueOf(extras.getString(m.h(new byte[]{-62, -16, 37, 47}, new byte[]{-73, -98, 76, 91, -93, -9, 22, -57}))), String.valueOf(extras.getString(m.h(new byte[]{-120, -95, 89, 55, -39, 112, 33, -58, -88, -91, 76, 38}, new byte[]{-26, -60, 33, 67, -117, 31, 64, -94}))), String.valueOf(extras.getString(m.h(new byte[]{53, 40, -96, 57, 3, 72, -112, 44, kotlin.io.encoding.Base64.padSymbol, 36, -75, 57}, new byte[]{81, 65, -45, 77, 98, 38, -13, 73}))));
                            } else {
                                this.f1987a = true;
                            }
                            if (this.f1988b.booleanValue() && b().booleanValue()) {
                                f(String.valueOf(extras.getString(m.h(new byte[]{17, -28, 80, 75, 28, 84, -98, -60, 13, -32, 76, 86, 12, 65, -110, -49, 28, -28}, new byte[]{ByteCompanionObject.MAX_VALUE, -127, 40, 63, ByteCompanionObject.MAX_VALUE, 53, -13, -95}))));
                            }
                            if (b().booleanValue()) {
                                g();
                            }
                            if (b().booleanValue()) {
                                int i11 = f1986h;
                                if (i11 < 0) {
                                    a(applicationContext);
                                    f1986h = 20;
                                } else {
                                    f1986h = i11 - 1;
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (action.equals(m.h(new byte[]{-89, -15, 0, 45, 34, kotlin.io.encoding.Base64.padSymbol, -89, 44, -101, -83, 67, 58, 37, 43}, new byte[]{-2, -33, 109, 76, 76, 88, -46, 90}))) {
                    try {
                        Bundle extras2 = intent2.getExtras();
                        if (extras2 != null && !m.h(new byte[]{-91, -101, -121, 46}, new byte[]{-53, -18, -21, 66, 59, 59, 21, -106}).contains(String.valueOf(extras2.getBoolean(m.h(new byte[]{-78, -74, 26, -3, 3, 5, -47}, new byte[]{-28, -33, 105, -108, 97, 105, -76, -15}))))) {
                            boolean z9 = extras2.getBoolean(m.h(new byte[]{-75, -100, 93, kotlin.io.encoding.Base64.padSymbol, 75, -98, -20}, new byte[]{-29, -11, 46, 84, 41, -14, -119, ByteCompanionObject.MIN_VALUE}));
                            hUDMassageObj.NaviOn = Boolean.valueOf(z9);
                            if (!z9) {
                                g();
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }
}
