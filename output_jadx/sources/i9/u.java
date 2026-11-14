package i9;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class u extends a {

    /* renamed from: a, reason: collision with root package name */
    public final e9.b f2947a;

    public u(e9.b bVar) {
        this.f2947a = bVar;
    }

    @Override // e9.h
    public void b(h9.b bVar, Object obj) {
        int h2 = h(obj);
        g9.e a10 = a();
        h9.d beginCollection = bVar.beginCollection(a10, h2);
        Iterator g10 = g(obj);
        for (int i10 = 0; i10 < h2; i10++) {
            beginCollection.encodeSerializableElement(a(), i10, this.f2947a, g10.next());
        }
        beginCollection.endStructure(a10);
    }

    @Override // i9.a
    public final void j(h9.c cVar, Object obj, int i10, int i11) {
        if (i11 >= 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                k(cVar, i10 + i12, obj);
            }
            return;
        }
        j1.i.k("Size must be known in advance when using READ_ALL");
    }

    @Override // i9.a
    public void k(h9.c cVar, int i10, Object obj) {
        n(i10, obj, cVar.decodeSerializableElement(a(), i10, this.f2947a, null));
    }

    public abstract void n(int i10, Object obj, Object obj2);
}
