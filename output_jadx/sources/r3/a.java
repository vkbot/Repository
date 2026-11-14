package r3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5350a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5351b;

    public a(b bVar) {
        this.f5351b = bVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f5350a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f5350a) {
            case 0:
                return (b) this.f5351b;
            default:
                return new u.b(this);
        }
    }

    public a(u.f fVar) {
        this.f5351b = fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f5350a) {
            case 1:
                return new u.b(this);
            default:
                return super.newDrawable(resources);
        }
    }
}
