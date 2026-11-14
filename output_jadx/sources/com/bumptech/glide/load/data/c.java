package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final FileOutputStream f649b;
    public byte[] c;
    public final k.g d;
    public int e;

    public c(FileOutputStream fileOutputStream, k.g gVar) {
        this.f649b = fileOutputStream;
        this.d = gVar;
        this.c = (byte[]) gVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f649b;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.c;
            if (bArr != null) {
                this.d.g(bArr);
                this.c = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.e;
        FileOutputStream fileOutputStream = this.f649b;
        if (i10 > 0) {
            fileOutputStream.write(this.c, 0, i10);
            this.e = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.e;
            FileOutputStream fileOutputStream = this.f649b;
            if (i15 == 0 && i13 >= this.c.length) {
                fileOutputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.c.length - i15);
            System.arraycopy(bArr, i14, this.c, this.e, min);
            int i16 = this.e + min;
            this.e = i16;
            i12 += min;
            byte[] bArr2 = this.c;
            if (i16 == bArr2.length && i16 > 0) {
                fileOutputStream.write(bArr2, 0, i16);
                this.e = 0;
            }
        } while (i12 < i11);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.c;
        int i11 = this.e;
        int i12 = i11 + 1;
        this.e = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f649b.write(bArr, 0, i12);
        this.e = 0;
    }
}
