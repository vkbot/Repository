package l;

import c0.l;
import c0.p;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l f3488a = new l(1000);

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f3489b = d0.g.a(10, new z3.f(13));

    public final String a(h.e eVar) {
        String str;
        synchronized (this.f3488a) {
            str = (String) this.f3488a.a(eVar);
        }
        if (str == null) {
            i iVar = (i) this.f3489b.acquire();
            try {
                eVar.b(iVar.f3487b);
                byte[] digest = iVar.f3487b.digest();
                char[] cArr = p.f447b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b10 = digest[i10];
                        int i11 = b10 & UByte.MAX_VALUE;
                        int i12 = i10 * 2;
                        char[] cArr2 = p.f446a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[b10 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.f3489b.release(iVar);
            }
        }
        synchronized (this.f3488a) {
            this.f3488a.d(eVar, str);
        }
        return str;
    }
}
