package e4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public int f2208b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ TextInputLayout d;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.d = textInputLayout;
        this.c = editText;
        this.f2208b = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.d;
        textInputLayout.w(!textInputLayout.C0, false);
        if (textInputLayout.f1462m) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1476u) {
            textInputLayout.x(editable);
        }
        EditText editText = this.c;
        int lineCount = editText.getLineCount();
        int i10 = this.f2208b;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.f1479v0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f2208b = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
