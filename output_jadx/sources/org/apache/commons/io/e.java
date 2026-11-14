package org.apache.commons.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IOFunction, IOSupplier {
    public static /* synthetic */ void a(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void b(Object obj, String str, Object obj2) {
        throw new FileNotFoundException(str + obj + obj2);
    }

    public static /* synthetic */ void e(String str, long j10, long j11) {
        throw new EOFException(str + j10 + ((Object) " actual: ") + j11);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return Long.valueOf(FileUtils.lastModified((File) obj));
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        String lambda$toString$0;
        lambda$toString$0 = IOUtils.lambda$toString$0();
        return lambda$toString$0;
    }
}
