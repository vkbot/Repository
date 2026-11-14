package i9;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class v extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f2952a;

    /* renamed from: b, reason: collision with root package name */
    public int f2953b;

    @Override // i9.g1
    public final Object a() {
        return Arrays.copyOf(this.f2952a, this.f2953b);
    }

    @Override // i9.g1
    public final void b(int i10) {
        double[] dArr = this.f2952a;
        if (dArr.length < i10) {
            this.f2952a = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i10, dArr.length * 2));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2953b;
    }
}
