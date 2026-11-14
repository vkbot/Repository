package f;

import java.io.File;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2237a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    org.apache.commons.io.e.f(file2, "failed to delete file: ");
                    return;
                }
            }
            return;
        }
        org.apache.commons.io.e.f(file, "not a readable directory: ");
    }
}
