package d4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;
import s3.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1804b = 1;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        setWillNotDraw(false);
    }

    public void a(int i10) {
        TabLayout tabLayout = (TabLayout) this.d;
        if (tabLayout.W != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i10);
        c5.e eVar = tabLayout.K;
        Drawable drawable = tabLayout.f1433p;
        eVar.getClass();
        RectF p9 = c5.e.p(tabLayout, childAt);
        drawable.setBounds((int) p9.left, drawable.getBounds().top, (int) p9.right, drawable.getBounds().bottom);
        tabLayout.f1422b = i10;
    }

    public void b(int i10) {
        TabLayout tabLayout = (TabLayout) this.d;
        Rect bounds = tabLayout.f1433p.getBounds();
        tabLayout.f1433p.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public void c(View view, View view2, float f8) {
        TabLayout tabLayout = (TabLayout) this.d;
        if (view != null && view.getWidth() > 0) {
            tabLayout.K.u(tabLayout, view, view2, f8, tabLayout.f1433p);
        } else {
            Drawable drawable = tabLayout.f1433p;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f1433p.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public void d(int i10, int i11, boolean z9) {
        TabLayout tabLayout = (TabLayout) this.d;
        if (tabLayout.f1422b == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f1422b = i10;
        g gVar = new g(this, childAt, childAt2);
        if (z9) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.c = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.L);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(gVar);
            valueAnimator.start();
            return;
        }
        ((ValueAnimator) this.c).removeAllUpdateListeners();
        ((ValueAnimator) this.c).addUpdateListener(gVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int height;
        switch (this.f1804b) {
            case 0:
                TabLayout tabLayout = (TabLayout) this.d;
                int height2 = tabLayout.f1433p.getBounds().height();
                if (height2 < 0) {
                    height2 = tabLayout.f1433p.getIntrinsicHeight();
                }
                int i10 = tabLayout.D;
                if (i10 != 0) {
                    if (i10 != 1) {
                        height = 0;
                        if (i10 != 2) {
                            if (i10 != 3) {
                                height2 = 0;
                            } else {
                                height2 = getHeight();
                            }
                        }
                    } else {
                        height = (getHeight() - height2) / 2;
                        height2 = (getHeight() + height2) / 2;
                    }
                } else {
                    height = getHeight() - height2;
                    height2 = getHeight();
                }
                if (tabLayout.f1433p.getBounds().width() > 0) {
                    Rect bounds = tabLayout.f1433p.getBounds();
                    tabLayout.f1433p.setBounds(bounds.left, height, bounds.right, height2);
                    tabLayout.f1433p.draw(canvas);
                }
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.f1804b) {
            case 1:
                super.onDraw(canvas);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e0.m.h(new byte[]{-75, 40, -27, -54, -11}, new byte[]{-3, 96, -33, -89, -104, 60, -48, -93}), Locale.getDefault());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -4, -60, -38, 76, -100, -71, 74}, new byte[]{27, -104, -2, -105, 1, -90, -64, 51}), Locale.getDefault());
                Date date = new Date();
                ((TextView) this.c).setText(simpleDateFormat.format(date));
                ((TextView) this.d).setText(simpleDateFormat2.format(date));
                postInvalidateDelayed(10000L);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        switch (this.f1804b) {
            case 0:
                TabLayout tabLayout = (TabLayout) this.d;
                super.onLayout(z9, i10, i11, i12, i13);
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    d(tabLayout.getSelectedTabPosition(), -1, false);
                    return;
                }
                if (tabLayout.f1422b == -1) {
                    tabLayout.f1422b = tabLayout.getSelectedTabPosition();
                }
                a(tabLayout.f1422b);
                return;
            default:
                super.onLayout(z9, i10, i11, i12, i13);
                return;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.f1804b) {
            case 0:
                TabLayout tabLayout = (TabLayout) this.d;
                super.onMeasure(i10, i11);
                if (View.MeasureSpec.getMode(i10) == 1073741824) {
                    boolean z9 = true;
                    if (tabLayout.B == 1 || tabLayout.E == 2) {
                        int childCount = getChildCount();
                        int i12 = 0;
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = getChildAt(i13);
                            if (childAt.getVisibility() == 0) {
                                i12 = Math.max(i12, childAt.getMeasuredWidth());
                            }
                        }
                        if (i12 > 0) {
                            if (i12 * childCount <= getMeasuredWidth() - (((int) q.a(16, getContext())) * 2)) {
                                boolean z10 = false;
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                                    if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                                        layoutParams.width = i12;
                                        layoutParams.weight = 0.0f;
                                        z10 = true;
                                    }
                                }
                                z9 = z10;
                            } else {
                                tabLayout.B = 0;
                                tabLayout.p(false);
                            }
                            if (z9) {
                                super.onMeasure(i10, i11);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public /* synthetic */ h(Context context) {
        super(context);
    }
}
