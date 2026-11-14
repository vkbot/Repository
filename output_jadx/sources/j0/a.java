package j0;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.function.IntFunction;
import org.apache.commons.io.comparator.CompositeFileComparator;
import org.apache.commons.io.monitor.FileAlterationObserver;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3088a;

    public /* synthetic */ a(int i10) {
        this.f3088a = i10;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        Comparator[] lambda$new$0;
        switch (this.f3088a) {
            case 0:
                return (Enum[]) Array.newInstance((Class<?>) n0.d.class, i10);
            case 1:
                lambda$new$0 = CompositeFileComparator.lambda$new$0(i10);
                return lambda$new$0;
            default:
                return FileAlterationObserver.g(i10);
        }
    }
}
