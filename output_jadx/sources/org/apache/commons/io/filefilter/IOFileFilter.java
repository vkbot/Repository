package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.file.PathFilter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface IOFileFilter extends FileFilter, FilenameFilter, PathFilter, PathMatcher {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    default FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z9;
        File file;
        if (path != null) {
            file = path.toFile();
            if (accept(file)) {
                z9 = true;
                return AbstractFileFilter.toDefaultFileVisitResult(z9);
            }
        }
        z9 = false;
        return AbstractFileFilter.toDefaultFileVisitResult(z9);
    }

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    default IOFileFilter and(IOFileFilter iOFileFilter) {
        return new AndFileFilter(this, iOFileFilter);
    }

    @Override // java.nio.file.PathMatcher
    default boolean matches(Path path) {
        FileVisitResult fileVisitResult;
        FileVisitResult accept = accept(path, (BasicFileAttributes) null);
        fileVisitResult = FileVisitResult.TERMINATE;
        if (accept != fileVisitResult) {
            return true;
        }
        return false;
    }

    default IOFileFilter negate() {
        return new NotFileFilter(this);
    }

    default IOFileFilter or(IOFileFilter iOFileFilter) {
        return new OrFileFilter(this, iOFileFilter);
    }
}
