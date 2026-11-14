package org.apache.commons.io.output;

import java.io.OutputStream;
import java.lang.Appendable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class AppendableOutputStream<T extends Appendable> extends OutputStream {
    private final T appendable;

    public AppendableOutputStream(T t) {
        this.appendable = t;
    }

    public T getAppendable() {
        return this.appendable;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.appendable.append((char) i10);
    }
}
