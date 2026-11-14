package org.apache.commons.io.output;

import j1.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.file.PathUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private boolean closed;
    private OutputStream currentOutputStream;
    private final Path directory;
    private ByteArrayOutputStream memoryOutputStream;
    private Path outputPath;
    private final String prefix;
    private final String suffix;

    private DeferredFileOutputStream(Builder builder) {
        super(builder.threshold);
        this.outputPath = toPath(builder.outputFile, (Supplier<Path>) null);
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
        this.directory = toPath(builder.directory, new androidx.emoji2.text.flatbuffer.a(8));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(checkBufferSize(builder.getBufferSize()));
        this.memoryOutputStream = byteArrayOutputStream;
        this.currentOutputStream = byteArrayOutputStream;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int checkBufferSize(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        i.k("Initial buffer size must be at least 0.");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Path toPath(File file, Supplier<Path> supplier) {
        Path path;
        if (file != null) {
            path = file.toPath();
            return path;
        }
        if (supplier == null) {
            return null;
        }
        return kotlin.internal.jdk8.a.m(supplier.get());
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.closed = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.memoryOutputStream;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        File file;
        Path path = this.outputPath;
        if (path != null) {
            file = path.toFile();
            return file;
        }
        return null;
    }

    public Path getPath() {
        return this.outputPath;
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    @Deprecated
    public OutputStream getStream() {
        return this.currentOutputStream;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public void thresholdReached() {
        OutputStream newOutputStream;
        Path createTempFile;
        String str = this.prefix;
        if (str != null) {
            createTempFile = Files.createTempFile(this.directory, str, this.suffix, new FileAttribute[0]);
            this.outputPath = createTempFile;
        }
        PathUtils.createParentDirectories(this.outputPath, null, PathUtils.EMPTY_FILE_ATTRIBUTE_ARRAY);
        newOutputStream = Files.newOutputStream(this.outputPath, new OpenOption[0]);
        try {
            this.memoryOutputStream.writeTo(newOutputStream);
            this.currentOutputStream = newOutputStream;
            this.memoryOutputStream = null;
        } catch (IOException e) {
            newOutputStream.close();
            throw e;
        }
    }

    public InputStream toInputStream() {
        InputStream newInputStream;
        if (this.closed) {
            if (!isInMemory()) {
                newInputStream = Files.newInputStream(this.outputPath, new OpenOption[0]);
                return newInputStream;
            }
            return this.memoryOutputStream.toInputStream();
        }
        n0.b.A("Stream not closed");
        return null;
    }

    public void writeTo(OutputStream outputStream) {
        if (this.closed) {
            if (!isInMemory()) {
                Files.copy(this.outputPath, outputStream);
                return;
            } else {
                this.memoryOutputStream.writeTo(outputStream);
                return;
            }
        }
        n0.b.A("Stream not closed");
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<DeferredFileOutputStream, Builder> {
        private Path directory;
        private Path outputFile;
        private String prefix;
        private String suffix;
        private int threshold;

        public Builder() {
            setBufferSizeDefault(1024);
            setBufferSize(1024);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public DeferredFileOutputStream get() {
            return new DeferredFileOutputStream(this);
        }

        public Builder setDirectory(File file) {
            this.directory = DeferredFileOutputStream.toPath(file, (Supplier<Path>) null);
            return this;
        }

        public Builder setOutputFile(File file) {
            this.outputFile = DeferredFileOutputStream.toPath(file, (Supplier<Path>) null);
            return this;
        }

        public Builder setPrefix(String str) {
            this.prefix = str;
            return this;
        }

        public Builder setSuffix(String str) {
            this.suffix = str;
            return this;
        }

        public Builder setThreshold(int i10) {
            this.threshold = i10;
            return this;
        }

        public Builder setDirectory(Path path) {
            this.directory = DeferredFileOutputStream.toPath(path, (Supplier<Path>) null);
            return this;
        }

        public Builder setOutputFile(Path path) {
            this.outputFile = DeferredFileOutputStream.toPath(path, (Supplier<Path>) null);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Path toPath(Path path, Supplier<Path> supplier) {
        if (path != null) {
            return path;
        }
        if (supplier == null) {
            return null;
        }
        return kotlin.internal.jdk8.a.m(supplier.get());
    }

    @Deprecated
    public DeferredFileOutputStream(int i10, File file) {
        this(i10, file, null, null, null, 1024);
    }

    private DeferredFileOutputStream(int i10, File file, String str, String str2, File file2, int i11) {
        super(i10);
        this.outputPath = toPath(file, (Supplier<Path>) null);
        this.prefix = str;
        this.suffix = str2;
        this.directory = toPath(file2, new androidx.emoji2.text.flatbuffer.a(8));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(checkBufferSize(i11));
        this.memoryOutputStream = byteArrayOutputStream;
        this.currentOutputStream = byteArrayOutputStream;
    }

    @Deprecated
    public DeferredFileOutputStream(int i10, int i11, File file) {
        this(i10, file, null, null, null, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DeferredFileOutputStream(int i10, int i11, String str, String str2, File file) {
        this(i10, null, str, str2, file, i11);
        Objects.requireNonNull(str, "prefix");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DeferredFileOutputStream(int i10, String str, String str2, File file) {
        this(i10, null, str, str2, file, 1024);
        Objects.requireNonNull(str, "prefix");
    }
}
