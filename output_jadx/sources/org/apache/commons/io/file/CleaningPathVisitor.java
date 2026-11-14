package org.apache.commons.io.file;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CleaningPathVisitor extends CountingPathVisitor {
    private final boolean overrideReadOnly;
    private final String[] skip;

    public CleaningPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2;
        if (strArr != null) {
            strArr2 = (String[]) strArr.clone();
        } else {
            strArr2 = CountingPathVisitor.EMPTY_STRING_ARRAY;
        }
        Arrays.sort(strArr2);
        this.skip = strArr2;
        this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
    }

    private boolean accept(Path path) {
        if (Arrays.binarySearch(this.skip, PathUtils.getFileNameString(path)) < 0) {
            return true;
        }
        return false;
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CleaningPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static CountingPathVisitor withLongCounters() {
        return new CleaningPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CleaningPathVisitor cleaningPathVisitor = (CleaningPathVisitor) obj;
        if (this.overrideReadOnly == cleaningPathVisitor.overrideReadOnly && Arrays.equals(this.skip, cleaningPathVisitor.skip)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.overrideReadOnly)) + (((super.hashCode() * 31) + Arrays.hashCode(this.skip)) * 31);
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
        FileVisitResult fileVisitResult;
        LinkOption linkOption;
        boolean exists;
        LinkOption linkOption2;
        if (accept(path)) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path, linkOption);
            if (exists) {
                if (this.overrideReadOnly) {
                    linkOption2 = LinkOption.NOFOLLOW_LINKS;
                    PathUtils.setReadOnly(path, false, linkOption2);
                }
                Files.deleteIfExists(path);
            }
        }
        updateFileCounters(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    public CleaningPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }
}
