package u;

import android.content.Context;
import android.graphics.Bitmap;
import h.l;
import j.d0;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f5843b;

    public c(l lVar) {
        c0.g.c(lVar, "Argument must not be null");
        this.f5843b = lVar;
    }

    @Override // h.l
    public final d0 a(Context context, d0 d0Var, int i10, int i11) {
        b bVar = (b) d0Var.get();
        d0 eVar = new q.e(((f) bVar.f5835b.f5351b).f5856l, com.bumptech.glide.b.a(context).f611b);
        l lVar = this.f5843b;
        d0 a10 = lVar.a(context, eVar, i10, i11);
        if (!eVar.equals(a10)) {
            eVar.recycle();
        }
        ((f) bVar.f5835b.f5351b).c(lVar, (Bitmap) a10.get());
        return d0Var;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        this.f5843b.b(messageDigest);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f5843b.equals(((c) obj).f5843b);
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        return this.f5843b.hashCode();
    }
}
