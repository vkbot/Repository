package j4;

import java.util.ListIterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends q implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f3269b;
    public int c;
    public final e d;

    public c(e eVar, int i10) {
        int size = eVar.size();
        o4.b.j(i10, size);
        this.f3269b = size;
        this.c = i10;
        this.d = eVar;
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.c < this.f3269b) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.c;
            this.c = i10 + 1;
            return a(i10);
        }
        n0.b.x();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.c - 1;
            this.c = i10;
            return a(i10);
        }
        n0.b.x();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
