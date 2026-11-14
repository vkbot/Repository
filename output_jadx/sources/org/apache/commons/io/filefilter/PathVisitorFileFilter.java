package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.file.NoopPathVisitor;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.PathVisitor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class PathVisitorFileFilter extends AbstractFileFilter {
    private final PathVisitor pathVisitor;

    public PathVisitorFileFilter(PathVisitor pathVisitor) {
        this.pathVisitor = pathVisitor == null ? NoopPathVisitor.INSTANCE : pathVisitor;
    }

    public static /* synthetic */ FileVisitResult a(PathVisitorFileFilter pathVisitorFileFilter, Path path, BasicFileAttributes basicFileAttributes) {
        return pathVisitorFileFilter.lambda$accept$0(path, basicFileAttributes);
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            return this.pathVisitor.postVisitDirectory(path, null);
        }
        return visitFile2(path, basicFileAttributes);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        FileVisitResult fileVisitResult;
        Path path;
        BasicFileAttributes basicFileAttributes;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            if (file.exists()) {
                basicFileAttributes = PathUtils.readBasicFileAttributes(path);
            } else {
                basicFileAttributes = null;
            }
            FileVisitResult visitFile2 = visitFile2(path, basicFileAttributes);
            fileVisitResult2 = FileVisitResult.CONTINUE;
            if (visitFile2 != fileVisitResult2) {
                return false;
            }
            return true;
        } catch (IOException e) {
            FileVisitResult handle = handle(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            if (handle != fileVisitResult) {
                return false;
            }
            return true;
        }
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    /* renamed from: visitFile */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) {
        return this.pathVisitor.visitFile(path, basicFileAttributes);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FileVisitResult fileVisitResult;
        Path path;
        Path resolve;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            resolve = path.resolve(str);
            FileVisitResult accept = accept(resolve, PathUtils.readBasicFileAttributes(resolve));
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return accept == fileVisitResult2;
        } catch (IOException e) {
            FileVisitResult handle = handle(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            return handle == fileVisitResult;
        }
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new androidx.transition.a(this, path, basicFileAttributes, 5));
    }
}
