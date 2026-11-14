package org.apache.commons.io;

import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4932a;

    public /* synthetic */ w(int i10) {
        this.f4932a = i10;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f4932a) {
            case 0:
                return IOUtils.ScratchBytes.b();
            default:
                return IOUtils.ScratchChars.b();
        }
    }
}
