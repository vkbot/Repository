package n6;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import z5.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f4137j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4138k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f4139l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4140h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4141i;

    public e(int i10) {
        this.f4140h = i10;
        switch (i10) {
            case 1:
                this.f4141i = new int[4];
                return;
            case 2:
                this.f4141i = new int[4];
                return;
            case 3:
                this.f4141i = new e(0);
                return;
            default:
                this.f4141i = new int[4];
                return;
        }
    }

    public static m o(m mVar) {
        String str = mVar.f6865a;
        if (str.charAt(0) == '0') {
            m mVar2 = new m(str.substring(1), null, mVar.c, z5.a.f6846p);
            Map map = mVar.e;
            if (map != null) {
                mVar2.a(map);
            }
            return mVar2;
        }
        throw z5.e.a();
    }

    @Override // n6.h, z5.k
    public m a(z5.b bVar, Map map) {
        switch (this.f4140h) {
            case 3:
                return o(((e) this.f4141i).a(bVar, map));
            default:
                return super.a(bVar, map);
        }
    }

    @Override // n6.k, n6.h
    public m b(int i10, f6.a aVar, Map map) {
        switch (this.f4140h) {
            case 3:
                return o(((e) this.f4141i).b(i10, aVar, map));
            default:
                return super.b(i10, aVar, map);
        }
    }

    @Override // n6.k
    public boolean g(String str) {
        switch (this.f4140h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c = cArr[5];
                switch (c) {
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.g(sb.toString());
            default:
                return super.g(str);
        }
    }

    @Override // n6.k
    public int[] i(f6.a aVar, int i10) {
        switch (this.f4140h) {
            case 1:
                return k.l(aVar, i10, true, f4138k, new int[6]);
            default:
                return super.i(aVar, i10);
        }
    }

    @Override // n6.k
    public final int j(f6.a aVar, int[] iArr, StringBuilder sb) {
        int[][] iArr2;
        switch (this.f4140h) {
            case 0:
                int[] iArr3 = (int[]) this.f4141i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i10 = aVar.c;
                int i11 = iArr[1];
                int i12 = 0;
                for (int i13 = 0; i13 < 6 && i11 < i10; i13++) {
                    int h2 = k.h(aVar, iArr3, i11, k.f4151g);
                    sb.append((char) ((h2 % 10) + 48));
                    for (int i14 : iArr3) {
                        i11 += i14;
                    }
                    if (h2 >= 10) {
                        i12 |= 1 << (5 - i13);
                    }
                }
                for (int i15 = 0; i15 < 10; i15++) {
                    if (i12 == f4137j[i15]) {
                        sb.insert(0, (char) (i15 + 48));
                        int i16 = k.l(aVar, i11, true, k.e, new int[5])[1];
                        for (int i17 = 0; i17 < 6 && i16 < i10; i17++) {
                            sb.append((char) (k.h(aVar, iArr3, i16, k.f4150f) + 48));
                            for (int i18 : iArr3) {
                                i16 += i18;
                            }
                        }
                        return i16;
                    }
                }
                throw z5.i.d;
            case 1:
                int[] iArr4 = (int[]) this.f4141i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i19 = aVar.c;
                int i20 = iArr[1];
                int i21 = 0;
                for (int i22 = 0; i22 < 6 && i20 < i19; i22++) {
                    int h10 = k.h(aVar, iArr4, i20, k.f4151g);
                    sb.append((char) ((h10 % 10) + 48));
                    for (int i23 : iArr4) {
                        i20 += i23;
                    }
                    if (h10 >= 10) {
                        i21 |= 1 << (5 - i22);
                    }
                }
                for (int i24 = 0; i24 <= 1; i24++) {
                    for (int i25 = 0; i25 < 10; i25++) {
                        if (i21 == f4139l[i24][i25]) {
                            sb.insert(0, (char) (i24 + 48));
                            sb.append((char) (i25 + 48));
                            return i20;
                        }
                    }
                }
                throw z5.i.d;
            case 2:
                int[] iArr5 = (int[]) this.f4141i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i26 = aVar.c;
                int i27 = iArr[1];
                int i28 = 0;
                while (true) {
                    iArr2 = k.f4150f;
                    if (i28 < 4 && i27 < i26) {
                        sb.append((char) (k.h(aVar, iArr5, i27, iArr2) + 48));
                        for (int i29 : iArr5) {
                            i27 += i29;
                        }
                        i28++;
                    }
                }
                int i30 = k.l(aVar, i27, true, k.e, new int[5])[1];
                for (int i31 = 0; i31 < 4 && i30 < i26; i31++) {
                    sb.append((char) (k.h(aVar, iArr5, i30, iArr2) + 48));
                    for (int i32 : iArr5) {
                        i30 += i32;
                    }
                }
                return i30;
            default:
                return ((e) this.f4141i).j(aVar, iArr, sb);
        }
    }

    @Override // n6.k
    public m k(int i10, f6.a aVar, int[] iArr, Map map) {
        switch (this.f4140h) {
            case 3:
                return o(((e) this.f4141i).k(i10, aVar, iArr, map));
            default:
                return super.k(i10, aVar, iArr, map);
        }
    }

    @Override // n6.k
    public final z5.a n() {
        switch (this.f4140h) {
            case 0:
                return z5.a.f6839i;
            case 1:
                return z5.a.f6847q;
            case 2:
                return z5.a.f6838h;
            default:
                return z5.a.f6846p;
        }
    }
}
