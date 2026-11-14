package q;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d0 extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f5124b;

    public d0(ByteBuffer byteBuffer) {
        this.f5124b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f5124b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f5124b;
        if (j10 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j10);
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
