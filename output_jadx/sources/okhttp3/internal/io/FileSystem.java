package okhttp3.internal.io;

import ai.onnxruntime.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import l9.e0;
import l9.f;
import l9.g0;
import l9.j0;
import l9.v;
import l9.x;
import org.apache.commons.io.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "Ll9/g0;", "source", "(Ljava/io/File;)Ll9/g0;", "Ll9/e0;", "sink", "(Ljava/io/File;)Ll9/e0;", "appendingSink", "", "delete", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "size", "(Ljava/io/File;)J", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface FileSystem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "Ljava/io/File;", "file", "Ll9/g0;", "source", "(Ljava/io/File;)Ll9/g0;", "Ll9/e0;", "sink", "(Ljava/io/File;)Ll9/e0;", "appendingSink", "", "delete", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "size", "(Ljava/io/File;)J", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes2.dex */
        public static final class SystemFileSystem implements FileSystem {
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.j0] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l9.j0] */
            @Override // okhttp3.internal.io.FileSystem
            public e0 appendingSink(File file) {
                file.getClass();
                try {
                    Logger logger = v.f3584a;
                    return new x(new FileOutputStream(file, true), new Object());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = v.f3584a;
                    return new x(new FileOutputStream(file, true), new Object());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) {
                file.getClass();
                if (!file.delete() && file.exists()) {
                    e.f(file, "failed to delete ");
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) {
                directory.getClass();
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            deleteContents(file);
                        }
                        if (!file.delete()) {
                            e.f(file, "failed to delete ");
                            return;
                        }
                    }
                    return;
                }
                e.f(directory, "not a readable directory: ");
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                file.getClass();
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File from, File to) {
                from.getClass();
                to.getClass();
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                b.m("failed to rename ", from, " to ", to);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.j0] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l9.j0] */
            @Override // okhttp3.internal.io.FileSystem
            public e0 sink(File file) {
                file.getClass();
                try {
                    Logger logger = v.f3584a;
                    return new x(new FileOutputStream(file, false), new Object());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = v.f3584a;
                    return new x(new FileOutputStream(file, false), new Object());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                file.getClass();
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public g0 source(File file) {
                file.getClass();
                Logger logger = v.f3584a;
                return new f(new FileInputStream(file), j0.NONE);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    e0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File directory);

    boolean exists(File file);

    void rename(File from, File to);

    e0 sink(File file);

    long size(File file);

    g0 source(File file);
}
