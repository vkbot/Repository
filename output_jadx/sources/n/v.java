package n;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4036b;
    public final Pools.Pool c;
    public int d;
    public com.bumptech.glide.h e;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f4037f;

    /* renamed from: g, reason: collision with root package name */
    public List f4038g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4039h;

    public v(ArrayList arrayList, Pools.Pool pool) {
        this.c = pool;
        if (!arrayList.isEmpty()) {
            this.f4036b = arrayList;
            this.d = 0;
        } else {
            j1.i.k("Must not be empty.");
            throw null;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f4036b.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f4038g;
        if (list != null) {
            this.c.release(list);
        }
        this.f4038g = null;
        ArrayList arrayList = this.f4036b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((com.bumptech.glide.load.data.e) obj).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return ((com.bumptech.glide.load.data.e) this.f4036b.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f4039h = true;
        ArrayList arrayList = this.f4036b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((com.bumptech.glide.load.data.e) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        List list = this.f4038g;
        c0.g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        this.e = hVar;
        this.f4037f = dVar;
        this.f4038g = (List) this.c.acquire();
        ((com.bumptech.glide.load.data.e) this.f4036b.get(this.d)).e(hVar, this);
        if (this.f4039h) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        if (obj != null) {
            this.f4037f.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f4039h) {
            return;
        }
        if (this.d < this.f4036b.size() - 1) {
            this.d++;
            e(this.e, this.f4037f);
        } else {
            c0.g.b(this.f4038g);
            this.f4037f.d(new j.z("Fetch failed", new ArrayList(this.f4038g)));
        }
    }
}
