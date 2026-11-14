package org.apache.commons.net.io;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;
import n0.b;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    private int length;
    static final boolean NO_CONVERSION_REQUIRED = System.lineSeparator().equals(SocketClient.NETASCII_EOL);
    static final byte[] LINE_SEPARATOR_BYTES = System.lineSeparator().getBytes(StandardCharsets.US_ASCII);

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, LINE_SEPARATOR_BYTES.length + 1);
    }

    public static boolean isConversionRequired() {
        return !NO_CONVERSION_REQUIRED;
    }

    private int readInt() {
        int read = super.read();
        if (read == 13) {
            int read2 = super.read();
            if (read2 != 10) {
                if (read2 != -1) {
                    unread(read2);
                }
                return 13;
            }
            unread(LINE_SEPARATOR_BYTES);
            this.length--;
            return super.read();
        }
        return read;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((PushbackInputStream) this).in != null) {
            return ((PushbackInputStream) this).in.available() + (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos);
        }
        b.A("Stream closed");
        return 0;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (NO_CONVERSION_REQUIRED) {
            return super.read(bArr, i10, i11);
        }
        if (i11 < 1) {
            return 0;
        }
        int min = Math.min(i11, available());
        this.length = min;
        if (min < 1) {
            this.length = 1;
        }
        int readInt = readInt();
        if (readInt == -1) {
            return -1;
        }
        int i13 = i10;
        while (true) {
            i12 = i13 + 1;
            bArr[i13] = (byte) readInt;
            int i14 = this.length - 1;
            this.length = i14;
            if (i14 <= 0 || (readInt = readInt()) == -1) {
                break;
            }
            i13 = i12;
        }
        return i12 - i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (NO_CONVERSION_REQUIRED) {
            return super.read();
        }
        return readInt();
    }
}
