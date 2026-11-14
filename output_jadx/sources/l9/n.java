package l9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface n extends g0, ReadableByteChannel {
    String D(Charset charset);

    o J();

    String L();

    int P(w wVar);

    boolean Q(long j10, o oVar);

    void Y(long j10);

    l a();

    long a0();

    InputStream b0();

    boolean d(long j10);

    o f(long j10);

    byte[] j();

    boolean k();

    long o();

    String p(long j10);

    a0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    void t(l lVar, long j10);
}
