package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.file.PathUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes2.dex */
public class WildcardFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.wildcards = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
    }

    public static /* synthetic */ boolean lambda$accept$0(File file, String str) {
        return FilenameUtils.wildcardMatch(file.getName(), str);
    }

    public static /* synthetic */ boolean lambda$accept$2(Path path, String str) {
        return FilenameUtils.wildcardMatch(PathUtils.getFileNameString(path), str);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        FileVisitResult fileVisitResult;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        return AbstractFileFilter.toDefaultFileVisitResult(Stream.of((Object[]) this.wildcards).anyMatch(new i7.c(4, path)));
    }

    public WildcardFilter(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.wildcards = new String[]{str};
    }

    public WildcardFilter(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.wildcards = (String[]) strArr.clone();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            return Stream.of((Object[]) this.wildcards).anyMatch(new i7.c(3, str));
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (isDirectory(file)) {
            return false;
        }
        return Stream.of((Object[]) this.wildcards).anyMatch(new c(file, 2));
    }
}
