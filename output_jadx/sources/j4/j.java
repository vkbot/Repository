package j4;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends e {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k kVar = this.d;
        o4.b.h(i10, kVar.f3276g);
        Object[] objArr = kVar.f3275f;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // j4.a
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.f3276g;
    }
}
