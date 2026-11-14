package f5;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public HashSet f2270a;

    /* renamed from: b, reason: collision with root package name */
    public volatile a0 f2271b;

    public final void a(Set set) {
        a0 a0Var = this.f2271b;
        if (a0Var == c) {
            return;
        }
        if (a0Var != null) {
            a0Var.a(set);
        } else {
            synchronized (this) {
                this.f2270a.addAll(set);
            }
        }
    }
}
