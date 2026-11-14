package com.google.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {
    public static final g d = new g(b0.f1536b);
    public static final e e;

    /* renamed from: b, reason: collision with root package name */
    public int f1565b = 0;
    public final byte[] c;

    static {
        e eVar;
        if (c.a()) {
            eVar = new e(1);
        } else {
            eVar = new e(0);
        }
        e = eVar;
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    public static int d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(ai.onnxruntime.a.g(i10, "Beginning index larger than ending index: ", ", ", i11));
                }
                throw new IndexOutOfBoundsException(ai.onnxruntime.a.g(i11, "End index: ", " >= ", i12));
            }
            throw new IndexOutOfBoundsException(ai.onnxruntime.a.f(i10, "Beginning index: ", " < 0"));
        }
        return i13;
    }

    public static g e(byte[] bArr, int i10, int i11) {
        byte[] copyOfRange;
        d(i10, i10 + i11, bArr.length);
        switch (e.f1554a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                copyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, copyOfRange, 0, i11);
                break;
        }
        return new g(copyOfRange);
    }

    public byte a(int i10) {
        return this.c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof g) && size() == ((g) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof g) {
                        g gVar = (g) obj;
                        int i10 = this.f1565b;
                        int i11 = gVar.f1565b;
                        if (i10 == 0 || i11 == 0 || i10 == i11) {
                            int size = size();
                            if (size <= gVar.size()) {
                                if (size <= gVar.size()) {
                                    byte[] bArr = gVar.c;
                                    int f8 = f() + size;
                                    int f10 = f();
                                    int f11 = gVar.f();
                                    while (f10 < f8) {
                                        if (this.c[f10] != bArr[f11]) {
                                            return false;
                                        }
                                        f10++;
                                        f11++;
                                    }
                                    return true;
                                }
                                StringBuilder q8 = ai.onnxruntime.a.q(size, "Ran off end of other: 0, ", ", ");
                                q8.append(gVar.size());
                                throw new IllegalArgumentException(q8.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i10) {
        return this.c[i10];
    }

    public final int hashCode() {
        int i10 = this.f1565b;
        if (i10 == 0) {
            int size = size();
            int f8 = f();
            int i11 = size;
            for (int i12 = f8; i12 < f8 + size; i12++) {
                i11 = (i11 * 31) + this.c[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f1565b = i11;
            return i11;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.c.length;
    }

    public final String toString() {
        g fVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = t1.c(this);
        } else {
            int d10 = d(0, 47, size());
            if (d10 == 0) {
                fVar = d;
            } else {
                fVar = new f(this.c, f(), d10);
            }
            concat = t1.c(fVar).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return ai.onnxruntime.a.p(sb, concat, "\">");
    }
}
