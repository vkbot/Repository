package k0;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            String str = spanned.toString().substring(0, i12) + charSequence.toString().substring(i10, i11) + spanned.toString().substring(i13);
            if (!str.isEmpty()) {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0 && parseInt <= 11) {
                    return null;
                }
                return "";
            }
            return null;
        } catch (Exception unused) {
            return "";
        }
    }
}
