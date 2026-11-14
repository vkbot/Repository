package k;

import c0.p;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import n.c0;
import n.r;
import n.s;
import n.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3353b;

    public a(int i10) {
        switch (i10) {
            case 2:
                this.f3353b = Collections.newSetFromMap(new IdentityHashMap());
                return;
            default:
                char[] cArr = p.f446a;
                this.f3353b = new ArrayDeque(20);
                return;
        }
    }

    public abstract void a();

    public abstract void b();

    public void c(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3353b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public void d(Object obj, boolean z9) {
        Set set = (Set) this.f3353b;
        int size = set.size();
        if (z9) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }

    @Override // n.s
    public r j(z zVar) {
        return new n.c(2, (c0) this.f3353b);
    }

    public a(c0 c0Var) {
        this.f3353b = c0Var;
    }
}
