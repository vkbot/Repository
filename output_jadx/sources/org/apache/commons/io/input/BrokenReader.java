package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Supplier;
import org.apache.commons.io.function.Erase;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class BrokenReader extends Reader {
    public static final BrokenReader INSTANCE = new BrokenReader();
    private final Supplier<Throwable> exceptionSupplier;

    public BrokenReader() {
        this(new androidx.emoji2.text.flatbuffer.a(5));
    }

    public static /* synthetic */ Throwable lambda$new$0() {
        return new IOException("Broken reader");
    }

    private RuntimeException rethrow() {
        return Erase.rethrow(this.exceptionSupplier.get());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw rethrow();
    }

    @Override // java.io.Reader
    public void mark(int i10) {
        throw rethrow();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        throw rethrow();
    }

    @Override // java.io.Reader
    public boolean ready() {
        throw rethrow();
    }

    @Override // java.io.Reader
    public void reset() {
        throw rethrow();
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        throw rethrow();
    }

    @Deprecated
    public BrokenReader(IOException iOException) {
        this(new c(iOException, 1));
    }

    public BrokenReader(Supplier<Throwable> supplier) {
        this.exceptionSupplier = supplier;
    }

    public BrokenReader(Throwable th) {
        this(new b(1, th));
    }

    public static /* synthetic */ Throwable lambda$new$1(IOException iOException) {
        return iOException;
    }

    public static /* synthetic */ Throwable lambda$new$2(Throwable th) {
        return th;
    }
}
