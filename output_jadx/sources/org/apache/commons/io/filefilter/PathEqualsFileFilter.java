package org.apache.commons.io.filefilter;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class PathEqualsFileFilter extends AbstractFileFilter {
    private final Path path;

    public PathEqualsFileFilter(Path path) {
        this.path = path;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        Path path2 = this.path;
        path = file.toPath();
        return Objects.equals(path2, path);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(Objects.equals(this.path, path));
    }
}
