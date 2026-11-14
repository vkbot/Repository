package c0;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import n7.h0;
import o7.f2;
import o7.g3;
import o7.x;
import o7.y0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public Object f435b;
    public volatile Object c;

    public /* synthetic */ h(Object obj) {
        this.f435b = obj;
    }

    public l.a a() {
        File file;
        if (((l.a) this.c) == null) {
            synchronized (this) {
                try {
                    if (((l.a) this.c) == null) {
                        File cacheDir = ((com.bumptech.glide.manager.o) ((r5.c) this.f435b).c).c.getCacheDir();
                        l.e eVar = null;
                        if (cacheDir == null) {
                            file = null;
                        } else {
                            file = new File(cacheDir, "image_manager_disk_cache");
                        }
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            eVar = new l.e(file);
                        }
                        this.c = eVar;
                    }
                    if (((l.a) this.c) == null) {
                        this.c = new w7.c(13);
                    }
                } finally {
                }
            }
        }
        return (l.a) this.c;
    }

    public x b(g3 g3Var) {
        h0 h0Var = ((f2) this.f435b).f4509y;
        if (((f2) this.f435b).G.get()) {
            return ((f2) this.f435b).E;
        }
        if (h0Var == null) {
            ((f2) this.f435b).f4500m.execute(new com.bumptech.glide.m(13, this));
            return ((f2) this.f435b).E;
        }
        x f8 = y0.f(h0Var.a(g3Var), Boolean.TRUE.equals(g3Var.f4535a.e));
        if (f8 != null) {
            return f8;
        }
        return ((f2) this.f435b).E;
    }

    public void c(n7.j jVar) {
        o4.b.i(jVar, "newState");
        if (((n7.j) this.c) != jVar && ((n7.j) this.c) != n7.j.f4215f) {
            this.c = jVar;
            if (!((ArrayList) this.f435b).isEmpty()) {
                ArrayList arrayList = (ArrayList) this.f435b;
                this.f435b = new ArrayList();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw com.bumptech.glide.g.b(it);
                }
            }
        }
    }

    @Override // c0.i
    public Object get() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        Object obj = ((i) this.f435b).get();
                        g.c(obj, "Argument must not be null");
                        this.c = obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
