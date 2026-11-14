package org.apache.commons.io;

import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4931b;

    public /* synthetic */ v(int i10, Object obj) {
        this.f4930a = i10;
        this.f4931b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        IllegalArgumentException lambda$forName$1;
        switch (this.f4930a) {
            case 0:
                return ((IOUtils.ScratchBytes) this.f4931b).array();
            default:
                lambda$forName$1 = IOCase.lambda$forName$1((String) this.f4931b);
                return lambda$forName$1;
        }
    }
}
