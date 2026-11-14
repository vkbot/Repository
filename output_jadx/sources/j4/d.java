package j4;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends e {
    public final transient int d;
    public final transient int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3270f;

    public d(e eVar, int i10, int i11) {
        this.f3270f = eVar;
        this.d = i10;
        this.e = i11;
    }

    @Override // j4.a
    public final Object[] e() {
        return this.f3270f.e();
    }

    @Override // j4.a
    public final int f() {
        return this.f3270f.g() + this.d + this.e;
    }

    @Override // j4.a
    public final int g() {
        return this.f3270f.g() + this.d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        o4.b.h(i10, this.e);
        return this.f3270f.get(i10 + this.d);
    }

    @Override // j4.a
    public final boolean h() {
        return true;
    }

    @Override // j4.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // j4.e, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final e subList(int i10, int i11) {
        o4.b.k(i10, i11, this.e);
        int i12 = this.d;
        return this.f3270f.subList(i10 + i12, i11 + i12);
    }

    @Override // j4.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // j4.e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
