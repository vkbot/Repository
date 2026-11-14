package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.function.Supplier;
import org.apache.commons.io.function.Erase;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class BrokenWriter extends Writer {
    public static final BrokenWriter INSTANCE = new BrokenWriter();
    private final Supplier<Throwable> exceptionSupplier;

    public BrokenWriter() {
        this(new androidx.emoji2.text.flatbuffer.a(7));
    }

    public static /* synthetic */ Throwable lambda$new$0() {
        return new IOException("Broken writer");
    }

    private RuntimeException rethrow() {
        return Erase.rethrow(this.exceptionSupplier.get());
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw rethrow();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        throw rethrow();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        throw rethrow();
    }

    @Deprecated
    public BrokenWriter(IOException iOException) {
        this(new org.apache.commons.io.input.c(iOException, 2));
    }

    public BrokenWriter(Supplier<Throwable> supplier) {
        this.exceptionSupplier = supplier;
    }

    public BrokenWriter(Throwable th) {
        this(new org.apache.commons.io.input.b(2, th));
    }

    public static /* synthetic */ Throwable lambda$new$1(IOException iOException) {
        return iOException;
    }

    public static /* synthetic */ Throwable lambda$new$2(Throwable th) {
        return th;
    }
}
