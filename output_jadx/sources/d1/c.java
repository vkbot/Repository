package d1;

import com.google.protobuf.q;
import e0.m;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static final int e = a(m.h(new byte[]{110, 83, 25, 24}, new byte[]{47, 6, 77, 80, -104, 72, -67, -65}));

    /* renamed from: f, reason: collision with root package name */
    public static final int f1717f = a(m.h(new byte[]{-98, 37, -42, -50}, new byte[]{-35, 105, -123, -117, 57, -7, 70, -107}));

    /* renamed from: g, reason: collision with root package name */
    public static final int f1718g = a(m.h(new byte[]{-50, 42, 81, 6}, new byte[]{-115, 100, 9, 72, 92, -59, -120, -109}));

    /* renamed from: h, reason: collision with root package name */
    public static final int f1719h = a(m.h(new byte[]{-36, -4, 83, 53}, new byte[]{-109, -73, 18, 108, -104, -38, 44, -8}));

    /* renamed from: i, reason: collision with root package name */
    public static final int f1720i = a(m.h(new byte[]{18, 0, -108, 35}, new byte[]{93, 80, -47, 109, -112, 70, 35, -61}));

    /* renamed from: j, reason: collision with root package name */
    public static final int f1721j = a(m.h(new byte[]{32, 44, -81, 113}, new byte[]{119, 126, -5, 52, 69, 59, 101, 23}));

    /* renamed from: a, reason: collision with root package name */
    public final int f1722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1723b;
    public final int c;
    public final byte[] d;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f1722a = i10;
        this.f1723b = i11;
        this.c = i12;
        this.d = bArr;
    }

    public static int a(String str) {
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    public static c b(InputStream inputStream) {
        ByteBuffer order = ByteBuffer.wrap(c(inputStream, 24)).order(ByteOrder.LITTLE_ENDIAN);
        int i10 = order.getInt();
        int i11 = order.getInt();
        int i12 = order.getInt();
        int i13 = order.getInt();
        int i14 = order.getInt();
        int i15 = order.getInt();
        if (i13 >= 0 && i13 <= 16777216) {
            if (i15 == (~i10)) {
                byte[] c = c(inputStream, i13);
                int i16 = 0;
                for (byte b10 : c) {
                    i16 += b10 & UByte.MAX_VALUE;
                }
                if (i16 == i14) {
                    return new c(i10, i11, i12, c);
                }
                n0.b.A(m.h(new byte[]{88, 5, 72, -99, 43, 16, 91, -58, 88, 33, 73, -91, -37, 120, 49, -89, 54, 75, 36, -60, 121, 121, 11, -89, 54, 75, 34, -60, 119, 120, 54, -89, 54, 75, 32, 53, 42, 41, 90, -12, 88, 39, 73, -87, 42, 35, -85, 54, -52, -39, -76, -59, 68, 120, 59, -89, 50, 75, 44, -60, 121, 120, 59}, new byte[]{-120, -101, -103, 21, -5, -88, -117, 119}));
                return null;
            }
            n0.b.A(m.h(new byte[]{89, -51, 31, 43, 103, 9, 38, -37, 88, -48, 30, 30, 103, 6, 38, -33, 88, -46, 31, 35, 102, 56, 38, -36, -87, 17, -117, -36, -102, 99, 73, -75, 57, ByteCompanionObject.MIN_VALUE, 117, 78, 2, 98, 116}, new byte[]{-119, 80, -49, -98, -73, -77, -10, 101}));
            return null;
        }
        n0.b.A(q.j(new byte[]{-90, -37, -29, -89, Base64.padSymbol, -25, -24, 91, -89, -58, -30, -110, Base64.padSymbol, -24, -24, 95, -89, -60, -29, -81, 60, -42, -24, 92, 86, -105, -77, -62, 93, -115, -113, 53, -54, -106, -122, -61, 109, 125, 121, -95, 52, 107, -29, -83, Base64.padSymbol, -19, -24, 95, -90, -13, -30, -112, Base64.padSymbol, -19, 2, -59}, new byte[]{118, 70, 51, 18, -19, 93, 56, -27}, new StringBuilder(), i13));
        return null;
    }

    public static byte[] c(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new EOFException(m.h(new byte[]{-81, 30, 72, 21, -64, 23, -62, -63, 62, -17, -38, -116, -63, 46, -62, -62, 62, -17, -38, -123, -63, 46, -62, -54, -50, -118, -67, -24, -95, 70, -88, -82, 110, -117, -127, -23, -109, 70, -84}, new byte[]{-18, 90, 10, 56, 17, -106, 18, ByteCompanionObject.MAX_VALUE}));
            }
        }
        return bArr;
    }

    public static void d(OutputStream outputStream, int i10, int i11, int i12, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        ByteBuffer order = ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(bArr.length);
        int i13 = 0;
        for (byte b10 : bArr) {
            i13 += b10 & UByte.MAX_VALUE;
        }
        order.putInt(i13);
        order.putInt(~i10);
        outputStream.write(order.array());
        outputStream.write(bArr);
        outputStream.flush();
    }
}
