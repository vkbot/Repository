package i9;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class n1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2926a;

    /* renamed from: b, reason: collision with root package name */
    public int f2927b;

    @Override // i9.g1
    public final Object a() {
        return Arrays.copyOf(this.f2926a, this.f2927b);
    }

    @Override // i9.g1
    public final void b(int i10) {
        short[] sArr = this.f2926a;
        if (sArr.length < i10) {
            this.f2926a = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i10, sArr.length * 2));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2927b;
    }
}
