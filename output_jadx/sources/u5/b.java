package u5;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public d f5885b;
    public d c = null;
    public int d;
    public final /* synthetic */ e e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5886f;

    public b(e eVar, int i10) {
        this.f5886f = i10;
        this.e = eVar;
        this.f5885b = eVar.f5895f.e;
        this.d = eVar.e;
    }

    public final Object a() {
        return b();
    }

    public final d b() {
        d dVar = this.f5885b;
        e eVar = this.e;
        if (dVar != eVar.f5895f) {
            if (eVar.e == this.d) {
                this.f5885b = dVar.e;
                this.c = dVar;
                return dVar;
            }
            ai.onnxruntime.b.a();
            return null;
        }
        n0.b.x();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5885b != this.e.f5895f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f5886f) {
            case 1:
                return b().f5890g;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        d dVar = this.c;
        if (dVar != null) {
            e eVar = this.e;
            eVar.c(dVar, true);
            this.c = null;
            this.d = eVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
