package d2;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a2.a f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1751b;

    public l(a2.a aVar, byte[] bArr) {
        if (aVar != null) {
            if (bArr != null) {
                this.f1750a = aVar;
                this.f1751b = bArr;
                return;
            } else {
                n0.b.n("bytes is null");
                throw null;
            }
        }
        n0.b.n("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f1750a.equals(lVar.f1750a)) {
            return false;
        }
        return Arrays.equals(this.f1751b, lVar.f1751b);
    }

    public final int hashCode() {
        return ((this.f1750a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1751b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1750a + ", bytes=[...]}";
    }
}
