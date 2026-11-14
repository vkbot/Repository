package n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 implements s, v.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3999b;
    public final Resources c;

    public /* synthetic */ a0(Resources resources, int i10) {
        this.f3999b = i10;
        this.c = resources;
    }

    @Override // v.a
    public j.d0 a(j.d0 d0Var, h.h hVar) {
        if (d0Var == null) {
            return null;
        }
        return new q.e(this.c, d0Var);
    }

    @Override // n.s
    public r j(z zVar) {
        switch (this.f3999b) {
            case 0:
                return new b(this.c, zVar.b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new b(this.c, zVar.b(Uri.class, InputStream.class));
            default:
                return new b(this.c, d0.f4008b);
        }
    }
}
