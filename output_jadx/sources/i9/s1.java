package i9;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2943a;

    /* renamed from: b, reason: collision with root package name */
    public int f2944b;

    @Override // i9.g1
    public final Object a() {
        return UByteArray.m164boximpl(UByteArray.m166constructorimpl(Arrays.copyOf(this.f2943a, this.f2944b)));
    }

    @Override // i9.g1
    public final void b(int i10) {
        if (UByteArray.m172getSizeimpl(this.f2943a) < i10) {
            byte[] bArr = this.f2943a;
            this.f2943a = UByteArray.m166constructorimpl(Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i10, UByteArray.m172getSizeimpl(bArr) * 2)));
        }
    }

    @Override // i9.g1
    public final int d() {
        return this.f2944b;
    }
}
