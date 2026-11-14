package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class DeletingPathVisitor extends CountingPathVisitor {
    private final LinkOption[] linkOptions;
    private final boolean overrideReadOnly;
    private final String[] skip;

    public DeletingPathVisitor(Counters.PathCounters pathCounters, LinkOption[] linkOptionArr, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2;
        LinkOption[] linkOptionArr2;
        if (strArr != null) {
            strArr2 = (String[]) strArr.clone();
        } else {
            strArr2 = CountingPathVisitor.EMPTY_STRING_ARRAY;
        }
        Arrays.sort(strArr2);
        this.skip = strArr2;
        this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
        if (linkOptionArr == null) {
            linkOptionArr2 = PathUtils.noFollowLinkOptionArray();
        } else {
            linkOptionArr2 = (LinkOption[]) linkOptionArr.clone();
        }
        this.linkOptions = linkOptionArr2;
    }

    private boolean accept(Path path) {
        if (Arrays.binarySearch(this.skip, PathUtils.getFileNameString(path)) < 0) {
            return true;
        }
        return false;
    }

    public static DeletingPathVisitor withBigIntegerCounters() {
        return new DeletingPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static DeletingPathVisitor withLongCounters() {
        return new DeletingPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DeletingPathVisitor deletingPathVisitor = (DeletingPathVisitor) obj;
        if (this.overrideReadOnly == deletingPathVisitor.overrideReadOnly && Arrays.equals(this.skip, deletingPathVisitor.skip)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.overrideReadOnly)) + (((super.hashCode() * 31) + Arrays.hashCode(this.skip)) * 31);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* renamed from: postVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) {
        if (PathUtils.isEmptyDirectory(path)) {
            Files.deleteIfExists(path);
        }
        return super.postVisitDirectory2(path, iOException);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* renamed from: preVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        super.preVisitDirectory(path, basicFileAttributes);
        if (accept(path)) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* renamed from: visitFile, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) {
        if (accept(path)) {
            if (Files.exists(path, this.linkOptions)) {
                if (this.overrideReadOnly) {
                    PathUtils.setReadOnly(path, false, this.linkOptions);
                }
                Files.deleteIfExists(path);
            }
            if (Files.isSymbolicLink(path)) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        updateFileCounters(path, basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        return postVisitDirectory2(kotlin.internal.jdk8.a.m(path), iOException);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        this(pathCounters, PathUtils.noFollowLinkOptionArray(), deleteOptionArr, strArr);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }
}
