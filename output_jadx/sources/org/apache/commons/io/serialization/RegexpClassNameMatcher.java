package org.apache.commons.io.serialization;

import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class RegexpClassNameMatcher implements ClassNameMatcher {
    private final Pattern pattern;

    public RegexpClassNameMatcher(Pattern pattern) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }

    public RegexpClassNameMatcher(String str) {
        this(Pattern.compile(str));
    }
}
