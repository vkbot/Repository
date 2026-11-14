package org.apache.commons.io.file;

import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.function.Predicate;
import org.apache.commons.io.file.spi.FileSystemProviders;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4825b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f4824a = i10;
        this.f4825b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$filterPaths$2;
        switch (this.f4824a) {
            case 0:
                lambda$filterPaths$2 = PathUtils.lambda$filterPaths$2((PathFilter) this.f4825b, (Path) obj);
                return lambda$filterPaths$2;
            default:
                return FileSystemProviders.a((String) this.f4825b, (FileSystemProvider) obj);
        }
    }
}
