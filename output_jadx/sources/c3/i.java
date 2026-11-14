package c3;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.protobuf.a2;
import com.google.protobuf.b0;
import com.google.protobuf.b1;
import com.google.protobuf.d0;
import com.google.protobuf.g0;
import com.google.protobuf.p;
import com.google.protobuf.y;
import com.google.protobuf.y0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f522a;

    /* renamed from: b, reason: collision with root package name */
    public int f523b;
    public int c = 0;
    public Object d;

    public i(com.google.protobuf.j jVar) {
        Charset charset = b0.f1535a;
        this.d = jVar;
        jVar.c = this;
    }

    public boolean A() {
        int i10;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        if (!jVar.c() && (i10 = this.f522a) != this.f523b) {
            return jVar.y(i10);
        }
        return false;
    }

    public void a(z7.a aVar) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f522a;
        int hashCode = aVar.hashCode() * (-1640531527);
        int i11 = (hashCode ^ (hashCode >>> 16)) & i10;
        Object obj3 = objArr[i11];
        if (obj3 != null) {
            if (obj3.equals(aVar)) {
                return;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj2 = objArr[i11];
                if (obj2 == null) {
                }
            } while (!obj2.equals(aVar));
            return;
        }
        objArr[i11] = aVar;
        int i12 = this.f523b + 1;
        this.f523b = i12;
        if (i12 >= this.c) {
            Object[] objArr2 = (Object[]) this.d;
            int length = objArr2.length;
            int i13 = length << 1;
            int i14 = i13 - 1;
            Object[] objArr3 = new Object[i13];
            while (true) {
                int i15 = i12 - 1;
                if (i12 == 0) {
                    this.f522a = i14;
                    this.c = (int) (i13 * 0.75f);
                    this.d = objArr3;
                    return;
                }
                do {
                    length--;
                    obj = objArr2[length];
                } while (obj == null);
                int hashCode2 = obj.hashCode() * (-1640531527);
                int i16 = (hashCode2 ^ (hashCode2 >>> 16)) & i14;
                if (objArr3[i16] == null) {
                    objArr3[i16] = objArr2[length];
                    i12 = i15;
                }
                do {
                    i16 = (i16 + 1) & i14;
                } while (objArr3[i16] != null);
                objArr3[i16] = objArr2[length];
                i12 = i15;
            }
        }
    }

    public void b() {
        View view = (View) this.d;
        ViewCompat.offsetTopAndBottom(view, this.c - (view.getTop() - this.f522a));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.f523b));
    }

    public int c() {
        int i10 = this.c;
        if (i10 != 0) {
            this.f522a = i10;
            this.c = 0;
        } else {
            this.f522a = ((com.google.protobuf.j) this.d).v();
        }
        int i11 = this.f522a;
        if (i11 != 0 && i11 != this.f523b) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public void d(Object obj, b1 b1Var, p pVar) {
        int i10 = this.f523b;
        this.f523b = ((this.f522a >>> 3) << 3) | 4;
        try {
            b1Var.h(obj, this, pVar);
            if (this.f522a == this.f523b) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f523b = i10;
        }
    }

    public void e(Object obj, b1 b1Var, p pVar) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int w = jVar.w();
        if (jVar.f1579a < jVar.f1580b) {
            int f8 = jVar.f(w);
            jVar.f1579a++;
            b1Var.h(obj, this, pVar);
            jVar.a(0);
            jVar.f1579a--;
            jVar.e(f8);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void f(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Boolean.valueOf(jVar.g()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Boolean.valueOf(jVar.g()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public com.google.protobuf.g g() {
        z(2);
        return ((com.google.protobuf.j) this.d).h();
    }

    public void h(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        if ((this.f522a & 7) != 2) {
            throw d0.b();
        }
        do {
            list.add(g());
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void i(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int w = jVar.w();
                if ((w & 7) == 0) {
                    int b10 = jVar.b() + w;
                    do {
                        list.add(Double.valueOf(jVar.i()));
                    } while (jVar.b() < b10);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw d0.b();
        }
        do {
            list.add(Double.valueOf(jVar.i()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void j(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.j()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.j()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public Object k(a2 a2Var, Class cls, p pVar) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        switch (a2Var.ordinal()) {
            case 0:
                z(1);
                return Double.valueOf(jVar.i());
            case 1:
                z(5);
                return Float.valueOf(jVar.m());
            case 2:
                z(0);
                return Long.valueOf(jVar.o());
            case 3:
                z(0);
                return Long.valueOf(jVar.x());
            case 4:
                z(0);
                return Integer.valueOf(jVar.n());
            case 5:
                z(1);
                return Long.valueOf(jVar.l());
            case 6:
                z(5);
                return Integer.valueOf(jVar.k());
            case 7:
                z(0);
                return Boolean.valueOf(jVar.g());
            case 8:
                z(2);
                return jVar.u();
            case 9:
            default:
                j1.i.k("unsupported field type.");
                return null;
            case 10:
                z(2);
                b1 a10 = y0.c.a(cls);
                y i10 = a10.i();
                e(i10, a10, pVar);
                a10.c(i10);
                return i10;
            case 11:
                return g();
            case 12:
                z(0);
                return Integer.valueOf(jVar.w());
            case 13:
                z(0);
                return Integer.valueOf(jVar.j());
            case 14:
                z(5);
                return Integer.valueOf(jVar.p());
            case 15:
                z(1);
                return Long.valueOf(jVar.q());
            case 16:
                z(0);
                return Integer.valueOf(jVar.r());
            case 17:
                z(0);
                return Long.valueOf(jVar.s());
        }
    }

    public void l(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw d0.b();
            }
            do {
                list.add(Integer.valueOf(jVar.k()));
                if (!jVar.c()) {
                    v9 = jVar.v();
                } else {
                    return;
                }
            } while (v9 == this.f522a);
            this.c = v9;
            return;
        }
        int w = jVar.w();
        if ((w & 3) == 0) {
            int b10 = jVar.b() + w;
            do {
                list.add(Integer.valueOf(jVar.k()));
            } while (jVar.b() < b10);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void m(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int w = jVar.w();
                if ((w & 7) == 0) {
                    int b10 = jVar.b() + w;
                    do {
                        list.add(Long.valueOf(jVar.l()));
                    } while (jVar.b() < b10);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw d0.b();
        }
        do {
            list.add(Long.valueOf(jVar.l()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void n(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw d0.b();
            }
            do {
                list.add(Float.valueOf(jVar.m()));
                if (!jVar.c()) {
                    v9 = jVar.v();
                } else {
                    return;
                }
            } while (v9 == this.f522a);
            this.c = v9;
            return;
        }
        int w = jVar.w();
        if ((w & 3) == 0) {
            int b10 = jVar.b() + w;
            do {
                list.add(Float.valueOf(jVar.m()));
            } while (jVar.b() < b10);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void o(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.n()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.n()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void p(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.o()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Long.valueOf(jVar.o()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void q(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw d0.b();
            }
            do {
                list.add(Integer.valueOf(jVar.p()));
                if (!jVar.c()) {
                    v9 = jVar.v();
                } else {
                    return;
                }
            } while (v9 == this.f522a);
            this.c = v9;
            return;
        }
        int w = jVar.w();
        if ((w & 3) == 0) {
            int b10 = jVar.b() + w;
            do {
                list.add(Integer.valueOf(jVar.p()));
            } while (jVar.b() < b10);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void r(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int w = jVar.w();
                if ((w & 7) == 0) {
                    int b10 = jVar.b() + w;
                    do {
                        list.add(Long.valueOf(jVar.q()));
                    } while (jVar.b() < b10);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw d0.b();
        }
        do {
            list.add(Long.valueOf(jVar.q()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void s(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.r()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.r()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void t(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.s()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Long.valueOf(jVar.s()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void u(List list, boolean z9) {
        String t;
        int v9;
        int v10;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        if ((this.f522a & 7) == 2) {
            if ((list instanceof g0) && !z9) {
                g0 g0Var = (g0) list;
                do {
                    g0Var.b(g());
                    if (!jVar.c()) {
                        v10 = jVar.v();
                    } else {
                        return;
                    }
                } while (v10 == this.f522a);
                this.c = v10;
                return;
            }
            do {
                if (z9) {
                    z(2);
                    t = jVar.u();
                } else {
                    z(2);
                    t = jVar.t();
                }
                list.add(t);
                if (jVar.c()) {
                    return;
                } else {
                    v9 = jVar.v();
                }
            } while (v9 == this.f522a);
            this.c = v9;
            return;
        }
        throw d0.b();
    }

    public void v(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.w()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.w()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void w(List list) {
        int v9;
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.d;
        int i10 = this.f522a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b10 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.x()));
                } while (jVar.b() < b10);
                y(b10);
                return;
            }
            throw d0.b();
        }
        do {
            list.add(Long.valueOf(jVar.x()));
            if (jVar.c()) {
                return;
            } else {
                v9 = jVar.v();
            }
        } while (v9 == this.f522a);
        this.c = v9;
    }

    public void x(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f523b--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i14 = (hashCode ^ (hashCode >>> 16)) & i11;
                if (i10 <= i12) {
                    if (i10 < i14 && i14 <= i12) {
                        i13 = i12 + 1;
                    }
                } else {
                    if (i10 >= i14 && i14 > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public void y(int i10) {
        if (((com.google.protobuf.j) this.d).b() == i10) {
        } else {
            throw d0.e();
        }
    }

    public void z(int i10) {
        if ((this.f522a & 7) == i10) {
        } else {
            throw d0.b();
        }
    }
}
