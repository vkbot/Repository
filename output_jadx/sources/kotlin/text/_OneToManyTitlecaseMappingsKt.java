package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char c) {
        String valueOf = String.valueOf(c);
        valueOf.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(locale);
            lowerCase.getClass();
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
