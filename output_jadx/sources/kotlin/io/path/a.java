package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ DirectoryStream b(Object obj) {
        return (DirectoryStream) obj;
    }

    public static /* synthetic */ FileSystemException f() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }

    public static /* synthetic */ FileSystemLoopException g(String str) {
        return new FileSystemLoopException(str);
    }

    public static /* bridge */ /* synthetic */ SecureDirectoryStream o(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    public static /* bridge */ /* synthetic */ BasicFileAttributes p(Object obj) {
        return (BasicFileAttributes) obj;
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }
}
