package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TeeReader extends ProxyReader {
    private final Writer branch;
    private final boolean closeBranch;

    public TeeReader(Reader reader, Writer writer, boolean z9) {
        super(reader);
        this.branch = writer;
        this.closeBranch = z9;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } finally {
            if (this.closeBranch) {
                this.branch.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        int position = charBuffer.position();
        int read = super.read(charBuffer);
        if (read != -1) {
            int position2 = charBuffer.position();
            int limit = charBuffer.limit();
            try {
                charBuffer.position(position).limit(position2);
                this.branch.append((CharSequence) charBuffer);
                return read;
            } finally {
                charBuffer.position(position2).limit(limit);
            }
        }
        return read;
    }

    public TeeReader(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader
    public int read(char[] cArr) {
        int read = super.read(cArr);
        if (read != -1) {
            this.branch.write(cArr, 0, read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        int read = super.read(cArr, i10, i11);
        if (read != -1) {
            this.branch.write(cArr, i10, read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read() {
        int read = super.read();
        if (read != -1) {
            this.branch.write(read);
        }
        return read;
    }
}
