package e0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t1 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f2034b;
    public final /* synthetic */ u1 c;

    public t1(u1 u1Var, Runnable runnable) {
        this.c = u1Var;
        this.f2034b = runnable;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Runnable runnable;
        boolean z9;
        u1 u1Var = this.c;
        Context context = u1Var.f2039f;
        String str = u1Var.e;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    ObjectAnimator objectAnimator = u1Var.f2043j;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                        u1Var.f2043j = null;
                        u1Var.f2037a.setAlpha(u1Var.f2044k);
                    }
                    u1Var.f2041h.removeCallbacks(u1Var.f2042i);
                    u1Var.f2040g = Boolean.FALSE;
                    return true;
                }
                if (!u1Var.f2040g.booleanValue()) {
                    int round = Math.round(motionEvent.getRawX() - u1Var.f2047n) + u1Var.f2045l;
                    int round2 = Math.round(motionEvent.getRawY() - u1Var.f2048o) + u1Var.f2046m;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int max = Math.max(1, Math.round(displayMetrics.density * 512.0f));
                    String i10 = com.google.protobuf.q.i(new byte[]{-14}, new byte[]{-86, -62, 118, -126, -9, 79, 65, 66}, ai.onnxruntime.a.u(str));
                    int i11 = displayMetrics.widthPixels;
                    int b10 = u1Var.b(i10, round, i11, i11 / 2, max, m.h(new byte[]{-127}, new byte[]{-39, -31, -109, -14, -58, -74, 105, -27}));
                    String i12 = com.google.protobuf.q.i(new byte[]{-7}, new byte[]{-96, 99, -7, 29, -36, 19, -47, 122}, ai.onnxruntime.a.u(str));
                    int i13 = displayMetrics.heightPixels;
                    int b11 = u1Var.b(i12, round2, i13, i13 / 2, max, m.h(new byte[]{119}, new byte[]{46, -114, 19, -68, -78, 79, -113, 122}));
                    if (b10 != round || b11 != round2) {
                        u1Var.f2045l = b10;
                        u1Var.f2046m = b11;
                        u1Var.f2047n = motionEvent.getRawX();
                        u1Var.f2048o = motionEvent.getRawY();
                    }
                    WindowManager.LayoutParams layoutParams = u1Var.c;
                    layoutParams.x = b10;
                    layoutParams.y = b11;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (uptimeMillis - u1Var.f2049p >= 300) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        u1Var.f2049p = uptimeMillis;
                        StringBuilder sb = new StringBuilder();
                        sb.append(m.h(new byte[]{19, -125, 12, 42, -100, 45, -23, -117, 99, -28}, new byte[]{94, -52, 90, 111, -68, 95, -120, -4}));
                        sb.append(motionEvent.getRawX());
                        sb.append(m.h(new byte[]{66, 86}, new byte[]{110, 118, -78, 98, 107, 39, -29, -124}));
                        sb.append(motionEvent.getRawY());
                        sb.append(m.h(new byte[]{-71, 102, -38, -117, 101, 78, 39, -13, -72}, new byte[]{-112, 70, -66, -18, 9, 58, 70, -50}));
                        sb.append(motionEvent.getRawX() - u1Var.f2047n);
                        sb.append(m.h(new byte[]{32, 57}, new byte[]{12, 25, 12, -115, 21, 74, -124, 79}));
                        sb.append(motionEvent.getRawY() - u1Var.f2048o);
                        com.google.protobuf.q.t(new byte[]{79, -68, 113, 107, -120, ByteCompanionObject.MAX_VALUE, 22, -71, 91, -76}, new byte[]{102, -100, 5, 10, -6, 24, 115, -51}, sb, b10);
                        com.google.protobuf.q.t(new byte[]{109, -70}, new byte[]{65, -102, -3, 53, -60, 35, 37, 91}, sb, b11);
                        sb.append(m.h(new byte[]{8}, new byte[]{33, 13, -108, 15, -60, -80, 32, 101}));
                        u1Var.c(sb.toString());
                    }
                    u0.a o5 = h0.b.o();
                    StringBuilder u8 = ai.onnxruntime.a.u(str);
                    u8.append(m.h(new byte[]{-30}, new byte[]{-70, -124, -20, 51, -110, -38, 58, 86}));
                    o5.saveInt(u8.toString(), b10);
                    u0.a o9 = h0.b.o();
                    StringBuilder u9 = ai.onnxruntime.a.u(str);
                    u9.append(m.h(new byte[]{60}, new byte[]{101, 11, -31, 1, 42, -40, -71, -2}));
                    o9.saveInt(u9.toString(), b11);
                    u1Var.f2050q.post(new s1(this, z9, b10, b11, 0));
                    if (b10 > 10 || b11 > 10) {
                        u1Var.f2040g = Boolean.FALSE;
                        return true;
                    }
                }
                return true;
            }
            u1Var.c(m.h(new byte[]{32, 1, 35, -22, -43, -123, 83, -104}, new byte[]{117, 81, 3, -104, -76, -14, 110, -80}) + motionEvent.getRawX() + m.h(new byte[]{30, 101}, new byte[]{50, 69, -84, -48, 19, -121, 124, 64}) + motionEvent.getRawY() + m.h(new byte[]{49, -77, -35, -63, -63, -24, -109, -6, 37, -69}, new byte[]{24, -109, -86, -88, -81, -116, -4, -115}) + u1Var.c.x + m.h(new byte[]{-5, 94}, new byte[]{-41, 126, -114, -100, 72, 55, 80, -24}) + u1Var.c.y + m.h(new byte[]{75, 3, 85, -89, -47, 86}, new byte[]{98, 35, 56, -56, -89, 107, -112, -125}) + u1Var.f2040g);
            if (u1Var.f2040g.booleanValue() && (runnable = this.f2034b) != null) {
                runnable.run();
            }
            ObjectAnimator objectAnimator2 = u1Var.f2043j;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                u1Var.f2043j = null;
                u1Var.f2037a.setAlpha(u1Var.f2044k);
            }
            u1Var.f2041h.removeCallbacks(u1Var.f2042i);
            return true;
        }
        u1Var.f2040g = Boolean.TRUE;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        int max2 = Math.max(1, Math.round(displayMetrics2.density * 512.0f));
        WindowManager.LayoutParams layoutParams2 = u1Var.c;
        String i14 = com.google.protobuf.q.i(new byte[]{46}, new byte[]{118, -77, -76, 21, -99, 101, -90, 75}, ai.onnxruntime.a.u(str));
        int i15 = u1Var.c.x;
        int i16 = displayMetrics2.widthPixels;
        layoutParams2.x = u1Var.b(i14, i15, i16, i16 / 2, max2, m.h(new byte[]{-92}, new byte[]{-4, 19, 34, -81, -83, -5, -107, -71}));
        WindowManager.LayoutParams layoutParams3 = u1Var.c;
        String i17 = com.google.protobuf.q.i(new byte[]{-14}, new byte[]{-85, -56, 17, 106, 120, 78, -19, 40}, ai.onnxruntime.a.u(str));
        int i18 = u1Var.c.y;
        int i19 = displayMetrics2.heightPixels;
        layoutParams3.y = u1Var.b(i17, i18, i19, i19 / 2, max2, m.h(new byte[]{-123}, new byte[]{-36, -12, 109, 20, 40, -109, 10, 126}));
        WindowManager.LayoutParams layoutParams4 = u1Var.c;
        u1Var.f2045l = layoutParams4.x;
        u1Var.f2046m = layoutParams4.y;
        u1Var.f2047n = motionEvent.getRawX();
        u1Var.f2048o = motionEvent.getRawY();
        u1Var.f2049p = 0L;
        u1Var.c(m.h(new byte[]{8, 123, -76, -89, 106, -55, -98, -50, 113, 28}, new byte[]{76, 52, -29, -23, 74, -69, -1, -71}) + u1Var.f2047n + m.h(new byte[]{-79, -42}, new byte[]{-99, -10, 114, -36, 110, -101, 104, -54}) + u1Var.f2048o + m.h(new byte[]{74, -124, 69, -48, 86, 122, 29, 123, 94, -116}, new byte[]{99, -92, 50, -71, 56, 30, 114, 12}) + u1Var.f2045l + m.h(new byte[]{-112, 98}, new byte[]{-68, 66, -60, 111, 10, 26, -38, -109}) + u1Var.f2046m + m.h(new byte[]{-56, 74, 43, 94, -120, -123, -74, 124, -101, 15, 96, 31}, new byte[]{-31, 106, 93, 55, -19, -14, -27, 21}) + u1Var.f2037a.getWidth() + m.h(new byte[]{103, -118}, new byte[]{75, -86, -76, -39, -7, 80, -77, 122}) + u1Var.f2037a.getHeight() + m.h(new byte[]{-13, 96, -88, -30, 24, -88, -38}, new byte[]{-38, 64, -36, -101, 104, -51, -25, -88}) + u1Var.c.type + m.h(new byte[]{108, -48, -123, -116, -46, 110, 111}, new byte[]{76, -74, -23, -19, -75, 29, 82, -116}) + u1Var.c.flags);
        u1Var.f2041h.postDelayed(u1Var.f2042i, (long) 500);
        return true;
    }
}
