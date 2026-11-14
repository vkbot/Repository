package b6;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.g;
import f6.b;
import f6.d;
import j1.i;
import java.util.Arrays;
import org.apache.commons.net.SocketClient;
import r5.c;
import z5.e;
import z5.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f364b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", SocketClient.NETASCII_EOL, ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f365f = {"CTRL_PS", " ", "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    public a6.a f366a;

    public static int b(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    public final d a(a6.a aVar) {
        int i10;
        int i11;
        int i12;
        h6.a aVar2;
        int i13;
        int i14;
        String str;
        int b10;
        boolean z9;
        boolean z10;
        this.f366a = aVar;
        b bVar = (b) aVar.d;
        boolean z11 = aVar.f51a;
        int i15 = aVar.c;
        if (z11) {
            i10 = 11;
        } else {
            i10 = 14;
        }
        int i16 = i10 + (i15 << 2);
        int[] iArr = new int[i16];
        if (z11) {
            i11 = 88;
        } else {
            i11 = 112;
        }
        int i17 = (i11 + (i15 << 4)) * i15;
        boolean[] zArr = new boolean[i17];
        int i18 = 2;
        int i19 = 1;
        if (z11) {
            for (int i20 = 0; i20 < i16; i20++) {
                iArr[i20] = i20;
            }
        } else {
            int i21 = i16 / 2;
            int i22 = ((((i21 - 1) / 15) * 2) + (i16 + 1)) / 2;
            for (int i23 = 0; i23 < i21; i23++) {
                iArr[(i21 - i23) - 1] = (i22 - r15) - 1;
                iArr[i21 + i23] = (i23 / 15) + i23 + i22 + 1;
            }
        }
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i12 = 12;
            if (i24 >= i15) {
                break;
            }
            int i26 = (i15 - i24) << i18;
            if (z11) {
                i12 = 9;
            }
            int i27 = i26 + i12;
            int i28 = i24 << 1;
            int i29 = (i16 - 1) - i28;
            int i30 = 0;
            while (i30 < i27) {
                int i31 = i30 << 1;
                int i32 = 0;
                while (i32 < i18) {
                    int i33 = i28 + i32;
                    int i34 = i19;
                    int i35 = i28 + i30;
                    zArr[i25 + i31 + i32] = bVar.b(iArr[i33], iArr[i35]);
                    int i36 = i29 - i32;
                    zArr[(i27 * 2) + i25 + i31 + i32] = bVar.b(iArr[i35], iArr[i36]);
                    int i37 = i29 - i30;
                    zArr[(i27 * 4) + i25 + i31 + i32] = bVar.b(iArr[i36], iArr[i37]);
                    zArr[(i27 * 6) + i25 + i31 + i32] = bVar.b(iArr[i37], iArr[i33]);
                    i32++;
                    i19 = i34;
                    i15 = i15;
                    i18 = 2;
                }
                i30++;
                i18 = 2;
            }
            i25 += i27 << 3;
            i24++;
            i15 = i15;
            i18 = 2;
        }
        int i38 = i19;
        a6.a aVar3 = this.f366a;
        int i39 = aVar3.c;
        int i40 = 8;
        if (i39 <= 2) {
            aVar2 = h6.a.f2589j;
            i12 = 6;
        } else if (i39 <= 8) {
            aVar2 = h6.a.f2593n;
            i12 = 8;
        } else if (i39 <= 22) {
            aVar2 = h6.a.f2588i;
            i12 = 10;
        } else {
            aVar2 = h6.a.f2587h;
        }
        int i41 = aVar3.f52b;
        int i42 = i17 / i12;
        if (i42 >= i41) {
            int i43 = i17 % i12;
            int[] iArr2 = new int[i42];
            int i44 = 0;
            while (i44 < i42) {
                iArr2[i44] = b(zArr, i43, i12);
                i44++;
                i43 += i12;
            }
            try {
                new c(19, aVar2).f(iArr2, i42 - i41);
                int i45 = i38 << i12;
                int i46 = i45 - 1;
                int i47 = 0;
                int i48 = 0;
                while (i47 < i41) {
                    int i49 = iArr2[i47];
                    if (i49 != 0 && i49 != i46) {
                        if (i49 == i38 || i49 == i45 - 2) {
                            i48++;
                        }
                        i47++;
                        i38 = 1;
                    } else {
                        throw e.a();
                    }
                }
                int i50 = (i41 * i12) - i48;
                boolean[] zArr2 = new boolean[i50];
                int i51 = 0;
                for (int i52 = 0; i52 < i41; i52++) {
                    int i53 = iArr2[i52];
                    int i54 = 1;
                    if (i53 != 1 && i53 != i45 - 2) {
                        int i55 = i12 - 1;
                        while (i55 >= 0) {
                            int i56 = i51 + 1;
                            if ((i53 & (i54 << i55)) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zArr2[i51] = z10;
                            i55--;
                            i51 = i56;
                            i54 = 1;
                        }
                    } else {
                        int i57 = (i51 + i12) - 1;
                        if (i53 > 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Arrays.fill(zArr2, i51, i57, z9);
                        i51 = (i12 - 1) + i51;
                    }
                }
                int i58 = (i50 + 7) / 8;
                byte[] bArr = new byte[i58];
                for (int i59 = 0; i59 < i58; i59++) {
                    int i60 = i59 << 3;
                    int i61 = i50 - i60;
                    if (i61 >= 8) {
                        b10 = b(zArr2, i60, 8);
                    } else {
                        b10 = b(zArr2, i60, i61) << (8 - i61);
                    }
                    bArr[i59] = (byte) b10;
                }
                StringBuilder sb = new StringBuilder(20);
                int i62 = 1;
                int i63 = 0;
                int i64 = 1;
                while (i63 < i50) {
                    if (i64 == 6) {
                        if (i50 - i63 < 5) {
                            break;
                        }
                        int b11 = b(zArr2, i63, 5);
                        int i65 = i63 + 5;
                        if (b11 == 0) {
                            if (i50 - i65 < 11) {
                                break;
                            }
                            b11 = b(zArr2, i65, 11) + 31;
                            i65 = i63 + 16;
                        }
                        int i66 = 0;
                        while (true) {
                            if (i66 < b11) {
                                if (i50 - i65 < i40) {
                                    i63 = i50;
                                    break;
                                }
                                sb.append((char) b(zArr2, i65, i40));
                                i65 += 8;
                                i66++;
                            } else {
                                i63 = i65;
                                break;
                            }
                        }
                        i64 = i62;
                    } else {
                        if (i64 == 4) {
                            i13 = 4;
                        } else {
                            i13 = 5;
                        }
                        if (i50 - i63 < i13) {
                            break;
                        }
                        int b12 = b(zArr2, i63, i13);
                        i63 += i13;
                        int c10 = g.c(i64);
                        if (c10 != 0) {
                            if (c10 != 1) {
                                i14 = 2;
                                if (c10 != 2) {
                                    if (c10 != 3) {
                                        if (c10 == 4) {
                                            str = e[b12];
                                        } else {
                                            i.l("Bad table");
                                            return null;
                                        }
                                    } else {
                                        str = f365f[b12];
                                    }
                                } else {
                                    str = d[b12];
                                }
                            } else {
                                i14 = 2;
                                str = c[b12];
                            }
                        } else {
                            i14 = 2;
                            str = f364b[b12];
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt != 'B') {
                                if (charAt != 'D') {
                                    if (charAt != 'P') {
                                        if (charAt != 'L') {
                                            if (charAt != 'M') {
                                                i62 = 1;
                                            } else {
                                                i62 = 3;
                                            }
                                        } else {
                                            i62 = i14;
                                        }
                                    } else {
                                        i62 = 5;
                                    }
                                } else {
                                    i62 = 4;
                                }
                            } else {
                                i62 = 6;
                            }
                            if (str.charAt(6) != 'L') {
                                int i67 = i64;
                                i64 = i62;
                                i62 = i67;
                                i40 = 8;
                            }
                        } else {
                            sb.append(str);
                        }
                        i64 = i62;
                        i40 = 8;
                    }
                }
                return new d(bArr, sb.toString(), null, null);
            } catch (h6.c e6) {
                e eVar = e.d;
                if (l.f6864b) {
                    throw new Exception(e6);
                }
                throw e.d;
            }
        }
        throw e.a();
    }
}
