package n7;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v0 {
    public static final Logger c = Logger.getLogger(v0.class.getName());
    public static final h d = new h(8);
    public static final k4.c e;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4248a;

    /* renamed from: b, reason: collision with root package name */
    public int f4249b;

    static {
        k4.c cVar = k4.e.d;
        if (cVar.f3424b != null) {
            cVar = new k4.c(cVar.f3423a, (Character) null);
        }
        e = cVar;
    }

    public final void a(s0 s0Var) {
        if (this.f4249b == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f4249b;
            if (i10 < i12) {
                int i13 = i10 * 2;
                if (!Arrays.equals(s0Var.f4242b, (byte[]) this.f4248a[i13])) {
                    Object[] objArr = this.f4248a;
                    int i14 = i11 * 2;
                    objArr[i14] = (byte[]) objArr[i13];
                    Object obj = objArr[i13 + 1];
                    if (objArr instanceof byte[][]) {
                        b(objArr.length);
                    }
                    this.f4248a[i14 + 1] = obj;
                    i11++;
                }
                i10++;
            } else {
                Arrays.fill(this.f4248a, i11 * 2, i12 * 2, (Object) null);
                this.f4249b = i11;
                return;
            }
        }
    }

    public final void b(int i10) {
        Object[] objArr = new Object[i10];
        int i11 = this.f4249b;
        if (i11 != 0) {
            System.arraycopy(this.f4248a, 0, objArr, 0, i11 * 2);
        }
        this.f4248a = objArr;
    }

    public final Object c(s0 s0Var) {
        for (int i10 = this.f4249b - 1; i10 >= 0; i10--) {
            int i11 = i10 * 2;
            if (Arrays.equals(s0Var.f4242b, (byte[]) this.f4248a[i11])) {
                Object obj = this.f4248a[i11 + 1];
                if (obj instanceof byte[]) {
                    return s0Var.a((byte[]) obj);
                }
                obj.getClass();
                n0.b.a();
                return null;
            }
        }
        return null;
    }

    public final void d(v0 v0Var) {
        int i10;
        int i11 = v0Var.f4249b;
        if (i11 == 0) {
            return;
        }
        Object[] objArr = this.f4248a;
        if (objArr != null) {
            i10 = objArr.length;
        } else {
            i10 = 0;
        }
        int i12 = this.f4249b;
        int i13 = i10 - (i12 * 2);
        if (i12 == 0 || i13 < i11 * 2) {
            b((i11 * 2) + (i12 * 2));
        }
        System.arraycopy(v0Var.f4248a, 0, this.f4248a, this.f4249b * 2, v0Var.f4249b * 2);
        this.f4249b += v0Var.f4249b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 == r2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(n7.s0 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            o4.b.i(r5, r0)
            java.lang.String r0 = "value"
            o4.b.i(r6, r0)
            int r0 = r4.f4249b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f4248a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.f4249b
            byte[] r1 = r5.f4242b
            java.lang.Object[] r2 = r4.f4248a
            int r3 = r0 * 2
            r2[r3] = r1
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f4248a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f4249b
            int r5 = r5 + 1
            r4.f4249b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.v0.e(n7.s0, java.lang.Object):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f4249b; i10++) {
            if (i10 != 0) {
                sb.append(',');
            }
            int i11 = i10 * 2;
            byte[] bArr = (byte[]) this.f4248a[i11];
            Charset charset = i4.b.f2770a;
            String str = new String(bArr, charset);
            sb.append(str);
            sb.append('=');
            boolean endsWith = str.endsWith("-bin");
            Object[] objArr = this.f4248a;
            if (endsWith) {
                Object obj = objArr[i11 + 1];
                if (obj instanceof byte[]) {
                    sb.append(e.c((byte[]) obj));
                } else {
                    com.google.protobuf.q.q(obj);
                    throw null;
                }
            } else {
                Object obj2 = objArr[i11 + 1];
                if (obj2 instanceof byte[]) {
                    sb.append(new String((byte[]) obj2, charset));
                } else {
                    com.google.protobuf.q.q(obj2);
                    throw null;
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
