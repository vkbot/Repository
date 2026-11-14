package a9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final w f65a = new w("CLOSED", 0);

    public static final Object a(u uVar, long j10, Function2 function2) {
        while (true) {
            if (uVar.d >= j10 && !uVar.c()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f68b;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            w wVar = f65a;
            if (obj == wVar) {
                return wVar;
            }
            u uVar2 = (u) ((e) obj);
            if (uVar2 == null) {
                uVar2 = (u) function2.invoke(Long.valueOf(uVar.d + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.c()) {
                    uVar.d();
                }
            }
            uVar = uVar2;
        }
    }
}
