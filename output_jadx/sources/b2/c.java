package b2;

import android.content.Context;
import android.net.ConnectivityManager;
import c2.d;
import c2.f;
import c2.g;
import c2.h;
import c2.i;
import c2.j;
import c2.l;
import c2.m;
import c2.o;
import c2.r;
import c2.s;
import c2.t;
import c2.w;
import e2.e;
import java.net.MalformedURLException;
import java.net.URL;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final p f336a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f337b;
    public final Context c;
    public final URL d;
    public final m2.a e;

    /* renamed from: f, reason: collision with root package name */
    public final m2.a f338f;

    /* renamed from: g, reason: collision with root package name */
    public final int f339g;

    public c(Context context, m2.a aVar, m2.a aVar2) {
        z4.c cVar = new z4.c();
        c2.c cVar2 = c2.c.f462a;
        cVar.a(c2.p.class, cVar2);
        cVar.a(i.class, cVar2);
        f fVar = f.f471a;
        cVar.a(t.class, fVar);
        cVar.a(m.class, fVar);
        d dVar = d.f464a;
        cVar.a(r.class, dVar);
        cVar.a(j.class, dVar);
        c2.b bVar = c2.b.f452a;
        cVar.a(c2.a.class, bVar);
        cVar.a(h.class, bVar);
        c2.e eVar = c2.e.f466a;
        cVar.a(s.class, eVar);
        cVar.a(l.class, eVar);
        g gVar = g.f476a;
        cVar.a(w.class, gVar);
        cVar.a(o.class, gVar);
        cVar.d = true;
        this.f336a = new p(20, cVar);
        this.c = context;
        this.f337b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = a(a.c);
        this.e = aVar2;
        this.f338f = aVar;
        this.f339g = 130000;
    }

    public static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ai.onnxruntime.a.l("Invalid url: ", str), e);
        }
    }
}
