package i9;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class v1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2955a;

    /* renamed from: b, reason: collision with root package name */
    public int f2956b;

    @Override // i9.g1
    public final Object a() {
        return UIntArray.m243boximpl(UIntArray.m245constructorimpl(Arrays.copyOf(this.f2955a, this.f2956b)));
    }

    @Override // i9.g1
    public final void b(int i10) {
        if (UIntArray.m251getSizeimpl(this.f2955a) < i10) {
            int[] iArr = this.f2955a;
            this.f2955a = UIntArray.m245constructorimpl(Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i10, UIntArray.m251getSizeimpl(iArr) * 2)));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2956b;
    }
}
