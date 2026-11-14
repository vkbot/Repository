package org.apache.commons.io.build;

import j1.i;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.channels.Channel;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.IORandomAccessFile;
import org.apache.commons.io.build.AbstractOrigin;
import org.apache.commons.io.build.AbstractOriginSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class AbstractOriginSupplier<T, B extends AbstractOriginSupplier<T, B>> extends AbstractSupplier<T, B> {
    private AbstractOrigin<?, ?> origin;

    public static AbstractOrigin.ByteArrayOrigin newByteArrayOrigin(byte[] bArr) {
        return new AbstractOrigin.ByteArrayOrigin(bArr);
    }

    public static AbstractOrigin.ChannelOrigin newChannelOrigin(Channel channel) {
        return new AbstractOrigin.ChannelOrigin(channel);
    }

    public static AbstractOrigin.CharSequenceOrigin newCharSequenceOrigin(CharSequence charSequence) {
        return new AbstractOrigin.CharSequenceOrigin(charSequence);
    }

    public static AbstractOrigin.FileOrigin newFileOrigin(String str) {
        return new AbstractOrigin.FileOrigin(new File(str));
    }

    public static AbstractOrigin.InputStreamOrigin newInputStreamOrigin(InputStream inputStream) {
        return new AbstractOrigin.InputStreamOrigin(inputStream);
    }

    public static AbstractOrigin.OutputStreamOrigin newOutputStreamOrigin(OutputStream outputStream) {
        return new AbstractOrigin.OutputStreamOrigin(outputStream);
    }

    public static AbstractOrigin.PathOrigin newPathOrigin(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return new AbstractOrigin.PathOrigin(path);
    }

    public static AbstractOrigin.IORandomAccessFileOrigin newRandomAccessFileOrigin(IORandomAccessFile iORandomAccessFile) {
        return new AbstractOrigin.IORandomAccessFileOrigin(iORandomAccessFile);
    }

    public static AbstractOrigin.ReaderOrigin newReaderOrigin(Reader reader) {
        return new AbstractOrigin.ReaderOrigin(reader);
    }

    public static AbstractOrigin.URIOrigin newURIOrigin(URI uri) {
        return new AbstractOrigin.URIOrigin(uri);
    }

    public static AbstractOrigin.WriterOrigin newWriterOrigin(Writer writer) {
        return new AbstractOrigin.WriterOrigin(writer);
    }

    public AbstractOrigin<?, ?> checkOrigin() {
        AbstractOrigin<?, ?> abstractOrigin = this.origin;
        if (abstractOrigin != null) {
            return abstractOrigin;
        }
        i.l("origin == null");
        return null;
    }

    public AbstractOrigin<?, ?> getOrigin() {
        return this.origin;
    }

    public boolean hasOrigin() {
        if (this.origin != null) {
            return true;
        }
        return false;
    }

    public B setByteArray(byte[] bArr) {
        return setOrigin(newByteArrayOrigin(bArr));
    }

    public B setChannel(Channel channel) {
        return setOrigin(newChannelOrigin(channel));
    }

    public B setCharSequence(CharSequence charSequence) {
        return setOrigin(newCharSequenceOrigin(charSequence));
    }

    public B setFile(File file) {
        return setOrigin(newFileOrigin(file));
    }

    public B setInputStream(InputStream inputStream) {
        return setOrigin(newInputStreamOrigin(inputStream));
    }

    public B setOrigin(AbstractOrigin<?, ?> abstractOrigin) {
        this.origin = abstractOrigin;
        return (B) asThis();
    }

    public B setOutputStream(OutputStream outputStream) {
        return setOrigin(newOutputStreamOrigin(outputStream));
    }

    public B setPath(Path path) {
        return setOrigin(newPathOrigin(path));
    }

    public B setRandomAccessFile(IORandomAccessFile iORandomAccessFile) {
        return setOrigin(newRandomAccessFileOrigin(iORandomAccessFile));
    }

    public B setReader(Reader reader) {
        return setOrigin(newReaderOrigin(reader));
    }

    public B setURI(URI uri) {
        return setOrigin(newURIOrigin(uri));
    }

    public B setWriter(Writer writer) {
        return setOrigin(newWriterOrigin(writer));
    }

    public static AbstractOrigin.RandomAccessFileOrigin newRandomAccessFileOrigin(RandomAccessFile randomAccessFile) {
        return new AbstractOrigin.RandomAccessFileOrigin(randomAccessFile);
    }

    public B setFile(String str) {
        return setOrigin(newFileOrigin(str));
    }

    public B setPath(String str) {
        return setOrigin(newPathOrigin(str));
    }

    public B setRandomAccessFile(RandomAccessFile randomAccessFile) {
        return setOrigin(newRandomAccessFileOrigin(randomAccessFile));
    }

    public static AbstractOrigin.FileOrigin newFileOrigin(File file) {
        return new AbstractOrigin.FileOrigin(file);
    }

    public static AbstractOrigin.PathOrigin newPathOrigin(Path path) {
        return new AbstractOrigin.PathOrigin(path);
    }
}
