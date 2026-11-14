package kotlin.text.jdk8;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.text", xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes2.dex */
public final class RegexExtensionsJDK8Kt {
    @SinceKotlin(version = "1.2")
    public static final MatchGroup get(MatchGroupCollection matchGroupCollection, String str) {
        MatchNamedGroupCollection matchNamedGroupCollection;
        matchGroupCollection.getClass();
        str.getClass();
        if (matchGroupCollection instanceof MatchNamedGroupCollection) {
            matchNamedGroupCollection = (MatchNamedGroupCollection) matchGroupCollection;
        } else {
            matchNamedGroupCollection = null;
        }
        if (matchNamedGroupCollection != null) {
            return matchNamedGroupCollection.get(str);
        }
        b.g("Retrieving groups by name is not supported on this platform.");
        return null;
    }
}
