package org.apache.commons.io;

import java.io.File;
import java.io.InputStream;
import java.math.BigInteger;
import org.apache.commons.io.function.IOLongSupplier;
import org.apache.commons.io.function.IOSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements IOSupplier, IOLongSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4817b;
    public final /* synthetic */ File c;

    public /* synthetic */ f(File file, int i10) {
        this.f4817b = i10;
        this.c = file;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        InputStream lambda$readFileToString$14;
        BigInteger lambda$sizeOfDirectoryAsBigInteger$18;
        BigInteger lambda$sizeOfAsBigInteger$16;
        switch (this.f4817b) {
            case 0:
                lambda$readFileToString$14 = FileUtils.lambda$readFileToString$14(this.c);
                return lambda$readFileToString$14;
            case 1:
            default:
                lambda$sizeOfAsBigInteger$16 = FileUtils.lambda$sizeOfAsBigInteger$16(this.c);
                return lambda$sizeOfAsBigInteger$16;
            case 2:
                lambda$sizeOfDirectoryAsBigInteger$18 = FileUtils.lambda$sizeOfDirectoryAsBigInteger$18(this.c);
                return lambda$sizeOfDirectoryAsBigInteger$18;
        }
    }

    @Override // org.apache.commons.io.function.IOLongSupplier
    public long getAsLong() {
        long lambda$sizeOf$15;
        long lambda$sizeOfDirectory$17;
        switch (this.f4817b) {
            case 1:
                lambda$sizeOf$15 = FileUtils.lambda$sizeOf$15(this.c);
                return lambda$sizeOf$15;
            default:
                lambda$sizeOfDirectory$17 = FileUtils.lambda$sizeOfDirectory$17(this.c);
                return lambda$sizeOfDirectory$17;
        }
    }
}
