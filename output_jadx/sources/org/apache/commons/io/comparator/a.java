package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4816b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ a(Serializable serializable, Serializable serializable2, int i10) {
        this.f4816b = i10;
        this.c = serializable;
        this.d = serializable2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer lambda$compare$1;
        switch (this.f4816b) {
            case 0:
                lambda$compare$1 = CompositeFileComparator.lambda$compare$1((File) this.c, (File) this.d, (Comparator) obj);
                return lambda$compare$1;
            default:
                return FileAlterationObserver.e((FileAlterationObserver) this.c, (FileEntry) this.d, (File) obj);
        }
    }
}
