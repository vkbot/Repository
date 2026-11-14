package x0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import com.example.navistart.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.protobuf.q;
import e0.c3;
import e0.t1;
import e0.u1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final ExecutorService f6430s = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6431b;
    public final o c;
    public final boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6432f;

    /* renamed from: g, reason: collision with root package name */
    public int f6433g;

    /* renamed from: h, reason: collision with root package name */
    public long f6434h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f6435i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f6436j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f6437k;

    /* renamed from: l, reason: collision with root package name */
    public final e0.f f6438l;

    /* renamed from: m, reason: collision with root package name */
    public Runnable f6439m;

    /* renamed from: n, reason: collision with root package name */
    public Consumer f6440n;

    /* renamed from: o, reason: collision with root package name */
    public u1 f6441o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6442p;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f6443q;
    public final t1.l r;

    public c(Context context, o oVar, boolean z9, boolean z10) {
        super(new ContextThemeWrapper(context, R.style.Theme_JCarTools_Modern));
        boolean z11;
        this.f6431b = new Handler(Looper.getMainLooper());
        this.f6435i = new HashMap();
        this.f6436j = new HashMap();
        this.f6437k = new HashMap();
        this.f6438l = new e0.f(this, 2);
        this.r = new t1.l(2, this);
        this.c = oVar;
        this.d = z9;
        if (oVar.d && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.e = z11;
        k();
    }

    public static boolean h(m mVar) {
        n nVar = mVar.c;
        if (nVar != n.d && nVar != n.f6468f) {
            return false;
        }
        return true;
    }

    public static boolean i(m mVar) {
        n nVar = mVar.c;
        if (nVar != n.f6467b && nVar != n.c) {
            return true;
        }
        return false;
    }

    public static int n(m mVar) {
        n nVar = mVar.c;
        if (nVar != n.d && nVar != n.e) {
            return 2;
        }
        return 1;
    }

    public final void a(View view, int i10, int i11, int i12, int i13) {
        if (!this.e && !this.d) {
            int[] e = e();
            i10 -= e[0];
            i11 -= e[1];
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f(i12), f(i13));
        layoutParams.leftMargin = p(i10);
        layoutParams.topMargin = p(i11);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(o());
        view.setScaleY(o());
        addView(view, layoutParams);
    }

    public final int b() {
        boolean z9 = this.e;
        if (!z9 && !this.d) {
            return e()[3] - e()[1];
        }
        return this.c.c(z9);
    }

    public final int c() {
        boolean z9 = this.e;
        if (!z9 && !this.d) {
            return e()[2] - e()[0];
        }
        return this.c.f(z9);
    }

    public final int d(int i10) {
        return ContextCompat.getColor(getContext(), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f6431b.removeCallbacks(this.f6438l);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return dispatchTouchEvent;
        }
        l();
        return dispatchTouchEvent;
    }

    public final int[] e() {
        int i10;
        int i11;
        int i12;
        o oVar = this.c;
        boolean z9 = oVar.d;
        if (z9) {
            i10 = oVar.f6480n;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (z9) {
            i11 = oVar.f6481o;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        int i13 = Integer.MIN_VALUE;
        if (z9) {
            i12 = i10 + 64;
        } else {
            i12 = Integer.MIN_VALUE;
        }
        if (z9) {
            i13 = i11 + 64;
        }
        ArrayList arrayList = oVar.f6485u;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            m mVar = (m) obj;
            if (mVar.f6462f) {
                i10 = Math.min(i10, mVar.f6465i);
                i11 = Math.min(i11, mVar.f6466j);
                i12 = Math.max(i12, mVar.b() + mVar.f6465i);
                i13 = Math.max(i13, mVar.a() + mVar.f6466j);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return new int[]{0, 0, 1, 1};
        }
        if (oVar.d && oVar.t) {
            int i15 = oVar.f6480n + 32;
            int i16 = oVar.f6481o + 32;
            int max = Math.max(i15 - i10, i12 - i15);
            int max2 = Math.max(i16 - i11, i13 - i16);
            int i17 = i15 - max;
            i12 = i15 + max;
            int i18 = i16 - max2;
            int i19 = i16 + max2;
            i11 = i18;
            i10 = i17;
            i13 = i19;
        }
        if (oVar.f6473g) {
            int i20 = i12 - i10;
            int i21 = i13 - i11;
            int max3 = Math.max(i20, i21);
            i10 -= (max3 - i20) / 2;
            i12 = i10 + max3;
            i11 -= (max3 - i21) / 2;
            i13 = i11 + max3;
        }
        return new int[]{i10, i11, i12, i13};
    }

    public final int f(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final void g(m mVar, View view) {
        view.setOnTouchListener(new b(this, mVar));
        if (view instanceof LinearLayout) {
            int i10 = 0;
            while (true) {
                LinearLayout linearLayout = (LinearLayout) view;
                if (i10 < linearLayout.getChildCount()) {
                    linearLayout.getChildAt(i10).setClickable(false);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        int d;
        String j10;
        int d10;
        ArrayList arrayList = this.c.f6485u;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m mVar = (m) obj;
            View[] viewArr = (View[]) this.f6436j.get(mVar.f6460a);
            if (viewArr != null) {
                int intValue = ((Integer) this.f6435i.getOrDefault(mVar.f6460a, 0)).intValue();
                if (h(mVar)) {
                    d = Color.rgb(255, 170, 100);
                } else {
                    d = d(R.color.modern_primary);
                }
                for (int i11 = 0; i11 < viewArr.length; i11++) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(f(3));
                    if (i11 < intValue) {
                        d10 = d;
                    } else {
                        d10 = d(R.color.modern_divider);
                    }
                    gradientDrawable.setColor(d10);
                    viewArr[i11].setBackground(gradientDrawable);
                }
                LinearLayout linearLayout = (LinearLayout) ((View) viewArr[0].getParent()).getParent();
                ImageView imageView = (ImageView) linearLayout.getChildAt(0);
                if (intValue <= 0) {
                    d = d(R.color.modern_text_secondary);
                }
                imageView.setImageTintList(ColorStateList.valueOf(d));
                StringBuilder sb = new StringBuilder();
                sb.append(mVar.f6461b);
                if (intValue == 0) {
                    j10 = e0.m.h(new byte[]{-28, -8, 73, 68, -8, -55, 9, 67, 24, 99, 72, 120, -8, -59, 9, 76, 24, 101, 73, 72}, new byte[]{-56, -40, -103, -10, 41, 66, -39, -7});
                } else {
                    j10 = q.j(new byte[]{95, -125, -113, 97, -50, -23, 39, 92, -93, 17, -114, 87, -49, -44, 38, 110, 83}, new byte[]{115, -93, 94, -30, 31, 105, -9, -30}, new StringBuilder(), intValue);
                }
                sb.append(j10);
                linearLayout.setContentDescription(sb.toString());
            }
        }
    }

    public final void k() {
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        String h2;
        CharSequence h10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        CharSequence charSequence;
        int i18;
        removeAllViews();
        HashMap hashMap = this.f6436j;
        hashMap.clear();
        o oVar = this.c;
        setAlpha(1.0f - (oVar.f6476j / 100.0f));
        setMinimumWidth(p(c()));
        setMinimumHeight(p(b()));
        s();
        int i19 = 16;
        if (this.e) {
            TextView r = r(15, oVar.f6471b);
            r.setGravity(16);
            int c = c();
            if (oVar.d) {
                i18 = 76;
            } else {
                i18 = 32;
            }
            a(r, 16, 0, c - i18, 40);
            u1 u1Var = this.f6441o;
            if (u1Var != null) {
                r.setOnTouchListener(new t1(u1Var, u1Var.d));
            }
        }
        ArrayList arrayList = oVar.f6485u;
        int size = arrayList.size();
        int i20 = 0;
        while (true) {
            i10 = 4;
            z9 = this.d;
            if (i20 >= size) {
                break;
            }
            int i21 = i20 + 1;
            m mVar = (m) arrayList.get(i20);
            if (!this.e && !mVar.f6462f) {
                i20 = i21;
            } else {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setPadding(f(6), f(6), f(6), f(6));
                linearLayout.setBackground(q(d(R.color.modern_surface_high), i19));
                linearLayout.setElevation(f(2));
                TextView r9 = r(11, mVar.f6461b);
                r9.setMaxLines(2);
                CharSequence charSequence2 = mVar.f6461b;
                n nVar = mVar.c;
                if (nVar == n.f6467b) {
                    j0.e b10 = j0.f.b(getContext(), mVar.d);
                    linearLayout.setPadding(f(4), f(4), f(4), f(4));
                    ImageView imageView = new ImageView(getContext());
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setPadding(f(4), f(4), f(4), f(4));
                    imageView.setBackground(q(Color.rgb(105, 132, 146), 12));
                    Drawable drawable = b10.f3100j;
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    } else {
                        imageView.setImageResource(android.R.drawable.ic_menu_help);
                        imageView.setImageTintList(ColorStateList.valueOf(d(R.color.modern_text)));
                    }
                    linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -1));
                    String str = b10.f3099i;
                    if (str != null && !str.trim().isEmpty()) {
                        charSequence = b10.f3099i;
                    } else {
                        charSequence = mVar.f6461b;
                    }
                    charSequence2 = charSequence;
                    if (!z9) {
                        linearLayout.setOnClickListener(new androidx.navigation.ui.a(24, this, b10));
                    }
                } else if (nVar == n.c) {
                    linearLayout.addView(r9);
                    MaterialSwitch materialSwitch = new MaterialSwitch(getContext(), null);
                    materialSwitch.setContentDescription(mVar.f6461b);
                    materialSwitch.setChecked(((Boolean) this.f6437k.getOrDefault(mVar.f6460a, Boolean.valueOf(h0.b.o().loadBoolean(e0.m.h(new byte[]{-104, 47, -82, 11, 5, 117, -44, -123, -126, 46, -67, 6, 40}, new byte[]{-21, 90, -34, 110, 119, 42, -89, -14}) + oVar.f6470a + mVar.f6460a, false)))).booleanValue());
                    materialSwitch.setClickable(z9 ^ true);
                    linearLayout.addView(materialSwitch);
                    if (!z9) {
                        materialSwitch.setOnCheckedChangeListener(new c3(i10, this, mVar));
                    }
                } else {
                    ImageView imageView2 = new ImageView(getContext());
                    if (h(mVar)) {
                        if (n(mVar) == 1) {
                            i15 = R.drawable.car_seat_heat_l;
                        } else {
                            i15 = R.drawable.car_seat_heat_r;
                        }
                    } else if (n(mVar) == 1) {
                        i15 = R.drawable.car_seat_vent_l2;
                    } else {
                        i15 = R.drawable.car_seat_vent_r2;
                    }
                    imageView2.setImageResource(i15);
                    imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    linearLayout.addView(imageView2, new LinearLayout.LayoutParams(f(32), f(32)));
                    r9.setTextSize(9.0f);
                    linearLayout.addView(r9, new LinearLayout.LayoutParams(-1, f(28)));
                    LinearLayout linearLayout2 = new LinearLayout(getContext());
                    linearLayout2.setGravity(17);
                    View[] viewArr = new View[3];
                    int i22 = 0;
                    for (int i23 = 3; i22 < i23; i23 = 3) {
                        View view = new View(getContext());
                        viewArr[i22] = view;
                        view.setImportantForAccessibility(2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f(14), f(5));
                        layoutParams.setMargins(f(3), 0, f(3), 0);
                        linearLayout2.addView(view, layoutParams);
                        i22++;
                    }
                    linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, f(12)));
                    hashMap.put(mVar.f6460a, viewArr);
                    if (!z9) {
                        linearLayout.setOnClickListener(new androidx.navigation.ui.a(25, this, mVar));
                    }
                }
                linearLayout.setContentDescription(charSequence2);
                boolean z11 = this.e;
                if (z11) {
                    i16 = mVar.f6463g;
                } else {
                    i16 = mVar.f6465i;
                }
                if (z11) {
                    i17 = mVar.f6464h;
                } else {
                    i17 = mVar.f6466j;
                }
                a(linearLayout, i16, i17, mVar.b(), mVar.a());
                if (z9) {
                    g(mVar, linearLayout);
                } else if (this.f6441o != null) {
                    Runnable jVar = new f5.j(23, linearLayout);
                    if (mVar.c == n.c) {
                        View childAt = linearLayout.getChildAt(1);
                        Objects.requireNonNull(childAt);
                        Runnable oVar2 = new s3.o(2, childAt);
                        u1 u1Var2 = this.f6441o;
                        u1Var2.getClass();
                        childAt.setOnTouchListener(new t1(u1Var2, oVar2));
                        jVar = oVar2;
                    }
                    u1 u1Var3 = this.f6441o;
                    u1Var3.getClass();
                    linearLayout.setOnTouchListener(new t1(u1Var3, jVar));
                }
                i20 = i21;
                i19 = 16;
            }
        }
        if (oVar.d) {
            if (this.e) {
                i11 = 8;
                h2 = e0.m.h(new byte[]{-3, 95, -50}, new byte[]{31, -41, 92, -41, 12, -73, 70, 95});
                z10 = false;
            } else {
                i11 = 8;
                z10 = false;
                h2 = e0.m.h(new byte[]{-80}, new byte[]{-101, 54, 6, -103, -105, 11, 15, -93});
            }
            TextView r10 = r(24, h2);
            r10.setIncludeFontPadding(z10);
            if (this.e) {
                byte[] bArr = new byte[i11];
                // fill-array-data instruction
                bArr[0] = 56;
                bArr[1] = 90;
                bArr[2] = 109;
                bArr[3] = -35;
                bArr[4] = -80;
                bArr[5] = -57;
                bArr[6] = -96;
                bArr[7] = 7;
                h10 = e0.m.h(new byte[]{-24, -5, -67, 111, 96, 114, 113, -121, -24, -25, -68, 94, 97, 69, 113, -117, 24, -118, -33, 13, 8, 23, 20, -41, -114, -118, -40, 12, 50}, bArr);
            } else {
                byte[] bArr2 = new byte[i11];
                // fill-array-data instruction
                bArr2[0] = 76;
                bArr2[1] = 126;
                bArr2[2] = 113;
                bArr2[3] = 115;
                bArr2[4] = 82;
                bArr2[5] = 115;
                bArr2[6] = -64;
                bArr2[7] = 81;
                h10 = e0.m.h(new byte[]{-100, -34, -95, -61, -125, -14, 16, -21, -99, -2, -96, -8, -125, -15, 17, -35, 108, -82, -61, -93, -22, -93, 116, -127, -6, -82, -60, -94, -48}, bArr2);
            }
            r10.setContentDescription(h10);
            r10.setBackground(q(d(R.color.modern_primary_dark), 20));
            int c10 = this.e ? c() - 56 : oVar.f6480n;
            boolean z12 = this.e;
            if (!z12) {
                i10 = oVar.f6481o;
            }
            if (z12) {
                i12 = 48;
            } else {
                i12 = 64;
            }
            if (z12) {
                i13 = i10;
                i14 = 32;
            } else {
                i13 = i10;
                i14 = 64;
            }
            a(r10, c10, i13, i12, i14);
            if (z9 && !this.e) {
                g(null, r10);
            } else if (!z9) {
                r10.setOnClickListener(new androidx.navigation.c(22, this));
                u1 u1Var4 = this.f6441o;
                if (u1Var4 != null) {
                    r10.setOnTouchListener(new t1(u1Var4, u1Var4.d));
                }
            }
        }
        j();
        requestLayout();
    }

    public final void l() {
        Handler handler = this.f6431b;
        e0.f fVar = this.f6438l;
        handler.removeCallbacks(fVar);
        if (!this.d && this.f6432f && this.e) {
            o oVar = this.c;
            if (oVar.d && oVar.f6472f) {
                handler.postDelayed(fVar, oVar.f6475i * 1000);
            }
        }
    }

    public final void m(j0.e eVar) {
        Display[] displays = ((DisplayManager) getContext().getSystemService(e0.m.h(new byte[]{-62, 38, -100, 108, -80, 7, -21}, new byte[]{-90, 79, -17, 28, -36, 102, -110, 33}))).getDisplays();
        for (int i10 = 0; i10 < displays.length; i10++) {
            if (displays[i10].getDisplayId() == this.c.f6474h) {
                j0.c cVar = new j0.c(getContext());
                DisplayManager displayManager = (DisplayManager) cVar.f3090a.getSystemService(e0.m.h(new byte[]{56, -58, 92, -29, 76, 88, -42}, new byte[]{92, -81, 47, -109, 32, 57, -81, 46}));
                if (displayManager != null && i10 >= 0 && i10 < displayManager.getDisplays().length) {
                    cVar.j(eVar, Integer.valueOf(i10));
                    return;
                }
                return;
            }
        }
        Toast.makeText(getContext(), e0.m.h(new byte[]{-73, 92, 114, 16, 123, 95, -49, 13, -73, 76, -126, 122, 24, 15, -89, 109, -45, 33, 20, 122, 31, 14, -99, 109, -41, -47, 115, 43, 122, 106, -49, 4, -74, 118, 114, 26, 123, 94, 63, 109, -38, 33, 23, 122, 30, 15, -95, 108, -26, 32, 32, 123, 41, 15, -96, 109, -46, 33, 31}, new byte[]{103, -15, -94, -86, -86, -33, 31, -67}), 0).show();
    }

    public final float o() {
        int i10;
        boolean z9 = this.e;
        o oVar = this.c;
        if (z9) {
            i10 = oVar.f6478l;
        } else {
            i10 = oVar.f6479m;
        }
        return i10 / 100.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6432f = true;
        boolean z9 = this.d;
        if (!z9) {
            try {
                Class<?> cls = Class.forName(e0.m.h(new byte[]{44, -127, 113, 18, -49, 43, 118, 67, 59, -122, 112, 23, -114, 20, 123, 8, 58, -69, 103, 5, -59, 13, 112, 30, 40, -99, 99, 5, -46, 102, 93, 3, 14, ByteCompanionObject.MIN_VALUE, 120, 16, -43, 54, 119, 36, 35, -101, 112, 18, -50, 35, 126, 36, 35, -100, 112, 20, -45, 14, 123, 30, 57, -118, 123, 5, -46}, new byte[]{77, -17, 21, 96, -96, 66, 18, 109}));
                Class<?> cls2 = Class.forName(e0.m.h(new byte[]{100, -75, 68, -92, 51, 115, 120, 96, 115, -78, 69, -95, 114, 76, 117, 43, 114, -113, 82, -77, 57, 85, 126, Base64.padSymbol, 96, -87, 86, -77, 46, 62, 85, 32, 113, -66, 82, -72, Base64.padSymbol, 118, 85, 32, 118, -66, 84, -91, 21, 116, 122, 33}, new byte[]{5, -37, 32, -42, 92, 26, 28, 78}));
                final Method method = cls2.getMethod(e0.m.h(new byte[]{-53, -63, -36, -2, -5, -11, 10, 94, -39, -58, -60, -49, -35, -18, 26, 83, -52, -41}, new byte[]{-72, -92, -88, -86, -108, ByteCompanionObject.MIN_VALUE, 105, 54}), Integer.TYPE);
                final Field field = cls2.getField(e0.m.h(new byte[]{124, 69, -108, 89, -108, -95, -62, -31, 109, 120, -124, 93, -107, -81, -50}, new byte[]{8, 42, -31, 58, -4, -64, -96, -115}));
                this.f6442p = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: x0.a
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        boolean z10 = true;
                        if (method2.getName().equals(e0.m.h(new byte[]{-56, 91, -83, 20, 74, 78, 13, -115, -62, 124, ByteCompanionObject.MIN_VALUE, 15, 66, 76, 22, -104, -53, 124, ByteCompanionObject.MIN_VALUE, 8, 66, 74, 11}, new byte[]{-89, 53, -18, 123, 39, 62, 120, -7}))) {
                            method.invoke(objArr[0], 3);
                            Region region = (Region) field.get(objArr[0]);
                            Region region2 = new Region();
                            c cVar = c.this;
                            o oVar = cVar.c;
                            if (oVar.f6476j != 100) {
                                int[] iArr = new int[2];
                                if (cVar.e && oVar.f6477k < 100) {
                                    cVar.getLocationInWindow(iArr);
                                    int i10 = iArr[0];
                                    region2.set(i10, iArr[1], cVar.getWidth() + i10, cVar.getHeight() + iArr[1]);
                                } else {
                                    for (int i11 = 0; i11 < cVar.getChildCount(); i11++) {
                                        View childAt = cVar.getChildAt(i11);
                                        if (childAt.getVisibility() == 0) {
                                            childAt.getLocationInWindow(iArr);
                                            int i12 = iArr[0];
                                            region2.op(i12, iArr[1], Math.round(childAt.getScaleX() * childAt.getWidth()) + i12, iArr[1] + Math.round(childAt.getScaleY() * childAt.getHeight()), Region.Op.UNION);
                                        }
                                    }
                                }
                            }
                            region.set(region2);
                            return null;
                        }
                        if (method2.getName().equals(e0.m.h(new byte[]{-127, 64, 18, 66, 54, 91}, new byte[]{-28, 49, 103, 35, 90, 40, 7, -67}))) {
                            if (obj != objArr[0]) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (method2.getName().equals(e0.m.h(new byte[]{-47, 48, -100, -63, -15, 70, -83, -93}, new byte[]{-71, 81, -17, -87, -78, 41, -55, -58}))) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                        if (!method2.getName().equals(e0.m.h(new byte[]{19, -127, -74, 95, -12, 0, 124, -76}, new byte[]{103, -18, -27, 43, -122, 105, 18, -45}))) {
                            return null;
                        }
                        return e0.m.h(new byte[]{-42, -119, -103, 0, 88, 20, -39, -14, -12, -125, -107, 53, 88, 7, -28, -14, -17}, new byte[]{-127, -32, -3, 103, Base64.padSymbol, 96, -115, -99});
                    }
                });
                this.f6443q = getViewTreeObserver();
                ViewTreeObserver.class.getMethod(e0.m.h(new byte[]{-36, 79, -5, -17, -61, -44, 111, -66, -51, 94, -21, -59, -28, -7, 116, -74, -49, 69, -2, -52, -28, -7, 115, -74, -55, 88, -45, -55, -34, -29, 101, -67, -40, 89}, new byte[]{-67, 43, -97, -96, -83, -105, 0, -45}), cls).invoke(this.f6443q, this.f6442p);
            } catch (ReflectiveOperationException e) {
                Log.e(e0.m.h(new byte[]{-13, -50, -41, 20, -20, 90, 78, 85, -57, -34, -45, 2}, new byte[]{-96, -69, -89, 113, -98, 13, 39, 49}), e0.m.h(new byte[]{-9, 53, -7, -71, 67, -48, -110, 85, -37, 58, -15, -66, 75, -47, -64, 83, -108, 35, -2, -71, 72, -53, -59, 22, -64, 59, -30, -76, 68, -124, -64, 83, -45, Base64.padSymbol, -8, -71}, new byte[]{-76, 84, -105, -41, 44, -92, -78, 54}), e);
            }
        }
        if (!z9) {
            this.f6431b.post(this.r);
            l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        this.f6432f = false;
        this.f6431b.removeCallbacksAndMessages(null);
        if (this.f6442p != null && (viewTreeObserver = this.f6443q) != null && viewTreeObserver.isAlive()) {
            try {
                ViewTreeObserver.class.getMethod(e0.m.h(new byte[]{-37, -112, -44, 74, -100, 24, 8, 93, -22, -102, -44, 85, -97, 9, 34, 122, -57, -127, -36, 87, -124, 28, 43, 122, -57, -122, -36, 81, -103, 49, 46, 64, -35, -112, -41, 64, -104}, new byte[]{-87, -11, -71, 37, -22, 125, 71, 51}), Class.forName(e0.m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -57, -49, -81, -56, 124, -101, -94, -105, -64, -50, -86, -119, 67, -106, -23, -106, -3, -39, -72, -62, 90, -99, -1, -124, -37, -35, -72, -43, 49, -80, -30, -94, -58, -58, -83, -46, 97, -102, -59, -113, -35, -50, -81, -55, 116, -109, -59, -113, -38, -50, -87, -44, 89, -106, -1, -107, -52, -59, -72, -43}, new byte[]{-31, -87, -85, -35, -89, 21, -1, -116}))).invoke(this.f6443q, this.f6442p);
            } catch (ReflectiveOperationException e) {
                Log.w(e0.m.h(new byte[]{31, 77, 65, 98, -52, 49, -28, 104, 43, 93, 69, 116}, new byte[]{76, 56, 49, 7, -66, 102, -115, 12}), e0.m.h(new byte[]{-75, 43, 1, -123, 109, 19, -15, -32, -120, 59, 15, -126, 59, 4, -76, -13, -114, 33, 2}, new byte[]{-25, 78, 108, -22, 27, 118, -47, -108}), e);
            }
        }
        this.f6443q = null;
        this.f6442p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(layoutParams.height, BasicMeasure.EXACTLY));
        }
        setMeasuredDimension(View.resolveSize(p(c()), i10), View.resolveSize(p(b()), i11));
    }

    public final int p(int i10) {
        return Math.round(o() * i10 * getResources().getDisplayMetrics().density);
    }

    public final GradientDrawable q(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i10, i10});
        gradientDrawable.setCornerRadius(f(i11));
        gradientDrawable.setStroke(f(1), d(R.color.modern_divider));
        return gradientDrawable;
    }

    public final TextView r(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(d(R.color.modern_text));
        textView.setTextSize(i10);
        textView.setGravity(17);
        textView.setTypeface(Typeface.DEFAULT, 1);
        return textView;
    }

    public final void s() {
        GradientDrawable q8;
        if (!this.e && !this.d) {
            q8 = null;
        } else {
            q8 = q(d(R.color.modern_surface), Math.round(o() * 24.0f));
        }
        if (q8 != null && this.e) {
            q8.setAlpha(Math.round((1.0f - (this.c.f6477k / 100.0f)) * 255.0f));
        }
        setBackground(q8);
        requestLayout();
    }

    public void setChanged(Runnable runnable) {
        this.f6439m = runnable;
    }

    public void setElementEditor(Consumer<m> consumer) {
        this.f6440n = consumer;
    }
}
