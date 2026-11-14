package s1;

import android.app.AlertDialog;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.example.navistart.home.WebLauncherActivity;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5462b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ a0(q0 q0Var, int i10) {
        this.f5462b = i10;
        this.c = q0Var;
    }

    private final void a(View view) {
        final q0 q0Var = this.c;
        LinearLayout j10 = q0Var.j();
        TextView P = q0Var.P(e0.m.h(new byte[]{89, -71, -2, 86, 99, 119, -112, -86, 89, -97, -2, 80, 98, 68, -111, -106, -87, -3, -109, 56, 3, -26, -111, -105, 89, -105, -1, 104, 99, 118, -112, -89}, new byte[]{-119, 45, 46, -24, -77, -58, 64, 26}), 25, -1);
        P.setTypeface(Typeface.DEFAULT_BOLD);
        P.setMaxLines(1);
        j10.addView(P);
        j10.addView(q0Var.k(e0.m.h(new byte[]{119, 111, -110, 9, 55, 31, 113, -108, 118, 125, -109, 58, 54, 44, 113, -108, -121, 45, -16, 82, 89, ByteCompanionObject.MAX_VALUE, 35, -15, 25, 45, -15, 83, 108, 126, 24, 1, 119, 79, -109, 58, 55, 26, 113, -105, 119, 72, -110, 0, -57, 126, 25, -15, 28, 45, -5, -94, 54, 47, 113, -97, 119, 74, -109, 54, 55, 30, 113, -104, 118, ByteCompanionObject.MAX_VALUE, -109, 55, -57, 126, 27, -15, 26, 45, -3, 82, 88, 126, 27, -16, 36, -35, -109, 51, 54, 37, 112, -96, 118, ByteCompanionObject.MAX_VALUE, -110, 2, 55, 16, 113, -110, 119, 67, 99, 82, 80, 126, 17, -15, 24, 44, -64, 83, 102, 126, 27, -15, 23}, new byte[]{-89, -3, 67, -126, -25, -82, -95, 33})));
        ScrollView scrollView = new ScrollView(q0Var.getContext());
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout V = q0Var.V();
        if (x.a(q0Var.getContext()).f5640f) {
            Button R = q0Var.R(e0.m.h(new byte[]{52, 3, -92, -1, 78, ByteCompanionObject.MAX_VALUE, -39, 26, -60, 77, -53, -108, 30, 18, -79, 116, 95, 77, -54, -107, 40, 18, -68, 116, 89, 77, -52, -108, 17}, new byte[]{-28, -99, 116, 69, -98, -62, 9, -92}), false);
            R.setTextSize(16.0f);
            V.addView(R, new LinearLayout.LayoutParams(-1, q0Var.l(60)));
        }
        V.addView(q0Var.K(e0.m.h(new byte[]{90, 76, 78, -38, 80, 55, -35, 105, 90, 77, 78, -17, 80, 0, 45, 39, 24, 15, 6, -108, 20, 69, -101, 39, 31, 15, 60, -108, 43}, new byte[]{-118, -33, -98, 68, ByteCompanionObject.MIN_VALUE, -107, 13, -9})));
        LinearLayout linearLayout = new LinearLayout(q0Var.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout W = q0Var.W(-11155473, e0.m.h(new byte[]{-94, 104, -5, 40, 42}, new byte[]{-110, 93, -63, 28, 24, -93, -106, 9}), e0.m.h(new byte[]{-17, 88, 30, 16, 14, -47, ByteCompanionObject.MAX_VALUE, -42, 31, 47, 118, ByteCompanionObject.MIN_VALUE, 15, -28, 126, -19, -18, 125, 30, 16}, new byte[]{63, -1, -50, -96, -33, 80, -82, 93}), e0.m.h(new byte[]{84, 21, 97, 65, 120, 22, -13, -49, 84, 50, 96, ByteCompanionObject.MAX_VALUE, 121, 32, 3, -96, 54, 94, 48, 17, 28, 69, -97, -95, 11, -81, 96, 121, -119, 68, -95, -96, 49, 95, 10, 16, 42, 68, -86, -96, 52, 94, 63, -31, 121, 33, -13, -64, 85, 13, 96, 113}, new byte[]{-124, -113, -80, -63, -87, -107, 35, 112}), q0Var.h(m0.f5550b));
        LinearLayout W2 = q0Var.W(-17063, e0.m.h(new byte[]{18, 78, -46}, new byte[]{-16, -42, 82, -76, -24, -60, 76, -90}), e0.m.h(new byte[]{-22, 70, -73, 54, 111, 97, -113, 111, -22, 109, -73, 56}, new byte[]{58, -39, 103, -120, -65, -46, 95, -47}), e0.m.h(new byte[]{49, -17, 60, -37, 62, -11, 113, 44, 49, -8, Base64.padSymbol, -18, 62, -7, 112, 17, 48, -50, Base64.padSymbol, -18, 62, -7, -127, 67, 89, 109, Base64.padSymbol, -17, 62, -9, 112, 18, 48, -49, 60, -48, 63, -58, 113, 46, 49, -11, 60, -37, -50, -104, 32, 67, 84, -99, 85, -65, 105, -103, 17, 66, 96}, new byte[]{-31, 77, -20, 110, -18, 73, -95, -109}), q0Var.h(m0.c));
        LinearLayout W3 = q0Var.W(-5665547, e0.m.h(new byte[]{88, -87, 123}, new byte[]{-70, 48, -47, -121, -97, 3, -38, 76}), e0.m.h(new byte[]{74, -95, 7, -102, 35, -58, 92, -34, 74, -121, 6, -87}, new byte[]{-102, Base64.padSymbol, -42, 25, -13, 113, -115, 85}), e0.m.h(new byte[]{-30, 90, -123, -126, -100, -49, -46, -86, -30, 114, -123, -119, -100, -60, 46, 52, -29, 70, -124, -77, -100, -63, -46, -82, 18, 20, -19, 19, -100, -52, -45, -107, -30, 123, -123, -115, -100, -49, -46, -87, -30, 124, -124, -79, -100, -63, -46, -81, -29, 72}, new byte[]{50, -60, 85, 51, 76, 116, 2, 20}), q0Var.h(m0.d));
        LinearLayout W4 = q0Var.W(-9382222, e0.m.h(new byte[]{-12, -97, 86}, new byte[]{22, 25, -19, 65, -17, 65, 118, -66}), e0.m.h(new byte[]{44, -73, 111, 18, -41, 104, -91, -52, 44, -101, 111, 27, -42, 87, -92, -2, -36, -8, 59, 115, -71, 5, -56}, new byte[]{-4, 41, -65, -93, 7, -43, 117, 114}), e0.m.h(new byte[]{1, -111, 88, 25, -27, 97, 63, 118, 0, -123, 88, 30, -27, 106, 63, 116, 0, -118, -88, 120, -76, 2, 85, 38, 100, -42, 60, 120, -74, 3, 96, 39, 88, -41, 11, 120, -69, -14, 62, 76, 1, -74, 89, 41, -28, 80, 62, 78, 1, -69, 88, 19, -28, 81}, new byte[]{-47, 6, -120, -87, 53, -46, -18, -10}), q0Var.h(m0.f5552g));
        linearLayout.addView(W, q0Var.f());
        linearLayout.addView(W2, q0Var.f());
        linearLayout.addView(W3, q0Var.f());
        linearLayout.addView(W4, q0Var.f());
        V.addView(linearLayout, new LinearLayout.LayoutParams(-1, q0Var.l(168)));
        V.addView(q0Var.K(e0.m.h(new byte[]{-3, -110, -22, 117, -108, 88, -127, 107, -3, -104, -22, 76, 100, 16, -16, 39, -75, -40, -82, 62, -47, 16, -52, 39, -75, -40, -93}, new byte[]{45, 8, 58, -18, 68, -64, 81, -9})));
        LinearLayout linearLayout2 = new LinearLayout(q0Var.getContext());
        linearLayout2.setOrientation(0);
        LinearLayout W5 = q0Var.W(-35235, e0.m.h(new byte[]{42, -26, 90}, new byte[]{-56, ByteCompanionObject.MAX_VALUE, -14, -108, 27, 120, -65, -84}), e0.m.h(new byte[]{98, 121, -17, 49, 71, 51, -111, -98, 98, 85, -18, 15, 71, 50, -111, -110, -110, 54, -115, 95, 41, 87, -11, -16, 10, 55, -67, 95, 34, 87, -6, -15, Base64.padSymbol}, new byte[]{-78, -26, 63, -113, -105, -121, 65, 32}), e0.m.h(new byte[]{117, 29, 122, -100, 74, 51, 16, -108, 38, 110, 43, -52, 36, 91, -126, -107, 24, 110, 36, 60, 75, 10, 16, -107, 29, 111, 22, -52, 46, 91, -120, -107, 31, 111, 27, -51, 28, 91, -120, -107, 16, 111, 18}, new byte[]{-91, -65, -85, 28, -102, -117, 48, 69}), q0Var.h(m0.f5554i));
        LinearLayout W6 = q0Var.W(-11155473, e0.m.h(new byte[]{-70, -18, 51}, new byte[]{88, 115, -73, -33, 104, 110, -106, -28}), e0.m.h(new byte[]{-19, 19, 110, -112, 99, 14, -99, 3, -19, 57, 110, -98, 98, 60, -99, 7, -19, 57, 111, -86, -109, 99, -2, 81, -125, 81, 10, -11, 11, 98, -50, 81, -120, 81, 5, -12, 60}, new byte[]{Base64.padSymbol, -127, -66, 37, -77, -77, 76, -127}), e0.m.h(new byte[]{-19, -93, -60, -37, -7, 60, -2, -89, -66, -48, -107, -117, -105, 84, 108, -90, ByteCompanionObject.MIN_VALUE, -48, -102, 123, -8, 5, -2, -90, -123, -47, -88, -117, -99, 84, 102, -90, -121, -47, -91, -118, -81, 84, 102, -90, -120, -47, -84}, new byte[]{Base64.padSymbol, 1, 21, 91, 41, -124, -34, 118}), q0Var.h(m0.f5555j));
        LinearLayout W7 = q0Var.W(-35235, e0.m.h(new byte[]{45, -24, 106}, new byte[]{-49, 113, -62, -24, 113, -107, -108, 7}), e0.m.h(new byte[]{-98, -32, -39, 55, -119, 9, -6, -15, -98, -52, -40, 9, -119, 8, -6, -3, 110, -81, -74, 89, -23, 108, -85, -98, -49, -81, -71, 89, -17, 109, -110, -98, -50, -81, -71}, new byte[]{78, ByteCompanionObject.MAX_VALUE, 9, -119, 89, -67, 42, 79}), e0.m.h(new byte[]{54, 124, 105, -64, 78, -87, -17, 13, 101, 15, 56, -112, 32, -63, 125, 12, 91, 15, 55, 96, 79, -112, -17, 12, 94, 14, 5, -112, 42, -63, 119, 12, 92, 14, 8, -111, 24, -63, 119, 12, 83, 14, 1}, new byte[]{-26, -34, -72, 64, -98, 17, -49, -36}), q0Var.h(m0.f5556k));
        LinearLayout W8 = q0Var.W(-11155473, e0.m.h(new byte[]{94, 57, 26}, new byte[]{-68, -92, -98, 3, 59, -51, ByteCompanionObject.MAX_VALUE, 81}), e0.m.h(new byte[]{-58, -2, 59, -107, -8, 90, 5, 27, -58, -44, 59, -101, -7, 104, 5, 31, -58, -44, 58, -81, 8, 55, 107, 73, -90, -67, 106, -15, -87, 55, 100, 73, -96, -68, 83, -15, -88, 55, 100}, new byte[]{22, 108, -21, 32, 40, -25, -44, -103}), e0.m.h(new byte[]{59, 34, 12, 111, -32, -121, 123, -95, 104, 81, 93, 63, -114, -17, -23, -96, 86, 81, 82, -49, -31, -66, 123, -96, 83, 80, 96, 63, -124, -17, -29, -96, 81, 80, 109, 62, -74, -17, -29, -96, 94, 80, 100}, new byte[]{-21, ByteCompanionObject.MIN_VALUE, -35, -17, 48, 63, 91, 112}), q0Var.h(m0.f5557l));
        linearLayout2.addView(W5, q0Var.f());
        linearLayout2.addView(W6, q0Var.f());
        linearLayout2.addView(W7, q0Var.f());
        linearLayout2.addView(W8, q0Var.f());
        V.addView(linearLayout2, new LinearLayout.LayoutParams(-1, q0Var.l(168)));
        V.addView(q0Var.K(e0.m.h(new byte[]{54, -72, -53, -82, 42, 90, -89, 15, 54, -119, -53, -82, 42, 98, 87, 125, 114, -7, -123, -43, 91, 43, -43, 125, 69, -7, -124}, new byte[]{-26, 41, 27, 5, -6, -5, 119, -83})));
        LinearLayout a10 = q0Var.a();
        V.addView(a10, new LinearLayout.LayoutParams(-1, q0Var.l(92)));
        LinearLayout Q = q0Var.Q();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, q0Var.l(92));
        layoutParams.topMargin = q0Var.l(8);
        V.addView(Q, layoutParams);
        scrollView.addView(V, new FrameLayout.LayoutParams(-1, -2));
        j10.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Button R2 = q0Var.R(e0.m.h(new byte[]{-51, -8, -62, -102, 42, -119, -82, -19, -52, -28, -61, -88, 43, -65}, new byte[]{29, 111, 18, 42, -6, 51, ByteCompanionObject.MAX_VALUE, 109}), false);
        R2.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(q0Var.l(170), q0Var.l(52));
        layoutParams2.gravity = 5;
        layoutParams2.topMargin = q0Var.l(16);
        j10.addView(R2, layoutParams2);
        final AlertDialog create = new AlertDialog.Builder(q0Var.getContext()).setView(j10).create();
        if (V.getChildCount() > 0 && (V.getChildAt(0) instanceof Button)) {
            final int i10 = 0;
            V.getChildAt(0).setOnClickListener(new View.OnClickListener() { // from class: s1.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = i10;
                    AlertDialog alertDialog = create;
                    q0 q0Var2 = q0Var;
                    switch (i11) {
                        case 0:
                            alertDialog.dismiss();
                            y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                            q0Var2.f5588k.execute(new c0(q0Var2, 6));
                            return;
                        case 1:
                            alertDialog.dismiss();
                            q0Var2.t(true);
                            return;
                        case 2:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5550b);
                            return;
                        case 3:
                            alertDialog.dismiss();
                            q0Var2.d(m0.c);
                            return;
                        case 4:
                            alertDialog.dismiss();
                            q0Var2.d(m0.d);
                            return;
                        case 5:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5552g);
                            return;
                        case 6:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5554i);
                            return;
                        case 7:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5555j);
                            return;
                        case 8:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5556k);
                            return;
                        case 9:
                            alertDialog.dismiss();
                            q0Var2.d(m0.f5557l);
                            return;
                        default:
                            alertDialog.dismiss();
                            q0Var2.t(false);
                            return;
                    }
                }
            });
        }
        final int i11 = 2;
        W.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i12 = 3;
        W2.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i13 = 4;
        W3.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i14 = 5;
        W4.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i14;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i15 = 6;
        W5.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i15;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i16 = 7;
        W6.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i16;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i17 = 8;
        W7.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i17;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i18 = 9;
        W8.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i18;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i19 = 10;
        a10.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i19;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        final int i20 = 1;
        Q.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i20;
                AlertDialog alertDialog = create;
                q0 q0Var2 = q0Var;
                switch (i112) {
                    case 0:
                        alertDialog.dismiss();
                        y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{95, 69, -23, 96, -117, -24, -6, -63, 94, 81, -23, 102, -117, -21, -6, -49, -81, 2, -122, 1, -37, -117, -109, -111, 52, 2, -121, 0, -19, -117, -98, -111, 50, 2, -127, 1, -44, -71, -85, -25}, new byte[]{-113, -46, 57, -48, 91, 91, 43, 65}));
                        q0Var2.f5588k.execute(new c0(q0Var2, 6));
                        return;
                    case 1:
                        alertDialog.dismiss();
                        q0Var2.t(true);
                        return;
                    case 2:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5550b);
                        return;
                    case 3:
                        alertDialog.dismiss();
                        q0Var2.d(m0.c);
                        return;
                    case 4:
                        alertDialog.dismiss();
                        q0Var2.d(m0.d);
                        return;
                    case 5:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5552g);
                        return;
                    case 6:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5554i);
                        return;
                    case 7:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5555j);
                        return;
                    case 8:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5556k);
                        return;
                    case 9:
                        alertDialog.dismiss();
                        q0Var2.d(m0.f5557l);
                        return;
                    default:
                        alertDialog.dismiss();
                        q0Var2.t(false);
                        return;
                }
            }
        });
        R2.setOnClickListener(new r0.d(create, 1));
        q0Var.N(create, TypedValues.Custom.TYPE_INT);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int J;
        m0 m0Var;
        String h2;
        int i10 = this.f5462b;
        int i11 = 0;
        q0 q0Var = this.c;
        switch (i10) {
            case 0:
                q0Var.y();
                q0Var.f5595s = false;
                q0Var.f5597v = null;
                q0Var.f5596u = null;
                q0Var.f5583f.setVisibility(8);
                q0Var.A();
                q0Var.F();
                WebLauncherActivity webLauncherActivity = (WebLauncherActivity) q0Var.f5582b.c;
                webLauncherActivity.f979j = false;
                webLauncherActivity.t();
                return;
            case 1:
                n.p pVar = q0Var.f5582b;
                l0 l0Var = (l0) view;
                j0 j0Var = l0Var.f5535b;
                if (q0Var.f5595s) {
                    q0Var.f5597v = j0Var.f5511a;
                    q0Var.A();
                    return;
                }
                m0 m0Var2 = j0Var.f5512b;
                String str = j0Var.f5514g;
                if (m0Var2 == m0.f5552g) {
                    q0Var.E(true);
                    y5.k.x(q0Var.getContext(), e0.m.h(new byte[]{69, 113, 75, -81, -17, 85, 53, -78, 68, 101, 75, -87, -17, 86, 53, -68, -75, 54, 38, -49, -127, 54, 86, -29, 30, 54, 34, 63, -18, 98, 52, -116, 69, 91, 121, -97, -103}, new byte[]{-107, -26, -101, 31, 63, -26, -28, 50}));
                    return;
                }
                boolean r = q0.r(m0Var2);
                m0 m0Var3 = j0Var.f5512b;
                if (r) {
                    if (q0Var.J(m0Var3) >= 4) {
                        J = 1;
                    } else {
                        J = q0Var.J(m0Var3) + 1;
                    }
                    int w = q0.w(J);
                    switch (m0Var3.ordinal()) {
                        case 7:
                            q0Var.F = w;
                            break;
                        case 8:
                            q0Var.G = w;
                            break;
                        case 9:
                            q0Var.H = w;
                            break;
                        case 10:
                            q0Var.I = w;
                            break;
                    }
                    switch (m0Var3.ordinal()) {
                        case 7:
                            m0Var = m0.f5555j;
                            break;
                        case 8:
                            m0Var = m0.f5554i;
                            break;
                        case 9:
                            m0Var = m0.f5557l;
                            break;
                        case 10:
                            m0Var = m0.f5556k;
                            break;
                        default:
                            m0Var = m0Var3;
                            break;
                    }
                    if (J > 1) {
                        int w9 = q0.w(1);
                        switch (m0Var.ordinal()) {
                            case 7:
                                q0Var.F = w9;
                                break;
                            case 8:
                                q0Var.G = w9;
                                break;
                            case 9:
                                q0Var.H = w9;
                                break;
                            case 10:
                                q0Var.I = w9;
                                break;
                        }
                    }
                    q0Var.C();
                    q0Var.f5590m.execute(new androidx.activity.f(q0Var, m0Var3, J, 9));
                    return;
                }
                if (m0Var3 == m0.e) {
                    j0.e b10 = j0.f.b(q0Var.getContext(), str);
                    if (j0.f.d(b10)) {
                        pVar.i(b10);
                        return;
                    }
                    return;
                }
                if (m0Var3 == m0.f5551f) {
                    if (j0Var.f5516i) {
                        str = j0Var.f5515h;
                    }
                    j0.e b11 = j0.f.b(q0Var.getContext(), str);
                    if (j0.f.d(b11)) {
                        pVar.i(b11);
                        j0Var.f5516i = !j0Var.f5516i;
                        q0Var.y();
                        q0Var.T(l0Var);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (!q0Var.f5595s) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - q0Var.D > 700) {
                        q0Var.C = 0;
                    }
                    q0Var.D = elapsedRealtime;
                    int i12 = q0Var.C + 1;
                    q0Var.C = i12;
                    if (i12 >= 5) {
                        q0Var.C = 0;
                        q0Var.D = 0L;
                        q0Var.performHapticFeedback(1);
                        k kVar = ((WebLauncherActivity) q0Var.f5582b.c).d;
                        if (kVar != null) {
                            kVar.z();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                a(view);
                return;
            case 4:
                boolean z9 = q0Var.t;
                q0Var.t = !z9;
                Button button = q0Var.f5584g;
                if (!z9) {
                    h2 = e0.m.h(new byte[]{102, 89, 79, -49, 17, -121, 108, -62, 3, 23, 29, -95, -117, -122, 88}, new byte[]{-74, -58, -97, 113, 49, 86, -19, 18});
                } else {
                    h2 = e0.m.h(new byte[]{60, 81, 94, -54, -96, -55, -55, -83, 60, 78, 94, -52, -96, -54, -55, -94}, new byte[]{-20, -16, -114, 120, 112, 119, 25, 28});
                }
                button.setText(h2);
                if (q0Var.t) {
                    ArrayList arrayList = q0Var.f5594q;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        q0.O((j0) obj);
                    }
                    q0Var.s();
                }
                q0Var.y();
                return;
            case 5:
                q0Var.H(0.88f);
                return;
            case 6:
                q0Var.H(1.14f);
                return;
            case 7:
                ArrayList arrayList2 = q0Var.f5594q;
                if (q0Var.f5597v != null) {
                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                        if (q0Var.f5597v.equals(((j0) arrayList2.get(size2)).f5511a)) {
                            arrayList2.remove(size2);
                        }
                    }
                    q0Var.f5597v = null;
                    q0Var.y();
                    q0Var.A();
                    return;
                }
                return;
            default:
                String str2 = q0Var.f5596u;
                if (str2 == null) {
                    str2 = "";
                }
                q0Var.u(str2);
                q0Var.y();
                q0Var.f5595s = false;
                q0Var.f5597v = null;
                q0Var.f5596u = null;
                q0Var.f5583f.setVisibility(8);
                q0Var.A();
                q0Var.F();
                WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) q0Var.f5582b.c;
                webLauncherActivity2.f979j = false;
                webLauncherActivity2.t();
                return;
        }
    }
}
