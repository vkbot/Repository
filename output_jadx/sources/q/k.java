package q;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements m, h.f, com.bumptech.glide.load.data.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5136b;
    public final ByteBuffer c;

    public k(int i10) {
        this.f5136b = i10;
        switch (i10) {
            case 2:
                this.c = ByteBuffer.allocate(4);
                return;
            default:
                this.c = ByteBuffer.allocate(8);
                return;
        }
    }

    @Override // h.f
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f5136b) {
            case 1:
                Long l10 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.c) {
                    this.c.position(0);
                    messageDigest.update(this.c.putLong(l10.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    messageDigest.update(bArr);
                    synchronized (this.c) {
                        this.c.position(0);
                        messageDigest.update(this.c.putInt(num.intValue()).array());
                    }
                    return;
                }
                return;
        }
    }

    @Override // q.m
    public int c() {
        return (e() << 8) | e();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object d() {
        ByteBuffer byteBuffer = this.c;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // q.m
    public short e() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & UByte.MAX_VALUE);
        }
        throw new l();
    }

    @Override // q.m
    public int read(byte[] bArr, int i10) {
        ByteBuffer byteBuffer = this.c;
        int min = Math.min(i10, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // q.m
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.c;
        int min = (int) Math.min(byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }

    public k(ByteBuffer byteBuffer, int i10) {
        this.f5136b = i10;
        switch (i10) {
            case 3:
                this.c = byteBuffer;
                return;
            default:
                this.c = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
        }
    }
}
