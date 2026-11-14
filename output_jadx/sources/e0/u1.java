package e0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.example.navistart.cores.ColorText;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public View f2037a;

    /* renamed from: b, reason: collision with root package name */
    public WindowManager f2038b;
    public final WindowManager.LayoutParams c;
    public Runnable d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2039f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f2040g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f2041h;

    /* renamed from: i, reason: collision with root package name */
    public a1.a f2042i;

    /* renamed from: j, reason: collision with root package name */
    public ObjectAnimator f2043j;

    /* renamed from: l, reason: collision with root package name */
    public int f2045l;

    /* renamed from: m, reason: collision with root package name */
    public int f2046m;

    /* renamed from: n, reason: collision with root package name */
    public float f2047n;

    /* renamed from: o, reason: collision with root package name */
    public float f2048o;

    /* renamed from: p, reason: collision with root package name */
    public long f2049p;

    /* renamed from: k, reason: collision with root package name */
    public float f2044k = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f2050q = new Handler(Looper.getMainLooper());

    public u1(Context context, String str) {
        int i10;
        this.f2039f = context;
        this.e = str;
        h0.b.a();
        int m10 = h0.b.g().b().m();
        if (h0.b.o().loadBoolean(m.h(new byte[]{-64, 80, Base64.padSymbol, -17, 1, 27, -31, -126, -40, 79, 60, -6, 59, 28, -21, -82, -61, 92, 52}, new byte[]{-73, 57, 89, -120, 100, 111, -110, -35}), false)) {
            i10 = 808;
        } else {
            i10 = 8;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, m10, i10, -3);
        layoutParams.gravity = 51;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels / 2;
        int i12 = displayMetrics.heightPixels / 2;
        int max = Math.max(1, Math.round(displayMetrics.density * 512.0f));
        layoutParams.x = b(str.concat(m.h(new byte[]{-89}, new byte[]{-1, 110, 19, 109, 86, 18, 10, 91})), h0.b.o().loadInt(str.concat(m.h(new byte[]{-30}, new byte[]{-70, -16, -92, 6, 68, 84, 69, -101})), i11), displayMetrics.widthPixels, i11, max, m.h(new byte[]{22}, new byte[]{78, 76, -100, -32, -112, -44, -81, 98}));
        layoutParams.y = b(str.concat(m.h(new byte[]{-90}, new byte[]{-1, -114, 35, -114, -46, 92, 57, -101})), h0.b.o().loadInt(str.concat(m.h(new byte[]{-36}, new byte[]{-123, -115, 26, 8, -91, -93, 78, 70})), i12), displayMetrics.heightPixels, i12, max, m.h(new byte[]{-107}, new byte[]{-52, 8, -53, -24, 2, 90, -9, -107}));
        this.c = layoutParams;
    }

    public final void a(View view, WindowManager windowManager, Runnable runnable) {
        this.f2037a = view;
        this.f2038b = windowManager;
        this.d = runnable;
        this.f2041h = new Handler();
        this.f2042i = new a1.a(19, this, view);
    }

    public final int b(String str, int i10, int i11, int i12, int i13, String str2) {
        if (i11 > 0) {
            long j10 = i10;
            if (j10 < (-i13) || j10 > i11 + i13) {
                h0.b.o().saveInt(str, i12);
                StringBuilder sb = new StringBuilder();
                com.google.protobuf.q.u(new byte[]{-53, -66, 30, 83, 94, 31}, new byte[]{-103, -5, 77, 22, 10, 63, 20, 32}, sb, str2);
                com.google.protobuf.q.t(new byte[]{-41}, new byte[]{-22, 125, -105, 33, 125, 27, -56, 28}, sb, i10);
                com.google.protobuf.q.t(new byte[]{2, -32, 83, -36, -67, -93, -96, -72, 75, -23, 85, -109}, new byte[]{34, -109, 48, -82, -40, -58, -50, -21}, sb, i11);
                com.google.protobuf.q.t(new byte[]{-125, 96, -93, -51, 2, -62, 38, -85}, new byte[]{-93, 13, -62, -65, 101, -85, 72, -106}, sb, i13);
                sb.append(m.h(new byte[]{-36, -127, -51, -14, 5, Base64.padSymbol, -41, -119, -63}, new byte[]{-4, -27, -88, -108, 100, 72, -69, -3}));
                sb.append(i12);
                c(sb.toString());
                return i12;
            }
        }
        return i10;
    }

    public final void c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m.h(new byte[]{79, 86, 29, 55, 38, 22, 26, 125, 34, 98}, new byte[]{2, 57, 107, 82, 112, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 10}));
        sb.append(this.e);
        h0.b.w(com.google.protobuf.q.l(new byte[]{54, 96}, new byte[]{107, 64, -24, 39, -87, 56, 81, 20}, sb, str), ColorText.RED);
    }

    public final void d() {
        this.f2037a.setOnTouchListener(new t1(this, this.d));
    }
}
