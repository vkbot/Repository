package s1;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n extends FrameLayout {
    public static final String t = e0.m.h(new byte[]{-51, -118, -25, 90, -127, 11, 106, -16, -2, -113, -3, 87, -119, 60, 110, -31, -43, -126, -3, 90, -67}, new byte[]{-95, -21, -110, 52, -30, 99, 15, -126});

    /* renamed from: u, reason: collision with root package name */
    public static final String f5559u = e0.m.h(new byte[]{-111, -5, -77, -55, -94, 81, -89, -51, -78, -8, -117, -31, -124, 122, -96, -49, -93, -52, -110, -27, -104, 122, -71, -18, -93, -35, -102, -58, -103, 124, -125, -53, -89, -39, -66, -16, -122}, new byte[]{-62, -85, -1, ByteCompanionObject.MIN_VALUE, -10, 14, -26, -67});

    /* renamed from: b, reason: collision with root package name */
    public final r f5560b;
    public final LinearLayout c;
    public final FrameLayout d;
    public final ScrollView e;

    /* renamed from: f, reason: collision with root package name */
    public final HorizontalScrollView f5561f;

    /* renamed from: g, reason: collision with root package name */
    public final GridLayout f5562g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f5563h;

    /* renamed from: i, reason: collision with root package name */
    public final e0.d f5564i;

    /* renamed from: j, reason: collision with root package name */
    public WindowManager f5565j;

    /* renamed from: k, reason: collision with root package name */
    public WindowManager.LayoutParams f5566k;

    /* renamed from: l, reason: collision with root package name */
    public m f5567l;

    /* renamed from: m, reason: collision with root package name */
    public l f5568m;

    /* renamed from: n, reason: collision with root package name */
    public int f5569n;

    /* renamed from: o, reason: collision with root package name */
    public int f5570o;

    /* renamed from: p, reason: collision with root package name */
    public int f5571p;

    /* renamed from: q, reason: collision with root package name */
    public int f5572q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public int f5573s;

    static {
        e0.m.h(new byte[]{110, 6, -111, 107, 44, -48, 5, 107, 91, 57, -104, 78, 51, -35, 1, 107, 92, 53, -79, 93, 48, -38, 1, 102, 74, 24, -87, 78, 36, -51}, new byte[]{47, 106, -3, 60, 69, -76, 98, 14});
    }

    public n(Context context) {
        super(context);
        this.f5564i = new e0.d(this, 1);
        this.f5567l = m.c;
        this.f5568m = l.c;
        r rVar = new r(context);
        this.f5560b = rVar;
        rVar.a(context);
        setClipChildren(false);
        setClipToPadding(false);
        setClickable(true);
        setFocusable(false);
        setElevation(e(18));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(e(7), e(7), e(7), e(7));
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        this.f5563h = textView;
        textView.setGravity(17);
        textView.setText(e0.m.h(new byte[]{-114, 71, 99}, new byte[]{-60, 4, 55, 56, -21, 113, -51, 0}));
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setContentDescription(e0.m.h(new byte[]{-68, ByteCompanionObject.MAX_VALUE, 26, 20, 108, 52, -3, -48, -67, 106, 26, 20, 109, 2, 12, ByteCompanionObject.MIN_VALUE, -45, 49, 123, 70, 1, 94, -103, ByteCompanionObject.MIN_VALUE, -41, 48, 71, -74, 108, 53, -4, -32, -67, 98, 27, 43, 109, 9, -4, -27, -67, 97, 27, 38, -110, -82, -4, -13, -68, 85, 27, 35, 109, 14, -4, -26, -68, 89, 27, 36, 108, 62, -4, -23, -67, 99, 27, 35, -100, 94, -104, ByteCompanionObject.MIN_VALUE, -41, 48, 68, -74, 108, 49, -4, -27, -67, 97, 27, 35, 108, 50, -4, -27, -67, 104, 27, 35, 108, 51, -4, -24, -67, 110}, new byte[]{108, -31, -53, -106, -68, -114, 44, 80}));
        textView.setClickable(false);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(e(62), e(62)));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(1);
        scrollView.setFillViewport(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f5561f = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setOverScrollMode(1);
        horizontalScrollView.setFillViewport(false);
        horizontalScrollView.setVisibility(8);
        frameLayout.setOverScrollMode(1);
        GridLayout gridLayout = new GridLayout(context);
        this.f5562g = gridLayout;
        gridLayout.setColumnCount(4);
        gridLayout.setAlignmentMode(0);
        gridLayout.setUseDefaultMargins(false);
        gridLayout.setPadding(e(4), e(4), e(4), e(4));
        scrollView.addView(gridLayout, new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(horizontalScrollView, new FrameLayout.LayoutParams(-1, -1));
        int[] n10 = n(this.f5567l);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(n10[0], n10[1]));
        i();
        c();
        l();
    }

    public final ImageButton a(String str, Drawable drawable) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setPadding(e(7), e(7), e(7), e(7));
        imageButton.setBackground(k(-14273469, 16, -12889497));
        if (str == null) {
            str = e0.m.h(new byte[]{33, 102, 4, -60, 10, 3, -49, 40, 32, 112, 4, -61, 10, 2, -50, 28}, new byte[]{-15, -14, -44, 113, -38, -70, 30, -87});
        }
        imageButton.setContentDescription(str);
        imageButton.setOnTouchListener(new e4.i(2, this));
        return imageButton;
    }

    public final void b(j0.e eVar) {
        if (!j0.f.d(eVar)) {
            return;
        }
        ImageButton a10 = a(eVar.f3099i, eVar.f3100j);
        a10.setOnClickListener(new androidx.navigation.ui.a(18, this, eVar));
        this.f5562g.addView(a10, h());
    }

    public final void c() {
        boolean z9 = this.r;
        FrameLayout frameLayout = this.d;
        LinearLayout linearLayout = this.c;
        TextView textView = this.f5563h;
        if (z9) {
            linearLayout.setBackground(null);
            frameLayout.setBackground(k(-300869341, 22, -12229253));
            textView.setBackground(k(-16220769, 17, -10102543));
            textView.setText(e0.m.h(new byte[]{-83, 105, -79, 101, -72, -84, 10, -13, -19}, new byte[]{79, -23, 19, -121, 56, 14, -24, 115}));
            textView.setTextSize(18.0f);
            return;
        }
        frameLayout.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-232639421, -234391912});
        gradientDrawable.setCornerRadius(e(22));
        gradientDrawable.setStroke(e(1), -9641995);
        linearLayout.setBackground(gradientDrawable);
        textView.setBackground(null);
        textView.setText(e0.m.h(new byte[]{65, -43, 21}, new byte[]{11, -106, 65, -22, 49, -54, -32, -106}));
        textView.setTextSize(12.0f);
    }

    public final void d(m mVar) {
        int i10;
        boolean z9;
        boolean z10;
        GridLayout gridLayout;
        int i11;
        ViewGroup viewGroup;
        int i12;
        int i13;
        int i14;
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        if (mVar != m.d && mVar != m.e) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        linearLayout.setOrientation(i10);
        r rVar = this.f5560b;
        if (rVar.e() == q.c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 ? mVar == m.f5548b || mVar == m.c : rVar.d() == p.f5577b) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = 0;
        while (true) {
            gridLayout = this.f5562g;
            if (i15 >= gridLayout.getChildCount()) {
                break;
            }
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) gridLayout.getChildAt(i15).getLayoutParams();
            layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE);
            layoutParams.rowSpec = GridLayout.spec(Integer.MIN_VALUE);
            gridLayout.getChildAt(i15).setLayoutParams(layoutParams);
            i15++;
        }
        if (z9) {
            if (z10) {
                i11 = Math.max(1, gridLayout.getChildCount());
            } else {
                i11 = 1;
            }
        } else {
            i11 = 4;
        }
        gridLayout.setColumnCount(i11);
        ViewGroup viewGroup2 = (ViewGroup) gridLayout.getParent();
        ScrollView scrollView = this.e;
        HorizontalScrollView horizontalScrollView = this.f5561f;
        if (z9 && z10) {
            viewGroup = horizontalScrollView;
        } else {
            viewGroup = scrollView;
        }
        if (viewGroup2 != viewGroup) {
            if (viewGroup2 != null) {
                viewGroup2.removeView(gridLayout);
            }
            viewGroup.addView(gridLayout, new ViewGroup.LayoutParams(-2, -2));
        }
        int i16 = 8;
        if (viewGroup == horizontalScrollView) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        horizontalScrollView.setVisibility(i12);
        if (viewGroup == scrollView) {
            i16 = 0;
        }
        scrollView.setVisibility(i16);
        l lVar = this.f5568m;
        if (i10 != 0) {
            if (lVar == l.f5534b) {
                i14 = 3;
            } else if (lVar == l.d) {
                i14 = 5;
            } else {
                i14 = 1;
            }
            linearLayout.setGravity(i14);
        } else {
            if (lVar == l.f5534b) {
                i13 = 48;
            } else if (lVar == l.d) {
                i13 = 80;
            } else {
                i13 = 16;
            }
            linearLayout.setGravity(i13);
        }
        int[] n10 = n(this.f5567l);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(n10[0], n10[1]);
        FrameLayout frameLayout = this.d;
        frameLayout.setLayoutParams(layoutParams2);
        m mVar2 = m.f5548b;
        TextView textView = this.f5563h;
        if (mVar != mVar2 && mVar != m.d) {
            linearLayout.addView(textView, new LinearLayout.LayoutParams(e(62), e(62)));
            linearLayout.addView(frameLayout);
        } else {
            linearLayout.addView(frameLayout);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(e(62), e(62)));
        }
    }

    public final int e(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public final int[] f(m mVar) {
        int[] n10 = n(mVar);
        int i10 = n10[0];
        int i11 = n10[1];
        int e = e(14);
        int e6 = e(62);
        if (mVar != m.d && mVar != m.e) {
            return new int[]{e + e6 + i10, Math.max(e6, i11) + e};
        }
        return new int[]{Math.max(e6, i10) + e, e + e6 + i11};
    }

    public final void g() {
        FrameLayout frameLayout = this.d;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(1.0f);
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        frameLayout.setTranslationX(0.0f);
        frameLayout.setTranslationY(0.0f);
        this.f5568m = l.c;
        d(m.c);
        c();
        if (this.f5565j != null && this.f5566k != null) {
            o(this.f5569n, this.f5570o, this.f5571p, this.f5572q, true);
        }
    }

    public final GridLayout.LayoutParams h() {
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = e(78);
        layoutParams.height = e(78);
        layoutParams.setMargins(e(3), e(3), e(3), e(3));
        return layoutParams;
    }

    public final void i() {
        ResolveInfo resolveActivity;
        GridLayout gridLayout = this.f5562g;
        gridLayout.removeAllViews();
        for (int i10 = 0; i10 < 6; i10++) {
            b(j0.f.e(getContext(), t + i10));
        }
        r rVar = this.f5560b;
        if (rVar.f5608a.getBoolean(r.f5603g, false)) {
            String loadString = h0.b.o().loadString(f5559u, "");
            if (!loadString.isEmpty()) {
                int i11 = 0;
                for (String str : loadString.split(e0.m.h(new byte[]{19}, new byte[]{40, -59, 14, -95, 98, 8, 83, -102}))) {
                    j0.e c = j0.f.c(getContext(), str);
                    if (c.f3094a == j0.d.d && j0.f.d(c)) {
                        b(c);
                        i11++;
                        if (i11 >= 6) {
                            break;
                        }
                    }
                }
            }
        }
        if (rVar.f5608a.getBoolean(r.f5602f, false)) {
            PackageManager packageManager = getContext().getPackageManager();
            ArrayList x9 = m0.o.x();
            int size = x9.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = x9.get(i13);
                i13++;
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                if (launchIntentForPackage != null && (resolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0)) != null) {
                    b(j0.e.b(resolveActivity, packageManager));
                    i12++;
                    if (i12 >= 6) {
                        break;
                    }
                }
            }
        }
        ImageButton a10 = a(e0.m.h(new byte[]{93, 72, 83, 125, 57, -117, -97, 9, 92, 85, 83, 115, 56, -77, -98, 49, 93, 109, -93, 29, 83, -38, -2, 90, 14, 5, 62, 28, 111, -38, -5, 90, 13, 5, 51}, new byte[]{-115, -43, -125, -51, -24, 10, 78, -117}), getContext().getDrawable(R.drawable.ic_menu_preferences));
        a10.setOnClickListener(new androidx.navigation.c(18, this));
        gridLayout.addView(a10, h());
    }

    public final void j() {
        removeCallbacks(this.f5564i);
        animate().cancel();
        animate().alpha(1.0f).setDuration(140L).start();
    }

    public final GradientDrawable k(int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(e(i11));
        gradientDrawable.setStroke(e(1), i12);
        return gradientDrawable;
    }

    public final void l() {
        e0.d dVar = this.f5564i;
        removeCallbacks(dVar);
        postDelayed(dVar, 4500L);
    }

    public final void m(boolean z9) {
        float f8;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        m mVar;
        boolean z10;
        int i14;
        int i15;
        l lVar;
        float f11;
        if (this.r == z9) {
            return;
        }
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        int i16 = this.f5573s + 1;
        this.f5573s = i16;
        int i17 = 0;
        if (z9) {
            WindowManager.LayoutParams layoutParams = this.f5566k;
            if (layoutParams == null) {
                i10 = 0;
            } else {
                i10 = layoutParams.x;
            }
            this.f5569n = i10;
            if (layoutParams == null) {
                i11 = 0;
            } else {
                i11 = layoutParams.y;
            }
            this.f5570o = i11;
            this.f5571p = e(76);
            this.f5572q = e(76);
            int i18 = getResources().getDisplayMetrics().widthPixels;
            int i19 = getResources().getDisplayMetrics().heightPixels;
            WindowManager.LayoutParams layoutParams2 = this.f5566k;
            if (layoutParams2 == null) {
                i12 = i18 / 2;
            } else {
                i12 = layoutParams2.x;
            }
            if (layoutParams2 == null) {
                i13 = i19 / 2;
            } else {
                i13 = layoutParams2.y;
            }
            int i20 = (i18 - i12) - this.f5571p;
            int i21 = (i19 - i13) - this.f5572q;
            r rVar = this.f5560b;
            if (rVar.e() == q.c) {
                if (rVar.d() == p.f5577b) {
                    if (i20 >= i12) {
                        mVar = m.c;
                    } else {
                        mVar = m.f5548b;
                    }
                } else if (i21 >= i13) {
                    mVar = m.e;
                } else {
                    mVar = m.d;
                }
            } else {
                m mVar2 = m.c;
                int[] f12 = f(mVar2);
                m mVar3 = m.e;
                int[] f13 = f(mVar3);
                int i22 = f12[0] - this.f5571p;
                int i23 = f13[1] - this.f5572q;
                if (i20 < i22) {
                    if (i12 >= i22) {
                        mVar = m.f5548b;
                    } else {
                        if (i21 < i23) {
                            if (i13 >= i23) {
                                mVar = m.d;
                            } else if (Math.max(i12, i20) >= Math.max(i13, i21)) {
                                if (i20 < i12) {
                                    mVar = m.f5548b;
                                }
                            } else if (i21 < i13) {
                                mVar = m.d;
                            }
                        }
                        mVar = mVar3;
                    }
                }
                mVar = mVar2;
            }
            this.f5567l = mVar;
            int[] f14 = f(mVar);
            m mVar4 = this.f5567l;
            int i24 = f14[0];
            int i25 = f14[1];
            int i26 = getResources().getDisplayMetrics().widthPixels;
            int i27 = getResources().getDisplayMetrics().heightPixels;
            m mVar5 = m.f5548b;
            if (mVar4 != mVar5 && mVar4 != m.c) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i14 = this.f5570o;
            } else {
                i14 = this.f5569n;
            }
            if (z10) {
                i26 = i27;
            }
            if (z10) {
                i15 = this.f5572q;
            } else {
                i15 = this.f5571p;
            }
            if (z10) {
                i24 = i25;
            }
            int i28 = (i26 - i14) - i15;
            int max = Math.max(0, i24 - i15);
            int i29 = max / 2;
            if (i14 >= i29 && i28 >= max - i29) {
                lVar = l.c;
            } else if (i28 >= max) {
                lVar = l.f5534b;
            } else if (i14 >= max) {
                lVar = l.d;
            } else if (i28 >= i14) {
                lVar = l.f5534b;
            } else {
                lVar = l.d;
            }
            this.f5568m = lVar;
            d(this.f5567l);
            this.r = true;
            frameLayout.setVisibility(0);
            c();
            int i30 = f14[0];
            int i31 = f14[1];
            if (this.r && this.f5565j != null && this.f5566k != null) {
                int i32 = this.f5569n;
                int i33 = this.f5570o;
                m mVar6 = this.f5567l;
                if (mVar6 == mVar5) {
                    i32 -= i30 - this.f5571p;
                } else if (mVar6 == m.d) {
                    i33 -= i31 - this.f5572q;
                }
                if (mVar6 != mVar5 && mVar6 != m.c) {
                    int i34 = i30 - this.f5571p;
                    l lVar2 = this.f5568m;
                    if (lVar2 == l.d) {
                        i17 = i34;
                    } else if (lVar2 == l.c) {
                        i17 = i34 / 2;
                    }
                    i32 -= i17;
                } else {
                    int i35 = i31 - this.f5572q;
                    l lVar3 = this.f5568m;
                    if (lVar3 == l.d) {
                        i17 = i35;
                    } else if (lVar3 == l.c) {
                        i17 = i35 / 2;
                    }
                    i33 -= i17;
                }
                o(i32, i33, i30, i31, false);
            }
            float e = e(18);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleX(0.92f);
            frameLayout.setScaleY(0.92f);
            m mVar7 = this.f5567l;
            if (mVar7 == mVar5) {
                f11 = e;
            } else if (mVar7 == m.c) {
                f11 = -e;
            } else {
                f11 = 0.0f;
            }
            frameLayout.setTranslationX(f11);
            m mVar8 = this.f5567l;
            if (mVar8 != m.d) {
                if (mVar8 == m.e) {
                    e = -e;
                } else {
                    e = 0.0f;
                }
            }
            frameLayout.setTranslationY(e);
            frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(220L).start();
            return;
        }
        this.r = false;
        float e6 = e(18);
        m mVar9 = this.f5567l;
        if (mVar9 == m.f5548b) {
            f8 = e6;
        } else {
            f8 = 0.0f;
        }
        if (mVar9 == m.c) {
            f8 = -e6;
        }
        if (mVar9 == m.d) {
            f10 = e6;
        } else {
            f10 = 0.0f;
        }
        if (mVar9 == m.e) {
            f10 = -e6;
        }
        frameLayout.animate().alpha(0.0f).scaleX(0.92f).scaleY(0.92f).translationX(f8).translationY(f10).setDuration(170L).withEndAction(new a4.c(this, i16, 10)).start();
    }

    public final int[] n(m mVar) {
        boolean z9;
        int i10;
        int i11;
        r rVar = this.f5560b;
        boolean z10 = false;
        if (rVar.e() == q.c) {
            z9 = true;
        } else {
            z9 = false;
        }
        int max = Math.max(1, this.f5562g.getChildCount());
        if (z9) {
            if (rVar.d() == p.f5577b) {
                z10 = true;
            }
            int e = e((max * 84) + 8);
            int i12 = getResources().getDisplayMetrics().widthPixels;
            int i13 = getResources().getDisplayMetrics().heightPixels;
            WindowManager.LayoutParams layoutParams = this.f5566k;
            if (layoutParams == null) {
                i10 = i12 / 2;
            } else {
                i10 = this.f5569n;
            }
            if (layoutParams == null) {
                i11 = i13 / 2;
            } else {
                i11 = this.f5570o;
            }
            if (z10) {
                if (mVar != m.f5548b) {
                    i10 = (i12 - i10) - this.f5571p;
                }
                return new int[]{Math.min(e, Math.min(Math.round(i12 * 0.74f), Math.max(e(92), i10))), e(92)};
            }
            if (mVar != m.d) {
                i11 = (i13 - i11) - this.f5572q;
            }
            return new int[]{e(92), Math.min(e, Math.min(Math.round(i13 * 0.74f), Math.max(e(92), i11)))};
        }
        return new int[]{e(344), Math.min(e((Math.min(Math.max(1, (max + 3) / 4), 5) * 84) + 8), Math.round(getResources().getDisplayMetrics().heightPixels * 0.56f))};
    }

    public final void o(int i10, int i11, int i12, int i13, boolean z9) {
        int i14 = getResources().getDisplayMetrics().widthPixels;
        int i15 = getResources().getDisplayMetrics().heightPixels;
        this.f5566k.x = Math.max(0, Math.min(i10, Math.max(0, i14 - i12)));
        this.f5566k.y = Math.max(0, Math.min(i11, Math.max(0, i15 - i13)));
        WindowManager.LayoutParams layoutParams = this.f5566k;
        layoutParams.width = i12;
        layoutParams.height = i13;
        if (z9) {
            h0.b.o().saveInt(e0.m.h(new byte[]{-59, 91, 91, -25, ByteCompanionObject.MAX_VALUE, -34, -82, 125, -16, 100, 82, -62, 96, -45, -86, 125, -9, 104, 123, -47, 99, -44, -86, 112, -31, 69, 99, -62, 119, -61, -111}, new byte[]{-124, 55, 55, -80, 22, -70, -55, 24}), this.f5566k.x);
            h0.b.o().saveInt(e0.m.h(new byte[]{25, -76, -113, 56, 56, -125, -70, -2, 44, -117, -122, 29, 39, -114, -66, -2, 43, -121, -81, 14, 36, -119, -66, -13, Base64.padSymbol, -86, -73, 29, 48, -98, -124}, new byte[]{88, -40, -29, 111, 81, -25, -35, -101}), this.f5566k.y);
        }
        try {
            this.f5565j.updateViewLayout(this, this.f5566k);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        float f8;
        if (this.f5560b.e() == q.c) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f10 = getResources().getDisplayMetrics().widthPixels;
        float f11 = 0.86f;
        if (z9) {
            f8 = 0.86f;
        } else {
            f8 = 0.62f;
        }
        int round = Math.round(f10 * f8);
        float f12 = getResources().getDisplayMetrics().heightPixels;
        if (!z9) {
            f11 = 0.68f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(round, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(f12 * f11), Integer.MIN_VALUE));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this) {
            if (i10 == 0) {
                i();
                j();
                l();
                return;
            }
            removeCallbacks(this.f5564i);
            animate().cancel();
            setAlpha(1.0f);
            boolean z9 = this.r;
            FrameLayout frameLayout = this.d;
            if (!z9 && frameLayout.getVisibility() != 0) {
                return;
            }
            frameLayout.animate().cancel();
            this.r = false;
            this.f5573s++;
            g();
        }
    }
}
