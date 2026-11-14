package m0;

import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
