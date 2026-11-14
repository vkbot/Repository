package org.apache.commons.io.output;

import i7.k;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.i;
import org.apache.commons.io.input.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FilterCollectionWriter extends Writer {
    protected final Collection<Writer> EMPTY_WRITERS;
    protected final Collection<Writer> writers;

    public FilterCollectionWriter(Writer... writerArr) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : list;
    }

    private FilterCollectionWriter forAllWriters(IOConsumer<Writer> iOConsumer) {
        IOConsumer.forAll(iOConsumer, writers());
        return this;
    }

    private Stream<Writer> writers() {
        return this.writers.stream().filter(new k(5));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return forAllWriters(new j(4, charSequence));
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        forAllWriters(new org.apache.commons.io.input.h(2));
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        forAllWriters(new org.apache.commons.io.input.h(3));
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        forAllWriters(new j(5, cArr));
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        forAllWriters(new i(cArr, i10, i11, 2));
    }

    @Override // java.io.Writer
    public void write(int i10) {
        forAllWriters(new org.apache.commons.io.input.g(i10, 1));
    }

    @Override // java.io.Writer
    public void write(String str) {
        forAllWriters(new j(3, str));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final char c) {
        return forAllWriters(new IOConsumer() { // from class: org.apache.commons.io.output.b
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).append(c);
            }
        });
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        forAllWriters(new i(str, i10, i11, 3));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        return forAllWriters(new i(charSequence, i10, i11, 1));
    }

    public FilterCollectionWriter(Collection<Writer> collection) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = collection == null ? list : collection;
    }
}
