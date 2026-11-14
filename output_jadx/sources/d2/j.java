package d2;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final String f1745a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1746b;
    public final a2.b c;

    public j(String str, byte[] bArr, a2.b bVar) {
        this.f1745a = str;
        this.f1746b = bArr;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            j jVar = (j) qVar;
            if (this.f1745a.equals(jVar.f1745a)) {
                if (qVar instanceof j) {
                    bArr = ((j) qVar).f1746b;
                } else {
                    bArr = jVar.f1746b;
                }
                if (Arrays.equals(this.f1746b, bArr) && this.c.equals(jVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1745a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1746b)) * 1000003) ^ this.c.hashCode();
    }
}
