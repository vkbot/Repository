package org.apache.commons.io.monitor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.d;
import org.apache.commons.io.file.attribute.FileTimes;
import org.apache.commons.io.filefilter.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class SerializableFileTime implements Serializable {
    static final SerializableFileTime EPOCH = new SerializableFileTime(FileTimes.EPOCH);
    private static final long serialVersionUID = 1;
    private FileTime fileTime;

    public SerializableFileTime(FileTime fileTime) {
        Objects.requireNonNull(fileTime);
        this.fileTime = d.l(fileTime);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        FileTime from;
        from = FileTime.from(f.m(objectInputStream.readObject()));
        this.fileTime = from;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Instant instant;
        instant = this.fileTime.toInstant();
        objectOutputStream.writeObject(instant);
    }

    public int compareTo(FileTime fileTime) {
        int compareTo;
        compareTo = this.fileTime.compareTo(fileTime);
        return compareTo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableFileTime)) {
            return false;
        }
        return Objects.equals(this.fileTime, ((SerializableFileTime) obj).fileTime);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.fileTime.hashCode();
        return hashCode;
    }

    public long to(TimeUnit timeUnit) {
        long j10;
        j10 = this.fileTime.to(timeUnit);
        return j10;
    }

    public Instant toInstant() {
        Instant instant;
        instant = this.fileTime.toInstant();
        return instant;
    }

    public long toMillis() {
        long millis;
        millis = this.fileTime.toMillis();
        return millis;
    }

    public String toString() {
        String fileTime;
        fileTime = this.fileTime.toString();
        return fileTime;
    }

    public FileTime unwrap() {
        return this.fileTime;
    }
}
