package org.apache.commons.io.output;

import java.io.Writer;
import java.util.Collection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TeeWriter extends ProxyCollectionWriter {
    public TeeWriter(Collection<Writer> collection) {
        super(collection);
    }

    public TeeWriter(Writer... writerArr) {
        super(writerArr);
    }
}
