package q;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o7.o2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5137a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5138b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(m mVar, k.g gVar) {
        try {
            int c = mVar.c();
            if ((c & 65496) != 65496 && c != 19789 && c != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + c);
                    return -1;
                }
            } else {
                int g10 = g(mVar);
                if (g10 == -1) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                        return -1;
                    }
                } else {
                    byte[] bArr = (byte[]) gVar.c(g10, byte[].class);
                    try {
                        return h(mVar, bArr, g10);
                    } finally {
                        gVar.g(bArr);
                    }
                }
            }
        } catch (l unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(m mVar) {
        boolean z9;
        try {
            int c = mVar.c();
            if (c == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int e = (c << 8) | mVar.e();
            if (e == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int e6 = (e << 8) | mVar.e();
            if (e6 == -1991225785) {
                mVar.skip(21L);
                try {
                    if (mVar.e() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (l unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (e6 != 1380533830) {
                if (((mVar.c() << 16) | mVar.c()) != 1718909296) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int c10 = (mVar.c() << 16) | mVar.c();
                if (c10 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                int i10 = 0;
                if (c10 == 1635150182) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                mVar.skip(4L);
                int i11 = e6 - 16;
                if (i11 % 4 == 0) {
                    while (i10 < 5 && i11 > 0) {
                        int c11 = (mVar.c() << 16) | mVar.c();
                        if (c11 == 1635150195) {
                            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                        }
                        if (c11 == 1635150182) {
                            z9 = true;
                        }
                        i10++;
                        i11 -= 4;
                    }
                }
                if (z9) {
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            mVar.skip(4L);
            if (((mVar.c() << 16) | mVar.c()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int c12 = (mVar.c() << 16) | mVar.c();
            if ((c12 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i12 = c12 & 255;
            if (i12 == 88) {
                mVar.skip(4L);
                short e10 = mVar.e();
                if ((e10 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((e10 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i12 == 76) {
                mVar.skip(4L);
                if ((mVar.e() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (l unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(q.m r9) {
        /*
        L0:
            short r0 = r9.e()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.e()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.c()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = ai.onnxruntime.a.v(r5, r0, r1, r9, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.n.g(q.m):int");
    }

    public static int h(m mVar, byte[] bArr, int i10) {
        boolean z9;
        short s5;
        ByteOrder byteOrder;
        int i11;
        short s9;
        short s10;
        short s11;
        short s12;
        int i12;
        int read = mVar.read(bArr, i10);
        short s13 = -1;
        if (read != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + read);
                return -1;
            }
        } else {
            int i13 = 0;
            byte[] bArr2 = f5137a;
            if (bArr != null && i10 > bArr2.length) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int i14 = 0;
                while (true) {
                    if (i14 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i14] != bArr2[i14]) {
                        z9 = false;
                        break;
                    }
                    i14++;
                }
            }
            if (z9) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
                if (byteBuffer.remaining() - 6 >= 2) {
                    s5 = byteBuffer.getShort(6);
                } else {
                    s5 = -1;
                }
                if (s5 != 18761) {
                    if (s5 != 19789) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s5));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    }
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                if (byteBuffer.remaining() - 10 >= 4) {
                    i11 = byteBuffer.getInt(10);
                } else {
                    i11 = -1;
                }
                int i15 = i11 + 6;
                if (byteBuffer.remaining() - i15 >= 2) {
                    s9 = byteBuffer.getShort(i15);
                } else {
                    s9 = -1;
                }
                while (i13 < s9) {
                    int i16 = (i13 * 12) + i11 + 8;
                    if (byteBuffer.remaining() - i16 >= 2) {
                        s10 = byteBuffer.getShort(i16);
                    } else {
                        s10 = s13;
                    }
                    if (s10 == 274) {
                        int i17 = i16 + 2;
                        if (byteBuffer.remaining() - i17 >= 2) {
                            s11 = byteBuffer.getShort(i17);
                        } else {
                            s11 = s13;
                        }
                        if (s11 < 1 || s11 > 12) {
                            s12 = s13;
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s11));
                            }
                        } else {
                            int i18 = i16 + 4;
                            if (byteBuffer.remaining() - i18 >= 4) {
                                i12 = byteBuffer.getInt(i18);
                            } else {
                                i12 = s13;
                            }
                            if (i12 < 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    s12 = s13;
                                    StringBuilder v9 = ai.onnxruntime.a.v("Got tagIndex=", i13, s10, " tagType=", " formatCode=");
                                    v9.append((int) s11);
                                    v9.append(" componentCount=");
                                    v9.append(i12);
                                    Log.d("DfltImageHeaderParser", v9.toString());
                                } else {
                                    s12 = s13;
                                }
                                int i19 = i12 + f5138b[s11];
                                if (i19 > 4) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s11));
                                    }
                                } else {
                                    int i20 = i16 + 8;
                                    if (i20 >= 0 && i20 <= byteBuffer.remaining()) {
                                        if (i19 >= 0 && i19 + i20 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i20 >= 2) {
                                                return byteBuffer.getShort(i20);
                                            }
                                            return s12;
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s10));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i20 + " tagType=" + ((int) s10));
                                    }
                                }
                            }
                        }
                        i13++;
                        s13 = s12;
                    }
                    s12 = s13;
                    i13++;
                    s13 = s12;
                }
            } else {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
        }
        return s13;
    }

    @Override // h.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        c0.g.c(byteBuffer, "Argument must not be null");
        return f(new k(byteBuffer, 0));
    }

    @Override // h.d
    public final int b(InputStream inputStream, k.g gVar) {
        o2 o2Var = new o2(inputStream);
        c0.g.c(gVar, "Argument must not be null");
        return e(o2Var, gVar);
    }

    @Override // h.d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return f(new o2(inputStream));
    }

    @Override // h.d
    public final int d(ByteBuffer byteBuffer, k.g gVar) {
        k kVar = new k(byteBuffer, 0);
        c0.g.c(gVar, "Argument must not be null");
        return e(kVar, gVar);
    }
}
