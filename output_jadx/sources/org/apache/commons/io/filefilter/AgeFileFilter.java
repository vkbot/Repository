package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.file.PathUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final Instant cutoffInstant;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AgeFileFilter(long r1) {
        /*
            r0 = this;
            java.time.Instant r1 = org.apache.commons.io.file.f.p(r1)
            r2 = 1
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.AgeFileFilter.<init>(long):void");
    }

    public static /* synthetic */ FileVisitResult a(AgeFileFilter ageFileFilter, Path path) {
        return ageFileFilter.lambda$accept$0(path);
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        boolean z9 = false;
        if (this.acceptOlder != PathUtils.isNewer(path, this.cutoffInstant, new LinkOption[0])) {
            z9 = true;
        }
        return toFileVisitResult(z9);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (this.acceptOlder != FileUtils.isFileNewer(file, this.cutoffInstant)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str;
        if (this.acceptOlder) {
            str = "<=";
        } else {
            str = ">";
        }
        return super.toString() + "(" + str + this.cutoffInstant + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AgeFileFilter(java.util.Date r1, boolean r2) {
        /*
            r0 = this;
            java.time.Instant r1 = androidx.core.graphics.a.r(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.AgeFileFilter.<init>(java.util.Date, boolean):void");
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z9) {
        this(FileUtils.lastModifiedUnchecked(file), z9);
    }

    public AgeFileFilter(Instant instant) {
        this(instant, true);
    }

    public AgeFileFilter(Instant instant, boolean z9) {
        this.acceptOlder = z9;
        this.cutoffInstant = instant;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new f5.f(14, this, path));
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AgeFileFilter(long r1, boolean r3) {
        /*
            r0 = this;
            java.time.Instant r1 = org.apache.commons.io.file.f.p(r1)
            r0.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.AgeFileFilter.<init>(long, boolean):void");
    }
}
