package org.apache.commons.io;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.io.output.CloseShieldOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class HexDump {

    @Deprecated
    public static final String EOL = System.lineSeparator();
    private static final char[] HEX_CODES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] SHIFTS = {28, 24, 20, 16, 12, 8, 4, 0};

    public static void dump(byte[] bArr, long j10, Appendable appendable, int i10, int i11) {
        int i12;
        Objects.requireNonNull(appendable, "appendable");
        if (i10 >= 0 && i10 < bArr.length) {
            long j11 = j10 + i10;
            StringBuilder sb = new StringBuilder(74);
            if (i11 >= 0 && (i12 = i10 + i11) <= bArr.length) {
                while (i10 < i12) {
                    int i13 = i12 - i10;
                    if (i13 > 16) {
                        i13 = 16;
                    }
                    dump(sb, j11).append(' ');
                    for (int i14 = 0; i14 < 16; i14++) {
                        if (i14 < i13) {
                            dump(sb, bArr[i14 + i10]);
                        } else {
                            sb.append("  ");
                        }
                        sb.append(' ');
                    }
                    for (int i15 = 0; i15 < i13; i15++) {
                        byte b10 = bArr[i15 + i10];
                        if (b10 >= 32 && b10 < Byte.MAX_VALUE) {
                            sb.append((char) b10);
                        } else {
                            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                        }
                    }
                    sb.append(System.lineSeparator());
                    appendable.append(sb);
                    sb.setLength(0);
                    j11 += i13;
                    i10 += 16;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
        StringBuilder q8 = ai.onnxruntime.a.q(i10, "illegal index: ", " into array of length ");
        q8.append(bArr.length);
        throw new ArrayIndexOutOfBoundsException(q8.toString());
    }

    public static void dump(byte[] bArr, Appendable appendable) {
        dump(bArr, 0L, appendable, 0, bArr.length);
    }

    public static void dump(byte[] bArr, long j10, OutputStream outputStream, int i10) {
        Objects.requireNonNull(outputStream, "stream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(CloseShieldOutputStream.wrap(outputStream), Charset.defaultCharset());
        try {
            dump(bArr, j10, outputStreamWriter, i10, bArr.length - i10);
            outputStreamWriter.close();
        } finally {
        }
    }

    private static StringBuilder dump(StringBuilder sb, byte b10) {
        for (int i10 = 0; i10 < 2; i10++) {
            sb.append(HEX_CODES[(b10 >> SHIFTS[i10 + 6]) & 15]);
        }
        return sb;
    }

    private static StringBuilder dump(StringBuilder sb, long j10) {
        for (int i10 = 0; i10 < 8; i10++) {
            sb.append(HEX_CODES[((int) (j10 >> SHIFTS[i10])) & 15]);
        }
        return sb;
    }
}
