package org.apache.commons.io.serialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FullClassNameMatcher implements ClassNameMatcher {
    private final Set<String> classesSet;

    public FullClassNameMatcher(String... strArr) {
        this.classesSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.classesSet.contains(str);
    }
}
