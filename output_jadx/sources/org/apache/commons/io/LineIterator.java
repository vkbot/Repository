package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class LineIterator implements Iterator<String>, Closeable {
    private final BufferedReader bufferedReader;
    private String cachedLine;
    private boolean finished;

    public LineIterator(Reader reader) {
        Objects.requireNonNull(reader, "reader");
        if (reader instanceof BufferedReader) {
            this.bufferedReader = (BufferedReader) reader;
        } else {
            this.bufferedReader = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void closeQuietly(LineIterator lineIterator) {
        IOUtils.closeQuietly(lineIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.finished = true;
        this.cachedLine = null;
        IOUtils.close(this.bufferedReader);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.cachedLine != null) {
            return true;
        }
        if (this.finished) {
            return false;
        }
        do {
            try {
                readLine = this.bufferedReader.readLine();
                if (readLine == null) {
                    this.finished = true;
                    return false;
                }
            } catch (IOException e) {
                IOUtils.closeQuietly(this, new t(e, 1));
                throw new IllegalStateException(e);
            }
        } while (!isValidLine(readLine));
        this.cachedLine = readLine;
        return true;
    }

    public boolean isValidLine(String str) {
        return true;
    }

    @Deprecated
    public String nextLine() {
        if (hasNext()) {
            String str = this.cachedLine;
            this.cachedLine = null;
            return str;
        }
        j1.i.g("No more lines");
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }

    @Override // java.util.Iterator
    public String next() {
        return nextLine();
    }
}
