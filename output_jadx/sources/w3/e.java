package w3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f6362b;
    public final /* synthetic */ g c;
    public final /* synthetic */ f d;

    public e(f fVar, Context context, TextPaint textPaint, g gVar) {
        this.d = fVar;
        this.f6361a = context;
        this.f6362b = textPaint;
        this.c = gVar;
    }

    @Override // w3.g
    public final void a(int i10) {
        this.c.a(i10);
    }

    @Override // w3.g
    public final void b(Typeface typeface, boolean z9) {
        this.d.f(this.f6361a, this.f6362b, typeface);
        this.c.b(typeface, z9);
    }
}
