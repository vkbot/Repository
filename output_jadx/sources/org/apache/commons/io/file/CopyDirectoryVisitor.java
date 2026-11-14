package org.apache.commons.io.file;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CopyDirectoryVisitor extends CountingPathVisitor {
    private final CopyOption[] copyOptions;
    private final Path sourceDirectory;
    private final Path targetDirectory;

    public CopyDirectoryVisitor(Counters.PathCounters pathCounters, Path path, Path path2, CopyOption... copyOptionArr) {
        super(pathCounters);
        this.sourceDirectory = path;
        this.targetDirectory = path2;
        this.copyOptions = toCopyOption(copyOptionArr);
    }

    private Path resolveRelativeAsString(Path path) {
        Path relativize;
        Path path2 = this.targetDirectory;
        relativize = this.sourceDirectory.relativize(path);
        return PathUtils.resolve(path2, relativize);
    }

    private static CopyOption[] toCopyOption(CopyOption... copyOptionArr) {
        if (copyOptionArr == null) {
            return PathUtils.EMPTY_COPY_OPTIONS;
        }
        return (CopyOption[]) copyOptionArr.clone();
    }

    public void copy(Path path, Path path2) {
        Files.copy(path, path2, this.copyOptions);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CopyDirectoryVisitor copyDirectoryVisitor = (CopyDirectoryVisitor) obj;
        if (Arrays.equals(this.copyOptions, copyDirectoryVisitor.copyOptions) && Objects.equals(this.sourceDirectory, copyDirectoryVisitor.sourceDirectory) && Objects.equals(this.targetDirectory, copyDirectoryVisitor.targetDirectory)) {
            return true;
        }
        return false;
    }

    public CopyOption[] getCopyOptions() {
        return (CopyOption[]) this.copyOptions.clone();
    }

    public Path getSourceDirectory() {
        return this.sourceDirectory;
    }

    public Path getTargetDirectory() {
        return this.targetDirectory;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return Objects.hash(this.sourceDirectory, this.targetDirectory) + (((super.hashCode() * 31) + Arrays.hashCode(this.copyOptions)) * 31);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* renamed from: preVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) {
        boolean notExists;
        Path resolveRelativeAsString = resolveRelativeAsString(path);
        notExists = Files.notExists(resolveRelativeAsString, new LinkOption[0]);
        if (notExists) {
            Files.createDirectory(resolveRelativeAsString, new FileAttribute[0]);
        }
        return super.preVisitDirectory(path, basicFileAttributes);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* renamed from: visitFile, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Path resolveRelativeAsString = resolveRelativeAsString(path);
        if (accept(path, basicFileAttributes)) {
            copy(path, resolveRelativeAsString);
            updateFileCounters(resolveRelativeAsString, basicFileAttributes);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public CopyDirectoryVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2, Path path, Path path2, CopyOption... copyOptionArr) {
        super(pathCounters, pathFilter, pathFilter2);
        this.sourceDirectory = path;
        this.targetDirectory = path2;
        this.copyOptions = toCopyOption(copyOptionArr);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }
}
