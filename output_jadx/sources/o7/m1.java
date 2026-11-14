package o7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4615a = Logger.getLogger(m1.class.getName());

    public static Object a(w5.a aVar) {
        char c;
        double parseDouble;
        o4.b.m(aVar.f0(), "unexpected end of JSON");
        int c10 = com.bumptech.glide.g.c(aVar.p0());
        boolean z9 = true;
        if (c10 != 0) {
            if (c10 != 2) {
                if (c10 != 5) {
                    if (c10 != 6) {
                        if (c10 != 7) {
                            if (c10 == 8) {
                                aVar.l0();
                                return null;
                            }
                            j1.i.l("Bad token: ".concat(aVar.e0(false)));
                            return null;
                        }
                        return Boolean.valueOf(aVar.i0());
                    }
                    int i10 = aVar.f6380i;
                    if (i10 == 0) {
                        i10 = aVar.S();
                    }
                    if (i10 == 15) {
                        aVar.f6380i = 0;
                        int[] iArr = aVar.f6387p;
                        int i11 = aVar.f6385n - 1;
                        iArr[i11] = iArr[i11] + 1;
                        parseDouble = aVar.f6381j;
                    } else {
                        if (i10 == 16) {
                            aVar.f6383l = new String(aVar.d, aVar.e, aVar.f6382k);
                            aVar.e += aVar.f6382k;
                        } else if (i10 != 8 && i10 != 9) {
                            if (i10 == 10) {
                                aVar.f6383l = aVar.o0();
                            } else if (i10 != 11) {
                                n0.b.j(kotlin.collections.unsigned.a.j(aVar.p0()), "Expected a double but was ", aVar.h0());
                                return null;
                            }
                        } else {
                            if (i10 == 8) {
                                c = '\'';
                            } else {
                                c = Typography.quote;
                            }
                            aVar.f6383l = aVar.m0(c);
                        }
                        aVar.f6380i = 11;
                        parseDouble = Double.parseDouble(aVar.f6383l);
                        if (!aVar.c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + aVar.h0());
                        }
                        aVar.f6383l = null;
                        aVar.f6380i = 0;
                        int[] iArr2 = aVar.f6387p;
                        int i12 = aVar.f6385n - 1;
                        iArr2[i12] = iArr2[i12] + 1;
                    }
                    return Double.valueOf(parseDouble);
                }
                return aVar.n0();
            }
            aVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.f0()) {
                linkedHashMap.put(aVar.j0(), a(aVar));
            }
            if (aVar.p0() != 4) {
                z9 = false;
            }
            o4.b.m(z9, "Bad token: ".concat(aVar.e0(false)));
            aVar.c0();
            return Collections.unmodifiableMap(linkedHashMap);
        }
        aVar.b();
        ArrayList arrayList = new ArrayList();
        while (aVar.f0()) {
            arrayList.add(a(aVar));
        }
        if (aVar.p0() != 2) {
            z9 = false;
        }
        o4.b.m(z9, "Bad token: ".concat(aVar.e0(false)));
        aVar.V();
        return Collections.unmodifiableList(arrayList);
    }
}
