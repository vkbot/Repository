package w3;

import android.graphics.Typeface;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f6357a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6358b;
    public boolean c;

    public a(p pVar, Typeface typeface) {
        this.f6357a = typeface;
        this.f6358b = pVar;
    }

    @Override // w3.g
    public final void a(int i10) {
        if (!this.c) {
            s3.c cVar = (s3.c) this.f6358b.c;
            if (cVar.l(this.f6357a)) {
                cVar.j(false);
            }
        }
    }

    @Override // w3.g
    public final void b(Typeface typeface, boolean z9) {
        if (!this.c) {
            s3.c cVar = (s3.c) this.f6358b.c;
            if (cVar.l(typeface)) {
                cVar.j(false);
            }
        }
    }
}
