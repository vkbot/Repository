package r7;

import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f5432a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f5433b = new String[64];
    public static final String[] c = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = c;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f5433b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = ai.onnxruntime.a.p(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f5433b;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i15]);
            sb.append('|');
            strArr3[i16 | 8] = ai.onnxruntime.a.p(sb, strArr3[i14], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f5433b;
            if (i10 < strArr4.length) {
                if (strArr4[i10] == null) {
                    strArr4[i10] = c[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z9, int i10, int i11, byte b10, byte b11) {
        String format;
        String str;
        String str2;
        String str3;
        if (b10 < 10) {
            format = f5432a[b10];
        } else {
            format = String.format("0x%02x", Byte.valueOf(b10));
        }
        if (b11 == 0) {
            str = "";
        } else {
            String[] strArr = c;
            if (b10 != 2 && b10 != 3) {
                if (b10 != 4 && b10 != 6) {
                    if (b10 != 7 && b10 != 8) {
                        if (b11 < 64) {
                            str2 = f5433b[b11];
                        } else {
                            str2 = strArr[b11];
                        }
                        if (b10 == 5 && (b11 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        } else if (b10 == 0 && (b11 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (b11 == 1) {
                    str = "ACK";
                } else {
                    str = strArr[b11];
                }
            }
            str = strArr[b11];
        }
        Locale locale = Locale.US;
        if (z9) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return String.format(locale, "%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), format, str);
    }
}
