package u;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import j1.i;
import java.util.ArrayList;
import org.apache.commons.net.nntp.NNTP;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends Drawable implements e, Animatable, Animatable2Compat {

    /* renamed from: b, reason: collision with root package name */
    public final r3.a f5835b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* renamed from: g, reason: collision with root package name */
    public int f5837g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5839i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f5840j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f5841k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f5842l;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5836f = true;

    /* renamed from: h, reason: collision with root package name */
    public final int f5838h = -1;

    public b(r3.a aVar) {
        this.f5835b = aVar;
    }

    public final void a() {
        c0.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.e);
        f fVar = (f) this.f5835b.f5351b;
        if (fVar.f5848a.f2408l.c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.c) {
            this.c = true;
            ArrayList arrayList = fVar.c;
            if (!fVar.f5854j) {
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !fVar.f5850f) {
                        fVar.f5850f = true;
                        fVar.f5854j = false;
                        fVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                i.l("Cannot subscribe twice in a row");
                return;
            }
            i.l("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ArrayList arrayList = this.f5842l;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.e) {
            return;
        }
        if (this.f5839i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f5841k == null) {
                this.f5841k = new Rect();
            }
            Gravity.apply(NNTP.DEFAULT_PORT, intrinsicWidth, intrinsicHeight, bounds, this.f5841k);
            this.f5839i = false;
        }
        f fVar = (f) this.f5835b.f5351b;
        d dVar = fVar.f5853i;
        if (dVar != null) {
            bitmap = dVar.f5847h;
        } else {
            bitmap = fVar.f5856l;
        }
        if (this.f5841k == null) {
            this.f5841k = new Rect();
        }
        Rect rect = this.f5841k;
        if (this.f5840j == null) {
            this.f5840j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f5840j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5835b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((f) this.f5835b.f5351b).f5860p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((f) this.f5835b.f5351b).f5859o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5839i = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f5842l == null) {
            this.f5842l = new ArrayList();
        }
        this.f5842l.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f5840j == null) {
            this.f5840j = new Paint(2);
        }
        this.f5840j.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5840j == null) {
            this.f5840j = new Paint(2);
        }
        this.f5840j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        c0.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.e);
        this.f5836f = z9;
        if (!z9) {
            this.c = false;
            f fVar = (f) this.f5835b.f5351b;
            ArrayList arrayList = fVar.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f5850f = false;
            }
        } else if (this.d) {
            a();
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.f5837g = 0;
        if (this.f5836f) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        this.c = false;
        f fVar = (f) this.f5835b.f5351b;
        ArrayList arrayList = fVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f5850f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.f5842l;
        if (arrayList != null && animationCallback != null) {
            return arrayList.remove(animationCallback);
        }
        return false;
    }
}
