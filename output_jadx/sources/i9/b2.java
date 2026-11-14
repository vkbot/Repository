package i9;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b2 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2872a;

    /* renamed from: b, reason: collision with root package name */
    public int f2873b;

    @Override // i9.g1
    public final Object a() {
        return UShortArray.m427boximpl(UShortArray.m429constructorimpl(Arrays.copyOf(this.f2872a, this.f2873b)));
    }

    @Override // i9.g1
    public final void b(int i10) {
        if (UShortArray.m435getSizeimpl(this.f2872a) < i10) {
            short[] sArr = this.f2872a;
            this.f2872a = UShortArray.m429constructorimpl(Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i10, UShortArray.m435getSizeimpl(sArr) * 2)));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2873b;
    }
}
