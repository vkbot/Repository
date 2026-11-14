package j;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements g, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f2977b;
    public final h c;
    public final f d;
    public int e = -1;

    /* renamed from: f, reason: collision with root package name */
    public h.e f2978f;

    /* renamed from: g, reason: collision with root package name */
    public List f2979g;

    /* renamed from: h, reason: collision with root package name */
    public int f2980h;

    /* renamed from: i, reason: collision with root package name */
    public volatile n.q f2981i;

    /* renamed from: j, reason: collision with root package name */
    public File f2982j;

    public d(List list, h hVar, f fVar) {
        this.f2977b = list;
        this.c = hVar;
        this.d = fVar;
    }

    @Override // j.g
    public final boolean c() {
        while (true) {
            List list = this.f2979g;
            boolean z9 = false;
            if (list != null && this.f2980h < list.size()) {
                this.f2981i = null;
                while (!z9 && this.f2980h < this.f2979g.size()) {
                    List list2 = this.f2979g;
                    int i10 = this.f2980h;
                    this.f2980h = i10 + 1;
                    n.r rVar = (n.r) list2.get(i10);
                    File file = this.f2982j;
                    h hVar = this.c;
                    this.f2981i = rVar.b(file, hVar.e, hVar.f3003f, hVar.f3006i);
                    if (this.f2981i != null && this.c.c(this.f2981i.c.a()) != null) {
                        this.f2981i.c.e(this.c.f3012o, this);
                        z9 = true;
                    }
                }
                return z9;
            }
            int i11 = this.e + 1;
            this.e = i11;
            if (i11 >= this.f2977b.size()) {
                return false;
            }
            h.e eVar = (h.e) this.f2977b.get(this.e);
            h hVar2 = this.c;
            File c = hVar2.f3005h.a().c(new e(eVar, hVar2.f3011n));
            this.f2982j = c;
            if (c != null) {
                this.f2978f = eVar;
                this.f2979g = this.c.c.a().f(c);
                this.f2980h = 0;
            }
        }
    }

    @Override // j.g
    public final void cancel() {
        n.q qVar = this.f2981i;
        if (qVar != null) {
            qVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        this.d.b(this.f2978f, exc, this.f2981i.c, 3);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.d.a(this.f2978f, obj, this.f2981i.c, 3, this.f2978f);
    }
}
