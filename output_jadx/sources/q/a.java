package q;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements h.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5117a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5118b;
    public final Object c;

    public a(Resources resources, h.j jVar) {
        this.f5117a = 0;
        this.c = resources;
        this.f5118b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.InputStream] */
    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        boolean z9;
        x xVar;
        c0.e eVar;
        c0.e eVar2;
        switch (this.f5117a) {
            case 0:
                j.d0 a10 = ((h.j) this.f5118b).a(obj, i10, i11, hVar);
                Resources resources = (Resources) this.c;
                if (a10 == null) {
                    return null;
                }
                return new e(resources, a10);
            case 1:
                j.d0 c = ((s.c) this.f5118b).c((Uri) obj, hVar);
                if (c == null) {
                    return null;
                }
                return s.a((k.b) this.c, (Drawable) ((s.b) c).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof x) {
                    xVar = (x) inputStream;
                    z9 = false;
                } else {
                    z9 = true;
                    xVar = new x(inputStream, (k.g) this.c);
                }
                ArrayDeque arrayDeque = c0.e.d;
                synchronized (arrayDeque) {
                    eVar = (c0.e) arrayDeque.poll();
                    eVar2 = eVar;
                }
                if (eVar == null) {
                    eVar2 = new InputStream();
                }
                c0.e eVar3 = eVar2;
                eVar3.f431b = xVar;
                c0.m mVar = new c0.m(eVar3);
                l.d dVar = new l.d(8, xVar, eVar3);
                try {
                    q qVar = (q) this.f5118b;
                    e a11 = qVar.a(new a5.h(mVar, qVar.d, qVar.c), i10, i11, hVar, dVar);
                    eVar3.c = null;
                    eVar3.f431b = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar3);
                    }
                    if (z9) {
                        xVar.c();
                    }
                    return a11;
                } catch (Throwable th) {
                    eVar3.c = null;
                    eVar3.f431b = null;
                    ArrayDeque arrayDeque2 = c0.e.d;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar3);
                        if (z9) {
                            xVar.c();
                            throw th;
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // h.j
    public final boolean b(Object obj, h.h hVar) {
        switch (this.f5117a) {
            case 0:
                return ((h.j) this.f5118b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f5117a = i10;
        this.f5118b = obj;
        this.c = obj2;
    }
}
