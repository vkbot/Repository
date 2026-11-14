package i9;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class n extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f2923a;

    /* renamed from: b, reason: collision with root package name */
    public int f2924b;

    @Override // i9.g1
    public final Object a() {
        return Arrays.copyOf(this.f2923a, this.f2924b);
    }

    @Override // i9.g1
    public final void b(int i10) {
        char[] cArr = this.f2923a;
        if (cArr.length < i10) {
            this.f2923a = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i10, cArr.length * 2));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2924b;
    }
}
