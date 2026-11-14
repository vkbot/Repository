package kotlin.io.path;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/io/path/IllegalFileNameException;", "Ljava/nio/file/FileSystemException;", "file", "Ljava/nio/file/Path;", "other", "message", "", "<init>", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/String;)V", "(Ljava/nio/file/Path;)V", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class IllegalFileNameException extends FileSystemException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IllegalFileNameException(java.nio.file.Path r1, java.nio.file.Path r2, java.lang.String r3) {
        /*
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r1.toString()
            if (r2 == 0) goto Le
            java.lang.String r2 = r2.toString()
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.IllegalFileNameException.<init>(java.nio.file.Path, java.nio.file.Path, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(Path path) {
        this(path, null, null);
        path.getClass();
    }
}
