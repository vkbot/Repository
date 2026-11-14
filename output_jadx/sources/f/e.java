package f;

import j1.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final FileInputStream f2235b;
    public final Charset c;
    public byte[] d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2236f;

    public e(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(f.f2237a)) {
                this.f2235b = fileInputStream;
                this.c = charset;
                this.d = new byte[8192];
                return;
            }
            i.k("Unsupported encoding");
            throw null;
        }
        throw null;
    }

    public final String b() {
        int i10;
        synchronized (this.f2235b) {
            try {
                byte[] bArr = this.d;
                if (bArr != null) {
                    if (this.e >= this.f2236f) {
                        int read = this.f2235b.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.e = 0;
                            this.f2236f = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i11 = this.e; i11 != this.f2236f; i11++) {
                        byte[] bArr2 = this.d;
                        if (bArr2[i11] == 10) {
                            int i12 = this.e;
                            if (i11 != i12) {
                                i10 = i11 - 1;
                                if (bArr2[i10] == 13) {
                                    String str = new String(bArr2, i12, i10 - i12, this.c.name());
                                    this.e = i11 + 1;
                                    return str;
                                }
                            }
                            i10 = i11;
                            String str2 = new String(bArr2, i12, i10 - i12, this.c.name());
                            this.e = i11 + 1;
                            return str2;
                        }
                    }
                    d dVar = new d(this, (this.f2236f - this.e) + 80);
                    while (true) {
                        byte[] bArr3 = this.d;
                        int i13 = this.e;
                        dVar.write(bArr3, i13, this.f2236f - i13);
                        this.f2236f = -1;
                        FileInputStream fileInputStream = this.f2235b;
                        byte[] bArr4 = this.d;
                        int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.e = 0;
                            this.f2236f = read2;
                            for (int i14 = 0; i14 != this.f2236f; i14++) {
                                byte[] bArr5 = this.d;
                                if (bArr5[i14] == 10) {
                                    int i15 = this.e;
                                    if (i14 != i15) {
                                        dVar.write(bArr5, i15, i14 - i15);
                                    }
                                    this.e = i14 + 1;
                                    return dVar.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2235b) {
            try {
                if (this.d != null) {
                    this.d = null;
                    this.f2235b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
