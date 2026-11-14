package u5;

import com.google.protobuf.d1;
import com.google.protobuf.h1;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class c extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5887b;
    public final /* synthetic */ AbstractMap c;

    public /* synthetic */ c(AbstractMap abstractMap, int i10) {
        this.f5887b = i10;
        this.c = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f5887b) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((d1) this.c).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5887b) {
            case 0:
                ((e) this.c).clear();
                return;
            case 1:
                ((e) this.c).clear();
                return;
            default:
                ((d1) this.c).clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f5887b
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L26;
                default: goto L5;
            }
        L5:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.AbstractMap r0 = r4.c
            com.google.protobuf.d1 r0 = (com.google.protobuf.d1) r0
            java.lang.Object r1 = r5.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L24
            if (r0 == 0) goto L22
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L22
            goto L24
        L22:
            r5 = 0
            goto L25
        L24:
            r5 = 1
        L25:
            return r5
        L26:
            java.util.AbstractMap r0 = r4.c
            u5.e r0 = (u5.e) r0
            boolean r5 = r0.containsKey(r5)
            return r5
        L2f:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L59
            java.util.AbstractMap r0 = r4.c
            u5.e r0 = (u5.e) r0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L46
            u5.d r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L46
            goto L47
        L46:
            r0 = r3
        L47:
            if (r0 == 0) goto L56
            java.lang.Object r2 = r0.f5891h
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L56
            r3 = r0
        L56:
            if (r3 == 0) goto L59
            r1 = 1
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.c.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f5887b) {
            case 0:
                return new b((e) this.c, 0);
            case 1:
                return new b((e) this.c, 1);
            default:
                return new h1((d1) this.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f5887b
            switch(r0) {
                case 0: goto L32;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            boolean r0 = r5.contains(r6)
            if (r0 == 0) goto L1a
            java.util.AbstractMap r0 = r5.c
            com.google.protobuf.d1 r0 = (com.google.protobuf.d1) r0
            java.lang.Object r6 = r6.getKey()
            r0.remove(r6)
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            return r6
        L1c:
            java.util.AbstractMap r0 = r5.c
            u5.e r0 = (u5.e) r0
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L28
            u5.d r2 = r0.a(r6, r1)     // Catch: java.lang.ClassCastException -> L28
        L28:
            r6 = 1
            if (r2 == 0) goto L2e
            r0.c(r2, r6)
        L2e:
            if (r2 == 0) goto L31
            r1 = r6
        L31:
            return r1
        L32:
            java.util.AbstractMap r0 = r5.c
            u5.e r0 = (u5.e) r0
            boolean r1 = r6 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto L3c
            goto L61
        L3c:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getKey()
            r3 = 0
            if (r1 == 0) goto L4a
            u5.d r1 = r0.a(r1, r2)     // Catch: java.lang.ClassCastException -> L4a
            goto L4b
        L4a:
            r1 = r3
        L4b:
            if (r1 == 0) goto L5a
            java.lang.Object r4 = r1.f5891h
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L5a
            r3 = r1
        L5a:
            if (r3 != 0) goto L5d
            goto L61
        L5d:
            r2 = 1
            r0.c(r3, r2)
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.c.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5887b) {
            case 0:
                return ((e) this.c).d;
            case 1:
                return ((e) this.c).d;
            default:
                return ((d1) this.c).size();
        }
    }
}
