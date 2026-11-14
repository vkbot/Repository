package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOIntConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBuilder<T extends AbstractBuilder<T>> extends ProxyInputStream.AbstractBuilder<ObservableInputStream, T> {
        private List<Observer> observers;

        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        @Override // org.apache.commons.io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ AbstractStreamBuilder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public void setObservers(List<Observer> list) {
            this.observers = list;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractBuilder<Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public ObservableInputStream get() {
            return new ObservableInputStream(this);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static abstract class Observer {
        public void data(byte[] bArr, int i10, int i11) {
        }

        public void closed() {
        }

        public void finished() {
        }

        public void data(int i10) {
        }

        public void error(IOException iOException) {
            throw iOException;
        }
    }

    public ObservableInputStream(AbstractBuilder<?> abstractBuilder) {
        super(abstractBuilder);
        this.observers = ((AbstractBuilder) abstractBuilder).observers;
    }

    private void forEachObserver(IOConsumer<Observer> iOConsumer) {
        IOConsumer.forAll(iOConsumer, this.observers);
    }

    private void notify(byte[] bArr, int i10, int i11, IOException iOException) {
        if (iOException == null) {
            if (i11 == -1) {
                noteFinished();
                return;
            } else {
                if (i11 > 0) {
                    noteDataBytes(bArr, i10, i11);
                    return;
                }
                return;
            }
        }
        noteError(iOException);
        throw iOException;
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() {
        IOUtils.consume(this);
    }

    public List<Observer> getObservers() {
        return new ArrayList(this.observers);
    }

    public void noteClosed() {
        forEachObserver(new h(1));
    }

    public void noteDataByte(int i10) {
        forEachObserver(new g(i10, 0));
    }

    public void noteDataBytes(byte[] bArr, int i10, int i11) {
        forEachObserver(new i(bArr, i10, i11, 0));
    }

    public void noteError(IOException iOException) {
        forEachObserver(new j(0, iOException));
    }

    public void noteFinished() {
        forEachObserver(new h(0));
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        try {
            i10 = super.read();
            e = null;
        } catch (IOException e) {
            e = e;
            i10 = 0;
        }
        if (e == null) {
            if (i10 == -1) {
                noteFinished();
            } else {
                noteDataByte(i10);
            }
            return i10;
        }
        noteError(e);
        throw e;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }

    public ObservableInputStream(InputStream inputStream) {
        this(inputStream, new ArrayList());
    }

    private ObservableInputStream(InputStream inputStream, List<Observer> list) {
        super(inputStream);
        this.observers = list;
    }

    public ObservableInputStream(InputStream inputStream, Observer... observerArr) {
        this(inputStream, (List<Observer>) Arrays.asList(observerArr));
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int i10;
        try {
            i10 = super.read(bArr);
            e = null;
        } catch (IOException e) {
            e = e;
            i10 = 0;
        }
        notify(bArr, 0, i10, e);
        return i10;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        try {
            i12 = super.read(bArr, i10, i11);
            e = null;
        } catch (IOException e) {
            e = e;
            i12 = 0;
        }
        notify(bArr, i10, i12, e);
        return i12;
    }
}
