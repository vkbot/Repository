package f7;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {
    public static final Pattern c = Pattern.compile("(\\w+)\\s*=\\s*([^\\s#][^#]*)");
    public static final Pattern d = Pattern.compile("\\s*,\\s*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2361b;

    public a(String str, String str2) {
        this.f2360a = str;
        this.f2361b = str2;
    }

    public static Optional a(CharSequence charSequence) {
        Matcher matcher = c.matcher(charSequence);
        if (!matcher.matches()) {
            return Optional.empty();
        }
        return Optional.of(new a(matcher.group(1), matcher.group(2)));
    }
}
