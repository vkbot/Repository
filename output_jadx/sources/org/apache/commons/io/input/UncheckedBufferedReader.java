package org.apache.commons.io.input;

import java.io.BufferedReader;
import java.nio.CharBuffer;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.Uncheck;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class UncheckedBufferedReader extends BufferedReader {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedBufferedReader, Builder> {
        public /* synthetic */ UncheckedBufferedReader lambda$get$0() {
            return new UncheckedBufferedReader(this);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedBufferedReader get() {
            return (UncheckedBufferedReader) Uncheck.get(new androidx.fragment.app.h(25, this));
        }
    }

    private UncheckedBufferedReader(Builder builder) {
        super(builder.getReader(), builder.getBufferSize());
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

    public /* synthetic */ String lambda$readLine$6() {
        return super.readLine();
    }

    public /* synthetic */ boolean lambda$ready$7() {
        return super.ready();
    }

    public /* synthetic */ void lambda$reset$8() {
        super.reset();
    }

    public /* synthetic */ Long lambda$skip$9(long j10) {
        return Long.valueOf(super.skip(j10));
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Uncheck.run(new n(this, 1));
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void mark(int i10) {
        Uncheck.accept(new m(this, 0), i10);
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        return ((Integer) Uncheck.apply(new l(this, 3), cArr, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        return (String) Uncheck.get(new l(this, 1));
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public boolean ready() {
        return Uncheck.getAsBoolean(new l(this, 6));
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void reset() {
        Uncheck.run(new n(this, 0));
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public long skip(long j10) {
        return ((Long) Uncheck.apply(new l(this, 4), Long.valueOf(j10))).longValue();
    }

    public /* synthetic */ UncheckedBufferedReader(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return ((Integer) Uncheck.apply(new l(this, 0), cArr)).intValue();
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() {
        return Uncheck.getAsInt(new l(this, 5));
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        return ((Integer) Uncheck.apply(new l(this, 2), charBuffer)).intValue();
    }
}
