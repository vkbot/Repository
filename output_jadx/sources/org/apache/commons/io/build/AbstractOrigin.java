package org.apache.commons.io.build;

import j1.i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IORandomAccessFile;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.RandomAccessFileMode;
import org.apache.commons.io.RandomAccessFiles;
import org.apache.commons.io.build.AbstractOrigin;
import org.apache.commons.io.channels.ByteArraySeekableByteChannel;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.input.BufferedFileChannelInputStream;
import org.apache.commons.io.input.CharSequenceInputStream;
import org.apache.commons.io.input.CharSequenceReader;
import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.RandomAccessFileOutputStream;
import org.apache.commons.io.output.WriterOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractOrigin<T, B extends AbstractOrigin<T, B>> extends AbstractSupplier<T, B> {
    final T origin;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class ByteArrayOrigin extends AbstractOrigin<byte[], ByteArrayOrigin> {
        public ByteArrayOrigin(byte[] bArr) {
            super(bArr);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            return get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            StandardOpenOption standardOpenOption;
            for (OpenOption openOption : openOptionArr) {
                standardOpenOption = StandardOpenOption.WRITE;
                if (openOption == standardOpenOption) {
                    androidx.navigation.b.e(Arrays.toString(openOptionArr), "Only READ is supported for byte[] origins: ");
                    return null;
                }
            }
            return ByteArraySeekableByteChannel.wrap(getByteArray());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return new ByteArrayInputStream((byte[]) this.origin);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return new InputStreamReader(getInputStream(new OpenOption[0]), Charsets.toCharset(charset));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() {
            return ((byte[]) this.origin).length;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class ChannelOrigin extends AbstractOrigin<Channel, ChannelOrigin> {
        public ChannelOrigin(Channel channel) {
            super(channel);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            return IOUtils.toByteArray(getInputStream(new OpenOption[0]));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return Channels.newInputStream((ReadableByteChannel) getChannel(ReadableByteChannel.class, openOptionArr));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) {
            return Channels.newOutputStream((WritableByteChannel) getChannel(WritableByteChannel.class, openOptionArr));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return Channels.newReader((ReadableByteChannel) getChannel(ReadableByteChannel.class, new OpenOption[0]), Charsets.toCharset(charset).newDecoder(), -1);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) {
            return Channels.newWriter((WritableByteChannel) getChannel(WritableByteChannel.class, openOptionArr), Charsets.toCharset(charset).newEncoder(), -1);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() {
            T t = this.origin;
            if (t instanceof SeekableByteChannel) {
                return ((SeekableByteChannel) t).size();
            }
            throw unsupportedOperation("size");
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class CharSequenceOrigin extends AbstractOrigin<CharSequence, CharSequenceOrigin> {
        public CharSequenceOrigin(CharSequence charSequence) {
            super(charSequence);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            return ((CharSequence) this.origin).toString().getBytes(Charset.defaultCharset());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            StandardOpenOption standardOpenOption;
            for (OpenOption openOption : openOptionArr) {
                standardOpenOption = StandardOpenOption.WRITE;
                if (openOption == standardOpenOption) {
                    androidx.navigation.b.e(Arrays.toString(openOptionArr), "Only READ is supported for CharSequence origins: ");
                    return null;
                }
            }
            return ByteArraySeekableByteChannel.wrap(getByteArray());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) {
            return get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return ((CharSequenceInputStream.Builder) CharSequenceInputStream.builder().setCharSequence(getCharSequence(Charset.defaultCharset()))).get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return new CharSequenceReader(get());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() {
            return ((CharSequence) this.origin).length();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class FileOrigin extends AbstractOrigin<File, FileOrigin> {
        public FileOrigin(File file) {
            super(file);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray(long j10, int i10) {
            RandomAccessFile create = RandomAccessFileMode.READ_ONLY.create((File) this.origin);
            try {
                byte[] read = RandomAccessFiles.read(create, j10, i10);
                if (create != null) {
                    create.close();
                }
                return read;
            } catch (Throwable th) {
                if (create != null) {
                    try {
                        create.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            SeekableByteChannel newByteChannel;
            newByteChannel = Files.newByteChannel(getPath(), openOptionArr);
            return newByteChannel;
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public File getFile() {
            return get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = get().toPath();
            return path;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class IORandomAccessFileOrigin extends AbstractRandomAccessFileOrigin<IORandomAccessFile, IORandomAccessFileOrigin> {
        public IORandomAccessFileOrigin(IORandomAccessFile iORandomAccessFile) {
            super(iORandomAccessFile);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public File getFile() {
            return ((IORandomAccessFile) get()).getFile();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = getFile().toPath();
            return path;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class InputStreamOrigin extends AbstractOrigin<InputStream, InputStreamOrigin> {
        public InputStreamOrigin(InputStream inputStream) {
            super(inputStream);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            return IOUtils.toByteArray((InputStream) this.origin);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return Channels.newChannel(getInputStream(openOptionArr));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return new InputStreamReader(getInputStream(new OpenOption[0]), Charsets.toCharset(charset));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() {
            T t = this.origin;
            if (t instanceof FileInputStream) {
                return ((FileInputStream) t).getChannel().size();
            }
            throw unsupportedOperation("size");
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class OutputStreamOrigin extends AbstractOrigin<OutputStream, OutputStreamOrigin> {
        public OutputStreamOrigin(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return Channels.newChannel(getOutputStream(openOptionArr));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) {
            return get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) {
            return new OutputStreamWriter((OutputStream) this.origin, Charsets.toCharset(charset));
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class PathOrigin extends AbstractOrigin<Path, PathOrigin> {
        public PathOrigin(Path path) {
            super(path);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ byte[] lambda$getByteArray$0(long j10, int i10, RandomAccessFile randomAccessFile) {
            return RandomAccessFiles.read(randomAccessFile, j10, i10);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray(final long j10, final int i10) {
            return (byte[]) RandomAccessFileMode.READ_ONLY.apply(kotlin.internal.jdk8.a.m(this.origin), new IOFunction() { // from class: org.apache.commons.io.build.a
                @Override // org.apache.commons.io.function.IOFunction
                public final Object apply(Object obj) {
                    byte[] lambda$getByteArray$0;
                    lambda$getByteArray$0 = AbstractOrigin.PathOrigin.lambda$getByteArray$0(j10, i10, (RandomAccessFile) obj);
                    return lambda$getByteArray$0;
                }
            });
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            SeekableByteChannel newByteChannel;
            newByteChannel = Files.newByteChannel(getPath(), openOptionArr);
            return newByteChannel;
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public File getFile() {
            File file;
            file = kotlin.internal.jdk8.a.m(get()).toFile();
            return file;
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Path getPath() {
            return kotlin.internal.jdk8.a.m(get());
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class RandomAccessFileOrigin extends AbstractRandomAccessFileOrigin<RandomAccessFile, RandomAccessFileOrigin> {
        public RandomAccessFileOrigin(RandomAccessFile randomAccessFile) {
            super(randomAccessFile);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class ReaderOrigin extends AbstractOrigin<Reader, ReaderOrigin> {
        public ReaderOrigin(Reader reader) {
            super(reader);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            return IOUtils.toByteArray((Reader) this.origin, Charset.defaultCharset());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return Channels.newChannel(getInputStream(new OpenOption[0]));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) {
            return IOUtils.toString((Reader) this.origin);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return ((ReaderInputStream.Builder) ReaderInputStream.builder().setReader((Reader) this.origin)).setCharset(Charset.defaultCharset()).get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return get();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class URIOrigin extends AbstractOrigin<URI, URIOrigin> {
        private static final String SCHEME_HTTP = "http";
        private static final String SCHEME_HTTPS = "https";

        public URIOrigin(URI uri) {
            super(uri);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            SeekableByteChannel newByteChannel;
            URI uri = get();
            String scheme = uri.getScheme();
            if (!SCHEME_HTTP.equalsIgnoreCase(scheme) && !SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                newByteChannel = Files.newByteChannel(getPath(), openOptionArr);
                return newByteChannel;
            }
            return Channels.newChannel(uri.toURL().openStream());
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public File getFile() {
            File file;
            file = getPath().toFile();
            return file;
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            InputStream newInputStream;
            URI uri = get();
            String scheme = uri.getScheme();
            if (!SCHEME_HTTP.equalsIgnoreCase(scheme) && !SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                newInputStream = Files.newInputStream(getPath(), openOptionArr);
                return newInputStream;
            }
            return uri.toURL().openStream();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = Paths.get(get());
            return path;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class WriterOrigin extends AbstractOrigin<Writer, WriterOrigin> {
        public WriterOrigin(Writer writer) {
            super(writer);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return Channels.newChannel(getOutputStream(new OpenOption[0]));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) {
            return ((WriterOutputStream.Builder) WriterOutputStream.builder().setWriter((Writer) this.origin)).setCharset(Charset.defaultCharset()).get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) {
            return get();
        }
    }

    public AbstractOrigin(T t) {
        Objects.requireNonNull(t, "origin");
        this.origin = t;
    }

    private String getSimpleClassName() {
        return getClass().getSimpleName();
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public T get() {
        return this.origin;
    }

    public byte[] getByteArray(long j10, int i10) {
        int i11;
        byte[] byteArray = getByteArray();
        int intExact = Math.toIntExact(j10);
        if (intExact >= 0 && i10 >= 0 && (i11 = intExact + i10) >= 0 && i11 <= byteArray.length) {
            return Arrays.copyOfRange(byteArray, intExact, i11);
        }
        i.k(ai.onnxruntime.a.o(ai.onnxruntime.a.v("Couldn't read array (start: ", intExact, i10, ", length: ", ", data length: "), ").", byteArray.length));
        return null;
    }

    public final <C extends Channel> C getChannel(Class<C> cls, OpenOption... openOptionArr) {
        Objects.requireNonNull(cls, "channelType");
        Channel channel = getChannel(openOptionArr);
        if (cls.isInstance(channel)) {
            return cls.cast(channel);
        }
        throw unsupportedChannelType(cls);
    }

    public CharSequence getCharSequence(Charset charset) {
        return new String(getByteArray(), charset);
    }

    public File getFile() {
        throw unsupportedOperation("getFile");
    }

    public InputStream getInputStream(OpenOption... openOptionArr) {
        InputStream newInputStream;
        newInputStream = Files.newInputStream(getPath(), openOptionArr);
        return newInputStream;
    }

    public OutputStream getOutputStream(OpenOption... openOptionArr) {
        OutputStream newOutputStream;
        newOutputStream = Files.newOutputStream(getPath(), openOptionArr);
        return newOutputStream;
    }

    public Path getPath() {
        throw unsupportedOperation("getPath");
    }

    public RandomAccessFile getRandomAccessFile(OpenOption... openOptionArr) {
        return RandomAccessFileMode.valueOf(openOptionArr).create(getFile());
    }

    public Reader getReader(Charset charset) {
        BufferedReader newBufferedReader;
        newBufferedReader = Files.newBufferedReader(getPath(), Charsets.toCharset(charset));
        return newBufferedReader;
    }

    public Writer getWriter(Charset charset, OpenOption... openOptionArr) {
        BufferedWriter newBufferedWriter;
        newBufferedWriter = Files.newBufferedWriter(getPath(), Charsets.toCharset(charset), openOptionArr);
        return newBufferedWriter;
    }

    public long size() {
        long size;
        size = Files.size(getPath());
        return size;
    }

    public String toString() {
        return getSimpleClassName() + "[" + this.origin.toString() + "]";
    }

    public UnsupportedOperationException unsupportedChannelType(Class<? extends Channel> cls) {
        return new UnsupportedOperationException(String.format("%s#getChannel(%s) for %s origin %s", getSimpleClassName(), cls.getSimpleName(), this.origin.getClass().getSimpleName(), this.origin));
    }

    public UnsupportedOperationException unsupportedOperation(String str) {
        return new UnsupportedOperationException(String.format("%s#%s() for %s origin %s", getSimpleClassName(), str, this.origin.getClass().getSimpleName(), this.origin));
    }

    public Channel getChannel(OpenOption... openOptionArr) {
        throw unsupportedOperation("getChannel");
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractRandomAccessFileOrigin<T extends RandomAccessFile, B extends AbstractRandomAccessFileOrigin<T, B>> extends AbstractOrigin<T, B> {
        public AbstractRandomAccessFileOrigin(T t) {
            super(t);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
            long length = ((RandomAccessFile) this.origin).length();
            if (length <= 2147483647L) {
                return RandomAccessFiles.read((RandomAccessFile) this.origin, 0L, (int) length);
            }
            i.l("Origin too large.");
            return null;
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Channel getChannel(OpenOption... openOptionArr) {
            return getRandomAccessFile(openOptionArr).getChannel();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) {
            return new String(getByteArray(), charset);
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return BufferedFileChannelInputStream.builder().setFileChannel(((RandomAccessFile) this.origin).getChannel()).get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) {
            return ((RandomAccessFileOutputStream.Builder) RandomAccessFileOutputStream.builder().setRandomAccessFile((RandomAccessFile) this.origin)).get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public T getRandomAccessFile(OpenOption... openOptionArr) {
            return (T) get();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Reader getReader(Charset charset) {
            return new InputStreamReader(getInputStream(new OpenOption[0]), Charsets.toCharset(charset));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) {
            return new OutputStreamWriter(getOutputStream(openOptionArr), Charsets.toCharset(charset));
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() {
            return ((RandomAccessFile) this.origin).length();
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray(long j10, int i10) {
            return RandomAccessFiles.read((RandomAccessFile) this.origin, j10, i10);
        }
    }

    public byte[] getByteArray() {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(getPath());
        return readAllBytes;
    }
}
