package o7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t2 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f4717a;
    public p7.u c;

    /* renamed from: g, reason: collision with root package name */
    public final c5.e f4720g;

    /* renamed from: h, reason: collision with root package name */
    public final t4 f4721h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4722i;

    /* renamed from: j, reason: collision with root package name */
    public int f4723j;

    /* renamed from: l, reason: collision with root package name */
    public long f4725l;

    /* renamed from: b, reason: collision with root package name */
    public int f4718b = -1;
    public n7.h d = n7.h.c;
    public final s2 e = new s2(this);

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f4719f = ByteBuffer.allocate(5);

    /* renamed from: k, reason: collision with root package name */
    public int f4724k = -1;

    public t2(b bVar, c5.e eVar, t4 t4Var) {
        this.f4717a = bVar;
        this.f4720g = eVar;
        this.f4721h = t4Var;
    }

    public static int g(t7.a aVar, OutputStream outputStream) {
        y5.g gVar = aVar.f5827b;
        if (gVar != null) {
            int a10 = gVar.a(null);
            y5.g gVar2 = aVar.f5827b;
            gVar2.getClass();
            int a11 = gVar2.a(null);
            Logger logger = com.google.protobuf.n.f1596b;
            if (a11 > 4096) {
                a11 = 4096;
            }
            com.google.protobuf.m mVar = new com.google.protobuf.m(outputStream, a11);
            gVar2.c(mVar);
            if (mVar.f1591f > 0) {
                mVar.G();
            }
            aVar.f5827b = null;
            return a10;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.d;
        if (byteArrayInputStream == null) {
            return 0;
        }
        com.google.protobuf.p pVar = t7.c.f5830a;
        o4.b.i(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i10 = (int) j10;
                aVar.d = null;
                return i10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    @Override // o7.v0
    public final v0 a(n7.h hVar) {
        this.d = hVar;
        return this;
    }

    @Override // o7.v0
    public final void b(t7.a aVar) {
        int h2;
        if (!this.f4722i) {
            boolean z9 = true;
            this.f4723j++;
            int i10 = this.f4724k + 1;
            this.f4724k = i10;
            this.f4725l = 0L;
            t4 t4Var = this.f4721h;
            n7.e[] eVarArr = t4Var.f4728a;
            n7.e[] eVarArr2 = t4Var.f4728a;
            int i11 = 0;
            for (n7.e eVar : eVarArr) {
                eVar.t(i10);
            }
            if (this.d == n7.h.c) {
                z9 = false;
            }
            try {
                int available = aVar.available();
                if (available != 0 && z9) {
                    h2 = e(aVar);
                } else {
                    h2 = h(aVar, available);
                }
                if (available != -1 && h2 != available) {
                    throw n7.f1.f4200l.h(ai.onnxruntime.a.g(h2, "Message length inaccurate ", " != ", available)).a();
                }
                long j10 = h2;
                for (n7.e eVar2 : eVarArr2) {
                    eVar2.v(j10);
                }
                long j11 = this.f4725l;
                for (n7.e eVar3 : eVarArr2) {
                    eVar3.w(j11);
                }
                int i12 = this.f4724k;
                long j12 = this.f4725l;
                n7.e[] eVarArr3 = t4Var.f4728a;
                int length = eVarArr3.length;
                while (i11 < length) {
                    long j13 = j10;
                    eVarArr3[i11].u(i12, j12, j13);
                    i11++;
                    j10 = j13;
                }
                return;
            } catch (IOException e) {
                throw n7.f1.f4200l.h("Failed to frame message").g(e).a();
            } catch (n7.h1 e6) {
                throw e6;
            } catch (RuntimeException e10) {
                throw n7.f1.f4200l.h("Failed to frame message").g(e10).a();
            }
        }
        j1.i.l("Framer already closed");
    }

    @Override // o7.v0
    public final void c(int i10) {
        boolean z9;
        if (this.f4718b == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "max size already set");
        this.f4718b = i10;
    }

    @Override // o7.v0
    public final void close() {
        if (!this.f4722i) {
            this.f4722i = true;
            p7.u uVar = this.c;
            if (uVar != null && uVar.c == 0) {
                this.c = null;
            }
            p7.u uVar2 = this.c;
            this.c = null;
            this.f4717a.b(uVar2, true, true, this.f4723j);
            this.f4723j = 0;
        }
    }

    public final void d(r2 r2Var, boolean z9) {
        ArrayList arrayList = r2Var.f4689b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            i10 += ((p7.u) obj).c;
        }
        int i12 = this.f4718b;
        if (i12 >= 0 && i10 > i12) {
            n7.f1 f1Var = n7.f1.f4198j;
            Locale locale = Locale.US;
            throw f1Var.h("message too large " + i10 + " > " + i12).a();
        }
        ByteBuffer byteBuffer = this.f4719f;
        byteBuffer.clear();
        byteBuffer.put(z9 ? (byte) 1 : (byte) 0).putInt(i10);
        this.f4720g.getClass();
        p7.u o5 = c5.e.o(5);
        o5.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i10 == 0) {
            this.c = o5;
            return;
        }
        int i13 = this.f4723j - 1;
        b bVar = this.f4717a;
        bVar.b(o5, false, false, i13);
        this.f4723j = 1;
        for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
            bVar.b((p7.u) arrayList.get(i14), false, false, 0);
        }
        this.c = (p7.u) arrayList.get(arrayList.size() - 1);
        this.f4725l = i10;
    }

    public final int e(t7.a aVar) {
        OutputStream outputStream;
        r2 r2Var = new r2(this);
        switch (this.d.f4209b) {
            case 0:
                outputStream = r2Var;
                break;
            default:
                outputStream = new GZIPOutputStream(r2Var);
                break;
        }
        try {
            int g10 = g(aVar, outputStream);
            outputStream.close();
            int i10 = this.f4718b;
            if (i10 >= 0 && g10 > i10) {
                n7.f1 f1Var = n7.f1.f4198j;
                Locale locale = Locale.US;
                throw f1Var.h("message too large " + g10 + " > " + i10).a();
            }
            d(r2Var, true);
            return g10;
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    public final void f(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            p7.u uVar = this.c;
            if (uVar != null && uVar.f5108b == 0) {
                this.c = null;
                this.f4717a.b(uVar, false, false, this.f4723j);
                this.f4723j = 0;
            }
            if (this.c == null) {
                this.f4720g.getClass();
                this.c = c5.e.o(i11);
            }
            int min = Math.min(i11, this.c.f5108b);
            this.c.a(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    @Override // o7.v0
    public final void flush() {
        p7.u uVar = this.c;
        if (uVar != null && uVar.c > 0) {
            this.c = null;
            this.f4717a.b(uVar, false, true, this.f4723j);
            this.f4723j = 0;
        }
    }

    public final int h(t7.a aVar, int i10) {
        if (i10 != -1) {
            this.f4725l = i10;
            int i11 = this.f4718b;
            if (i11 >= 0 && i10 > i11) {
                n7.f1 f1Var = n7.f1.f4198j;
                Locale locale = Locale.US;
                throw f1Var.h("message too large " + i10 + " > " + i11).a();
            }
            ByteBuffer byteBuffer = this.f4719f;
            byteBuffer.clear();
            byteBuffer.put((byte) 0).putInt(i10);
            if (this.c == null) {
                int position = byteBuffer.position() + i10;
                this.f4720g.getClass();
                this.c = c5.e.o(position);
            }
            f(byteBuffer.array(), 0, byteBuffer.position());
            return g(aVar, this.e);
        }
        r2 r2Var = new r2(this);
        int g10 = g(aVar, r2Var);
        d(r2Var, false);
        return g10;
    }

    @Override // o7.v0
    public final boolean isClosed() {
        return this.f4722i;
    }
}
