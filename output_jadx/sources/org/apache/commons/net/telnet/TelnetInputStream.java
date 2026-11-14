package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class TelnetInputStream extends BufferedInputStream implements Runnable {
    private static final int EOF = -1;
    static final int STATE_CR = 8;
    static final int STATE_DATA = 0;
    static final int STATE_DO = 4;
    static final int STATE_DONT = 5;
    static final int STATE_IAC = 1;
    static final int STATE_IAC_SB = 9;
    static final int STATE_SB = 6;
    static final int STATE_SE = 7;
    static final int STATE_WILL = 2;
    static final int STATE_WONT = 3;
    private static final int WOULD_BLOCK = -2;
    private int bytesAvailable;
    private final TelnetClient client;
    private boolean hasReachedEOF;
    private IOException ioException;
    private volatile boolean isClosed;
    private final int[] queue;
    private int queueHead;
    private int queueTail;
    private boolean readIsWaiting;
    private int receiveState;
    private final int[] suboption;
    private int suboptionCount;
    private final Thread thread;
    private volatile boolean threaded;

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient, boolean z9) {
        super(inputStream);
        this.client = telnetClient;
        this.receiveState = 0;
        this.isClosed = true;
        this.hasReachedEOF = false;
        this.queue = new int[2049];
        this.queueHead = 0;
        this.queueTail = 0;
        this.suboption = new int[telnetClient.maxSubnegotiationLength];
        this.bytesAvailable = 0;
        this.ioException = null;
        this.readIsWaiting = false;
        this.threaded = false;
        if (z9) {
            this.thread = new Thread(this);
        } else {
            this.thread = null;
        }
    }

    private boolean processChar(int i10) {
        boolean z9;
        synchronized (this.queue) {
            if (this.bytesAvailable == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            while (this.bytesAvailable >= this.queue.length - 1) {
                if (this.threaded) {
                    this.queue.notify();
                    try {
                        this.queue.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
            }
            if (this.readIsWaiting && this.threaded) {
                this.queue.notify();
            }
            int[] iArr = this.queue;
            int i11 = this.queueTail;
            iArr[i11] = i10;
            this.bytesAvailable++;
            int i12 = i11 + 1;
            this.queueTail = i12;
            if (i12 >= iArr.length) {
                this.queueTail = 0;
            }
        }
        return z9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int read(boolean r7) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.read(boolean):int");
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        synchronized (this.queue) {
            try {
                boolean z9 = this.threaded;
                int i10 = this.bytesAvailable;
                if (z9) {
                    return i10;
                }
                return i10 + super.available();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this.queue) {
            try {
                this.hasReachedEOF = true;
                this.isClosed = true;
                Thread thread = this.thread;
                if (thread != null && thread.isAlive()) {
                    this.thread.interrupt();
                }
                this.queue.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        boolean z9;
        while (!this.isClosed) {
            try {
                try {
                    read = read(true);
                } catch (InterruptedIOException e) {
                    synchronized (this.queue) {
                        this.ioException = e;
                        this.queue.notifyAll();
                        try {
                            this.queue.wait(100L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            if (this.isClosed) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused2) {
                    super.close();
                }
                if (read < 0) {
                    break;
                }
                try {
                    z9 = processChar(read);
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    if (this.isClosed) {
                        break;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    this.client.notifyInputListener();
                }
            } catch (IOException e6) {
                synchronized (this.queue) {
                    this.ioException = e6;
                    this.client.notifyInputListener();
                }
            }
        }
        synchronized (this.queue) {
            this.isClosed = true;
            this.hasReachedEOF = true;
            this.queue.notify();
        }
        this.threaded = false;
    }

    public void start() {
        if (this.thread == null) {
            return;
        }
        this.isClosed = false;
        int priority = Thread.currentThread().getPriority() + 1;
        if (priority > 10) {
            priority = 10;
        }
        this.thread.setPriority(priority);
        this.thread.setDaemon(true);
        this.thread.start();
        this.threaded = true;
    }

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient) {
        this(inputStream, telnetClient, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r7.readIsWaiting = false;
     */
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 < 1) {
            return 0;
        }
        synchronized (this.queue) {
            int i13 = this.bytesAvailable;
            if (i11 > i13) {
                i11 = i13;
            }
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i14 = i10;
        while (true) {
            i12 = i14 + 1;
            bArr[i14] = (byte) read;
            i11--;
            if (i11 <= 0 || (read = read()) == -1) {
                break;
            }
            i14 = i12;
        }
        return i12 - i10;
    }
}
