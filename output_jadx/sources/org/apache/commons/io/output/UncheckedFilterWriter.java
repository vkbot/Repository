package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.Writer;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.Uncheck;
import org.apache.commons.io.input.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class UncheckedFilterWriter extends FilterWriter {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterWriter, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterWriter get() {
            return new UncheckedFilterWriter(this);
        }
    }

    private UncheckedFilterWriter(Builder builder) {
        super(builder.getWriter());
    }

    public static Builder builder() {
        return new Builder();
    }

    public /* synthetic */ Writer lambda$append$0(char c) {
        return super.append(c);
    }

    public /* synthetic */ Writer lambda$append$1(CharSequence charSequence) {
        return super.append(charSequence);
    }

    public /* synthetic */ Writer lambda$append$2(CharSequence charSequence, int i10, int i11) {
        return super.append(charSequence, i10, i11);
    }

    public /* synthetic */ void lambda$close$3() {
        super.close();
    }

    public /* synthetic */ void lambda$flush$4() {
        super.flush();
    }

    public /* synthetic */ void lambda$write$5(char[] cArr) {
        super.write(cArr);
    }

    public /* synthetic */ void lambda$write$6(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
    }

    public /* synthetic */ void lambda$write$7(int i10) {
        super.write(i10);
    }

    public /* synthetic */ void lambda$write$8(String str) {
        super.write(str);
    }

    public /* synthetic */ void lambda$write$9(String str, int i10, int i11) {
        super.write(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        return (Writer) Uncheck.apply(new e(this, 4), charSequence, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Uncheck.run(new f(this, 1));
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        Uncheck.run(new f(this, 0));
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        Uncheck.accept(new e(this, 3), cArr, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public /* synthetic */ UncheckedFilterWriter(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        Uncheck.accept(new g(this, 0), cArr);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i10) {
        Uncheck.accept(new m(this, 3), i10);
    }

    @Override // java.io.Writer
    public void write(String str) {
        Uncheck.accept(new g(this, 1), str);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        Uncheck.accept(new e(this, 2), str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        return (Writer) Uncheck.apply(new e(this, 1), Character.valueOf(c));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return (Writer) Uncheck.apply(new e(this, 0), charSequence);
    }
}
