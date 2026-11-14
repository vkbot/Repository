package e4;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f2199f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.navigation.c f2200g;

    public x(p pVar, int i10) {
        super(pVar);
        this.e = R.drawable.design_password_eye;
        this.f2200g = new androidx.navigation.c(9, this);
        if (i10 != 0) {
            this.e = i10;
        }
    }

    @Override // e4.q
    public final void b() {
        p();
    }

    @Override // e4.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // e4.q
    public final int d() {
        return this.e;
    }

    @Override // e4.q
    public final View.OnClickListener f() {
        return this.f2200g;
    }

    @Override // e4.q
    public final boolean j() {
        return true;
    }

    @Override // e4.q
    public final boolean k() {
        boolean z9;
        EditText editText = this.f2199f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }

    @Override // e4.q
    public final void l(EditText editText) {
        this.f2199f = editText;
        p();
    }

    @Override // e4.q
    public final void q() {
        EditText editText = this.f2199f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2199f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // e4.q
    public final void r() {
        EditText editText = this.f2199f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
