package e0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.navistart.MainActivity;
import com.example.navistart.R;
import com.example.navistart.TestSpaceActivity;
import com.example.navistart.VJCT;
import com.example.navistart.W;
import com.example.navistart.home.WebLauncherActivity;
import com.woha.appmanag.ManageAppsActivity;
import com.woha.atir.RadarActivity;
import e0.n0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2005b;
    public final /* synthetic */ MainActivity c;

    public /* synthetic */ q0(MainActivity mainActivity, int i10) {
        this.f2005b = i10;
        this.c = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z9;
        String string;
        j0.e[] eVarArr;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12 = this.f2005b;
        int i13 = 1;
        int i14 = 3;
        MainActivity mainActivity = this.c;
        switch (i12) {
            case 0:
                String str = MainActivity.f750e1;
                y5.k.u(mainActivity, new Intent(mainActivity, (Class<?>) RadarActivity.class), null);
                return;
            case 1:
                String str2 = MainActivity.f750e1;
                l0.a.t(m0.c2.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{72, 124, -50, -51, 51, -21, 114, -39, 66}, new byte[]{37, 5, -111, -87, 90, -118, 30, -74}));
                return;
            case 2:
                String str3 = MainActivity.f750e1;
                l0.a.t(w0.v0.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{-62, -3, -84, 43, 26, -74, -97, -99, -56}, new byte[]{-81, -124, -13, 79, 115, -41, -13, -14}));
                return;
            case 3:
                String str4 = MainActivity.f750e1;
                k0.a.a(mainActivity, true);
                return;
            case 4:
                String str5 = MainActivity.f750e1;
                k0.a.a(mainActivity, false);
                return;
            case 5:
                String str6 = MainActivity.f750e1;
                W.t(mainActivity, m0.l1.class, null);
                return;
            case 6:
                String str7 = MainActivity.f750e1;
                l0.a.t(q0.l.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{27, 45, -20, 82, 56, -48, 53, -101, 41, 54, -22, 74, 19}, new byte[]{118, 66, -113, 57, 103, -73, 69, -24}));
                return;
            case 7:
                String str8 = MainActivity.f750e1;
                W.t(mainActivity, m0.v.class, null);
                return;
            case 8:
                String str9 = MainActivity.f750e1;
                W.t(mainActivity, m0.n3.class, null);
                return;
            case 9:
                String str10 = MainActivity.f750e1;
                W.t(mainActivity, m0.c3.class, null);
                return;
            case 10:
                String str11 = MainActivity.f750e1;
                l0.a.t(m0.q2.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{51, 62, -125, 76, 49, -84, -71, -83, 53, 18, -114, 87, 10, -88, -106, -71, 47, 44, -118, 81, 9}, new byte[]{70, 77, -26, 62, 110, -51, -55, -35}));
                return;
            case 11:
                String str12 = MainActivity.f750e1;
                l0.a.t(m0.w.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{-82, -4, 89, 14, -31, -64, -65, 79, -92}, new byte[]{-61, -123, 6, 106, -120, -95, -45, 32}));
                return;
            case 12:
                String str13 = MainActivity.f750e1;
                l0.a.t(m0.e2.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{19, -4, 118, -50, 113, 1, 58, -33, 25}, new byte[]{126, -123, 41, -86, 24, 96, 86, -80}));
                return;
            case 13:
                String str14 = MainActivity.f750e1;
                l0.a.t(o0.a.class, null).show(mainActivity.getSupportFragmentManager(), m.h(new byte[]{93, -33, 107, 13, 56, 113, -70, -104, 87}, new byte[]{48, -90, 52, 105, 81, 16, -42, -9}));
                return;
            case 14:
                String str15 = MainActivity.f750e1;
                y5.k.u(mainActivity, new Intent(mainActivity, (Class<?>) VJCT.class), null);
                return;
            case 15:
                String str16 = MainActivity.f750e1;
                String str17 = t1.e.f5753g;
                final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mainActivity, R.style.Theme_JCarTools_WidgetBuilderPopup);
                LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
                linearLayout.setOrientation(1);
                int round = Math.round(contextThemeWrapper.getResources().getDisplayMetrics().density * 20.0f);
                int i15 = round / 2;
                linearLayout.setPadding(round, i15, round, i15);
                TextView textView = new TextView(contextThemeWrapper);
                textView.setText(R.string.fuel_widget_capacity_description);
                textView.setTextColor(ContextCompat.getColor(contextThemeWrapper, R.color.modern_text_secondary));
                linearLayout.addView(textView);
                final AppCompatEditText appCompatEditText = new AppCompatEditText(contextThemeWrapper);
                appCompatEditText.setHint(R.string.fuel_widget_capacity_hint);
                appCompatEditText.setSingleLine();
                appCompatEditText.setInputType(8194);
                appCompatEditText.setTextColor(ContextCompat.getColor(contextThemeWrapper, R.color.modern_text));
                appCompatEditText.setHintTextColor(ContextCompat.getColor(contextThemeWrapper, R.color.modern_text_secondary));
                double c = t1.e.c();
                if (Double.isFinite(c)) {
                    appCompatEditText.setText(String.valueOf(c));
                }
                linearLayout.addView(appCompatEditText);
                final AlertDialog create = new AlertDialog.Builder(contextThemeWrapper).setTitle(R.string.fuel_widget_capacity_title).setView(linearLayout).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.fuel_widget_save, (DialogInterface.OnClickListener) null).create();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: t1.b
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        AlertDialog alertDialog = AlertDialog.this;
                        alertDialog.getButton(-1).setOnClickListener(new n0(alertDialog, contextThemeWrapper, appCompatEditText));
                    }
                });
                create.show();
                return;
            case 16:
                String str18 = MainActivity.f750e1;
                new y2(m.h(new byte[]{37, 125}, new byte[]{100, 46, -87, -3, 72, 120, -64, 32}), mainActivity);
                return;
            case 17:
                String str19 = MainActivity.f750e1;
                new y2(m.h(new byte[]{-32, -75, -116}, new byte[]{-78, -26, -31, 64, -28, 12, 0, -40}), mainActivity);
                return;
            case 18:
                String str20 = MainActivity.f750e1;
                new y2(m.h(new byte[]{40, -44, 125}, new byte[]{105, -124, 16, 6, -75, 28, -7, -28}), mainActivity);
                return;
            case 19:
                String str21 = MainActivity.f750e1;
                y5.k.u(mainActivity, new Intent(mainActivity, (Class<?>) ManageAppsActivity.class), null);
                return;
            case 20:
                String str22 = MainActivity.f750e1;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) WebLauncherActivity.class).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
                return;
            case 21:
                String str23 = MainActivity.f750e1;
                W.u(mainActivity, m0.a0.class, null);
                return;
            case 22:
                String str24 = MainActivity.f750e1;
                W.u(mainActivity, m0.y1.class, null);
                return;
            case 23:
                String str25 = MainActivity.f750e1;
                W.u(mainActivity, m0.e0.class, null);
                return;
            case 24:
                String str26 = MainActivity.f750e1;
                W.u(mainActivity, m0.z0.class, null);
                return;
            case 25:
                String str27 = MainActivity.f750e1;
                r0.e eVar = new r0.e(mainActivity);
                g gVar = new g(4);
                if (h0.b.o().loadInt(r0.e.c, 8) == 8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                d6.d dVar = eVar.f5347b;
                dVar.f1842a = z9;
                j0.e[] eVarArr2 = (j0.e[]) dVar.f1843b;
                for (int i16 = 0; i16 < 8; i16++) {
                    eVarArr2[i16] = j0.f.e(mainActivity, r0.e.d + i16);
                }
                final ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(mainActivity, R.style.Theme_JCarTools_Uni);
                View inflate = LayoutInflater.from(contextThemeWrapper2).inflate(R.layout.dialog_multi_button_settings, (ViewGroup) null);
                SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.multiSettingsEight);
                switchCompat.setChecked(dVar.f1842a);
                final GridLayout gridLayout = (GridLayout) inflate.findViewById(R.id.multiSettingsGrid);
                final int round2 = Math.round(contextThemeWrapper2.getResources().getDisplayMetrics().density * 12.0f);
                Spinner[] spinnerArr = new Spinner[8];
                ArrayList e = new j0.c(mainActivity).e();
                int i17 = 0;
                for (int i18 = 8; i17 < i18; i18 = 8) {
                    LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper2);
                    linearLayout2.setOrientation(i13);
                    linearLayout2.setPadding(round2, round2, round2, round2);
                    linearLayout2.setBackgroundResource(R.drawable.modern_panel);
                    TextView textView2 = new TextView(contextThemeWrapper2);
                    byte[] bArr = new byte[i14];
                    // fill-array-data instruction
                    bArr[0] = 113;
                    bArr[1] = -43;
                    bArr[2] = 3;
                    byte[] bArr2 = new byte[i18];
                    // fill-array-data instruction
                    bArr2[0] = -109;
                    bArr2[1] = 83;
                    bArr2[2] = -110;
                    bArr2[3] = -82;
                    bArr2[4] = 73;
                    bArr2[5] = -94;
                    bArr2[6] = -76;
                    bArr2[7] = -83;
                    String h2 = m.h(bArr, bArr2);
                    byte[] bArr3 = new byte[i18];
                    // fill-array-data instruction
                    bArr3[0] = 50;
                    bArr3[1] = -39;
                    bArr3[2] = -24;
                    bArr3[3] = -49;
                    bArr3[4] = -122;
                    bArr3[5] = -26;
                    bArr3[6] = 49;
                    bArr3[7] = 48;
                    String h10 = m.h(new byte[]{-48, 95, 123}, bArr3);
                    byte[] bArr4 = new byte[i18];
                    // fill-array-data instruction
                    bArr4[0] = -115;
                    bArr4[1] = -42;
                    bArr4[2] = -28;
                    bArr4[3] = 88;
                    bArr4[4] = 58;
                    bArr4[5] = 29;
                    bArr4[6] = 59;
                    bArr4[7] = -123;
                    String h11 = m.h(new byte[]{111, 80, 116}, bArr4);
                    byte[] bArr5 = new byte[i18];
                    // fill-array-data instruction
                    bArr5[0] = 30;
                    bArr5[1] = -116;
                    bArr5[2] = -103;
                    bArr5[3] = -126;
                    bArr5[4] = 21;
                    bArr5[5] = 46;
                    bArr5[6] = 45;
                    bArr5[7] = -64;
                    String h12 = m.h(new byte[]{-4, 10, 11}, bArr5);
                    byte[] bArr6 = new byte[i18];
                    // fill-array-data instruction
                    bArr6[0] = 41;
                    bArr6[1] = -126;
                    bArr6[2] = -96;
                    bArr6[3] = -97;
                    bArr6[4] = -98;
                    bArr6[5] = 94;
                    bArr6[6] = 90;
                    bArr6[7] = -72;
                    String h13 = m.h(new byte[]{-53, 4, 54}, bArr6);
                    byte[] bArr7 = new byte[i18];
                    // fill-array-data instruction
                    bArr7[0] = 108;
                    bArr7[1] = -37;
                    bArr7[2] = 81;
                    bArr7[3] = 74;
                    bArr7[4] = -119;
                    bArr7[5] = -43;
                    bArr7[6] = 81;
                    bArr7[7] = 91;
                    String h14 = m.h(new byte[]{-114, 93, -58}, bArr7);
                    byte[] bArr8 = new byte[i18];
                    // fill-array-data instruction
                    bArr8[0] = -91;
                    bArr8[1] = -101;
                    bArr8[2] = 100;
                    bArr8[3] = -61;
                    bArr8[4] = -27;
                    bArr8[5] = 113;
                    bArr8[6] = 25;
                    bArr8[7] = -42;
                    String h15 = m.h(new byte[]{71, 29, -3}, bArr8);
                    byte[] bArr9 = new byte[i18];
                    // fill-array-data instruction
                    bArr9[0] = -58;
                    bArr9[1] = 16;
                    bArr9[2] = 91;
                    bArr9[3] = Byte.MIN_VALUE;
                    bArr9[4] = 117;
                    bArr9[5] = 116;
                    bArr9[6] = -71;
                    bArr9[7] = 42;
                    String[] strArr = {h2, h10, h11, h12, h13, h14, h15, m.h(new byte[]{36, -106, -61}, bArr9)};
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr[i17]);
                    sb.append("  ");
                    switch (i17) {
                        case 0:
                            string = mainActivity.getResources().getString(R.string.vverhB);
                            break;
                        case 1:
                            string = mainActivity.getResources().getString(R.string.nijB);
                            break;
                        case 2:
                            string = mainActivity.getResources().getString(R.string.leftB);
                            break;
                        case 3:
                            string = mainActivity.getResources().getString(R.string.rightB);
                            break;
                        case 4:
                            string = mainActivity.getResources().getString(R.string.vverhleftB);
                            break;
                        case 5:
                            string = mainActivity.getResources().getString(R.string.vverhrightB);
                            break;
                        case 6:
                            string = mainActivity.getResources().getString(R.string.nijleftB);
                            break;
                        case 7:
                            string = mainActivity.getResources().getString(R.string.nijrightB);
                            break;
                        default:
                            string = "";
                            break;
                    }
                    sb.append(string);
                    textView2.setText(sb.toString());
                    textView2.setTextSize(2, 15.0f);
                    textView2.setTextColor(contextThemeWrapper2.getColor(R.color.modern_text_secondary));
                    textView2.setTypeface(null, 1);
                    textView2.setPadding(0, 0, 0, round2);
                    linearLayout2.addView(textView2);
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(contextThemeWrapper2, 0);
                    appCompatSpinner.setBackgroundResource(R.drawable.modern_field);
                    appCompatSpinner.setAdapter((SpinnerAdapter) new j0.b(appCompatSpinner.getContext(), (List) e));
                    j0.e eVar2 = eVarArr2[i17];
                    if (eVar2 != null) {
                        int i19 = 0;
                        while (i19 < e.size()) {
                            j0.e eVar3 = (j0.e) e.get(i19);
                            eVarArr = eVarArr2;
                            j0.d dVar2 = eVar3.f3094a;
                            arrayList = e;
                            if (dVar2 == eVar2.f3094a) {
                                if (dVar2 == j0.d.f3092b) {
                                    i10 = i19;
                                    if (eVar3.f3095b == eVar2.f3095b) {
                                        i11 = i10;
                                        appCompatSpinner.setSelection(i11);
                                        linearLayout2.addView(appCompatSpinner, new LinearLayout.LayoutParams(-1, -2));
                                        gridLayout.addView(linearLayout2);
                                        spinnerArr[i17] = appCompatSpinner;
                                        i17++;
                                        eVarArr2 = eVarArr;
                                        e = arrayList;
                                        i13 = 1;
                                        i14 = 3;
                                    }
                                } else {
                                    i10 = i19;
                                }
                                if (dVar2 == j0.d.c) {
                                    if (Objects.equals(eVar3.c, eVar2.c)) {
                                        i11 = i10;
                                        appCompatSpinner.setSelection(i11);
                                        linearLayout2.addView(appCompatSpinner, new LinearLayout.LayoutParams(-1, -2));
                                        gridLayout.addView(linearLayout2);
                                        spinnerArr[i17] = appCompatSpinner;
                                        i17++;
                                        eVarArr2 = eVarArr;
                                        e = arrayList;
                                        i13 = 1;
                                        i14 = 3;
                                    }
                                }
                                if (eVar3.f3094a == j0.d.d) {
                                    if (Objects.equals(eVar3.c, eVar2.c) && Objects.equals(eVar3.d, eVar2.d) && eVar3.f3097g == eVar2.f3097g && eVar3.f3098h == eVar2.f3098h) {
                                        i11 = i10;
                                        appCompatSpinner.setSelection(i11);
                                        linearLayout2.addView(appCompatSpinner, new LinearLayout.LayoutParams(-1, -2));
                                        gridLayout.addView(linearLayout2);
                                        spinnerArr[i17] = appCompatSpinner;
                                        i17++;
                                        eVarArr2 = eVarArr;
                                        e = arrayList;
                                        i13 = 1;
                                        i14 = 3;
                                    }
                                }
                                if (eVar3.f3094a == j0.d.e && Objects.equals(eVar3.e, eVar2.e)) {
                                    i11 = i10;
                                    appCompatSpinner.setSelection(i11);
                                    linearLayout2.addView(appCompatSpinner, new LinearLayout.LayoutParams(-1, -2));
                                    gridLayout.addView(linearLayout2);
                                    spinnerArr[i17] = appCompatSpinner;
                                    i17++;
                                    eVarArr2 = eVarArr;
                                    e = arrayList;
                                    i13 = 1;
                                    i14 = 3;
                                }
                            } else {
                                i10 = i19;
                            }
                            i19 = i10 + 1;
                            eVarArr2 = eVarArr;
                            e = arrayList;
                        }
                    }
                    eVarArr = eVarArr2;
                    arrayList = e;
                    i11 = 0;
                    appCompatSpinner.setSelection(i11);
                    linearLayout2.addView(appCompatSpinner, new LinearLayout.LayoutParams(-1, -2));
                    gridLayout.addView(linearLayout2);
                    spinnerArr[i17] = appCompatSpinner;
                    i17++;
                    eVarArr2 = eVarArr;
                    e = arrayList;
                    i13 = 1;
                    i14 = 3;
                }
                gridLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: r0.b
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                        int i28;
                        int i29 = i22 - i20;
                        if (i29 > 0) {
                            int i30 = i26 - i24;
                            GridLayout gridLayout2 = gridLayout;
                            if (i29 != i30 || gridLayout2.getChildAt(0).getLayoutParams().width <= 0) {
                                if (i29 >= Math.round(contextThemeWrapper2.getResources().getDisplayMetrics().density * 640.0f)) {
                                    i28 = 2;
                                } else {
                                    i28 = 1;
                                }
                                gridLayout2.setColumnCount(i28);
                                for (int i31 = 0; i31 < gridLayout2.getChildCount(); i31++) {
                                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                                    layoutParams.rowSpec = GridLayout.spec(i31 / i28);
                                    int i32 = i31 % i28;
                                    layoutParams.columnSpec = GridLayout.spec(i32);
                                    int i33 = i28 - 1;
                                    int i34 = round2;
                                    layoutParams.width = (i29 - (i33 * i34)) / i28;
                                    layoutParams.height = -2;
                                    layoutParams.bottomMargin = i34;
                                    if (i32 == i33) {
                                        i34 = 0;
                                    }
                                    layoutParams.setMarginEnd(i34);
                                    gridLayout2.getChildAt(i31).setLayoutParams(layoutParams);
                                }
                            }
                        }
                    }
                });
                android.app.AlertDialog create2 = new AlertDialog.Builder(contextThemeWrapper2, R.style.Theme_JCarTools_Uni_FrameworkAlert).setView(inflate).create();
                inflate.findViewById(R.id.multiSettingsSave).setOnClickListener(new r0.c(eVar, switchCompat, spinnerArr, gVar, create2));
                inflate.findViewById(R.id.multiSettingsCancel).setOnClickListener(new r0.d(create2, 0));
                create2.show();
                if (create2.getWindow() != null) {
                    create2.getWindow().setLayout(Math.min(contextThemeWrapper2.getResources().getDisplayMetrics().widthPixels - (round2 * 2), Math.round(contextThemeWrapper2.getResources().getDisplayMetrics().density * 960.0f)), -2);
                    return;
                }
                return;
            case 26:
                mainActivity.d++;
                Handler handler = mainActivity.e;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new m0(mainActivity, 17), 1000L);
                if (mainActivity.d >= 10) {
                    mainActivity.d = 0;
                    y5.k.u(mainActivity, new Intent(mainActivity.getApplicationContext(), (Class<?>) TestSpaceActivity.class).addFlags(268435456), null);
                    return;
                }
                return;
            case 27:
                String str28 = MainActivity.f750e1;
                new y2(MainActivity.f755k1[h0.b.o().loadInt(m.h(new byte[]{24, -50, 0, 119, 15, -5, 42, 26, 53}, new byte[]{65, -125, 97, 7, 124, -73, 67, 105}), 0)], mainActivity);
                return;
            case 28:
                if (mainActivity.w.isEmpty()) {
                    y5.k.x(mainActivity, mainActivity.getText(R.string.select_application));
                    return;
                } else {
                    h0.b.a();
                    h0.b.c().OpenProPri();
                    return;
                }
            default:
                if (mainActivity.w.isEmpty()) {
                    y5.k.x(mainActivity, mainActivity.getText(R.string.select_application));
                    return;
                } else {
                    h0.b.a();
                    h0.b.c().OpenProGu();
                    return;
                }
        }
    }
}
