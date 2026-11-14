package e4;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends z3.h {
    public final RectF r;

    public f(f fVar) {
        super(fVar);
        this.r = fVar.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.g, android.graphics.drawable.Drawable, z3.k] */
    @Override // z3.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? kVar = new z3.k(this);
        kVar.I = this;
        kVar.invalidateSelf();
        return kVar;
    }

    public f(z3.o oVar, RectF rectF) {
        super(oVar);
        this.r = rectF;
    }
}
