package v;

import b7.s;
import h.h;
import j.d0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import q.a0;
import u.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements a {
    public static final c c = new c(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5909b;

    public /* synthetic */ c(int i10) {
        this.f5909b = i10;
    }

    @Override // v.a
    public final d0 a(d0 d0Var, h hVar) {
        s sVar;
        byte[] bArr;
        switch (this.f5909b) {
            case 0:
                return d0Var;
            default:
                ByteBuffer asReadOnlyBuffer = ((f) ((u.b) d0Var.get()).f5835b.f5351b).f5848a.d.asReadOnlyBuffer();
                AtomicReference atomicReference = c0.b.f428a;
                if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
                    sVar = new s(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                } else {
                    sVar = null;
                }
                if (sVar != null && sVar.f421a == 0 && sVar.f422b == sVar.c.length) {
                    bArr = asReadOnlyBuffer.array();
                } else {
                    ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                    asReadOnlyBuffer2.get(bArr2);
                    bArr = bArr2;
                }
                return new a0(bArr);
        }
    }
}
