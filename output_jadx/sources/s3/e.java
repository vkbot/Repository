package s3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import org.apache.commons.net.nntp.NNTP;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e extends LinearLayoutCompat {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f5689b;
    public final Rect c;
    public final Rect d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5690f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5691g;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = NNTP.DEFAULT_PORT;
        this.f5690f = true;
        this.f5691g = false;
        TypedArray d = l.d(context, attributeSet, a3.a.f15l, 0, 0, new int[0]);
        this.e = d.getInt(1, this.e);
        Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5690f = d.getBoolean(2, true);
        d.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5689b;
        if (drawable != null) {
            if (this.f5691g) {
                this.f5691g = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z9 = this.f5690f;
                Rect rect = this.c;
                if (z9) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.e;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.d;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f8, float f10) {
        super.drawableHotspotChanged(f8, f10);
        Drawable drawable = this.f5689b;
        if (drawable != null) {
            drawable.setHotspot(f8, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5689b;
        if (drawable != null && drawable.isStateful()) {
            this.f5689b.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f5689b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5689b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        this.f5691g = z9 | this.f5691g;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5691g = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f5689b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5689b);
            }
            this.f5689b = drawable;
            this.f5691g = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.e = i10;
            if (i10 == 119 && this.f5689b != null) {
                this.f5689b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f5689b) {
            return false;
        }
        return true;
    }
}
