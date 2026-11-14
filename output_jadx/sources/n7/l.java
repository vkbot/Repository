package n7;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f4223a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [n7.m] */
    static {
        ?? r1;
        AtomicReference atomicReference = new AtomicReference();
        try {
            r1 = (m) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(m.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            r1 = new Object();
        } catch (Exception e6) {
            ai.onnxruntime.b.o("Storage override failed to initialize", e6);
            return;
        }
        f4223a = r1;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            n.f4229a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
