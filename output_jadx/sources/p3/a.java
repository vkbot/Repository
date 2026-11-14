package p3;

import android.content.Context;
import com.example.navistart.R;
import w3.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f4994f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4996b;
    public final int c;
    public final int d;
    public final float e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int b11 = m3.a.b(context, R.attr.elevationOverlayColor, 0);
        int b12 = m3.a.b(context, R.attr.elevationOverlayAccentColor, 0);
        int b13 = m3.a.b(context, R.attr.colorSurface, 0);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f4995a = b10;
        this.f4996b = b11;
        this.c = b12;
        this.d = b13;
        this.e = f8;
    }
}
