package e0;

import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.view.Display;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.navistart.BlackActivity;
import com.example.navistart.CarControlActivity;
import com.example.navistart.MainActivity;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.MyA11yService;
import com.example.navistart.Notik;
import com.example.navistart.R;
import com.example.navistart.VibVodActivity;
import com.example.navistart.W;
import com.example.navistart.cores.InterC;
import com.example.navistart.home.WebLauncherActivity;
import com.woha.atir.RadarActivity;
import com.woha.wifim.MainWifiManadger;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.tftp.TFTP;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d0 extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1899b = m.h(new byte[]{-22, 111, 36, 26, 82, -80, -68, 103, -30, 111, 52, 13, 83, -83, -10, 40, -24, 117, 41, 7, 83, -9, -69, 40, -7, 94, 51, 17, 78, -83, -67, 36, -44, 102, 37, 27, 73, -84, -86, 44, -44, 108, 47, 12, 88}, new byte[]{-117, 1, 64, 104, Base64.padSymbol, -39, -40, 73});

    /* renamed from: a, reason: collision with root package name */
    public Context f1900a;

    public d0(Context context) {
        this.f1900a = context;
    }

    public static void a(int i10) {
        int loadInt = h0.b.o().loadInt(m.h(new byte[]{43, -58, 57, 104, -115, 9, -115, -37}, new byte[]{74, -76, 92, 9, -49, 102, -30, -81}), 2);
        if (i10 == 1) {
            if (loadInt == 1) {
                h0.b.a();
                h0.b.c().OpenCustomPPPri();
                return;
            } else if (loadInt == 2) {
                h0.b.a();
                h0.b.c().OpenProPri();
                return;
            } else {
                if (loadInt == 3) {
                    h0.b.a();
                    h0.b.c().OpenProGu();
                    return;
                }
                return;
            }
        }
        if (i10 == 2) {
            if (loadInt == 1) {
                h0.b.a();
                h0.b.c().OpenCustomPPPri();
            } else if (loadInt == 2) {
                h0.b.a();
                h0.b.c().OpenCustomPPPri();
            } else if (loadInt == 3) {
                h0.b.a();
                h0.b.c().OpenProPri();
            }
        }
    }

    public static Boolean b() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-110}, new byte[]{-94, 87, -2, 52, 59, -54, -13, -69}, h0.b.o(), com.google.protobuf.q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static void c(int i10, float f8) {
        h0.b.a();
        float cabinTemp = h0.b.d().getCabinTemp(i10);
        if (!Float.isNaN(cabinTemp) && !Float.isInfinite(cabinTemp) && cabinTemp > -50.0f) {
            h0.b.a();
            h0.b.d().setCabinTemp(i10, cabinTemp + f8);
        }
    }

    public static void d(Context context) {
        InterC j10 = h0.b.a().j();
        if (j10 != null) {
            boolean bi = j10.bi();
            int[] iArr = new int[0];
            int[] iArr2 = new int[0];
            if (MainActivity.w() && bi && (bi == (!bi) || bi)) {
                h0.b.v(String.valueOf(iArr[1]));
            }
            if ((MainActivity.v(context) && bi) || (bi && Debug.isDebuggerConnected())) {
                Integer.parseInt(String.valueOf(iArr2[1]));
            }
        }
    }

    public final void e(int i10, Class cls) {
        Display[] displays;
        ActivityOptions launchDisplayId;
        Intent addFlags = new Intent(this.f1900a, (Class<?>) cls).addFlags(268435456);
        DisplayManager displayManager = (DisplayManager) this.f1900a.getSystemService(m.h(new byte[]{106, 91, 21, -124, -11, -106, 78}, new byte[]{14, 50, 102, -12, -103, -9, 55, 44}));
        if (displayManager == null) {
            displays = new Display[0];
        } else {
            displays = displayManager.getDisplays();
        }
        if (Build.VERSION.SDK_INT >= 26 && i10 >= 0 && i10 < displays.length) {
            launchDisplayId = ActivityOptions.makeBasic().setLaunchDisplayId(displays[i10].getDisplayId());
            y5.k.u(this.f1900a, addFlags, launchDisplayId.toBundle());
        } else {
            y5.k.u(this.f1900a, addFlags, null);
        }
    }

    public final void f(int i10, Class cls) {
        Bundle bundle = new Bundle();
        bundle.putInt(m.h(new byte[]{-63, 40, -81}, new byte[]{-91, 65, -36, -37, 47, -36, -87, 77}), i10);
        W.t(this.f1900a, cls, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i10, int i11) {
        int i12;
        if (b().booleanValue()) {
            ActivityOptions activityOptions = null;
            boolean z9 = false;
            Object[] objArr = 0;
            switch (i10) {
                case 1:
                    h0.b.a();
                    h0.b.c().OpenProPri();
                    return;
                case 2:
                    Display[] displays = ((DisplayManager) this.f1900a.getSystemService(m.h(new byte[]{22, -112, -29, -68, 62, 8, -47}, new byte[]{114, -7, -112, -52, 82, 105, -88, -56}))).getDisplays();
                    if (i11 > -1 && i11 < displays.length) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            activityOptions = ActivityOptions.makeBasic().setLaunchDisplayId(displays[i11].getDisplayId());
                        }
                        Intent addFlags = new Intent(this.f1900a.getApplicationContext(), (Class<?>) BlackActivity.class).addFlags(268435456);
                        Context context = this.f1900a;
                        Objects.requireNonNull(activityOptions, m.h(new byte[]{-60, 73, -52, 71, 118, -126, -91, -29, -24, 88, -42, 64, 118, -104, -10, -95, -18, 25, -42, 91, 117, ByteCompanionObject.MIN_VALUE}, new byte[]{-117, 57, -72, 46, 25, -20, -42, -61}));
                        y5.k.u(context, addFlags, activityOptions.toBundle());
                        return;
                    }
                    return;
                case 3:
                    h0.b.a();
                    h0.b.d().sunupdown(Boolean.TRUE);
                    return;
                case 4:
                    h0.b.a();
                    h0.b.d().sunupdown(Boolean.FALSE);
                    return;
                case 5:
                    y5.k.u(this.f1900a, new Intent(this.f1900a.getApplicationContext(), (Class<?>) VibVodActivity.class).addFlags(268435456), null);
                    return;
                case 6:
                    h0.b.a();
                    h0.b.c().OpenProGu();
                    return;
                case 7:
                    Bundle bundle = new Bundle();
                    bundle.putInt(m.h(new byte[]{52, 20, 46}, new byte[]{80, 125, 93, -8, -8, -55, -103, 47}), i11);
                    W.u(this.f1900a, m0.o.class, bundle);
                    return;
                case 8:
                    MyA11yService myA11yService = MyA11yService.c;
                    if (myA11yService != null) {
                        myA11yService.performGlobalAction(1);
                        return;
                    }
                    return;
                case 9:
                    int loadInt = h0.b.o().loadInt(m.h(new byte[]{-2, 4, -81, 10, 80, 93, -127, -49}, new byte[]{-97, 118, -54, 107, 18, 50, -18, -69}), 2);
                    if (loadInt == 1) {
                        h0.b.a();
                        h0.b.c().OpenProGu();
                        return;
                    } else if (loadInt == 2) {
                        h0.b.a();
                        h0.b.c().OpenProPri();
                        return;
                    } else {
                        if (loadInt == 3) {
                            h0.b.a();
                            h0.b.c().OpenProGu();
                            return;
                        }
                        return;
                    }
                case 10:
                    y5.k.u(this.f1900a, new Intent(this.f1900a, (Class<?>) CarControlActivity.class).addFlags(268435456), null);
                    return;
                case 11:
                    a(1);
                    return;
                case 12:
                    h0.b.a();
                    h0.b.c().OpenCustomPPPri();
                    return;
                case 13:
                    a(2);
                    return;
                case 14:
                    h0.b.a();
                    h0.b.k().c(n0.g.f4118b);
                    return;
                case 15:
                    h0.b.a();
                    h0.b.k().c(n0.g.c);
                    return;
                case 16:
                    h0.b.a();
                    h0.b.k().c(n0.g.d);
                    return;
                case 17:
                    h0.b.a();
                    h0.b.k().c(n0.g.e);
                    return;
                case 18:
                    MyA11yService myA11yService2 = MyA11yService.c;
                    if (myA11yService2 != null) {
                        myA11yService2.performGlobalAction(2);
                        return;
                    }
                    return;
                case 19:
                    Notik.f(this.f1900a, Notik.f855l);
                    return;
                case 20:
                    k0.a.a(this.f1900a, true);
                    return;
                case 21:
                    k0.a.a(this.f1900a, false);
                    return;
                case 22:
                    h0.b.a();
                    h0.b.d().carsetheat(1, 1);
                    return;
                case 23:
                    h0.b.a();
                    h0.b.d().carsetheat(2, 1);
                    return;
                case 24:
                    h0.b.a();
                    h0.b.d().carsetheat(3, 1);
                    return;
                case 25:
                    h0.b.a();
                    h0.b.d().carsetheat(4, 1);
                    return;
                case 26:
                    h0.b.a();
                    h0.b.d().carsetvent(1, 1);
                    return;
                case 27:
                    h0.b.a();
                    h0.b.d().carsetvent(2, 1);
                    return;
                case 28:
                    h0.b.a();
                    h0.b.d().carsetvent(3, 1);
                    return;
                case 29:
                    h0.b.a();
                    h0.b.d().carsetvent(4, 1);
                    return;
                case 30:
                    h0.b.a();
                    h0.b.d().carsetheat(1, 2);
                    return;
                case 31:
                    h0.b.a();
                    h0.b.d().carsetheat(2, 2);
                    return;
                case 32:
                    h0.b.a();
                    h0.b.d().carsetheat(3, 2);
                    return;
                case 33:
                    h0.b.a();
                    h0.b.d().carsetheat(4, 2);
                    return;
                case 34:
                    h0.b.a();
                    h0.b.d().carsetvent(1, 2);
                    return;
                case 35:
                    h0.b.a();
                    h0.b.d().carsetvent(2, 2);
                    return;
                case 36:
                    h0.b.a();
                    h0.b.d().carsetvent(3, 2);
                    return;
                case 37:
                    h0.b.a();
                    h0.b.d().carsetvent(4, 2);
                    return;
                case 38:
                    h0.b.a();
                    h0.b.d().rulheatonoff(Boolean.TRUE);
                    return;
                case 39:
                    h0.b.a();
                    h0.b.d().rulheatonoff(Boolean.FALSE);
                    return;
                case 40:
                    h0.b.a();
                    h0.b.d().lobheatonoff(Boolean.TRUE);
                    return;
                case 41:
                    h0.b.a();
                    h0.b.d().lobheatonoff(Boolean.FALSE);
                    return;
                case 42:
                    h0.b.a();
                    h0.b.d().zadheatonoff(Boolean.TRUE);
                    return;
                case 43:
                    h0.b.a();
                    h0.b.d().zadheatonoff(Boolean.FALSE);
                    return;
                case 44:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(0, 1);
                    return;
                case 45:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(0, 2);
                    return;
                case 46:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(0, 3);
                    return;
                case 47:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(0, 4);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(1, 1);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(1, 2);
                    return;
                case 50:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(1, 3);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    h0.b.a();
                    h0.b.d().carZadSeatHeat(1, 4);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    h0.b.a();
                    h0.b.d().carsetvod(1);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    h0.b.a();
                    h0.b.d().carsetvod(2);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    h0.b.a();
                    h0.b.d().carsetvod(3);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    Bundle bundle2 = new Bundle();
                    String h2 = m.h(new byte[]{85, -10, -73}, new byte[]{49, -97, -60, -119, -112, -32, 26, -21});
                    h0.b.a();
                    bundle2.putInt(h2, h0.b.n().getGuDisplayID());
                    W.u(this.f1900a, m0.k2.class, bundle2);
                    return;
                case 56:
                    h0.b.a();
                    h0.b.f().a(m.h(new byte[]{-7, 56, -105, -50, -40, 3, -64, -113, -26, 34, -117, -12, -26, 0, -43, -92, -1, 36, -105, -10, -54}, new byte[]{-117, 77, -7, -111, -71, 115, -80, -48}));
                    return;
                case 57:
                    this.f1900a.sendBroadcast(new Intent(m.h(new byte[]{-99, -28, -99, -37, -33, 95, 110, 118, -114, -25, -107, -37, -44, 70, 121, 114, -115, -1, -111, -121, -50, 9, 125, 110, -112, -91, -93, -123, -45, 68, 103, 53, -72, -28, -109, ByteCompanionObject.MIN_VALUE, -55}, new byte[]{-2, -117, -16, -11, -70, 39, 15, 27})));
                    return;
                case 58:
                    h0.b.a();
                    h0.b.d().setRecirculation(true);
                    return;
                case 59:
                    h0.b.a();
                    h0.b.d().setRecirculation(false);
                    return;
                case 60:
                    Context context2 = this.f1900a;
                    int k6 = y5.k.k(context2);
                    if (k6 >= 0) {
                        int i13 = y5.k.f6636b;
                        if (i13 >= 0) {
                            k6 = i13;
                        }
                        y5.k.t(k6 - 1, context2);
                        return;
                    }
                    return;
                case 61:
                    Context context3 = this.f1900a;
                    int k10 = y5.k.k(context3);
                    if (k10 >= 0) {
                        int i14 = y5.k.f6636b;
                        if (i14 >= 0) {
                            k10 = i14;
                        }
                        y5.k.t(k10 + 1, context3);
                        return;
                    }
                    return;
                case 62:
                    c(1, -1.0f);
                    return;
                case 63:
                    c(1, 1.0f);
                    return;
                case 64:
                    c(2, -1.0f);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    c(2, 1.0f);
                    return;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(0, 1);
                    return;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(0, 2);
                    return;
                case 68:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(0, 3);
                    return;
                case TFTP.DEFAULT_PORT /* 69 */:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(0, 4);
                    return;
                case 70:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(1, 1);
                    return;
                case 71:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(1, 2);
                    return;
                case 72:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(1, 3);
                    return;
                case 73:
                    h0.b.a();
                    h0.b.d().carZadSeatVent(1, 4);
                    return;
                case 74:
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(m.h(new byte[]{90, 109, 123}, new byte[]{62, 4, 8, -42, -60, -56, -58, 43}), i11);
                    bundle3.putBoolean(m.h(new byte[]{-95, 25, 90, 56, -51, 63, -78, -42, -100, 27, 82, 38, -61, 56, -125, -38, -86, 28, 88, 36}, new byte[]{-61, 120, Base64.padSymbol, 74, -84, 74, -36, -78}), true);
                    W.u(this.f1900a, m0.w1.class, bundle3);
                    return;
                case 75:
                    h0.b.a();
                    x1 k11 = h0.b.k();
                    k11.f2074k.execute(new v1(k11, objArr == true ? 1 : 0));
                    return;
                case 76:
                    Context context4 = this.f1900a;
                    try {
                        z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                    } catch (Exception unused) {
                    }
                    try {
                        h0.b.o().saveBoolean(MockGpsService.r, !z9);
                    } catch (Exception unused2) {
                    }
                    if (!z9) {
                        MockGpsService.m(context4);
                    } else {
                        MockGpsService.b(context4);
                        context4.stopService(new Intent(context4, (Class<?>) MockGpsService.class));
                    }
                    if (!z9) {
                        i12 = R.string.mock_gps_toggle_enabled;
                    } else {
                        i12 = R.string.mock_gps_toggle_disabled;
                    }
                    y5.k.x(context4, context4.getString(i12));
                    return;
                case 77:
                    e(i11, MainWifiManadger.class);
                    return;
                case 78:
                    f(i11, m0.c3.class);
                    return;
                case FingerClient.DEFAULT_PORT /* 79 */:
                    f(i11, m0.v.class);
                    return;
                case 80:
                    e(i11, RadarActivity.class);
                    return;
                case 81:
                    y5.k.u(this.f1900a, new Intent(this.f1900a, (Class<?>) WebLauncherActivity.class).addFlags(872415232), null);
                    return;
                case 82:
                    h0.b.a();
                    h0.b.n().DisplayAreaOpenDef();
                    return;
                case 83:
                    f(i11, m0.n3.class);
                    return;
                case 84:
                    y5.k.a(TypedValues.TYPE_TARGET, this.f1900a);
                    return;
                case 85:
                    y5.k.a(-100, this.f1900a);
                    return;
                case 86:
                    y5.k.a(100, this.f1900a);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        Bundle extras;
        this.f1900a = context;
        if (intent == null) {
            action = null;
        } else {
            action = intent.getAction();
        }
        if (action != null && b().booleanValue()) {
            if (action.equals(f1899b) && (extras = intent.getExtras()) != null) {
                int i10 = extras.getInt(m.h(new byte[]{38, -1, 15, 108, -5, 97, 69}, new byte[]{65, -102, 124, 24, -114, 19, 32, 56}));
                if (i10 == 202) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{111, -88, 6, 101, 112, 90, 41, 63, 56, ByteCompanionObject.MIN_VALUE}, new byte[]{93, -9, 98, 10, 7, 52, 118, 81}));
                }
                if (i10 == 302) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{-75, -89, 6, 91, 49, -103, 77, 47, -29, -113}, new byte[]{-122, -8, 98, 52, 70, -9, 18, 65}));
                }
                if (i10 == 200) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{87, 90, -47, -85, 29, 92, 78, 93, 0, 114}, new byte[]{101, 5, -67, -50, 123, 40, 17, 51}));
                }
                if (i10 == 300) {
                    h0.b.a();
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{-97, 118, -111, 95, 22, 105, -82, 116, -55, 94}, new byte[]{-84, 41, -3, 58, 112, 29, -15, 26}));
                }
                if (i10 == 201) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{3, -59, -29, -20, 11, 26, 85, 118, 95, -1, -26}, new byte[]{49, -102, -111, -123, 108, 114, 33, 41}));
                }
                if (i10 == 301) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{114, -52, 14, 79, 13, -16, 40, 27, 47, -10, 11}, new byte[]{65, -109, 124, 38, 106, -104, 92, 68}));
                }
                if (i10 == 203) {
                    h0.b.a();
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{55, -114, -51, -61, 88, -120, -107, 26}, new byte[]{5, -47, -72, -77, 7, -26, -16, 109}));
                }
                if (i10 == 303) {
                    h0.b.a();
                    h0.b.f().k(m.h(new byte[]{-108, 85, 17, 108, -92, 108, -76, -77}, new byte[]{-89, 10, 100, 28, -5, 2, -47, -60}));
                }
            }
            if (action.equals(m.h(new byte[]{-124, -125, 9, -25, 8, 17, 90, 71, -126, -113, 36, -33, 30, 27, 93, 70, -107, -121, 36, -43, 20, 12, 76, 108, -85, -115, 14, -42, 24, 0, 107}, new byte[]{-25, -30, 123, -72, 123, 104, 41, 51}))) {
                int loadInt = h0.b.o().loadInt(m.h(new byte[]{-51, 107, 6, 16, 106, -6, -21, 85, -14, 97, 7}, new byte[]{-127, 4, 115, 126, 9, -110, -87, 10}), 0);
                h0.b.a();
                g(loadInt, h0.b.n().getGuDisplayID());
            }
        }
    }
}
