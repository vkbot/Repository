package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CanReadFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter CANNOT_READ;
    public static final IOFileFilter CAN_READ;
    public static final IOFileFilter READ_ONLY;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
        CanReadFileFilter canReadFileFilter = new CanReadFileFilter();
        CAN_READ = canReadFileFilter;
        CANNOT_READ = canReadFileFilter.negate();
        READ_ONLY = canReadFileFilter.and(CanWriteFileFilter.CANNOT_WRITE);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z9;
        boolean isReadable;
        if (path != null) {
            isReadable = Files.isReadable(path);
            if (isReadable) {
                z9 = true;
                return toFileVisitResult(z9);
            }
        }
        z9 = false;
        return toFileVisitResult(z9);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file != null && file.canRead();
    }
}
