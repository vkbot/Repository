package org.apache.commons.io.output;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface UncheckedAppendable extends Appendable {
    static UncheckedAppendable on(Appendable appendable) {
        return new UncheckedAppendableImpl(appendable);
    }

    @Override // java.lang.Appendable
    UncheckedAppendable append(char c);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence, int i10, int i11);
}
