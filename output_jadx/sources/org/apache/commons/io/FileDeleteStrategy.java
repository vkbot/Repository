package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FileDeleteStrategy {
    private final String name;
    public static final FileDeleteStrategy NORMAL = new FileDeleteStrategy("Normal");
    public static final FileDeleteStrategy FORCE = new ForceFileDeleteStrategy();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class ForceFileDeleteStrategy extends FileDeleteStrategy {
        public ForceFileDeleteStrategy() {
            super("Force");
        }

        @Override // org.apache.commons.io.FileDeleteStrategy
        public boolean doDelete(File file) {
            FileUtils.forceDelete(file);
            return true;
        }
    }

    public FileDeleteStrategy(String str) {
        this.name = str;
    }

    public void delete(File file) {
        if (file.exists() && !doDelete(file)) {
            e.f(file, "Deletion failed: ");
        }
    }

    public boolean deleteQuietly(File file) {
        if (file != null && file.exists()) {
            try {
                return doDelete(file);
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    public boolean doDelete(File file) {
        FileUtils.delete(file);
        return true;
    }

    public String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("FileDeleteStrategy["), this.name, "]");
    }
}
