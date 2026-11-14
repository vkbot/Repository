package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface o extends Future {
    void addListener(Runnable runnable, Executor executor);
}
