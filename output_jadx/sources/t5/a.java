package t5;

import j1.i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends b implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5821b = new ArrayList();

    @Override // t5.b
    public final double a() {
        return h().a();
    }

    @Override // t5.b
    public final int d() {
        return h().d();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof a) || !((a) obj).f5821b.equals(this.f5821b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // t5.b
    public final String g() {
        return h().g();
    }

    public final b h() {
        ArrayList arrayList = this.f5821b;
        int size = arrayList.size();
        if (size == 1) {
            return (b) arrayList.get(0);
        }
        i.l(ai.onnxruntime.a.e(size, "Array must have size 1, but has size "));
        return null;
    }

    public final int hashCode() {
        return this.f5821b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5821b.iterator();
    }
}
