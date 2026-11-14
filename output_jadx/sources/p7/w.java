package p7;

import java.util.ArrayList;
import java.util.logging.Logger;
import o7.v4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class w {
    static {
        Logger.getLogger(w.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size];
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            r7.b bVar = (r7.b) obj;
            int i12 = i10 + 1;
            bArr[i10] = bVar.f5418a.k();
            i10 += 2;
            bArr[i12] = bVar.f5419b.k();
        }
        byte[] bArr2 = v4.f4757b;
        int i13 = 0;
        while (i13 < size) {
            byte[] bArr3 = bArr[i13];
            int i14 = i13 + 1;
            byte[] bArr4 = bArr[i14];
            if (v4.a(bArr3, bArr2)) {
                for (byte b10 : bArr4) {
                    if (b10 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i15 = 0; i15 < i13; i15++) {
                            arrayList2.add(bArr[i15]);
                        }
                        while (i13 < size) {
                            byte[] bArr5 = bArr[i13];
                            byte[] bArr6 = bArr[i13 + 1];
                            if (!v4.a(bArr5, bArr2)) {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            } else {
                                int i16 = 0;
                                for (int i17 = 0; i17 <= bArr6.length; i17++) {
                                    if (i17 == bArr6.length || bArr6[i17] == 44) {
                                        byte[] a10 = k4.e.d.a(new String(bArr6, i16, i17 - i16, i4.b.f2770a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(a10);
                                        i16 = i17 + 1;
                                    }
                                }
                            }
                            i13 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0]);
                    }
                }
                bArr[i14] = k4.e.d.a(new String(bArr4, i4.b.f2770a));
            }
            i13 += 2;
        }
        return bArr;
    }
}
