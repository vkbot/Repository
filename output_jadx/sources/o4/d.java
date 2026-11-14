package o4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f4354a = new AtomicReference();

    public static void a(boolean z9) {
        synchronized (f.f4357j) {
            try {
                ArrayList arrayList = new ArrayList(f.f4358k.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f fVar = (f) obj;
                    if (fVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f4364i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((c) it.next()).f4353a;
                            if (!z9) {
                                ((c5.d) fVar2.f4363h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
