package o7;

import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s2 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f4695b;

    public s2(t2 t2Var) {
        this.f4695b = t2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f4695b.f(bArr, i10, i11);
    }
}
