package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.Reader;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractCharacterFilterReader extends FilterReader {
    protected static final IntPredicate SKIP_NONE = new Object();
    private final IntPredicate skip;

    public AbstractCharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader);
        this.skip = intPredicate == null ? SKIP_NONE : intPredicate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i10) {
        return false;
    }

    public boolean filter(int i10) {
        return this.skip.test(i10);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        int read = super.read(cArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        int i12 = i10 - 1;
        for (int i13 = i10; i13 < i10 + read; i13++) {
            if (!filter(cArr[i13]) && (i12 = i12 + 1) < i13) {
                cArr[i12] = cArr[i13];
            }
        }
        return (i12 - i10) + 1;
    }

    public AbstractCharacterFilterReader(Reader reader) {
        this(reader, SKIP_NONE);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
        int read;
        do {
            read = ((FilterReader) this).in.read();
            if (read == -1) {
                break;
            }
        } while (filter(read));
        return read;
    }
}
