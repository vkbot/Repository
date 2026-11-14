package j;

import android.util.Log;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3037a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3038b;
    public final v.a c;
    public final Pools.Pool d;
    public final String e;

    public l(Class cls, Class cls2, Class cls3, List list, v.a aVar, Pools.Pool pool) {
        this.f3037a = cls;
        this.f3038b = list;
        this.c = aVar;
        this.d = pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r0 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r2 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        if (r0 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j.d0 a(int r17, int r18, com.bumptech.glide.load.data.g r19, h.h r20, j.i r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.l.a(int, int, com.bumptech.glide.load.data.g, h.h, j.i):j.d0");
    }

    public final d0 b(com.bumptech.glide.load.data.g gVar, int i10, int i11, h.h hVar, List list) {
        List list2 = this.f3038b;
        int size = list2.size();
        d0 d0Var = null;
        for (int i12 = 0; i12 < size; i12++) {
            h.j jVar = (h.j) list2.get(i12);
            try {
                if (jVar.b(gVar.d(), hVar)) {
                    d0Var = jVar.a(gVar.d(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e);
                }
                list.add(e);
            }
            if (d0Var != null) {
                break;
            }
        }
        if (d0Var != null) {
            return d0Var;
        }
        throw new z(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f3037a + ", decoders=" + this.f3038b + ", transcoder=" + this.c + '}';
    }
}
