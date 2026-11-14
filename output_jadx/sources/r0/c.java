package r0;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import b1.m;
import com.example.navistart.LounchB;
import com.example.navistart.MainActivity;
import com.google.protobuf.q;
import e0.g;
import e0.r1;
import j0.f;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.o;
import s1.r;
import t1.j;
import t1.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5343b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f5344f;

    public /* synthetic */ c(e eVar, SwitchCompat switchCompat, Spinner[] spinnerArr, g gVar, AlertDialog alertDialog) {
        this.c = eVar;
        this.d = switchCompat;
        this.e = spinnerArr;
        this.f5344f = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        j jVar;
        j jVar2;
        Object tag;
        o b10;
        int i11 = 0;
        switch (this.f5343b) {
            case 0:
                e eVar = (e) this.c;
                SwitchCompat switchCompat = (SwitchCompat) this.d;
                Spinner[] spinnerArr = (Spinner[]) this.e;
                AlertDialog alertDialog = (AlertDialog) this.f5344f;
                d6.d dVar = eVar.f5347b;
                dVar.f1842a = switchCompat.isChecked();
                j0.e[] eVarArr = (j0.e[]) dVar.f1843b;
                for (int i12 = 0; i12 < 8; i12++) {
                    eVarArr[i12] = (j0.e) spinnerArr[i12].getSelectedItem();
                }
                u0.a o5 = h0.b.o();
                String str = e.c;
                if (dVar.f1842a) {
                    i10 = 8;
                } else {
                    i10 = 6;
                }
                o5.saveInt(str, i10);
                while (i11 < 8) {
                    f.f(e.d + i11, eVarArr[i11]);
                    i11++;
                }
                String str2 = MainActivity.f750e1;
                Drawable[] a10 = e.a(eVar.f5346a);
                r5.c cVar = LounchB.f747h;
                if (cVar != null) {
                    LounchB lounchB = (LounchB) cVar.c;
                    j jVar3 = lounchB.c;
                    if (jVar3 != null) {
                        jVar3.setImageRun(a10);
                    }
                    m mVar = lounchB.d;
                    if (mVar != null && (jVar2 = (j) mVar.d) != null) {
                        jVar2.setImageRun(a10);
                    }
                    k kVar = lounchB.e;
                    if (kVar != null && (jVar = kVar.f5784b) != null) {
                        jVar.setImageRun(a10);
                    }
                }
                alertDialog.dismiss();
                return;
            default:
                s1.k kVar2 = (s1.k) this.c;
                r rVar = kVar2.f5518b;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.d;
                RadioGroup radioGroup = (RadioGroup) this.e;
                TextView textView = (TextView) this.f5344f;
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null) {
                    alertDialog2.hide();
                    View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                    if (findViewById == null) {
                        tag = null;
                    } else {
                        tag = findViewById.getTag();
                    }
                    if (tag instanceof o) {
                        b10 = (o) tag;
                    } else {
                        b10 = rVar.b();
                    }
                    r1 r1Var = new r1(kVar2, radioGroup, textView, alertDialog2);
                    kVar2.removeCallbacks(kVar2.f5520g);
                    kVar2.f5523j = true;
                    kVar2.f5525l = b10;
                    kVar2.f5524k = rVar.c();
                    kVar2.f5528o = r1Var;
                    kVar2.f5522i = false;
                    kVar2.B();
                    Button button = kVar2.f5519f;
                    button.setVisibility(0);
                    button.setContentDescription(e0.m.h(new byte[]{-103, -33, 84, -106, 75, -11, -126, -27, -104, -62, 84, -109, 75, -4, -126, -24, -104, -62, 84, -106, -70, -91, -24, ByteCompanionObject.MIN_VALUE, -12, -112, 58, -13, 37, -91, -24, -127, -54, 96, 84, -111, 74, -63, -126, -18, -103, -5, 85, -81, -70, -91, -32, -127, -62, -112, 53, -14, 26, -91, -30, ByteCompanionObject.MIN_VALUE, -12, -112, 57, -13, 36, -91, -31, ByteCompanionObject.MIN_VALUE, -9, 96, 84, -103, 75, -11, -126, -32, -104, -49}, new byte[]{73, 64, -124, 35, -102, 117, 82, 80}));
                    button.setOnTouchListener(new s1.d(kVar2, 2));
                    LinearLayout linearLayout = new LinearLayout(kVar2.getContext());
                    kVar2.f5526m = linearLayout;
                    linearLayout.setOrientation(1);
                    kVar2.f5526m.setGravity(17);
                    kVar2.f5526m.setPadding(kVar2.h(18), kVar2.h(14), kVar2.h(18), kVar2.h(14));
                    kVar2.f5526m.setBackground(kVar2.o(-233299668, 17, -11486750));
                    kVar2.f5526m.setElevation(kVar2.h(24));
                    TextView x9 = kVar2.x(16, -1, e0.m.h(new byte[]{-42, -11, -48, 77, -37, 77, -9, 13, -41, -24, -48, 72, -37, 68, -9, 0, -41, -24, -48, 77, 42, 29, -99, 104, -69, -70, -66, 40, -75, 29, -99, 105, -123, 74, -48, 74, -38, 121, -9, 6, -42, -47, -47, 116, 42, 29, -99, 105, -122, -70, -80, 41, -123}, new byte[]{6, 106, 0, -8, 10, -51, 39, -72}));
                    x9.setGravity(17);
                    kVar2.f5526m.addView(x9);
                    StringBuilder sb = new StringBuilder();
                    sb.append(e0.m.h(new byte[]{-101, -88, -113, 5, -14, -44, -22, -45, -102, -79, -113, 3, -13, -20, 0, 75}, new byte[]{75, 55, 95, -69, 34, 99, 58, 107}));
                    sb.append(kVar2.f5524k);
                    TextView x10 = kVar2.x(14, -11486750, q.i(new byte[]{-80}, new byte[]{-107, 14, -24, 102, 5, -13, 10, 4}, sb));
                    kVar2.f5527n = x10;
                    x10.setGravity(17);
                    kVar2.f5527n.setPadding(0, kVar2.h(4), 0, kVar2.h(10));
                    kVar2.f5526m.addView(kVar2.f5527n);
                    LinearLayout linearLayout2 = new LinearLayout(kVar2.getContext());
                    linearLayout2.setGravity(17);
                    Button t = kVar2.t(e0.m.h(new byte[]{68, 20, 115, -123, 43, 86, -64, -80, 68, 55, 114, -73}, new byte[]{-108, -118, -94, 7, -5, -22, 16, 5}), false);
                    t.setOnClickListener(new s1.c(kVar2, 3));
                    int i13 = 48;
                    linearLayout2.addView(t, new LinearLayout.LayoutParams(kVar2.h(140), kVar2.h(48)));
                    Button t3 = kVar2.t(e0.m.h(new byte[]{-10, -94, -80, 93, -53, 14, -28, -6, -10, -77, -80, 94, -54, 51, -28, -8, -9, -113, 64, 51, -91, 91, -117, -86, -111, -45, -40, 50, -100, 91, -115, -85, -88}, new byte[]{38, 3, 96, -29, 26, -117, 53, 122}), true);
                    t3.setOnClickListener(new s1.c(kVar2, 4));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kVar2.h(190), kVar2.h(48));
                    layoutParams.setMarginStart(kVar2.h(10));
                    linearLayout2.addView(t3, layoutParams);
                    kVar2.f5526m.addView(linearLayout2);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    if (b10 == o.d) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        i13 = 80;
                    }
                    layoutParams2.gravity = i13 | 1;
                    Insets insets = kVar2.f5521h;
                    if (i11 != 0) {
                        layoutParams2.bottomMargin = kVar2.h(18) + insets.bottom;
                    } else {
                        layoutParams2.topMargin = kVar2.h(18) + insets.top;
                    }
                    kVar2.addView(kVar2.f5526m, layoutParams2);
                    kVar2.d();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(s1.k kVar, AlertDialog[] alertDialogArr, RadioGroup radioGroup, TextView textView) {
        this.c = kVar;
        this.d = alertDialogArr;
        this.e = radioGroup;
        this.f5344f = textView;
    }
}
