package com.google.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: f, reason: collision with root package name */
    public static final j1 f1583f = new j1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1584a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1585b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public j1(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f1584a = i10;
        this.f1585b = iArr;
        this.c = objArr;
        this.e = z9;
    }

    public final void a(int i10) {
        int[] iArr = this.f1585b;
        if (i10 > iArr.length) {
            int i11 = this.f1584a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f1585b = Arrays.copyOf(iArr, i10);
            this.c = Arrays.copyOf(this.c, i10);
        }
    }

    public final int b() {
        int c;
        int e;
        int c10;
        int i10 = this.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1584a; i12++) {
            int i13 = this.f1585b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.c[i12]).getClass();
                                c10 = n.c(i14) + 4;
                            } else {
                                throw new IllegalStateException(d0.b());
                            }
                        } else {
                            c = n.c(i14) * 2;
                            e = ((j1) this.c[i12]).b();
                        }
                    } else {
                        g gVar = (g) this.c[i12];
                        int c11 = n.c(i14);
                        int size = gVar.size();
                        i11 = q.a(size, size, c11, i11);
                    }
                } else {
                    ((Long) this.c[i12]).getClass();
                    c10 = n.c(i14) + 8;
                }
                i11 = c10 + i11;
            } else {
                long longValue = ((Long) this.c[i12]).longValue();
                c = n.c(i14);
                e = n.e(longValue);
            }
            i11 = e + c + i11;
        }
        this.d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (this.e) {
            a(this.f1584a + 1);
            int[] iArr = this.f1585b;
            int i11 = this.f1584a;
            iArr[i11] = i10;
            this.c[i11] = obj;
            this.f1584a = i11 + 1;
            return;
        }
        androidx.navigation.b.a();
    }

    public final void d(l0 l0Var) {
        if (this.f1584a != 0) {
            l0Var.getClass();
            n nVar = (n) l0Var.f1589a;
            for (int i10 = 0; i10 < this.f1584a; i10++) {
                int i11 = this.f1585b[i10];
                Object obj = this.c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    nVar.l(i12, ((Integer) obj).intValue());
                                } else {
                                    n0.b.w(d0.b());
                                    return;
                                }
                            } else {
                                nVar.w(i12, 3);
                                ((j1) obj).d(l0Var);
                                nVar.w(i12, 4);
                            }
                        } else {
                            nVar.j(i12, (g) obj);
                        }
                    } else {
                        nVar.n(i12, ((Long) obj).longValue());
                    }
                } else {
                    nVar.z(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i10 = this.f1584a;
        if (i10 == j1Var.f1584a) {
            int[] iArr = this.f1585b;
            int[] iArr2 = j1Var.f1585b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = j1Var.c;
                    int i12 = this.f1584a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f1584a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f1585b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.c;
        int i16 = this.f1584a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
