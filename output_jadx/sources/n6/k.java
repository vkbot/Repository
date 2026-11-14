package n6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import z5.l;
import z5.m;
import z5.n;
import z5.o;
import z5.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class k extends h {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f4150f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f4151g;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4152a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final j f4153b = new j(0);
    public final j c = new j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f4150f = iArr;
        int[][] iArr2 = new int[20];
        f4151g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f4150f[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f4151g[i10] = iArr4;
        }
    }

    public static int h(f6.a aVar, int[] iArr, int i10, int[][] iArr2) {
        h.e(i10, aVar, iArr);
        int length = iArr2.length;
        float f8 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float d10 = h.d(iArr, iArr2[i12], 0.7f);
            if (d10 < f8) {
                i11 = i12;
                f8 = d10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw z5.i.d;
    }

    public static int[] l(f6.a aVar, int i10, boolean z9, int[] iArr, int[] iArr2) {
        int e6;
        int i11 = aVar.c;
        if (z9) {
            e6 = aVar.f(i10);
        } else {
            e6 = aVar.e(i10);
        }
        int length = iArr.length;
        boolean z10 = z9;
        int i12 = 0;
        int i13 = e6;
        while (e6 < i11) {
            if (aVar.d(e6) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 == length - 1) {
                    if (h.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i13, e6};
                    }
                    i13 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                } else {
                    i12++;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            e6++;
        }
        throw z5.i.d;
    }

    public static int[] m(f6.a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z9 = false;
        int i10 = 0;
        while (!z9) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = l(aVar, i10, false, d, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z9 = aVar.h(i13, i11);
            }
            i10 = i12;
        }
        return iArr2;
    }

    @Override // n6.h
    public m b(int i10, f6.a aVar, Map map) {
        return k(i10, aVar, m(aVar), map);
    }

    public boolean g(String str) {
        int length = str.length();
        if (length != 0) {
            int i10 = length - 1;
            int digit = Character.digit(str.charAt(i10), 10);
            CharSequence subSequence = str.subSequence(0, i10);
            int length2 = subSequence.length();
            int i11 = 0;
            for (int i12 = length2 - 1; i12 >= 0; i12 -= 2) {
                int charAt = subSequence.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    i11 += charAt;
                } else {
                    throw z5.e.a();
                }
            }
            int i13 = i11 * 3;
            for (int i14 = length2 - 2; i14 >= 0; i14 -= 2) {
                int charAt2 = subSequence.charAt(i14) - '0';
                if (charAt2 >= 0 && charAt2 <= 9) {
                    i13 += charAt2;
                } else {
                    throw z5.e.a();
                }
            }
            if ((1000 - i13) % 10 == digit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(f6.a aVar, int i10) {
        return l(aVar, i10, false, d, new int[3]);
    }

    public abstract int j(f6.a aVar, int[] iArr, StringBuilder sb);

    public m k(int i10, f6.a aVar, int[] iArr, Map map) {
        p pVar;
        int i11;
        int[] iArr2;
        String str = null;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (p) map.get(z5.d.f6856k);
        }
        if (pVar != null) {
            pVar.a(new o((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb = this.f4152a;
        sb.setLength(0);
        int j10 = j(aVar, iArr, sb);
        if (pVar != null) {
            pVar.a(new o(j10, i10));
        }
        int[] i12 = i(aVar, j10);
        if (pVar != null) {
            pVar.a(new o((i12[0] + i12[1]) / 2.0f, i10));
        }
        int i13 = i12[1];
        int i14 = (i13 - i12[0]) + i13;
        if (i14 < aVar.c && aVar.h(i13, i14)) {
            String sb2 = sb.toString();
            if (sb2.length() >= 8) {
                if (g(sb2)) {
                    z5.a n10 = n();
                    float f8 = i10;
                    m mVar = new m(sb2, null, new o[]{new o((iArr[1] + iArr[0]) / 2.0f, f8), new o((i12[1] + i12[0]) / 2.0f, f8)}, n10);
                    try {
                        m b10 = this.f4153b.b(i10, i12[1], aVar);
                        mVar.b(n.f6870h, b10.f6865a);
                        mVar.a(b10.e);
                        o[] oVarArr = b10.c;
                        o[] oVarArr2 = mVar.c;
                        if (oVarArr2 == null) {
                            mVar.c = oVarArr;
                        } else if (oVarArr != null && oVarArr.length > 0) {
                            o[] oVarArr3 = new o[oVarArr2.length + oVarArr.length];
                            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
                            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
                            mVar.c = oVarArr3;
                        }
                        i11 = b10.f6865a.length();
                    } catch (l unused) {
                        i11 = 0;
                    }
                    if (map == null) {
                        iArr2 = null;
                    } else {
                        iArr2 = (int[]) map.get(z5.d.f6857l);
                    }
                    if (iArr2 != null) {
                        for (int i15 : iArr2) {
                            if (i11 != i15) {
                            }
                        }
                        throw z5.i.d;
                    }
                    if (n10 == z5.a.f6839i || n10 == z5.a.f6846p) {
                        j jVar = this.c;
                        synchronized (jVar) {
                            if (((ArrayList) jVar.f4148a).isEmpty()) {
                                jVar.a("US/CA", new int[]{0, 19});
                                jVar.a("US", new int[]{30, 39});
                                jVar.a("US/CA", new int[]{60, 139});
                                jVar.a("FR", new int[]{300, 379});
                                jVar.a("BG", new int[]{380});
                                jVar.a("SI", new int[]{383});
                                jVar.a("HR", new int[]{385});
                                jVar.a("BA", new int[]{387});
                                jVar.a("DE", new int[]{NNTPReply.SERVICE_DISCONTINUED, NNTPReply.POSTING_NOT_ALLOWED});
                                jVar.a("JP", new int[]{450, 459});
                                jVar.a("RU", new int[]{460, 469});
                                jVar.a("TW", new int[]{471});
                                jVar.a("EE", new int[]{474});
                                jVar.a("LV", new int[]{475});
                                jVar.a("AZ", new int[]{476});
                                jVar.a("LT", new int[]{477});
                                jVar.a("UZ", new int[]{478});
                                jVar.a("LK", new int[]{479});
                                jVar.a("PH", new int[]{NNTPReply.AUTHENTICATION_REQUIRED});
                                jVar.a("BY", new int[]{481});
                                jVar.a("UA", new int[]{NNTPReply.AUTHENTICATION_REJECTED});
                                jVar.a("MD", new int[]{484});
                                jVar.a("AM", new int[]{485});
                                jVar.a("GE", new int[]{486});
                                jVar.a("KZ", new int[]{487});
                                jVar.a("HK", new int[]{489});
                                jVar.a("JP", new int[]{490, 499});
                                jVar.a("GB", new int[]{500, 509});
                                jVar.a("GR", new int[]{520});
                                jVar.a("LB", new int[]{528});
                                jVar.a("CY", new int[]{529});
                                jVar.a("MK", new int[]{531});
                                jVar.a("MT", new int[]{FTPReply.FAILED_SECURITY_CHECK});
                                jVar.a("IE", new int[]{539});
                                jVar.a("BE/LU", new int[]{540, 549});
                                jVar.a("PT", new int[]{560});
                                jVar.a("IS", new int[]{569});
                                jVar.a("DK", new int[]{570, 579});
                                jVar.a("PL", new int[]{590});
                                jVar.a("RO", new int[]{594});
                                jVar.a("HU", new int[]{599});
                                jVar.a("ZA", new int[]{600, 601});
                                jVar.a("GH", new int[]{TypedValues.MotionType.TYPE_EASING});
                                jVar.a("BH", new int[]{TypedValues.MotionType.TYPE_DRAW_PATH});
                                jVar.a("MU", new int[]{TypedValues.MotionType.TYPE_POLAR_RELATIVETO});
                                jVar.a("MA", new int[]{TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE});
                                jVar.a("DZ", new int[]{613});
                                jVar.a("KE", new int[]{616});
                                jVar.a("CI", new int[]{618});
                                jVar.a("TN", new int[]{619});
                                jVar.a("SY", new int[]{621});
                                jVar.a("EG", new int[]{622});
                                jVar.a("LY", new int[]{624});
                                jVar.a("JO", new int[]{625});
                                jVar.a("IR", new int[]{626});
                                jVar.a("KW", new int[]{627});
                                jVar.a("SA", new int[]{628});
                                jVar.a("AE", new int[]{629});
                                jVar.a("FI", new int[]{640, 649});
                                jVar.a("CN", new int[]{690, 695});
                                jVar.a("NO", new int[]{TypedValues.TransitionType.TYPE_DURATION, 709});
                                jVar.a("IL", new int[]{729});
                                jVar.a("SE", new int[]{730, 739});
                                jVar.a("GT", new int[]{740});
                                jVar.a("SV", new int[]{741});
                                jVar.a("HN", new int[]{742});
                                jVar.a("NI", new int[]{743});
                                jVar.a("CR", new int[]{744});
                                jVar.a("PA", new int[]{745});
                                jVar.a("DO", new int[]{746});
                                jVar.a("MX", new int[]{750});
                                jVar.a("CA", new int[]{754, 755});
                                jVar.a("VE", new int[]{759});
                                jVar.a("CH", new int[]{760, 769});
                                jVar.a("CO", new int[]{770});
                                jVar.a("UY", new int[]{773});
                                jVar.a("PE", new int[]{775});
                                jVar.a("BO", new int[]{777});
                                jVar.a("AR", new int[]{779});
                                jVar.a("CL", new int[]{780});
                                jVar.a("PY", new int[]{784});
                                jVar.a("PE", new int[]{785});
                                jVar.a("EC", new int[]{786});
                                jVar.a("BR", new int[]{789, 790});
                                jVar.a("IT", new int[]{800, 839});
                                jVar.a("ES", new int[]{840, 849});
                                jVar.a("CU", new int[]{850});
                                jVar.a("SK", new int[]{858});
                                jVar.a("CZ", new int[]{859});
                                jVar.a("YU", new int[]{860});
                                jVar.a("MN", new int[]{865});
                                jVar.a("KP", new int[]{867});
                                jVar.a("TR", new int[]{868, 869});
                                jVar.a("NL", new int[]{870, 879});
                                jVar.a("KR", new int[]{880});
                                jVar.a("TH", new int[]{885});
                                jVar.a("SG", new int[]{888});
                                jVar.a("IN", new int[]{890});
                                jVar.a("VN", new int[]{893});
                                jVar.a("PK", new int[]{896});
                                jVar.a("ID", new int[]{899});
                                jVar.a("AT", new int[]{TypedValues.Custom.TYPE_INT, 919});
                                jVar.a("AU", new int[]{930, 939});
                                jVar.a("AZ", new int[]{940, 949});
                                jVar.a("MY", new int[]{955});
                                jVar.a("MO", new int[]{958});
                            }
                        }
                        int parseInt = Integer.parseInt(sb2.substring(0, 3));
                        int size = ((ArrayList) jVar.f4148a).size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            int[] iArr3 = (int[]) ((ArrayList) jVar.f4148a).get(i16);
                            int i17 = iArr3[0];
                            if (parseInt < i17) {
                                break;
                            }
                            if (iArr3.length != 1) {
                                i17 = iArr3[1];
                            }
                            if (parseInt <= i17) {
                                str = (String) ((ArrayList) jVar.f4149b).get(i16);
                                break;
                            }
                            i16++;
                        }
                        if (str != null) {
                            mVar.b(n.f6869g, str);
                        }
                    }
                    return mVar;
                }
                throw z5.c.a();
            }
            throw z5.e.a();
        }
        throw z5.i.d;
    }

    public abstract z5.a n();
}
