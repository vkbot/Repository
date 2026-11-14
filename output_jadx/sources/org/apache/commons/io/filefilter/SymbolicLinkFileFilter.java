package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class SymbolicLinkFileFilter extends AbstractFileFilter implements Serializable {
    public static final SymbolicLinkFileFilter INSTANCE = new SymbolicLinkFileFilter();
    private static final long serialVersionUID = 1;

    public SymbolicLinkFileFilter() {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        path = file.toPath();
        return isSymbolicLink(path);
    }

    public boolean isSymbolicLink(Path path) {
        boolean isSymbolicLink;
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    public SymbolicLinkFileFilter(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        super(fileVisitResult, fileVisitResult2);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(isSymbolicLink(path));
    }
}
