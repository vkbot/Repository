package t5;

import j1.i;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends a.a {
    public static b C(w5.a aVar, int i10) {
        int c = com.bumptech.glide.g.c(i10);
        if (c != 5) {
            if (c != 6) {
                if (c != 7) {
                    if (c == 8) {
                        aVar.l0();
                        return d.f5822b;
                    }
                    i.l("Unexpected token: ".concat(kotlin.collections.unsigned.a.j(i10)));
                    return null;
                }
                return new f(Boolean.valueOf(aVar.i0()));
            }
            return new f(new u5.a(aVar.n0()));
        }
        return new f(aVar.n0());
    }

    public static void D(w5.b bVar, b bVar2) {
        String str;
        StringWriter stringWriter = bVar.f6390b;
        if (bVar2 != null && !(bVar2 instanceof d)) {
            boolean z9 = bVar2 instanceof f;
            if (z9) {
                if (z9) {
                    f fVar = (f) bVar2;
                    Serializable serializable = fVar.f5824b;
                    if (serializable instanceof Number) {
                        Number h2 = fVar.h();
                        bVar.c0();
                        String obj = h2.toString();
                        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                            Class<?> cls = h2.getClass();
                            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !w5.b.f6388i.matcher(obj).matches()) {
                                androidx.navigation.b.v("String created by ", cls, " is not a valid JSON number: ", obj);
                                return;
                            }
                        } else if (!bVar.f6391f) {
                            i.k("Numeric values must be finite, but was ".concat(obj));
                            return;
                        }
                        bVar.b();
                        stringWriter.append((CharSequence) obj);
                        return;
                    }
                    if (serializable instanceof Boolean) {
                        boolean booleanValue = ((Boolean) serializable).booleanValue();
                        bVar.c0();
                        bVar.b();
                        if (booleanValue) {
                            str = "true";
                        } else {
                            str = "false";
                        }
                        stringWriter.write(str);
                        return;
                    }
                    String g10 = fVar.g();
                    if (g10 == null) {
                        bVar.y();
                        return;
                    }
                    bVar.c0();
                    bVar.b();
                    bVar.V(g10);
                    return;
                }
                ai.onnxruntime.b.q(bVar2, "Not a JSON Primitive: ");
                return;
            }
            if (bVar2 instanceof a) {
                bVar.c0();
                bVar.b();
                int i10 = bVar.d;
                int[] iArr = bVar.c;
                if (i10 == iArr.length) {
                    bVar.c = Arrays.copyOf(iArr, i10 * 2);
                }
                int[] iArr2 = bVar.c;
                int i11 = bVar.d;
                bVar.d = i11 + 1;
                iArr2[i11] = 1;
                stringWriter.write(91);
                ArrayList arrayList = bVar2.e().f5821b;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    D(bVar, (b) obj2);
                }
                bVar.c(1, 2, ']');
                return;
            }
            if (bVar2 instanceof e) {
                bVar.c0();
                bVar.b();
                int i13 = bVar.d;
                int[] iArr3 = bVar.c;
                if (i13 == iArr3.length) {
                    bVar.c = Arrays.copyOf(iArr3, i13 * 2);
                }
                int[] iArr4 = bVar.c;
                int i14 = bVar.d;
                bVar.d = i14 + 1;
                iArr4[i14] = 3;
                stringWriter.write(123);
                Iterator it = ((u5.c) bVar2.f().f5823b.entrySet()).iterator();
                while (((u5.b) it).hasNext()) {
                    u5.d b10 = ((u5.b) it).b();
                    String str2 = (String) b10.getKey();
                    Objects.requireNonNull(str2, "name == null");
                    if (bVar.f6392g == null) {
                        if (bVar.d != 0) {
                            bVar.f6392g = str2;
                            D(bVar, (b) b10.getValue());
                        } else {
                            i.l("JsonWriter is closed.");
                            return;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                bVar.c(3, 5, '}');
                return;
            }
            androidx.navigation.b.o(bVar2.getClass(), "Couldn't write ");
            return;
        }
        bVar.y();
    }

    public Object B(w5.a aVar) {
        b aVar2;
        String str;
        b aVar3;
        boolean z9;
        int p02 = aVar.p0();
        int c = com.bumptech.glide.g.c(p02);
        if (c != 0) {
            if (c != 2) {
                aVar2 = null;
            } else {
                aVar.c();
                aVar2 = new e();
            }
        } else {
            aVar.b();
            aVar2 = new a();
        }
        if (aVar2 == null) {
            return C(aVar, p02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.f0()) {
                if (aVar2 instanceof e) {
                    str = aVar.j0();
                } else {
                    str = null;
                }
                int p03 = aVar.p0();
                int c10 = com.bumptech.glide.g.c(p03);
                if (c10 != 0) {
                    if (c10 != 2) {
                        aVar3 = null;
                    } else {
                        aVar.c();
                        aVar3 = new e();
                    }
                } else {
                    aVar.b();
                    aVar3 = new a();
                }
                if (aVar3 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (aVar3 == null) {
                    aVar3 = C(aVar, p03);
                }
                if (aVar2 instanceof a) {
                    ((a) aVar2).f5821b.add(aVar3);
                } else {
                    ((e) aVar2).h(str, aVar3);
                }
                if (z9) {
                    arrayDeque.addLast(aVar2);
                    aVar2 = aVar3;
                }
            } else {
                if (aVar2 instanceof a) {
                    aVar.V();
                } else {
                    aVar.c0();
                }
                if (arrayDeque.isEmpty()) {
                    return aVar2;
                }
                aVar2 = (b) arrayDeque.removeLast();
            }
        }
    }
}
