package j;

import androidx.collection.ArrayMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e0 implements g, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final k f2984b;
    public final h c;
    public int d;
    public int e = -1;

    /* renamed from: f, reason: collision with root package name */
    public h.e f2985f;

    /* renamed from: g, reason: collision with root package name */
    public List f2986g;

    /* renamed from: h, reason: collision with root package name */
    public int f2987h;

    /* renamed from: i, reason: collision with root package name */
    public volatile n.q f2988i;

    /* renamed from: j, reason: collision with root package name */
    public File f2989j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f2990k;

    public e0(h hVar, k kVar) {
        this.c = hVar;
        this.f2984b = kVar;
    }

    @Override // j.g
    public final boolean c() {
        List list;
        boolean z9;
        List list2;
        boolean z10;
        ArrayList c;
        ArrayList a10 = this.c.a();
        if (a10.isEmpty()) {
            return false;
        }
        h hVar = this.c;
        com.bumptech.glide.j a11 = hVar.c.a();
        Class<?> cls = hVar.d.getClass();
        Class cls2 = hVar.f3004g;
        Class cls3 = hVar.f3008k;
        l.d dVar = a11.f634h;
        c0.n nVar = (c0.n) ((AtomicReference) dVar.c).getAndSet(null);
        if (nVar == null) {
            nVar = new c0.n(cls, cls2, cls3);
        } else {
            nVar.f443a = cls;
            nVar.f444b = cls2;
            nVar.c = cls3;
        }
        synchronized (((ArrayMap) dVar.d)) {
            list = (List) ((ArrayMap) dVar.d).get(nVar);
        }
        ((AtomicReference) dVar.c).set(nVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            n.u uVar = a11.f630a;
            synchronized (uVar) {
                c = uVar.f4034a.c(cls);
            }
            int size = c.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = c.get(i10);
                i10++;
                ArrayList u8 = a11.c.u((Class) obj, cls2);
                int size2 = u8.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = u8.get(i11);
                    i11++;
                    Class cls4 = (Class) obj2;
                    if (!a11.f632f.e(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z9 = false;
            l.d dVar2 = a11.f634h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((ArrayMap) dVar2.d)) {
                ((ArrayMap) dVar2.d).put(new c0.n(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        } else {
            z9 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (!File.class.equals(this.c.f3008k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.c.d.getClass());
                ai.onnxruntime.b.p(sb, " to ", this.c.f3008k);
                return false;
            }
            return z9;
        }
        while (true) {
            List list3 = this.f2986g;
            if (list3 != null && this.f2987h < list3.size()) {
                this.f2988i = null;
                boolean z11 = z9;
                while (!z11 && this.f2987h < this.f2986g.size()) {
                    List list4 = this.f2986g;
                    int i12 = this.f2987h;
                    this.f2987h = i12 + 1;
                    n.r rVar = (n.r) list4.get(i12);
                    File file = this.f2989j;
                    h hVar2 = this.c;
                    this.f2988i = rVar.b(file, hVar2.e, hVar2.f3003f, hVar2.f3006i);
                    if (this.f2988i != null && this.c.c(this.f2988i.c.a()) != null) {
                        this.f2988i.c.e(this.c.f3012o, this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i13 = this.e + 1;
            this.e = i13;
            if (i13 >= list2.size()) {
                int i14 = this.d + 1;
                this.d = i14;
                if (i14 >= a10.size()) {
                    return z9;
                }
                this.e = z9 ? 1 : 0;
            }
            h.e eVar = (h.e) a10.get(this.d);
            Class cls5 = (Class) list2.get(this.e);
            h.l e = this.c.e(cls5);
            h hVar3 = this.c;
            this.f2990k = new f0(hVar3.c.f619a, eVar, hVar3.f3011n, hVar3.e, hVar3.f3003f, e, cls5, hVar3.f3006i);
            File c10 = hVar3.f3005h.a().c(this.f2990k);
            this.f2989j = c10;
            if (c10 != null) {
                this.f2985f = eVar;
                this.f2986g = this.c.c.a().f(c10);
                z10 = false;
                this.f2987h = 0;
            } else {
                z10 = false;
            }
            z9 = z10;
        }
    }

    @Override // j.g
    public final void cancel() {
        n.q qVar = this.f2988i;
        if (qVar != null) {
            qVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        this.f2984b.b(this.f2990k, exc, this.f2988i.c, 4);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f2984b.a(this.f2985f, obj, this.f2988i.c, 4, this.f2990k);
    }
}
