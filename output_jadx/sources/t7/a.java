package t7;

import com.google.protobuf.k;
import com.google.protobuf.n;
import com.google.protobuf.x0;
import j1.i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import n7.d0;
import y5.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends InputStream implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public g f5827b;
    public final x0 c;
    public ByteArrayInputStream d;

    public a(g gVar, x0 x0Var) {
        this.f5827b = gVar;
        this.c = x0Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        g gVar = this.f5827b;
        if (gVar != null) {
            return gVar.a(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        g gVar = this.f5827b;
        if (gVar != null) {
            int a10 = gVar.a(null);
            if (a10 == 0) {
                this.f5827b = null;
                this.d = null;
                return -1;
            }
            if (i11 >= a10) {
                Logger logger = n.f1596b;
                k kVar = new k(bArr, i10, a10);
                this.f5827b.c(kVar);
                if (kVar.B() == 0) {
                    this.f5827b = null;
                    this.d = null;
                    return a10;
                }
                i.l("Did not write as much data as expected.");
                return 0;
            }
            this.d = new ByteArrayInputStream(this.f5827b.b());
            this.f5827b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.d;
        if (byteArrayInputStream == null) {
            return -1;
        }
        return byteArrayInputStream.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f5827b != null) {
            this.d = new ByteArrayInputStream(this.f5827b.b());
            this.f5827b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
