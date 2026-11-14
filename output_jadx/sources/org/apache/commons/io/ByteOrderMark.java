package org.apache.commons.io;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ByteOrderMark implements Serializable {
    public static final char UTF_BOM = 65279;
    private static final long serialVersionUID = 1;
    private final int[] bytes;
    private final String charsetName;
    public static final ByteOrderMark UTF_8 = new ByteOrderMark(StandardCharsets.UTF_8.name(), TelnetCommand.EOR, 187, 191);
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark(StandardCharsets.UTF_16BE.name(), TelnetCommand.DONT, 255);
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark(StandardCharsets.UTF_16LE.name(), 255, TelnetCommand.DONT);
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0, 0, TelnetCommand.DONT, 255);
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", 255, TelnetCommand.DONT, 0, 0);

    public ByteOrderMark(String str, int... iArr) {
        Objects.requireNonNull(str, "charsetName");
        Objects.requireNonNull(iArr, "bytes");
        if (!str.isEmpty()) {
            if (iArr.length != 0) {
                this.charsetName = str;
                this.bytes = (int[]) iArr.clone();
                return;
            } else {
                j1.i.k("No bytes specified");
                throw null;
            }
        }
        j1.i.k("No charsetName specified");
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        ByteOrderMark byteOrderMark = (ByteOrderMark) obj;
        if (this.bytes.length != byteOrderMark.length()) {
            return false;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i10 < iArr.length) {
                if (iArr[i10] != byteOrderMark.get(i10)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public int get(int i10) {
        return this.bytes[i10];
    }

    public byte[] getBytes() {
        byte[] byteArray = IOUtils.byteArray(this.bytes.length);
        int i10 = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i10 < iArr.length) {
                byteArray[i10] = (byte) iArr[i10];
                i10++;
            } else {
                return byteArray;
            }
        }
    }

    public String getCharsetName() {
        return this.charsetName;
    }

    public int[] getRawBytes() {
        return this.bytes;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode();
        for (int i10 : this.bytes) {
            hashCode += i10;
        }
        return hashCode;
    }

    public int length() {
        return this.bytes.length;
    }

    public boolean matches(int[] iArr) {
        int length;
        int[] iArr2 = this.bytes;
        if (iArr2 == iArr) {
            return true;
        }
        if (iArr == null || iArr.length < (length = iArr2.length)) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (this.bytes[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.charsetName);
        sb.append(": ");
        for (int i10 = 0; i10 < this.bytes.length; i10++) {
            if (i10 > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.bytes[i10] & 255).toUpperCase(Locale.ROOT));
        }
        sb.append(']');
        return sb.toString();
    }
}
