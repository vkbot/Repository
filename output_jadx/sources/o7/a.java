package o7;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4387a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4388b;
    public final Object c;
    public Object d;
    public Object e;

    public a() {
        this.f4388b = new Object();
        this.c = new com.bumptech.glide.manager.t(6);
    }

    @Override // o7.v0
    public void b(t7.a aVar) {
        boolean z9;
        t4 t4Var = (t4) this.c;
        if (((byte[]) this.d) == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "writePayload should not be called multiple times");
        try {
            this.d = k4.g.b(aVar);
            n7.e[] eVarArr = t4Var.f4728a;
            n7.e[] eVarArr2 = t4Var.f4728a;
            for (n7.e eVar : eVarArr) {
                eVar.t(0);
            }
            byte[] bArr = (byte[]) this.d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (n7.e eVar2 : t4Var.f4728a) {
                eVar2.u(0, length, length2);
            }
            long length3 = ((byte[]) this.d).length;
            for (n7.e eVar3 : eVarArr2) {
                eVar3.v(length3);
            }
            long length4 = ((byte[]) this.d).length;
            for (n7.e eVar4 : eVarArr2) {
                eVar4.w(length4);
            }
        } catch (IOException e) {
            n0.b.w(e);
        }
    }

    @Override // o7.v0
    public void close() {
        boolean z9 = true;
        this.f4387a = true;
        if (((byte[]) this.d) == null) {
            z9 = false;
        }
        o4.b.m(z9, "Lack of request message. GET request is only supported for unary requests");
        ((p7.k) ((b) this.e)).f5067n.l((n7.v0) this.f4388b, (byte[]) this.d);
        this.d = null;
        this.f4388b = null;
    }

    public Object d() {
        Object obj;
        synchronized (this.f4388b) {
            try {
                if (this.f4387a) {
                    Exception exc = (Exception) this.e;
                    if (exc == null) {
                        obj = this.d;
                    } else {
                        throw new a8.a(7, exc);
                    }
                } else {
                    throw new IllegalStateException("Task is not yet complete");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean e() {
        boolean z9;
        synchronized (this.f4388b) {
            z9 = false;
            if (this.f4387a && ((Exception) this.e) == null) {
                z9 = true;
            }
        }
        return z9;
    }

    public void f(Exception exc) {
        synchronized (this.f4388b) {
            h();
            this.f4387a = true;
            this.e = exc;
        }
        ((com.bumptech.glide.manager.t) this.c).n(this);
    }

    public void g(Object obj) {
        synchronized (this.f4388b) {
            h();
            this.f4387a = true;
            this.d = obj;
        }
        ((com.bumptech.glide.manager.t) this.c).n(this);
    }

    public void h() {
        boolean z9;
        Exception exc;
        String str;
        if (this.f4387a) {
            synchronized (this.f4388b) {
                z9 = this.f4387a;
            }
            if (z9) {
                synchronized (this.f4388b) {
                    exc = (Exception) this.e;
                }
                if (exc == null) {
                    if (e()) {
                        str = "result ".concat(String.valueOf(d()));
                    } else {
                        str = "unknown issue";
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), exc);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public void i() {
        synchronized (this.f4388b) {
            try {
                if (!this.f4387a) {
                    return;
                }
                ((com.bumptech.glide.manager.t) this.c).n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.v0
    public boolean isClosed() {
        return this.f4387a;
    }

    public a(b bVar, n7.v0 v0Var, t4 t4Var) {
        this.e = bVar;
        o4.b.i(v0Var, "headers");
        this.f4388b = v0Var;
        this.c = t4Var;
    }

    @Override // o7.v0
    public void flush() {
    }

    @Override // o7.v0
    public v0 a(n7.h hVar) {
        return this;
    }

    @Override // o7.v0
    public void c(int i10) {
    }
}
