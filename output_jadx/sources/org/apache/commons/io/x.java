package org.apache.commons.io;

import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f4934b;

    public /* synthetic */ x(Supplier supplier, int i10) {
        this.f4933a = i10;
        this.f4934b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Object[] lambda$static$0;
        Object[] lambda$static$02;
        switch (this.f4933a) {
            case 0:
                ((w) this.f4934b).getClass();
                lambda$static$0 = IOUtils.ScratchBytes.lambda$static$0();
                return lambda$static$0;
            default:
                ((w) this.f4934b).getClass();
                lambda$static$02 = IOUtils.ScratchChars.lambda$static$0();
                return lambda$static$02;
        }
    }
}
