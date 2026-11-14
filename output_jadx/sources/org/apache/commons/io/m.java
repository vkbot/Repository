package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.function.IOBooleanSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements IOBooleanSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4910b;
    public final /* synthetic */ File c;
    public final /* synthetic */ File d;

    public /* synthetic */ m(File file, File file2, int i10) {
        this.f4910b = i10;
        this.c = file;
        this.d = file2;
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public final boolean getAsBoolean() {
        switch (this.f4910b) {
            case 0:
                return FileUtils.r(this.c, this.d);
            default:
                return FileUtils.q(this.c, this.d);
        }
    }
}
