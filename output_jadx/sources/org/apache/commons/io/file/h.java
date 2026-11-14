package org.apache.commons.io.file;

import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4822b;

    public /* synthetic */ h(int i10) {
        this.f4822b = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Path path = (Path) obj;
        switch (this.f4822b) {
            case 0:
                return path.toString();
            case 1:
                return PathUtils.a(path);
            default:
                return Objects.toString(path);
        }
    }
}
