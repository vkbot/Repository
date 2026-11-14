package x6;

import java.util.ArrayList;
import z5.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final d f6504f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final f6.b f6505a;
    public boolean c;
    public final p e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6506b = new ArrayList();
    public final int[] d = new int[5];

    public e(f6.b bVar, p pVar) {
        this.f6505a = bVar;
        this.e = pVar;
    }

    public static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < 5) {
                int i12 = iArr[i10];
                if (i12 == 0) {
                    break;
                }
                i11 += i12;
                i10++;
            } else if (i11 >= 7) {
                float f8 = i11 / 7.0f;
                float f10 = f8 / 2.0f;
                if (Math.abs(f8 - iArr[0]) >= f10 || Math.abs(f8 - iArr[1]) >= f10 || Math.abs((f8 * 3.0f) - iArr[2]) >= 3.0f * f10 || Math.abs(f8 - iArr[3]) >= f10 || Math.abs(f8 - iArr[4]) >= f10) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.f6875a - cVar2.f6875a;
        double d10 = cVar.f6876b - cVar2.f6876b;
        return (d10 * d10) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f6506b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f8 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i10++;
                f10 += cVar.c;
            }
        }
        if (i10 >= 3) {
            float f11 = f10 / size;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                f8 += Math.abs(((c) obj2).c - f11);
            }
            if (f8 <= f10 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
