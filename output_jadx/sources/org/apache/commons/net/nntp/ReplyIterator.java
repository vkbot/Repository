package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import n0.b;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.io.DotTerminatedMessageReader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class ReplyIterator implements Iterator<String>, Iterable<String> {
    private String line;
    private final BufferedReader reader;
    private Exception savedException;

    public ReplyIterator(BufferedReader bufferedReader, boolean z9) {
        bufferedReader = z9 ? new DotTerminatedMessageReader(bufferedReader) : bufferedReader;
        this.reader = bufferedReader;
        String readLine = bufferedReader.readLine();
        this.line = readLine;
        if (readLine == null) {
            IOUtils.closeQuietly((Reader) bufferedReader);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Exception exc = this.savedException;
        if (exc == null) {
            if (this.line != null) {
                return true;
            }
            return false;
        }
        throw new NoSuchElementException(exc.toString());
    }

    @Override // java.util.Iterator
    public String next() {
        Exception exc = this.savedException;
        if (exc == null) {
            String str = this.line;
            if (str != null) {
                try {
                    String readLine = this.reader.readLine();
                    this.line = readLine;
                    if (readLine == null) {
                        IOUtils.closeQuietly((Reader) this.reader);
                        return str;
                    }
                    return str;
                } catch (IOException e) {
                    this.savedException = e;
                    IOUtils.closeQuietly((Reader) this.reader);
                    return str;
                }
            }
            b.x();
            return null;
        }
        throw new NoSuchElementException(exc.toString());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public ReplyIterator(BufferedReader bufferedReader) {
        this(bufferedReader, true);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this;
    }
}
