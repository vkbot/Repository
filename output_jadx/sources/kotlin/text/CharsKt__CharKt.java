package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", "other", "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes2.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i10, int i11) {
        if (2 <= i11 && i11 < 37) {
            if (i10 >= 0 && i10 < i11) {
                if (i10 < 10) {
                    return (char) (i10 + 48);
                }
                return (char) (((char) (i10 + 65)) - '\n');
            }
            j1.i.k(ai.onnxruntime.a.g(i10, "Digit ", " does not represent a valid digit in radix ", i11));
            return (char) 0;
        }
        j1.i.k(ai.onnxruntime.a.f(i11, "Invalid radix: ", ". Valid radix values are in range 2..36"));
        return (char) 0;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c, int i10) {
        Integer digitToIntOrNull = digitToIntOrNull(c, i10);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i10);
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c, int i10) {
        CharsKt__CharJVMKt.checkRadix(i10);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c, i10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c, char c10, boolean z9) {
        if (c == c10) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c10);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean equals$default(char c, char c10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return equals(c, c10, z9);
    }

    public static final boolean isSurrogate(char c) {
        if (55296 > c || c >= 57344) {
            return false;
        }
        return true;
    }

    @InlineOnly
    private static final String plus(char c, String str) {
        str.getClass();
        return c + str;
    }

    @SinceKotlin(version = "1.5")
    public static final String titlecase(char c) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i10) {
        if (i10 >= 0 && i10 < 10) {
            return (char) (i10 + 48);
        }
        j1.i.k(ai.onnxruntime.a.f(i10, "Int ", " is not a decimal digit"));
        return (char) 0;
    }
}
