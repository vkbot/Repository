package p7;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m0.r0;
import n7.b0;
import n7.c0;
import n7.f1;
import n7.q0;
import n7.t0;
import n7.v0;
import o7.b1;
import o7.j3;
import o7.k3;
import o7.p1;
import o7.q2;
import o7.t4;
import o7.v4;
import o7.y0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends b1 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final d E;
    public final b7.p F;
    public final n G;
    public boolean H;
    public final w7.c I;
    public v J;
    public int K;
    public final /* synthetic */ k L;

    /* renamed from: v, reason: collision with root package name */
    public final int f5057v;
    public final Object w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f5058x;

    /* renamed from: y, reason: collision with root package name */
    public final l9.l f5059y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5060z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l9.l] */
    public j(k kVar, int i10, t4 t4Var, Object obj, d dVar, b7.p pVar, n nVar, int i11) {
        super(i10, t4Var, kVar.f4404b);
        this.L = kVar;
        this.f4428s = i4.b.f2771b;
        this.f5059y = new Object();
        this.f5060z = false;
        this.A = false;
        this.B = false;
        this.H = true;
        this.K = -1;
        o4.b.i(obj, "lock");
        this.w = obj;
        this.E = dVar;
        this.F = pVar;
        this.G = nVar;
        this.C = i11;
        this.D = i11;
        this.f5057v = i11;
        w7.b.f6413a.getClass();
        this.I = w7.a.f6411a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [n7.v0, java.lang.Object] */
    public static void j(j jVar, v0 v0Var, String str) {
        boolean z9;
        k kVar = jVar.L;
        String str2 = kVar.f5065l;
        String str3 = kVar.f5063j;
        boolean z10 = kVar.f5069p;
        n nVar = jVar.G;
        if (nVar.B == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r7.b bVar = e.f5031a;
        o4.b.i(v0Var, "headers");
        o4.b.i(str2, "authority");
        v0Var.a(y0.f4781i);
        v0Var.a(y0.f4782j);
        q0 q0Var = y0.f4783k;
        v0Var.a(q0Var);
        ArrayList arrayList = new ArrayList(v0Var.f4249b + 7);
        if (z9) {
            arrayList.add(e.f5032b);
        } else {
            arrayList.add(e.f5031a);
        }
        if (z10) {
            arrayList.add(e.d);
        } else {
            arrayList.add(e.c);
        }
        arrayList.add(new r7.b(r7.b.f5417h, str2));
        arrayList.add(new r7.b(r7.b.f5415f, str));
        arrayList.add(new r7.b(q0Var.f4241a, str3));
        arrayList.add(e.e);
        arrayList.add(e.f5033f);
        Logger logger = v4.f4756a;
        Charset charset = b0.f4159a;
        int i10 = v0Var.f4249b * 2;
        byte[][] bArr = new byte[i10];
        Object[] objArr = v0Var.f4248a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i10);
        } else {
            for (int i11 = 0; i11 < v0Var.f4249b; i11++) {
                int i12 = i11 * 2;
                Object[] objArr2 = v0Var.f4248a;
                bArr[i12] = (byte[]) objArr2[i12];
                int i13 = i12 + 1;
                Object obj = objArr2[i13];
                if (obj instanceof byte[]) {
                    bArr[i13] = (byte[]) obj;
                } else {
                    com.google.protobuf.q.q(obj);
                    throw null;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15 += 2) {
            byte[] bArr2 = bArr[i15];
            byte[] bArr3 = bArr[i15 + 1];
            if (v4.a(bArr2, v4.f4757b)) {
                bArr[i14] = bArr2;
                bArr[i14 + 1] = b0.f4160b.c(bArr3).getBytes(i4.b.f2770a);
            } else {
                for (byte b10 : bArr3) {
                    if (b10 < 32 || b10 > 126) {
                        String str4 = new String(bArr2, i4.b.f2770a);
                        Logger logger2 = v4.f4756a;
                        StringBuilder x9 = ai.onnxruntime.a.x("Metadata key=", str4, ", value=");
                        x9.append(Arrays.toString(bArr3));
                        x9.append(" contains invalid ASCII characters");
                        logger2.warning(x9.toString());
                        break;
                    }
                }
                bArr[i14] = bArr2;
                bArr[i14 + 1] = bArr3;
            }
            i14 += 2;
        }
        if (i14 != i10) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i14);
        }
        for (int i16 = 0; i16 < bArr.length; i16 += 2) {
            l9.o g10 = l9.o.g(bArr[i16]);
            byte[] bArr4 = g10.f3578b;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new r7.b(g10, l9.o.g(bArr[i16 + 1])));
            }
        }
        jVar.f5058x = arrayList;
        f1 f1Var = nVar.f5087v;
        if (f1Var != null) {
            kVar.f5066m.g(f1Var, o7.v.e, true, new Object());
        } else {
            if (nVar.f5081n.size() >= nVar.C) {
                nVar.D.add(kVar);
                if (!nVar.f5090z) {
                    nVar.f5090z = true;
                    p1 p1Var = nVar.F;
                    if (p1Var != null) {
                        p1Var.b();
                    }
                }
                if (kVar.d) {
                    nVar.M.d(kVar, true);
                    return;
                }
                return;
            }
            nVar.t(kVar);
        }
    }

    public static void k(j jVar, l9.l lVar, boolean z9, boolean z10) {
        boolean z11;
        if (jVar.B) {
            return;
        }
        if (jVar.H) {
            jVar.f5059y.write(lVar, (int) lVar.c);
            jVar.f5060z |= z9;
            jVar.A |= z10;
            return;
        }
        if (jVar.K != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o4.b.m(z11, "streamId should be set");
        jVar.F.c(z9, jVar.J, lVar, z10);
    }

    @Override // o7.b1
    public final void a(int i10) {
        int i11 = this.D - i10;
        this.D = i11;
        float f8 = i11;
        int i12 = this.f5057v;
        if (f8 <= i12 * 0.5f) {
            int i13 = i12 - i11;
            this.C += i13;
            this.D = i11 + i13;
            this.E.V(this.K, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [n7.v0, java.lang.Object] */
    @Override // o7.b1
    public final void c(boolean z9) {
        o7.v vVar = o7.v.f4733b;
        boolean z10 = this.f4424n;
        n nVar = this.G;
        int i10 = this.K;
        if (!z10) {
            nVar.h(i10, null, vVar, false, r7.a.CANCEL, null);
        } else {
            nVar.h(i10, null, vVar, false, null, null);
        }
        o4.b.m(this.f4425o, "status should have been reported on deframer closed");
        this.f4422l = true;
        if (this.f4426p && z9) {
            h(f1.f4200l.h("Encountered end-of-stream mid-frame"), true, new Object());
        }
        r0 r0Var = this.f4423m;
        if (r0Var != null) {
            r0Var.run();
            this.f4423m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(f1 f1Var, boolean z9, v0 v0Var) {
        if (this.B) {
            return;
        }
        this.B = true;
        boolean z10 = this.H;
        n nVar = this.G;
        if (z10) {
            LinkedList linkedList = nVar.D;
            k kVar = this.L;
            linkedList.remove(kVar);
            nVar.m(kVar);
            this.f5058x = null;
            this.f5059y.b();
            this.H = false;
            v0 v0Var2 = v0Var;
            if (v0Var == null) {
                v0Var2 = new Object();
            }
            h(f1Var, true, v0Var2);
            return;
        }
        nVar.h(this.K, f1Var, o7.v.f4733b, z9, r7.a.CANCEL, v0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [n7.v0, java.lang.Object] */
    public final void m(Throwable th) {
        l(f1.e(th), true, new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [n7.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [n7.v0, java.lang.Object] */
    public final void n(int i10, boolean z9, l9.l lVar) {
        Throwable th;
        long j10 = lVar.c;
        int i11 = this.C - (((int) j10) + i10);
        this.C = i11;
        this.D -= i10;
        if (i11 < 0) {
            this.E.S(this.K, r7.a.FLOW_CONTROL_ERROR);
            this.G.h(this.K, f1.f4200l.h("Received data size exceeded our receiving window size"), o7.v.f4733b, false, null, null);
            return;
        }
        r rVar = new r(lVar);
        f1 f1Var = this.f4427q;
        boolean z10 = false;
        if (f1Var != null) {
            Charset charset = this.f4428s;
            j3 j3Var = k3.f4596a;
            o4.b.i(charset, "charset");
            int i12 = (int) lVar.c;
            byte[] bArr = new byte[i12];
            rVar.d0(bArr, 0, i12);
            this.f4427q = f1Var.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            rVar.close();
            if (this.f4427q.f4205b.length() > 1000 || z9) {
                l(this.f4427q, false, this.r);
                return;
            }
            return;
        }
        if (!this.t) {
            l(f1.f4200l.h("headers not received before payload"), false, new Object());
            return;
        }
        int i13 = (int) j10;
        boolean z11 = true;
        try {
            if (this.f4425o) {
                o7.b.f4403h.log(Level.INFO, "Received data on closed stream");
                rVar.close();
            } else {
                try {
                    q2 q2Var = this.f4414a;
                    q2Var.getClass();
                    try {
                        if (!q2Var.isClosed() && !q2Var.r) {
                            q2Var.f4677m.i0(rVar);
                            try {
                                q2Var.b();
                            } catch (Throwable th2) {
                                th = th2;
                                z11 = false;
                                if (z11) {
                                    rVar.close();
                                }
                                throw th;
                            }
                        }
                        rVar.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (z10) {
                            rVar.close();
                            throw th;
                        }
                        throw th;
                    }
                }
            }
            if (z9) {
                if (i13 > 0) {
                    this.f4427q = f1.f4200l.h("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f4427q = f1.f4200l.h("Received unexpected EOS on empty DATA frame from server");
                }
                ?? obj = new Object();
                this.r = obj;
                h(this.f4427q, false, obj);
            }
        } catch (Throwable th6) {
            th = th6;
            z10 = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [n7.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [n7.v0, java.lang.Object] */
    public final void o(ArrayList arrayList, boolean z9) {
        f1 h2;
        f1 b10;
        t0 t0Var = b1.f4413u;
        if (z9) {
            byte[][] a10 = w.a(arrayList);
            int length = a10.length / 2;
            ?? obj = new Object();
            obj.f4249b = length;
            obj.f4248a = a10;
            if (this.f4427q == null && !this.t) {
                f1 i10 = b1.i(obj);
                this.f4427q = i10;
                if (i10 != null) {
                    this.r = obj;
                }
            }
            f1 f1Var = this.f4427q;
            if (f1Var != null) {
                f1 b11 = f1Var.b("trailers: " + ((Object) obj));
                this.f4427q = b11;
                l(b11, false, this.r);
                return;
            }
            t0 t0Var2 = c0.f4169b;
            f1 f1Var2 = (f1) obj.c(t0Var2);
            if (f1Var2 != null) {
                b10 = f1Var2.h((String) obj.c(c0.f4168a));
            } else if (this.t) {
                b10 = f1.f4195g.h("missing GRPC status in response");
            } else {
                Integer num = (Integer) obj.c(t0Var);
                if (num != null) {
                    h2 = y0.g(num.intValue());
                } else {
                    h2 = f1.f4200l.h("missing HTTP status code");
                }
                b10 = h2.b("missing GRPC status, inferred error from HTTP status code");
            }
            obj.a(t0Var);
            obj.a(t0Var2);
            obj.a(c0.f4168a);
            if (this.f4425o) {
                o7.b.f4403h.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b10, obj});
                return;
            }
            for (h hVar : this.f4418h.f4728a) {
                hVar.j(obj);
            }
            g(b10, o7.v.f4733b, false, obj);
            return;
        }
        byte[][] a11 = w.a(arrayList);
        int length2 = a11.length / 2;
        ?? obj2 = new Object();
        obj2.f4249b = length2;
        obj2.f4248a = a11;
        f1 f1Var3 = this.f4427q;
        if (f1Var3 != null) {
            this.f4427q = f1Var3.b("headers: " + ((Object) obj2));
            return;
        }
        try {
            if (this.t) {
                f1 h10 = f1.f4200l.h("Received headers twice");
                this.f4427q = h10;
                this.f4427q = h10.b("headers: " + ((Object) obj2));
                this.r = obj2;
                this.f4428s = b1.d(obj2);
                return;
            }
            Integer num2 = (Integer) obj2.c(t0Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                f1 f1Var4 = this.f4427q;
                if (f1Var4 != null) {
                    this.f4427q = f1Var4.b("headers: " + ((Object) obj2));
                    this.r = obj2;
                    this.f4428s = b1.d(obj2);
                    return;
                }
                return;
            }
            this.t = true;
            f1 i11 = b1.i(obj2);
            this.f4427q = i11;
            if (i11 != null) {
                this.f4427q = i11.b("headers: " + ((Object) obj2));
                this.r = obj2;
                this.f4428s = b1.d(obj2);
                return;
            }
            obj2.a(t0Var);
            obj2.a(c0.f4169b);
            obj2.a(c0.f4168a);
            e(obj2);
            f1 f1Var5 = this.f4427q;
            if (f1Var5 != null) {
                this.f4427q = f1Var5.b("headers: " + ((Object) obj2));
                this.r = obj2;
                this.f4428s = b1.d(obj2);
            }
        } catch (Throwable th) {
            f1 f1Var6 = this.f4427q;
            if (f1Var6 != null) {
                this.f4427q = f1Var6.b("headers: " + ((Object) obj2));
                this.r = obj2;
                this.f4428s = b1.d(obj2);
            }
            throw th;
        }
    }
}
