package e0;

import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.navistart.MyA11yService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2083b;
    public final /* synthetic */ MyA11yService c;
    public final /* synthetic */ AccessibilityEvent d;

    public /* synthetic */ y1(MyA11yService myA11yService, AccessibilityEvent accessibilityEvent, int i10) {
        this.f2083b = i10;
        this.c = myA11yService;
        this.d = accessibilityEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        String charSequence;
        int i10 = this.f2083b;
        AccessibilityEvent accessibilityEvent = this.d;
        MyA11yService myA11yService = this.c;
        switch (i10) {
            case 0:
                MyA11yService myA11yService2 = MyA11yService.c;
                if (accessibilityEvent.getEventType() == 262144) {
                    Log.d(m.h(new byte[]{-11, -99, 56, 29, 84, -86, 122}, new byte[]{-78, -40, 107, 73, 1, -8, 63, 113}), m.h(new byte[]{62, 17, 46, -13, 89, -111, -29, 48, 10, 0, 60, -11, 88, -122, -30}, new byte[]{121, 116, 93, -121, 44, -29, -122, 16}));
                }
                if (accessibilityEvent.getEventType() == 524288) {
                    Log.d(m.h(new byte[]{28, -46, -33, 42, 78, -58, -106}, new byte[]{91, -105, -116, 126, 27, -108, -45, -104}), m.h(new byte[]{58, -5, -28, -57, 2, -125, 9, -61, 24, -16, -13, -42, 19}, new byte[]{125, -98, -105, -77, 119, -15, 108, -29}));
                }
                if (accessibilityEvent.getEventType() == 512) {
                    Log.d(m.h(new byte[]{-111, -47, -56, -50, -73, -91, 83}, new byte[]{-42, -108, -101, -102, -30, -9, 22, 22}), m.h(new byte[]{-120, 71, -92, -14, 42, -23, -32, 80, -84, 68, -66, -29, 35, -67, -20, 71, -78, 8, -94, -27, 35, -69, -15, 77, -72}, new byte[]{-36, 40, -47, -111, 66, -55, -123, 40}));
                }
                int i11 = 1;
                if (MyA11yService.e == null) {
                    MyA11yService.e = Boolean.valueOf(h0.b.o().loadBoolean(m.h(new byte[]{46, -60, -45, -48, 55, -79, 35, 15, 60, -9, -37, -35, 47, -102, 54, 12, 32, -9, -59, -38, 50, -79, 52, 12, 37, -53, -39}, new byte[]{76, -88, -78, -77, 92, -18, 87, 96}), true));
                }
                String str = e1.a.f2094a;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - e1.a.f2096f >= 600) {
                    boolean z10 = false;
                    try {
                        z9 = n0.a.f4047f.name().equals(h0.b.o().loadString(e1.a.f2094a, n0.a.d.name()));
                    } catch (Exception unused) {
                        z9 = false;
                    }
                    if (z9) {
                        String str2 = "";
                        if (accessibilityEvent.getPackageName() == null) {
                            charSequence = "";
                        } else {
                            charSequence = accessibilityEvent.getPackageName().toString();
                        }
                        if (charSequence != null && !charSequence.isEmpty()) {
                            try {
                                str2 = h0.b.o().loadString(e1.a.f2095b, "");
                            } catch (Exception unused2) {
                            }
                            z10 = (str2 == null || str2.trim().isEmpty()) ? charSequence.equals(e1.a.c) : charSequence.equals(str2.trim());
                        }
                        if (z10) {
                            e1.a.f2096f = currentTimeMillis;
                            AccessibilityNodeInfo accessibilityNodeInfo = null;
                            try {
                                accessibilityNodeInfo = e1.a.b(myA11yService, accessibilityEvent, charSequence);
                                if (accessibilityNodeInfo != null) {
                                    a6.a m10 = e1.a.d.m(accessibilityNodeInfo, charSequence);
                                    h0.b.a();
                                    a0 i12 = h0.b.i();
                                    e1.a.e.getClass();
                                    i12.e(e1.b.a(m10));
                                }
                            } catch (Exception unused3) {
                            } catch (Throwable th) {
                                e1.a.c(null);
                                throw th;
                            }
                            e1.a.c(accessibilityNodeInfo);
                        }
                    }
                }
                try {
                    h0.b.a();
                    if (accessibilityEvent.getEventType() == 32 || accessibilityEvent.getEventType() == 4194304) {
                        Log.i(m.h(new byte[]{100, -91, 60, -65, 52, -90, -76, 77, 74, -93, 39, -81, 24, -66, -105, 94, 87, -91, 60, -70, 47, -66, -118}, new byte[]{51, -52, 82, -37, 91, -47, -8, 44}), m.h(new byte[]{6, -85, -5, 101, -49, -77, -20, 58, 16, -72, -20, 125, -46, -22, -87, 110, 12, -66, -20, 46}, new byte[]{117, -50, -119, 19, -90, -48, -119, 26}) + accessibilityEvent.getEventType());
                    }
                    h0.b.a().j().ae(myA11yService, accessibilityEvent);
                } catch (Exception unused4) {
                }
                myA11yService.b(accessibilityEvent);
                myA11yService.f837b.schedule(new y1(myA11yService, AccessibilityEvent.obtain(accessibilityEvent), i11), 300L, TimeUnit.MILLISECONDS);
                accessibilityEvent.recycle();
                return;
            default:
                MyA11yService myA11yService3 = MyA11yService.c;
                try {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(myA11yService.getRootInActiveWindow());
                    h0.b.a();
                    h0.b.g().d().k(accessibilityEvent, obtain);
                } catch (Exception unused5) {
                } catch (Throwable th2) {
                    accessibilityEvent.recycle();
                    throw th2;
                }
                accessibilityEvent.recycle();
                return;
        }
    }
}
