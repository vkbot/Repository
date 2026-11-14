package kotlin.internal.jdk8;

import java.nio.file.FileSystemException;
import java.nio.file.FileVisitor;
import java.nio.file.Path;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ FileSystemException h(String str) {
        return new FileSystemException(str);
    }

    public static /* bridge */ /* synthetic */ FileSystemException i(Throwable th) {
        return (FileSystemException) th;
    }

    public static /* bridge */ /* synthetic */ FileVisitor k(Object obj) {
        return (FileVisitor) obj;
    }

    public static /* bridge */ /* synthetic */ Path m(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ void v() {
    }
}
