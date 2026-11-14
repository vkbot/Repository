package com.google.protobuf;

import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a(b1 b1Var);

    public final byte[] b() {
        try {
            int a10 = ((y) this).a(null);
            byte[] bArr = new byte[a10];
            Logger logger = n.f1596b;
            k kVar = new k(bArr, 0, a10);
            c(kVar);
            if (kVar.B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void c(n nVar);
}
