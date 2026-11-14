package e0;

import android.text.Editable;
import android.text.TextWatcher;
import com.example.navistart.MainActivity;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a1 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1885b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(int i10, Object obj) {
        this.f1885b = i10;
        this.c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        switch (this.f1885b) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.c;
                if (!"".equals(mainActivity.Q0.getEditText().getText().toString())) {
                    i10 = Integer.parseInt(mainActivity.Q0.getEditText().getText().toString());
                } else {
                    i10 = 0;
                }
                h0.b.o().saveInt(m.h(new byte[]{80, 107, -71, 63, 14, 35, 108, 109, 101, 111, -81, 2, 32, 33, 74, 120}, new byte[]{0, 10, -53, 84, 65, 77, 63, 29}), i10);
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f1885b;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        int i13 = this.f1885b;
        Object obj = this.c;
        switch (i13) {
            case 0:
                return;
            case 1:
                m0.v vVar = (m0.v) obj;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                String str = m0.v.f3873h;
                vVar.v(charSequence2);
                return;
            case 2:
                m0.n3 n3Var = (m0.n3) obj;
                n3Var.f3811l = charSequence.toString().trim().toLowerCase(Locale.ROOT);
                n3Var.u();
                return;
            case 3:
                ((w0.o0) obj).f6216a = charSequence.toString();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void f(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void g(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void h(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void i(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private final void j(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
