package i9;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class y1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2966a;

    /* renamed from: b, reason: collision with root package name */
    public int f2967b;

    @Override // i9.g1
    public final Object a() {
        return ULongArray.m322boximpl(ULongArray.m324constructorimpl(Arrays.copyOf(this.f2966a, this.f2967b)));
    }

    @Override // i9.g1
    public final void b(int i10) {
        if (ULongArray.m330getSizeimpl(this.f2966a) < i10) {
            long[] jArr = this.f2966a;
            this.f2966a = ULongArray.m324constructorimpl(Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i10, ULongArray.m330getSizeimpl(jArr) * 2)));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2967b;
    }
}
