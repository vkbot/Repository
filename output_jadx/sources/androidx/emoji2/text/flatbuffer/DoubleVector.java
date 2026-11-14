package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 8, byteBuffer);
        return this;
    }

    public double get(int i10) {
        return this.bb.getDouble(__element(i10));
    }
}
