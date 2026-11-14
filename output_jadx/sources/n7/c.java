package n7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f4163h;

    /* renamed from: a, reason: collision with root package name */
    public final o f4164a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4165b;
    public final Object[][] c;
    public final List d;
    public final Boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f4166f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f4167g;

    static {
        c2.k kVar = new c2.k(3);
        kVar.e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        kVar.f491g = Collections.EMPTY_LIST;
        f4163h = new c(kVar);
    }

    public c(c2.k kVar) {
        this.f4164a = (o) kVar.c;
        this.f4165b = (Executor) kVar.d;
        this.c = (Object[][]) kVar.e;
        this.d = (List) kVar.f491g;
        this.e = (Boolean) kVar.f492h;
        this.f4166f = (Integer) kVar.f490f;
        this.f4167g = (Integer) kVar.f493i;
    }

    public static c2.k b(c cVar) {
        c2.k kVar = new c2.k(3);
        kVar.c = cVar.f4164a;
        kVar.d = cVar.f4165b;
        kVar.e = cVar.c;
        kVar.f491g = cVar.d;
        kVar.f492h = cVar.e;
        kVar.f490f = cVar.f4166f;
        kVar.f493i = cVar.f4167g;
        return kVar;
    }

    public final Object a(a9.w wVar) {
        o4.b.i(wVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (i10 < objArr.length) {
                if (wVar.equals(objArr[i10][0])) {
                    return objArr[i10][1];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final c c(a9.w wVar, Object obj) {
        Object[][] objArr;
        int i10;
        o4.b.i(wVar, "key");
        c2.k b10 = b(this);
        int i11 = 0;
        while (true) {
            objArr = this.c;
            if (i11 < objArr.length) {
                if (wVar.equals(objArr[i11][0])) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        int length = objArr.length;
        if (i11 == -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + i10, 2);
        b10.e = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = (Object[][]) b10.e;
        if (i11 == -1) {
            objArr3[objArr.length] = new Object[]{wVar, obj};
        } else {
            objArr3[i11] = new Object[]{wVar, obj};
        }
        return new c(b10);
    }

    public final String toString() {
        Class<?> cls;
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4164a, "deadline");
        t.c(null, "authority");
        t.c(null, "callCredentials");
        Executor executor = this.f4165b;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        t.c(cls, "executor");
        t.c(null, "compressorName");
        t.c(Arrays.deepToString(this.c), "customOptions");
        t.d("waitForReady", Boolean.TRUE.equals(this.e));
        t.c(this.f4166f, "maxInboundMessageSize");
        t.c(this.f4167g, "maxOutboundMessageSize");
        t.c(this.d, "streamTracerFactories");
        return t.toString();
    }
}
