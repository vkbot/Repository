package org.apache.commons.io;

import java.io.File;
import java.time.Instant;
import org.apache.commons.io.function.IOBooleanSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements IOBooleanSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4924b;
    public final /* synthetic */ File c;
    public final /* synthetic */ Instant d;

    public /* synthetic */ q(File file, Instant instant, int i10) {
        this.f4924b = i10;
        this.c = file;
        this.d = instant;
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public final boolean getAsBoolean() {
        switch (this.f4924b) {
            case 0:
                return FileUtils.lambda$isFileOlder$6(this.c, this.d);
            default:
                return FileUtils.lambda$isFileNewer$3(this.c, this.d);
        }
    }
}
