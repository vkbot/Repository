package org.apache.commons.io.input;

import java.io.FilterReader;
import java.nio.CharBuffer;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.Uncheck;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class UncheckedFilterReader extends FilterReader {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterReader, Builder> {
        public /* synthetic */ UncheckedFilterReader lambda$get$0() {
            return new UncheckedFilterReader(this);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterReader get() {
            return (UncheckedFilterReader) Uncheck.get(new androidx.fragment.app.h(27, this));
        }
    }

    private UncheckedFilterReader(Builder builder) {
        super(builder.getReader());
    }

    public static Builder builder() {
        return new Builder();
    }

    public /* synthetic */ void lambda$close$0() {
        super.close();
    }

    public /* synthetic */ void lambda$mark$1(int i10) {
        super.mark(i10);
    }

    public /* synthetic */ int lambda$read$2() {
        return super.read();
    }

    public /* synthetic */ Integer lambda$read$3(char[] cArr) {
        return Integer.valueOf(super.read(cArr));
    }

    public /* synthetic */ Integer lambda$read$4(char[] cArr, int i10, int i11) {
        return Integer.valueOf(super.read(cArr, i10, i11));
    }

    public /* synthetic */ Integer lambda$read$5(CharBuffer charBuffer) {
        return Integer.valueOf(super.read(charBuffer));
    }

    public /* synthetic */ boolean lambda$ready$6() {
        return super.ready();
    }

    public /* synthetic */ void lambda$reset$7() {
        super.reset();
    }

    public /* synthetic */ Long lambda$skip$8(long j10) {
        return Long.valueOf(super.skip(j10));
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Uncheck.run(new r(this, 0));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void mark(int i10) {
        Uncheck.accept(new m(this, 1), i10);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        return ((Integer) Uncheck.apply(new q(this, 1), cArr, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() {
        return Uncheck.getAsBoolean(new q(this, 4));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void reset() {
        Uncheck.run(new r(this, 1));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j10) {
        return ((Long) Uncheck.apply(new q(this, 5), Long.valueOf(j10))).longValue();
    }

    public /* synthetic */ UncheckedFilterReader(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return ((Integer) Uncheck.apply(new q(this, 3), cArr)).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
        return Uncheck.getAsInt(new q(this, 0));
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        return ((Integer) Uncheck.apply(new q(this, 2), charBuffer)).intValue();
    }
}
