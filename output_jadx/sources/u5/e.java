package u5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import s3.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final m f5893i = new m(1);
    public d c;

    /* renamed from: g, reason: collision with root package name */
    public c f5896g;

    /* renamed from: h, reason: collision with root package name */
    public c f5897h;
    public int d = 0;
    public int e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f5894b = f5893i;

    /* renamed from: f, reason: collision with root package name */
    public final d f5895f = new d();

    public final d a(Object obj, boolean z9) {
        int i10;
        d dVar;
        Comparable comparable;
        d dVar2;
        d dVar3 = this.c;
        m mVar = f5893i;
        Comparator comparator = this.f5894b;
        if (dVar3 != null) {
            if (comparator == mVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = dVar3.f5890g;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return dVar3;
                }
                if (i10 < 0) {
                    dVar2 = dVar3.c;
                } else {
                    dVar2 = dVar3.d;
                }
                if (dVar2 == null) {
                    break;
                }
                dVar3 = dVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z9) {
            return null;
        }
        d dVar4 = this.f5895f;
        if (dVar3 == null) {
            if (comparator == mVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d(dVar3, obj, dVar4, dVar4.f5889f);
            this.c = dVar;
        } else {
            dVar = new d(dVar3, obj, dVar4, dVar4.f5889f);
            if (i10 < 0) {
                dVar3.c = dVar;
            } else {
                dVar3.d = dVar;
            }
            b(dVar3, true);
        }
        this.d++;
        this.e++;
        return dVar;
    }

    public final void b(d dVar, boolean z9) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (dVar != null) {
            d dVar2 = dVar.c;
            d dVar3 = dVar.d;
            int i14 = 0;
            if (dVar2 != null) {
                i10 = dVar2.f5892i;
            } else {
                i10 = 0;
            }
            if (dVar3 != null) {
                i11 = dVar3.f5892i;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                d dVar4 = dVar3.c;
                d dVar5 = dVar3.d;
                if (dVar5 != null) {
                    i13 = dVar5.f5892i;
                } else {
                    i13 = 0;
                }
                if (dVar4 != null) {
                    i14 = dVar4.f5892i;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z9)) {
                    f(dVar3);
                    e(dVar);
                } else {
                    e(dVar);
                }
                if (z9) {
                    return;
                }
            } else if (i15 == 2) {
                d dVar6 = dVar2.c;
                d dVar7 = dVar2.d;
                if (dVar7 != null) {
                    i12 = dVar7.f5892i;
                } else {
                    i12 = 0;
                }
                if (dVar6 != null) {
                    i14 = dVar6.f5892i;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z9)) {
                    e(dVar2);
                    f(dVar);
                } else {
                    f(dVar);
                }
                if (z9) {
                    return;
                }
            } else if (i15 == 0) {
                dVar.f5892i = i10 + 1;
                if (z9) {
                    return;
                }
            } else {
                dVar.f5892i = Math.max(i10, i11) + 1;
                if (!z9) {
                    return;
                }
            }
            dVar = dVar.f5888b;
        }
    }

    public final void c(d dVar, boolean z9) {
        d dVar2;
        d dVar3;
        int i10;
        if (z9) {
            d dVar4 = dVar.f5889f;
            dVar4.e = dVar.e;
            dVar.e.f5889f = dVar4;
        }
        d dVar5 = dVar.c;
        d dVar6 = dVar.d;
        d dVar7 = dVar.f5888b;
        int i11 = 0;
        if (dVar5 != null && dVar6 != null) {
            if (dVar5.f5892i > dVar6.f5892i) {
                d dVar8 = dVar5.d;
                while (true) {
                    d dVar9 = dVar8;
                    dVar3 = dVar5;
                    dVar5 = dVar9;
                    if (dVar5 == null) {
                        break;
                    } else {
                        dVar8 = dVar5.d;
                    }
                }
            } else {
                d dVar10 = dVar6.c;
                while (true) {
                    dVar2 = dVar6;
                    dVar6 = dVar10;
                    if (dVar6 == null) {
                        break;
                    } else {
                        dVar10 = dVar6.c;
                    }
                }
                dVar3 = dVar2;
            }
            c(dVar3, false);
            d dVar11 = dVar.c;
            if (dVar11 != null) {
                i10 = dVar11.f5892i;
                dVar3.c = dVar11;
                dVar11.f5888b = dVar3;
                dVar.c = null;
            } else {
                i10 = 0;
            }
            d dVar12 = dVar.d;
            if (dVar12 != null) {
                i11 = dVar12.f5892i;
                dVar3.d = dVar12;
                dVar12.f5888b = dVar3;
                dVar.d = null;
            }
            dVar3.f5892i = Math.max(i10, i11) + 1;
            d(dVar, dVar3);
            return;
        }
        if (dVar5 != null) {
            d(dVar, dVar5);
            dVar.c = null;
        } else if (dVar6 != null) {
            d(dVar, dVar6);
            dVar.d = null;
        } else {
            d(dVar, null);
        }
        b(dVar7, false);
        this.d--;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        d dVar = this.f5895f;
        dVar.f5889f = dVar;
        dVar.e = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        d dVar = null;
        if (obj != null) {
            try {
                dVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dVar == null) {
            return false;
        }
        return true;
    }

    public final void d(d dVar, d dVar2) {
        d dVar3 = dVar.f5888b;
        dVar.f5888b = null;
        if (dVar2 != null) {
            dVar2.f5888b = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.c == dVar) {
                dVar3.c = dVar2;
                return;
            } else {
                dVar3.d = dVar2;
                return;
            }
        }
        this.c = dVar2;
    }

    public final void e(d dVar) {
        int i10;
        int i11;
        d dVar2 = dVar.c;
        d dVar3 = dVar.d;
        d dVar4 = dVar3.c;
        d dVar5 = dVar3.d;
        dVar.d = dVar4;
        if (dVar4 != null) {
            dVar4.f5888b = dVar;
        }
        d(dVar, dVar3);
        dVar3.c = dVar;
        dVar.f5888b = dVar3;
        int i12 = 0;
        if (dVar2 != null) {
            i10 = dVar2.f5892i;
        } else {
            i10 = 0;
        }
        if (dVar4 != null) {
            i11 = dVar4.f5892i;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        dVar.f5892i = max;
        if (dVar5 != null) {
            i12 = dVar5.f5892i;
        }
        dVar3.f5892i = Math.max(max, i12) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c cVar = this.f5896g;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 0);
        this.f5896g = cVar2;
        return cVar2;
    }

    public final void f(d dVar) {
        int i10;
        int i11;
        d dVar2 = dVar.c;
        d dVar3 = dVar.d;
        d dVar4 = dVar2.c;
        d dVar5 = dVar2.d;
        dVar.c = dVar5;
        if (dVar5 != null) {
            dVar5.f5888b = dVar;
        }
        d(dVar, dVar2);
        dVar2.d = dVar;
        dVar.f5888b = dVar2;
        int i12 = 0;
        if (dVar3 != null) {
            i10 = dVar3.f5892i;
        } else {
            i10 = 0;
        }
        if (dVar5 != null) {
            i11 = dVar5.f5892i;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        dVar.f5892i = max;
        if (dVar4 != null) {
            i12 = dVar4.f5892i;
        }
        dVar2.f5892i = Math.max(max, i12) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            u5.d r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f5891h
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.e.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        c cVar = this.f5897h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 1);
        this.f5897h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                d a10 = a(obj, true);
                Object obj3 = a10.f5891h;
                a10.f5891h = obj2;
                return obj3;
            }
            n0.b.n("value == null");
            return null;
        }
        n0.b.n("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            u5.d r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f5891h
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.e.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
