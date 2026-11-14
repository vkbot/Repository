package z1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends TextView {
    public static final PorterDuffXfermode t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: b, reason: collision with root package name */
    public int f6711b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f6712f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6713g;

    /* renamed from: h, reason: collision with root package name */
    public int f6714h;

    /* renamed from: i, reason: collision with root package name */
    public int f6715i;

    /* renamed from: j, reason: collision with root package name */
    public int f6716j;

    /* renamed from: k, reason: collision with root package name */
    public int f6717k;

    /* renamed from: l, reason: collision with root package name */
    public int f6718l;

    /* renamed from: m, reason: collision with root package name */
    public int f6719m;

    /* renamed from: n, reason: collision with root package name */
    public FloatingActionButton f6720n;

    /* renamed from: o, reason: collision with root package name */
    public Animation f6721o;

    /* renamed from: p, reason: collision with root package name */
    public Animation f6722p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6723q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public GestureDetector f6724s;

    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.e = floatingActionButton.getShadowColor();
        this.f6711b = floatingActionButton.getShadowRadius();
        this.c = floatingActionButton.getShadowXOffset();
        this.d = floatingActionButton.getShadowYOffset();
        this.f6713g = floatingActionButton.f();
    }

    public final RippleDrawable a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, b(this.f6717k));
        stateListDrawable.addState(new int[0], b(this.f6716j));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f6718l}), stateListDrawable, null);
        setOutlineProvider(new a(1));
        setClipToOutline(true);
        this.f6712f = rippleDrawable;
        return rippleDrawable;
    }

    public final ShapeDrawable b(int i10) {
        float f8 = this.f6719m;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f8, f8, f8, f8, f8, f8, f8, f8}, null, null));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public final void c() {
        if (this.f6723q) {
            this.f6712f = getBackground();
        }
        Drawable drawable = this.f6712f;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_pressed});
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void d() {
        if (this.f6723q) {
            this.f6712f = getBackground();
        }
        Drawable drawable = this.f6712f;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[0]);
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void e() {
        LayerDrawable layerDrawable;
        if (this.f6713g) {
            layerDrawable = new LayerDrawable(new Drawable[]{new j(this), a()});
            layerDrawable.setLayerInset(1, Math.abs(this.c) + this.f6711b, Math.abs(this.d) + this.f6711b, Math.abs(this.c) + this.f6711b, Math.abs(this.d) + this.f6711b);
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{a()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (this.f6714h == 0) {
            this.f6714h = getMeasuredWidth();
        }
        int measuredWidth = getMeasuredWidth();
        int i13 = 0;
        if (this.f6713g) {
            i12 = Math.abs(this.c) + this.f6711b;
        } else {
            i12 = 0;
        }
        int i14 = i12 + measuredWidth;
        if (this.f6715i == 0) {
            this.f6715i = getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f6713g) {
            i13 = Math.abs(this.d) + this.f6711b;
        }
        setMeasuredDimension(i14, measuredHeight + i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingActionButton floatingActionButton = this.f6720n;
        if (floatingActionButton != null && floatingActionButton.getOnClickListener() != null && this.f6720n.isEnabled()) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 3) {
                    d();
                    this.f6720n.i();
                }
            } else {
                d();
                this.f6720n.i();
            }
            this.f6724s.onTouchEvent(motionEvent);
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i10) {
        this.f6719m = i10;
    }

    public void setFab(FloatingActionButton floatingActionButton) {
        this.f6720n = floatingActionButton;
        setShadow(floatingActionButton);
    }

    public void setHandleVisibilityChanges(boolean z9) {
        this.r = z9;
    }

    public void setHideAnimation(Animation animation) {
        this.f6722p = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.f6721o = animation;
    }

    public void setShowShadow(boolean z9) {
        this.f6713g = z9;
    }

    public void setUsingStyle(boolean z9) {
        this.f6723q = z9;
    }
}
