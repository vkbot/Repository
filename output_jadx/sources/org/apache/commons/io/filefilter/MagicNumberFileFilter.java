package org.apache.commons.io.filefilter;

import androidx.fragment.app.h;
import j1.i;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.RandomAccessFileMode;
import org.apache.commons.io.RandomAccessFiles;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr, long j10) {
        Objects.requireNonNull(bArr, "magicNumbers");
        if (bArr.length != 0) {
            if (j10 >= 0) {
                this.magicNumbers = (byte[]) bArr.clone();
                this.byteOffset = j10;
                return;
            } else {
                i.k("The offset cannot be negative");
                throw null;
            }
        }
        i.k("The magic number must contain at least one byte");
        throw null;
    }

    public static /* synthetic */ Boolean a(MagicNumberFileFilter magicNumberFileFilter, RandomAccessFile randomAccessFile) {
        return magicNumberFileFilter.lambda$accept$0(randomAccessFile);
    }

    public /* synthetic */ Boolean lambda$accept$0(RandomAccessFile randomAccessFile) {
        byte[] bArr = this.magicNumbers;
        return Boolean.valueOf(Arrays.equals(bArr, RandomAccessFiles.read(randomAccessFile, this.byteOffset, bArr.length)));
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        boolean isRegularFile;
        boolean isReadable;
        FileChannel open;
        FileVisitResult fileVisitResult2;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, new LinkOption[0]);
            if (isRegularFile) {
                isReadable = Files.isReadable(path);
                if (isReadable) {
                    try {
                        open = FileChannel.open(path, new OpenOption[0]);
                        try {
                            ByteBuffer allocate = ByteBuffer.allocate(this.magicNumbers.length);
                            open.position(this.byteOffset);
                            int read = open.read(allocate);
                            byte[] bArr = this.magicNumbers;
                            if (read != bArr.length) {
                                fileVisitResult2 = FileVisitResult.TERMINATE;
                            } else {
                                fileVisitResult2 = toFileVisitResult(Arrays.equals(bArr, allocate.array()));
                            }
                            open.close();
                            return fileVisitResult2;
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("(");
        sb.append(new String(this.magicNumbers, Charset.defaultCharset()));
        sb.append(",");
        return ai.onnxruntime.a.n(sb, this.byteOffset, ")");
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j10) {
        this(str.getBytes(Charset.defaultCharset()), j10);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (!isFile(file) || !file.canRead()) {
            return false;
        }
        try {
            RandomAccessFileMode randomAccessFileMode = RandomAccessFileMode.READ_ONLY;
            path = file.toPath();
            return ((Boolean) randomAccessFileMode.apply(path, new h(23, this))).booleanValue();
        } catch (IOException unused) {
            return false;
        }
    }
}
