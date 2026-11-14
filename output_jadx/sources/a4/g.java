package a4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.example.navistart.LocServ;
import com.example.navistart.MainActivity;
import com.example.navistart.MyA11yService;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.NLService;
import com.example.navistart.OverlayService;
import com.example.navistart.R;
import com.example.navistart.SpeedBoardActi;
import com.example.navistart.SystemMessageReceiver;
import com.example.navistart.TService;
import com.example.navistart.TestSpaceActivity;
import com.example.navistart.ZaglushkaActivity;
import com.example.navistart.boot;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.InterC;
import com.example.navistart.punto;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.journeyapps.barcodescanner.BarcodeView;
import d4.m;
import e0.i;
import e0.j;
import e0.j2;
import e0.q;
import e0.x1;
import e0.y2;
import e4.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f34b = i10;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v70, types: [v0.g, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v15, types: [d2.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [v0.g, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        SpannableStringBuilder spannableStringBuilder;
        int i10 = 3;
        switch (this.f34b) {
            case 0:
                h hVar = (h) this.c;
                hVar.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hVar.e;
                ViewDragHelper viewDragHelper = sideSheetBehavior.f1405i;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    hVar.a(hVar.f36b);
                    return;
                } else {
                    if (sideSheetBehavior.f1404h == 2) {
                        sideSheetBehavior.a(hVar.f36b);
                        return;
                    }
                    return;
                }
            case 1:
                Carousel.a((Carousel) this.c);
                return;
            case 2:
                DefaultSpecialEffectsController.startTransitions$lambda$11((ArrayList) this.c);
                return;
            case 3:
                ((Fragment) this.c).lambda$performCreateView$0();
                return;
            case 4:
                ProcessLifecycleOwner.a((ProcessLifecycleOwner) this.c);
                return;
            case 5:
                b7.f.a((BarcodeView) ((r5.c) this.c).c);
                return;
            case 6:
                c7.b bVar = ((c7.a) this.c).f541a;
                bVar.f544b = false;
                bVar.a();
                return;
            case 7:
                d2.h hVar2 = (d2.h) this.c;
                hVar2.e = new SpannableStringBuilder();
                synchronized (((LinkedList) hVar2.d)) {
                    arrayList = new ArrayList((LinkedList) hVar2.d);
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    j jVar = (j) obj;
                    String str = jVar.f1943a;
                    ColorText colorText = jVar.f1944b;
                    int length = ((SpannableStringBuilder) hVar2.e).length();
                    ((SpannableStringBuilder) hVar2.e).append((CharSequence) str).append((CharSequence) "\n");
                    int length2 = ((SpannableStringBuilder) hVar2.e).length();
                    int i12 = i.f1937a[colorText.ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                ((SpannableStringBuilder) hVar2.e).setSpan(new ForegroundColorSpan(-16711936), length, length2, 0);
                            }
                        } else {
                            ((SpannableStringBuilder) hVar2.e).setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), length, length2, 0);
                        }
                    } else {
                        ((SpannableStringBuilder) hVar2.e).setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), length, length2, 0);
                    }
                }
                TestSpaceActivity testSpaceActivity = (TestSpaceActivity) hVar2.f1739a;
                if (testSpaceActivity != null && (spannableStringBuilder = (SpannableStringBuilder) hVar2.e) != null) {
                    new Handler(Looper.getMainLooper()).post(new j2(i10, testSpaceActivity, spannableStringBuilder));
                }
                ((AtomicBoolean) hVar2.f1740b).set(true);
                return;
            case 8:
                ((q) this.c).a();
                return;
            case 9:
                Location location = (Location) this.c;
                androidx.fragment.app.h hVar3 = LocServ.f736h;
                try {
                    InterC j10 = h0.b.a().j();
                    if (j10 != null) {
                        j10.lo(location);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                AlertDialog alertDialog = (AlertDialog) this.c;
                String str2 = MainActivity.f750e1;
                alertDialog.dismiss();
                return;
            case 11:
                MainActivity mainActivity = (MainActivity) ((m) this.c).f1824b;
                String str3 = MainActivity.f750e1;
                mainActivity.N();
                k.x(mainActivity.getApplicationContext(), e0.m.h(new byte[]{122, 116, 13, -106, -39, -45, -126, 63, 122, 86, 12, -96, -39, -46, 115, 111, 24, 54, 102, -51, -78, -78, -29, 111, 30, 54, 102, -51, -71, 88, 115}, new byte[]{-86, -26, -36, 29, 9, 98, 83, -65}) + mainActivity.A());
                return;
            case 12:
                n0.g gVar = (n0.g) this.c;
                if (x1.r != null) {
                    h0.b.w(e0.m.h(new byte[]{-68, 125, -72, -11, -99, 82, -68, -52, -123, 106, -77, -16, -112, 116, -95, -126, -36, 56}, new byte[]{-15, 24, -36, -100, -4, 17, -45, -94}) + x1.r.getPackageName() + e0.m.h(new byte[]{-46, -32, -100}, new byte[]{-14, -51, -68, 101, -72, -42, -75, 112}) + gVar.name(), ColorText.RED);
                    int ordinal = gVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    x1.r.getTransportControls().skipToPrevious();
                                    return;
                                }
                                return;
                            }
                            x1.r.getTransportControls().skipToNext();
                            return;
                        }
                        x1.r.getTransportControls().pause();
                        return;
                    }
                    x1.r.getTransportControls().play();
                    return;
                }
                h0.b.w(e0.m.h(new byte[]{125, -1, -83, -89, -19, 50, -104, -40, 68, -24, -90, -94, -32, 20, -123, -106, 29, -70, -121, -101, -64, Base64.padSymbol}, new byte[]{48, -102, -55, -50, -116, 113, -9, -74}), ColorText.RED);
                return;
            case 13:
                MyA11yService myA11yService = (MyA11yService) this.c;
                if (MyA11yService.d == null) {
                    e0.g gVar2 = new e0.g(6);
                    ?? obj2 = new Object();
                    obj2.f1741f = new HashMap();
                    obj2.e = new HashSet();
                    obj2.f1739a = new WeakReference(myA11yService);
                    obj2.d = gVar2;
                    obj2.c = new o0.e(myA11yService);
                    obj2.f1740b = (WindowManager) myA11yService.getSystemService(e0.m.h(new byte[]{54, 69, 15, -115, -72, -104}, new byte[]{65, 44, 97, -23, -41, -17, 3, 10}));
                    MyA11yService.d = obj2;
                    Handler handler = new Handler(Looper.getMainLooper());
                    d2.h hVar4 = MyA11yService.d;
                    Objects.requireNonNull(hVar4);
                    handler.post(new g(14, hVar4));
                }
                new SystemMessageReceiver().onReceive(myA11yService.getApplicationContext(), new Intent(e0.m.h(new byte[]{-39, -91, 83, 114, -92, -120, -36, -86, -47, -91, 67, 101, -91, -107, -106, -27, -37, -65, 94, 111, -91, -49, -6, -53, -9, -97, 104, 67, -124, -84, -24, -56, -3, -97, 114, 68}, new byte[]{-72, -53, 55, 0, -53, -31, -72, -124})));
                try {
                    h0.b.v(e0.m.h(new byte[]{80, 111, 122, 77, -66, -119, 112, -31, 120, 96, 112, 92, -76, -87, 124, -15, 103, 101, 122, 77, -19, -41, 57, -52, 95}, new byte[]{17, 12, 25, 40, -51, -6, 25, -125}));
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 14:
                d2.h hVar5 = (d2.h) this.c;
                hVar5.m();
                HashSet hashSet = (HashSet) hVar5.e;
                hashSet.clear();
                o0.e eVar = (o0.e) hVar5.c;
                eVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (o0.f fVar : o0.f.values()) {
                    if (eVar.a(fVar)) {
                        arrayList2.add(fVar);
                    }
                }
                hashSet.addAll(arrayList2);
                Context context = (Context) ((WeakReference) hVar5.f1739a).get();
                if (context != null) {
                    int max = Math.max(1, Math.round(32.0f * context.getResources().getDisplayMetrics().density));
                    WindowManager windowManager = (WindowManager) hVar5.f1740b;
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    try {
                        try {
                            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    }
                    if (displayMetrics.widthPixels <= 0 || displayMetrics.heightPixels <= 0) {
                        displayMetrics = context.getResources().getDisplayMetrics();
                    }
                    int i13 = displayMetrics.widthPixels;
                    int i14 = displayMetrics.heightPixels;
                    o0.f fVar2 = o0.f.f4305b;
                    if (hashSet.contains(fVar2)) {
                        hVar5.k(fVar2, 0, 0, max, i14 / 2);
                    }
                    o0.f fVar3 = o0.f.c;
                    if (hashSet.contains(fVar3)) {
                        int i15 = i14 / 2;
                        hVar5.k(fVar3, 0, i15, max, i15);
                    }
                    o0.f fVar4 = o0.f.d;
                    if (hashSet.contains(fVar4)) {
                        hVar5.k(fVar4, i13 - max, 0, max, i14 / 2);
                    }
                    o0.f fVar5 = o0.f.e;
                    if (hashSet.contains(fVar5)) {
                        int i16 = i14 / 2;
                        hVar5.k(fVar5, i13 - max, i16, max, i16);
                    }
                    int i17 = i14 - max;
                    int i18 = i13 - (max * 2);
                    int i19 = i18 / 2;
                    int i20 = i18 - i19;
                    if (i18 > 0) {
                        o0.f fVar6 = o0.f.f4306f;
                        if (hashSet.contains(fVar6)) {
                            hVar5.k(fVar6, max, i17, i19, max);
                        }
                        o0.f fVar7 = o0.f.f4307g;
                        if (hashSet.contains(fVar7)) {
                            hVar5.k(fVar7, max + i19, i17, i20, max);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                MyCarReceiver myCarReceiver = (MyCarReceiver) this.c;
                try {
                    if (MyCarReceiver.k().booleanValue()) {
                        h0.b.a();
                        h0.b.g().d().i(myCarReceiver.f853b);
                        return;
                    }
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 16:
                NLService nLService = (NLService) this.c;
                ScheduledExecutorService scheduledExecutorService = NLService.e;
                if (!boot.f953u) {
                    Log.e(nLService.d, e0.m.h(new byte[]{-15, 26, -58, -107}, new byte[]{-77, 85, -119, -63, -72, 45, -79, -2}));
                    new SystemMessageReceiver().onReceive(nLService.getApplicationContext(), new Intent(e0.m.h(new byte[]{-38, 89, 76, -119, 46, -28, 72, -126, -46, 89, 92, -98, 47, -7, 2, -51, -40, 67, 65, -108, 47, -93, 110, -29, -12, 99, 119, -72, 14, -64, 124, -32, -2, 99, 109, -65}, new byte[]{-69, 55, 40, -5, 65, -115, 44, -84})));
                    return;
                }
                return;
            case 17:
                OverlayService overlayService = (OverlayService) this.c;
                OverlayService overlayService2 = OverlayService.f865f;
                overlayService.d();
                return;
            case 18:
                SpeedBoardActi speedBoardActi = (SpeedBoardActi) this.c;
                int i21 = SpeedBoardActi.f884f;
                if (!h0.b.o().loadBoolean(e0.m.h(new byte[]{-64, 9, -36, 75, -92, -66, 10, 115, -31, 29, -8, 77, -76, -107, 54, 119, -25, 13, -48, 64, -89, -113, 58, 85, -61, 42}, new byte[]{-109, 121, -71, 46, -64, -4, 101, 18}), false)) {
                    h0.b.a();
                    int speed = h0.b.d().getSpeed();
                    ?? r22 = speedBoardActi.e;
                    if (r22 != 0) {
                        r22.d(speed);
                    }
                }
                h0.b.a();
                int rpm = h0.b.d().getRPM();
                ?? r02 = speedBoardActi.e;
                if (r02 != 0) {
                    r02.l(rpm);
                    return;
                }
                return;
            case 19:
                SystemMessageReceiver systemMessageReceiver = (SystemMessageReceiver) this.c;
                systemMessageReceiver.f905a.execute(systemMessageReceiver.d);
                return;
            case 20:
                Boolean bool = (Boolean) this.c;
                d2.h hVar6 = TService.c;
                if (bool.booleanValue()) {
                    TService.e.setBackgroundResource(R.drawable.vpn_on);
                    return;
                } else {
                    TService.e.setBackgroundResource(R.drawable.vpn_off);
                    return;
                }
            case 21:
                ((TestSpaceActivity) this.c).c.fullScroll(130);
                return;
            case 22:
                ((y2) this.c).f2085b = true;
                return;
            case 23:
                ZaglushkaActivity zaglushkaActivity = (ZaglushkaActivity) this.c;
                int i22 = ZaglushkaActivity.f952b;
                zaglushkaActivity.finish();
                return;
            case 24:
                punto puntoVar = (punto) this.c;
                if (puntoVar.f1067b && !puntoVar.isFinishing() && !puntoVar.isDestroyed()) {
                    puntoVar.f1073k.requestRectangleOnScreen(new Rect(0, 0, puntoVar.f1073k.getWidth(), puntoVar.f1073k.getHeight()), false);
                    return;
                }
                return;
            case 25:
                ((e4.d) this.c).s(true);
                return;
            case 26:
                l lVar = (l) this.c;
                boolean isPopupShowing = lVar.f2137h.isPopupShowing();
                lVar.s(isPopupShowing);
                lVar.f2142m = isPopupShowing;
                return;
            case 27:
                ((TextInputLayout) this.c).f1448f.requestLayout();
                return;
            case 28:
                f1.e eVar2 = (f1.e) this.c;
                int i23 = f1.e.f2247q;
                eVar2.Q(false);
                return;
            default:
                com.bumptech.glide.m mVar = (com.bumptech.glide.m) this.c;
                ((f1.e) mVar.c).f2253b.post(new j2(7, mVar, f1.e.v(e0.m.h(new byte[]{95, 13, 28, -16, 14, 86, -61, -125, 91, 4, 1, -62, 28, 86, -57, -88, 89}, new byte[]{60, 97, 117, -99, 111, 34, -90, -36}), null)));
                return;
        }
    }
}
