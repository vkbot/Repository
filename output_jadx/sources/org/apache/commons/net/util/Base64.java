package org.apache.commons.net.util;

import j1.i;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes2.dex */
public class Base64 {
    static final int CHUNK_SIZE = 76;
    private static final byte PAD = 61;
    private final int lineLength;
    private final byte[] lineSeparator;
    private final boolean urlSafe;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64(int i10, byte[] bArr, boolean z9) {
        int i11;
        if (bArr == null || z9) {
            bArr = NetConstants.EMPTY_BTYE_ARRAY;
            i10 = 0;
        }
        if (i10 > 0) {
            i11 = (i10 / 4) * 4;
        } else {
            i11 = 0;
        }
        this.lineLength = i11;
        byte[] bArr2 = new byte[bArr.length];
        this.lineSeparator = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        if (!containsBase64Byte(bArr)) {
            this.urlSafe = z9;
        } else {
            i.k(ai.onnxruntime.a.m("lineSeperator must not contain base64 characters: [", newStringUtf8(bArr), "]"));
            throw null;
        }
    }

    private static boolean containsBase64Byte(byte[] bArr) {
        for (byte b10 : bArr) {
            if (isBase64(b10)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        byte[] decode;
        if (!isEmpty(bArr)) {
            decode = getDecoder().decode(bArr);
            return decode;
        }
        return bArr;
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    private static byte[] encode(byte[] bArr, int i10, byte[] bArr2, boolean z9) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        if (i10 > 0) {
            return encodeBase64Chunked(bArr, i10, bArr2);
        }
        if (z9) {
            return encodeBase64URLSafe(bArr);
        }
        return encodeBase64(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9, boolean z10, int i10) {
        int i11;
        byte[] bArr2;
        if (isEmpty(bArr)) {
            return bArr;
        }
        if (z9) {
            i11 = CHUNK_SIZE;
        } else {
            i11 = 0;
        }
        if (z9) {
            bArr2 = CHUNK_SEPARATOR;
        } else {
            bArr2 = NetConstants.EMPTY_BTYE_ARRAY;
        }
        long encodeLength = getEncodeLength(bArr, i11, bArr2);
        if (encodeLength <= i10) {
            if (z9) {
                return encodeBase64Chunked(bArr);
            }
            if (z10) {
                return encodeBase64URLSafe(bArr);
            }
            return encodeBase64(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodeLength + ") than the specified maxium size of " + i10);
    }

    private static byte[] encodeBase64Chunked(byte[] bArr, int i10, byte[] bArr2) {
        int intExact = Math.toIntExact(getEncodeLength(bArr, i10, bArr2));
        byte[] bArr3 = new byte[intExact];
        getMimeEncoder(i10, bArr2).encode(bArr, bArr3);
        System.arraycopy(bArr2, 0, bArr3, intExact - bArr2.length, bArr2.length);
        return bArr3;
    }

    public static String encodeBase64String(byte[] bArr) {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        encodeToString = getMimeEncoder().encodeToString(bArr);
        sb.append(encodeToString);
        sb.append(SocketClient.NETASCII_EOL);
        return sb.toString();
    }

    public static String encodeBase64StringUnChunked(byte[] bArr) {
        String encodeToString;
        encodeToString = getEncoder().encodeToString(bArr);
        return encodeToString;
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        Base64.Encoder withoutPadding;
        byte[] encode;
        withoutPadding = getUrlEncoder().withoutPadding();
        encode = withoutPadding.encode(bArr);
        return encode;
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        Base64.Encoder withoutPadding;
        String encodeToString;
        withoutPadding = getUrlEncoder().withoutPadding();
        encodeToString = withoutPadding.encodeToString(bArr);
        return encodeToString;
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    private static Base64.Decoder getDecoder() {
        Base64.Decoder decoder;
        decoder = java.util.Base64.getDecoder();
        return decoder;
    }

    public static long getEncodeLength(byte[] bArr, int i10, byte[] bArr2) {
        boolean z9;
        int i11 = (i10 / 4) * 4;
        long length = (bArr.length * 4) / 3;
        long j10 = length % 4;
        if (j10 != 0) {
            length += 4 - j10;
        }
        if (i11 > 0) {
            long j11 = i11;
            if (length % j11 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long length2 = ((length / j11) * bArr2.length) + length;
            if (!z9) {
                return length2 + bArr2.length;
            }
            return length2;
        }
        return length;
    }

    private static Base64.Encoder getEncoder() {
        Base64.Encoder encoder;
        encoder = java.util.Base64.getEncoder();
        return encoder;
    }

    private static Base64.Encoder getMimeEncoder() {
        Base64.Encoder mimeEncoder;
        mimeEncoder = java.util.Base64.getMimeEncoder();
        return mimeEncoder;
    }

    private static Base64.Encoder getUrlEncoder() {
        Base64.Encoder urlEncoder;
        urlEncoder = java.util.Base64.getUrlEncoder();
        return urlEncoder;
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        for (byte b10 : bArr) {
            if (!isBase64(b10) && !isWhiteSpace(b10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBase64(byte b10) {
        if (b10 != 61) {
            if (b10 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b10 >= bArr.length || bArr[b10] == -1) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    private static boolean isEmpty(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    private static boolean isWhiteSpace(byte b10) {
        if (b10 != 9 && b10 != 10 && b10 != 13 && b10 != 32) {
            return false;
        }
        return true;
    }

    private static String newStringUtf8(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static byte[] toIntegerBytes(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInt");
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = bitLength / 8;
        int i12 = i11 - length;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i12, length);
        return bArr;
    }

    public byte[] decode(byte[] bArr) {
        byte[] decode;
        if (!isEmpty(bArr)) {
            decode = getDecoder().decode(bArr);
            return decode;
        }
        return bArr;
    }

    public String encodeToString(byte[] bArr) {
        return newStringUtf8(encode(bArr));
    }

    public final void finalize() {
        super.finalize();
    }

    public int getLineLength() {
        return this.lineLength;
    }

    public byte[] getLineSeparator() {
        return (byte[]) this.lineSeparator.clone();
    }

    public boolean isUrlSafe() {
        return this.urlSafe;
    }

    private static Base64.Encoder getMimeEncoder(int i10, byte[] bArr) {
        Base64.Encoder mimeEncoder;
        mimeEncoder = java.util.Base64.getMimeEncoder(i10, bArr);
        return mimeEncoder;
    }

    public static byte[] decodeBase64(String str) {
        byte[] decode;
        decode = getDecoder().decode(str);
        return decode;
    }

    public byte[] decode(String str) {
        byte[] decode;
        decode = getDecoder().decode(str);
        return decode;
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64Chunked(bArr, CHUNK_SIZE, CHUNK_SEPARATOR);
    }

    public static String encodeBase64String(byte[] bArr, boolean z9) {
        return newStringUtf8(encodeBase64(bArr, z9));
    }

    public byte[] encode(byte[] bArr) {
        return encode(bArr, this.lineLength, this.lineSeparator, isUrlSafe());
    }

    public Base64(boolean z9) {
        this(CHUNK_SIZE, CHUNK_SEPARATOR, z9);
    }

    public Base64(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base64(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public Base64() {
        this(false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9) {
        return z9 ? encodeBase64Chunked(bArr) : encodeBase64(bArr, false, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9, boolean z10) {
        return encodeBase64(bArr, z9, z10, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        byte[] encode;
        if (isEmpty(bArr)) {
            return bArr;
        }
        encode = getEncoder().encode(bArr);
        return encode;
    }
}
