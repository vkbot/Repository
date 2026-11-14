package t2;

import android.content.Context;
import com.bumptech.glide.manager.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5793b;

    /* renamed from: a, reason: collision with root package name */
    public o f5794a;

    /* JADX WARN: Type inference failed for: r0v0, types: [t2.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f5794a = null;
        f5793b = obj;
    }

    public static o a(Context context) {
        o oVar;
        a aVar = f5793b;
        synchronized (aVar) {
            try {
                if (aVar.f5794a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    aVar.f5794a = new o(context, 11);
                }
                oVar = aVar.f5794a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}
