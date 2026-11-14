package y3;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f6624i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f6625j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6626k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f6627l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6628a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f6629b;
    public final Paint c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f6630f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f6631g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f6632h;

    public a() {
        Paint paint = new Paint();
        this.f6632h = paint;
        this.f6628a = new Paint();
        a(ViewCompat.MEASURED_STATE_MASK);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f6629b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.d = ColorUtils.setAlphaComponent(i10, 68);
        this.e = ColorUtils.setAlphaComponent(i10, 20);
        this.f6630f = ColorUtils.setAlphaComponent(i10, 0);
        this.f6628a.setColor(this.d);
    }
}
