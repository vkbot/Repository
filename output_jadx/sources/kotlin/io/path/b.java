package kotlin.io.path;

import java.nio.file.Path;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3445b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(int i10, boolean z9) {
        this.f3445b = i10;
        this.c = z9;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CopyActionContext copyActionContext = (CopyActionContext) obj;
        Path path = (Path) obj2;
        Path path2 = (Path) obj3;
        switch (this.f3445b) {
            case 0:
                return PathsKt__PathRecursiveFunctionsKt.a(this.c, copyActionContext, path, path2);
            default:
                return PathsKt__PathRecursiveFunctionsKt.d(this.c, copyActionContext, path, path2);
        }
    }
}
