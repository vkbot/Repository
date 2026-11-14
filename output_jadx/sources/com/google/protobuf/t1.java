package com.google.protobuf;

import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f1630b = new Object();
    public static final f1 c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1631a;

    public static String c(g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            byte a10 = gVar.a(i10);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb.append((char) a10);
                                    break;
                                } else {
                                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                                    sb.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static boolean d(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static int f(int i10, int i11, long j10, byte[] bArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return v1.d(i10, s1.g(bArr, j10), s1.g(bArr, j10 + 1));
                }
                throw new AssertionError();
            }
            return v1.c(i10, s1.g(bArr, j10));
        }
        t1 t1Var = v1.f1639a;
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t1.a(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t1.b(java.lang.String, byte[], int, int):int");
    }

    public final int e(byte[] bArr, int i10, int i11) {
        int i12;
        long j10;
        int i13 = i10;
        switch (this.f1631a) {
            case 0:
                break;
            default:
                if ((i13 | i11 | (bArr.length - i11)) >= 0) {
                    long j11 = i13;
                    int i14 = (int) (i11 - j11);
                    long j12 = 1;
                    if (i14 < 16) {
                        i12 = 0;
                    } else {
                        int i15 = 8 - (((int) j11) & 7);
                        long j13 = j11;
                        i12 = 0;
                        while (true) {
                            if (i12 < i15) {
                                long j14 = j13 + 1;
                                if (s1.g(bArr, j13) >= 0) {
                                    i12++;
                                    j13 = j14;
                                }
                            } else {
                                while (true) {
                                    int i16 = i12 + 8;
                                    if (i16 <= i14) {
                                        if ((s1.c.h(bArr, s1.f1614f + j13) & (-9187201950435737472L)) == 0) {
                                            j13 += 8;
                                            i12 = i16;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i12 < i14) {
                                        long j15 = j13 + 1;
                                        if (s1.g(bArr, j13) >= 0) {
                                            i12++;
                                            j13 = j15;
                                        }
                                    } else {
                                        i12 = i14;
                                    }
                                }
                            }
                        }
                    }
                    int i17 = i14 - i12;
                    long j16 = j11 + i12;
                    while (true) {
                        byte b10 = 0;
                        while (true) {
                            if (i17 > 0) {
                                long j17 = j16 + j12;
                                b10 = s1.g(bArr, j16);
                                if (b10 >= 0) {
                                    i17--;
                                    j16 = j17;
                                } else {
                                    j16 = j17;
                                }
                            }
                        }
                        if (i17 == 0) {
                            return 0;
                        }
                        int i18 = i17 - 1;
                        if (b10 < -32) {
                            if (i18 == 0) {
                                return b10;
                            }
                            i17 -= 2;
                            if (b10 >= -62) {
                                long j18 = j16 + j12;
                                if (s1.g(bArr, j16) <= -65) {
                                    j10 = j12;
                                    j16 = j18;
                                    j12 = j10;
                                }
                            }
                        } else if (b10 < -16) {
                            if (i18 < 2) {
                                return f(b10, i18, j16, bArr);
                            }
                            i17 -= 3;
                            j10 = j12;
                            long j19 = j16 + j10;
                            byte g10 = s1.g(bArr, j16);
                            if (g10 <= -65 && ((b10 != -32 || g10 >= -96) && (b10 != -19 || g10 < -96))) {
                                j16 += 2;
                                if (s1.g(bArr, j19) <= -65) {
                                    j12 = j10;
                                }
                            }
                        } else {
                            j10 = j12;
                            if (i18 < 3) {
                                return f(b10, i18, j16, bArr);
                            }
                            i17 -= 4;
                            long j20 = j16 + j10;
                            byte g11 = s1.g(bArr, j16);
                            if (g11 <= -65) {
                                if ((((g11 + 112) + (b10 << 28)) >> 30) == 0) {
                                    long j21 = 2 + j16;
                                    if (s1.g(bArr, j20) <= -65) {
                                        j16 += 3;
                                        if (s1.g(bArr, j21) <= -65) {
                                            j12 = j10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i11)));
        }
        while (i13 < i11 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i11) {
            while (i13 < i11) {
                int i19 = i13 + 1;
                byte b11 = bArr[i13];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i19 >= i11) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i13 += 2;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 < -16) {
                        if (i19 >= i11 - 1) {
                            return v1.a(bArr, i19, i11);
                        }
                        int i20 = i13 + 2;
                        byte b12 = bArr[i19];
                        if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                            i13 += 3;
                            if (bArr[i20] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i19 >= i11 - 2) {
                        return v1.a(bArr, i19, i11);
                    }
                    int i21 = i13 + 2;
                    byte b13 = bArr[i19];
                    if (b13 <= -65) {
                        if ((((b13 + 112) + (b11 << 28)) >> 30) == 0) {
                            int i22 = i13 + 3;
                            if (bArr[i21] <= -65) {
                                i13 += 4;
                                if (bArr[i22] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i19;
            }
        }
        return 0;
    }
}
