package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.file.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
        this.pathToString = function == null ? new h(2) : function;
    }

    private static Pattern compile(String str, int i10) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i10);
    }

    private static int toFlags(IOCase iOCase) {
        if (IOCase.isCaseSensitive(iOCase)) {
            return 0;
        }
        return 2;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z9;
        String apply = this.pathToString.apply(path);
        if (apply != null && this.pattern.matcher(apply).matches()) {
            z9 = true;
        } else {
            z9 = false;
        }
        return toFileVisitResult(z9);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.function.Function] */
    public RegexFileFilter(Pattern pattern) {
        this(pattern, (Function<Path, String>) new Object());
    }

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i10) {
        this(compile(str, i10));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }
}
