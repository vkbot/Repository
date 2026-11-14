package e4;

import android.text.Editable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends s3.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2147b;

    public m(p pVar) {
        this.f2147b = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2147b.b().a();
    }

    @Override // s3.k, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f2147b.b().b();
    }
}
