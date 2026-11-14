package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.Writer;
import l9.i;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ChunkedWriter extends FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 8192;
    private final int chunkSize;

    public ChunkedWriter(Writer writer, int i10) {
        super(writer);
        if (i10 > 0) {
            this.chunkSize = i10;
        } else {
            i.a();
            throw null;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(cArr, i10, i11);
        while (i11 > 0) {
            int min = Math.min(i11, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i10, min);
            i11 -= min;
            i10 += min;
        }
    }

    public ChunkedWriter(Writer writer) {
        this(writer, 8192);
    }
}
