package z1;

import android.graphics.Canvas;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.github.clans.fab.FloatingActionButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f6690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6691b;
    public final /* synthetic */ FloatingActionButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FloatingActionButton floatingActionButton, OvalShape ovalShape) {
        super(ovalShape);
        int i10;
        this.c = floatingActionButton;
        int i11 = 0;
        if (floatingActionButton.f()) {
            i10 = Math.abs(floatingActionButton.f1082f) + floatingActionButton.e;
        } else {
            i10 = 0;
        }
        this.f6690a = i10;
        if (floatingActionButton.f()) {
            i11 = Math.abs(floatingActionButton.f1083g) + floatingActionButton.e;
        }
        this.f6691b = i11;
        if (floatingActionButton.f1095u) {
            int i12 = floatingActionButton.f1096v;
            this.f6690a = i10 + i12;
            this.f6691b = i11 + i12;
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.W;
        FloatingActionButton floatingActionButton = this.c;
        int c = floatingActionButton.c();
        int i10 = this.f6690a;
        int b10 = floatingActionButton.b();
        int i11 = this.f6691b;
        setBounds(i10, i11, c - i10, b10 - i11);
        super.draw(canvas);
    }
}
