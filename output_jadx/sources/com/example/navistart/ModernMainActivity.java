package com.example.navistart;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.transition.a;
import c7.e;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.PermActivity;
import com.example.navistart.R;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import com.example.navistart.W;
import com.example.navistart.mainview.HeatManSetView;
import com.example.navistart.mainview.YMovLay;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.woha.appmanag.ManageAppsActivity;
import e0.g0;
import e0.l1;
import e0.m;
import e0.q1;
import e0.r1;
import e0.s0;
import h0.b;
import java.util.HashSet;
import java.util.Locale;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ModernMainActivity extends MainActivity {
    public static final String B1 = m.h(new byte[]{-75, -42, 52, 120, -15, 94, 92, 51, -67, -38, 36, 116, -20, 94}, new byte[]{-40, -71, 80, 29, -125, 48, 3, 64});
    public static final String C1 = m.h(new byte[]{108, -46, -37, -6, 3, 92, 15, 6, 110, -46, -45}, new byte[]{1, -67, -65, -97, 113, 50, 80, 114});
    public String A1;
    public final HashSet m1 = new HashSet();
    public final int[] n1 = {R.id.modern_nav_home, R.id.modern_nav_startup, R.id.modern_nav_comfort, R.id.modern_nav_tools};
    public final int[] o1 = {R.id.modern_section_home, R.id.modern_section_startup, R.id.modern_section_comfort, R.id.modern_section_tools};
    public final int[] p1 = {R.id.modern_action_auth, R.id.modern_action_update, R.id.modern_action_wifi, R.id.modern_action_vpn, R.id.modern_action_radar, R.id.modern_action_app_settings, R.id.modern_action_about};
    public final int[] q1 = {R.id.au, R.id.menu_update, R.id.menu_wifi, R.id.menu_vpn, R.id.menu_arad, R.id.aupdate, R.id.menu_about};
    public final int[] r1 = {R.string.modern_home, R.string.modern_startup, R.string.modern_comfort, R.string.modern_tools};

    /* renamed from: s1, reason: collision with root package name */
    public final int[] f825s1 = {R.id.modern_tool_tab_store, R.id.modern_tool_tab_maps, R.id.modern_tool_tab_car, R.id.modern_tool_tab_other, R.id.modern_tool_tab_controls};

    /* renamed from: t1, reason: collision with root package name */
    public final int[] f826t1 = {R.id.modern_tool_panel_store, R.id.modern_tool_panel_maps, R.id.modern_tool_panel_car, R.id.modern_tool_panel_other, R.id.modern_tool_panel_controls};

    /* renamed from: u1, reason: collision with root package name */
    public final int[] f827u1 = {R.string.item_store, R.string.karti, R.string.item_car_settings, R.string.modern_useful_features, R.string.modern_convenient_control};

    /* renamed from: v1, reason: collision with root package name */
    public int f828v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f829w1;

    /* renamed from: x1, reason: collision with root package name */
    public Boolean f830x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f831y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f832z1;

    @Override // com.example.navistart.MainActivity
    public final void H(c cVar) {
        boolean z9;
        if (cVar == c.f4051k) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f832z1 = z9;
        a0(R.id.modern_messages, R.id.MainWidjet);
        a0(R.id.modern_location_card, R.id.main_other);
        a0(R.id.main_button_settings, R.id.main_other);
        if (this.f831y1) {
            c0();
        }
    }

    @Override // com.example.navistart.MainActivity
    public final void J(boolean z9) {
        super.J(z9);
        runOnUiThread(new e(this, z9, 4));
    }

    public final void R(int i10, int i11) {
        boolean z9;
        int i12;
        int i13;
        int X;
        int X2;
        float f8;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        if (i10 > 0 && i11 > 0) {
            int i18 = 1;
            boolean z10 = false;
            if (i10 / getResources().getDisplayMetrics().density < 850.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            Boolean bool = this.f830x1;
            if (bool == null || bool.booleanValue() != z9) {
                this.f830x1 = Boolean.valueOf(z9);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.modern_navigation_rail);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (z9) {
                    i12 = 164;
                } else {
                    i12 = 220;
                }
                layoutParams.width = X(i12);
                linearLayout.setLayoutParams(layoutParams);
                View findViewById = findViewById(R.id.modern_brand_text);
                int i19 = 8;
                if (z9) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                findViewById.setVisibility(i13);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.modern_brand);
                if (!z9) {
                    i18 = GravityCompat.START;
                }
                int i20 = 16;
                linearLayout2.setGravity(i18 | 16);
                if (z9) {
                    X = 0;
                } else {
                    X = X(18);
                }
                if (z9) {
                    X2 = 0;
                } else {
                    X2 = X(14);
                }
                linearLayout2.setPadding(X, 0, X2, 0);
                int i21 = 0;
                while (true) {
                    int[] iArr = this.n1;
                    float f11 = 15.0f;
                    if (i21 >= iArr.length) {
                        break;
                    }
                    TextView textView = (TextView) findViewById(iArr[i21]);
                    int[] iArr2 = this.r1;
                    textView.setText(getString(iArr2[i21]));
                    textView.setGravity(16);
                    textView.setSingleLine(false);
                    textView.setMaxLines(3);
                    if (z9) {
                        f11 = 13.0f;
                    }
                    textView.setTextSize(2, f11);
                    if (z9) {
                        i16 = 10;
                    } else {
                        i16 = 16;
                    }
                    textView.setPadding(X(i16), X(6), X(8), X(6));
                    if (z9) {
                        i17 = 8;
                    } else {
                        i17 = 12;
                    }
                    textView.setCompoundDrawablePadding(X(i17));
                    textView.getLayoutParams().height = -2;
                    textView.setMinimumHeight(X(54));
                    textView.setContentDescription(getString(iArr2[i21]));
                    i21++;
                }
                int i22 = 0;
                while (true) {
                    int[] iArr3 = this.f825s1;
                    if (i22 >= iArr3.length) {
                        break;
                    }
                    TextView textView2 = (TextView) findViewById(iArr3[i22]);
                    int[] iArr4 = this.f827u1;
                    textView2.setText(getString(iArr4[i22]));
                    textView2.setGravity(i20);
                    textView2.setSingleLine(z10);
                    textView2.setMaxLines(3);
                    if (z9) {
                        f10 = 13.0f;
                    } else {
                        f10 = 15.0f;
                    }
                    textView2.setTextSize(2, f10);
                    if (z9) {
                        i14 = 10;
                    } else {
                        i14 = i20;
                    }
                    textView2.setPadding(X(i14), X(6), X(i19), X(6));
                    if (z9) {
                        i15 = 8;
                    } else {
                        i15 = 12;
                    }
                    textView2.setCompoundDrawablePadding(X(i15));
                    textView2.getLayoutParams().height = -2;
                    textView2.setMinimumHeight(X(54));
                    textView2.setContentDescription(getString(iArr4[i22]));
                    i22++;
                    z10 = false;
                    i19 = 8;
                    i20 = 16;
                }
                TextView textView3 = (TextView) findViewById(R.id.modern_section_title);
                if (z9) {
                    f8 = 21.0f;
                } else {
                    f8 = 24.0f;
                }
                textView3.setTextSize(2, f8);
            }
        }
    }

    public final void S(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = X(6);
            marginLayoutParams.rightMargin = X(6);
            marginLayoutParams.topMargin = X(4);
            marginLayoutParams.bottomMargin = X(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07e8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05bc A[EDGE_INSN: B:250:0x05bc->B:178:0x05bc BREAK  A[LOOP:8: B:170:0x0541->B:176:0x05b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03a0 A[EDGE_INSN: B:315:0x03a0->B:135:0x03a0 BREAK  A[LOOP:5: B:127:0x0315->B:133:0x0398], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 2025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.ModernMainActivity.T(android.view.View):void");
    }

    public final void U(Button button, int i10) {
        int i11;
        int id = button.getId();
        if (id == R.id.install_unistall_app) {
            i11 = R.drawable.modern_store_manage_apps;
        } else if (id == R.id.modern_fullscreen_apps) {
            i11 = R.drawable.ic_fullscreen_apps;
        } else if (id == R.id.modern_grant_app_permissions) {
            i11 = R.drawable.modern_store_permissions;
        } else if (id == R.id.modern_car_package_toggle) {
            i11 = R.drawable.modern_store_car_packages;
        } else if (id == R.id.JCT_Store_app) {
            i11 = R.mipmap.jct_store_icon;
        } else if (id == R.id.JCT_File_Manager) {
            i11 = R.mipmap.jct_file_icon;
        } else if (id == R.id.JCT_Video_Library) {
            i11 = R.drawable.ic_jct_video;
        } else if (id == R.id.JCT_User_Apps_Hide) {
            i11 = R.drawable.modern_store_hidden_apps;
        } else {
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(this, i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i10);
            button.setCompoundDrawablesRelative(drawable, null, null, null);
        }
    }

    public final void V(YMovLay yMovLay, String str, String str2) {
        int i10;
        int i11 = 0;
        try {
            i10 = Integer.parseInt(yMovLay.getYLayMovX());
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        try {
            i11 = Integer.parseInt(yMovLay.getYLayMovY());
        } catch (NumberFormatException unused2) {
        }
        yMovLay.a(Math.min(-500, i10 - 200), Math.max(2500, i10 + 200), Math.min(-500, i11 - 200), Math.max(1500, i11 + 200));
        yMovLay.setOnSliderValueChangeListener(new r1(this, str, str2, yMovLay));
    }

    public final void W(YMovLay yMovLay, String str) {
        String yLayMovX = yMovLay.getYLayMovX();
        int parseInt = Integer.parseInt(this.f792s);
        try {
            parseInt = Integer.parseInt(yLayMovX);
        } catch (NumberFormatException unused) {
        }
        yMovLay.a(Math.min(80, parseInt - 40), Math.max(640, parseInt + 40), 0, 1);
        yMovLay.setOnSliderValueChangeListener(new a(this, str, yMovLay, 1));
    }

    public final int X(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final boolean Y(int... iArr) {
        for (int i10 : iArr) {
            View findViewById = findViewById(i10);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void Z(FlexboxLayout flexboxLayout) {
        int width = (flexboxLayout.getWidth() - flexboxLayout.getPaddingLeft()) - flexboxLayout.getPaddingRight();
        if (width > 0) {
            flexboxLayout.setJustifyContent(0);
            int X = X(260);
            int max = Math.max(0, (width / Math.max(1, width / ((X(4) * 2) + X))) - X);
            int i10 = max / 2;
            int i11 = max - i10;
            for (int i12 = 0; i12 < flexboxLayout.getChildCount(); i12++) {
                View childAt = flexboxLayout.getChildAt(i12);
                if (childAt instanceof HeatManSetView) {
                    o2.e eVar = (o2.e) childAt.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) eVar).width != X || ((ViewGroup.MarginLayoutParams) eVar).leftMargin != i10 || ((ViewGroup.MarginLayoutParams) eVar).rightMargin != i11) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = X;
                        eVar.c = 0.0f;
                        eVar.d = 0.0f;
                        eVar.setMargins(i10, X(4), i11, X(4));
                        childAt.setPadding(0, 0, 0, 0);
                        childAt.setLayoutParams(eVar);
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (viewGroup.getChildCount() > 0) {
                            View childAt2 = viewGroup.getChildAt(0);
                            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                            layoutParams.width = -1;
                            childAt2.setLayoutParams(layoutParams);
                        }
                        View findViewById = childAt.findViewById(R.id.centerLabel);
                        if (findViewById != null) {
                            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                            layoutParams2.width = X(220);
                            findViewById.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
    }

    public final void a0(int i10, int i11) {
        View findViewById = findViewById(i10);
        View findViewById2 = findViewById(i11);
        if (findViewById != null && findViewById2 != null) {
            findViewById.setVisibility(findViewById2.getVisibility());
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Configuration configuration2 = new Configuration(configuration);
        if (getBaseContext() != null) {
            configuration2.densityDpi = m.x(getBaseContext()).getResources().getConfiguration().densityDpi;
        }
        super.applyOverrideConfiguration(configuration2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(m.x(context));
    }

    public final void b0(int i10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = -2;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public final void c0() {
        int i10;
        int i11;
        boolean z9;
        int i12;
        boolean Y = Y(R.id.mainStartProPri, R.id.MainStartProHUD, R.id.mainStartProGu);
        boolean Y2 = Y(R.id.main_auto_vod, R.id.main_auto_heat);
        View findViewById = findViewById(R.id.modern_nav_startup);
        int i13 = 0;
        if (Y) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        findViewById.setVisibility(i10);
        View findViewById2 = findViewById(R.id.modern_nav_comfort);
        if (Y2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        findViewById2.setVisibility(i11);
        boolean Y3 = Y(R.id.main_store);
        boolean Y4 = Y(R.id.main_karti);
        boolean Y5 = Y(R.id.main_car_settings);
        boolean Y6 = Y(R.id.modern_messages, R.id.MainWidjet, R.id.modern_location_card, R.id.Lay_strelka, R.id.main_other);
        if (!this.f832z1 && Y(R.id.main_lounchb, R.id.main_button_settings, R.id.constraintLayout6, R.id.modern_edge_gesture_card)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean[] zArr = {Y3, Y4, Y5, Y6, z9};
        int i14 = 0;
        while (true) {
            int[] iArr = this.f825s1;
            if (i14 >= iArr.length) {
                break;
            }
            View findViewById3 = findViewById(iArr[i14]);
            if (zArr[i14]) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            findViewById3.setVisibility(i12);
            i14++;
        }
        int i15 = this.f828v1;
        if ((i15 == 1 && !Y) || (i15 == 2 && !Y2)) {
            this.f828v1 = 0;
            d0(0);
        }
        if (!zArr[this.f829w1]) {
            while (true) {
                if (i13 >= 5) {
                    break;
                }
                if (zArr[i13]) {
                    this.f829w1 = i13;
                    break;
                }
                i13++;
            }
            if (this.f828v1 == this.o1.length - 1) {
                e0(this.f829w1);
            }
        }
    }

    public final void d0(int i10) {
        int i11;
        int[] iArr = this.o1;
        if (i10 < 0 || i10 >= iArr.length) {
            i10 = 0;
        }
        this.f828v1 = i10;
        View view = null;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            int i13 = R.color.modern_text_secondary;
            boolean z9 = true;
            if (i12 >= length) {
                break;
            }
            View findViewById = findViewById(iArr[i12]);
            if (i12 == i10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById.setVisibility(i11);
            if (i12 == i10) {
                view = findViewById;
            }
            int[] iArr2 = this.n1;
            View findViewById2 = findViewById(iArr2[i12]);
            if (i12 != i10) {
                z9 = false;
            }
            findViewById2.setSelected(z9);
            TextView textView = (TextView) findViewById(iArr2[i12]);
            if (i12 == i10) {
                i13 = R.color.modern_primary;
            }
            textView.setCompoundDrawableTintList(ColorStateList.valueOf(ContextCompat.getColor(this, i13)));
            i12++;
        }
        ((TextView) findViewById(R.id.modern_section_title)).setText(this.r1[i10]);
        if (view != null) {
            T(view);
            view.postDelayed(new l1(this, view, 0), 150L);
        }
        if (i10 != iArr.length - 1) {
            int color = ContextCompat.getColor(this, R.color.modern_text_secondary);
            for (int i14 : this.f825s1) {
                TextView textView2 = (TextView) findViewById(i14);
                textView2.setSelected(false);
                textView2.setTextColor(color);
                textView2.setCompoundDrawableTintList(ColorStateList.valueOf(color));
            }
        }
    }

    public final void e0(int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f826t1;
        if (i10 < 0 || i10 >= iArr.length) {
            i10 = 0;
        }
        if (this.f832z1 && i10 == iArr.length - 1) {
            i10 = 0;
        }
        this.f829w1 = i10;
        ((TextView) findViewById(R.id.modern_section_title)).setText(this.f827u1[i10]);
        int color = ContextCompat.getColor(this, R.color.modern_primary);
        int color2 = ContextCompat.getColor(this, R.color.modern_text_secondary);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            View findViewById = findViewById(iArr[i14]);
            if (i14 == i10) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById.setVisibility(i11);
            TextView textView = (TextView) findViewById(this.f825s1[i14]);
            textView.setSelected(z9);
            if (z9) {
                i12 = color;
            } else {
                i12 = color2;
            }
            textView.setTextColor(i12);
            if (z9) {
                i13 = color;
            } else {
                i13 = color2;
            }
            textView.setCompoundDrawableTintList(ColorStateList.valueOf(i13));
            if (z9) {
                T(findViewById);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.main);
        findViewById.post(new l1(this, findViewById, 2));
    }

    @Override // com.example.navistart.MainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        int i11;
        final int i12;
        final int i13;
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        final int i14 = 0;
        if (bundle == null) {
            i10 = 0;
        } else {
            i10 = bundle.getInt(B1, 0);
        }
        this.f828v1 = i10;
        if (bundle == null) {
            i11 = 0;
        } else {
            i11 = bundle.getInt(C1, 0);
        }
        this.f829w1 = i11;
        final int i15 = 0;
        while (true) {
            int[] iArr = this.n1;
            i12 = 2;
            if (i15 >= iArr.length) {
                break;
            }
            findViewById(iArr[i15]).setOnClickListener(new View.OnClickListener(this) { // from class: e0.m1
                public final /* synthetic */ ModernMainActivity c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuItem findItem;
                    int i16 = i12;
                    int i17 = i15;
                    ModernMainActivity modernMainActivity = this.c;
                    switch (i16) {
                        case 0:
                            modernMainActivity.d0(modernMainActivity.o1.length - 1);
                            modernMainActivity.e0(i17);
                            return;
                        case 1:
                            String str = ModernMainActivity.B1;
                            Toolbar toolbar = (Toolbar) modernMainActivity.findViewById(R.id.toolbar);
                            if (toolbar == null) {
                                findItem = null;
                            } else {
                                findItem = toolbar.getMenu().findItem(i17);
                            }
                            if (findItem == null) {
                                View findViewById = modernMainActivity.findViewById(R.id.main);
                                if (findViewById != null) {
                                    PopupMenu popupMenu = new PopupMenu(modernMainActivity, findViewById);
                                    popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
                                    findItem = popupMenu.getMenu().findItem(i17);
                                } else {
                                    return;
                                }
                            }
                            if (findItem != null) {
                                modernMainActivity.onOptionsItemSelected(findItem);
                                return;
                            }
                            return;
                        default:
                            String str2 = ModernMainActivity.B1;
                            modernMainActivity.d0(i17);
                            return;
                    }
                }
            });
            i15++;
        }
        findViewById(R.id.modern_action_permissions).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i14;
                ModernMainActivity modernMainActivity = this.c;
                switch (i16) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        int i16 = 0;
        while (true) {
            int[] iArr2 = this.p1;
            i13 = 1;
            if (i16 >= iArr2.length) {
                break;
            }
            final int i17 = this.q1[i16];
            findViewById(iArr2[i16]).setOnClickListener(new View.OnClickListener(this) { // from class: e0.m1
                public final /* synthetic */ ModernMainActivity c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuItem findItem;
                    int i162 = i13;
                    int i172 = i17;
                    ModernMainActivity modernMainActivity = this.c;
                    switch (i162) {
                        case 0:
                            modernMainActivity.d0(modernMainActivity.o1.length - 1);
                            modernMainActivity.e0(i172);
                            return;
                        case 1:
                            String str = ModernMainActivity.B1;
                            Toolbar toolbar = (Toolbar) modernMainActivity.findViewById(R.id.toolbar);
                            if (toolbar == null) {
                                findItem = null;
                            } else {
                                findItem = toolbar.getMenu().findItem(i172);
                            }
                            if (findItem == null) {
                                View findViewById = modernMainActivity.findViewById(R.id.main);
                                if (findViewById != null) {
                                    PopupMenu popupMenu = new PopupMenu(modernMainActivity, findViewById);
                                    popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
                                    findItem = popupMenu.getMenu().findItem(i172);
                                } else {
                                    return;
                                }
                            }
                            if (findItem != null) {
                                modernMainActivity.onOptionsItemSelected(findItem);
                                return;
                            }
                            return;
                        default:
                            String str2 = ModernMainActivity.B1;
                            modernMainActivity.d0(i172);
                            return;
                    }
                }
            });
            i16++;
        }
        final int i18 = 0;
        while (true) {
            int[] iArr3 = this.f825s1;
            if (i18 >= iArr3.length) {
                break;
            }
            findViewById(iArr3[i18]).setOnClickListener(new View.OnClickListener(this) { // from class: e0.m1
                public final /* synthetic */ ModernMainActivity c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuItem findItem;
                    int i162 = i14;
                    int i172 = i18;
                    ModernMainActivity modernMainActivity = this.c;
                    switch (i162) {
                        case 0:
                            modernMainActivity.d0(modernMainActivity.o1.length - 1);
                            modernMainActivity.e0(i172);
                            return;
                        case 1:
                            String str = ModernMainActivity.B1;
                            Toolbar toolbar = (Toolbar) modernMainActivity.findViewById(R.id.toolbar);
                            if (toolbar == null) {
                                findItem = null;
                            } else {
                                findItem = toolbar.getMenu().findItem(i172);
                            }
                            if (findItem == null) {
                                View findViewById = modernMainActivity.findViewById(R.id.main);
                                if (findViewById != null) {
                                    PopupMenu popupMenu = new PopupMenu(modernMainActivity, findViewById);
                                    popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
                                    findItem = popupMenu.getMenu().findItem(i172);
                                } else {
                                    return;
                                }
                            }
                            if (findItem != null) {
                                modernMainActivity.onOptionsItemSelected(findItem);
                                return;
                            }
                            return;
                        default:
                            String str2 = ModernMainActivity.B1;
                            modernMainActivity.d0(i172);
                            return;
                    }
                }
            });
            i18++;
        }
        V(this.R0, this.f769g, this.f771h);
        V(this.S0, this.f777k, this.f779l);
        V(this.T0, this.f785o, this.f787p);
        W(this.U0, m.h(new byte[]{43, 126, 46, 0, 58, -39, 56, -33, 16, 118, 42, 38, 36, -2, 28, -1}, new byte[]{102, 31, 94, 95, 123, -70, 76, -74}));
        W(this.V0, m.h(new byte[]{-95, -96, 44, 126, 35, -26, -87, 93, -102, -88, 40, 88, Base64.padSymbol, -63, -115, 125, -77, -122, 9}, new byte[]{-20, -63, 92, 33, 98, -123, -35, 52}));
        findViewById(R.id.modern_fullscreen_apps).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i12;
                ModernMainActivity modernMainActivity = this.c;
                switch (i162) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        final int i19 = 3;
        findViewById(R.id.modern_grant_app_permissions).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i19;
                ModernMainActivity modernMainActivity = this.c;
                switch (i162) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        final int i20 = 4;
        findViewById(R.id.modern_car_package_toggle).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i20;
                ModernMainActivity modernMainActivity = this.c;
                switch (i162) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        final int i21 = 5;
        findViewById(R.id.install_unistall_app).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i21;
                ModernMainActivity modernMainActivity = this.c;
                switch (i162) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        View findViewById = findViewById(R.id.swipe_setting_button);
        if (findViewById != null && (findViewById.getParent() instanceof View)) {
            ((View) findViewById.getParent()).setVisibility(8);
        }
        if (findViewById(R.id.modern_edge_gesture_container) != null && getSupportFragmentManager().findFragmentByTag(m.h(new byte[]{59, 28, -88, 102, 95, 114, -72, 24, 50, 20, -87, 92, 74, 121, -108, 9, 35, 1, -87, 92, 87, 115, -119, 24, 37}, new byte[]{86, 115, -52, 3, 45, 28, -25, 125})) == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.modern_edge_gesture_container, new o0.a(), m.h(new byte[]{97, 21, 3, -86, -45, 119, -65, 121, 104, 29, 2, -112, -58, 124, -109, 104, 121, 8, 2, -112, -37, 118, -114, 121, ByteCompanionObject.MAX_VALUE}, new byte[]{12, 122, 103, -49, -95, 25, -32, 28})).commitNow();
        }
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.super_widgets_enabled);
        materialSwitch.setChecked(b.o().loadBoolean(m.h(new byte[]{17, -30, -95, 101, 122, 74, -119, 69, 6, -16, -76, 116, 123, 74, -101, 66, 3, -11, -67, 101, 108}, new byte[]{98, -105, -47, 0, 8, 21, -2, 44}), false));
        materialSwitch.setOnCheckedChangeListener(new s0(i12, this));
        findViewById(R.id.super_widgets_settings).setOnClickListener(new View.OnClickListener(this) { // from class: e0.n1
            public final /* synthetic */ ModernMainActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i13;
                ModernMainActivity modernMainActivity = this.c;
                switch (i162) {
                    case 0:
                        String str = ModernMainActivity.B1;
                        y5.k.u(modernMainActivity, new Intent(modernMainActivity, (Class<?>) PermActivity.class), null);
                        return;
                    case 1:
                        String str2 = ModernMainActivity.B1;
                        W.t(modernMainActivity, WidgetBuilderFragment.class, null);
                        return;
                    case 2:
                        String str3 = ModernMainActivity.B1;
                        l0.a.t(m0.n0.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{55, 70, -45, 53, -77, -72, -57, -53, 52, 93, -32, 56, -80, -85, -58, -15, 53, 90, -34, 53, -81, -68}, new byte[]{81, 51, -65, 89, -64, -37, -75, -82}));
                        return;
                    case 3:
                        String str4 = ModernMainActivity.B1;
                        l0.a.t(m0.i.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{-27, -46, -57, 103, -9, -5, 122, 18, -16, -51, -49, 122, -16, -51, 101, 25, -15, -1, -62, 96, -30, -56, 101, 16}, new byte[]{-126, -96, -90, 9, -125, -92, 10, 119}));
                        return;
                    case 4:
                        String str5 = ModernMainActivity.B1;
                        l0.a.t(m0.y.class, null).show(modernMainActivity.getSupportFragmentManager(), m.h(new byte[]{16, -108, -78, -119, 23, 6, -22, -15, 18, -110, -91, -119, 19, 8, -18, -3, 31, -112, -97, -78, 14, 6, -27, -11, 20}, new byte[]{115, -11, -64, -42, 103, 103, -119, -102}));
                        return;
                    default:
                        String str6 = ModernMainActivity.B1;
                        Intent intent = new Intent(modernMainActivity, (Class<?>) ManageAppsActivity.class);
                        intent.putExtra(m.h(new byte[]{-1, 46, -14, 30, 51, 13, 42, 109, -10, 41, -11, 30, 8, 51, 47, 120, -29, 46, -7, 21, 31}, new byte[]{-105, 71, -106, 123, 108, 108, 78, 27}), true);
                        modernMainActivity.startActivity(intent);
                        return;
                }
            }
        });
        b0(R.id.modern_donation_card);
        b0(R.id.modern_car_profile_card);
        ((TextView) findViewById(R.id.modern_version)).setText(m.h(new byte[]{91, 10, 4, -62, -118}, new byte[]{105, 36, 52, -20, -66, -89, -22, -70}));
        T(findViewById(R.id.main));
        this.f831y1 = true;
        c0();
        d0(this.f828v1);
        if (this.f828v1 == this.o1.length - 1) {
            e0(this.f829w1);
        }
        View findViewById2 = findViewById(R.id.main);
        findViewById2.addOnLayoutChangeListener(new q1(i14, this));
        findViewById2.post(new l1(this, findViewById2, 1));
    }

    @Override // com.example.navistart.MainActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.A1;
        if (str != null && !str.equals(g0.a())) {
            recreate();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(B1, this.f828v1);
        bundle.putInt(C1, this.f829w1);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.example.navistart.MainActivity
    public final int z() {
        Context x9 = m.x(this);
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.densityDpi = x9.getResources().getConfiguration().densityDpi;
        this.A1 = g0.a();
        Locale locale = new Locale(this.A1);
        configuration.setLocale(locale);
        Locale.setDefault(locale);
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        return R.layout.activity_modern_main;
    }
}
