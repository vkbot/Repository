package org.apache.commons.io.filefilter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class PathMatcherFileFilter extends AbstractFileFilter {
    private final PathMatcher pathMatcher;

    public PathMatcherFileFilter(PathMatcher pathMatcher) {
        Objects.requireNonNull(pathMatcher, "pathMatcher");
        this.pathMatcher = f.f(pathMatcher);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (file != null) {
            path = file.toPath();
            if (matches(path)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public boolean matches(Path path) {
        boolean matches;
        matches = this.pathMatcher.matches(path);
        return matches;
    }
}
