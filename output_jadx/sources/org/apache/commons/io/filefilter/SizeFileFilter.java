package org.apache.commons.io.filefilter;

import j1.i;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j10, boolean z9) {
        if (j10 >= 0) {
            this.size = j10;
            this.acceptLarger = z9;
        } else {
            i.k("The size must be non-negative");
            throw null;
        }
    }

    public static /* synthetic */ FileVisitResult a(SizeFileFilter sizeFileFilter, Path path) {
        return sizeFileFilter.lambda$accept$0(path);
    }

    private boolean accept(long j10) {
        boolean z9;
        boolean z10 = this.acceptLarger;
        if (j10 < this.size) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z10 == z9) {
            return false;
        }
        return true;
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        long size;
        size = Files.size(path);
        return toFileVisitResult(accept(size));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str;
        if (this.acceptLarger) {
            str = ">=";
        } else {
            str = "<";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        sb.append(str);
        return ai.onnxruntime.a.n(sb, this.size, ")");
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    /* renamed from: visitFile */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) {
        long size;
        size = Files.size(path);
        return toFileVisitResult(accept(size));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return visitFile2(kotlin.internal.jdk8.a.m(path), basicFileAttributes);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file != null ? file.length() : 0L);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new f5.f(17, this, path));
    }

    public SizeFileFilter(long j10) {
        this(j10, true);
    }
}
