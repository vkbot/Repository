package n;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f4013b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f4014a;

    public f0(e0 e0Var) {
        this.f4014a = e0Var;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        return f4013b.contains(((Uri) obj).getScheme());
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        com.bumptech.glide.load.data.e aVar;
        Uri uri = (Uri) obj;
        b0.b bVar = new b0.b(uri);
        e0 e0Var = (e0) this.f4014a;
        switch (e0Var.f4012b) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(e0Var.c, uri, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(e0Var.c, uri, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.b(1, uri, e0Var.c);
                break;
        }
        return new q(bVar, aVar);
    }
}
