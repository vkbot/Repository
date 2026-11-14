package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FalseFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter FALSE;
    public static final IOFileFilter INSTANCE;
    private static final String TO_STRING = Boolean.FALSE.toString();
    private static final long serialVersionUID = 6210271677940926200L;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        FALSE = falseFileFilter;
        INSTANCE = falseFileFilter;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public IOFileFilter and(IOFileFilter iOFileFilter) {
        return INSTANCE;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public IOFileFilter negate() {
        return TrueFileFilter.INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public IOFileFilter or(IOFileFilter iOFileFilter) {
        return iOFileFilter;
    }
}
