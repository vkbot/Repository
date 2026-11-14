package org.apache.commons.io.file;

import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class DirectoryStreamFilter implements DirectoryStream.Filter<Path> {
    private final PathFilter pathFilter;

    public DirectoryStreamFilter(PathFilter pathFilter) {
        Objects.requireNonNull(pathFilter, "pathFilter");
        this.pathFilter = pathFilter;
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public boolean accept2(Path path) {
        FileVisitResult fileVisitResult;
        FileVisitResult accept = this.pathFilter.accept(path, PathUtils.readBasicFileAttributes(path, PathUtils.EMPTY_LINK_OPTION_ARRAY));
        fileVisitResult = FileVisitResult.CONTINUE;
        if (accept == fileVisitResult) {
            return true;
        }
        return false;
    }

    public PathFilter getPathFilter() {
        return this.pathFilter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public /* bridge */ /* synthetic */ boolean accept(Path path) {
        return accept2(kotlin.internal.jdk8.a.m(path));
    }
}
