package s1;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.VirtualDisplay;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import androidx.core.widget.TextViewCompat;
import com.example.navistart.home.LauncherWindowService;
import com.example.navistart.home.WebLauncherActivity;
import e0.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q0 extends FrameLayout {
    public static final String K = e0.m.h(new byte[]{-124, -111, 118, 109, 11, -10, -13, 33, -73, -98, 98, 119, 1, -24, -13, 12, -116, -107, 112, 104, 28, -15, -26, 12, -124, -111, 122, 108, 29, -22, -55, 37, -39}, new byte[]{-24, -16, 3, 3, 104, -98, -106, 83});
    public static final String L = e0.m.h(new byte[]{11, -98, 79, -83, 68, -100, 34, -117, 4, -118, 85, -89, 90, -100, 15, -72, 18, -98, 87, -88, 66, -104, 13, -126, 23, -47, 81, -76, 85}, new byte[]{101, -1, 59, -60, 50, -7, 125, -25});
    public static final String M = e0.m.h(new byte[]{7, -123, -102, -9, -13, -61, 113, 5, 52, -118, -114, -19, -7, -35, 113, 40, 28, -123, -125, -11, -32, -54, 100, 18, 25, -69, -126, -10, -12, -50, 75, 1, 90}, new byte[]{107, -28, -17, -103, -112, -85, 20, 119});
    public static final String N = e0.m.h(new byte[]{-35, 25, 124, 57, 51, -11}, new byte[]{-66, 108, 15, 77, 92, -104, 91, -127});
    public static final String O = e0.m.h(new byte[]{7, 24, -90, 73, -44, -68}, new byte[]{104, 118, -54, 32, -70, -39, -44, 31});
    public boolean A;
    public boolean B;
    public int C;
    public long D;
    public volatile boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final f0 J;

    /* renamed from: b, reason: collision with root package name */
    public final n.p f5582b;
    public final ImageView c;
    public final View d;
    public final o0 e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f5583f;

    /* renamed from: g, reason: collision with root package name */
    public final Button f5584g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f5585h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f5586i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f5587j;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f5588k;

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f5589l;

    /* renamed from: m, reason: collision with root package name */
    public final ExecutorService f5590m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5591n;

    /* renamed from: o, reason: collision with root package name */
    public long f5592o;

    /* renamed from: p, reason: collision with root package name */
    public final f0 f5593p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f5594q;
    public final Handler r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5595s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public String f5596u;

    /* renamed from: v, reason: collision with root package name */
    public String f5597v;
    public String w;

    /* renamed from: x, reason: collision with root package name */
    public int f5598x;

    /* renamed from: y, reason: collision with root package name */
    public s0.a f5599y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5600z;

    public q0(WebLauncherActivity webLauncherActivity, n.p pVar) {
        super(webLauncherActivity);
        this.f5588k = Executors.newSingleThreadExecutor();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f5589l = newSingleThreadExecutor;
        this.f5590m = Executors.newSingleThreadExecutor();
        int i10 = 1;
        this.f5591n = true;
        this.f5592o = 15000L;
        int i11 = 0;
        this.f5593p = new f0(this, i11);
        this.f5594q = new ArrayList();
        Handler handler = new Handler(Looper.getMainLooper());
        this.r = handler;
        this.t = true;
        this.w = e0.m.h(new byte[]{-19, 86, -7, 23, 102}, new byte[]{15, -42, 109, -43, -42, -51, 32, -40});
        this.F = 1;
        this.G = 1;
        this.H = 1;
        this.I = 1;
        f0 f0Var = new f0(this, i10);
        this.J = f0Var;
        this.f5582b = pVar;
        setClipToPadding(false);
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-16314343, -15984606, -15656670}));
        ImageView imageView = new ImageView(webLauncherActivity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(webLauncherActivity);
        this.d = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1929579024, -1727854064}));
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        o0 o0Var = new o0(webLauncherActivity);
        this.e = o0Var;
        o0Var.setClipChildren(true);
        o0Var.setClipToPadding(false);
        o0Var.setOnLongClickListener(new d0(this, i11));
        o0Var.setLongClickable(true);
        o0Var.setOnClickListener(new a0(this, 2));
        addView(o0Var, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(webLauncherActivity);
        this.f5583f = linearLayout;
        linearLayout.setGravity(17);
        linearLayout.setPadding(l(8), l(7), l(8), l(7));
        linearLayout.setBackground(G(-233167568, 18, -11749921));
        linearLayout.setElevation(l(30));
        Button R = R(e0.m.h(new byte[]{-17, 106, -43, 83, 67, -15, -115, -102, -48, 103, -114, -61, 67, -41, -115, -100, -47, 84, -113, -1}, new byte[]{0, -42, 94, 115, -109, 101, 93, 36}), true);
        R.setOnClickListener(new a0(this, 3));
        linearLayout.addView(R, S(142));
        Button R2 = R(e0.m.h(new byte[]{-76, 51, -3, 126, -124, -80, 6, 73, -47, 125, -81, 16, 30, -79, 50}, new byte[]{100, -84, 45, -64, -92, 97, -121, -103}), false);
        this.f5584g = R2;
        R2.setOnClickListener(new a0(this, 4));
        linearLayout.addView(R2, S(132));
        Button R3 = R(e0.m.h(new byte[]{113, -61, 103, -26, -91, -66, 93, -22, 67, -4, 37, 122, -91, -85, 92, -38}, new byte[]{-109, 75, -11, -58, 117, 30, -115, 90}), false);
        this.f5585h = R3;
        R3.setContentDescription(e0.m.h(new byte[]{-81, 24, 112, -16, -83, -86, -113, 0, -82, 55, 113, -60, -83, -89, -114, 63, -82, 55, ByteCompanionObject.MIN_VALUE, -100, -49, -50, -44, 109, -50, 106, 32, -100, -51, -49, -30, 109, -62, 106, 43, -100, -60, 63, -113, 15, -81, 3, 112, -8, -83, -87, -113, 8, -82, 57}, new byte[]{ByteCompanionObject.MAX_VALUE, -69, -96, 76, 125, 31, 95, -67}));
        R3.setEnabled(false);
        R3.setOnClickListener(new a0(this, 5));
        linearLayout.addView(R3, S(92));
        Button R4 = R(e0.m.h(new byte[]{74, -25, -17, 49, 52, 43, -2, 96, 117, -20, -76, -83, 52, 62, -1, 80}, new byte[]{-91, 91, 100, 17, -28, -117, 46, -48}), false);
        this.f5586i = R4;
        R4.setContentDescription(e0.m.h(new byte[]{-42, 29, -38, -44, 9, 91, 93, -92, -42, 6, -37, -31, 9, 86, 92, -99, -41, 50, 42, -74, 107, 63, 6, -49, -73, 111, -118, -74, 105, 62, 48, -49, -69, 111, -127, -74, 96, -50, 93, -83, -42, 6, -38, -46, 9, 88, 93, -86, -41, 60}, new byte[]{6, -66, 10, 102, -39, -18, -115, 31}));
        R4.setEnabled(false);
        R4.setOnClickListener(new a0(this, 6));
        linearLayout.addView(R4, S(92));
        Button R5 = R(e0.m.h(new byte[]{-114, 26, -93, -127, -101, -100, 30, -90, -114, 1, -94, -73, -102, -96}, new byte[]{94, -71, 115, 53, 75, 44, -50, 29}), false);
        this.f5587j = R5;
        R5.setEnabled(false);
        R5.setOnClickListener(new a0(this, 7));
        linearLayout.addView(R5, S(112));
        Button R6 = R(e0.m.h(new byte[]{-46, 96, -89, -22, 5, 118, -98, 50, -46, 67, -90, -40}, new byte[]{2, -2, 118, 104, -43, -54, 78, -121}), false);
        R6.setOnClickListener(new a0(this, 8));
        linearLayout.addView(R6, S(LocationRequestCompat.QUALITY_LOW_POWER));
        Button R7 = R(e0.m.h(new byte[]{-68, -3, 123, 124, -67, -120, 99, 32, -68, -20, 123, ByteCompanionObject.MAX_VALUE, -68, -75, 99, 34, -67, -48}, new byte[]{108, 92, -85, -62, 108, 13, -78, -96}), true);
        R7.setOnClickListener(new a0(this, i11));
        linearLayout.addView(R7, S(WebSocketProtocol.PAYLOAD_SHORT));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, l(62), 49);
        layoutParams.topMargin = l(10);
        addView(linearLayout, layoutParams);
        linearLayout.setVisibility(8);
        u(h0.b.o().loadString(e0.m.h(new byte[]{-47, -88, 109, -91, -85, 19, -123, -31, -30, -89, 121, -65, -95, 13, -123, -52, -39, -84, 107, -96, -68, 20, -112, -52, -47, -88, 97, -92, -67, 15, -65, -27, -116}, new byte[]{-67, -55, 24, -53, -56, 123, -32, -109}), ""));
        newSingleThreadExecutor.execute(new c0(this, i10));
        E(false);
        handler.postDelayed(f0Var, 1200L);
    }

    public static void O(j0 j0Var) {
        j0Var.c = g(Math.round(j0Var.c * 24.0f) / 24.0f, 0.0f, 1.0f - j0Var.e);
        j0Var.d = g(Math.round(j0Var.d * 14.0f) / 14.0f, 0.0f, 1.0f - j0Var.f5513f);
    }

    public static String b(j0.e eVar) {
        n0.d dVar;
        if (eVar.f3094a == j0.d.f3092b && (dVar = eVar.f3095b) != null) {
            int ordinal = dVar.ordinal();
            if (ordinal != 7) {
                if (ordinal != 55) {
                    if (ordinal != 74) {
                        if (ordinal != 75) {
                            if (TextUtils.isEmpty(eVar.f3099i)) {
                                return e0.m.h(new byte[]{-107, -60, -59, 90, -30, -9, -73, -56, -108, -46, -59, 93, -30, -10, -74, -4}, new byte[]{69, 80, 21, -17, 50, 78, 102, 73});
                            }
                            return eVar.f3099i;
                        }
                        return e0.m.h(new byte[]{59, 0, 86, -57, 18, -80, -110, 116, 59, 38, 87, -12}, new byte[]{-21, -100, -121, 68, -62, 7, 67, -1});
                    }
                    return e0.m.h(new byte[]{-26, 88, -39, -60, -22, 63, -46, -115, -26, 119, -39, -52, -22, 51, -46, -120}, new byte[]{54, -59, 9, 113, 58, -117, 2, Base64.padSymbol});
                }
                return e0.m.h(new byte[]{50, -110, -41, 124, 69, -43, -124, -7, 50, -121, -41, 119, 69, -41, -124, -16, 50, -118, -41, 121}, new byte[]{-30, 50, 7, -52, -107, 98, 84, 77});
            }
            return e0.m.h(new byte[]{-1, -83, -14, -37, 52, -33, 32, -13, -1, -116, -13, -19, 52, -46, 32, -11, -1, -118, -14, -44}, new byte[]{47, 50, 35, 91, -28, 103, -16, 72});
        }
        if (TextUtils.isEmpty(eVar.f3099i)) {
            return e0.m.h(new byte[]{-8, 67, -80, -67, -9, 82, 68, -60, -7, 85, -80, -70, -9, 83, 69, -16}, new byte[]{40, -41, 96, 8, 39, -21, -107, 69});
        }
        return eVar.f3099i;
    }

    public static float g(float f8, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f8));
    }

    public static float[] i(m0 m0Var) {
        if (m0Var == m0.f5553h) {
            return new float[]{0.42f, 0.48f};
        }
        if (m0Var == m0.d) {
            return new float[]{0.38f, 0.19f};
        }
        if (r(m0Var)) {
            return new float[]{0.12f, 0.15f};
        }
        if (m0Var != m0.e && m0Var != m0.f5551f && m0Var != m0.f5552g) {
            return new float[]{0.22f, 0.18f};
        }
        return new float[]{0.1f, 0.14f};
    }

    public static boolean q(m0 m0Var) {
        if (m0Var != m0.f5554i && m0Var != m0.f5556k) {
            return false;
        }
        return true;
    }

    public static boolean r(m0 m0Var) {
        if (m0Var != m0.f5554i && m0Var != m0.f5555j && m0Var != m0.f5556k && m0Var != m0.f5557l) {
            return false;
        }
        return true;
    }

    public static FrameLayout.LayoutParams v() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public static int w(int i10) {
        if (i10 < 1 || i10 > 4) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void A() {
        l0 l0Var;
        boolean z9;
        int i10;
        String h2;
        int i11;
        String h10;
        String h11;
        String h12;
        int i12;
        int l10;
        int i13;
        View childAt;
        o0 o0Var = this.e;
        ?? r32 = 1;
        for (int childCount = o0Var.getChildCount() - 1; childCount >= 0; childCount--) {
            l0 l0Var2 = (l0) o0Var.getChildAt(childCount);
            if (o(l0Var2.f5535b.f5511a) == null) {
                b bVar = l0Var2.f5536f;
                if (bVar != null) {
                    bVar.c();
                }
                o0Var.removeViewAt(childCount);
            }
        }
        ArrayList arrayList = this.f5594q;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            j0 j0Var = (j0) obj;
            String str = j0Var.f5511a;
            int i15 = 0;
            while (true) {
                if (i15 < o0Var.getChildCount()) {
                    View childAt2 = o0Var.getChildAt(i15);
                    if (childAt2 instanceof l0) {
                        l0Var = (l0) childAt2;
                        if (l0Var.f5535b.f5511a.equals(str)) {
                            break;
                        }
                    }
                    i15++;
                } else {
                    l0Var = 0;
                    break;
                }
            }
            if (l0Var == 0) {
                l0Var = new l0(getContext());
                l0Var.f5535b = j0Var;
                l0Var.setTag(j0Var);
                l0Var.setClipToOutline(r32);
                j0 j0Var2 = l0Var.f5535b;
                m0 m0Var = j0Var2.f5512b;
                String str2 = j0Var2.f5514g;
                if (m0Var == m0.f5550b) {
                    LinearLayout V = V();
                    V.setGravity(16);
                    V.setPadding(l(16), l(10), l(16), l(10));
                    Context b10 = e0.g0.b(getContext());
                    TextClock textClock = new TextClock(b10);
                    textClock.setFormat24Hour(e0.m.h(new byte[]{30, -66, -62, 126, -32}, new byte[]{86, -10, -8, 19, -115, -91, -54, -89}));
                    textClock.setFormat12Hour(e0.m.h(new byte[]{50, 44, 71, -90, -15}, new byte[]{122, 100, 125, -53, -100, 23, 122, -11}));
                    textClock.setTextSize(48.0f);
                    textClock.setTextColor(-1);
                    textClock.setTypeface(Typeface.DEFAULT_BOLD);
                    textClock.setMaxLines(r32);
                    textClock.setIncludeFontPadding(false);
                    TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textClock, 18, 48, 2, 2);
                    V.addView(textClock);
                    n0 n0Var = new n0(b10);
                    n0Var.setTextSize(17.0f);
                    n0Var.setTextColor(-6310972);
                    n0Var.setMaxLines(r32);
                    n0Var.setEllipsize(TextUtils.TruncateAt.END);
                    n0Var.setIncludeFontPadding(false);
                    V.addView(n0Var);
                    l0Var.addView(V, v());
                } else if (m0Var == m0.c) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    if (getResources().getConfiguration().screenWidthDp < getResources().getConfiguration().screenHeightDp) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    linearLayout.setOrientation(i12);
                    linearLayout.setGravity(17);
                    linearLayout.setPadding(l(12), l(10), l(12), l(10));
                    ImageView imageView = new ImageView(getContext());
                    l0Var.f5538h = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    linearLayout.addView(imageView, new LinearLayout.LayoutParams(l(56), l(56)));
                    LinearLayout V2 = V();
                    V2.setGravity(17);
                    if (i12 != 0) {
                        l10 = 0;
                    } else {
                        l10 = l(9);
                    }
                    if (i12 != 0) {
                        i13 = l(4);
                    } else {
                        i13 = 0;
                    }
                    V2.setPadding(l10, i13, 0, 0);
                    TextView P = P(this.w, 35, -1);
                    l0Var.f5539i = P;
                    P.setTypeface(Typeface.DEFAULT_BOLD);
                    V2.addView(P);
                    TextView P2 = P(e0.m.h(new byte[]{55, 88, -120, 32, 108, -83, 117, 19, 55, 115, -120, 46, -100, -49, 36, 125, 82, 23, -31, 79, 59, -50, 21, 124, 102}, new byte[]{-25, -57, 88, -98, -68, 30, -91, -83}), 14, -6310972);
                    P2.setGravity(17);
                    P2.setMaxLines(1);
                    P2.setEllipsize(TextUtils.TruncateAt.END);
                    V2.addView(P2);
                    linearLayout.addView(V2);
                    l0Var.addView(linearLayout, v());
                } else if (m0Var == m0.d) {
                    LinearLayout linearLayout2 = new LinearLayout(getContext());
                    linearLayout2.setGravity(16);
                    linearLayout2.setPadding(l(12), l(10), l(14), l(10));
                    ImageView imageView2 = new ImageView(getContext());
                    l0Var.f5540j = imageView2;
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView2.setBackground(G(-14404543, 16, -13349794));
                    linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(l(78), l(78)));
                    LinearLayout V3 = V();
                    V3.setGravity(16);
                    V3.setPadding(l(14), 0, 0, 0);
                    s0.a aVar = this.f5599y;
                    if (aVar != null && !TextUtils.isEmpty(aVar.f5454b)) {
                        h11 = this.f5599y.f5454b;
                    } else {
                        h11 = e0.m.h(new byte[]{-72, 46, -28, -49, 52, 44, 96, -74, -72, 8, -27, -4, -60, 75, 12, -19, -35, -110, -27, -12, 52, 40, 96, -67, -72, 2, -27, -7, 53, 25}, new byte[]{104, -78, 53, 76, -28, -101, -79, Base64.padSymbol});
                    }
                    s0.a aVar2 = this.f5599y;
                    if (aVar2 != null && !TextUtils.isEmpty(aVar2.c)) {
                        h12 = this.f5599y.c;
                    } else {
                        h12 = e0.m.h(new byte[]{-7, -76, -65, -17, 57, 41, 71, 99, -8, -94, -66, -35, 57, 46, 71, 98, -7, -106, 79, -113, 86, 71, 22, 48, -105, -13, -41, -113, 90, 71, 22, 49, -94, -13, -35, -113, 89, 71, 20, 48, -100, -13, -44, -114, 101}, new byte[]{41, 35, 111, 95, -23, -106, -106, -32});
                    }
                    TextView P3 = P(h11, 21, -1);
                    l0Var.f5541k = P3;
                    P3.setTypeface(Typeface.DEFAULT_BOLD);
                    P3.setMaxLines(1);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    P3.setEllipsize(truncateAt);
                    V3.addView(P3);
                    TextView P4 = P(h12, 15, -6310972);
                    l0Var.f5542l = P4;
                    P4.setMaxLines(1);
                    P4.setEllipsize(truncateAt);
                    P4.setPadding(0, l(6), 0, 0);
                    V3.addView(P4);
                    linearLayout2.addView(V3, new LinearLayout.LayoutParams(0, -1, 1.0f));
                    l0Var.addView(linearLayout2, v());
                } else if (m0Var == m0.f5552g) {
                    LinearLayout V4 = V();
                    V4.setGravity(17);
                    V4.setPadding(l(8), l(8), l(8), l(8));
                    TextView P5 = P(e0.m.h(new byte[]{-125, -105, 52}, new byte[]{97, 17, -113, -99, -66, -39, -28, -109}), 35, -9382222);
                    P5.setGravity(17);
                    V4.addView(P5, new LinearLayout.LayoutParams(l(48), l(48)));
                    TextView P6 = P(e0.m.h(new byte[]{113, -100, 123, 54, Base64.padSymbol, -29, -30, 10, 113, -80, 123, 63, 60, -36, -29, 56, -127, -45, 47, 87, 83, -114, -113}, new byte[]{-95, 2, -85, -121, -19, 94, 50, -76}), 12, -1);
                    P6.setTypeface(Typeface.DEFAULT_BOLD);
                    P6.setGravity(17);
                    P6.setMaxLines(2);
                    V4.addView(P6, new LinearLayout.LayoutParams(-1, -2));
                    l0Var.addView(V4, v());
                } else if (r(m0Var)) {
                    boolean q8 = q(l0Var.f5535b.f5512b);
                    m0 m0Var2 = l0Var.f5535b.f5512b;
                    if (m0Var2 != m0.f5554i && m0Var2 != m0.f5555j) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (q8) {
                        i10 = -35235;
                    } else {
                        i10 = -11155473;
                    }
                    LinearLayout V5 = V();
                    V5.setGravity(17);
                    V5.setPadding(l(6), l(7), l(6), l(7));
                    LinearLayout linearLayout3 = new LinearLayout(getContext());
                    linearLayout3.setGravity(17);
                    if (q8) {
                        h2 = e0.m.h(new byte[]{99, -114, 81}, new byte[]{-127, 23, -7, 29, 25, -108, 118, -25});
                    } else {
                        h2 = e0.m.h(new byte[]{44, 51, 69}, new byte[]{-50, -82, -63, -116, -68, -41, 26, -54});
                    }
                    TextView P7 = P(h2, 23, i10);
                    P7.setGravity(17);
                    linearLayout3.addView(P7, new LinearLayout.LayoutParams(l(28), l(34)));
                    if (z9) {
                        i11 = 8;
                        h10 = e0.m.h(new byte[]{-98, -67, -94, -112, -56, 82, 25, -46, -97, -83, -94, -101, -56, 93, 24, -26}, new byte[]{78, 47, 114, 46, 24, -26, -55, 106});
                    } else {
                        i11 = 8;
                        h10 = e0.m.h(new byte[]{79, -16, 22, 42, ByteCompanionObject.MAX_VALUE, 14, -73, -117, 79, -33, 22, 44, 126, 55, -73, -118}, new byte[]{-97, 111, -58, -102, -82, -113, 102, 10});
                    }
                    TextView P8 = P(h10, 11, -1);
                    P8.setTypeface(Typeface.DEFAULT_BOLD);
                    P8.setMaxLines(1);
                    linearLayout3.addView(P8);
                    V5.addView(linearLayout3);
                    byte[] bArr = new byte[i11];
                    // fill-array-data instruction
                    bArr[0] = -101;
                    bArr[1] = -37;
                    bArr[2] = 8;
                    bArr[3] = 70;
                    bArr[4] = -105;
                    bArr[5] = 123;
                    bArr[6] = -87;
                    bArr[7] = 22;
                    byte[] bArr2 = new byte[i11];
                    // fill-array-data instruction
                    bArr2[0] = 75;
                    bArr2[1] = 73;
                    bArr2[2] = -39;
                    bArr2[3] = -51;
                    bArr2[4] = 71;
                    bArr2[5] = -63;
                    bArr2[6] = 121;
                    bArr2[7] = -83;
                    TextView P9 = P(e0.m.h(bArr, bArr2), 12, -5653818);
                    l0Var.f5543m = P9;
                    P9.setGravity(17);
                    V5.addView(l0Var.f5543m);
                    LinearLayout linearLayout4 = new LinearLayout(getContext());
                    linearLayout4.setGravity(17);
                    int i16 = 0;
                    while (true) {
                        View[] viewArr = l0Var.f5547q;
                        if (i16 >= viewArr.length) {
                            break;
                        }
                        View view = new View(getContext());
                        viewArr[i16] = view;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l(24), l(7));
                        layoutParams.setMargins(l(3), l(5), l(3), 0);
                        linearLayout4.addView(view, layoutParams);
                        i16++;
                    }
                    V5.addView(linearLayout4);
                    l0Var.addView(V5, v());
                } else {
                    m0 m0Var3 = j0Var2.f5512b;
                    if (m0Var3 == m0.f5551f) {
                        LinearLayout V6 = V();
                        V6.setGravity(17);
                        V6.setPadding(l(7), l(5), l(7), l(5));
                        LinearLayout linearLayout5 = new LinearLayout(getContext());
                        linearLayout5.setGravity(17);
                        ImageView imageView3 = new ImageView(getContext());
                        l0Var.f5544n = imageView3;
                        imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        linearLayout5.addView(imageView3, new LinearLayout.LayoutParams(l(34), l(34)));
                        TextView P10 = P("", 9, -16314343);
                        l0Var.f5546p = P10;
                        P10.setGravity(17);
                        Typeface typeface = Typeface.DEFAULT_BOLD;
                        P10.setTypeface(typeface);
                        P10.setBackground(G(-9382222, 9, -6494003));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(l(30), l(20));
                        layoutParams2.leftMargin = l(6);
                        linearLayout5.addView(P10, layoutParams2);
                        V6.addView(linearLayout5, new LinearLayout.LayoutParams(-2, l(36)));
                        TextView P11 = P("", 10, -1);
                        l0Var.f5545o = P11;
                        P11.setGravity(17);
                        P11.setTypeface(typeface);
                        P11.setMaxLines(2);
                        P11.setEllipsize(TextUtils.TruncateAt.END);
                        V6.addView(P11, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                        l0Var.addView(V6, v());
                    } else if (m0Var3 == m0.f5553h) {
                        b bVar2 = new b(getContext(), j0Var2.f5511a, str2);
                        l0Var.f5536f = bVar2;
                        l0Var.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
                    } else {
                        j0.e b11 = j0.f.b(getContext(), str2);
                        LinearLayout V7 = V();
                        V7.setGravity(17);
                        V7.setPadding(l(8), l(8), l(8), l(8));
                        ImageView imageView4 = new ImageView(getContext());
                        imageView4.setImageDrawable(b11.f3100j);
                        imageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        V7.addView(imageView4, new LinearLayout.LayoutParams(l(42), l(42)));
                        TextView P12 = P(b(b11), 12, -1);
                        P12.setGravity(17);
                        P12.setMaxLines(2);
                        P12.setEllipsize(TextUtils.TruncateAt.END);
                        V7.addView(P12, new LinearLayout.LayoutParams(-1, -2));
                        l0Var.addView(V7, v());
                    }
                }
                if (l0Var.getChildCount() == 0) {
                    childAt = null;
                } else {
                    childAt = l0Var.getChildAt(0);
                }
                l0Var.c = childAt;
                TextView P13 = P(e0.m.h(new byte[]{68, 10, 51}, new byte[]{-90, -106, -106, 116, -61, 8, 20, -86}), 20, -7414537);
                l0Var.d = P13;
                P13.setGravity(17);
                l0Var.addView(l0Var.d, new FrameLayout.LayoutParams(l(38), l(38), 53));
                if (l0Var.f5536f != null) {
                    l0Var.d.setOnTouchListener(new k0(this));
                    TextView P14 = P(e0.m.h(new byte[]{-23, -113, 19}, new byte[]{11, 9, -117, 63, 112, 113, -33, 85}), 26, -7414537);
                    l0Var.e = P14;
                    P14.setGravity(17);
                    l0Var.e.setBackground(G(-300473554, 8, -11222036));
                    l0Var.e.setContentDescription(e0.m.h(new byte[]{-103, 54, -54, -106, 121, -28, 15, -62, -103, 19, -54, -103, 120, -38, 14, -5, 105, ByteCompanionObject.MAX_VALUE, -110, -15, 17, -119, 95, -89, -15, 126, -89, -16, 42, 120, 15, -49, 105, 126, -88, -16, 34, -119, 94, -89, -9, ByteCompanionObject.MAX_VALUE, -104, -16, 42, 120, 15, -55, -103, 20, -54, -100, 121, -24}, new byte[]{73, -82, 26, 33, -87, 88, -33, 119}));
                    l0Var.e.setOnTouchListener(new p0(this, l0Var));
                    l0Var.addView(l0Var.e, new FrameLayout.LayoutParams(l(44), l(44), 85));
                }
                T(l0Var);
                e(l0Var);
                int i17 = 1;
                l0Var.setOnLongClickListener(new d0(this, i17));
                l0Var.setOnTouchListener(new k0(this));
                l0Var.setOnClickListener(new a0(this, i17));
                o0Var.addView(l0Var);
            } else {
                l0Var.f5535b = j0Var;
                l0Var.setTag(j0Var);
                T(l0Var);
            }
            e(l0Var);
            r32 = 1;
        }
        requestLayout();
        o0Var.post(new c0(this, 0));
        U();
        this.f5583f.bringToFront();
    }

    public final void B(m0 m0Var) {
        o0 o0Var = this.e;
        if (o0Var.isInLayout()) {
            o0Var.post(new z(this, m0Var, 1));
            return;
        }
        for (int i10 = 0; i10 < o0Var.getChildCount(); i10++) {
            View childAt = o0Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof j0) && ((j0) tag).f5512b == m0Var) {
                T((l0) childAt);
            }
        }
    }

    public final void C() {
        int i10 = 0;
        while (true) {
            o0 o0Var = this.e;
            if (i10 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i10);
                if (childAt instanceof l0) {
                    l0 l0Var = (l0) childAt;
                    if (r(l0Var.f5535b.f5512b)) {
                        T(l0Var);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void D() {
        if (this.f5595s) {
            y();
        }
        F();
        this.E = true;
        for (int i10 = 0; i10 < this.e.getChildCount(); i10++) {
            b bVar = ((l0) this.e.getChildAt(i10)).f5536f;
            if (bVar != null) {
                bVar.c();
            }
        }
        this.f5588k.shutdownNow();
        this.f5589l.shutdownNow();
        this.f5590m.shutdownNow();
        this.r.removeCallbacksAndMessages(null);
    }

    public final void E(boolean z9) {
        if (!this.E && !this.B && !this.f5589l.isShutdown()) {
            if (z9 || !N.equals(h0.b.o().loadString(M, O))) {
                this.B = true;
                this.f5589l.execute(new s1(this, z9, Math.max(1280, getResources().getDisplayMetrics().widthPixels), Math.max(720, getResources().getDisplayMetrics().heightPixels), 2));
            }
        }
    }

    public final void F() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5594q;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            j0 j0Var = (j0) obj;
            if (j0Var.f5512b == m0.f5553h) {
                arrayList.add(j0Var.f5511a);
            }
        }
        LauncherWindowService launcherWindowService = LauncherWindowService.e;
        if (launcherWindowService != null) {
            launcherWindowService.d.clear();
            LauncherWindowService.e.d.addAll(arrayList);
            ArrayList arrayList3 = new ArrayList(LauncherWindowService.e.f971b.keySet());
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                String str = (String) obj2;
                if (!arrayList.contains(str)) {
                    LauncherWindowService launcherWindowService2 = LauncherWindowService.e;
                    HashMap hashMap = launcherWindowService2.f971b;
                    VirtualDisplay virtualDisplay = (VirtualDisplay) hashMap.get(str);
                    if (virtualDisplay != null) {
                        launcherWindowService2.c.add(str);
                        VirtualDisplay virtualDisplay2 = (VirtualDisplay) hashMap.get(str);
                        if (virtualDisplay2 != null) {
                            virtualDisplay2.setSurface(null);
                        }
                        x a10 = x.a(launcherWindowService2);
                        a10.d.execute(new b1.n(a10, e0.m.h(new byte[]{-22, -105, -90, 110, -111, -31}, new byte[]{-87, -37, -23, Base64.padSymbol, -44, -63, -116, 100}) + virtualDisplay.getDisplay().getDisplayId(), new androidx.transition.a(launcherWindowService2, str, virtualDisplay, 6), 12));
                    }
                }
            }
            if (arrayList.isEmpty() && LauncherWindowService.e.f971b.isEmpty()) {
                LauncherWindowService.e.stopSelf();
            }
        }
    }

    public final GradientDrawable G(int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(l(i11));
        gradientDrawable.setStroke(l(1), i12);
        return gradientDrawable;
    }

    public final void H(float f8) {
        m0 m0Var;
        j0 o5 = o(this.f5597v);
        if (o5 != null && (m0Var = o5.f5512b) != m0.e) {
            float[] i10 = i(m0Var);
            float f10 = i10[0];
            float f11 = f10 * 0.55f;
            float f12 = i10[1] * 0.55f;
            float min = Math.min(0.92f, f10 * 2.35f);
            float min2 = Math.min(0.86f, i10[1] * 2.35f);
            float g10 = g(o5.e * f8, f11, min);
            float g11 = g(o5.f5513f * f8, f12, min2);
            if (Math.abs(g10 - o5.e) >= 1.0E-4f || Math.abs(g11 - o5.f5513f) >= 1.0E-4f) {
                float f13 = (o5.e / 2.0f) + o5.c;
                float f14 = (o5.f5513f / 2.0f) + o5.d;
                o5.e = g10;
                o5.f5513f = g11;
                o5.c = g(f13 - (g10 / 2.0f), 0.0f, 1.0f - g10);
                o5.d = g(f14 - (g11 / 2.0f), 0.0f, 1.0f - g11);
                if (this.t) {
                    O(o5);
                }
                y();
                A();
            }
        }
    }

    public final void I(m0 m0Var) {
        if (m0Var == m0.c) {
            if (!this.f5600z) {
                this.f5600z = true;
            } else {
                return;
            }
        } else if (m0Var == m0.d) {
            if (this.A) {
                return;
            } else {
                this.A = true;
            }
        }
        this.e.post(new z(this, m0Var, 0));
    }

    public final int J(m0 m0Var) {
        switch (m0Var.ordinal()) {
            case 7:
                return this.F;
            case 8:
                return this.G;
            case 9:
                return this.H;
            case 10:
                return this.I;
            default:
                return 1;
        }
    }

    public final TextView K(String str) {
        TextView P = P(str, 12, -10040851);
        P.setTypeface(Typeface.DEFAULT_BOLD);
        P.setLetterSpacing(0.08f);
        P.setPadding(l(2), l(8), 0, l(8));
        return P;
    }

    public final String L() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.m.h(new byte[]{-54, -124, 110, -120, -12, -119, -124}, new byte[]{-68, -31, 28, -5, -99, -26, -22, -13}), 4);
            jSONObject.put(e0.m.h(new byte[]{52, -100, -117, 85}, new byte[]{71, -14, -22, 37, 18, -25, 107, -60}), this.t);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f5594q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((j0) obj).b());
            }
            jSONObject.put(e0.m.h(new byte[]{122, 97, -99, 32, -88}, new byte[]{19, 21, -8, 77, -37, 107, -73, 124}), jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void M(final ArrayList arrayList, final boolean z9, final j0.e eVar) {
        String h2;
        String i10;
        if (this.f5595s && isAttachedToWindow()) {
            if (arrayList.isEmpty()) {
                y5.k.x(getContext(), e0.m.h(new byte[]{-105, 67, -27, -59, -55, 13, 9, -3, -105, 92, -27, -64, 57, 101, 108, -84, -14, 50, -116, -85, -104, 100, 90, -84, -11, 50, -115, -86, -96, -107, 9, -3, -105, 87, -27, -61, -56, 50, 8, -52, -106, 99, 21, -86, -92, 101, 109, -84, -13, 50, -117, -85, -104, 100, 90, -83, -60, 50, -118, -86, -84, 101, 101}, new byte[]{71, -30, 53, 122, 25, -75, -40, 124}));
                return;
            }
            LinearLayout j10 = j();
            if (z9) {
                h2 = e0.m.h(new byte[]{-98, 48, 47, 1, -104, 29, 111, -29, -98, 21, 47, 15, -104, 19, 110, -47, -98, 31, 46, 54, -103, 40, 111, -19, -97, 35, -33, 100, -3, 77, 10, -122, -9, 126, 126, 101, -53, 77, 13, -122, -10, ByteCompanionObject.MAX_VALUE, 70}, new byte[]{78, -81, -1, -76, 73, -99, -65, 86});
            } else {
                h2 = e0.m.h(new byte[]{-120, -40, -79, -48, -14, -86, 50, 122, -119, -50, -79, -41, -14, -85, 50, 116, 120, -100, -39, 69, -14, -84, 50, 123, -120, -12, -79, -34, -14, -83, 51, 77, -120, -7, -79, -40, -14, -85, 50, 116}, new byte[]{88, 76, 97, 101, 34, 19, -29, -5});
            }
            TextView P = P(h2, 25, -1);
            P.setTypeface(Typeface.DEFAULT_BOLD);
            P.setMaxLines(1);
            j10.addView(P);
            if (!z9) {
                i10 = e0.m.h(new byte[]{-9, -66, -4, 125, 75, -22, -33, -20, -9, -101, -3, 79, 75, -23, 47, ByteCompanionObject.MIN_VALUE, -102, -13, -100, -19, 74, -47, -33, -21, -9, -106, -4, 113, 75, -23, -33, -19, -10, -95, 12, 47, 27, -56, 47, ByteCompanionObject.MIN_VALUE, -99, -13, -111, 29, 37, -116, -80, ByteCompanionObject.MIN_VALUE, -99, -13, -100, -19, 74, -35, -34, -48, -9, -109, -4, 122, 74, -33, 47, ByteCompanionObject.MIN_VALUE, -104, -13, -110, 28, 20, -116, -67, ByteCompanionObject.MIN_VALUE, -97, -14, -82, 28, 26, -115, ByteCompanionObject.MIN_VALUE, 112, -9, -98, -4, 125, -69, -115, -113, ByteCompanionObject.MIN_VALUE, -105, -13, -99, 29, 37, -115, -120, ByteCompanionObject.MIN_VALUE, -110, -13, -112, -19, 74, -35, -34, -46, -9, -99, -4, 118, 75, -23}, new byte[]{39, 35, 44, -51, -101, 92, 15, 80});
            } else if (eVar == null) {
                i10 = e0.m.h(new byte[]{-24, 126, -64, 37, 62, ByteCompanionObject.MAX_VALUE, -92, 97, -23, 108, -63, 22, 63, 76, -92, 97, 24, 60, -91, 126, 91, 30, -51, 5, -71, Base64.padSymbol, -109, 126, 92, 30, -52, 4, -115, -52, -63, 26, 62, 117, -91, 91, 24, 60, -82, 126, 91, 31, -12, 4, -118, 60, -81, 126, 93, 30, -54, -12, -24, 81, -63, 30, 62, 120, -92, 100, -23, 110, -63, 22, 63, 65}, new byte[]{56, -20, 17, -82, -18, -50, 116, -44});
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(e0.m.h(new byte[]{-82, 126, -83, 87, 119, 12, 42, 77, -82, 95, -83, 87, -100, -84}, new byte[]{126, -31, 125, -30, -90, -116, -6, -1}));
                sb.append(b(eVar));
                i10 = com.google.protobuf.q.i(new byte[]{112, -80, -89, 9, 56, -79, -99, 28, -114, 37, -90, 43, 57, -120, 109, 115, -20, 65, -4, 123, 89, -44, -8, 114, -34, 64, -49, 122, 106, -44, -8, -125, -114, 36, -89, 30, 56, -67, -100, 34, -113, 18, -89, 25, 56, -68, -99, 22, 126, 64, -61, 123, 83, -43, -62, -125, -113, 17, -89, 16, 56, -79, -99, 23, -113, 19, -90, 37, 57, -115, -99, 22, -114, 35, -89, 21, -56, -44, -16, 115, -18, 64, -63, 123, 88, -43, -49, 115, -26, 65, -8}, new byte[]{94, -112, 119, -85, -24, 4, 77, -93}, sb);
            }
            j10.addView(k(i10));
            EditText editText = new EditText(getContext());
            editText.setSingleLine(true);
            editText.setTextSize(16.0f);
            editText.setTextColor(-1);
            editText.setHintTextColor(-8218712);
            editText.setHint(e0.m.h(new byte[]{28, -54, 78, 101, -62, -67, -47, -61, 28, -17, -66, 11, -83, -43, -66, 98, 28, -24, 78, 107, -62, -78, -48, -16, 28, -27, 78, 102, -62, -67, -47, -52}, new byte[]{-52, 85, -98, -37, 18, 5, 0, 66}));
            editText.setPadding(l(18), 0, l(18), 0);
            editText.setBackground(G(-15721692, 15, -13547174));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, l(54));
            layoutParams.topMargin = l(14);
            layoutParams.bottomMargin = l(12);
            j10.addView(editText, layoutParams);
            ListView listView = new ListView(getContext());
            listView.setDivider(null);
            listView.setDividerHeight(0);
            listView.setCacheColorHint(0);
            listView.setBackgroundColor(0);
            final i0 i0Var = new i0(this, arrayList);
            if (i0Var.c.size() == 0) {
                y5.k.x(getContext(), e0.m.h(new byte[]{84, 10, -49, 84, -4, -120, -79, 114, 48, 71, -95, 48, -84, -37, 19, 115, 7, 71, -96, 49, -112, -37, 26, 115, 1, -73, -49, 85, -3, -79, 64, 45, -92, 71, -88, 49, -99, -38, 46, 115, 7, 70, -98, 49, -105, -38, 33, -126, 84, 35, -49, 84, -3, -77, 64, 35, 85, 21, -49, 83, -3, -78, 65, 27}, new byte[]{-124, -105, 31, -31, 45, 10, -111, -94}));
                return;
            }
            listView.setAdapter((ListAdapter) i0Var);
            j10.addView(listView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            Button R = R(e0.m.h(new byte[]{121, -24, 0, -112, 68, 117, -76, 126, 120, -12, 1, -94, 69, 67}, new byte[]{-87, ByteCompanionObject.MAX_VALUE, -48, 32, -108, -49, 101, -2}), false);
            R.setTextSize(16.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(l(170), l(50));
            layoutParams2.gravity = 5;
            layoutParams2.topMargin = l(12);
            j10.addView(R, layoutParams2);
            final AlertDialog create = new AlertDialog.Builder(getContext()).setView(j10).create();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: s1.e0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                    q0 q0Var = q0.this;
                    ArrayList arrayList2 = q0Var.f5594q;
                    j0.e eVar2 = (j0.e) i0Var.c.get(i11);
                    create.dismiss();
                    if (!z9) {
                        float[] n10 = q0Var.n(0.1f, 0.14f);
                        j0 j0Var = new j0(m0.e, n10[0], n10[1], 0.1f, 0.14f, j0.f.g(eVar2));
                        arrayList2.add(j0Var);
                        q0Var.f5597v = j0Var.f5511a;
                        q0Var.y();
                        q0Var.A();
                        return;
                    }
                    j0.e eVar3 = eVar;
                    if (eVar3 == null) {
                        q0Var.M(arrayList, true, eVar2);
                        return;
                    }
                    float[] n11 = q0Var.n(0.1f, 0.14f);
                    m0 m0Var = m0.f5551f;
                    float f8 = n11[0];
                    float f10 = n11[1];
                    String g10 = j0.f.g(eVar3);
                    String g11 = j0.f.g(eVar2);
                    String uuid = UUID.randomUUID().toString();
                    arrayList2.add(new j0(uuid, m0Var, f8, f10, 0.1f, 0.14f, g10, g11, false));
                    q0Var.f5597v = uuid;
                    q0Var.y();
                    q0Var.A();
                }
            });
            editText.addTextChangedListener(new h0(i0Var, 1));
            R.setOnClickListener(new r0.d(create, 3));
            N(create, 820);
        }
    }

    public final void N(AlertDialog alertDialog, int i10) {
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.show();
        Window window = alertDialog.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.72f;
        window.setAttributes(attributes);
        window.addFlags(2);
        window.setLayout(Math.min(l(i10), getResources().getDisplayMetrics().widthPixels - l(40)), Math.min(l(650), getResources().getDisplayMetrics().heightPixels - l(48)));
    }

    public final TextView P(String str, int i10, int i11) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(i10);
        textView.setTextColor(i11);
        return textView;
    }

    public final LinearLayout Q() {
        return z(e0.m.h(new byte[]{51, -61, 68}, new byte[]{-47, 68, -64, -67, 41, -58, 16, -56}), -9382222, e0.m.h(new byte[]{-113, 19, Base64.padSymbol, -39, 12, -116, -24, -42, -113, 54, Base64.padSymbol, -41, 12, -126, -23, -28, -113, 60, 60, -18, 13, -71, -24, -40, -114, 0, -51, -68, 105, -36, -118, -78, -36, 93, 104, 76, 13, -72, -24, -42, -113, 53, 60, -19, 12, -114, -24, -47, -113, 52, Base64.padSymbol, -43}, new byte[]{95, -116, -19, 108, -35, 12, 56, 99}), e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 42, -22, -126, 3, 1, -87, 77, -113, 100, -121, -26, 99, 108, -49, 35, 31, 101, -72, -26, 107, 108, -52, -45, ByteCompanionObject.MAX_VALUE, 3, -22, -122, 3, 3, -88, 112, 126, 53, -22, -116, 3, 12, -87, 70, 126, 54, 26, -26, 108, 108, -52, 34, 47, 100, -120, -26, 109, 108, -52, -45, ByteCompanionObject.MAX_VALUE, 0, -22, -125, 3, 5, -88, 114, 126, 54, -22, -124, 3, 4, -87, 70, -125, -108, -21, -73, 3, 7, -87, 70, ByteCompanionObject.MAX_VALUE, 0, -21, -75, 2, 50, -88, 122, ByteCompanionObject.MAX_VALUE, 1, -22, -125, -13, 94, -7, 103, -113, 100, -120, -25, 81, 108, -57, 34, 47, 100, -124, -26, 102}, new byte[]{-81, -76, 58, 54, -45, -68, 121, -13}));
    }

    public final Button R(String str, boolean z9) {
        int i10;
        int i11;
        Button button = new Button(getContext());
        button.setText(str);
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setAllCaps(false);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setPadding(l(8), 0, l(8), 0);
        if (z9) {
            i10 = -14446919;
        } else {
            i10 = -14273213;
        }
        if (z9) {
            i11 = -10959635;
        } else {
            i11 = -12889500;
        }
        button.setBackground(G(i10, 12, i11));
        return button;
    }

    public final LinearLayout.LayoutParams S(int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l(i10), l(46));
        layoutParams.setMargins(l(4), 0, l(4), 0);
        return layoutParams;
    }

    public final void T(l0 l0Var) {
        String str;
        String h2;
        String j10;
        int i10;
        boolean z9;
        int i11;
        int i12;
        String h10;
        String h11;
        m0 m0Var = l0Var.f5535b.f5512b;
        if (m0Var == m0.c) {
            l0Var.f5539i.setText(this.w);
            int i13 = this.f5598x;
            ImageView imageView = l0Var.f5538h;
            if (i13 != 0) {
                try {
                    imageView.setImageResource(i13);
                    return;
                } catch (RuntimeException unused) {
                    l0Var.f5538h.setImageDrawable(null);
                    return;
                }
            }
            imageView.setImageDrawable(null);
            return;
        }
        if (m0Var == m0.d) {
            s0.a aVar = this.f5599y;
            if (aVar != null && !TextUtils.isEmpty(aVar.f5454b)) {
                h10 = this.f5599y.f5454b;
            } else {
                h10 = e0.m.h(new byte[]{-48, 104, 79, -107, 120, 20, 52, -78, -48, 78, 78, -90, -120, 115, 88, -23, -75, -44, 78, -82, 120, 16, 52, -71, -48, 68, 78, -93, 121, 33}, new byte[]{0, -12, -98, 22, -88, -93, -27, 57});
            }
            s0.a aVar2 = this.f5599y;
            if (aVar2 != null && !TextUtils.isEmpty(aVar2.c)) {
                h11 = this.f5599y.c;
            } else {
                h11 = e0.m.h(new byte[]{42, 101, -20, -120, -9, -52, 94, -118, 43, 115, -19, -70, -9, -53, 94, -117, 42, 71, 28, -24, -104, -94, 15, -39, 68, 34, -124, -24, -108, -94, 15, -40, 113, 34, -114, -24, -105, -94, 13, -39, 79, 34, -121, -23, -85}, new byte[]{-6, -14, 60, 56, 39, 115, -113, 9});
            }
            l0Var.f5541k.setText(h10);
            l0Var.f5542l.setText(h11);
            s0.a aVar3 = this.f5599y;
            if (aVar3 != null && aVar3.e != null) {
                l0Var.f5540j.setPadding(0, 0, 0, 0);
                l0Var.f5540j.setImageBitmap(this.f5599y.e);
                return;
            } else {
                l0Var.f5540j.setImageResource(R.drawable.ic_media_play);
                l0Var.f5540j.setPadding(l(18), l(18), l(18), l(18));
                return;
            }
        }
        boolean r = r(m0Var);
        j0 j0Var = l0Var.f5535b;
        if (r) {
            int max = Math.max(0, J(j0Var.f5512b) - 1);
            TextView textView = l0Var.f5543m;
            if (max == 0) {
                j10 = e0.m.h(new byte[]{-91, 31, 52, -58, 67, -42, -103, 22}, new byte[]{117, -115, -27, 77, -109, 108, 73, -83});
            } else {
                j10 = com.google.protobuf.q.j(new byte[]{104, -67, 104, -98, 34, -108, -36, 94, 104, -85, 105, -93, 35, -90, 44}, new byte[]{-72, 30, -71, 30, -14, 42, 12, -20}, new StringBuilder(), max);
            }
            textView.setText(j10);
            if (q(l0Var.f5535b.f5512b)) {
                i10 = -35235;
            } else {
                i10 = -11155473;
            }
            int i14 = 0;
            while (true) {
                View[] viewArr = l0Var.f5547q;
                if (i14 < viewArr.length) {
                    if (i14 < max) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    View view = viewArr[i14];
                    if (z9) {
                        i11 = i10;
                    } else {
                        i11 = -14272444;
                    }
                    if (z9) {
                        i12 = i10;
                    } else {
                        i12 = -12757658;
                    }
                    view.setBackground(G(i11, 5, i12));
                    i14++;
                } else {
                    return;
                }
            }
        } else if (j0Var.f5512b == m0.f5551f) {
            if (j0Var.f5516i) {
                str = j0Var.f5515h;
            } else {
                str = j0Var.f5514g;
            }
            j0.e b10 = j0.f.b(getContext(), str);
            Drawable drawable = b10.f3100j;
            ImageView imageView2 = l0Var.f5544n;
            if (drawable != null) {
                imageView2.setImageDrawable(drawable);
            } else {
                imageView2.setImageResource(R.drawable.ic_menu_rotate);
            }
            l0Var.f5545o.setText(b(b10));
            TextView textView2 = l0Var.f5546p;
            if (j0Var.f5516i) {
                h2 = e0.m.h(new byte[]{9, 71, 25, 9, -75}, new byte[]{59, 103, 54, 41, -121, -127, -18, 51});
            } else {
                h2 = e0.m.h(new byte[]{-47, -99, ByteCompanionObject.MIN_VALUE, 108, 71}, new byte[]{-32, -67, -81, 76, 117, -38, 39, -54});
            }
            textView2.setText(h2);
        }
    }

    public final void U() {
        boolean z9;
        j0 o5 = o(this.f5597v);
        boolean z10 = false;
        if (o5 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f5587j.setEnabled(z9);
        if (o5 != null && o5.f5512b != m0.e) {
            z10 = true;
        }
        this.f5585h.setEnabled(z10);
        this.f5586i.setEnabled(z10);
    }

    public final LinearLayout V() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public final LinearLayout W(int i10, String str, String str2, String str3, boolean z9) {
        int i11;
        int i12;
        int i13;
        LinearLayout V = V();
        V.setGravity(1);
        V.setPadding(l(14), l(12), l(14), l(12));
        if (z9) {
            i11 = -11751549;
        } else {
            i11 = -13086364;
        }
        V.setBackground(G(-15194575, 18, i11));
        V.setClickable(true);
        V.setFocusable(true);
        if (str.indexOf(58) >= 0) {
            i12 = 28;
        } else {
            i12 = 34;
        }
        TextView P = P(str, i12, i10);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        P.setTypeface(typeface);
        P.setGravity(17);
        P.setBackground(G(-15919329, 16, i10));
        V.addView(P, new LinearLayout.LayoutParams(l(92), l(64)));
        TextView P2 = P(str2, 17, -1);
        P2.setTypeface(typeface);
        P2.setGravity(17);
        P2.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = l(8);
        V.addView(P2, layoutParams);
        if (z9) {
            str3 = e0.m.h(new byte[]{-18, -72, 75, -27, -59, -80, 0, 53, -125, -53, 43, 115, -60, -120, -16, 95, -17, -101, 75, -29, -59, -72, -16, 80}, new byte[]{62, 27, -101, 83, 21, 5, 32, -27});
        }
        if (z9) {
            i13 = -9250909;
        } else {
            i13 = -6376767;
        }
        TextView P3 = P(str3, 12, i13);
        P3.setGravity(17);
        P3.setMaxLines(2);
        P3.setEllipsize(TextUtils.TruncateAt.END);
        V.addView(P3, new LinearLayout.LayoutParams(-1, -2));
        return V;
    }

    public final LinearLayout a() {
        return z(e0.m.h(new byte[]{29, 121, -24}, new byte[]{-1, -17, 78, -69, 111, 121, -71, 70}), -10104077, e0.m.h(new byte[]{-108, -12, 14, 60, -56, -2, ByteCompanionObject.MAX_VALUE, -84, -107, -30, 14, 59, -56, -1, ByteCompanionObject.MAX_VALUE, -94, 100, -80, 102, -87, -56, -8, ByteCompanionObject.MAX_VALUE, -83, -108, -40, 14, 50, -56, -7, 126, -101, -108, -43, 14, 52, -56, -1, ByteCompanionObject.MAX_VALUE, -94}, new byte[]{68, 96, -34, -119, 24, 71, -82, 45}), e0.m.h(new byte[]{57, -38, 51, 43, 100, 103, -51, -46, 57, -5, 50, 29, 100, 106, -51, -44, 57, -3, 51, 36, -104, -1, -52, -23, 57, -11, 50, 28, 100, 107, -51, -36, 57, -2, 50, 30, 100, 98, -51, -47, 57, -16, -62, 122, 57, 15, -89, -72, 105, -107, 82, 123, 9, 15, -83, 69, -55, -108, 99, 123, 12, 14, -100, -72, 107, -107, 87, 123, 8, 15, -96, -72, 98, -107, 87, -117, 100, 103, Base64.padSymbol, -71, 86, -107, 92, 123, 15, 14, -111, -71, 94, -107, 92, 123, 6, 15, -83, -72, 107, -107, 87, 123, 15, 14, -111, -72, 104, -107, 88, 123, 12, 15, -88, 73, 57, -1, 50, 21, 100, 99, -51, -39, 57, -8, 50, 31, 101, 84}, new byte[]{-23, 69, -30, -85, -76, -33, 29, 105}));
    }

    public final void c() {
        m0 m0Var = m0.e;
        j0 j0Var = new j0(m0Var, 0.43f, 0.72f, 0.1f, 0.14f, e0.m.h(new byte[]{75, -84, -119, -73, 3, -59, 97, 75, 113, -111, -88, -101, 107, -61, 107, 68, 126, -110, -93, -105, 124, -39, 97}, new byte[]{46, -62, -4, -38, 57, -105, 52, 5}));
        ArrayList arrayList = this.f5594q;
        arrayList.add(j0Var);
        arrayList.add(new j0(m0Var, 0.535f, 0.72f, 0.1f, 0.14f, e0.m.h(new byte[]{-16, -83, -12, 23, -13, -97, 12, 88, -48, -115, -43, 37, -99, -116, 26, 80, -54, -114, -64, 52, -120, -118, 12, 73}, new byte[]{-107, -61, -127, 122, -55, -51, 73, 27})));
        arrayList.add(new j0(m0Var, 0.64f, 0.72f, 0.1f, 0.14f, e0.m.h(new byte[]{76, -39, -2, -117, 75, -27, 126, 102, 96, -29, -44, -76, 36, -8}, new byte[]{41, -73, -117, -26, 113, -74, 46, 42})));
        arrayList.add(new j0(m0Var, 0.745f, 0.72f, 0.1f, 0.14f, e0.m.h(new byte[]{-38, -60, 74, -38, 14, -5, 22, -126, -10, -21, 96, -25, 120, -9, 10, -103, -17, -21, 106, -28, 113}, new byte[]{-65, -86, 63, -73, 52, -74, 83, -58})));
    }

    public final void d(m0 m0Var) {
        ArrayList arrayList = this.f5594q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            if (j0Var.f5512b == m0Var) {
                this.f5597v = j0Var.f5511a;
                A();
                y5.k.x(getContext(), e0.m.h(new byte[]{120, -4, 66, 3, -25, -16, -24, -17, -120, -127, 33, 81, -113, -98, -115, -67, 30, -127, 38, 80, -75, 110, -24, -18, 120, -25, 67, 52, 23, -98, -115, -67, 22, -127, 34, 81, -121, -98, -117, -67, 19, -127, 38, 81, -118}, new byte[]{-88, 81, -109, -127, 55, 78, 57, 109}));
                return;
            }
        }
        float[] i11 = i(m0Var);
        float[] n10 = n(i11[0], i11[1]);
        j0 j0Var2 = new j0(m0Var, n10[0], n10[1], i11[0], i11[1], null);
        arrayList.add(j0Var2);
        this.f5597v = j0Var2.f5511a;
        y();
        A();
    }

    public final void e(l0 l0Var) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        j0 j0Var = l0Var.f5535b;
        int i15 = 0;
        if (this.f5595s && j0Var.f5511a.equals(this.f5597v)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f5595s) {
            i10 = 16;
        } else {
            i10 = 7;
        }
        l0Var.setElevation(l(i10));
        if (z9) {
            i11 = -232112560;
        } else {
            i11 = -602463442;
        }
        if (j0Var.f5512b == m0.e) {
            i12 = 18;
        } else {
            i12 = 24;
        }
        if (z9) {
            i13 = -11222036;
        } else {
            i13 = -13547946;
        }
        l0Var.setBackground(G(i11, i12, i13));
        TextView textView = l0Var.d;
        if (this.f5595s) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        textView.setVisibility(i14);
        boolean z10 = this.f5595s;
        l0Var.f5537g = z10;
        b bVar = l0Var.f5536f;
        if (bVar != null) {
            bVar.f5471l = z10;
            if (z10 && bVar.f5472m && bVar.f5465f.f5640f) {
                bVar.f(e0.m.h(new byte[]{117, -10, -53, 40, 92, -103, 38, 35, -123, -72, -84, 66, 60, -12, 73, 76, 38, -71, -102, 67, 14, -12, 78, 76, 39, -71, -102, 67, 3, 4, 38, 34, 117, -42, -54, 19, 92, -97, 38, 40, -123, -71, -102, 66, 50, -11, 115, 76, 37, -72, -85, 66, 49, -12, 67, 77, 24, -72, -93, 67, 3}, new byte[]{-91, 104, 27, -110, -116, 36, -10, -99}));
            }
            if (!bVar.f5471l) {
                bVar.d();
            }
        }
        TextView textView2 = l0Var.e;
        if (textView2 != null) {
            if (!this.f5595s) {
                i15 = 8;
            }
            textView2.setVisibility(i15);
        }
    }

    public final LinearLayout.LayoutParams f() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, l(158), 1.0f);
        layoutParams.setMargins(l(5), l(4), l(5), l(4));
        return layoutParams;
    }

    public final boolean h(m0 m0Var) {
        ArrayList arrayList = this.f5594q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((j0) obj).f5512b == m0Var) {
                return true;
            }
        }
        return false;
    }

    public final LinearLayout j() {
        LinearLayout V = V();
        V.setPadding(l(24), l(22), l(24), l(20));
        V.setBackground(G(-15721949, 24, -13217692));
        return V;
    }

    public final TextView k(String str) {
        TextView P = P(str, 14, -6376767);
        P.setPadding(0, l(4), 0, l(12));
        P.setMaxLines(2);
        return P;
    }

    public final int l(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final void m() {
        if (this.f5595s) {
            return;
        }
        this.f5595s = true;
        this.f5596u = L();
        y();
        this.f5597v = null;
        LinearLayout linearLayout = this.f5583f;
        linearLayout.setVisibility(0);
        linearLayout.bringToFront();
        A();
        WebLauncherActivity webLauncherActivity = (WebLauncherActivity) this.f5582b.c;
        webLauncherActivity.f979j = true;
        webLauncherActivity.t();
        y5.k.x(getContext(), e0.m.h(new byte[]{-19, 54, 123, -69, -64, 18, -52, 115, -20, 36, 122, -120, -63, 33, -52, 115, 29, 116, 24, -32, -88, 115, -88, 22, -117, 116, 31, -31, -110, -103, 60, 22, -120, 116, 25, -32, -82, -125, -52, 122, -19, 26, 122, -122, -64, 30, -52, 120, 29, 116, 21, -32, -91, 114, -100, 22, -120, 116, 22, -32, -91, 114, -99, 23, -65, 116, 18, -31, -110, 114, -112, -22, 29, 117, 41, -32, -84, 115, -87, 22, ByteCompanionObject.MIN_VALUE, 117, 38, -31, -104, 115, -92, 23, -65, 117, 38, 16, -64, 27, -52, 125, -19, 28, -118, -31, -109, 115, -82, 22, -120, 116, 17, -32, -88, 114, -101, 22, -123, 117, 40, -31, -100, -115}, new byte[]{Base64.padSymbol, -92, -86, 48, 16, -93, 28, -58}));
    }

    public final float[] n(float f8, float f10) {
        int i10;
        if (this.f5595s) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        while (i10 < 14) {
            for (int i11 = 0; i11 < 24; i11++) {
                float f11 = i11 / 24.0f;
                float f12 = i10 / 14.0f;
                float f13 = f11 + f8;
                if (f13 <= 1.0f) {
                    float f14 = f12 + f10;
                    if (f14 <= 1.0f) {
                        ArrayList arrayList = this.f5594q;
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            j0 j0Var = (j0) obj;
                            float f15 = j0Var.c;
                            if (f11 < j0Var.e + f15 && f13 > f15) {
                                float f16 = j0Var.d;
                                if (f12 < j0Var.f5513f + f16 && f14 > f16) {
                                    break;
                                }
                            }
                        }
                        return new float[]{f11, f12};
                    }
                }
            }
            i10++;
        }
        return new float[]{Math.max(0.0f, (1.0f - f8) / 2.0f), Math.max(0.0f, (1.0f - f10) / 2.0f)};
    }

    public final j0 o(String str) {
        ArrayList arrayList = this.f5594q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            if (j0Var.f5511a.equals(str)) {
                return j0Var;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Handler handler = this.r;
        f0 f0Var = this.f5593p;
        handler.removeCallbacks(f0Var);
        handler.post(f0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.r.removeCallbacks(this.f5593p);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.c.layout(0, 0, i14, i15);
        this.d.layout(0, 0, i14, i15);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.e.post(new c0(this, 0));
    }

    public final int[] p(m0 m0Var, int i10, int i11, float f8) {
        if (m0Var == m0.f5553h) {
            return new int[]{i10, i11};
        }
        if (m0Var == m0.e) {
            return new int[]{i10, Math.min(i11, Math.max(l(64), Math.round(i10 / f8)))};
        }
        int min = Math.min(i10, Math.max(1, Math.round(i11 * f8)));
        return new int[]{min, Math.min(i11, Math.max(1, Math.round(min / f8)))};
    }

    public final void s() {
        float f8;
        int i10;
        int i11;
        q0 q0Var = this;
        o0 o0Var = q0Var.e;
        int width = o0Var.getWidth();
        int height = o0Var.getHeight();
        if (width > 0 && height > 0) {
            int i12 = 0;
            while (i12 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i12);
                j0 j0Var = (j0) childAt.getTag();
                int l10 = q0Var.l(72);
                float f10 = width;
                float f11 = j0Var.e;
                m0 m0Var = j0Var.f5512b;
                int max = Math.max(l10, Math.round(f11 * f10));
                float f12 = height;
                int max2 = Math.max(q0Var.l(64), Math.round(j0Var.f5513f * f12));
                if (m0Var == m0.d) {
                    f8 = 3.6f;
                } else if (r(m0Var)) {
                    f8 = 1.45f;
                } else if (m0Var != m0.e && m0Var != m0.f5551f && m0Var != m0.f5552g) {
                    f8 = 2.1f;
                } else {
                    f8 = 1.25f;
                }
                int[] p9 = q0Var.p(m0Var, max, max2, f8);
                int i13 = p9[0];
                int i14 = p9[1];
                childAt.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
                View view = ((l0) childAt).c;
                o0 o0Var2 = o0Var;
                if (view != null) {
                    if (m0Var == m0.f5553h) {
                        view.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
                    } else {
                        float[] i15 = i(m0Var);
                        i10 = width;
                        i11 = height;
                        int[] p10 = q0Var.p(m0Var, Math.max(q0Var.l(72), Math.round(i15[0] * f10)), Math.max(q0Var.l(64), Math.round(i15[1] * f12)), f8);
                        int i16 = p10[0];
                        int i17 = p10[1];
                        float f13 = i13;
                        float f14 = i14;
                        float g10 = g(Math.min(f13 / Math.max(1, i16), f14 / Math.max(1, i17)), 0.55f, 2.35f);
                        view.setLayoutParams(new FrameLayout.LayoutParams(i16, i17));
                        view.setPivotX(0.0f);
                        view.setPivotY(0.0f);
                        view.setScaleX(g10);
                        view.setScaleY(g10);
                        view.setTranslationX((f13 - (i16 * g10)) / 2.0f);
                        view.setTranslationY((f14 - (i17 * g10)) / 2.0f);
                        float f15 = ((max - i13) / 2.0f) + (j0Var.c * f10);
                        float f16 = ((max2 - i14) / 2.0f) + (j0Var.d * f12);
                        childAt.setX(g(f15, 0.0f, i10 - i13));
                        childAt.setY(g(f16, 0.0f, i11 - i14));
                        i12++;
                        q0Var = this;
                        height = i11;
                        o0Var = o0Var2;
                        width = i10;
                    }
                }
                i10 = width;
                i11 = height;
                float f152 = ((max - i13) / 2.0f) + (j0Var.c * f10);
                float f162 = ((max2 - i14) / 2.0f) + (j0Var.d * f12);
                childAt.setX(g(f152, 0.0f, i10 - i13));
                childAt.setY(g(f162, 0.0f, i11 - i14));
                i12++;
                q0Var = this;
                height = i11;
                o0Var = o0Var2;
                width = i10;
            }
        }
    }

    public final void t(boolean z9) {
        y5.k.x(getContext(), e0.m.h(new byte[]{-33, 43, 47, -92, 36, -125, 100, 65, -34, 63, 47, -94, 36, ByteCompanionObject.MIN_VALUE, 100, 79, 47, 108, 75, -60, 65, -32, 12, 16, -114, 109, 125, -60, 70, -32, 13, 16, ByteCompanionObject.MIN_VALUE, 94, ByteCompanionObject.MAX_VALUE, -78}, new byte[]{15, -68, -1, 20, -12, 48, -75, -63}));
        this.f5588k.execute(new c7.e(this, z9, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q0.u(java.lang.String):void");
    }

    public final void x(boolean z9) {
        this.f5591n = z9;
        this.r.removeCallbacks(this.f5593p);
        for (int i10 = 0; i10 < this.e.getChildCount(); i10++) {
            b bVar = ((l0) this.e.getChildAt(i10)).f5536f;
            if (bVar != null) {
                bVar.f5470k = z9;
                if (!z9) {
                    LauncherWindowService launcherWindowService = bVar.f5466g;
                    if (launcherWindowService != null) {
                        VirtualDisplay virtualDisplay = (VirtualDisplay) launcherWindowService.f971b.get(bVar.f5464b);
                        if (virtualDisplay != null) {
                            virtualDisplay.setSurface(null);
                        }
                    }
                } else {
                    bVar.f5472m = true;
                    bVar.e(bVar.f5465f.f5640f);
                }
            }
        }
        if (z9) {
            this.r.post(this.f5593p);
        }
    }

    public final void y() {
        h0.b.o().saveString(K, L());
    }

    public final LinearLayout z(String str, int i10, String str2, String str3) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(l(16), l(12), l(16), l(12));
        linearLayout.setBackground(G(-15194575, 18, -11831662));
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        TextView P = P(str, 34, i10);
        P.setGravity(17);
        P.setBackground(G(-15919329, 15, -12349782));
        linearLayout.addView(P, new LinearLayout.LayoutParams(l(68), l(64)));
        LinearLayout V = V();
        V.setGravity(16);
        V.setPadding(l(16), 0, l(8), 0);
        TextView P2 = P(str2, 18, -1);
        P2.setTypeface(Typeface.DEFAULT_BOLD);
        V.addView(P2);
        TextView P3 = P(str3, 13, -6376767);
        P3.setMaxLines(2);
        V.addView(P3);
        linearLayout.addView(V, new LinearLayout.LayoutParams(0, -1, 1.0f));
        TextView P4 = P(e0.m.h(new byte[]{103, ByteCompanionObject.MAX_VALUE, 118}, new byte[]{-123, -1, -52, -48, -33, 74, -97, 52}), 34, i10);
        P4.setGravity(17);
        linearLayout.addView(P4, new LinearLayout.LayoutParams(l(38), -1));
        return linearLayout;
    }
}
