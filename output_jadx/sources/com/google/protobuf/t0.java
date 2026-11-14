package com.google.protobuf;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t0 implements b1 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1618n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1619o = s1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1621b;
    public final int c;
    public final int d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1622f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1623g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1624h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1625i;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f1626j;

    /* renamed from: k, reason: collision with root package name */
    public final j0 f1627k;

    /* renamed from: l, reason: collision with root package name */
    public final k1 f1628l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f1629m;

    public t0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, v0 v0Var, j0 j0Var, k1 k1Var, r rVar, p0 p0Var) {
        this.f1620a = iArr;
        this.f1621b = objArr;
        this.c = i10;
        this.d = i11;
        this.f1622f = aVar instanceof y;
        this.f1623g = iArr2;
        this.f1624h = i12;
        this.f1625i = i13;
        this.f1626j = v0Var;
        this.f1627k = j0Var;
        this.f1628l = k1Var;
        this.e = aVar;
        this.f1629m = p0Var;
    }

    public static long A(Object obj, long j10) {
        return ((Long) s1.c.i(obj, j10)).longValue();
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder x9 = ai.onnxruntime.a.x("Field ", str, " for ");
            x9.append(cls.getName());
            x9.append(" not found. Known fields are ");
            x9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(x9.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).i();
        }
        return true;
    }

    public static t0 w(a1 a1Var, v0 v0Var, j0 j0Var, k1 k1Var, r rVar, p0 p0Var) {
        if (a1Var instanceof a1) {
            return x(a1Var, v0Var, j0Var, k1Var, rVar, p0Var);
        }
        a1Var.getClass();
        n0.b.a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.t0 x(com.google.protobuf.a1 r34, com.google.protobuf.v0 r35, com.google.protobuf.j0 r36, com.google.protobuf.k1 r37, com.google.protobuf.r r38, com.google.protobuf.p0 r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.x(com.google.protobuf.a1, com.google.protobuf.v0, com.google.protobuf.j0, com.google.protobuf.k1, com.google.protobuf.r, com.google.protobuf.p0):com.google.protobuf.t0");
    }

    public static long y(int i10) {
        return i10 & 1048575;
    }

    public static int z(Object obj, long j10) {
        return ((Integer) s1.c.i(obj, j10)).intValue();
    }

    public final void B(Object obj, long j10, c3.i iVar, b1 b1Var, p pVar) {
        int v9;
        List c = this.f1627k.c(obj, j10);
        j jVar = (j) iVar.d;
        int i10 = iVar.f522a;
        if ((i10 & 7) != 3) {
            throw d0.b();
        }
        do {
            y i11 = b1Var.i();
            iVar.d(i11, b1Var, pVar);
            b1Var.c(i11);
            c.add(i11);
            if (!jVar.c() && iVar.c == 0) {
                v9 = jVar.v();
            } else {
                return;
            }
        } while (v9 == i10);
        iVar.c = v9;
    }

    public final void C(Object obj, int i10, c3.i iVar, b1 b1Var, p pVar) {
        int v9;
        List c = this.f1627k.c(obj, i10 & 1048575);
        j jVar = (j) iVar.d;
        int i11 = iVar.f522a;
        if ((i11 & 7) != 2) {
            throw d0.b();
        }
        do {
            y i12 = b1Var.i();
            iVar.e(i12, b1Var, pVar);
            b1Var.c(i12);
            c.add(i12);
            if (!jVar.c() && iVar.c == 0) {
                v9 = jVar.v();
            } else {
                return;
            }
        } while (v9 == i11);
        iVar.c = v9;
    }

    public final void D(Object obj, int i10, c3.i iVar) {
        if ((536870912 & i10) != 0) {
            iVar.z(2);
            s1.p(i10 & 1048575, obj, ((j) iVar.d).u());
        } else if (this.f1622f) {
            iVar.z(2);
            s1.p(i10 & 1048575, obj, ((j) iVar.d).t());
        } else {
            s1.p(i10 & 1048575, obj, iVar.g());
        }
    }

    public final void E(Object obj, int i10, c3.i iVar) {
        boolean z9;
        if ((536870912 & i10) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        j0 j0Var = this.f1627k;
        if (z9) {
            iVar.u(j0Var.c(obj, i10 & 1048575), true);
        } else {
            iVar.u(j0Var.c(obj, i10 & 1048575), false);
        }
    }

    public final void G(int i10, Object obj) {
        int i11 = this.f1620a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        s1.n((1 << (i11 >>> 20)) | s1.c.g(obj, j10), j10, obj);
    }

    public final void H(Object obj, int i10, int i11) {
        s1.n(i10, this.f1620a[i11 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i10, a aVar) {
        f1619o.putObject(obj, L(i10) & 1048575, aVar);
        G(i10, obj);
    }

    public final void J(Object obj, int i10, int i11, a aVar) {
        f1619o.putObject(obj, L(i11) & 1048575, aVar);
        H(obj, i10, i11);
    }

    public final int L(int i10) {
        return this.f1620a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0045. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x0246. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0348. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.Object r34, com.google.protobuf.l0 r35) {
        /*
            Method dump skipped, instructions count: 2502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.M(java.lang.Object, com.google.protobuf.l0):void");
    }

    @Override // com.google.protobuf.b1
    public final void a(Object obj, l0 l0Var) {
        l0Var.getClass();
        M(obj, l0Var);
    }

    @Override // com.google.protobuf.b1
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.f1620a;
                if (i10 < iArr.length) {
                    int L = L(i10);
                    long j10 = 1048575 & L;
                    int i11 = iArr[i10];
                    switch (K(L)) {
                        case 0:
                            if (n(i10, obj2)) {
                                r1 r1Var = s1.c;
                                obj3 = obj;
                                r1Var.m(obj3, j10, r1Var.e(obj2, j10));
                                G(i10, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (n(i10, obj2)) {
                                r1 r1Var2 = s1.c;
                                r1Var2.n(obj, j10, r1Var2.f(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i10, obj2)) {
                                s1.o(obj, j10, s1.c.h(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i10, obj2)) {
                                s1.o(obj, j10, s1.c.h(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i10, obj2)) {
                                s1.o(obj, j10, s1.c.h(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i10, obj2)) {
                                r1 r1Var3 = s1.c;
                                r1Var3.k(obj, j10, r1Var3.c(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i10, obj2)) {
                                s1.p(j10, obj, s1.c.i(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i10, obj, obj2);
                            break;
                        case 10:
                            if (n(i10, obj2)) {
                                s1.p(j10, obj, s1.c.i(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i10, obj2)) {
                                s1.o(obj, j10, s1.c.h(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i10, obj2)) {
                                s1.n(s1.c.g(obj2, j10), j10, obj);
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i10, obj2)) {
                                s1.o(obj, j10, s1.c.h(obj2, j10));
                                G(i10, obj);
                                break;
                            }
                            break;
                        case 17:
                            s(i10, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            this.f1627k.b(j10, obj, obj2);
                            break;
                        case 50:
                            Class cls = c1.f1546a;
                            r1 r1Var4 = s1.c;
                            Object i12 = r1Var4.i(obj, j10);
                            Object i13 = r1Var4.i(obj2, j10);
                            this.f1629m.getClass();
                            s1.p(j10, obj, p0.a(i12, i13));
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (q(obj2, i11, i10)) {
                                s1.p(j10, obj, s1.c.i(obj2, j10));
                                H(obj, i11, i10);
                                break;
                            }
                            break;
                        case 60:
                            t(i10, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (q(obj2, i11, i10)) {
                                s1.p(j10, obj, s1.c.i(obj2, j10));
                                H(obj, i11, i10);
                                break;
                            }
                            break;
                        case 68:
                            t(i10, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                } else {
                    c1.j(this.f1628l, obj, obj2);
                    return;
                }
            }
        } else {
            androidx.navigation.b.t(obj, "Mutating immutable message: ");
        }
    }

    @Override // com.google.protobuf.b1
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                yVar.m(Integer.MAX_VALUE);
                yVar.memoizedHashCode = 0;
                yVar.j();
            }
            int[] iArr = this.f1620a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int L = L(i10);
                long j10 = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.f1627k.a(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f1619o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f1629m.getClass();
                                    ((o0) object).f1602b = false;
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i10], i10)) {
                        m(i10).c(f1619o.getObject(obj, j10));
                    }
                }
                if (n(i10, obj)) {
                    m(i10).c(f1619o.getObject(obj, j10));
                }
            }
            this.f1628l.getClass();
            j1 j1Var = ((y) obj).unknownFields;
            if (j1Var.e) {
                j1Var.e = false;
            }
        }
    }

    @Override // com.google.protobuf.b1
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f1624h) {
            int i16 = this.f1623g[i15];
            int[] iArr = this.f1620a;
            int i17 = iArr[i16];
            int L = L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f1619o.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & L) == 0 || o(obj, i11, i10, i12, i20)) {
                int K = K(L);
                if (K != 9 && K != 17) {
                    if (K != 27) {
                        if (K != 60 && K != 68) {
                            if (K != 49) {
                                if (K != 50) {
                                    continue;
                                } else {
                                    Object i22 = s1.c.i(obj, L & 1048575);
                                    this.f1629m.getClass();
                                    o0 o0Var = (o0) i22;
                                    if (o0Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((n0) this.f1621b[(i11 / 3) * 2]).f1598a.f1594b.f1533b != b2.f1542j) {
                                            continue;
                                        } else {
                                            b1 b1Var = null;
                                            for (Object obj2 : o0Var.values()) {
                                                if (b1Var == null) {
                                                    b1Var = y0.c.a(obj2.getClass());
                                                }
                                                if (!b1Var.d(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i15++;
                                i13 = i10;
                                i14 = i12;
                            }
                        } else {
                            if (q(obj, i17, i11)) {
                                if (!m(i11).d(s1.c.i(obj, L & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        }
                    }
                    List list = (List) s1.c.i(obj, L & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        b1 m10 = m(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (m10.d(list.get(i23))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (o(obj, i11, i10, i12, i20)) {
                        if (!m(i11).d(s1.c.i(obj, L & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(com.google.protobuf.y r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.e(com.google.protobuf.y):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x032a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x022d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0324  */
    @Override // com.google.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(com.google.protobuf.y r31) {
        /*
            Method dump skipped, instructions count: 2804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.f(com.google.protobuf.y):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.c1.k(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.c1.k(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.c1.k(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.c1.k(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.c1.k(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // com.google.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.protobuf.y r12, com.google.protobuf.y r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.g(com.google.protobuf.y, com.google.protobuf.y):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.protobuf.b1
    public final void h(java.lang.Object r19, c3.i r20, com.google.protobuf.p r21) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.h(java.lang.Object, c3.i, com.google.protobuf.p):void");
    }

    @Override // com.google.protobuf.b1
    public final y i() {
        this.f1626j.getClass();
        return ((y) this.e).k();
    }

    public final boolean j(y yVar, y yVar2, int i10) {
        if (n(i10, yVar) == n(i10, yVar2)) {
            return true;
        }
        return false;
    }

    public final void k(int i10, Object obj, Object obj2) {
        int i11 = this.f1620a[i10];
        if (s1.c.i(obj, L(i10) & 1048575) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f1621b[((i10 / 3) * 2) + 1] == null) {
            return;
        }
        n0.b.a();
    }

    public final b1 m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f1621b;
        b1 b1Var = (b1) objArr[i11];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a10 = y0.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f1620a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int L = L(i10);
            long j11 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(s1.c.e(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(s1.c.f(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (s1.c.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s1.c.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s1.c.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s1.c.c(obj, j11);
                case 8:
                    Object i12 = s1.c.i(obj, j11);
                    if (i12 instanceof String) {
                        return !((String) i12).isEmpty();
                    }
                    if (i12 instanceof g) {
                        return !g.d.equals(i12);
                    }
                    l9.i.a();
                    return false;
                case 9:
                    if (s1.c.i(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.d.equals(s1.c.i(obj, j11));
                case 11:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s1.c.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s1.c.g(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s1.c.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s1.c.i(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    l9.i.a();
                    return false;
            }
        } else if (((1 << (i11 >>> 20)) & s1.c.g(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return n(i10, obj);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(Object obj, int i10, int i11) {
        if (s1.c.g(obj, this.f1620a[i11 + 2] & 1048575) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r9, int r10, java.lang.Object r11, com.google.protobuf.p r12, c3.i r13) {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            com.google.protobuf.r1 r10 = com.google.protobuf.s1.c
            java.lang.Object r10 = r10.i(r9, r0)
            com.google.protobuf.p0 r2 = r8.f1629m
            if (r10 != 0) goto L20
            r2.getClass()
            com.google.protobuf.o0 r10 = com.google.protobuf.o0.c
            com.google.protobuf.o0 r10 = r10.c()
            com.google.protobuf.s1.p(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            com.google.protobuf.o0 r3 = (com.google.protobuf.o0) r3
            boolean r3 = r3.f1602b
            if (r3 != 0) goto L37
            com.google.protobuf.o0 r3 = com.google.protobuf.o0.c
            com.google.protobuf.o0 r3 = r3.c()
            com.google.protobuf.p0.a(r3, r10)
            com.google.protobuf.s1.p(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            com.google.protobuf.o0 r10 = (com.google.protobuf.o0) r10
            com.google.protobuf.n0 r11 = (com.google.protobuf.n0) r11
            com.google.protobuf.m0 r9 = r11.f1598a
            r11 = 2
            r13.z(r11)
            java.lang.Object r0 = r13.d
            com.google.protobuf.j r0 = (com.google.protobuf.j) r0
            int r1 = r0.w()
            int r1 = r0.f(r1)
            java.lang.Object r2 = r9.c
            java.lang.String r3 = ""
            r4 = r2
        L55:
            int r5 = r13.c()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.A()     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            com.google.protobuf.d0 r5 = new com.google.protobuf.d0     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            com.google.protobuf.a2 r5 = r9.f1594b     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            java.lang.Object r4 = r13.k(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            goto L55
        L86:
            com.google.protobuf.a2 r5 = r9.f1593a     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            r6 = 0
            java.lang.Object r3 = r13.k(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 com.google.protobuf.c0 -> L8e
            goto L55
        L8e:
            boolean r5 = r13.A()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            com.google.protobuf.d0 r9 = new com.google.protobuf.d0     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L79
            r0.e(r1)
            return
        La2:
            r0.e(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.r(java.lang.Object, int, java.lang.Object, com.google.protobuf.p, c3.i):void");
    }

    public final void s(int i10, Object obj, Object obj2) {
        if (!n(i10, obj2)) {
            return;
        }
        long L = L(i10) & 1048575;
        Unsafe unsafe = f1619o;
        Object object = unsafe.getObject(obj2, L);
        if (object != null) {
            b1 m10 = m(i10);
            if (!n(i10, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    y i11 = m10.i();
                    m10.b(i11, object);
                    unsafe.putObject(obj, L, i11);
                }
                G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                y i12 = m10.i();
                m10.b(i12, object2);
                unsafe.putObject(obj, L, i12);
                object2 = i12;
            }
            m10.b(object2, object);
            return;
        }
        ai.onnxruntime.b.c(this.f1620a[i10], "Source subfield ", " is present but null: ", obj2);
    }

    public final void t(int i10, Object obj, Object obj2) {
        int[] iArr = this.f1620a;
        int i11 = iArr[i10];
        if (!q(obj2, i11, i10)) {
            return;
        }
        long L = L(i10) & 1048575;
        Unsafe unsafe = f1619o;
        Object object = unsafe.getObject(obj2, L);
        if (object != null) {
            b1 m10 = m(i10);
            if (!q(obj, i11, i10)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    y i12 = m10.i();
                    m10.b(i12, object);
                    unsafe.putObject(obj, L, i12);
                }
                H(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                y i13 = m10.i();
                m10.b(i13, object2);
                unsafe.putObject(obj, L, i13);
                object2 = i13;
            }
            m10.b(object2, object);
            return;
        }
        ai.onnxruntime.b.c(iArr[i10], "Source subfield ", " is present but null: ", obj2);
    }

    public final Object u(int i10, Object obj) {
        b1 m10 = m(i10);
        long L = L(i10) & 1048575;
        if (!n(i10, obj)) {
            return m10.i();
        }
        Object object = f1619o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        y i11 = m10.i();
        if (object != null) {
            m10.b(i11, object);
        }
        return i11;
    }

    public final Object v(Object obj, int i10, int i11) {
        b1 m10 = m(i11);
        if (!q(obj, i10, i11)) {
            return m10.i();
        }
        Object object = f1619o.getObject(obj, L(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        y i12 = m10.i();
        if (object != null) {
            m10.b(i12, object);
        }
        return i12;
    }
}
