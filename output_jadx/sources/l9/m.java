package l9;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface m extends e0, WritableByteChannel {
    m A(String str);

    long G(g0 g0Var);

    m H(long j10);

    m Z(long j10);

    l a();

    @Override // l9.e0, java.io.Flushable
    void flush();

    m g();

    m n();

    m w(o oVar);

    m write(byte[] bArr);

    m write(byte[] bArr, int i10, int i11);

    m writeByte(int i10);

    m writeInt(int i10);

    m writeShort(int i10);
}
