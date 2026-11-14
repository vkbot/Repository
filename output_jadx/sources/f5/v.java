package f5;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2337a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(d5.l.f1834b, d5.v.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(d5.l.c, d5.v.IMAGE_FETCH_ERROR);
        hashMap.put(d5.l.d, d5.v.IMAGE_DISPLAY_ERROR);
        hashMap.put(d5.l.e, d5.v.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(d5.k.c, d5.g.AUTO);
        hashMap2.put(d5.k.d, d5.g.CLICK);
        hashMap2.put(d5.k.e, d5.g.SWIPE);
        hashMap2.put(d5.k.f1832b, d5.g.UNKNOWN_DISMISS_TYPE);
    }

    public v(Executor executor) {
        this.f2337a = executor;
    }
}
