package n6;

import java.util.ArrayList;
import java.util.EnumMap;
import z5.l;
import z5.m;
import z5.n;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {
    public static final int[] c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final Object f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4149b;

    public j(int i10) {
        switch (i10) {
            case 1:
                this.f4148a = new ArrayList();
                this.f4149b = new ArrayList();
                return;
            default:
                this.f4148a = new i(1);
                this.f4149b = new i(0);
                return;
        }
    }

    public void a(String str, int[] iArr) {
        ((ArrayList) this.f4148a).add(iArr);
        ((ArrayList) this.f4149b).add(str);
    }

    public m b(int i10, int i11, f6.a aVar) {
        EnumMap enumMap;
        int[] l10 = k.l(aVar, i11, false, c, new int[3]);
        try {
            return ((i) this.f4149b).a(i10, aVar, l10);
        } catch (l unused) {
            i iVar = (i) this.f4148a;
            StringBuilder sb = iVar.f4147b;
            sb.setLength(0);
            int[] iArr = iVar.f4146a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i12 = aVar.c;
            int i13 = l10[1];
            int i14 = 0;
            for (int i15 = 0; i15 < 2 && i13 < i12; i15++) {
                int h2 = k.h(aVar, iArr, i13, k.f4151g);
                sb.append((char) ((h2 % 10) + 48));
                for (int i16 : iArr) {
                    i13 += i16;
                }
                if (h2 >= 10) {
                    i14 |= 1 << (1 - i15);
                }
                if (i15 != 1) {
                    i13 = aVar.f(aVar.e(i13));
                }
            }
            if (sb.length() == 2) {
                if (Integer.parseInt(sb.toString()) % 4 == i14) {
                    String sb2 = sb.toString();
                    if (sb2.length() != 2) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(n.class);
                        enumMap.put((EnumMap) n.e, (n) Integer.valueOf(sb2));
                    }
                    float f8 = i10;
                    m mVar = new m(sb2, null, new o[]{new o((l10[0] + l10[1]) / 2.0f, f8), new o(i13, f8)}, z5.a.r);
                    if (enumMap != null) {
                        mVar.a(enumMap);
                    }
                    return mVar;
                }
                throw z5.i.d;
            }
            throw z5.i.d;
        }
    }
}
