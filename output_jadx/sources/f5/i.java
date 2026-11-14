package f5;

import java.util.LinkedHashSet;
import java.util.Optional;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements e5.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2287b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2288f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2289g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2290h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2291i;

    public i() {
        this.f2287b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f2288f = new LinkedHashSet();
        this.f2290h = Optional.empty();
        this.f2291i = Optional.empty();
    }

    @Override // t8.a
    public Object get() {
        ((g5.a) this.f2287b).get();
        ((z3.f) this.c).get();
        ((g5.a) this.d).get();
        ((g5.a) this.e).get();
        ((g5.a) this.f2288f).get();
        ((w7.c) this.f2289g).get();
        ((a5.h) this.f2291i).get();
        return new c5.e(6);
    }

    public i(g5.a aVar, z3.f fVar, g5.a aVar2, g5.a aVar3, g5.a aVar4, w7.c cVar, t8.a aVar5, a5.h hVar) {
        this.f2287b = aVar;
        this.c = fVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f2288f = aVar4;
        this.f2289g = cVar;
        this.f2290h = aVar5;
        this.f2291i = hVar;
    }
}
