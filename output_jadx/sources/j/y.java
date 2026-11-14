package j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f3084b;
    public boolean c = true;

    public y(Appendable appendable) {
        this.f3084b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z9 = this.c;
        Appendable appendable = this.f3084b;
        boolean z10 = false;
        if (z9) {
            this.c = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z10 = true;
        }
        this.c = z10;
        appendable.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        boolean z9 = this.c;
        Appendable appendable = this.f3084b;
        if (z9) {
            this.c = false;
            appendable.append("  ");
        }
        this.c = c == '\n';
        appendable.append(c);
        return this;
    }
}
