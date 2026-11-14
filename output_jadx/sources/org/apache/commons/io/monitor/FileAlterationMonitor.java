package org.apache.commons.io.monitor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Stream;
import org.apache.commons.io.ThreadUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FileAlterationMonitor implements Runnable {
    private static final FileAlterationObserver[] EMPTY_ARRAY = new FileAlterationObserver[0];
    private final long intervalMillis;
    private final List<FileAlterationObserver> observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor(long j10, Collection<FileAlterationObserver> collection) {
        this(j10, (FileAlterationObserver[]) ((Collection) Optional.ofNullable(collection).orElse(Collections.EMPTY_LIST)).toArray(EMPTY_ARRAY));
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.observers.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.intervalMillis;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return new ArrayList(this.observers);
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.observers.removeIf(new i7.c(6, fileAlterationObserver));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Consumer, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        Duration ofMillis;
        while (this.running) {
            this.observers.forEach(new Object());
            if (this.running) {
                try {
                    ofMillis = Duration.ofMillis(this.intervalMillis);
                    ThreadUtils.sleep(ofMillis);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
    }

    public synchronized void start() {
        try {
            if (!this.running) {
                Iterator<FileAlterationObserver> it = this.observers.iterator();
                while (it.hasNext()) {
                    it.next().initialize();
                }
                this.running = true;
                ThreadFactory threadFactory = this.threadFactory;
                if (threadFactory != null) {
                    this.thread = threadFactory.newThread(this);
                } else {
                    this.thread = new Thread(this);
                }
                this.thread.start();
            } else {
                throw new IllegalStateException("Monitor is already running");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop(long j10) {
        if (this.running) {
            this.running = false;
            try {
                this.thread.interrupt();
                this.thread.join(j10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            Iterator<FileAlterationObserver> it = this.observers.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } else {
            throw new IllegalStateException("Monitor is not running");
        }
    }

    public FileAlterationMonitor(long j10) {
        this.observers = new CopyOnWriteArrayList();
        this.intervalMillis = j10;
    }

    public FileAlterationMonitor() {
        this(10000L);
    }

    public FileAlterationMonitor(long j10, FileAlterationObserver... fileAlterationObserverArr) {
        this(j10);
        if (fileAlterationObserverArr != null) {
            Stream.of((Object[]) fileAlterationObserverArr).forEach(new org.apache.commons.io.filefilter.b(2, this));
        }
    }

    public synchronized void stop() {
        stop(this.intervalMillis);
    }
}
