package i9;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f2883a;

    /* renamed from: b, reason: collision with root package name */
    public int f2884b;

    @Override // i9.g1
    public final Object a() {
        return Arrays.copyOf(this.f2883a, this.f2884b);
    }

    @Override // i9.g1
    public final void b(int i10) {
        boolean[] zArr = this.f2883a;
        if (zArr.length < i10) {
            this.f2883a = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i10, zArr.length * 2));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2884b;
    }
}
