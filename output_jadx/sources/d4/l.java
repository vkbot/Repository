package d4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.tabs.TabLayout;
import s3.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f1814m = 0;

    /* renamed from: b, reason: collision with root package name */
    public i f1815b;
    public TextView c;
    public ImageView d;
    public View e;

    /* renamed from: f, reason: collision with root package name */
    public d3.a f1816f;

    /* renamed from: g, reason: collision with root package name */
    public View f1817g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1818h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f1819i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1820j;

    /* renamed from: k, reason: collision with root package name */
    public int f1821k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabLayout f1822l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TabLayout tabLayout, Context context) {
        super(context);
        this.f1822l = tabLayout;
        this.f1821k = 2;
        f(context);
        setPaddingRelative(tabLayout.f1423f, tabLayout.f1424g, tabLayout.f1425h, tabLayout.f1426i);
        setGravity(17);
        setOrientation(!tabLayout.F ? 1 : 0);
        setClickable(true);
        ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND));
    }

    @Nullable
    private d3.a getBadge() {
        return this.f1816f;
    }

    @NonNull
    private d3.a getOrCreateBadge() {
        if (this.f1816f == null) {
            this.f1816f = new d3.a(getContext());
        }
        c();
        d3.a aVar = this.f1816f;
        if (aVar != null) {
            return aVar;
        }
        j1.i.l("Unable to create badge");
        return null;
    }

    public final void a(View view) {
        if (this.f1816f != null && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            d3.a aVar = this.f1816f;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
            if (aVar.d() != null) {
                aVar.d().setForeground(aVar);
            } else {
                view.getOverlay().add(aVar);
            }
            this.e = view;
        }
    }

    public final void b() {
        if (this.f1816f != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.e;
            if (view != null) {
                d3.a aVar = this.f1816f;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.e = null;
            }
        }
    }

    public final void c() {
        i iVar;
        if (this.f1816f != null) {
            if (this.f1817g != null) {
                b();
                return;
            }
            ImageView imageView = this.d;
            if (imageView != null && (iVar = this.f1815b) != null && iVar.f1806b != null) {
                if (this.e != imageView) {
                    b();
                    a(this.d);
                    return;
                } else {
                    d(imageView);
                    return;
                }
            }
            TextView textView = this.c;
            if (textView != null && this.f1815b != null) {
                if (this.e != textView) {
                    b();
                    a(this.c);
                    return;
                } else {
                    d(textView);
                    return;
                }
            }
            b();
        }
    }

    public final void d(View view) {
        d3.a aVar = this.f1816f;
        if (aVar != null && view == this.e) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1820j;
        if (drawable != null && drawable.isStateful()) {
            z9 = this.f1820j.setState(drawableState);
        } else {
            z9 = false;
        }
        if (z9) {
            invalidate();
            this.f1822l.invalidate();
        }
    }

    public final void e() {
        boolean z9;
        g();
        i iVar = this.f1815b;
        if (iVar != null) {
            TabLayout tabLayout = iVar.f1808g;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == iVar.e) {
                    z9 = true;
                    setSelected(z9);
                }
            } else {
                j1.i.k("Tab not attached to a TabLayout");
                return;
            }
        }
        z9 = false;
        setSelected(z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [d4.l, android.view.View] */
    public final void f(Context context) {
        TabLayout tabLayout = this.f1822l;
        int i10 = tabLayout.f1437v;
        GradientDrawable gradientDrawable = null;
        if (i10 != 0) {
            Drawable drawable = AppCompatResources.getDrawable(context, i10);
            this.f1820j = drawable;
            if (drawable != null && drawable.isStateful()) {
                this.f1820j.setState(getDrawableState());
            }
        } else {
            this.f1820j = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.f1432o != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.f1432o;
            int[] iArr = x3.a.d;
            int a10 = x3.a.a(colorStateList, x3.a.c);
            int[] iArr2 = x3.a.f6493b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a10, x3.a.a(colorStateList, iArr2), x3.a.a(colorStateList, x3.a.f6492a)});
            boolean z9 = tabLayout.J;
            if (z9) {
                gradientDrawable2 = null;
            }
            if (!z9) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
        }
        setBackground(gradientDrawable2);
        tabLayout.invalidate();
    }

    public final void g() {
        View view;
        int i10;
        ViewParent parent;
        i iVar = this.f1815b;
        if (iVar != null) {
            view = iVar.f1807f;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f1817g;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f1817g);
                }
                addView(view);
            }
            this.f1817g = view;
            TextView textView = this.c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.d.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f1818h = textView2;
            if (textView2 != null) {
                this.f1821k = textView2.getMaxLines();
            }
            this.f1819i = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f1817g;
            if (view3 != null) {
                removeView(view3);
                this.f1817g = null;
            }
            this.f1818h = null;
            this.f1819i = null;
        }
        if (this.f1817g == null) {
            if (this.d == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.example.navistart.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.d = imageView2;
                addView(imageView2, 0);
            }
            if (this.c == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.example.navistart.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.c = textView3;
                addView(textView3);
                this.f1821k = this.c.getMaxLines();
            }
            TextView textView4 = this.c;
            TabLayout tabLayout = this.f1822l;
            TextViewCompat.setTextAppearance(textView4, tabLayout.f1427j);
            if (isSelected() && (i10 = tabLayout.f1429l) != -1) {
                TextViewCompat.setTextAppearance(this.c, i10);
            } else {
                TextViewCompat.setTextAppearance(this.c, tabLayout.f1428k);
            }
            ColorStateList colorStateList = tabLayout.f1430m;
            if (colorStateList != null) {
                this.c.setTextColor(colorStateList);
            }
            h(this.c, this.d, true);
            c();
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new k(this, imageView3));
            }
            TextView textView5 = this.c;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new k(this, textView5));
            }
        } else {
            TextView textView6 = this.f1818h;
            if (textView6 != null || this.f1819i != null) {
                h(textView6, this.f1819i, false);
            }
        }
        if (iVar != null && !TextUtils.isEmpty(iVar.d)) {
            setContentDescription(iVar.d);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.c, this.d, this.f1817g};
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        for (int i12 = 0; i12 < 3; i12++) {
            View view = viewArr[i12];
            if (view != null && view.getVisibility() == 0) {
                if (z9) {
                    i11 = Math.min(i11, view.getTop());
                } else {
                    i11 = view.getTop();
                }
                if (z9) {
                    i10 = Math.max(i10, view.getBottom());
                } else {
                    i10 = view.getBottom();
                }
                z9 = true;
            }
        }
        return i10 - i11;
    }

    public int getContentWidth() {
        View[] viewArr = {this.c, this.d, this.f1817g};
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        for (int i12 = 0; i12 < 3; i12++) {
            View view = viewArr[i12];
            if (view != null && view.getVisibility() == 0) {
                if (z9) {
                    i11 = Math.min(i11, view.getLeft());
                } else {
                    i11 = view.getLeft();
                }
                if (z9) {
                    i10 = Math.max(i10, view.getRight());
                } else {
                    i10 = view.getRight();
                }
                z9 = true;
            }
        }
        return i10 - i11;
    }

    @Nullable
    public i getTab() {
        return this.f1815b;
    }

    public final void h(TextView textView, ImageView imageView, boolean z9) {
        Drawable drawable;
        CharSequence charSequence;
        boolean z10;
        int i10;
        CharSequence charSequence2;
        int i11;
        Drawable drawable2;
        i iVar = this.f1815b;
        CharSequence charSequence3 = null;
        if (iVar != null && (drawable2 = iVar.f1806b) != null) {
            drawable = DrawableCompat.wrap(drawable2).mutate();
        } else {
            drawable = null;
        }
        TabLayout tabLayout = this.f1822l;
        if (drawable != null) {
            drawable.setTintList(tabLayout.f1431n);
            PorterDuff.Mode mode = tabLayout.r;
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        i iVar2 = this.f1815b;
        if (iVar2 != null) {
            charSequence = iVar2.c;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (!isEmpty) {
                this.f1815b.getClass();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z9 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z10 && imageView.getVisibility() == 0) {
                i10 = (int) q.a(8, getContext());
            } else {
                i10 = 0;
            }
            if (tabLayout.F) {
                if (i10 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i10);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i10 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i10;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        i iVar3 = this.f1815b;
        if (iVar3 != null) {
            charSequence3 = iVar3.d;
        }
        if (isEmpty) {
            charSequence = charSequence3;
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        d3.a aVar = this.f1816f;
        if (aVar != null && aVar.isVisible()) {
            d3.a aVar2 = this.f1816f;
            d3.c cVar = aVar2.f1760f;
            CharSequence charSequence = null;
            if (aVar2.isVisible()) {
                d3.b bVar = cVar.f1789b;
                if (bVar.f1775k != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    charSequence = bVar.f1780p;
                    if (charSequence == null) {
                        charSequence = aVar2.f1760f.f1789b.f1775k;
                    }
                } else if (aVar2.g()) {
                    if (bVar.r != 0 && (context = (Context) aVar2.f1759b.get()) != null) {
                        if (aVar2.f1763i != -2) {
                            int e = aVar2.e();
                            int i10 = aVar2.f1763i;
                            if (e > i10) {
                                charSequence = context.getString(bVar.f1782s, Integer.valueOf(i10));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(bVar.r, aVar2.e(), Integer.valueOf(aVar2.e()));
                    }
                } else {
                    charSequence = bVar.f1781q;
                }
            }
            wrap.setContentDescription(charSequence);
        }
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f1815b.e, 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(com.example.navistart.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        TabLayout tabLayout = this.f1822l;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.w, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.c != null) {
            float f8 = tabLayout.f1435s;
            if (isSelected() && tabLayout.f1429l != -1) {
                f8 = tabLayout.t;
            }
            int i12 = this.f1821k;
            ImageView imageView = this.d;
            if (imageView != null && imageView.getVisibility() == 0) {
                i12 = 1;
            } else {
                TextView textView = this.c;
                if (textView != null && textView.getLineCount() > 1) {
                    f8 = tabLayout.f1436u;
                }
            }
            float textSize = this.c.getTextSize();
            int lineCount = this.c.getLineCount();
            int maxLines = this.c.getMaxLines();
            if (f8 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                if (tabLayout.E == 1 && f8 > textSize && lineCount == 1) {
                    Layout layout = this.c.getLayout();
                    if (layout != null) {
                        if ((f8 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.c.setTextSize(0, f8);
                this.c.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f1815b != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            i iVar = this.f1815b;
            TabLayout tabLayout = iVar.f1808g;
            if (tabLayout != null) {
                tabLayout.l(iVar, true);
                return true;
            }
            j1.i.k("Tab not attached to a TabLayout");
            return false;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        isSelected();
        super.setSelected(z9);
        TextView textView = this.c;
        if (textView != null) {
            textView.setSelected(z9);
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setSelected(z9);
        }
        View view = this.f1817g;
        if (view != null) {
            view.setSelected(z9);
        }
    }

    public void setTab(@Nullable i iVar) {
        if (iVar != this.f1815b) {
            this.f1815b = iVar;
            e();
        }
    }
}
