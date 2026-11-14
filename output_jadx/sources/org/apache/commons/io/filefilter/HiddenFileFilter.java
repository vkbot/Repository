package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class HiddenFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter HIDDEN;
    public static final IOFileFilter VISIBLE;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
        HiddenFileFilter hiddenFileFilter = new HiddenFileFilter();
        HIDDEN = hiddenFileFilter;
        VISIBLE = hiddenFileFilter.negate();
    }

    public static /* synthetic */ FileVisitResult a(HiddenFileFilter hiddenFileFilter, Path path) {
        return hiddenFileFilter.lambda$accept$0(path);
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        boolean z9;
        boolean isHidden;
        if (path != null) {
            isHidden = Files.isHidden(path);
            if (!isHidden) {
                z9 = false;
                return toFileVisitResult(z9);
            }
        }
        z9 = true;
        return toFileVisitResult(z9);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && !file.isHidden()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new f5.f(16, this, path));
    }
}
