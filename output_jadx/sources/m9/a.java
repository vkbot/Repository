package m9;

import kotlin.text.Charsets;
import l9.b0;
import l9.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3996a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        f3996a = bytes;
    }

    public static final boolean a(b0 b0Var, int i10, byte[] bArr, int i11) {
        int i12 = b0Var.c;
        byte[] bArr2 = b0Var.f3560a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                b0Var = b0Var.f3562f;
                b0Var.getClass();
                bArr2 = b0Var.f3560a;
                i10 = b0Var.f3561b;
                i12 = b0Var.c;
            }
            if (bArr2[i10] != bArr[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final String b(l lVar, long j10) {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (lVar.V(j11) == 13) {
                String g02 = lVar.g0(j11, Charsets.UTF_8);
                lVar.skip(2L);
                return g02;
            }
        }
        String g03 = lVar.g0(j10, Charsets.UTF_8);
        lVar.skip(1L);
        return g03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(l9.l r16, l9.w r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.a.c(l9.l, l9.w, boolean):int");
    }
}
