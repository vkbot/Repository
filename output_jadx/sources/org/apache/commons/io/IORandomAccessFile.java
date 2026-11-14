package org.apache.commons.io;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class IORandomAccessFile extends RandomAccessFile {
    private final File file;
    private final String mode;

    public IORandomAccessFile(String str, String str2) {
        super(str, str2);
        File file;
        if (str != null) {
            file = new File(str);
        } else {
            file = null;
        }
        this.file = file;
        this.mode = str2;
    }

    public File getFile() {
        return this.file;
    }

    public String getMode() {
        return this.mode;
    }

    public String toString() {
        return Objects.toString(this.file);
    }

    public IORandomAccessFile(File file, String str) {
        super(file, str);
        this.file = file;
        this.mode = str;
    }
}
