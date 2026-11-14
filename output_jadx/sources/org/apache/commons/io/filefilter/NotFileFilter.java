package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class NotFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final IOFileFilter filter;

    public NotFileFilter(IOFileFilter iOFileFilter) {
        Objects.requireNonNull(iOFileFilter, "filter");
        this.filter = iOFileFilter;
    }

    private FileVisitResult not(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        FileVisitResult fileVisitResult4;
        fileVisitResult2 = FileVisitResult.CONTINUE;
        if (fileVisitResult == fileVisitResult2) {
            fileVisitResult4 = FileVisitResult.TERMINATE;
            return fileVisitResult4;
        }
        fileVisitResult3 = FileVisitResult.CONTINUE;
        return fileVisitResult3;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return "NOT (" + this.filter.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }
}
