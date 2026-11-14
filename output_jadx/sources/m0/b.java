package m0;

import java.util.function.BooleanSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3607b;

    public /* synthetic */ b(i iVar, int i10) {
        this.f3606a = iVar;
        this.f3607b = i10;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        if (this.f3607b == this.f3606a.f3731j) {
            return true;
        }
        return false;
    }
}
