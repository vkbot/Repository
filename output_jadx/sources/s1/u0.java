package s1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u0 extends LinearLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final String f5616u = e0.m.h(new byte[]{-28, -49, ByteCompanionObject.MAX_VALUE, 89, -34, -83, -13, -7, -39, -62, 126, 73, -27, -95, -64, -9, -46, -46, 78, 76, -41, -85, -63, -2, -61}, new byte[]{-73, -90, 17, 62, -78, -56, -92, -112});

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f5617b;
    public final ScrollView c;
    public final LinearLayout d;
    public final LinearLayout e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5618f;

    /* renamed from: g, reason: collision with root package name */
    public int f5619g;

    /* renamed from: h, reason: collision with root package name */
    public int f5620h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5621i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5622j;

    /* renamed from: k, reason: collision with root package name */
    public ExecutorService f5623k;

    /* renamed from: l, reason: collision with root package name */
    public WindowManager f5624l;

    /* renamed from: m, reason: collision with root package name */
    public WindowManager.LayoutParams f5625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5627o;

    /* renamed from: p, reason: collision with root package name */
    public int f5628p;

    /* renamed from: q, reason: collision with root package name */
    public String f5629q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f5630s;
    public GridLayout t;

    static {
        e0.m.h(new byte[]{70, -27, 1, 94, 89, 64, 69, -31, 115, -38, 8, 123, 70, 77, 65, -31, 116, -42, 62, 96, 94, 67, 78, -31, 80, -32, 3, 109, 95, 83}, new byte[]{7, -119, 109, 9, 48, 36, 34, -124});
    }

    public u0(Context context) {
        super(context);
        this.f5621i = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f5622j = arrayList;
        this.r = 2;
        this.f5630s = 50;
        setOrientation(1);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        this.f5617b = imageView;
        imageView.setImageResource(R.drawable.ic_single_window_bubble);
        imageView.setPadding(e(18), e(18), e(18), e(18));
        imageView.setContentDescription(e0.m.h(new byte[]{105, -109, -112, -50, 77, 69, -92, -103, -103, -35, -1, -91, 29, 40, -52, -7, 2, -35, -2, -92, 43, 40, -63, -7, 4, -35, -8, -92, 36, -42, 84, -7, 36, -35, -16, -92, 43, 40, -56, -7, 1, -36, -62, -92, 40, -44, 84, -8, 62, -36, -62, -92, 35, 40, -59, -8, 50, 45, -111, -12, 77, 72, -91, -88, 105, -73, -111, -12, 76, 115, -91, -85, 104, -127, 123, 84, 76, 123, -92, -99, 105, -72, -111, -12, 77, 78, -92, -111, 105, -65, -112, -60, 77, 65, -91, -85, 105, -72, 96, -92, 41, 40, -49, -8, 54, 45, -112, -53, 77, 77, -91, -87, 105, -72, -112, -56, 77, 77, -91, -96, 105, -72, -112, -55, 77, 64, -91, -90}, new byte[]{-71, 13, 64, 116, -99, -8, 116, 41}));
        imageView.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e(80), e(80));
        layoutParams.gravity = 1;
        addView(imageView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.c = scrollView;
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, 0, 0, e(8));
        scrollView.addView(linearLayout2);
        scrollView.setVisibility(8);
        addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        c();
        String loadString = h0.b.o().loadString(e0.m.h(new byte[]{-65, -10, -69, -3, 91, 114, -22, -37, -126, -5, -70, -19, 96, 126, -39, -43, -119, -21, -118, -24, 82, 116, -40, -36, -104}, new byte[]{-20, -97, -43, -102, 55, 23, -67, -78}), "");
        if (!loadString.isEmpty()) {
            arrayList.addAll(Arrays.asList(loadString.split(e0.m.h(new byte[]{73}, new byte[]{114, -29, -37, 59, -46, 81, 97, -17}))));
        }
    }

    public final void a(String str) {
        try {
            PackageManager packageManager = getContext().getPackageManager();
            if (packageManager.getLaunchIntentForPackage(str) != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.setPadding(e(4), e(8), e(4), e(8));
                ImageView imageView = new ImageView(getContext());
                imageView.setImageDrawable(packageManager.getApplicationIcon(applicationInfo));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(e(64), e(64)));
                linearLayout.addView(d(charSequence));
                linearLayout.setContentDescription(charSequence);
                linearLayout.setOnClickListener(new r0(this, str, 1));
                this.d.addView(linearLayout);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String b(String str) {
        if (str == null) {
            return e0.m.h(new byte[]{-57, 60, -64, -104, -41, -90, 79, -33, -57, 30, -64, -111, -42, -101, -66, -113, -88, ByteCompanionObject.MAX_VALUE, -111, -61, -65, -57, 37, -113, -87, 126, -89, -61, -78, -57, 35, -113, -81, 126, -92}, new byte[]{23, -82, 17, 19, 7, 23, -98, 95});
        }
        try {
            PackageManager packageManager = getContext().getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    public final void c() {
        float f8;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-12349720, -13480523});
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(e(1), -7223041);
        this.f5617b.setBackground(gradientDrawable);
        if (this.f5626n) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-15194830);
            gradientDrawable2.setCornerRadius(e(24));
            setBackground(gradientDrawable2);
        } else {
            setBackground(null);
        }
        if (this.f5626n) {
            f8 = 1.0f;
        } else {
            f8 = 0.5f;
        }
        setAlpha(f8);
    }

    public final TextView d(String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(0, e(4), 0, 0);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            setAlpha(1.0f);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return dispatchTouchEvent;
        }
        post(new e0.e(this, 1));
        return dispatchTouchEvent;
    }

    public final int e(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final void f(e4.o oVar) {
        if (!this.f5627o && this.f5623k != null && this.f5625m != null) {
            if (this.f5618f) {
                l();
            }
            this.f5627o = true;
            h();
            this.f5623k.execute(new androidx.activity.f(this, oVar, Math.min(e(LocationRequestCompat.QUALITY_LOW_POWER), o().width() / 3) + this.f5625m.x, 11));
        }
    }

    public final void g() {
        if (!this.f5618f) {
            return;
        }
        this.f5618f = false;
        this.f5628p++;
        this.e.setVisibility(8);
        this.f5617b.setVisibility(0);
        WindowManager.LayoutParams layoutParams = this.f5625m;
        if (layoutParams != null) {
            layoutParams.x = this.f5619g;
            layoutParams.y = this.f5620h;
        }
        h();
    }

    public final void h() {
        int e;
        int e6;
        if (this.f5624l != null && this.f5625m != null) {
            Rect o5 = o();
            this.f5625m.gravity = 51;
            int min = Math.min(e(LocationRequestCompat.QUALITY_LOW_POWER), o5.width() / 3);
            boolean z9 = this.f5626n;
            if (z9 && this.f5618f) {
                this.f5625m.width = Math.min(e(600), o5.width() - e(16));
                this.f5625m.height = Math.min(e(580), o5.height());
                WindowManager.LayoutParams layoutParams = this.f5625m;
                layoutParams.x = Math.max(o5.left, Math.min(this.f5619g, o5.right - layoutParams.width));
                WindowManager.LayoutParams layoutParams2 = this.f5625m;
                layoutParams2.y = Math.max(o5.top, Math.min(this.f5620h, o5.bottom - layoutParams2.height));
                if (isAttachedToWindow()) {
                    this.f5624l.updateViewLayout(this, this.f5625m);
                    return;
                }
                return;
            }
            WindowManager.LayoutParams layoutParams3 = this.f5625m;
            if (z9) {
                e = min;
            } else {
                e = e(80);
            }
            layoutParams3.width = e;
            WindowManager.LayoutParams layoutParams4 = this.f5625m;
            layoutParams4.x = Math.max(o5.left, Math.min(layoutParams4.x, (o5.right - min) - Math.min(e(160), o5.width() / 3)));
            WindowManager.LayoutParams layoutParams5 = this.f5625m;
            layoutParams5.y = Math.max(o5.top, Math.min(layoutParams5.y, o5.bottom - e(80)));
            if (this.f5626n) {
                WindowManager.LayoutParams layoutParams6 = this.f5625m;
                layoutParams6.y = Math.min(layoutParams6.y, Math.max(o5.top, o5.bottom - e(240)));
            }
            WindowManager.LayoutParams layoutParams7 = this.f5625m;
            if (this.f5626n) {
                e6 = Math.max(e(80), (o5.bottom - e(8)) - this.f5625m.y);
            } else {
                e6 = e(80);
            }
            layoutParams7.height = e6;
            h0.b.o().saveInt(e0.m.h(new byte[]{117, 115, 103, 86, 94, -11, 28, 81, 64, 76, 110, 115, 65, -8, 24, 81, 71, 64, 88, 104, 89, -10, 23, 81, 99, 118, 101, 101, 88, -26, 35}, new byte[]{52, 31, 11, 1, 55, -111, 123, 52}), this.f5625m.x);
            h0.b.o().saveInt(e0.m.h(new byte[]{-115, 100, -68, 21, 122, -20, 66, 74, -72, 91, -75, 48, 101, -31, 70, 74, -65, 87, -125, 43, 125, -17, 73, 74, -101, 97, -66, 38, 124, -1, 124}, new byte[]{-52, 8, -48, 66, 19, -120, 37, 47}), this.f5625m.y);
            if (isAttachedToWindow()) {
                this.f5624l.updateViewLayout(this, this.f5625m);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        int i10;
        String i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        LinearLayout.LayoutParams layoutParams;
        String h2;
        int i15;
        boolean z10;
        LinearLayout linearLayout = this.e;
        linearLayout.removeAllViews();
        int i16 = 8;
        View k6 = k(e0.m.h(new byte[]{-53, 40, 54, 37, -30, -19, 69, -75, -105, 120, 56, -43, 118, -19, 84, -76, -85, 121, 3, 37, 18, -121, 52, -37, -7, 20, 95, -76, 18, -123, 52, -40, -7, 24, 94, -125, 18, -123, 53, -21}, new byte[]{41, -88, -113, 5, -62, Base64.padSymbol, -28, 101}));
        int i17 = 0;
        Object[] objArr = 0;
        k6.setOnClickListener(new s0(this, 0 == true ? 1 : 0));
        linearLayout.addView(k6);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        final int i18 = 1;
        int i19 = 2;
        int[] iArr = {1, 2};
        int i20 = 0;
        while (true) {
            i10 = 4;
            if (i20 >= 2) {
                break;
            }
            final int i21 = iArr[i20];
            if (i21 == 1) {
                h2 = e0.m.h(new byte[]{79, 30, -79, 69, 41, -88, -41, 124, 78, 58, -80, 116, -39, 50, 38, 45, 30, 111, -36, 39, 65, -51, -79, 45, 28}, new byte[]{-97, -65, 97, -9, -7, 29, 6, -4});
            } else {
                h2 = e0.m.h(new byte[]{-28, 74, -103, 0, 96, -13, -87, 48, -28, 91, 105, -108, -112, -105, -8, 82, -117, 58, -55, 107, 0, -106, -53, 82, -124}, new byte[]{52, -21, 73, -69, -80, 70, 121, -126});
            }
            TextView k10 = k(h2);
            k10.setGravity(17);
            int i22 = this.r;
            if (i21 == 1) {
                if (i22 == 1) {
                    i15 = R.drawable.ic_split_vertical_selected;
                } else {
                    i15 = R.drawable.ic_split_vertical;
                }
            } else if (i22 == 2) {
                i15 = R.drawable.ic_split_horizontal_selected;
            } else {
                i15 = R.drawable.ic_split_horizontal;
            }
            k10.setCompoundDrawablesWithIntrinsicBounds(i15, 0, 0, 0);
            if (this.r == i21) {
                z10 = true;
            } else {
                z10 = false;
            }
            k10.setBackground(m(z10));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, e(60), 1.0f);
            layoutParams2.setMargins(e(4), 0, e(4), e(4));
            linearLayout2.addView(k10, layoutParams2);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            k10.setOnClickListener(new View.OnClickListener(this) { // from class: s1.t0
                public final /* synthetic */ u0 c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr2) {
                        case 0:
                            int i23 = i21;
                            u0 u0Var = this.c;
                            u0Var.r = i23;
                            u0Var.i();
                            return;
                        default:
                            int i24 = i21;
                            u0 u0Var2 = this.c;
                            u0Var2.f5630s = i24;
                            u0Var2.i();
                            return;
                    }
                }
            });
            i20++;
        }
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        int[] iArr2 = {30, 50, 70};
        int i23 = 0;
        while (i23 < 3) {
            final int i24 = iArr2[i23];
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setOrientation(1);
            linearLayout4.setPadding(e(i16), e(6), e(i16), e(i10));
            if (this.f5630s == i24) {
                z9 = true;
            } else {
                z9 = i17 == true ? 1 : 0;
            }
            linearLayout4.setBackground(m(z9));
            LinearLayout linearLayout5 = new LinearLayout(getContext());
            if (this.r == 1) {
                i12 = 1;
            } else {
                i12 = i17 == true ? 1 : 0;
            }
            linearLayout5.setOrientation(i12);
            int i25 = i17 == true ? 1 : 0;
            while (i25 < i19) {
                View view = new View(getContext());
                if (i25 == 0) {
                    i13 = -8996097;
                } else {
                    i13 = -12030569;
                }
                view.setBackgroundColor(i13);
                if (i25 == 0) {
                    i14 = i24;
                } else {
                    i14 = 100 - i24;
                }
                if (this.r == 1) {
                    layoutParams = new LinearLayout.LayoutParams(-1, i17, i14);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(i17, -1, i14);
                }
                layoutParams.setMargins(e(1), e(1), e(1), e(1));
                linearLayout5.addView(view, layoutParams);
                i25++;
                i17 = 0;
                i19 = 2;
            }
            linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(-1, e(24)));
            TextView textView = new TextView(getContext());
            textView.setText(i24 + e0.m.h(new byte[]{40, -61, 76}, new byte[]{8, -20, 108, -79, -107, -15, 0, 22}) + (100 - i24));
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setTextSize(14.0f);
            linearLayout4.addView(textView);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, e(60), 1.0f);
            layoutParams3.setMargins(e(4), 0, e(4), 0);
            linearLayout3.addView(linearLayout4, layoutParams3);
            linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: s1.t0
                public final /* synthetic */ u0 c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            int i232 = i24;
                            u0 u0Var = this.c;
                            u0Var.r = i232;
                            u0Var.i();
                            return;
                        default:
                            int i242 = i24;
                            u0 u0Var2 = this.c;
                            u0Var2.f5630s = i242;
                            u0Var2.i();
                            return;
                    }
                }
            });
            i23++;
            i17 = 0;
            i10 = 4;
            i16 = 8;
            i19 = 2;
        }
        linearLayout.addView(linearLayout3);
        if (this.f5629q == null) {
            i11 = e0.m.h(new byte[]{-15, -53, -19, -88, -12, -115, -26, -48, 113, 53, 120, -87, -26, -116, -43, -47, 66, 53, 120, 88, -74, -29, -67, -75, 17, 101, 29, -54, -74, -30, -67, -75, -32, 53, 114, -87, -26, -116, -43, -48, 123, 53, 115, -88, -48, -116, -40, -48, 125, 53, 117, -88, -45, 124, -81, -73, -32, 53, 86, -88, -34, -115, -20, -47, 66, 53, 125, -88, -33, -115, -17, -48, 117, -59, 28, -7, -74, -23, -68, -126, 16, 95, 28, -5, 70, -116, -33, -48, 113, 53, 115, -88, -36}, new byte[]{-64, -27, -51, 120, 102, 92, 109, 0});
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(e0.m.h(new byte[]{90, 35, -86, -17, 65, 42, -118, -67, -39, -35, 63, -18, 83, 43, -71, -68, -22, -35, 63, 31, 3, 73, -48, -17, -72, -77, 91, -65, 3, 69, -47, -40, 72, -17, 10, -85, -13, 43, -66, -67, -40, -36, 10, -17, 99, -37, -47, -45, -71, -113, 90, -123, 2, 123, -47, -45, -72, -72, 91, -67, 2, 122, -48, -30, 98, -35, 21, -17, 102, 42, -127, -67, -38, -35, 52, -17, 102, -63, 33}, new byte[]{104, 13, -118, 63, -45, -5, 1, 109}));
            sb.append(b(this.f5629q));
            i11 = com.google.protobuf.q.i(new byte[]{-87, 109, 48, -123}, new byte[]{-119, 77, -13, 18, 33, 55, -126, 124}, sb);
        }
        TextView k11 = k(i11);
        k11.setTextSize(13.0f);
        k11.setMaxLines(2);
        k11.setEllipsize(TextUtils.TruncateAt.END);
        k11.setOnClickListener(new s0(this, i18));
        linearLayout.addView(k11);
    }

    public final void j() {
        int i10;
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        int i11 = 1;
        horizontalScrollView.setHorizontalScrollBarEnabled(true);
        GridLayout gridLayout = new GridLayout(getContext());
        this.t = gridLayout;
        gridLayout.setOrientation(1);
        this.t.setRowCount(3);
        WindowManager.LayoutParams layoutParams = this.f5625m;
        if (layoutParams == null) {
            i10 = e(600);
        } else {
            i10 = layoutParams.width;
        }
        int max = i10 / Math.max(1, i10 / e(FTPReply.SERVICE_NOT_READY));
        ArrayList arrayList = this.f5621i;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ResolveInfo resolveInfo = (ResolveInfo) obj;
            String str = resolveInfo.activityInfo.packageName;
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setTag(str);
            linearLayout2.setOrientation(i11);
            linearLayout2.setGravity(17);
            linearLayout2.setPadding(e(5), e(6), e(5), e(4));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(resolveInfo.loadIcon(getContext().getPackageManager()));
            linearLayout2.addView(imageView, new LinearLayout.LayoutParams(e(64), e(64)));
            TextView textView = new TextView(getContext());
            textView.setText(resolveInfo.loadLabel(getContext().getPackageManager()));
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setGravity(17);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout2.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setContentDescription(textView.getText());
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
            layoutParams2.width = max - e(8);
            layoutParams2.height = e(FTPReply.SERVICE_NOT_READY);
            layoutParams2.setMargins(e(4), e(4), e(4), e(4));
            this.t.addView(linearLayout2, layoutParams2);
            linearLayout2.setOnClickListener(new r0(this, str, 0));
            i11 = 1;
        }
        horizontalScrollView.addView(this.t);
        linearLayout.addView(horizontalScrollView);
        n();
    }

    public final TextView k(String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setGravity(16);
        textView.setMinHeight(e(56));
        textView.setPadding(e(8), e(8), e(8), e(8));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.u0.l():void");
    }

    public final GradientDrawable m(boolean z9) {
        int i10;
        int i11;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z9) {
            i10 = -14132840;
        } else {
            i10 = -14404284;
        }
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(e(12));
        int e = e(1);
        if (z9) {
            i11 = -7223041;
        } else {
            i11 = -12561304;
        }
        gradientDrawable.setStroke(e, i11);
        return gradientDrawable;
    }

    public final void n() {
        if (this.t != null) {
            for (int i10 = 0; i10 < this.t.getChildCount(); i10++) {
                View childAt = this.t.getChildAt(i10);
                boolean equals = childAt.getTag().equals(this.f5629q);
                childAt.setSelected(equals);
                childAt.setBackground(m(equals));
            }
        }
    }

    public final Rect o() {
        WindowManager windowManager;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i10;
        int i11;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT >= 30 && (windowManager = this.f5624l) != null) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            displayCutout = WindowInsets.Type.displayCutout();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars | displayCutout);
            bounds = currentWindowMetrics.getBounds();
            Rect rect = new Rect(bounds);
            int i14 = rect.left;
            i10 = insetsIgnoringVisibility.left;
            int i15 = i10 + i14;
            int i16 = rect.top;
            i11 = insetsIgnoringVisibility.top;
            int i17 = i11 + i16;
            int i18 = rect.right;
            i12 = insetsIgnoringVisibility.right;
            int i19 = i18 - i12;
            int i20 = rect.bottom;
            i13 = insetsIgnoringVisibility.bottom;
            rect.set(i15, i17, i19, i20 - i13);
            return rect;
        }
        Point point = new Point();
        WindowManager windowManager2 = this.f5624l;
        if (windowManager2 != null) {
            windowManager2.getDefaultDisplay().getRealSize(point);
        } else {
            point.set(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        }
        WindowInsets rootWindowInsets = getRootWindowInsets();
        if (rootWindowInsets != null) {
            return new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), point.x - rootWindowInsets.getStableInsetRight(), point.y - rootWindowInsets.getStableInsetBottom());
        }
        return new Rect(0, 0, point.x, point.y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5623k = Executors.newSingleThreadExecutor();
        post(new e0.e(this, 2));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new e0.e(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5628p++;
        ExecutorService executorService = this.f5623k;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.f5623k = null;
        this.f5627o = false;
        super.onDetachedFromWindow();
    }
}
