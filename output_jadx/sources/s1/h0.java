package s1;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5500b;
    public final /* synthetic */ i0 c;

    public /* synthetic */ h0(i0 i0Var, int i10) {
        this.f5500b = i10;
        this.c = i0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f5500b;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f5500b;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        String charSequence3;
        switch (this.f5500b) {
            case 0:
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                this.c.a(charSequence2);
                return;
            default:
                if (charSequence == null) {
                    charSequence3 = "";
                } else {
                    charSequence3 = charSequence.toString();
                }
                this.c.a(charSequence3);
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void d(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
