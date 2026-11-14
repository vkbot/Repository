package org.apache.commons.io.output;

import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class NullAppendable implements Appendable {
    public static final NullAppendable INSTANCE = new NullAppendable();

    private NullAppendable() {
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        IOUtils.checkFromToIndex(charSequence, i10, i11);
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) {
        return this;
    }
}
