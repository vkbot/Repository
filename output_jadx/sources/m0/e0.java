package m0;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e0 extends l0.b {
    public static final String A;
    public static final String B;

    /* renamed from: b, reason: collision with root package name */
    public View f3652b;
    public Spinner c;
    public Spinner d;
    public ImageView e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3653f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3654g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f3655h;

    /* renamed from: i, reason: collision with root package name */
    public Button f3656i;

    /* renamed from: j, reason: collision with root package name */
    public Button f3657j;

    /* renamed from: k, reason: collision with root package name */
    public TabLayout f3658k;

    /* renamed from: l, reason: collision with root package name */
    public RecyclerView f3659l;

    /* renamed from: m, reason: collision with root package name */
    public q1 f3660m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3661n;

    /* renamed from: p, reason: collision with root package name */
    public c0 f3663p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f3664q;
    public int r;

    /* renamed from: x, reason: collision with root package name */
    public long f3668x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3669y;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f3662o = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public int f3665s = -1;
    public String t = "";

    /* renamed from: u, reason: collision with root package name */
    public String f3666u = "";

    /* renamed from: v, reason: collision with root package name */
    public String f3667v = "";
    public String w = "";

    /* renamed from: z, reason: collision with root package name */
    public d0 f3670z = d0.f3642h;

    static {
        e0.m.h(new byte[]{48, -85, 70, 11, 115, 24, -91, -84, 10, -93, 66, 19, 110, 5, -81, -75, 57, -116, 72, 31, 105, 24, -93, -70, 10, -78, 78, 14, 111, 9, -65, -89}, new byte[]{85, -45, 42, 106, 29, 108, -52, -44});
        e0.m.h(new byte[]{123, 40, -53, -86, -52, 79, 121, -39, 65, 32, -49, -78, -47, 82, 115, -64, 114, 15, -59, -66, -42, 79, ByteCompanionObject.MAX_VALUE, -49, 65, 35, -58, -89, -42}, new byte[]{30, 80, -89, -53, -94, 59, 16, -95});
        e0.m.h(new byte[]{-74, 39, 59, 86, 116, 84, -67, 109, -116, 47, 63, 78, 105, 73, -73, 116, -65, 0, 53, 66, 110, 84, -69, 123, -116, 60, 56, 90, 119, 65, -70, 113, -96}, new byte[]{-45, 95, 87, 55, 26, 32, -44, 21});
        e0.m.h(new byte[]{-49, -89, 68, -97, 93, -107, -80, -90, -11, -82, 90, -122, 93, -66, -69, -85, -34, -85, 71, -112, 108, ByteCompanionObject.MIN_VALUE, -67, -70, -40, -70, 91, -115}, new byte[]{-86, -33, 40, -2, 51, -31, -39, -34});
        e0.m.h(new byte[]{-109, 100, -102, -29, -10, 8, -54, -37, -87, 109, -124, -6, -10, 35, -63, -42, -126, 104, -103, -20, -57, 31, -52, -50, -101, 125, -104, -26, -21}, new byte[]{-10, 28, -10, -126, -104, 124, -93, -93});
        A = e0.m.h(new byte[]{58, -91, 13, 4, -95, -125, -20, 63, 54, -71, 69, 6, -79, -54, -68, 103, 96}, new byte[]{89, -51, 104, 118, -40, -82, -115, 86});
        e0.m.h(new byte[]{-88, 14, 49, 120, 100, -37, -110, -58, -92, 18, 121, 123, 111, -114, -99, -126, -69, 15, 48, 59, 46, -63}, new byte[]{-53, 102, 84, 10, 29, -10, -13, -81});
        B = e0.m.h(new byte[]{8, 77, -54, -17, -83, -50, 126, 112, 39, 71, -58, -24, -80, -62, 113, 67, 11, 64, -33, -7, -89, -39, 122, 120, 39, 81, -54, -20, -95}, new byte[]{120, 37, -77, -100, -60, -83, 31, 28});
    }

    public static boolean E(String str) {
        if (!e0.m.h(new byte[]{110, 17, -88, 11, 79, 9, -28, -106}, new byte[]{Base64.padSymbol, 69, -23, 89, 27, 64, -86, -47}).equals(str) && !e0.m.h(new byte[]{109, -1, 95, 80, -55, -39, -71, -31}, new byte[]{62, -68, 30, 30, -121, -112, -9, -90}).equals(str) && !e0.m.h(new byte[]{-73, 59, 92, -127, 98, -81, 64, -45, -70, 51}, new byte[]{-12, 116, 18, -49, 39, -20, 20, -102}).equals(str) && !e0.m.h(new byte[]{-34, 73, -17, -29, 106, -41, -94, 124, -45, 78, -5}, new byte[]{-102, 0, -68, -96, 37, -127, -25, 46}).equals(str) && !e0.m.h(new byte[]{98, -96, -98, 99, -19, 68, 43, 53, 120, -96, -112, 117, -24, 75, 44, 49, 102, -70, -106, 110, -17, 94}, new byte[]{39, -18, -33, 33, -95, 13, 101, 114}).equals(str) && !e0.m.h(new byte[]{-73, -79, 101, 65, 107, -75, 40, -81, -94, -71, 98, 81, 125, -67, Base64.padSymbol, -79, -83, -75}, new byte[]{-32, -16, 44, 21, 34, -5, 111, -16}).equals(str) && !e0.m.h(new byte[]{-55, 69, 108, 40, -112, -41, -82, 91, -43, 71, 98, 57, -112, -46, -77, 81, -34, 95, 121, 60, -127, -59}, new byte[]{-101, 0, Base64.padSymbol, 125, -43, -124, -6, 18}).equals(str) && !e0.m.h(new byte[]{98, 89, -38, 20, 62, -83, -42, -37, 126, 91, -44, 5, 62, -88, -53, -47, 117, 67, -55, 8, 53, -70}, new byte[]{48, 28, -117, 65, 123, -2, -126, -110}).equals(str) && !e0.m.h(new byte[]{-5, -25, 49, 114, 79, 29, -117, 106, -22, -21, 49, 114, 89, 1, -119, 102, -3, -18, 43}, new byte[]{-88, -94, ByteCompanionObject.MAX_VALUE, 54, 6, 83, -52, 53}).equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u(java.lang.String r1) {
        /*
            if (r1 != 0) goto L3
            goto Ld
        L3:
            java.lang.String r1 = r1.trim()
            int r0 = r1.length()
            if (r0 != 0) goto Lf
        Ld:
            java.lang.String r1 = ""
        Lf:
            int r0 = r1.length()
            if (r0 != 0) goto L28
            r1 = 105(0x69, float:1.47E-43)
            byte[] r1 = new byte[r1]
            r1 = {x002e: FILL_ARRAY_DATA , data: [-120, 20, 81, -24, 14, 91, -120, 85, -20, 89, 49, -115, -107, 90, -75, 84, -39, 88, 13, 125, -2, 56, -38, 14, -120, 54, 81, -29, -2, 49, -37, 56, -120, 49, 80, -33, -1, 6, 43, 85, -30, 89, 63, -115, -110, 90, -69, 85, -27, 89, 53, -116, -83, -92, 43, 85, -57, 88, 1, -115, -112, 91, -113, 85, -32, 89, 58, -116, -94, -86, -37, 56, -120, 60, -95, -115, -111, 90, -66, 84, -40, 89, 52, -115, -102, 90, -69, 85, -29, -87, 81, -30, -1, 10, -37, 61, -119, 14, 81, -27, -2, 55, -38, 6, 118} // fill-array
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [88, -119, -127, 93, 46, -118, 11, -123} // fill-array
            java.lang.String r1 = e0.m.h(r1, r0)
            return r1
        L28:
            java.lang.String r1 = x(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e0.u(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r4.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String x(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 2430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e0.x(java.lang.String):java.lang.String");
    }

    public final void A(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.m.h(new byte[]{115, -82, 5, -29, 45, 126}, new byte[]{7, -49, 119, -124, 72, 10, -9, 63}), e0.m.h(new byte[]{112, -55, -7, 54, 40, -106, 11, 36, 74, -63, -3, 46, 53, -117, 1, Base64.padSymbol, 121, -18, -9, 34, 50, -106, 13, 50}, new byte[]{21, -79, -107, 87, 70, -30, 98, 92}));
            jSONObject.put(e0.m.h(new byte[]{-101, 5, -55}, new byte[]{-8, 104, -83, 11, 110, 120, -76, 9}), str);
            jSONObject.put(e0.m.h(new byte[]{-39, 116, -63, 86, 4, -62, -61, -97}, new byte[]{-87, 6, -82, 34, 107, -95, -84, -13}), this.f3670z.c);
            h0.b.a().j().tx(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final boolean B(String str, boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.m.h(new byte[]{115, -47, 77, 80, 112, 92}, new byte[]{7, -80, 63, 55, 21, 40, -91, 12}), e0.m.h(new byte[]{31, -7, -109, -43, -102, 49, 103, 93, 37, -15, -105, -51, -121, 44, 109, 68, 22, -34, -99, -63, ByteCompanionObject.MIN_VALUE, 49, 97, 75}, new byte[]{122, -127, -1, -76, -12, 69, 14, 37}));
            jSONObject.put(e0.m.h(new byte[]{39, 36, -126}, new byte[]{68, 73, -26, -101, 9, -42, 48, 21}), str);
            jSONObject.put(e0.m.h(new byte[]{-97, 111, -37, -84, -110, 71, 99, -60}, new byte[]{-17, 29, -76, -40, -3, 36, 12, -88}), this.f3670z.c);
            if (z9) {
                jSONObject.put(e0.m.h(new byte[]{52, -64, 88, -71, -41, 67, -88, -77, 60}, new byte[]{82, -81, 42, -38, -78, 16, -53, -46}), true);
            }
            JSONObject tx = h0.b.a().j().tx(jSONObject);
            if (tx == null) {
                this.f3669y = false;
                C(e0.m.h(new byte[]{-34, 52, 8, 16, 82, -124, -71, -62, -34, 20, 8, 21, -94, -22, -44, -83, -69, -114, 9, 44, 82, -124, -71, -62, -33, 46, 9, 34, 82, -116, -71, -56, -34, 19, 9, 38}, new byte[]{14, -82, -40, -83, -126, 58, 105, 125}), e0.m.h(new byte[]{-106, 18, -65, 53, 53, 106, 26, -25, -106, 53, -66, 14, 52, 88, -21, -77, -5, 93, -37, -107, 53, 102, 27, -42, -105, 13, -66, 8, 52, 87, 27, -40, 102, 93, -48, 100, 103, 4, 121, -77, -13, 92, -20, -101}, new byte[]{70, -115, 110, -75, -27, -44, -53, 99}), v());
                return false;
            }
            JSONObject optJSONObject = tx.optJSONObject(e0.m.h(new byte[]{-16, 19, 76, -77, -43, -123}, new byte[]{-108, 118, 58, -38, -74, -32, -92, -43}));
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(e0.m.h(new byte[]{66, 92, 1, -113, -83, -94, -50}, new byte[]{35, 56, 101, -3, -56, -47, -67, 98}), "");
                String optString2 = optJSONObject.optString(e0.m.h(new byte[]{39, -71, -20, 116}, new byte[]{84, -40, ByteCompanionObject.MIN_VALUE, 0, -125, -115, -48, -89}), "");
                if (optString.length() > 0) {
                    this.t = optString;
                }
                if (optString2.length() > 0) {
                    this.f3666u = optString2;
                }
            }
            G(tx);
            return E(tx.optString(e0.m.h(new byte[]{117, 65, -60, -26, 66}, new byte[]{6, 53, -91, -110, 39, -78, -59, -18}), ""));
        } catch (Exception e) {
            this.f3669y = false;
            C(e0.m.h(new byte[]{-18, 23, 63, 27, 125, 3, 72, 94, -18, 55, 63, 30, -115, 109, 37, 49, -117, -83, 62, 39, 125, 3, 72, 94, -17, 13, 62, 41, 125, 11, 72, 84, -18, 48, 62, 45}, new byte[]{62, -115, -17, -90, -83, -67, -104, -31}), u(e.getMessage()), v());
            return false;
        }
    }

    public final void C(String str, String str2, boolean z9) {
        String h2;
        int i10;
        int i11;
        TextView textView = this.f3653f;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f3654g;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        ImageView imageView = this.e;
        int i12 = 8;
        if (imageView != null) {
            if (z9) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
        Button button = this.f3656i;
        if (button != null) {
            if (z9) {
                h2 = e0.m.h(new byte[]{-62, -45, -111, 113, -74, -66, 66, -37, -61, -3, -112, 72, -73, -115, -77, -117, -91, -94, -15, 31, -37, -47, 45, -117, -96, -94, -1}, new byte[]{18, 114, 65, -49, 102, 1, -109, 91});
            } else {
                h2 = e0.m.h(new byte[]{4, 23, -124, 118, 84, 79, -104, -110, 5, 57, -123, 79, 85, 124, 105, -62, 110, 102, -23, 24, 58, 32, -10, -62, 110, 102, -20}, new byte[]{-44, -74, 84, -56, -124, -16, 73, 18});
            }
            button.setText(h2);
            Button button2 = this.f3656i;
            if (this.f3669y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            button2.setVisibility(i10);
        }
        Button button3 = this.f3657j;
        if (button3 != null) {
            if (this.f3669y) {
                i12 = 0;
            }
            button3.setVisibility(i12);
        }
    }

    public final void D(Spinner spinner, String str, int i10) {
        int i11;
        String[] strArr = {"", e0.m.h(new byte[]{-95, -75, 24, 126, 29, -95, 0, -15, -96, -94, 16}, new byte[]{-43, -48, 117, 14, 120, -45, 97, -123}), e0.m.h(new byte[]{28, 17, -78, -104, 24, 89}, new byte[]{106, 126, -34, -19, 117, 60, 35, -89})};
        String loadString = h0.b.o().loadString(str, "");
        if (e0.m.h(new byte[]{33, 125, -111, 116, -100, -9, 47, -57, 32, 106, -103}, new byte[]{85, 24, -4, 4, -7, -123, 78, -77}).equals(loadString)) {
            i11 = 1;
        } else if (e0.m.h(new byte[]{-19, 104, -110, 69, -37, 59}, new byte[]{-101, 7, -2, 48, -74, 94, -90, 13}).equals(loadString)) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        spinner.setOnItemSelectedListener(null);
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.simple_spinner_item, new String[]{getString(com.example.navistart.R.string.exlantix_knob_unassigned), getString(i10), getString(com.example.navistart.R.string.exlantix_knob_volume)});
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(i11);
        spinner.setOnItemSelectedListener(new e0.d1(strArr, str));
    }

    public final void F() {
        c0 c0Var = this.f3663p;
        if (c0Var != null) {
            this.f3662o.removeCallbacks(c0Var);
            this.f3663p = null;
        }
    }

    public final void G(JSONObject jSONObject) {
        String optString = jSONObject.optString(e0.m.h(new byte[]{84, -88, -34, -97, -110}, new byte[]{39, -36, -65, -21, -9, 58, 63, -6}), "");
        String optString2 = jSONObject.optString(e0.m.h(new byte[]{-62, 85, 36}, new byte[]{-95, 56, 64, -49, 47, 19, 65, -95}), "");
        boolean z9 = v() || e0.m.h(new byte[]{45, -108, -120, 36, -2, -119}, new byte[]{125, -43, -63, 118, -69, -51, -14, 36}).equals(optString) || e0.m.h(new byte[]{-95, -9, 84, -1, -116, 118, 21, 56, -86}, new byte[]{-19, -66, 7, -85, -55, 56, 92, 118}).equals(optString);
        this.f3669y = E(optString);
        if (!e0.m.h(new byte[]{-125, -43, 115, 24, 123, 77, 19, -37, -106, -64}, new byte[]{-13, -76, 26, 106, 30, 41, 76, -68}).equals(optString2) && !e0.m.h(new byte[]{-78, 63, 82, -98, 91, -50, 36, 53, -99, 53, 94, -103, 70, -62, 43, 6, -78, 54, 66, -97, 87, -55, 26, 62, -89, 35}, new byte[]{-62, 87, 43, -19, 50, -83, 69, 89}).equals(optString2)) {
            if (!jSONObject.optBoolean(e0.m.h(new byte[]{-106, -4}, new byte[]{-7, -105, 44, ByteCompanionObject.MIN_VALUE, 51, 105, -43, -70}), true) && !e0.m.h(new byte[]{35, 117, 67, 48, 67, 28}, new byte[]{101, 52, 10, 124, 6, 88, 1, -106}).equals(optString)) {
                this.f3669y = false;
                C(z9 ? e0.m.h(new byte[]{-40, -36, 29, 105, 43, 48, -111, 58, -40, -4, 29, 108, -37, 95, -64, 85, -74, -106, 114, 5, 123, 95, -50, 85, -66, -106, 120, 4, 70, 95, -54}, new byte[]{8, 70, -51, -44, -5, -114, 65, -123}) : e0.m.h(new byte[]{-81, 95, -13, 62, -33, -33, -30, 34, -81, ByteCompanionObject.MAX_VALUE, -13, 59, 47, -79, -113, 77, -54, -27, -14, 2, -33, -33, -30, 34, -82, 69, -14, 12, -33, -41, -30, 40, -81, 120, -14, 8}, new byte[]{ByteCompanionObject.MAX_VALUE, -59, 35, -125, 15, 97, 50, -99}), u(jSONObject.optString(e0.m.h(new byte[]{-119, -70, 68, -92, 93, -55, -83}, new byte[]{-28, -33, 55, -41, 60, -82, -56, -103}), "")), z9);
                return;
            }
            if (e0.m.h(new byte[]{-50, -86, 19, -1, ByteCompanionObject.MIN_VALUE, 17, -21, -21}, new byte[]{-99, -2, 82, -83, -44, 88, -91, -84}).equals(optString)) {
                C(e0.m.h(new byte[]{84, 90, 12, -62, -79, -20, 113, 118, -92, 19, 93, -90, -33, -119, 31, 37, 4, 19, 83, -90, -41, -119, 21, 36, 57, 18, 100, -90, -44}, new byte[]{-124, -62, -36, 118, 97, 89, -96, -12}), e0.m.h(new byte[]{-39, 55, 10, 11, -61, -111, -125, Base64.padSymbol, -40, 34, 10, 9, -62, -88, -126, 6, 41, 116, 90, 97, -90, -6, -28, 99, -79, 117, 102, -111, -62, -85, -126, 13, -39, 26, 11, 49, -62, -91, -126, 5, -39, 16, 10, 12, -61, -110, -125, 60, 41, 117, 103, 97, -93, 10, -126, 9, -39, 24, 10, 15, -61, -107, -126, 9, -39, 21, 11, 52, Base64.padSymbol}, new byte[]{9, -91, -38, -79, 19, 42, 82, -77}), z9);
                return;
            }
            if (e0.m.h(new byte[]{-90, -98, 68, -15, -112, -79, 66, 16}, new byte[]{-11, -35, 5, -65, -34, -8, 12, 87}).equals(optString)) {
                C(e0.m.h(new byte[]{3, -97, -37, 20, -90, -113, 68, -110, -13, -42, -118, 112, -56, -22, 42, -63, 83, -42, -124, 112, -64, -22, 32, -64, 110, -41, -77, 112, -61}, new byte[]{-45, 7, 11, -96, 118, 58, -107, 16}), e0.m.h(new byte[]{23, -48, -111, 111, 108, -126, 41, 104, -25, -104, -6, 54, 1, -25, 71, 4, 120, -104, -6, 54, 4, 23, 40, 84, 22, -57, -112, 82, 108, -119, 41, 104, -25, -103, -63, -58, 109, -75, 41, 97, 23, -13, -112, 83, 109, -77, 41, 106, 23, -11, -112, 88, 108, -117, -41}, new byte[]{-57, 72, 64, -26, -68, 55, -7, -44}), z9);
                return;
            }
            if (!e0.m.h(new byte[]{108, -102, -71, 82, -31, 70, 65, -66, 97, -110}, new byte[]{47, -43, -9, 28, -92, 5, 21, -9}).equals(optString) && !e0.m.h(new byte[]{67, -72, -94, 33, -42, -73, -40, 29, 78, -65, -74}, new byte[]{7, -15, -15, 98, -103, -31, -99, 79}).equals(optString) && !e0.m.h(new byte[]{5, -121, 51, 116, 58, -124, -30, 75, 31, -121, Base64.padSymbol, 98, 63, -117, -27, 79, 1, -99, 59, 121, 56, -98}, new byte[]{64, -55, 114, 54, 118, -51, -84, 12}).equals(optString)) {
                if (e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 6, -4, 20, 28, 48, -38, 86, 106, 14, -5, 4, 10, 56, -49, 72, 101, 2}, new byte[]{40, 71, -75, 64, 85, 126, -99, 9}).equals(optString)) {
                    C(e0.m.h(new byte[]{71, -99, -82, 45, 0, -103, 29, -1, -73, -44, -1, 73, 110, -4, 115, -84, 23, -44, -15, 73, 102, -4, 121, -83, 42, -43, -58, 73, 101}, new byte[]{-105, 5, 126, -103, -48, 44, -52, 125}), e0.m.h(new byte[]{5, 36, 0, 50, 114, -8, 51, 112, -11, 98, 110, 87, 32, -99, 81, 28, 96, 99, 82, -90, 114, -9, 51, 113, 5, 12, 0, 57, 114, -13, 51, 118, -5}, new byte[]{-43, -78, -48, -122, -94, 77, -29, -52}), z9);
                    return;
                }
                if (!e0.m.h(new byte[]{6, -117, 4, 20, 42, 91, -91, -117, 26, -119, 10, 5, 42, 94, -72, -127, 17, -111, 17, 0, 59, 73}, new byte[]{84, -50, 85, 65, 111, 8, -15, -62}).equals(optString) && !e0.m.h(new byte[]{-95, 85, -15, -37, -47, -65, 111, 112, -67, 87, -1, -54, -47, -70, 114, 122, -74, 79, -30, -57, -38, -88}, new byte[]{-13, 16, -96, -114, -108, -20, 59, 57}).equals(optString) && !e0.m.h(new byte[]{7, -51, 7, 109, 87, -67, 34, 57, 22, -63, 7, 109, 65, -95, 32, 53, 1, -60, 29}, new byte[]{84, -120, 73, 41, 30, -13, 101, 102}).equals(optString)) {
                    if (e0.m.h(new byte[]{-86, 50, -24, 57, -12, -51}, new byte[]{-6, 115, -95, 107, -79, -119, 51, -96}).equals(optString)) {
                        C(e0.m.h(new byte[]{25, 54, -65, 112, 59, 31, 58, -3, 25, 22, -65, 117, -53, 112, 107, -110, 119, 124, -48, 28, 107, 112, 101, -110, ByteCompanionObject.MAX_VALUE, 124, -38, 29, 86, 112, 97}, new byte[]{-55, -84, 111, -51, -21, -95, -22, 66}), e0.m.h(new byte[]{-118, 21, 9, 50, 119, -113, -1, 74, -117, 59, 9, 58, 119, -123, -2, 119, -118, 12, 9, 57, -121, -32, -100, 27, -47, 100, 102, 92, 25, -32, -107, 26, -25, 100, 108, 92, 26, -32, -112, -28}, new byte[]{90, -76, -39, -116, -89, 48, 46, -54}), true);
                        return;
                    }
                    if (e0.m.h(new byte[]{74, 9, -47, -61, 0, -114, 120, -115, 65}, new byte[]{6, 64, -126, -105, 69, -64, 49, -61}).equals(optString)) {
                        C(e0.m.h(new byte[]{72, 110, -59, -123, 84, -22, 41, 29, 72, 78, -59, ByteCompanionObject.MIN_VALUE, -92, -124, 70, 114, 38, 36, -95, -24, 62, -124, 66, 115, 22, 37, -110, -24, 49, -124, 68, 115, 19}, new byte[]{-104, -12, 21, 56, -124, 84, -7, -94}), e0.m.h(new byte[]{-112, 115, -31, 0, -80, 63, 95, -116, -112, 83, -31, 5, 64, 81, 60, -29, -2, 56, -77, 109, -34, 81, Base64.padSymbol, -30, -53, -55, -31, 7, 64, 80, 15, -29, -16, 57, ByteCompanionObject.MIN_VALUE, 109, -34, 80, 13, -29, -11, -57}, new byte[]{64, -23, 49, -67, 96, -127, -113, 51}), true);
                        return;
                    }
                    if (e0.m.h(new byte[]{-70, 35, 87, -13, 121, 21, -21, 44, -67, 62, 65, -12}, new byte[]{-2, 106, 4, -80, 54, 91, -91, 105}).equals(optString)) {
                        C(z9 ? e0.m.h(new byte[]{118, 67, -113, -64, -43, -109, 18, 26, 118, 99, -113, -59, 37, -4, 67, 117, 24, 9, -32, -84, -123, -4, 77, 117, 16, 9, -22, -83, -72, -4, 73}, new byte[]{-90, -39, 95, 125, 5, 45, -62, -91}) : e0.m.h(new byte[]{-85, -81, 81, -78, -81, 26, -100, -95, -85, -113, 81, -73, 95, 116, -15, -50, -50, 21, 80, -114, -81, 26, -100, -95, -86, -75, 80, ByteCompanionObject.MIN_VALUE, -81, 18, -100, -85, -85, -120, 80, -124}, new byte[]{123, 53, -127, 15, ByteCompanionObject.MAX_VALUE, -92, 76, 30}), e0.m.h(new byte[]{118, 35, 28, 88, -17, -65, -32, 95, 119, 14, -20, 58, -127, -32, -114, 57, 36, 82, 121, 59, -66, -31, -65, 56, 27, 82, 124, -58, 30, -32, -113, 57, 38, 82, 114, 59, -70, -32, -120, 56, 29, 83, 64, -54, -18, -113, -32, 86, 118, 54, 28, 80, -18, -117, -31, 102, 119, 5, 28, 82, -17, -78, -31, 105, 119, 13, -20, 58, -119, -32, ByteCompanionObject.MIN_VALUE, 56, 27, 82, 114, 58, -116, -32, -114, -58}, new byte[]{-90, -126, -52, -22, 62, 48, 48, -24}), z9);
                        return;
                    }
                    if (e0.m.h(new byte[]{-112, -53, -52, -75, -56, 31}, new byte[]{-42, -118, -123, -7, -115, 91, -102, ByteCompanionObject.MIN_VALUE}).equals(optString)) {
                        this.f3669y = false;
                        C(z9 ? e0.m.h(new byte[]{18, 7, -88, 121, -70, -55, 55, 121, 18, 39, -88, 124, 74, -90, 102, 22, 124, 77, -57, 21, -22, -90, 104, 22, 116, 77, -51, 20, -41, -90, 108}, new byte[]{-62, -99, 120, -60, 106, 119, -25, -58}) : e0.m.h(new byte[]{-106, 34, 121, -68, -82, 3, 97, -108, -106, 2, 121, -71, 94, 109, 12, -5, -13, -104, 120, ByteCompanionObject.MIN_VALUE, -82, 3, 97, -108, -105, 56, 120, -114, -82, 11, 97, -98, -106, 5, 120, -118}, new byte[]{70, -72, -87, 1, 126, -67, -79, 43}), x(jSONObject.optString(e0.m.h(new byte[]{14, -109, 95, -112, -14, -69, 106}, new byte[]{99, -10, 44, -29, -109, -36, 15, -37}), "")), z9);
                        return;
                    } else if (e0.m.h(new byte[]{-107, -82, 38, -111, -68, -96, 122}, new byte[]{-58, -6, 105, -63, -20, -27, 62, 50}).equals(optString)) {
                        C(z9 ? e0.m.h(new byte[]{-16, 113, -120, 91, -11, -71, 58, -83, -16, 81, -120, 94, 5, -42, 107, -62, -98, 59, -25, 55, -91, -42, 101, -62, -106, 59, -19, 54, -104, -42, 97}, new byte[]{32, -21, 88, -26, 37, 7, -22, 18}) : e0.m.h(new byte[]{29, -89, 51, -17, -38, -19, -59, -110, 29, -121, 51, -22, 42, -125, -88, -3, 120, 29, 50, -45, -38, -19, -59, -110, 28, -67, 50, -35, -38, -27, -59, -104, 29, ByteCompanionObject.MIN_VALUE, 50, -39}, new byte[]{-51, Base64.padSymbol, -29, 82, 10, 83, 21, 45}), e0.m.h(new byte[]{69, -84, 17, -53, 68, 111, 74, -41, 68, -126, 17, -61, 68, 101, 75, -22, 69, -75, 17, -64, -76, 0, 37, -122, 20, -36, 67, -91, 36, 0, 38, -121, 43, -35, 115, -91, 47, 0, 46, -121, 40, -35, ByteCompanionObject.MAX_VALUE, 91}, new byte[]{-107, 13, -63, 117, -108, -48, -101, 87}), z9);
                        return;
                    } else {
                        C(z9 ? e0.m.h(new byte[]{9, 91, 93, 102, 125, -28, 114, -94, 9, 123, 93, 99, -115, -117, 35, -51, 103, 17, 50, 10, 45, -117, 45, -51, 111, 17, 56, 11, 16, -117, 41}, new byte[]{-39, -63, -115, -37, -83, 90, -94, 29}) : e0.m.h(new byte[]{-60, 91, -83, -13, -39, -6, -52, 29, -60, 123, -83, -10, 41, -108, -95, 114, -95, -31, -84, -49, -39, -6, -52, 29, -59, 65, -84, -63, -39, -14, -52, 23, -60, 124, -84, -59}, new byte[]{20, -63, 125, 78, 9, 68, 28, -94}), z9 ? e0.m.h(new byte[]{-56, 18, 22, -32, 56, -19, 11, -43, -55, 60, 22, -24, 56, -25, 10, -24, -56, 11, 22, -21, -56, -125, 91, -123, -90, 98, 67, -113, 104, -126, 106, -123, -91, 99, 115, -114, 85, -126, 100, 123}, new byte[]{24, -77, -58, 94, -24, 82, -38, 85}) : e0.m.h(new byte[]{-1, 13, 52, -37, -113, 126, 46, -27, -1, 40, 53, -23, -113, 125, -34, -101, -124, 64, 69, -69, -31, 24, 65, -120, -81, 65, 107, -70, -40, 25, 114, 121, -1, 42, 52, -42, -113, 118, 46, -26, -1, 42, 52, -45, -99, 115, -34, -119, -105, -80, 52, -39, -113, 114, 46, -30, -2, 30, 53, -20, -113, 112, 47, -37, -1, 37, -60, -70, -33, 24, 75, -119, -103, 64, 92, -69, -29, -24, 47, -40, -1, 46, 52, -44, -114, 72, 47, -42, -1, 38, 52, -34, -113, 117, 46, -31, -2, 31, -60, -69, -30, 24, 78, 121, -1, 42, 52, -42, -113, 118, 46, -26, -1, 42, 52, -37, -114, 77, -48}, new byte[]{47, -112, -28, 107, 95, -56, -2, 89}), z9);
                        return;
                    }
                }
                C(e0.m.h(new byte[]{-16, 28, 80, 24, 69, 41, -4, 59, 0, 85, 1, 124, 43, 76, -110, 104, -96, 85, 15, 124, 35, 76, -104, 105, -99, 84, 56, 124, 32}, new byte[]{32, -124, ByteCompanionObject.MIN_VALUE, -84, -107, -100, 45, -71}), e0.m.h(new byte[]{52, 109, 13, 95, -96, 11, 36, -4, 53, 122, 12, 103, -96, 9, 36, -4, 52, 70, -3, 63, -49, 104, 116, -103, 92, 42, 111, 62, -1, 105, 67, -103, 94, 43, 94, -63}, new byte[]{-28, -6, -35, -17, 112, -71, -12, 73}), z9);
                return;
            }
            C(e0.m.h(new byte[]{-7, -4, 54, -89, 20, -75, -11, -97, 9, -75, 103, -61, 122, -48, -101, -52, -87, -75, 105, -61, 114, -48, -111, -51, -108, -76, 94, -61, 113}, new byte[]{41, 100, -26, 19, -60, 0, 36, 29}), e0.m.h(new byte[]{-50, 54, 98, 120, -63, -8, -50, 3, -50, 18, 99, 72, -64, -53, -50, 9, -50, 28, 98, 122, -64, -51, -49, 54, 62, 121, 8, -26, -63, -10, -50, 4, -50, 23, 98, 121, -63, -10, -50, 9, -50, 21, -100}, new byte[]{30, -87, -78, -58, 17, 76, 30, -71}), z9);
            return;
        }
        this.f3669y = false;
        C(z9 ? e0.m.h(new byte[]{-70, -103, -9, -86, -44, -29, 41, -22, -70, -71, -9, -81, 36, -116, 120, -123, -44, -45, -104, -58, -124, -116, 118, -123, -36, -45, -110, -57, -71, -116, 114}, new byte[]{106, 3, 39, 23, 4, 93, -7, 85}) : e0.m.h(new byte[]{64, 51, 124, -77, -16, 97, -99, -82, 64, 19, 124, -74, 0, 15, -16, -63, 37, -119, 125, -113, -16, 97, -99, -82, 65, 41, 125, -127, -16, 105, -99, -92, 64, 20, 125, -123}, new byte[]{-112, -87, -84, 14, 32, -33, 77, 17}), z9 ? e0.m.h(new byte[]{-117, 78, -72, -78, 3, 104, -113, -107, -118, 96, -72, -70, 3, 98, -114, -88, -117, 87, -72, -71, -13, 6, -33, -59, -27, 62, -19, -35, 83, 7, -18, -59, -26, 63, -35, -36, 110, 7, -32, 59}, new byte[]{91, -17, 104, 12, -45, -41, 94, 21}) : e0.m.h(new byte[]{107, 24, -91, -111, -86, -110, 87, -124, 107, Base64.padSymbol, -92, -93, -86, -111, -89, -6, 16, 85, -44, -15, -60, -12, 56, -23, 59, 84, -6, -16, -3, -11, 11, 24, 107, 63, -91, -100, -86, -102, 87, -121, 107, 63, -91, -103, -72, -97, -89, -24, 3, -91, -91, -109, -86, -98, 87, -125, 106, 11, -92, -90, -86, -100, 86, -70, 107, 48, 85, -16, -6, -12, 50, -24, 13, 85, -51, -15, -58, 4, 86, -71, 107, 59, -91, -98, -85, -92, 86, -73, 107, 51, -91, -108, -86, -103, 87, ByteCompanionObject.MIN_VALUE, 106, 10, 85, -15, -57, -12, 55, 24, 107, 63, -91, -100, -86, -102, 87, -121, 107, 63, -91, -111, -85, -95, -87}, new byte[]{-69, -123, 117, 33, 122, 36, -121, 56}), z9);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d0 d0Var;
        boolean z9;
        View inflate = layoutInflater.inflate(com.example.navistart.R.layout.exlantix_physical_button_settings_fragment, viewGroup, false);
        this.f3652b = inflate.findViewById(com.example.navistart.R.id.physicalKnobSettings);
        this.c = (Spinner) inflate.findViewById(com.example.navistart.R.id.spinnerPhysicalKnobLeft);
        this.d = (Spinner) inflate.findViewById(com.example.navistart.R.id.spinnerPhysicalKnobRight);
        this.e = (ImageView) inflate.findViewById(com.example.navistart.R.id.imagePhysicalButtonState);
        this.f3653f = (TextView) inflate.findViewById(com.example.navistart.R.id.textPhysicalButtonPairTitle);
        this.f3654g = (TextView) inflate.findViewById(com.example.navistart.R.id.textPhysicalButtonPairStatus);
        this.f3655h = (TextView) inflate.findViewById(com.example.navistart.R.id.textLastPhysicalButtonEvent);
        this.f3656i = (Button) inflate.findViewById(com.example.navistart.R.id.btnStartPhysicalButtonPairing);
        this.f3657j = (Button) inflate.findViewById(com.example.navistart.R.id.btnStopPhysicalButtonPairing);
        this.f3658k = (TabLayout) inflate.findViewById(com.example.navistart.R.id.tabsPhysicalButtonTypes);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.example.navistart.R.id.recyclerPhysicalButtonCommands);
        this.f3659l = recyclerView;
        recyclerView.setHasFixedSize(false);
        this.f3659l.setLayoutManager(new LinearLayoutManager(requireActivity()));
        String str = A;
        if (bundle != null) {
            str = bundle.getString(B, str);
        }
        d0[] values = d0.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                d0Var = values[i10];
                if (d0Var.c.equals(str)) {
                    break;
                }
                i10++;
            } else {
                d0Var = d0.f3642h;
                break;
            }
        }
        this.f3670z = d0Var;
        this.f3658k.k();
        for (d0 d0Var2 : d0.values()) {
            d4.i i11 = this.f3658k.i();
            i11.a(d0Var2.f3644b);
            i11.f1805a = d0Var2;
            TabLayout tabLayout = this.f3658k;
            if (d0Var2 == this.f3670z) {
                z9 = true;
            } else {
                z9 = false;
            }
            tabLayout.b(i11, z9);
        }
        this.f3658k.a(new d4.m(2, this));
        w();
        final int i12 = 0;
        this.f3656i.setOnClickListener(new View.OnClickListener(this) { // from class: m0.b0
            public final /* synthetic */ e0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String trim;
                int i13 = i12;
                e0 e0Var = this.c;
                switch (i13) {
                    case 0:
                        e0Var.f3669y = true;
                        e0Var.C(e0.m.h(new byte[]{24, -108, -115, -119, 123, -11, -107, 70, -24, -35, -36, -19, 21, -112, -5, 21, 72, -35, -46, -19, 29, -112, -15, 20, 117, -36, -27, -19, 30}, new byte[]{-56, 12, 93, Base64.padSymbol, -85, 64, 68, -60}), e0.m.h(new byte[]{-106, 73, -50, -21, 63, 112, -80, -9, -105, 92, -50, -23, 62, 73, -79, -52, 102, 10, -98, -127, 90, 27, -41, -87, -2, 11, -94, 113, 62, 74, -79, -57, -106, 100, -49, -47, 62, 68, -79, -49, -106, 110, -50, -20, 63, 115, -80, -10, 102, 11, -93, -127, 95, -21, -79, -61, -106, 102, -50, -17, 63, 116, -79, -61, -106, 107, -49, -44, -63}, new byte[]{70, -37, 30, 81, -17, -53, 97, 121}), e0Var.v());
                        e0Var.B(e0.m.h(new byte[]{76, 47, 121, -35, -96, -106, 118, -9, 78, 58}, new byte[]{60, 78, 16, -81, -1, -27, 2, -106}), true);
                        e0Var.F();
                        e0Var.r = 0;
                        c0 c0Var = new c0(e0Var, 0);
                        e0Var.f3663p = c0Var;
                        e0Var.f3662o.postDelayed(c0Var, 1500L);
                        return;
                    case 1:
                        e0Var.f3669y = false;
                        e0Var.F();
                        e0Var.B(e0.m.h(new byte[]{-37, 27, 93, -48, 58, -12, -54, 92, -37}, new byte[]{-85, 122, 52, -94, 101, -121, -66, 51}), false);
                        return;
                    case 2:
                        String str2 = e0Var.f3667v;
                        if (e0Var.f3661n != null && e0Var.f3660m != null) {
                            if (str2 == null) {
                                trim = "";
                            } else {
                                trim = str2.trim();
                            }
                            if (trim.length() == 0) {
                                TextView textView = e0Var.f3655h;
                                if (textView != null) {
                                    textView.setText(e0.m.h(new byte[]{43, 105, 62, -55, -62, -83, -116, -19, 43, 76, 63, -5, -62, -82, 124, -127, 65, 36, 83, -87, -84, -53, -29, -127, 65, 37, 109, 89, -62, -90, -116, -31, -37, 36, 81, -87, -94, -53, -31, -127, 78, 36, 85, -87, -86}, new byte[]{-5, -12, -18, 121, 18, 27, 92, 81}));
                                    return;
                                }
                                return;
                            }
                            e0Var.f3661n.add(new w0.o0(trim, j0.e.c(n0.d.e, e0Var.requireActivity()), true, true));
                            e0Var.f3660m.notifyItemInserted(e0Var.f3661n.size() - 1);
                            e0Var.z();
                            RecyclerView recyclerView2 = e0Var.f3659l;
                            if (recyclerView2 != null) {
                                recyclerView2.post(new c7.e(e0Var, true, 7));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = e0.A;
                        e0Var.z();
                        if (e0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) e0Var.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 1;
        this.f3657j.setOnClickListener(new View.OnClickListener(this) { // from class: m0.b0
            public final /* synthetic */ e0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String trim;
                int i132 = i13;
                e0 e0Var = this.c;
                switch (i132) {
                    case 0:
                        e0Var.f3669y = true;
                        e0Var.C(e0.m.h(new byte[]{24, -108, -115, -119, 123, -11, -107, 70, -24, -35, -36, -19, 21, -112, -5, 21, 72, -35, -46, -19, 29, -112, -15, 20, 117, -36, -27, -19, 30}, new byte[]{-56, 12, 93, Base64.padSymbol, -85, 64, 68, -60}), e0.m.h(new byte[]{-106, 73, -50, -21, 63, 112, -80, -9, -105, 92, -50, -23, 62, 73, -79, -52, 102, 10, -98, -127, 90, 27, -41, -87, -2, 11, -94, 113, 62, 74, -79, -57, -106, 100, -49, -47, 62, 68, -79, -49, -106, 110, -50, -20, 63, 115, -80, -10, 102, 11, -93, -127, 95, -21, -79, -61, -106, 102, -50, -17, 63, 116, -79, -61, -106, 107, -49, -44, -63}, new byte[]{70, -37, 30, 81, -17, -53, 97, 121}), e0Var.v());
                        e0Var.B(e0.m.h(new byte[]{76, 47, 121, -35, -96, -106, 118, -9, 78, 58}, new byte[]{60, 78, 16, -81, -1, -27, 2, -106}), true);
                        e0Var.F();
                        e0Var.r = 0;
                        c0 c0Var = new c0(e0Var, 0);
                        e0Var.f3663p = c0Var;
                        e0Var.f3662o.postDelayed(c0Var, 1500L);
                        return;
                    case 1:
                        e0Var.f3669y = false;
                        e0Var.F();
                        e0Var.B(e0.m.h(new byte[]{-37, 27, 93, -48, 58, -12, -54, 92, -37}, new byte[]{-85, 122, 52, -94, 101, -121, -66, 51}), false);
                        return;
                    case 2:
                        String str2 = e0Var.f3667v;
                        if (e0Var.f3661n != null && e0Var.f3660m != null) {
                            if (str2 == null) {
                                trim = "";
                            } else {
                                trim = str2.trim();
                            }
                            if (trim.length() == 0) {
                                TextView textView = e0Var.f3655h;
                                if (textView != null) {
                                    textView.setText(e0.m.h(new byte[]{43, 105, 62, -55, -62, -83, -116, -19, 43, 76, 63, -5, -62, -82, 124, -127, 65, 36, 83, -87, -84, -53, -29, -127, 65, 37, 109, 89, -62, -90, -116, -31, -37, 36, 81, -87, -94, -53, -31, -127, 78, 36, 85, -87, -86}, new byte[]{-5, -12, -18, 121, 18, 27, 92, 81}));
                                    return;
                                }
                                return;
                            }
                            e0Var.f3661n.add(new w0.o0(trim, j0.e.c(n0.d.e, e0Var.requireActivity()), true, true));
                            e0Var.f3660m.notifyItemInserted(e0Var.f3661n.size() - 1);
                            e0Var.z();
                            RecyclerView recyclerView2 = e0Var.f3659l;
                            if (recyclerView2 != null) {
                                recyclerView2.post(new c7.e(e0Var, true, 7));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = e0.A;
                        e0Var.z();
                        if (e0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) e0Var.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 2;
        inflate.findViewById(com.example.navistart.R.id.btnUseLastPhysicalButton).setOnClickListener(new View.OnClickListener(this) { // from class: m0.b0
            public final /* synthetic */ e0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String trim;
                int i132 = i14;
                e0 e0Var = this.c;
                switch (i132) {
                    case 0:
                        e0Var.f3669y = true;
                        e0Var.C(e0.m.h(new byte[]{24, -108, -115, -119, 123, -11, -107, 70, -24, -35, -36, -19, 21, -112, -5, 21, 72, -35, -46, -19, 29, -112, -15, 20, 117, -36, -27, -19, 30}, new byte[]{-56, 12, 93, Base64.padSymbol, -85, 64, 68, -60}), e0.m.h(new byte[]{-106, 73, -50, -21, 63, 112, -80, -9, -105, 92, -50, -23, 62, 73, -79, -52, 102, 10, -98, -127, 90, 27, -41, -87, -2, 11, -94, 113, 62, 74, -79, -57, -106, 100, -49, -47, 62, 68, -79, -49, -106, 110, -50, -20, 63, 115, -80, -10, 102, 11, -93, -127, 95, -21, -79, -61, -106, 102, -50, -17, 63, 116, -79, -61, -106, 107, -49, -44, -63}, new byte[]{70, -37, 30, 81, -17, -53, 97, 121}), e0Var.v());
                        e0Var.B(e0.m.h(new byte[]{76, 47, 121, -35, -96, -106, 118, -9, 78, 58}, new byte[]{60, 78, 16, -81, -1, -27, 2, -106}), true);
                        e0Var.F();
                        e0Var.r = 0;
                        c0 c0Var = new c0(e0Var, 0);
                        e0Var.f3663p = c0Var;
                        e0Var.f3662o.postDelayed(c0Var, 1500L);
                        return;
                    case 1:
                        e0Var.f3669y = false;
                        e0Var.F();
                        e0Var.B(e0.m.h(new byte[]{-37, 27, 93, -48, 58, -12, -54, 92, -37}, new byte[]{-85, 122, 52, -94, 101, -121, -66, 51}), false);
                        return;
                    case 2:
                        String str2 = e0Var.f3667v;
                        if (e0Var.f3661n != null && e0Var.f3660m != null) {
                            if (str2 == null) {
                                trim = "";
                            } else {
                                trim = str2.trim();
                            }
                            if (trim.length() == 0) {
                                TextView textView = e0Var.f3655h;
                                if (textView != null) {
                                    textView.setText(e0.m.h(new byte[]{43, 105, 62, -55, -62, -83, -116, -19, 43, 76, 63, -5, -62, -82, 124, -127, 65, 36, 83, -87, -84, -53, -29, -127, 65, 37, 109, 89, -62, -90, -116, -31, -37, 36, 81, -87, -94, -53, -31, -127, 78, 36, 85, -87, -86}, new byte[]{-5, -12, -18, 121, 18, 27, 92, 81}));
                                    return;
                                }
                                return;
                            }
                            e0Var.f3661n.add(new w0.o0(trim, j0.e.c(n0.d.e, e0Var.requireActivity()), true, true));
                            e0Var.f3660m.notifyItemInserted(e0Var.f3661n.size() - 1);
                            e0Var.z();
                            RecyclerView recyclerView2 = e0Var.f3659l;
                            if (recyclerView2 != null) {
                                recyclerView2.post(new c7.e(e0Var, true, 7));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = e0.A;
                        e0Var.z();
                        if (e0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) e0Var.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 3;
        inflate.findViewById(com.example.navistart.R.id.btnSavePhysicalButtonCommands).setOnClickListener(new View.OnClickListener(this) { // from class: m0.b0
            public final /* synthetic */ e0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String trim;
                int i132 = i15;
                e0 e0Var = this.c;
                switch (i132) {
                    case 0:
                        e0Var.f3669y = true;
                        e0Var.C(e0.m.h(new byte[]{24, -108, -115, -119, 123, -11, -107, 70, -24, -35, -36, -19, 21, -112, -5, 21, 72, -35, -46, -19, 29, -112, -15, 20, 117, -36, -27, -19, 30}, new byte[]{-56, 12, 93, Base64.padSymbol, -85, 64, 68, -60}), e0.m.h(new byte[]{-106, 73, -50, -21, 63, 112, -80, -9, -105, 92, -50, -23, 62, 73, -79, -52, 102, 10, -98, -127, 90, 27, -41, -87, -2, 11, -94, 113, 62, 74, -79, -57, -106, 100, -49, -47, 62, 68, -79, -49, -106, 110, -50, -20, 63, 115, -80, -10, 102, 11, -93, -127, 95, -21, -79, -61, -106, 102, -50, -17, 63, 116, -79, -61, -106, 107, -49, -44, -63}, new byte[]{70, -37, 30, 81, -17, -53, 97, 121}), e0Var.v());
                        e0Var.B(e0.m.h(new byte[]{76, 47, 121, -35, -96, -106, 118, -9, 78, 58}, new byte[]{60, 78, 16, -81, -1, -27, 2, -106}), true);
                        e0Var.F();
                        e0Var.r = 0;
                        c0 c0Var = new c0(e0Var, 0);
                        e0Var.f3663p = c0Var;
                        e0Var.f3662o.postDelayed(c0Var, 1500L);
                        return;
                    case 1:
                        e0Var.f3669y = false;
                        e0Var.F();
                        e0Var.B(e0.m.h(new byte[]{-37, 27, 93, -48, 58, -12, -54, 92, -37}, new byte[]{-85, 122, 52, -94, 101, -121, -66, 51}), false);
                        return;
                    case 2:
                        String str2 = e0Var.f3667v;
                        if (e0Var.f3661n != null && e0Var.f3660m != null) {
                            if (str2 == null) {
                                trim = "";
                            } else {
                                trim = str2.trim();
                            }
                            if (trim.length() == 0) {
                                TextView textView = e0Var.f3655h;
                                if (textView != null) {
                                    textView.setText(e0.m.h(new byte[]{43, 105, 62, -55, -62, -83, -116, -19, 43, 76, 63, -5, -62, -82, 124, -127, 65, 36, 83, -87, -84, -53, -29, -127, 65, 37, 109, 89, -62, -90, -116, -31, -37, 36, 81, -87, -94, -53, -31, -127, 78, 36, 85, -87, -86}, new byte[]{-5, -12, -18, 121, 18, 27, 92, 81}));
                                    return;
                                }
                                return;
                            }
                            e0Var.f3661n.add(new w0.o0(trim, j0.e.c(n0.d.e, e0Var.requireActivity()), true, true));
                            e0Var.f3660m.notifyItemInserted(e0Var.f3661n.size() - 1);
                            e0Var.z();
                            RecyclerView recyclerView2 = e0Var.f3659l;
                            if (recyclerView2 != null) {
                                recyclerView2.post(new c7.e(e0Var, true, 7));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = e0.A;
                        e0Var.z();
                        if (e0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) e0Var.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        F();
        c0 c0Var = this.f3664q;
        if (c0Var != null) {
            this.f3662o.removeCallbacks(c0Var);
            this.f3664q = null;
        }
        A(e0.m.h(new byte[]{75, -14, 30, 106, -102, 52, 18, -70, 93, -15, 25, 119, -115, 25, 14, -74, 75}, new byte[]{46, -124, 123, 4, -18, 107, 103, -44}));
        this.f3659l = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString(B, this.f3670z.c);
        super.onSaveInstanceState(bundle);
    }

    public final void t(String str) {
        int i10;
        ArrayList arrayList = this.f3661n;
        if (arrayList != null && this.f3660m != null && (i10 = this.f3665s) != -1) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                ((w0.o0) this.f3661n.get(this.f3665s)).f6216a = str;
                int i11 = this.f3665s;
                this.f3665s = -1;
                this.f3660m.a(-1);
                this.f3660m.notifyItemChanged(i11);
                z();
                RecyclerView recyclerView = this.f3659l;
                if (recyclerView != null) {
                    recyclerView.post(new c7.e(this, false, 7));
                    return;
                }
                return;
            }
            this.f3665s = -1;
            this.f3660m.a(-1);
        }
    }

    public final boolean v() {
        String str = this.t;
        if (str != null && str.trim().length() != 0) {
            if (this.f3670z.f3646g) {
                String str2 = this.f3666u;
                if (str2 != null && str2.trim().length() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z9;
        int i10;
        String loadString;
        if (this.f3670z == d0.f3642h && n0.c.B.name().equals(h0.b.o().loadString(e0.m.h(new byte[]{-118, 44, -26, 78, -43, 8, -72, -3, -91, 8}, new byte[]{-55, 109, -76, 30, -89, 103, -34, -108}), ""))) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.f3652b;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z9) {
            D(this.c, e0.m.h(new byte[]{-126, -90, -21, -6, -119, 112, 23, 102, -72, -82, -17, -30, -108, 109, 29, ByteCompanionObject.MAX_VALUE, -117, -127, -20, -11, -120, 102, 33, 114, -126, -72, -13}, new byte[]{-25, -34, -121, -101, -25, 4, 126, 30}), com.example.navistart.R.string.exlantix_knob_driver_temperature);
            D(this.d, e0.m.h(new byte[]{99, 4, -8, 126, -8, -24, 22, 117, 89, 12, -4, 102, -27, -11, 28, 108, 106, 35, -1, 113, -7, -2, 32, ByteCompanionObject.MAX_VALUE, 111, 27, -4, 107}, new byte[]{6, 124, -108, 31, -106, -100, ByteCompanionObject.MAX_VALUE, 13}), com.example.navistart.R.string.exlantix_knob_passenger_temperature);
        }
        this.f3669y = false;
        this.f3665s = -1;
        this.t = h0.b.o().loadString(this.f3670z.d, "");
        if (this.f3670z.e.length() == 0) {
            loadString = "";
        } else {
            loadString = h0.b.o().loadString(this.f3670z.e, "");
        }
        this.f3666u = loadString;
        this.f3667v = "";
        this.w = "";
        this.f3668x = 0L;
        TextView textView = this.f3655h;
        if (textView != null) {
            textView.setText(e0.m.h(new byte[]{-114, 46, -118, -4, 27, -105, -98, -56, -114, 4, -118, -10, 26, -85, -97, -4, -113, 62, 122, -110, 112, -58, -13, -93, -32, 97, -27, -110, 112, -58, -2, 73, 126, 97, -25, -110, ByteCompanionObject.MAX_VALUE, -57, -52}, new byte[]{94, -79, 90, 66, -54, 22, 78, 115}));
        }
        h0.b.a();
        this.f3661n = h0.b.f().i(this.f3670z.f3645f);
        q1 q1Var = new q1(requireActivity(), this.f3661n);
        this.f3660m = q1Var;
        q1Var.c = new androidx.fragment.app.h(18, this);
        q1Var.d = new f5.j(7, this);
        this.f3659l.setAdapter(q1Var);
        A(e0.m.h(new byte[]{-86, 108, 100, 59, -35, 38, -80, -120, -83, 105, 98, 39, -64, 27, -90}, new byte[]{-49, 26, 1, 85, -87, 121, -61, -3}));
        B(e0.m.h(new byte[]{34, 86, -69, -35, -73, 67, 4, 23, 55, 67}, new byte[]{82, 55, -46, -81, -46, 39, 91, 112}), false);
        y();
        c0 c0Var = this.f3664q;
        Handler handler = this.f3662o;
        if (c0Var != null) {
            handler.removeCallbacks(c0Var);
            this.f3664q = null;
        }
        c0 c0Var2 = new c0(this, 1);
        this.f3664q = c0Var2;
        handler.postDelayed(c0Var2, 1000L);
    }

    public final void y() {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.m.h(new byte[]{-102, 67, 119, -22, -43, 57}, new byte[]{-18, 34, 5, -115, -80, 77, -125, -74}), e0.m.h(new byte[]{27, 124, 16, 117, 50, 48, 87, -4, 33, 116, 20, 109, 47, 45, 93, -27, 18, 91, 30, 97, 40, 48, 81, -22}, new byte[]{126, 4, 124, 20, 92, 68, 62, -124}));
            jSONObject.put(e0.m.h(new byte[]{-99, 45, 0}, new byte[]{-2, 64, 100, 115, -40, 58, -26, 81}), e0.m.h(new byte[]{-63, 96, 66, 14, 102, -24, -35, 38, -61, 117, 110, 29, 92, -7}, new byte[]{-83, 1, 49, 122, 57, -115, -85, 67}));
            jSONObject.put(e0.m.h(new byte[]{Base64.padSymbol, -68, 53, 93, -95, -11, -65, 57}, new byte[]{77, -50, 90, 41, -50, -106, -48, 85}), this.f3670z.c);
            JSONObject tx = h0.b.a().j().tx(jSONObject);
            if (tx != null && (optJSONObject = tx.optJSONObject(e0.m.h(new byte[]{-66, -53, -38, -88, -123}, new byte[]{-37, -67, -65, -58, -15, 88, -17, 68}))) != null) {
                String optString = optJSONObject.optString(e0.m.h(new byte[]{100, -34, 63}, new byte[]{15, -69, 70, 101, 83, -92, -38, -59}), "");
                long optLong = optJSONObject.optLong(e0.m.h(new byte[]{-91, 18, ByteCompanionObject.MIN_VALUE, -80, -40, 33, 103, -79, -117, 4, -66, -90}, new byte[]{-54, 112, -13, -43, -86, 87, 2, -43}), 0L);
                if (optString.length() != 0 && optLong > this.f3668x) {
                    this.f3667v = optString;
                    this.w = optJSONObject.optString(e0.m.h(new byte[]{-89, 26, -103, 45, 35}, new byte[]{-53, 123, -5, 72, 79, -120, 67, -63}), optString);
                    this.f3668x = optLong;
                    TextView textView = this.f3655h;
                    if (textView != null) {
                        textView.setText(e0.m.h(new byte[]{-26, -81, 24, -18, 2, 94, 76, -48, -26, -123, 24, -28, 3, 98, 77, -28, -25, -65, -24, ByteCompanionObject.MIN_VALUE, 105, 15, 33, -69, -120, -32, 119, ByteCompanionObject.MIN_VALUE, 105, 15, 44, 81, 22}, new byte[]{54, 48, -56, 80, -45, -33, -100, 107}) + this.w);
                    }
                    t(optString);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void z() {
        if (this.f3661n != null) {
            h0.b.a();
            j0.c f8 = h0.b.f();
            ArrayList arrayList = this.f3661n;
            String str = this.f3670z.f3645f;
            f8.getClass();
            j0.c.l(str, arrayList);
        }
    }
}
