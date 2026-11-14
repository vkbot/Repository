package org.apache.commons.io.output;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ClosedInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractByteArrayOutputStream<T extends AbstractByteArrayOutputStream<T>> extends OutputStream {
    static final int DEFAULT_SIZE = 1024;
    protected int count;
    private byte[] currentBuffer;
    private int filledBufferSum;
    private final List<byte[]> buffers = new ArrayList();
    private int currentBufferIndex = -1;
    private boolean reuseBuffers = true;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @FunctionalInterface
    /* loaded from: classes2.dex */
    public interface InputStreamConstructor<T extends InputStream> {
        T construct(byte[] bArr, int i10, int i11);
    }

    public void needNewBuffer(int i10) {
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i11 = this.currentBufferIndex + 1;
            this.currentBufferIndex = i11;
            this.currentBuffer = this.buffers.get(i11);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            if (i10 <= 0) {
                i10 = 1024;
            }
            this.filledBufferSum = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        byte[] byteArray = IOUtils.byteArray(i10);
        this.currentBuffer = byteArray;
        this.buffers.add(byteArray);
    }

    public abstract void reset();

    public void resetImpl() {
        this.count = 0;
        this.filledBufferSum = 0;
        this.currentBufferIndex = 0;
        if (this.reuseBuffers) {
            this.currentBuffer = this.buffers.get(0);
            return;
        }
        this.currentBuffer = null;
        int length = this.buffers.get(0).length;
        this.buffers.clear();
        needNewBuffer(length);
        this.reuseBuffers = true;
    }

    public abstract int size();

    public abstract byte[] toByteArray();

    public byte[] toByteArrayImpl() {
        int i10 = this.count;
        if (i10 == 0) {
            return IOUtils.EMPTY_BYTE_ARRAY;
        }
        byte[] byteArray = IOUtils.byteArray(i10);
        int i11 = 0;
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i10);
            System.arraycopy(bArr, 0, byteArray, i11, min);
            i11 += min;
            i10 -= min;
            if (i10 == 0) {
                break;
            }
        }
        return byteArray;
    }

    public abstract InputStream toInputStream();

    public <T extends InputStream> InputStream toInputStream(InputStreamConstructor<T> inputStreamConstructor) {
        int i10 = this.count;
        if (i10 == 0) {
            return ClosedInputStream.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(this.buffers.size());
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i10);
            arrayList.add(inputStreamConstructor.construct(bArr, 0, min));
            i10 -= min;
            if (i10 == 0) {
                break;
            }
        }
        this.reuseBuffers = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public abstract int write(InputStream inputStream);

    public T write(CharSequence charSequence, Charset charset) {
        write(charSequence.toString().getBytes(Charsets.toCharset(charset)));
        return asThis();
    }

    @Override // java.io.OutputStream
    public abstract void write(int i10);

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i10, int i11);

    public int writeImpl(InputStream inputStream) {
        int i10 = this.count - this.filledBufferSum;
        byte[] bArr = this.currentBuffer;
        int read = inputStream.read(bArr, i10, bArr.length - i10);
        int i11 = 0;
        while (read != -1) {
            i11 += read;
            i10 += read;
            this.count += read;
            byte[] bArr2 = this.currentBuffer;
            if (i10 == bArr2.length) {
                needNewBuffer(bArr2.length);
                i10 = 0;
            }
            byte[] bArr3 = this.currentBuffer;
            read = inputStream.read(bArr3, i10, bArr3.length - i10);
        }
        return i11;
    }

    public abstract void writeTo(OutputStream outputStream);

    public void writeToImpl(OutputStream outputStream) {
        int i10 = this.count;
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i10);
            outputStream.write(bArr, 0, min);
            i10 -= min;
            if (i10 == 0) {
                return;
            }
        }
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void writeImpl(byte[] bArr, int i10, int i11) {
        int i12 = this.count;
        int i13 = i12 + i11;
        int i14 = i12 - this.filledBufferSum;
        int i15 = i11;
        while (i15 > 0) {
            int min = Math.min(i15, this.currentBuffer.length - i14);
            System.arraycopy(bArr, (i10 + i11) - i15, this.currentBuffer, i14, min);
            i15 -= min;
            if (i15 > 0) {
                needNewBuffer(i13);
                i14 = 0;
            }
        }
        this.count = i13;
    }

    public void writeImpl(int i10) {
        int i11 = this.count;
        int i12 = i11 - this.filledBufferSum;
        if (i12 == this.currentBuffer.length) {
            needNewBuffer(i11 + 1);
            i12 = 0;
        }
        this.currentBuffer[i12] = (byte) i10;
        this.count++;
    }

    public T asThis() {
        return this;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
