package a5;

import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f38b;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f38b += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f38b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f38b++;
    }
}
