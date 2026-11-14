package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.example.navistart.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n implements z.d {

    /* renamed from: b, reason: collision with root package name */
    public final z.c f679b;
    public final View c;

    public n(ImageView imageView) {
        c0.g.c(imageView, "Argument must not be null");
        this.c = imageView;
        this.f679b = new z.c(imageView);
    }

    @Override // z.d
    public final void a(y.f fVar) {
        int i10;
        z.c cVar = this.f679b;
        ArrayList arrayList = cVar.f6684b;
        View view = cVar.f6683a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = 0;
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = 0;
        }
        int a10 = cVar.a(view.getWidth(), i10, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i11 = layoutParams2.height;
        }
        int a11 = cVar.a(view.getHeight(), i11, paddingBottom);
        if ((a10 <= 0 && a10 != Integer.MIN_VALUE) || (a11 <= 0 && a11 != Integer.MIN_VALUE)) {
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
            if (cVar.c == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                z.b bVar = new z.b(cVar);
                cVar.c = bVar;
                viewTreeObserver.addOnPreDrawListener(bVar);
                return;
            }
            return;
        }
        fVar.m(a10, a11);
    }

    @Override // z.d
    public final void f(y.f fVar) {
        this.f679b.f6684b.remove(fVar);
    }

    @Override // z.d
    public final void h(y.c cVar) {
        this.c.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // z.d
    public final y.c i() {
        Object tag = this.c.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof y.c) {
                return (y.c) tag;
            }
            j1.i.k("You must not pass non-R.id ids to setTag(id)");
            return null;
        }
        return null;
    }

    @Override // z.d
    public final void j(Drawable drawable) {
        z.c cVar = this.f679b;
        ViewTreeObserver viewTreeObserver = cVar.f6683a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(cVar.c);
        }
        cVar.c = null;
        cVar.f6684b.clear();
    }

    public final String toString() {
        return "Target for: " + this.c;
    }

    @Override // com.bumptech.glide.manager.i
    public final void c() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // z.d
    public final void b(Object obj) {
    }

    @Override // z.d
    public final void d(Drawable drawable) {
    }

    @Override // z.d
    public final void g(Drawable drawable) {
    }
}
