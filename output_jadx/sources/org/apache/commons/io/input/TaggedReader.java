package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TaggedReader extends ProxyReader {
    private final Serializable tag;

    public TaggedReader(Reader reader) {
        super(reader);
        this.tag = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.ProxyReader
    public void handleIOException(IOException iOException) {
        throw new TaggedIOException(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        return TaggedIOException.isTaggedWith(th, this.tag);
    }

    public void throwIfCauseOf(Throwable th) {
        TaggedIOException.throwCauseIfTaggedWith(th, this.tag);
    }
}
