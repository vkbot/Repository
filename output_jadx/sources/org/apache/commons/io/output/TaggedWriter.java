package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TaggedWriter extends ProxyWriter {
    private final Serializable tag;

    public TaggedWriter(Writer writer) {
        super(writer);
        this.tag = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.output.ProxyWriter
    public void handleIOException(IOException iOException) {
        throw new TaggedIOException(iOException, this.tag);
    }

    public boolean isCauseOf(Exception exc) {
        return TaggedIOException.isTaggedWith(exc, this.tag);
    }

    public void throwIfCauseOf(Exception exc) {
        TaggedIOException.throwCauseIfTaggedWith(exc, this.tag);
    }
}
