package org.apache.commons.io.input;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.commons.io.EndianUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class SwappedDataInputStream extends ProxyInputStream implements DataInput {
    public SwappedDataInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        if (readByte() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return (byte) ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return EndianUtils.readSwappedDouble(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return EndianUtils.readSwappedFloat(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            int read = read(bArr, (i10 + i11) - i12, i12);
            if (-1 != read) {
                i12 -= read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.io.DataInput
    public int readInt() {
        return EndianUtils.readSwappedInteger(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw UnsupportedOperationExceptions.method("readLine");
    }

    @Override // java.io.DataInput
    public long readLong() {
        return EndianUtils.readSwappedLong(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public short readShort() {
        return EndianUtils.readSwappedShort(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readUTF() {
        throw UnsupportedOperationExceptions.method("readUTF");
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return EndianUtils.readSwappedUnsignedShort(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) {
        return (int) ((FilterInputStream) this).in.skip(i10);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }
}
