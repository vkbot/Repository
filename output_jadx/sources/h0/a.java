package h0;

import android.content.Context;
import com.example.navistart.cores.AreaDisplayProxy;
import com.example.navistart.cores.CarCmdProxy;
import com.example.navistart.cores.InterC;
import com.example.navistart.cores.ProBroProxy;
import com.example.navistart.cores.ProLanProxy;
import j1.v;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2527a;

    /* renamed from: b, reason: collision with root package name */
    public CarCmdProxy f2528b;
    public ProLanProxy c;
    public ProBroProxy d;
    public AreaDisplayProxy e;

    /* renamed from: f, reason: collision with root package name */
    public i0.b f2529f;

    /* renamed from: g, reason: collision with root package name */
    public k1.a f2530g;

    /* renamed from: h, reason: collision with root package name */
    public n0.c f2531h;

    /* renamed from: i, reason: collision with root package name */
    public v f2532i;

    public a(Context context, n0.c cVar) {
        this.f2527a = context;
        this.f2531h = cVar;
    }

    public final void a(n0.c cVar, InterC interC, Context context) {
        this.f2532i = cVar.f4068i;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Object[] objArr = {this.f2528b, this.c, this.d};
        for (int i10 = 0; i10 < 3; i10++) {
            Object obj = objArr[i10];
            if ((obj instanceof AutoCloseable) && newSetFromMap.add(obj)) {
                try {
                    ai.onnxruntime.a.A((AutoCloseable) obj);
                } catch (Exception unused) {
                }
            }
        }
        interC.c();
        this.f2528b = (CarCmdProxy) cVar.c.create(context);
        this.c = (ProLanProxy) cVar.d.create(context);
        this.d = (ProBroProxy) cVar.e.create(context);
        this.f2529f = (i0.b) cVar.f4065f.create();
        this.e = (AreaDisplayProxy) cVar.f4066g.create(context);
        this.f2530g = (k1.a) cVar.f4067h.create();
        this.f2531h = cVar;
    }
}
