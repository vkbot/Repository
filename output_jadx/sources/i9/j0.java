package i9;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j0 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2910a;

    /* renamed from: b, reason: collision with root package name */
    public int f2911b;

    @Override // i9.g1
    public final Object a() {
        return Arrays.copyOf(this.f2910a, this.f2911b);
    }

    @Override // i9.g1
    public final void b(int i10) {
        int[] iArr = this.f2910a;
        if (iArr.length < i10) {
            this.f2910a = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i10, iArr.length * 2));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2911b;
    }
}
