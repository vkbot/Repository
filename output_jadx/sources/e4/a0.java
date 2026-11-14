package e4;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2116a;

    public a0(TextInputLayout textInputLayout) {
        this.f2116a = textInputLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence;
        boolean z9;
        String str;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TextInputLayout textInputLayout = this.f2116a;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.f1480w0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        y yVar = textInputLayout.c;
        View view2 = yVar.c;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(view2);
            accessibilityNodeInfoCompat.setTraversalAfter(view2);
        } else {
            accessibilityNodeInfoCompat.setTraversalAfter(yVar.e);
        }
        if (!isEmpty) {
            accessibilityNodeInfoCompat.setText(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            accessibilityNodeInfoCompat.setText(str);
            if (!z10 && placeholderText != null) {
                accessibilityNodeInfoCompat.setText(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfoCompat.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfoCompat.setHintText(str);
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                accessibilityNodeInfoCompat.setText(str);
            }
            accessibilityNodeInfoCompat.setShowingHintText(isEmpty);
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
        if (z9) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfoCompat.setError(error);
        }
        View view3 = textInputLayout.f1460l.f2190y;
        if (view3 != null) {
            accessibilityNodeInfoCompat.setLabelFor(view3);
        }
        textInputLayout.d.b().m(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f2116a.d.b().n(accessibilityEvent);
    }
}
