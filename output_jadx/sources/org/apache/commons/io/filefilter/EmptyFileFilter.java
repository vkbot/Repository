package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter EMPTY;
    public static final IOFileFilter NOT_EMPTY;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        EMPTY = emptyFileFilter;
        NOT_EMPTY = emptyFileFilter.negate();
    }

    public static /* synthetic */ FileVisitResult a(EmptyFileFilter emptyFileFilter, Path path) {
        return emptyFileFilter.lambda$accept$0(path);
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        boolean isDirectory;
        long size;
        Stream list;
        boolean z9 = false;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            list = Files.list(path);
            try {
                FileVisitResult fileVisitResult = toFileVisitResult(!list.findFirst().isPresent());
                list.close();
                return fileVisitResult;
            } catch (Throwable th) {
                if (list != null) {
                    try {
                        list.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        size = Files.size(path);
        if (size == 0) {
            z9 = true;
        }
        return toFileVisitResult(z9);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            if (IOUtils.length(file.listFiles()) == 0) {
                return true;
            }
            return false;
        }
        if (file.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (path == null) {
            return toFileVisitResult(true);
        }
        return get(new f5.f(15, this, path));
    }
}
