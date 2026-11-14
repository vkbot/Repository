package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX)
/* loaded from: classes2.dex */
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    public static /* bridge */ /* synthetic */ String G(String str, String str2, String str3) {
        return StringsKt__StringsJVMKt.replace$default(str, str2, str3, false, 4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean M(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ String m(char[] cArr, int i10) {
        return StringsKt__StringsJVMKt.concatToString(cArr, i10, 8);
    }

    public static /* bridge */ /* synthetic */ boolean o(CharSequence charSequence, String str) {
        return StringsKt__StringsKt.contains$default(charSequence, (CharSequence) str, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean r(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean s(String str, String str2) {
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }
}
