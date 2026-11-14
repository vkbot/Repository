package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t implements h.l {

    /* renamed from: b, reason: collision with root package name */
    public final h.l f5153b;
    public final boolean c;

    public t(h.l lVar, boolean z9) {
        this.f5153b = lVar;
        this.c = z9;
    }

    @Override // h.l
    public final j.d0 a(Context context, j.d0 d0Var, int i10, int i11) {
        k.b bVar = com.bumptech.glide.b.a(context).f611b;
        Drawable drawable = (Drawable) d0Var.get();
        e a10 = s.a(bVar, drawable, i10, i11);
        if (a10 == null) {
            if (!this.c) {
                return d0Var;
            }
            androidx.navigation.b.p(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        j.d0 a11 = this.f5153b.a(context, a10, i10, i11);
        if (a11.equals(a10)) {
            a11.recycle();
            return d0Var;
        }
        return new e(context.getResources(), a11);
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        this.f5153b.b(messageDigest);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f5153b.equals(((t) obj).f5153b);
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        return this.f5153b.hashCode();
    }
}
