package z;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import c0.g;
import com.example.navistart.R;
import j1.i;
import java.util.ArrayList;
import y.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f6681b;
    public final e c;
    public Animatable d;
    public final /* synthetic */ int e;

    public a(ImageView imageView, int i10) {
        this.e = i10;
        g.c(imageView, "Argument must not be null");
        this.f6681b = imageView;
        this.c = new e(imageView);
    }

    @Override // z.d
    public final void a(f fVar) {
        int i10;
        e eVar = this.c;
        ArrayList arrayList = eVar.f6686b;
        View view = eVar.f6685a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = 0;
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = 0;
        }
        int a10 = eVar.a(view.getWidth(), i10, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i11 = layoutParams2.height;
        }
        int a11 = eVar.a(view.getHeight(), i11, paddingBottom);
        if ((a10 <= 0 && a10 != Integer.MIN_VALUE) || (a11 <= 0 && a11 != Integer.MIN_VALUE)) {
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
            if (eVar.c == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                b bVar = new b(eVar);
                eVar.c = bVar;
                viewTreeObserver.addOnPreDrawListener(bVar);
                return;
            }
            return;
        }
        fVar.m(a10, a11);
    }

    @Override // z.d
    public final void b(Object obj) {
        k(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.d = animatable;
            animatable.start();
            return;
        }
        this.d = null;
    }

    @Override // z.d
    public final void d(Drawable drawable) {
        k(null);
        this.d = null;
        this.f6681b.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // z.d
    public final void f(f fVar) {
        this.c.f6686b.remove(fVar);
    }

    @Override // z.d
    public final void g(Drawable drawable) {
        k(null);
        this.d = null;
        this.f6681b.setImageDrawable(drawable);
    }

    @Override // z.d
    public final void h(y.c cVar) {
        this.f6681b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // z.d
    public final y.c i() {
        Object tag = this.f6681b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof y.c) {
                return (y.c) tag;
            }
            i.k("You must not call setTag() on a view Glide is targeting");
            return null;
        }
        return null;
    }

    @Override // z.d
    public final void j(Drawable drawable) {
        e eVar = this.c;
        ViewTreeObserver viewTreeObserver = eVar.f6685a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.c);
        }
        eVar.c = null;
        eVar.f6686b.clear();
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        k(null);
        this.d = null;
        this.f6681b.setImageDrawable(drawable);
    }

    public final void k(Object obj) {
        switch (this.e) {
            case 0:
                this.f6681b.setImageBitmap((Bitmap) obj);
                return;
            default:
                this.f6681b.setImageDrawable((Drawable) obj);
                return;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final String toString() {
        return "Target for: " + this.f6681b;
    }

    @Override // com.bumptech.glide.manager.i
    public final void c() {
    }
}
