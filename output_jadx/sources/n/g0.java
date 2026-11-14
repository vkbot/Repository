package n;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g0 implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f4019b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final r f4020a;

    public g0(r rVar) {
        this.f4020a = rVar;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        return f4019b.contains(((Uri) obj).getScheme());
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        return this.f4020a.b(new g(((Uri) obj).toString()), i10, i11, hVar);
    }
}
