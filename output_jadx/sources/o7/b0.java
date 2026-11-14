package o7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final u2 f4407f = new u2(4);

    /* renamed from: g, reason: collision with root package name */
    public static final u2 f4408g = new u2(5);

    /* renamed from: h, reason: collision with root package name */
    public static final u2 f4409h = new u2(6);

    /* renamed from: i, reason: collision with root package name */
    public static final u2 f4410i = new u2(7);

    /* renamed from: j, reason: collision with root package name */
    public static final u2 f4411j = new u2(8);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4412b;
    public ArrayDeque c;
    public int d;
    public boolean e;

    public b0() {
        new ArrayDeque(2);
        this.f4412b = new ArrayDeque();
    }

    @Override // o7.c
    public final c S(int i10) {
        c cVar;
        int i11;
        c cVar2;
        if (i10 <= 0) {
            return k3.f4596a;
        }
        b(i10);
        this.d -= i10;
        c cVar3 = null;
        b0 b0Var = null;
        while (true) {
            ArrayDeque arrayDeque = this.f4412b;
            c cVar4 = (c) arrayDeque.peek();
            int f02 = cVar4.f0();
            if (f02 > i10) {
                cVar2 = cVar4.S(i10);
                i11 = 0;
            } else {
                if (this.e) {
                    cVar = cVar4.S(f02);
                    j0();
                } else {
                    cVar = (c) arrayDeque.poll();
                }
                c cVar5 = cVar;
                i11 = i10 - f02;
                cVar2 = cVar5;
            }
            if (cVar3 == null) {
                cVar3 = cVar2;
            } else {
                if (b0Var == null) {
                    int i12 = 2;
                    if (i11 != 0) {
                        i12 = Math.min(arrayDeque.size() + 2, 16);
                    }
                    b0Var = new b0(i12);
                    b0Var.i0(cVar3);
                    cVar3 = b0Var;
                }
                b0Var.i0(cVar2);
            }
            if (i11 <= 0) {
                return cVar3;
            }
            i10 = i11;
        }
    }

    @Override // o7.c
    public final void V(OutputStream outputStream, int i10) {
        k0(f4411j, i10, outputStream, 0);
    }

    @Override // o7.c
    public final void c() {
        ArrayDeque arrayDeque = this.c;
        ArrayDeque arrayDeque2 = this.f4412b;
        if (arrayDeque == null) {
            this.c = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.c.isEmpty()) {
            ((c) this.c.remove()).close();
        }
        this.e = true;
        c cVar = (c) arrayDeque2.peek();
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // o7.c
    public final void c0(ByteBuffer byteBuffer) {
        l0(f4410i, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // o7.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.f4412b;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((c) arrayDeque.remove()).close();
            }
        }
        if (this.c != null) {
            while (!this.c.isEmpty()) {
                ((c) this.c.remove()).close();
            }
        }
    }

    @Override // o7.c
    public final void d0(byte[] bArr, int i10, int i11) {
        l0(f4409h, i11, bArr, i10);
    }

    @Override // o7.c
    public final int e0() {
        return l0(f4407f, 1, null, 0);
    }

    @Override // o7.c
    public final int f0() {
        return this.d;
    }

    @Override // o7.c
    public final void g0() {
        if (this.e) {
            ArrayDeque arrayDeque = this.f4412b;
            c cVar = (c) arrayDeque.peek();
            if (cVar != null) {
                int f02 = cVar.f0();
                cVar.g0();
                this.d = (cVar.f0() - f02) + this.d;
            }
            while (true) {
                c cVar2 = (c) this.c.pollLast();
                if (cVar2 != null) {
                    cVar2.g0();
                    arrayDeque.addFirst(cVar2);
                    this.d = cVar2.f0() + this.d;
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // o7.c
    public final void h0(int i10) {
        l0(f4408g, i10, null, 0);
    }

    public final void i0(c cVar) {
        boolean z9;
        boolean z10 = this.e;
        ArrayDeque arrayDeque = this.f4412b;
        if (z10 && arrayDeque.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!(cVar instanceof b0)) {
            arrayDeque.add(cVar);
            this.d = cVar.f0() + this.d;
        } else {
            b0 b0Var = (b0) cVar;
            ArrayDeque arrayDeque2 = b0Var.f4412b;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((c) arrayDeque2.remove());
            }
            this.d += b0Var.d;
            b0Var.d = 0;
            b0Var.close();
        }
        if (z9) {
            ((c) arrayDeque.peek()).c();
        }
    }

    public final void j0() {
        boolean z9 = this.e;
        ArrayDeque arrayDeque = this.f4412b;
        if (z9) {
            this.c.add((c) arrayDeque.remove());
            c cVar = (c) arrayDeque.peek();
            if (cVar != null) {
                cVar.c();
                return;
            }
            return;
        }
        ((c) arrayDeque.remove()).close();
    }

    public final int k0(a0 a0Var, int i10, Object obj, int i11) {
        b(i10);
        ArrayDeque arrayDeque = this.f4412b;
        if (!arrayDeque.isEmpty() && ((c) arrayDeque.peek()).f0() == 0) {
            j0();
        }
        while (i10 > 0 && !arrayDeque.isEmpty()) {
            c cVar = (c) arrayDeque.peek();
            int min = Math.min(i10, cVar.f0());
            i11 = a0Var.l(cVar, min, obj, i11);
            i10 -= min;
            this.d -= min;
            if (((c) arrayDeque.peek()).f0() == 0) {
                j0();
            }
        }
        if (i10 <= 0) {
            return i11;
        }
        j1.i.e("Failed executing read operation");
        return 0;
    }

    public final int l0(u2 u2Var, int i10, Object obj, int i11) {
        try {
            return k0(u2Var, i10, obj, i11);
        } catch (IOException e) {
            j1.i.e(e);
            return 0;
        }
    }

    @Override // o7.c
    public final boolean y() {
        Iterator it = this.f4412b.iterator();
        while (it.hasNext()) {
            if (!((c) it.next()).y()) {
                return false;
            }
        }
        return true;
    }

    public b0(int i10) {
        new ArrayDeque(2);
        this.f4412b = new ArrayDeque(i10);
    }
}
