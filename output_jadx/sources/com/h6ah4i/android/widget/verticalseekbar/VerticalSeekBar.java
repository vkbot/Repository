package com.h6ah4i.android.widget.verticalseekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.view.ViewCompat;
import j1.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z6.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VerticalSeekBar extends AppCompatSeekBar {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1647b;
    public Method c;
    public int d;

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 90;
        ViewCompat.setLayoutDirection(this, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6877a, 0, 0);
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer == 90 || integer == 270) {
                this.d = integer;
            }
            obtainStyledAttributes.recycle();
        }
    }

    private VerticalSeekBarWrapper getWrapper() {
        ViewParent parent = getParent();
        if (parent instanceof VerticalSeekBarWrapper) {
            return (VerticalSeekBarWrapper) parent;
        }
        return null;
    }

    public final synchronized void a(int i10) {
        if (this.c == null) {
            try {
                Method declaredMethod = ProgressBar.class.getDeclaredMethod("setProgress", Integer.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                this.c = declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = this.c;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(i10), Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            }
        } else {
            super.setProgress(i10);
        }
        onSizeChanged(super.getWidth(), super.getHeight(), 0, 0);
    }

    public final void b(MotionEvent motionEvent) {
        float f8;
        int paddingLeft = super.getPaddingLeft();
        int paddingRight = super.getPaddingRight();
        int height = getHeight() - paddingLeft;
        int i10 = height - paddingRight;
        int y9 = (int) motionEvent.getY();
        int i11 = this.d;
        float f10 = 0.0f;
        if (i11 != 90) {
            if (i11 != 270) {
                f8 = 0.0f;
            } else {
                f8 = height - y9;
            }
        } else {
            f8 = y9 - paddingLeft;
        }
        if (f8 >= 0.0f && i10 != 0) {
            float f11 = i10;
            f10 = f8 > f11 ? 1.0f : f8 / f11;
        }
        a((int) (f10 * getMax()));
    }

    public final boolean c() {
        return !isInEditMode();
    }

    public int getRotationAngle() {
        return this.d;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            if (!c()) {
                int i10 = this.d;
                if (i10 != 90) {
                    if (i10 == 270) {
                        canvas.rotate(-90.0f);
                        canvas.translate(-super.getHeight(), 0.0f);
                    }
                } else {
                    canvas.rotate(90.0f);
                    canvas.translate(0.0f, -super.getWidth());
                }
            }
            super.onDraw(canvas);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0013, code lost:
    
        if (r4.d == 90) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0015, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:
    
        if (r4.d == 270) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    @Override // android.widget.AbsSeekBar, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L37
            r0 = -1
            r1 = 0
            r2 = 1
            switch(r5) {
                case 19: goto L18;
                case 20: goto Lf;
                case 21: goto Le;
                case 22: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = r1
            goto L1f
        Le:
            return r1
        Lf:
            int r1 = r4.d
            r3 = 90
            if (r1 != r3) goto L16
        L15:
            r0 = r2
        L16:
            r1 = r2
            goto L1f
        L18:
            int r1 = r4.d
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L16
            goto L15
        L1f:
            if (r1 == 0) goto L37
            int r5 = r4.getKeyProgressIncrement()
            int r6 = r4.getProgress()
            int r0 = r0 * r5
            int r0 = r0 + r6
            if (r0 < 0) goto L36
            int r5 = r4.getMax()
            if (r0 > r5) goto L36
            r4.a(r0)
        L36:
            return r2
        L37:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h6ah4i.android.widget.verticalseekbar.VerticalSeekBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        try {
            if (c()) {
                super.onMeasure(i10, i11);
            } else {
                super.onMeasure(i11, i10);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (isInEditMode() && layoutParams != null && layoutParams.height >= 0) {
                    setMeasuredDimension(super.getMeasuredHeight(), layoutParams.height);
                } else {
                    setMeasuredDimension(super.getMeasuredHeight(), super.getMeasuredWidth());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (c()) {
            super.onSizeChanged(i10, i11, i12, i13);
        } else {
            super.onSizeChanged(i11, i10, i13, i12);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (c()) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (onTouchEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if ((action == 1 || action == 3) && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        return onTouchEvent;
                    }
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            return onTouchEvent;
        }
        if (!isEnabled()) {
            return false;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 == 3) {
                        if (this.f1647b) {
                            this.f1647b = false;
                            setPressed(false);
                        }
                        invalidate();
                        return true;
                    }
                } else if (this.f1647b) {
                    b(motionEvent);
                }
                return true;
            }
            if (this.f1647b) {
                b(motionEvent);
                this.f1647b = false;
                setPressed(false);
            } else {
                this.f1647b = true;
                b(motionEvent);
                this.f1647b = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
            }
            invalidate();
            return true;
        }
        setPressed(true);
        this.f1647b = true;
        b(motionEvent);
        ViewParent parent4 = getParent();
        if (parent4 != null) {
            parent4.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        return true;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        super.setProgress(i10);
        if (!c()) {
            onSizeChanged(super.getWidth(), super.getHeight(), 0, 0);
        }
    }

    public void setRotationAngle(int i10) {
        if (i10 != 90 && i10 != 270) {
            i.k(ai.onnxruntime.a.e(i10, "Invalid angle specified :"));
            return;
        }
        if (this.d != i10) {
            this.d = i10;
            if (c()) {
                VerticalSeekBarWrapper wrapper = getWrapper();
                if (wrapper != null) {
                    wrapper.a(wrapper.getWidth(), wrapper.getHeight());
                    return;
                }
                return;
            }
            requestLayout();
        }
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
    }
}
