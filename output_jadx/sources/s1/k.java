package s1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import com.example.navistart.home.WebLauncherActivity;
import com.woha.appmanag.FilePickerActivity;
import e0.r1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.k2;
import m0.s2;
import m0.w1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends FrameLayout {
    public static final String r = e0.m.h(new byte[]{-90, 113, 3, -75, 69, 73, ByteCompanionObject.MIN_VALUE, -58, -123, 114, 59, -99, 99, 98, -121, -60, -108, 70, 34, -103, ByteCompanionObject.MAX_VALUE, 98, -98, -27, -108, 87, 42, -70, 126, 100, -92, -64, -112, 83, 14, -116, 97}, new byte[]{-11, 33, 79, -4, 17, 22, -63, -74});

    /* renamed from: s, reason: collision with root package name */
    public static final String f5517s = e0.m.h(new byte[]{-108, 43, 49, 18, 39, 79, -60, -40, -89, 46, 43, 31, 47, 120, -64, -55, -116, 35, 43, 18, 27}, new byte[]{-8, 74, 68, 124, 68, 39, -95, -86});

    /* renamed from: b, reason: collision with root package name */
    public final r f5518b;
    public final LinearLayout c;
    public final HorizontalScrollView d;
    public final ScrollView e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f5519f;

    /* renamed from: g, reason: collision with root package name */
    public final f f5520g;

    /* renamed from: h, reason: collision with root package name */
    public Insets f5521h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5522i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5523j;

    /* renamed from: k, reason: collision with root package name */
    public int f5524k;

    /* renamed from: l, reason: collision with root package name */
    public o f5525l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f5526m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f5527n;

    /* renamed from: o, reason: collision with root package name */
    public r1 f5528o;

    /* renamed from: p, reason: collision with root package name */
    public v0 f5529p;

    /* renamed from: q, reason: collision with root package name */
    public v0 f5530q;

    public k(WebLauncherActivity webLauncherActivity) {
        super(webLauncherActivity);
        boolean z9;
        final int i10 = 1;
        this.f5520g = new f(this, 1);
        this.f5521h = Insets.NONE;
        r rVar = new r(webLauncherActivity);
        this.f5518b = rVar;
        rVar.a(webLauncherActivity);
        final int i11 = 0;
        setClipChildren(false);
        LinearLayout linearLayout = new LinearLayout(webLauncherActivity);
        this.c = linearLayout;
        linearLayout.setGravity(17);
        linearLayout.setPadding(h(9), h(9), h(9), h(9));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-401203929);
        gradientDrawable.setCornerRadius(h(27));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setElevation(h(21));
        linearLayout.setOnClickListener(new c(this, 0));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(webLauncherActivity);
        this.d = horizontalScrollView;
        horizontalScrollView.setFillViewport(false);
        horizontalScrollView.setHorizontalScrollBarEnabled(true);
        horizontalScrollView.setVerticalScrollBarEnabled(false);
        horizontalScrollView.setOverScrollMode(1);
        horizontalScrollView.setOnTouchListener(new d(this, 0));
        horizontalScrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: s1.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f5483b;

            {
                this.f5483b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                k kVar;
                v0 v0Var;
                k kVar2;
                v0 v0Var2;
                switch (i11) {
                    case 0:
                        if ((i14 - i12 != i18 - i16 || i15 - i13 != i19 - i17) && (v0Var = (kVar = this.f5483b).f5529p) != null) {
                            kVar.removeCallbacks(v0Var);
                            kVar.post(v0Var);
                            return;
                        }
                        return;
                    default:
                        if ((i14 - i12 != i18 - i16 || i15 - i13 != i19 - i17) && (v0Var2 = (kVar2 = this.f5483b).f5529p) != null) {
                            kVar2.removeCallbacks(v0Var2);
                            kVar2.post(v0Var2);
                            return;
                        }
                        return;
                }
            }
        });
        addView(horizontalScrollView);
        ScrollView scrollView = new ScrollView(webLauncherActivity);
        this.e = scrollView;
        scrollView.setFillViewport(false);
        scrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setVerticalScrollBarEnabled(true);
        scrollView.setOverScrollMode(1);
        scrollView.setOnTouchListener(new d(this, 1));
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: s1.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f5483b;

            {
                this.f5483b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                k kVar;
                v0 v0Var;
                k kVar2;
                v0 v0Var2;
                switch (i10) {
                    case 0:
                        if ((i14 - i12 != i18 - i16 || i15 - i13 != i19 - i17) && (v0Var = (kVar = this.f5483b).f5529p) != null) {
                            kVar.removeCallbacks(v0Var);
                            kVar.post(v0Var);
                            return;
                        }
                        return;
                    default:
                        if ((i14 - i12 != i18 - i16 || i15 - i13 != i19 - i17) && (v0Var2 = (kVar2 = this.f5483b).f5529p) != null) {
                            kVar2.removeCallbacks(v0Var2);
                            kVar2.post(v0Var2);
                            return;
                        }
                        return;
                }
            }
        });
        addView(scrollView);
        o k6 = k();
        if (k6 != o.d && k6 != o.e) {
            z9 = false;
        } else {
            z9 = true;
        }
        e(z9);
        Button button = new Button(webLauncherActivity);
        this.f5519f = button;
        button.setAllCaps(false);
        button.setTextColor(-1);
        button.setTextSize(30.0f);
        button.setMinWidth(0);
        button.setMinHeight(0);
        button.setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-651807676);
        gradientDrawable2.setCornerRadius(h(18));
        button.setBackground(gradientDrawable2);
        button.setContentDescription(e0.m.h(new byte[]{110, -99, 78, -79, 19, -3, 32, 60, 110, -75, 78, -65, 18, -59, 33, 0, -98, -46, 33, -33, 115, -105, 77, 92, 11, -46, 37, -34, 79, 103, 32, 55, 110, -78, 79, -116, 19, -6, 33, 11, 110, -73, 79, -113, 19, -9}, new byte[]{-66, 2, -98, 15, -61, 71, -16, -116}));
        button.setOnClickListener(new c(this, 1));
        addView(button);
        n();
        post(new f(this, 0));
    }

    public static int i(j0.e eVar, ArrayList arrayList) {
        String g10 = j0.f.g(eVar);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (Objects.equals(g10, j0.f.g((j0.e) arrayList.get(i10)))) {
                return i10;
            }
        }
        return 0;
    }

    public static LinearLayout.LayoutParams v() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public final void A(MotionEvent motionEvent) {
        boolean z9;
        int h2;
        int max;
        float rawY;
        int i10;
        getLocationOnScreen(new int[2]);
        o oVar = this.f5525l;
        if (oVar != o.d && oVar != o.e) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            h2 = h(144);
            int width = getWidth();
            Insets insets = this.f5521h;
            max = Math.max(1, ((width - insets.left) - insets.right) - h2);
            rawY = motionEvent.getRawX() - r0[0];
            i10 = this.f5521h.left;
        } else {
            h2 = h(144);
            int height = getHeight();
            Insets insets2 = this.f5521h;
            max = Math.max(1, ((height - insets2.top) - insets2.bottom) - h2);
            rawY = motionEvent.getRawY() - r0[1];
            i10 = this.f5521h.top;
        }
        this.f5524k = Math.max(0, Math.min(100, Math.round((((rawY - i10) - (h2 / 2.0f)) * 100.0f) / max)));
        TextView textView = this.f5527n;
        if (textView != null) {
            textView.setText(e0.m.h(new byte[]{-59, 14, -115, 29, -30, 108, -61, 33, -60, 23, -115, 27, -29, 84, 41, -71}, new byte[]{21, -111, 93, -93, 50, -37, 19, -103}) + this.f5524k + e0.m.h(new byte[]{95}, new byte[]{122, 44, 56, 65, -107, -72, 88, 65}));
        }
        Button button = this.f5519f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button.getLayoutParams();
        Insets insets3 = this.f5521h;
        if (z9) {
            button.setTranslationX((Math.round((max * this.f5524k) / 100.0f) + insets3.left) - layoutParams.leftMargin);
        } else {
            button.setTranslationY((Math.round((max * this.f5524k) / 100.0f) + insets3.top) - layoutParams.topMargin);
        }
    }

    public final void B() {
        boolean z9;
        int i10;
        o k6 = k();
        int i11 = 0;
        if (k6 != o.d && k6 != o.e) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f5522i && z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.d.setVisibility(i10);
        if (!this.f5522i || z9) {
            i11 = 8;
        }
        this.e.setVisibility(i11);
    }

    public final void a(RadioGroup radioGroup, String str, o oVar) {
        boolean z9;
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        radioButton.setTextColor(-2563349);
        radioButton.setTextSize(13.0f);
        radioButton.setTag(oVar);
        if (this.f5518b.b() == oVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        radioButton.setChecked(z9);
        radioGroup.addView(radioButton, new RadioGroup.LayoutParams(0, -2, 1.0f));
    }

    public final void b(RadioGroup radioGroup, String str, p pVar) {
        boolean z9;
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        radioButton.setTextColor(-2563349);
        radioButton.setTextSize(14.0f);
        radioButton.setTag(pVar);
        if (this.f5518b.d() == pVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        radioButton.setChecked(z9);
        radioGroup.addView(radioButton, new RadioGroup.LayoutParams(0, -2, 1.0f));
    }

    public final void c(RadioGroup radioGroup, String str, q qVar) {
        boolean z9;
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        radioButton.setTextColor(-2563349);
        radioButton.setTextSize(14.0f);
        radioButton.setTag(qVar);
        if (this.f5518b.e() == qVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        radioButton.setChecked(z9);
        radioGroup.addView(radioButton, new RadioGroup.LayoutParams(0, -2, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        boolean z9;
        int c;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        String h2;
        View view;
        int i11;
        String h10;
        o k6 = k();
        o oVar = o.d;
        if (k6 != oVar && k6 != o.e) {
            z9 = 0;
        } else {
            z9 = 1;
        }
        e(z9);
        this.c.setOrientation(!z9);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (this.f5523j) {
            c = this.f5524k;
        } else {
            c = this.f5518b.c();
        }
        int max = Math.max(getWidth(), getResources().getDisplayMetrics().widthPixels);
        int max2 = Math.max(getHeight(), getResources().getDisplayMetrics().heightPixels);
        Button button = this.f5519f;
        int i12 = 48;
        if (z9 != 0) {
            if (k6 == oVar) {
                i11 = 48;
            } else {
                i11 = 80;
            }
            layoutParams2.gravity = i11 | 1;
            int h11 = h(144);
            layoutParams = new FrameLayout.LayoutParams(h11, h(36));
            if (k6 != oVar) {
                i12 = 80;
            }
            layoutParams.gravity = i12 | 3;
            Insets insets = this.f5521h;
            int max3 = Math.max(0, ((max - insets.left) - insets.right) - h11);
            layoutParams.leftMargin = Math.round((max3 * c) / 100.0f) + this.f5521h.left;
            Insets insets2 = this.f5521h;
            if (k6 == oVar) {
                layoutParams.topMargin = insets2.top;
            } else {
                layoutParams.bottomMargin = insets2.bottom;
            }
            if (k6 == oVar) {
                h10 = e0.m.h(new byte[]{13, 21, -85}, new byte[]{-17, -103, 47, 111, 58, 114, 116, 103});
            } else {
                h10 = e0.m.h(new byte[]{62, 98, -67}, new byte[]{-36, -18, 62, -58, -92, 42, -53, 46});
            }
            button.setText(h10);
        } else {
            o oVar2 = o.f5575b;
            int i13 = 5;
            if (k6 == oVar2) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            layoutParams2.gravity = i10 | 16;
            int h12 = h(144);
            layoutParams = new FrameLayout.LayoutParams(h(36), h12);
            if (k6 == oVar2) {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 48;
            Insets insets3 = this.f5521h;
            int max4 = Math.max(0, ((max2 - insets3.top) - insets3.bottom) - h12);
            layoutParams.topMargin = Math.round((max4 * c) / 100.0f) + this.f5521h.top;
            Insets insets4 = this.f5521h;
            if (k6 == oVar2) {
                layoutParams.leftMargin = insets4.left;
            } else {
                layoutParams.rightMargin = insets4.right;
            }
            if (k6 == oVar2) {
                h2 = e0.m.h(new byte[]{40, -110, -13}, new byte[]{-54, 18, 73, 45, -102, -80, -74, 59});
            } else {
                h2 = e0.m.h(new byte[]{0, -99, 75}, new byte[]{-30, 29, -14, 114, 107, -98, 118, -42});
            }
            button.setText(h2);
        }
        Insets insets5 = this.f5521h;
        layoutParams2.leftMargin = insets5.left;
        layoutParams2.topMargin = insets5.top;
        layoutParams2.rightMargin = insets5.right;
        layoutParams2.bottomMargin = insets5.bottom;
        if (z9 != 0) {
            layoutParams2.width = -1;
        } else {
            layoutParams2.height = -1;
        }
        if (z9 != 0) {
            view = this.d;
        } else {
            view = this.e;
        }
        view.setLayoutParams(layoutParams2);
        button.setLayoutParams(layoutParams);
        Runnable runnable = this.f5529p;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    public final void e(boolean z9) {
        ViewGroup viewGroup;
        if (z9) {
            viewGroup = this.d;
        } else {
            viewGroup = this.e;
        }
        LinearLayout linearLayout = this.c;
        if (linearLayout.getParent() != viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) linearLayout.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(linearLayout);
            }
            viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        }
        B();
    }

    public final LinearLayout f() {
        int i10;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        r rVar = this.f5518b;
        if (rVar.b() != o.d && rVar.b() != o.e) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        linearLayout.setOrientation(i10 ^ 1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public final LinearLayout.LayoutParams g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h(78), h(78));
        layoutParams.setMargins(h(3), h(3), h(3), h(3));
        return layoutParams;
    }

    public final int h(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final void j(boolean z9) {
        if (this.f5523j) {
            r rVar = this.f5518b;
            if (z9) {
                rVar.f5608a.edit().putString(r.c, this.f5525l.name()).apply();
                rVar.f5608a.edit().putInt(r.d, Math.max(0, Math.min(100, this.f5524k))).apply();
            }
            this.f5523j = false;
            this.f5525l = null;
            Button button = this.f5519f;
            button.setOnTouchListener(null);
            button.setTranslationX(0.0f);
            button.setTranslationY(0.0f);
            button.setContentDescription(e0.m.h(new byte[]{-45, -82, 43, -33, 21, -7, -77, -84, -45, -122, 43, -47, 20, -63, -78, -112, 35, -31, 68, -79, 117, -109, -34, -52, -74, -31, 64, -80, 73, 99, -77, -89, -45, -127, 42, -30, 21, -2, -78, -101, -45, -124, 42, -31, 21, -13}, new byte[]{3, 49, -5, 97, -59, 67, 99, 28}));
            LinearLayout linearLayout = this.f5526m;
            if (linearLayout != null) {
                removeView(linearLayout);
            }
            this.f5526m = null;
            this.f5527n = null;
            d();
            if (rVar.f()) {
                l();
            } else {
                y();
            }
            r1 r1Var = this.f5528o;
            this.f5528o = null;
            if (r1Var != null) {
                k kVar = (k) r1Var.f2018b;
                RadioGroup radioGroup = (RadioGroup) r1Var.c;
                TextView textView = (TextView) r1Var.d;
                AlertDialog alertDialog = (AlertDialog) r1Var.e;
                r rVar2 = kVar.f5518b;
                if (!z9) {
                    o b10 = rVar2.b();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= radioGroup.getChildCount()) {
                            break;
                        }
                        View childAt = radioGroup.getChildAt(i10);
                        if ((childAt instanceof RadioButton) && b10 == childAt.getTag()) {
                            ((RadioButton) childAt).setChecked(true);
                            break;
                        }
                        i10++;
                    }
                }
                textView.setText(e0.m.h(new byte[]{29, -77, 74, -31, -15, 6, -94, -66, 29, -102, 74, -22, -15, 0, -94, -72, 29, -103, -70, -113, -101, 109, -49, -48, 115, -4, 37, -113, -101, 109, -54, 32, 29, -98, 74, -21, -15, 3, -94, -69, 28, -96, -70, -113, -101, 108, -14, -48, 125, -3, 21, 101, 1}, new byte[]{-51, 44, -102, 95, 33, -67, 114, 0}) + rVar2.c() + e0.m.h(new byte[]{87}, new byte[]{114, -10, -56, -77, -118, 0, 114, -62}));
                if (!alertDialog.isShowing()) {
                    alertDialog.show();
                }
            }
        }
    }

    public final o k() {
        o oVar;
        if (this.f5523j && (oVar = this.f5525l) != null) {
            return oVar;
        }
        return this.f5518b.b();
    }

    public final void l() {
        removeCallbacks(this.f5520g);
        boolean f8 = this.f5518b.f();
        Button button = this.f5519f;
        if (!f8) {
            this.f5522i = true;
            B();
            button.setVisibility(8);
        } else {
            this.f5522i = false;
            B();
            button.setVisibility(0);
        }
    }

    public final ImageButton m(String str, Drawable drawable) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setPadding(h(14), h(14), h(14), h(14));
        imageButton.setBackgroundColor(0);
        if (str == null) {
            str = e0.m.h(new byte[]{-40, 62, 120, -85, 92, 18, 46, 92, -39, 40, 120, -84, 92, 19, 47, 104}, new byte[]{8, -86, -88, 30, -116, -85, -1, -35});
        }
        imageButton.setContentDescription(str);
        return imageButton;
    }

    public final void n() {
        ResolveInfo resolveActivity;
        int i10;
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        final int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            final j0.e e = j0.f.e(getContext(), f5517s + i12);
            if (j0.f.d(e)) {
                ImageButton m10 = m(e.f3099i, e.f3100j);
                m10.setOnClickListener(new View.OnClickListener(this) { // from class: s1.g
                    public final /* synthetic */ k c;

                    {
                        this.c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.c.p(e);
                                return;
                            case 1:
                                this.c.p(e);
                                return;
                            default:
                                this.c.p(e);
                                return;
                        }
                    }
                });
                linearLayout.addView(m10, g());
            }
        }
        r rVar = this.f5518b;
        final int i13 = 2;
        if (rVar.f5608a.getBoolean(r.f5603g, false)) {
            LinearLayout f8 = f();
            String loadString = h0.b.o().loadString(r, "");
            if (!loadString.isEmpty()) {
                i10 = 0;
                for (String str : loadString.split(e0.m.h(new byte[]{10}, new byte[]{49, -5, -21, -115, 50, -20, 87, -25}))) {
                    final j0.e c = j0.f.c(getContext(), str);
                    if (c.f3094a == j0.d.d && j0.f.d(c)) {
                        ImageButton m11 = m(c.f3099i, c.f3100j);
                        m11.setOnClickListener(new View.OnClickListener(this) { // from class: s1.g
                            public final /* synthetic */ k c;

                            {
                                this.c = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i13) {
                                    case 0:
                                        this.c.p(c);
                                        return;
                                    case 1:
                                        this.c.p(c);
                                        return;
                                    default:
                                        this.c.p(c);
                                        return;
                                }
                            }
                        });
                        f8.addView(m11, g());
                        i10++;
                        if (i10 >= 6) {
                            break;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                ImageButton m12 = m(e0.m.h(new byte[]{-114, -11, 44, 96, 84, -8, -120, -23, -29, -72, 73, 5, 49, -86, 24, -23, -20, -72, 65, 5, Base64.padSymbol, -85, 45, 25, -113, -24, 44, 101, 85, -51, 120, -115, -114, -35, 44, 110, 85, -49, 120, -124, -114, -48, 44, 108}, new byte[]{94, 104, -4, -43, -123, 122, -88, 57}), getContext().getDrawable(R.drawable.split_ico));
                m12.setEnabled(false);
                m12.setAlpha(0.35f);
                f8.addView(m12, g());
            }
            linearLayout.addView(f8);
        }
        if (rVar.f5608a.getBoolean(r.f5602f, false)) {
            LinearLayout f10 = f();
            ArrayList x9 = m0.o.x();
            PackageManager packageManager = getContext().getPackageManager();
            int i14 = 0;
            for (int i15 = 0; i15 < x9.size() && i14 < 6; i15++) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) x9.get(i15));
                if (launchIntentForPackage != null && (resolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0)) != null) {
                    final j0.e b10 = j0.e.b(resolveActivity, packageManager);
                    ImageButton m13 = m(b10.f3099i, b10.f3100j);
                    final int i16 = 1;
                    m13.setOnClickListener(new View.OnClickListener(this) { // from class: s1.g
                        public final /* synthetic */ k c;

                        {
                            this.c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    this.c.p(b10);
                                    return;
                                case 1:
                                    this.c.p(b10);
                                    return;
                                default:
                                    this.c.p(b10);
                                    return;
                            }
                        }
                    });
                    f10.addView(m13, g());
                    i14++;
                }
            }
            if (i14 == 0) {
                ImageButton m14 = m(e0.m.h(new byte[]{112, 22, -114, -114, 55, -104, 49, -97, 113, 0, -113, -68, 55, -97, 49, -98, 112, 52, 126, -18, 88, -10, 96, -52, 24, 81, -27, -18, 89, -9, 86, -52, 21, 81, -29, -18, 95, -10, 111, 60, 112, 57, -114, -119, -57, -9, 92, -52, 21, 81, -29, -17, 105, 7, 48, -85, 112, 49, -114, -127, 54, -92, 49, -99, 112, 59, -114, -114}, new byte[]{-96, -127, 94, 62, -25, 39, -32, 28}), getContext().getDrawable(R.drawable.ic_recent_apps));
                m14.setEnabled(false);
                m14.setAlpha(0.35f);
                f10.addView(m14, g());
            }
            linearLayout.addView(f10);
        }
        ImageButton m15 = m(e0.m.h(new byte[]{-51, ByteCompanionObject.MIN_VALUE, 18, -116, -37, 90, 125, 113, -52, -99, 18, -126, -38, 98, 124, 73, -51, -91, -30, -20, -79, 11, 28, 34, -98, -51, ByteCompanionObject.MAX_VALUE, -19, -115, 11, 25, 34, -99, -51, 114}, new byte[]{29, 29, -62, 60, 10, -37, -84, -13}), getContext().getDrawable(android.R.drawable.ic_menu_preferences));
        m15.setOnClickListener(new c(this, 2));
        linearLayout.addView(m15, g());
        d();
    }

    public final GradientDrawable o(int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(h(i11));
        gradientDrawable.setStroke(h(1), i12);
        return gradientDrawable;
    }

    public final void p(j0.e eVar) {
        try {
            if (!q(eVar)) {
                h0.b.a();
                h0.b.f().j(eVar, null);
            }
            if (this.f5518b.f()) {
                l();
            }
        } catch (RuntimeException unused) {
            y5.k.x(getContext(), e0.m.h(new byte[]{15, 14, 3, -26, -84, -66, -107, -69, 14, 24, 3, -31, -84, -65, -108, -113, -1, 75, 82, -125, -55, -41, -3, -21, 88, 74, 99, -126, -3, 39, -108, -121, 15, 47, 3, -25, -84, -71, -107, -69, 14, 24, 2, -48, -84, -72, -108, -121, 15, 36}, new byte[]{-33, -102, -45, 83, 124, 7, 68, 58}));
            r();
        }
    }

    public final boolean q(j0.e eVar) {
        if (eVar.f3094a == j0.d.f3092b && eVar.f3095b != null) {
            Context context = getContext();
            if (context instanceof WebLauncherActivity) {
                WebLauncherActivity webLauncherActivity = (WebLauncherActivity) context;
                h0.b.a();
                int guDisplayID = h0.b.n().getGuDisplayID();
                Bundle bundle = new Bundle();
                bundle.putInt(e0.m.h(new byte[]{-87, -104, -81}, new byte[]{-51, -15, -36, -18, -118, -40, 18, 26}), guDisplayID);
                n0.d dVar = eVar.f3095b;
                if (dVar == n0.d.f4087l) {
                    webLauncherActivity.G(m0.o.class, bundle);
                    return true;
                }
                if (dVar == n0.d.f4080h0) {
                    webLauncherActivity.G(k2.class, bundle);
                    return true;
                }
                if (dVar == n0.d.A0) {
                    bundle.putBoolean(e0.m.h(new byte[]{90, -112, ByteCompanionObject.MIN_VALUE, 42, -48, 104, 108, -51, 103, -110, -120, 52, -34, 111, 93, -63, 81, -107, -126, 54}, new byte[]{56, -15, -25, 88, -79, 29, 2, -87}), true);
                    webLauncherActivity.G(w1.class, bundle);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        f fVar = this.f5520g;
        removeCallbacks(fVar);
        if (this.f5518b.f() && this.f5522i) {
            postDelayed(fVar, 5000L);
        }
    }

    public final TextView s(String str) {
        TextView x9 = x(12, -11486750, str);
        x9.setLetterSpacing(0.08f);
        x9.setPadding(0, 0, 0, h(8));
        return x9;
    }

    public final Button t(String str, boolean z9) {
        int i10;
        int i11;
        Button button = new Button(getContext());
        button.setText(str);
        button.setTextSize(16.0f);
        button.setTextColor(-1);
        button.setAllCaps(false);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        if (z9) {
            i10 = -14381640;
        } else {
            i10 = -14668744;
        }
        if (z9) {
            i11 = -11158301;
        } else {
            i11 = -13351337;
        }
        button.setBackground(o(i10, 15, i11));
        return button;
    }

    public final LinearLayout u() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(h(16), h(14), h(16), h(14));
        linearLayout.setBackground(o(-15195860, 17, -14010040));
        return linearLayout;
    }

    public final SwitchCompat w(String str) {
        SwitchCompat switchCompat = new SwitchCompat(getContext());
        switchCompat.setText(str);
        switchCompat.setTextColor(-1511692);
        switchCompat.setTextSize(15.0f);
        switchCompat.setGravity(16);
        switchCompat.setPadding(0, h(2), 0, h(2));
        return switchCompat;
    }

    public final TextView x(int i10, int i11, String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(i10);
        textView.setTextColor(i11);
        return textView;
    }

    public final void y() {
        this.f5522i = true;
        B();
        this.f5519f.setVisibility(8);
        r();
    }

    public final void z() {
        removeCallbacks(this.f5520g);
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(h(24), h(22), h(24), h(24));
        linearLayout.setBackgroundColor(-16051943);
        TextView x9 = x(12, -11486750, e0.m.h(new byte[]{-57, 44, 0, 12, 87, 120, -13, 80, -57, 17, 0, 2, 87, 64, -13, 104, -57, 33, -16, -42, -60, -115, 3, -70, 88, -4, -107}, new byte[]{23, -79, -48, -100, -121, -39, 35, -14}));
        x9.setLetterSpacing(0.09f);
        linearLayout.addView(x9);
        TextView x10 = x(27, -1, e0.m.h(new byte[]{117, -63, 98, 116, -77, 40, 89, -71, 117, -27, 99, 72, 67, 69, 50, -36, 21, -113, 49, 20, -34, 68, 14, -36, 16, -113, 50, 20, -45}, new byte[]{-91, 94, -78, -60, 99, -107, -119, 12}));
        x10.setPadding(0, h(5), 0, h(3));
        linearLayout.addView(x10);
        TextView x11 = x(14, -6575430, e0.m.h(new byte[]{118, -96, -81, 63, 96, 60, -84, 123, 119, -67, -81, 49, 97, 4, -84, 123, 118, -120, 95, 95, 14, 109, -61, 41, 20, -19, -54, 95, 5, 109, -56, 41, 27, -19, -57, 95, 4, -111, 93, 40, 38, -19, -49, 94, 48, 109, -62, 41, 24, -19, -60, 95, 15, 109, -53, 41, 19, -19, -62, 95, 9, 109, -56, -39, 118, -123, 95, 95, 0, 108, -10, 40, 39, -20, -3, 94, 49, 108, -10, 41, 19, 29, -81, 59, 97, 8, -83, 64, 119, -68, -82, 13, 97, 15, -83, 65, 119, -78, 95, 95, 14, 109, -51, 41, 27, -19, -54, 95, 10, 109, -59, -41}, new byte[]{-90, Base64.padSymbol, ByteCompanionObject.MAX_VALUE, -113, -79, -67, 125, -7}));
        x11.setPadding(0, 0, 0, h(18));
        linearLayout.addView(x11);
        LinearLayout u8 = u();
        u8.addView(s(e0.m.h(new byte[]{-92, -59, 111, -8, -3, 75, -58, 70, -92, -50, 111, -13, -3, 68, -58, 75, -92, -49}, new byte[]{116, 90, -65, 102, 45, -39, 22, -45})));
        final SwitchCompat w = w(e0.m.h(new byte[]{-98, -53, -65, 102, -8, 21, 120, 62, -98, -25, -65, 100, -8, 21, 120, 56, -97, -36, -65, 97, -8, 22, 120, 58, -98, -29, 79, 5, -88, 71, 18, 81, -50, -118, -28, 4, -101, 71, 24, 81, -52, -118, -29, -12, -7, 40, 120, 48, -98, -26, -65, 97, -7, 44, 121, 12}, new byte[]{78, 91, 111, -44, 41, -105, -88, ByteCompanionObject.MIN_VALUE}));
        r rVar = this.f5518b;
        w.setChecked(rVar.f());
        u8.addView(w, v());
        SwitchCompat w9 = w(e0.m.h(new byte[]{-127, -45, -7, -104, -103, -51, -97, 86, ByteCompanionObject.MIN_VALUE, -62, -7, -104, -104, -15, -98, 104, -127, -13, -8, -83, -104, -9, -97, 90, -127, -13, -7, -105, -104, -9, -97, 93, 113, -109, -106, -6, -13, -97, -1, 56, -29, -109, -103, -5, -58, -98, -58, 56, -28, -109, -102, -6, -10, 111, -97, 83, -127, -3, -8, -88, -104, -11, -97, 88}, new byte[]{81, 67, 41, 42, 72, 79, 79, -24}));
        SharedPreferences sharedPreferences = rVar.f5608a;
        w9.setChecked(sharedPreferences.getBoolean(r.f5604h, true));
        u8.addView(w9, v());
        final SwitchCompat w10 = w(e0.m.h(new byte[]{-103, 81, -86, 47, 100, -110, -112, 15, -103, 121, -85, 26, 100, -102, -112, 15, -104, 76, -85, 29, -108, -8, -1, 111, -14, 30, -54, 65, 6, -8, -16, 110, -57, 31, -13, 64, 55, -7, -50, -97, -103, 113, -86, 33, 100, -107, -112, 10, -103, 117, -85, 29, -108, -8, -1, 111, -9, 30, -56, 65, 1, -7, -64, 110, -52, -18, -86, 42, 100, -104, -111, 60, -103, 115, -85, 22, 100, -99, -111, 63, -103, 126}, new byte[]{73, -50, 122, -111, -76, 40, 64, -65}));
        w10.setChecked(sharedPreferences.getBoolean(r.f5605i, true));
        u8.addView(w10, v());
        TextView x12 = x(14, -6575430, e0.m.h(new byte[]{-98, -52, 124, -3, -36, 49, 35, 80, -98, -40, -116, -109, -78, 97, 72, 60, -2, -72, 30, -109, -67, 96, 125, Base64.padSymbol, -57, -72, 25, -109, -66, 97, 77, -52, -98, -45, 124, -3, -36, 51, 35, 86, -98, -40}, new byte[]{78, 104, -84, 67, 13, -79, -13, -20}));
        x12.setPadding(0, h(10), 0, h(4));
        u8.addView(x12);
        RadioGroup radioGroup = new RadioGroup(getContext());
        radioGroup.setOrientation(0);
        c(radioGroup, e0.m.h(new byte[]{-85, 50, -59, -44, 88, 82, -36, 30, -86, 40, -59, -42, 89, 96, -36, 23, -86, 35, -59, -33}, new byte[]{123, -88, 21, 102, -120, -30, 12, -86}), q.f5581b);
        c(radioGroup, e0.m.h(new byte[]{-36, 67, -115, 112, Base64.padSymbol, -33, -51, -48, -36, 97, -115, 117, 60, -23, -51, -36}, new byte[]{12, -40, 93, -56, -19, 98, 29, 101}), q.c);
        u8.addView(radioGroup, v());
        TextView x13 = x(14, -6575430, e0.m.h(new byte[]{-47, -84, -75, -103, 3, 107, -122, -111, -47, -127, -75, -101, 3, 111, -121, -92, -47, -116, -75, -111, 3, 97, 119, -63, -70, -31, -35, -7, 110, 4, -30, -63, -72, -31, -40, -7, 109, 4, -28, -63, -65, 17, -75, -110, 3, 106, -122, -109, -47, -117, -75, -103}, new byte[]{1, 49, 101, 41, -45, -44, 87, 17}));
        x13.setPadding(0, h(8), 0, h(4));
        u8.addView(x13);
        RadioGroup radioGroup2 = new RadioGroup(getContext());
        radioGroup2.setOrientation(0);
        b(radioGroup2, e0.m.h(new byte[]{-78, 99, 71, 67, 89, -127, -22, 74, -78, 71, 71, 67, 88, -68, -21, 112, -78, 64, 71, 70, 89, -115, -22, 79, -78, 78}, new byte[]{98, -16, -105, -3, -120, 1, 58, -14}), p.f5577b);
        b(radioGroup2, e0.m.h(new byte[]{33, 78, -54, -115, -86, 13, 20, 57, 33, 100, -54, -126, -85, Base64.padSymbol, 21, 0, 32, 80, -54, -123, -85, 51}, new byte[]{-15, -36, 26, 56, 123, -115, -59, -69}), p.c);
        u8.addView(radioGroup2, v());
        RadioGroup radioGroup3 = radioGroup2;
        RadioGroup radioGroup4 = radioGroup;
        s2 s2Var = new s2(1, this, radioGroup4, x13, radioGroup3);
        radioGroup4.setOnCheckedChangeListener(new q0.i(1, s2Var));
        s2Var.run();
        final SwitchCompat w11 = w(e0.m.h(new byte[]{-112, -37, -75, -85, -55, -26, -110, 120, -112, -6, 69, -59, -91, -76, -9, 22, -12, -112, -43, -59, -86, -76, -1, 22, -8, -111, -32, 53, -55, -28, -110, 118, -112, -9, -75, -95, -56, -47, -110, 125, -112, -11, -75, -88, -56, -36, -110, ByteCompanionObject.MAX_VALUE}, new byte[]{64, 64, 101, 21, 24, 100, 66, -58}));
        w11.setChecked(sharedPreferences.getBoolean(r.f5603g, false));
        u8.addView(w11, v());
        SwitchCompat w12 = w(e0.m.h(new byte[]{29, 124, -35, 124, 28, 45, 101, 32, 29, 93, 45, 18, 112, ByteCompanionObject.MAX_VALUE, 0, 78, 121, 55, -67, 18, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 8, 78, 117, 54, -120, -30, 29, 16, 100, 30, 29, 95, -35, 121, 29, 17, 101, 40, 29, 82, -35, ByteCompanionObject.MAX_VALUE, 29, 23, 101, 39}, new byte[]{-51, -25, 13, -62, -51, -81, -75, -98}));
        w12.setChecked(sharedPreferences.getBoolean(r.f5602f, false));
        u8.addView(w12, v());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = h(12);
        linearLayout.addView(u8, layoutParams);
        LinearLayout u9 = u();
        u9.addView(s(e0.m.h(new byte[]{119, 18, 91, -118, 27, -90, -125, -119, 119, 44, 91, -127, 27, -103, -125, ByteCompanionObject.MIN_VALUE, 119, 39, 91, -121, 27, -97, -125, -125}, new byte[]{-89, -78, -117, 26, -53, 7, 83, 22})));
        final RadioGroup radioGroup5 = new RadioGroup(getContext());
        radioGroup5.setOrientation(0);
        a(radioGroup5, e0.m.h(new byte[]{-95, -67, -111, -96, -103, 103, 87, -103, -95, -84}, new byte[]{113, 28, 65, 27, 73, -46, -121, 43}), o.f5575b);
        a(radioGroup5, e0.m.h(new byte[]{53, -92, 80, -45, -111, 57, -60, -58, 53, -73, 80, -36}, new byte[]{-27, 5, ByteCompanionObject.MIN_VALUE, 108, 64, -71, 20, 118}), o.c);
        a(radioGroup5, e0.m.h(new byte[]{96, -22, -55, -23, 92, ByteCompanionObject.MIN_VALUE, 74, 116, 97, -50, -56, -40}, new byte[]{-80, 75, 25, 91, -116, 53, -101, -12}), o.d);
        a(radioGroup5, e0.m.h(new byte[]{-77, 25, -10, 72, -118, -127, -94, -30, -78, 59}, new byte[]{99, -72, 38, -11, 90, 57, 114, 85}), o.e);
        u9.addView(radioGroup5, v());
        TextView x14 = x(15, -2563349, "");
        x14.setText(e0.m.h(new byte[]{65, -97, -36, 9, 73, -126, 0, 89, 65, -74, -36, 2, 73, -124, 0, 95, 65, -75, 44, 103, 35, -23, 109, 55, 47, -48, -77, 103, 35, -23, 104, -57, 65, -78, -36, 3, 73, -121, 0, 92, 64, -116, 44, 103, 35, -24, 80, 55, 33, -47, -125, -115, -71}, new byte[]{-111, 0, 12, -73, -103, 57, -48, -25}) + rVar.c() + e0.m.h(new byte[]{100}, new byte[]{65, -54, -70, Base64.padSymbol, -45, 102, 40, -6}));
        x14.setPadding(0, h(12), 0, h(9));
        u9.addView(x14);
        Button t = t(e0.m.h(new byte[]{-46, -13, 42, -3, 3, -123, -23, 0, -46, -48, 42, -3, 3, -124, -24, 55, -46, -44, 43, -54, 3, -119, 25, 101, -72, -68, 71, -104, 108, -43, -122, 101, -72, -67, 121, 104, 2, -72, -23, 5, 34, -67, 119, -104, 104, -44, -71, 101, -78, -68, 71, -104, 103}, new byte[]{2, 108, -6, 72, -46, 5, 57, -75}), false);
        t.setOnClickListener(new r0.c(this, alertDialogArr, radioGroup5, x14));
        u9.addView(t, new LinearLayout.LayoutParams(-1, h(50)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = h(12);
        linearLayout.addView(u9, layoutParams2);
        View t3 = t(e0.m.h(new byte[]{87, -107, -125, -38, 54, -2, -22, 6, -89, -26, -45, -65, 86, -110, -118, 93, 57, -26, -44, -65, 83, -110, -120, 93, 57, 23, -126, -18, 55, -64, -21, 51, 87, -116, -125, -33}, new byte[]{-121, 55, 83, 111, -26, 66, 59, -115}), true);
        final int i10 = 0;
        t3.setOnClickListener(new View.OnClickListener(this) { // from class: s1.i
            public final /* synthetic */ k c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                k kVar = this.c;
                switch (i11) {
                    case 0:
                        AlertDialog alertDialog = alertDialogArr2[0];
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        Context context = kVar.getContext();
                        if (context instanceof WebLauncherActivity) {
                            ((WebLauncherActivity) context).G(v.class, null);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog alertDialog2 = alertDialogArr2[0];
                        if (alertDialog2 != null) {
                            alertDialog2.dismiss();
                        }
                        Context context2 = kVar.getContext();
                        if (context2 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity = (WebLauncherActivity) context2;
                            if (!s.c.equals(s.a())) {
                                h0.b.o().saveString(e0.m.h(new byte[]{-49, 10, -5, 90, -33, 112, -69, 116, -24, 22, -49, 75, -15, 65, -68, 117, -31, 27, -55, 77, -30, 115, -84, 111, -10, 26, -62, 88, -50, ByteCompanionObject.MAX_VALUE, -126, 126, -5}, new byte[]{-126, 115, -84, 63, -67, 32, -55, 27}), e0.m.h(new byte[]{39, 82, 80, -67, -115, -51, -56, 44, 52, 82, 84, -125, -108, -64, -55, 29, 32, 95, 83, -82}, new byte[]{67, 55, 54, -36, -8, -95, -68, 115}));
                                webLauncherActivity.H(null);
                            }
                            q0 q0Var = webLauncherActivity.f978i;
                            if (q0Var != null) {
                                q0Var.m();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        AlertDialog alertDialog3 = alertDialogArr2[0];
                        if (alertDialog3 != null) {
                            alertDialog3.dismiss();
                        }
                        Context context3 = kVar.getContext();
                        if (context3 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) context3;
                            Intent intent = new Intent(webLauncherActivity2, (Class<?>) FilePickerActivity.class);
                            intent.putExtra(e0.m.h(new byte[]{75, -67, 71, -77, -96, 33, 87, -95, 72, -70, 88, -65, -112, 42, 112, -72, 66, -80, 78, -119, -116, 33, 65, -79}, new byte[]{45, -44, 43, -42, -1, 68, 47, -43}), 1);
                            webLauncherActivity2.startActivityForResult(intent, 7412);
                            return;
                        }
                        return;
                    default:
                        AlertDialog alertDialog4 = alertDialogArr2[0];
                        if (alertDialog4 != null) {
                            alertDialog4.dismiss();
                        }
                        kVar.getContext().startActivity(new Intent(kVar.getContext(), (Class<?>) ModernMainActivity.class));
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, h(56));
        layoutParams3.bottomMargin = h(12);
        linearLayout.addView(t3, layoutParams3);
        View t9 = t(e0.m.h(new byte[]{-25, 69, -21, 109, -4, -84, 78, 1, -26, 88, -21, 99, -3, -107, 78, 1, -26, 84, 27, 13, -112, -3, 47, 82, -75, 8, -125, 13, -97, -3, 34, 82, -68, 8, -126, -3, -4, -96, 79, 57, -26, 88, -21, 109, -3, -112}, new byte[]{55, -40, 59, -35, 45, 45, -97, -125}), false);
        final int i11 = 1;
        t9.setOnClickListener(new View.OnClickListener(this) { // from class: s1.i
            public final /* synthetic */ k c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                k kVar = this.c;
                switch (i112) {
                    case 0:
                        AlertDialog alertDialog = alertDialogArr2[0];
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        Context context = kVar.getContext();
                        if (context instanceof WebLauncherActivity) {
                            ((WebLauncherActivity) context).G(v.class, null);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog alertDialog2 = alertDialogArr2[0];
                        if (alertDialog2 != null) {
                            alertDialog2.dismiss();
                        }
                        Context context2 = kVar.getContext();
                        if (context2 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity = (WebLauncherActivity) context2;
                            if (!s.c.equals(s.a())) {
                                h0.b.o().saveString(e0.m.h(new byte[]{-49, 10, -5, 90, -33, 112, -69, 116, -24, 22, -49, 75, -15, 65, -68, 117, -31, 27, -55, 77, -30, 115, -84, 111, -10, 26, -62, 88, -50, ByteCompanionObject.MAX_VALUE, -126, 126, -5}, new byte[]{-126, 115, -84, 63, -67, 32, -55, 27}), e0.m.h(new byte[]{39, 82, 80, -67, -115, -51, -56, 44, 52, 82, 84, -125, -108, -64, -55, 29, 32, 95, 83, -82}, new byte[]{67, 55, 54, -36, -8, -95, -68, 115}));
                                webLauncherActivity.H(null);
                            }
                            q0 q0Var = webLauncherActivity.f978i;
                            if (q0Var != null) {
                                q0Var.m();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        AlertDialog alertDialog3 = alertDialogArr2[0];
                        if (alertDialog3 != null) {
                            alertDialog3.dismiss();
                        }
                        Context context3 = kVar.getContext();
                        if (context3 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) context3;
                            Intent intent = new Intent(webLauncherActivity2, (Class<?>) FilePickerActivity.class);
                            intent.putExtra(e0.m.h(new byte[]{75, -67, 71, -77, -96, 33, 87, -95, 72, -70, 88, -65, -112, 42, 112, -72, 66, -80, 78, -119, -116, 33, 65, -79}, new byte[]{45, -44, 43, -42, -1, 68, 47, -43}), 1);
                            webLauncherActivity2.startActivityForResult(intent, 7412);
                            return;
                        }
                        return;
                    default:
                        AlertDialog alertDialog4 = alertDialogArr2[0];
                        if (alertDialog4 != null) {
                            alertDialog4.dismiss();
                        }
                        kVar.getContext().startActivity(new Intent(kVar.getContext(), (Class<?>) ModernMainActivity.class));
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, h(54));
        layoutParams4.bottomMargin = h(12);
        linearLayout.addView(t9, layoutParams4);
        View t10 = t(e0.m.h(new byte[]{37, -51, -76, -67, 63, 125, 52, 63, 37, -17, -76, -76, 62, 64, -59, 110, 113, -113, -37, -26, 82, -20, 53, 2, 37, -17, -76, -76, 63, 116, 53, 13, 37, -30, -75, -120, 63, ByteCompanionObject.MAX_VALUE, 53, 1, -43, -114, -24, -26, 85, 29, 101, 111, 69, -113, -40, -26, 95}, new byte[]{-11, 95, 101, 54, -17, -52, -27, -65}), false);
        final int i12 = 2;
        t10.setOnClickListener(new View.OnClickListener(this) { // from class: s1.i
            public final /* synthetic */ k c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                k kVar = this.c;
                switch (i112) {
                    case 0:
                        AlertDialog alertDialog = alertDialogArr2[0];
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        Context context = kVar.getContext();
                        if (context instanceof WebLauncherActivity) {
                            ((WebLauncherActivity) context).G(v.class, null);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog alertDialog2 = alertDialogArr2[0];
                        if (alertDialog2 != null) {
                            alertDialog2.dismiss();
                        }
                        Context context2 = kVar.getContext();
                        if (context2 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity = (WebLauncherActivity) context2;
                            if (!s.c.equals(s.a())) {
                                h0.b.o().saveString(e0.m.h(new byte[]{-49, 10, -5, 90, -33, 112, -69, 116, -24, 22, -49, 75, -15, 65, -68, 117, -31, 27, -55, 77, -30, 115, -84, 111, -10, 26, -62, 88, -50, ByteCompanionObject.MAX_VALUE, -126, 126, -5}, new byte[]{-126, 115, -84, 63, -67, 32, -55, 27}), e0.m.h(new byte[]{39, 82, 80, -67, -115, -51, -56, 44, 52, 82, 84, -125, -108, -64, -55, 29, 32, 95, 83, -82}, new byte[]{67, 55, 54, -36, -8, -95, -68, 115}));
                                webLauncherActivity.H(null);
                            }
                            q0 q0Var = webLauncherActivity.f978i;
                            if (q0Var != null) {
                                q0Var.m();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        AlertDialog alertDialog3 = alertDialogArr2[0];
                        if (alertDialog3 != null) {
                            alertDialog3.dismiss();
                        }
                        Context context3 = kVar.getContext();
                        if (context3 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) context3;
                            Intent intent = new Intent(webLauncherActivity2, (Class<?>) FilePickerActivity.class);
                            intent.putExtra(e0.m.h(new byte[]{75, -67, 71, -77, -96, 33, 87, -95, 72, -70, 88, -65, -112, 42, 112, -72, 66, -80, 78, -119, -116, 33, 65, -79}, new byte[]{45, -44, 43, -42, -1, 68, 47, -43}), 1);
                            webLauncherActivity2.startActivityForResult(intent, 7412);
                            return;
                        }
                        return;
                    default:
                        AlertDialog alertDialog4 = alertDialogArr2[0];
                        if (alertDialog4 != null) {
                            alertDialog4.dismiss();
                        }
                        kVar.getContext().startActivity(new Intent(kVar.getContext(), (Class<?>) ModernMainActivity.class));
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, h(54));
        layoutParams5.bottomMargin = h(12);
        linearLayout.addView(t10, layoutParams5);
        View t11 = t(e0.m.h(new byte[]{26, -75, 64, 116, -30, 38, -81, 120, 27, -93, 65, 70, -30, 33, -81, 121, 27, -82, -80, -114, 113, -8, 12, -81, -91, 77, -4, -73}, new byte[]{-54, 34, -112, -60, 50, -103, 126, -5}), false);
        final int i13 = 3;
        t11.setOnClickListener(new View.OnClickListener(this) { // from class: s1.i
            public final /* synthetic */ k c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                k kVar = this.c;
                switch (i112) {
                    case 0:
                        AlertDialog alertDialog = alertDialogArr2[0];
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        Context context = kVar.getContext();
                        if (context instanceof WebLauncherActivity) {
                            ((WebLauncherActivity) context).G(v.class, null);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog alertDialog2 = alertDialogArr2[0];
                        if (alertDialog2 != null) {
                            alertDialog2.dismiss();
                        }
                        Context context2 = kVar.getContext();
                        if (context2 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity = (WebLauncherActivity) context2;
                            if (!s.c.equals(s.a())) {
                                h0.b.o().saveString(e0.m.h(new byte[]{-49, 10, -5, 90, -33, 112, -69, 116, -24, 22, -49, 75, -15, 65, -68, 117, -31, 27, -55, 77, -30, 115, -84, 111, -10, 26, -62, 88, -50, ByteCompanionObject.MAX_VALUE, -126, 126, -5}, new byte[]{-126, 115, -84, 63, -67, 32, -55, 27}), e0.m.h(new byte[]{39, 82, 80, -67, -115, -51, -56, 44, 52, 82, 84, -125, -108, -64, -55, 29, 32, 95, 83, -82}, new byte[]{67, 55, 54, -36, -8, -95, -68, 115}));
                                webLauncherActivity.H(null);
                            }
                            q0 q0Var = webLauncherActivity.f978i;
                            if (q0Var != null) {
                                q0Var.m();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        AlertDialog alertDialog3 = alertDialogArr2[0];
                        if (alertDialog3 != null) {
                            alertDialog3.dismiss();
                        }
                        Context context3 = kVar.getContext();
                        if (context3 instanceof WebLauncherActivity) {
                            WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) context3;
                            Intent intent = new Intent(webLauncherActivity2, (Class<?>) FilePickerActivity.class);
                            intent.putExtra(e0.m.h(new byte[]{75, -67, 71, -77, -96, 33, 87, -95, 72, -70, 88, -65, -112, 42, 112, -72, 66, -80, 78, -119, -116, 33, 65, -79}, new byte[]{45, -44, 43, -42, -1, 68, 47, -43}), 1);
                            webLauncherActivity2.startActivityForResult(intent, 7412);
                            return;
                        }
                        return;
                    default:
                        AlertDialog alertDialog4 = alertDialogArr2[0];
                        if (alertDialog4 != null) {
                            alertDialog4.dismiss();
                        }
                        kVar.getContext().startActivity(new Intent(kVar.getContext(), (Class<?>) ModernMainActivity.class));
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, h(54));
        layoutParams6.bottomMargin = h(12);
        linearLayout.addView(t11, layoutParams6);
        LinearLayout u10 = u();
        u10.addView(s(e0.m.h(new byte[]{-110, 49, 27, -30, -102, 21, -68, -11, -110, 0, 27, -30, -102, 33, 76, -121, -42, 112, 94, -103, -45, 100, -51, -121, -32, 112, 89, -103, -46, 100, -61}, new byte[]{66, -96, -53, 73, 74, -76, 108, 87})));
        TextView x15 = x(13, -6575430, e0.m.h(new byte[]{-98, 48, 0, 103, 44, 47, -85, -60, -97, 34, 1, 84, 45, 28, -85, -60, 110, 115, 85, Base64.padSymbol, ByteCompanionObject.MAX_VALUE, 78, -58, -95, -12, 115, 87, 60, 68, 78, -61, 81, -98, 22, 1, 87, 45, 17, 91, -96, -58, 114, 100, Base64.padSymbol, 125, 79, -7, -95, -10, -126, 1, 86, 44, 35, -85, -49, -98, 29, 1, 82, 44, 36, 91, -95, -13, 114, 97, -52, 44, 33, -85, -63, -98, 31, 1, 89, 44, 37, -85, -55, 96}, new byte[]{78, -94, -47, -20, -4, -98, 123, 113}));
        x15.setPadding(0, 0, 0, h(8));
        u10.addView(x15);
        ArrayList e = new j0.c(getContext()).e();
        final SwitchCompat switchCompat = w9;
        final Spinner[] spinnerArr = new Spinner[6];
        int i14 = 0;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setGravity(16);
            SwitchCompat switchCompat2 = w12;
            RadioGroup radioGroup6 = radioGroup4;
            linearLayout2.setPadding(h(12), h(5), h(8), h(5));
            linearLayout2.setBackground(o(-15722463, 12, -14076090));
            int i16 = i14 + 1;
            TextView x16 = x(14, -11486750, String.valueOf(i16));
            x16.setGravity(17);
            linearLayout2.addView(x16, new LinearLayout.LayoutParams(h(34), h(44)));
            Spinner spinner = new Spinner(getContext(), 1);
            spinner.setAdapter((SpinnerAdapter) new j0.b(getContext(), (List) e));
            spinner.setSelection(i(j0.f.e(getContext(), f5517s + i14), e));
            linearLayout2.addView(spinner, new LinearLayout.LayoutParams(0, h(50), 1.0f));
            LinearLayout.LayoutParams v9 = v();
            v9.bottomMargin = h(7);
            u10.addView(linearLayout2, v9);
            spinnerArr[i14] = spinner;
            radioGroup4 = radioGroup6;
            w12 = switchCompat2;
            radioGroup3 = radioGroup3;
            switchCompat = switchCompat;
            i14 = i16;
        }
        final SwitchCompat switchCompat3 = w12;
        final RadioGroup radioGroup7 = radioGroup4;
        final RadioGroup radioGroup8 = radioGroup3;
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.bottomMargin = h(12);
        linearLayout.addView(u10, layoutParams7);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(-16051943);
        scrollView.addView(linearLayout);
        final AlertDialog create = new AlertDialog.Builder(getContext()).setView(scrollView).setPositiveButton(e0.m.h(new byte[]{-103, 28, 66, -3, 77, 34, 14, -109, -103, 13, 66, -2, 76, 31, 14, -111, -104, 49}, new byte[]{73, -67, -110, 67, -100, -89, -33, 19}), (DialogInterface.OnClickListener) null).setNegativeButton(e0.m.h(new byte[]{Base64.padSymbol, 101, 97, -19, -62, 25, 93, -99, Base64.padSymbol, 70, 96, -33}, new byte[]{-19, -5, -80, 111, 18, -91, -115, 40}), (DialogInterface.OnClickListener) null).create();
        alertDialogArr[0] = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: s1.j
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                final AlertDialog alertDialog = create;
                Window window = alertDialog.getWindow();
                final k kVar = this;
                if (window != null) {
                    Window window2 = alertDialog.getWindow();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-16051943);
                    gradientDrawable.setCornerRadius(kVar.h(20));
                    window2.setBackgroundDrawable(gradientDrawable);
                    alertDialog.getWindow().setLayout(Math.min(kVar.getResources().getDisplayMetrics().widthPixels - kVar.h(32), kVar.h(720)), -2);
                }
                alertDialog.getButton(-1).setTextColor(-11486750);
                alertDialog.getButton(-2).setTextColor(-6575430);
                Button button = alertDialog.getButton(-1);
                final RadioGroup radioGroup9 = radioGroup7;
                final RadioGroup radioGroup10 = radioGroup8;
                final RadioGroup radioGroup11 = radioGroup5;
                final SwitchCompat switchCompat4 = w;
                final SwitchCompat switchCompat5 = switchCompat;
                final SwitchCompat switchCompat6 = w10;
                final SwitchCompat switchCompat7 = w11;
                final SwitchCompat switchCompat8 = switchCompat3;
                final Spinner[] spinnerArr2 = spinnerArr;
                button.setOnClickListener(new View.OnClickListener() { // from class: s1.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object tag;
                        q e6;
                        Object tag2;
                        p d;
                        o b10;
                        k kVar2 = kVar;
                        r rVar2 = kVar2.f5518b;
                        rVar2.f5608a.edit().putBoolean(r.f5601b, switchCompat4.isChecked()).apply();
                        boolean isChecked = switchCompat5.isChecked();
                        SharedPreferences sharedPreferences2 = rVar2.f5608a;
                        sharedPreferences2.edit().putBoolean(r.f5604h, isChecked).apply();
                        sharedPreferences2.edit().putBoolean(r.f5605i, switchCompat6.isChecked()).apply();
                        RadioGroup radioGroup12 = radioGroup9;
                        View findViewById = radioGroup12.findViewById(radioGroup12.getCheckedRadioButtonId());
                        Object obj = null;
                        if (findViewById == null) {
                            tag = null;
                        } else {
                            tag = findViewById.getTag();
                        }
                        if (tag instanceof q) {
                            e6 = (q) tag;
                        } else {
                            e6 = rVar2.e();
                        }
                        sharedPreferences2.edit().putString(r.f5606j, e6.name()).apply();
                        RadioGroup radioGroup13 = radioGroup10;
                        View findViewById2 = radioGroup13.findViewById(radioGroup13.getCheckedRadioButtonId());
                        if (findViewById2 == null) {
                            tag2 = null;
                        } else {
                            tag2 = findViewById2.getTag();
                        }
                        if (tag2 instanceof p) {
                            d = (p) tag2;
                        } else {
                            d = rVar2.d();
                        }
                        sharedPreferences2.edit().putString(r.f5607k, d.name()).apply();
                        sharedPreferences2.edit().putBoolean(r.f5603g, switchCompat7.isChecked()).apply();
                        sharedPreferences2.edit().putBoolean(r.f5602f, switchCompat8.isChecked()).apply();
                        RadioGroup radioGroup14 = radioGroup11;
                        View findViewById3 = radioGroup14.findViewById(radioGroup14.getCheckedRadioButtonId());
                        if (findViewById3 != null) {
                            obj = findViewById3.getTag();
                        }
                        if (obj instanceof o) {
                            b10 = (o) obj;
                        } else {
                            b10 = rVar2.b();
                        }
                        sharedPreferences2.edit().putString(r.c, b10.name()).apply();
                        for (int i17 = 0; i17 < 6; i17++) {
                            Object selectedItem = spinnerArr2[i17].getSelectedItem();
                            if (selectedItem instanceof j0.e) {
                                j0.f.f(k.f5517s + i17, (j0.e) selectedItem);
                            }
                        }
                        kVar2.n();
                        if (rVar2.f()) {
                            kVar2.r();
                        } else {
                            kVar2.y();
                        }
                        v0 v0Var = kVar2.f5530q;
                        if (v0Var != null) {
                            v0Var.run();
                        }
                        alertDialog.dismiss();
                    }
                });
            }
        });
        create.setOnDismissListener(new m7.c(this, 1));
        create.show();
    }
}
