package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.file.PathVisitor;
import org.apache.commons.io.function.IOSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractFileFilter implements IOFileFilter, PathVisitor {
    private final FileVisitResult onAccept;
    private final FileVisitResult onReject;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractFileFilter() {
        /*
            r2 = this;
            java.nio.file.FileVisitResult r0 = kotlin.io.path.a.h()
            java.nio.file.FileVisitResult r1 = kotlin.io.path.a.w()
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.AbstractFileFilter.<init>():void");
    }

    public static FileVisitResult toDefaultFileVisitResult(boolean z9) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        if (z9) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    public void append(List<?> list, StringBuilder sb) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                sb.append(",");
            }
            sb.append(list.get(i10));
        }
    }

    public FileVisitResult get(IOSupplier<FileVisitResult> iOSupplier) {
        try {
            return org.apache.commons.io.file.f.f(iOSupplier.get());
        } catch (IOException e) {
            return handle(e);
        }
    }

    public FileVisitResult handle(Throwable th) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    public boolean isDirectory(File file) {
        if (file != null && file.isDirectory()) {
            return true;
        }
        return false;
    }

    public boolean isFile(File file) {
        if (file != null && file.isFile()) {
            return true;
        }
        return false;
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        return postVisitDirectory2(kotlin.internal.jdk8.a.m(path), iOException);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    public FileVisitResult toFileVisitResult(boolean z9) {
        if (z9) {
            return this.onAccept;
        }
        return this.onReject;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) {
        return visitFileFailed2(kotlin.internal.jdk8.a.m(path), iOException);
    }

    /* renamed from: postVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    /* renamed from: preVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    /* renamed from: visitFile, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    /* renamed from: visitFileFailed, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFileFailed2(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public AbstractFileFilter(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.onAccept = fileVisitResult;
        this.onReject = fileVisitResult2;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    public void append(Object[] objArr, StringBuilder sb) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 > 0) {
                sb.append(",");
            }
            sb.append(objArr[i10]);
        }
    }
}
