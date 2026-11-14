package y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Observable;
import w1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b extends Observable {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6611f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6612a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6613b;
    public i c;
    public float d;
    public int e;

    public b(Context context) {
        Paint paint = new Paint(1);
        this.f6612a = paint;
        this.f6613b = context.getResources().getDisplayMetrics().density;
        this.e = -14575885;
        paint.setColor(-14575885);
    }

    public abstract void a(Canvas canvas);

    public float b() {
        return d();
    }

    public final float c() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.getClass();
            return iVar.getSize() / 2.0f;
        }
        return 0.0f;
    }

    public final float d() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.getClass();
            return iVar.getSize() / 2.0f;
        }
        return 0.0f;
    }

    public float e() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.getClass();
            return iVar.getPadding();
        }
        return 0.0f;
    }

    public final float f() {
        if (this.c != null) {
            return r0.getSize() - (r0.getPadding() * 2.0f);
        }
        return 0.0f;
    }

    public final void g(int i10) {
        this.e = i10;
        if (this.c != null) {
            i();
        }
        setChanged();
        notifyObservers(null);
    }

    public final void h(float f8) {
        this.d = f8;
        if (this.c != null) {
            i();
        }
        setChanged();
        notifyObservers(null);
    }

    public abstract void i();
}
