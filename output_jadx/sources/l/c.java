package l;

import c0.p;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3479a;

    public c(int i10) {
        switch (i10) {
            case 1:
                char[] cArr = p.f446a;
                this.f3479a = new ArrayDeque(0);
                return;
            default:
                this.f3479a = new ArrayDeque();
                return;
        }
    }

    public synchronized void a(g.c cVar) {
        cVar.f2399b = null;
        cVar.c = null;
        this.f3479a.offer(cVar);
    }
}
