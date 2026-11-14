package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.navistart.R;
import com.google.android.material.datepicker.m;
import z1.b;
import z1.g;
import z1.h;
import z1.i;
import z1.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FloatingActionMenu extends ViewGroup {
    public final boolean A;
    public final int B;
    public final float C;
    public final float D;
    public final float E;
    public int F;
    public int G;
    public int H;
    public final Drawable I;
    public int J;
    public final OvershootInterpolator K;
    public final AnticipateInterpolator L;
    public boolean M;
    public final boolean N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final Typeface S;
    public boolean T;
    public final ImageView U;
    public Animation V;
    public Animation W;

    /* renamed from: a0, reason: collision with root package name */
    public final Animation f1100a0;

    /* renamed from: b, reason: collision with root package name */
    public final AnimatorSet f1101b;

    /* renamed from: b0, reason: collision with root package name */
    public final Animation f1102b0;
    public final AnimatorSet c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1103c0;
    public AnimatorSet d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f1104d0;
    public final int e;

    /* renamed from: e0, reason: collision with root package name */
    public final ValueAnimator f1105e0;

    /* renamed from: f, reason: collision with root package name */
    public final FloatingActionButton f1106f;

    /* renamed from: f0, reason: collision with root package name */
    public final ValueAnimator f1107f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1108g;

    /* renamed from: g0, reason: collision with root package name */
    public final int f1109g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f1110h;

    /* renamed from: h0, reason: collision with root package name */
    public final int f1111h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f1112i;

    /* renamed from: i0, reason: collision with root package name */
    public final ContextThemeWrapper f1113i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1114j;

    /* renamed from: j0, reason: collision with root package name */
    public final String f1115j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1116k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f1117k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1118l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f1119m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1120n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1121o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1122p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1123q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1124s;
    public final ColorStateList t;

    /* renamed from: u, reason: collision with root package name */
    public final float f1125u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1126v;
    public final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1127x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1128y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1129z;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x031f, code lost:
    
        if (r2 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0321, code lost:
    
        r3 = -135.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x032a, code lost:
    
        r2 = android.animation.ObjectAnimator.ofFloat(r18.U, androidx.constraintlayout.motion.widget.Key.ROTATION, r0, 0.0f);
        r7.play(android.animation.ObjectAnimator.ofFloat(r18.U, androidx.constraintlayout.motion.widget.Key.ROTATION, 0.0f, r3));
        r8.play(r2);
        r7.setInterpolator(r18.K);
        r8.setInterpolator(r18.L);
        r7.setDuration(300L);
        r8.setDuration(300L);
        r0 = r11.getResourceId(9, com.example.navistart.R.anim.fab_scale_up);
        setMenuButtonShowAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r0));
        r18.f1100a0 = android.view.animation.AnimationUtils.loadAnimation(getContext(), r0);
        r0 = r11.getResourceId(7, com.example.navistart.R.anim.fab_scale_down);
        setMenuButtonHideAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r0));
        r18.f1102b0 = android.view.animation.AnimationUtils.loadAnimation(getContext(), r0);
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0398, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0328, code lost:
    
        if (r2 == 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionMenu(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.clans.fab.FloatingActionMenu.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setLabelEllipsize(k kVar) {
        int i10 = this.O;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    kVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    return;
                }
                kVar.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            kVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            return;
        }
        kVar.setEllipsize(TextUtils.TruncateAt.START);
    }

    public final void a(boolean z9) {
        if (this.f1116k) {
            if (this.f1109g0 != 0) {
                this.f1107f0.start();
            }
            if (this.T) {
                AnimatorSet animatorSet = this.d;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.c.start();
                    this.f1101b.cancel();
                }
            }
            int i10 = 0;
            this.f1118l = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int childCount = getChildCount();
                Handler handler = this.f1119m;
                if (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                        i11++;
                        handler.postDelayed(new g(this, (FloatingActionButton) childAt, z9, 1), i12);
                        i12 += this.J;
                    }
                    i10++;
                } else {
                    handler.postDelayed(new h(this, 1), (i11 + 1) * this.J);
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimationDelayPerItem() {
        return this.J;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.d;
    }

    public int getMenuButtonColorNormal() {
        return this.F;
    }

    public int getMenuButtonColorPressed() {
        return this.G;
    }

    public int getMenuButtonColorRipple() {
        return this.H;
    }

    public String getMenuButtonLabelText() {
        return this.f1115j0;
    }

    public ImageView getMenuIconView() {
        return this.U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.TextView, android.view.View, java.lang.Object, z1.k] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f1106f);
        bringChildToFront(this.U);
        this.f1114j = getChildCount();
        for (int i10 = 0; i10 < this.f1114j; i10++) {
            if (getChildAt(i10) != this.U) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i10);
                if (floatingActionButton.getTag(R.id.fab_label) == null) {
                    String labelText = floatingActionButton.getLabelText();
                    if (!TextUtils.isEmpty(labelText)) {
                        ?? textView = new TextView(this.f1113i0);
                        textView.f6713g = true;
                        textView.r = true;
                        textView.f6724s = new GestureDetector(textView.getContext(), new b(1, textView));
                        textView.setClickable(true);
                        textView.setFab(floatingActionButton);
                        textView.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f1120n));
                        textView.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f1121o));
                        if (this.R > 0) {
                            textView.setTextAppearance(getContext(), this.R);
                            textView.setShowShadow(false);
                            textView.setUsingStyle(true);
                        } else {
                            textView.f6716j = this.f1127x;
                            textView.f6717k = this.f1128y;
                            textView.f6718l = this.f1129z;
                            textView.setShowShadow(this.w);
                            textView.setCornerRadius(this.f1126v);
                            if (this.O > 0) {
                                setLabelEllipsize(textView);
                            }
                            textView.setMaxLines(this.P);
                            textView.e();
                            textView.setTextSize(0, this.f1125u);
                            textView.setTextColor(this.t);
                            boolean z9 = this.w;
                            int i11 = this.f1124s;
                            int i12 = this.f1122p;
                            if (z9) {
                                i11 += Math.abs(floatingActionButton.getShadowXOffset()) + floatingActionButton.getShadowRadius();
                                i12 += Math.abs(floatingActionButton.getShadowYOffset()) + floatingActionButton.getShadowRadius();
                            }
                            textView.setPadding(i11, i12, this.f1124s, this.f1122p);
                            if (this.P < 0 || this.N) {
                                textView.setSingleLine(this.N);
                            }
                        }
                        Typeface typeface = this.S;
                        if (typeface != null) {
                            textView.setTypeface(typeface);
                        }
                        textView.setText(labelText);
                        textView.setOnClickListener(floatingActionButton.getOnClickListener());
                        addView(textView);
                        floatingActionButton.setTag(R.id.fab_label, textView);
                    }
                    FloatingActionButton floatingActionButton2 = this.f1106f;
                    if (floatingActionButton == floatingActionButton2) {
                        floatingActionButton2.setOnClickListener(new m(3, this));
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        boolean z10;
        int paddingTop;
        int measuredWidth;
        int i14;
        int measuredWidth2;
        int i15;
        int i16 = this.f1108g;
        if (this.f1111h0 == 0) {
            paddingLeft = ((i12 - i10) - (i16 / 2)) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft() + (i16 / 2);
        }
        if (this.f1104d0 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paddingTop = ((i13 - i11) - this.f1106f.getMeasuredHeight()) - getPaddingBottom();
        } else {
            paddingTop = getPaddingTop();
        }
        int measuredWidth3 = paddingLeft - (this.f1106f.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f1106f;
        floatingActionButton.layout(measuredWidth3, paddingTop, floatingActionButton.getMeasuredWidth() + measuredWidth3, this.f1106f.getMeasuredHeight() + paddingTop);
        int measuredWidth4 = paddingLeft - (this.U.getMeasuredWidth() / 2);
        int measuredHeight = ((this.f1106f.getMeasuredHeight() / 2) + paddingTop) - (this.U.getMeasuredHeight() / 2);
        ImageView imageView = this.U;
        imageView.layout(measuredWidth4, measuredHeight, imageView.getMeasuredWidth() + measuredWidth4, this.U.getMeasuredHeight() + measuredHeight);
        if (z10) {
            paddingTop = this.e + this.f1106f.getMeasuredHeight() + paddingTop;
        }
        for (int i17 = this.f1114j - 1; i17 >= 0; i17--) {
            View childAt = getChildAt(i17);
            if (childAt != this.U) {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) childAt;
                if (floatingActionButton2.getVisibility() != 8) {
                    int measuredWidth5 = paddingLeft - (floatingActionButton2.getMeasuredWidth() / 2);
                    if (z10) {
                        paddingTop = (paddingTop - floatingActionButton2.getMeasuredHeight()) - this.e;
                    }
                    if (floatingActionButton2 != this.f1106f) {
                        floatingActionButton2.layout(measuredWidth5, paddingTop, floatingActionButton2.getMeasuredWidth() + measuredWidth5, floatingActionButton2.getMeasuredHeight() + paddingTop);
                        if (!this.f1118l) {
                            floatingActionButton2.g(false);
                        }
                    }
                    View view = (View) floatingActionButton2.getTag(R.id.fab_label);
                    if (view != null) {
                        if (this.f1117k0) {
                            measuredWidth = this.f1108g;
                        } else {
                            measuredWidth = floatingActionButton2.getMeasuredWidth();
                        }
                        int i18 = (measuredWidth / 2) + this.f1110h;
                        int i19 = this.f1111h0;
                        if (i19 == 0) {
                            i14 = paddingLeft - i18;
                        } else {
                            i14 = i18 + paddingLeft;
                        }
                        if (i19 == 0) {
                            measuredWidth2 = i14 - view.getMeasuredWidth();
                        } else {
                            measuredWidth2 = view.getMeasuredWidth() + i14;
                        }
                        int i20 = this.f1111h0;
                        if (i20 == 0) {
                            i15 = measuredWidth2;
                        } else {
                            i15 = i14;
                        }
                        if (i20 != 0) {
                            i14 = measuredWidth2;
                        }
                        int measuredHeight2 = ((floatingActionButton2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (paddingTop - this.f1112i);
                        view.layout(i15, measuredHeight2, i14, view.getMeasuredHeight() + measuredHeight2);
                        if (!this.f1118l) {
                            view.setVisibility(4);
                        }
                    }
                    if (z10) {
                        paddingTop -= this.e;
                    } else {
                        paddingTop = this.e + childAt.getMeasuredHeight() + paddingTop;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f1108g = 0;
        measureChildWithMargins(this.U, i10, 0, i11, 0);
        for (int i13 = 0; i13 < this.f1114j; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && childAt != this.U) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                this.f1108g = Math.max(this.f1108g, childAt.getMeasuredWidth());
            }
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (i14 >= this.f1114j) {
                break;
            }
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && childAt2 != this.U) {
                int measuredWidth = childAt2.getMeasuredWidth();
                i16 += childAt2.getMeasuredHeight();
                k kVar = (k) childAt2.getTag(R.id.fab_label);
                if (kVar != null) {
                    int measuredWidth2 = this.f1108g - childAt2.getMeasuredWidth();
                    if (!this.f1117k0) {
                        i17 = 2;
                    }
                    int i18 = measuredWidth2 / i17;
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    if (kVar.f6713g) {
                        i12 = Math.abs(kVar.c) + kVar.f6711b;
                    } else {
                        i12 = 0;
                    }
                    measureChildWithMargins(kVar, i10, i12 + measuredWidth3 + this.f1110h + i18, i11, 0);
                    i15 = Math.max(i15, kVar.getMeasuredWidth() + measuredWidth + i18);
                }
            }
            i14++;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.f1108g, i15 + this.f1110h);
        double paddingBottom = getPaddingBottom() + getPaddingTop() + ((this.f1114j - 1) * this.e) + i16;
        int i19 = (int) ((0.03d * paddingBottom) + paddingBottom);
        if (getLayoutParams().width == -1) {
            paddingRight = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        }
        if (getLayoutParams().height == -1) {
            i19 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        }
        setMeasuredDimension(paddingRight, i19);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1103c0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                a(this.M);
                return true;
            }
            return this.f1116k;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimated(boolean z9) {
        long j10;
        this.M = z9;
        long j11 = 0;
        if (z9) {
            j10 = 300;
        } else {
            j10 = 0;
        }
        this.f1101b.setDuration(j10);
        if (z9) {
            j11 = 300;
        }
        this.c.setDuration(j11);
    }

    public void setAnimationDelayPerItem(int i10) {
        this.J = i10;
    }

    public void setClosedOnTouchOutside(boolean z9) {
        this.f1103c0 = z9;
    }

    public void setIconAnimated(boolean z9) {
        this.T = z9;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.c.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f1101b.setInterpolator(interpolator);
        this.c.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.f1101b.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.d = animatorSet;
    }

    public void setMenuButtonColorNormal(int i10) {
        this.F = i10;
        this.f1106f.setColorNormal(i10);
    }

    public void setMenuButtonColorNormalResId(int i10) {
        this.F = getResources().getColor(i10);
        this.f1106f.setColorNormalResId(i10);
    }

    public void setMenuButtonColorPressed(int i10) {
        this.G = i10;
        this.f1106f.setColorPressed(i10);
    }

    public void setMenuButtonColorPressedResId(int i10) {
        this.G = getResources().getColor(i10);
        this.f1106f.setColorPressedResId(i10);
    }

    public void setMenuButtonColorRipple(int i10) {
        this.H = i10;
        this.f1106f.setColorRipple(i10);
    }

    public void setMenuButtonColorRippleResId(int i10) {
        this.H = getResources().getColor(i10);
        this.f1106f.setColorRippleResId(i10);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.W = animation;
        this.f1106f.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.f1106f.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.V = animation;
        this.f1106f.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.f1106f.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1106f.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setOnMenuToggleListener(i iVar) {
    }
}
