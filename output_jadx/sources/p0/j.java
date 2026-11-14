package p0;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.navistart.R;
import e0.m;
import e0.v0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.q2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: l, reason: collision with root package name */
    public static final String f4976l = m.h(new byte[]{109, -72, -53, 46, 65, ByteCompanionObject.MAX_VALUE, 109, -68, 112, -94, -54, 57}, new byte[]{56, -53, -82, 92, 0, 15, 29, -49});

    /* renamed from: m, reason: collision with root package name */
    public static j f4977m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4979b;
    public q2 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final ExecutorService e = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    public final g f4980f = new g(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public WindowManager f4981g;

    /* renamed from: h, reason: collision with root package name */
    public WindowManager.LayoutParams f4982h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f4983i;

    /* renamed from: j, reason: collision with root package name */
    public int f4984j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4985k;

    public j(Context context, e eVar, q2 q2Var) {
        this.f4978a = context.getApplicationContext();
        this.f4979b = eVar;
        this.c = q2Var;
    }

    public static void b() {
        new Handler(Looper.getMainLooper()).post(new v0(26));
    }

    public final void a() {
        TextView textView;
        Log.i(f4976l, m.h(new byte[]{-109, Base64.padSymbol, -23, -55, -19, 8, 74}, new byte[]{-9, 84, -102, -92, -124, 123, 57, 28}));
        this.d.removeCallbacksAndMessages(null);
        this.e.shutdownNow();
        WindowManager windowManager = this.f4981g;
        if (windowManager != null && (textView = this.f4983i) != null) {
            a.a.v(windowManager, textView);
        }
        this.f4983i = null;
        this.f4982h = null;
        this.f4981g = null;
        if (f4977m == this) {
            f4977m = null;
        }
    }

    public final int c(int i10) {
        return Math.round(i10 * this.f4978a.getResources().getDisplayMetrics().density);
    }

    public final void d(String str) {
        TextView textView;
        Log.w(f4976l, m.h(new byte[]{122, ByteCompanionObject.MIN_VALUE, 80, 68, -33, -126, -65, ByteCompanionObject.MIN_VALUE, 96, -104, 84, 64, -46, -118, -86, -63, 119, -102, 80, 12, -109}, new byte[]{21, -10, 53, 54, -77, -29, -58, -96}).concat(str));
        q2 q2Var = this.c;
        if (q2Var != null && (textView = q2Var.f3840f) != null) {
            textView.setText(q2Var.getString(R.string.user_apps_hide_overlay_error, str));
        }
    }

    public final void e() {
        float f8;
        String h2;
        TextView textView = this.f4983i;
        if (textView == null) {
            h(1);
            return;
        }
        if (this.f4985k) {
            return;
        }
        textView.setText("");
        TextView textView2 = this.f4983i;
        this.f4979b.getClass();
        if (h0.b.o().loadBoolean(e.f4967h, false)) {
            f8 = 0.01f;
        } else {
            f8 = 1.0f;
        }
        textView2.setAlpha(f8);
        if (e.e()) {
            h2 = m.h(new byte[]{14, 111, -35, 93, -107, 29, -11, 59, 28}, new byte[]{45, 93, -17, 108, -92, 44, -60, 10});
        } else {
            h2 = m.h(new byte[]{40, 32, 64, 19, 13, 70, 80, 32, 58}, new byte[]{11, 97, 1, 34, 60, 119, 97, 17});
        }
        g(h2);
    }

    public final void f(int i10) {
        boolean z9;
        String str;
        float f8;
        String h2;
        TextView textView = this.f4983i;
        if (textView != null && !this.f4985k) {
            if (i10 >= 8) {
                e();
                return;
            }
            int i11 = 1;
            if (i10 % 2 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            textView.animate().cancel();
            TextView textView2 = this.f4983i;
            if (z9) {
                str = m.h(new byte[]{65}, new byte[]{96, 69, -61, 96, 51, -87, 58, -41});
            } else {
                str = "";
            }
            textView2.setText(str);
            TextView textView3 = this.f4983i;
            if (z9) {
                f8 = 1.0f;
            } else {
                f8 = 0.25f;
            }
            textView3.setAlpha(f8);
            byte[] bArr = {54, -40, -85, -58, 49, -34, 100, 103, 36};
            if (z9) {
                // fill-array-data instruction
                bArr[0] = -82;
                bArr[1] = -86;
                bArr[2] = 116;
                bArr[3] = 67;
                bArr[4] = 18;
                bArr[5] = 29;
                bArr[6] = -36;
                bArr[7] = 112;
                bArr[8] = -67;
                h2 = m.h(bArr, new byte[]{-115, -18, 48, 5, 39, 42, -97, 64});
            } else {
                h2 = m.h(bArr, new byte[]{21, -103, -22, -9, 0, -17, 85, 86});
            }
            g(h2);
            this.d.postDelayed(new h(this, i10, i11), 180L);
        }
    }

    public final void g(String str) {
        if (this.f4983i == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius(c(10));
        this.f4983i.setBackground(gradientDrawable);
    }

    public final void h(int i10) {
        boolean z9;
        boolean z10;
        float f8;
        StringBuilder sb = new StringBuilder();
        sb.append(m.h(new byte[]{37, -73, 105, 108, -36, -20, 19, -21, 35, -70, 117, 111, -103, -6, 86, -5, 53, -85, 111, 109, -103, -93}, new byte[]{86, -33, 6, 27, -4, -98, 118, -102}));
        boolean z11 = true;
        int i11 = 0;
        if (f4977m != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        sb.append(z9);
        sb.append(m.h(new byte[]{-49, -59, 5, 77, -82, -60, -126, 77, -46}, new byte[]{-17, -83, 100, 62, -8, -83, -25, 58}));
        if (this.f4983i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb.append(z10);
        String sb2 = sb.toString();
        String str = f4976l;
        Log.i(str, sb2);
        j jVar = f4977m;
        if (jVar != null && jVar != this) {
            jVar.a();
        }
        f4977m = this;
        if (this.f4983i != null) {
            e();
        } else {
            Context context = this.f4978a;
            TextView textView = new TextView(context);
            this.f4983i = textView;
            textView.setGravity(17);
            this.f4983i.setTextColor(-1);
            this.f4983i.setTextSize(18.0f);
            this.f4983i.setTypeface(Typeface.DEFAULT_BOLD);
            this.f4983i.setIncludeFontPadding(false);
            g(m.h(new byte[]{-73, -91, 58, 55, -119, 34, 10, 2, -91}, new byte[]{-108, -28, 123, 6, -72, 19, 59, 51}));
            TextView textView2 = this.f4983i;
            this.f4979b.getClass();
            if (h0.b.o().loadBoolean(e.f4967h, false)) {
                f8 = 0.01f;
            } else {
                f8 = 1.0f;
            }
            textView2.setAlpha(f8);
            this.f4983i.setOnTouchListener(new i(this));
            int c = c(88);
            int c10 = c(88);
            h0.b.a();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(c, c10, h0.b.g().b().m(), 808, -3);
            this.f4982h = layoutParams;
            layoutParams.gravity = 8388659;
            layoutParams.x = h0.b.o().loadInt(e.f4965f, Math.max(0, (context.getResources().getDisplayMetrics().widthPixels - c(88)) / 2));
            this.f4982h.y = h0.b.o().loadInt(e.f4966g, Math.max(0, (context.getResources().getDisplayMetrics().heightPixels - c(88)) / 2));
            h0.b.a();
            this.f4981g = h0.b.g().b().f(this.f4983i, this.f4982h);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m.h(new byte[]{13, 22, Base64.padSymbol, 84, -57, 97, 125, 21, 30, 23, 45, 119, -36, 106, 111, 81, 76, 5, 52, 63}, new byte[]{108, 114, 89, 2, -82, 4, 10, 53}));
            if (this.f4981g == null) {
                z11 = false;
            }
            sb3.append(z11);
            Log.i(str, sb3.toString());
            if (this.f4981g == null) {
                this.f4983i = null;
                d(m.h(new byte[]{7, -51, 77, 101, -84, -97, -98, -29, 62, -59, 68, 100, -79, -56, -90, -20, 49, -46, 66, 104, -81, -119, -79, -18, 53}, new byte[]{80, -92, 35, 1, -61, -24, -45, -126}));
            }
        }
        this.d.postDelayed(new h(this, i10, i11), 600L);
    }

    public final void i(int i10, int i11) {
        int min;
        if (i11 <= 0) {
            min = 0;
        } else {
            min = Math.min(100, Math.round((i10 * 100.0f) / i11));
        }
        TextView textView = this.f4983i;
        if (textView != null) {
            textView.animate().cancel();
            this.f4983i.setAlpha(1.0f);
            this.f4983i.setText(min + m.h(new byte[]{-123}, new byte[]{-96, 2, 50, 68, -108, 60, 1, -75}));
            g(m.h(new byte[]{55, -117, 58, 82, 97, 16, 76, -120, 37}, new byte[]{20, -56, 121, 99, 80, 33, 125, -71}));
        }
    }
}
