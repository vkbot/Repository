package kotlin.io.path;

import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.HashSet;
import org.apache.commons.io.file.AccumulatorPathVisitor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ FileTime A(BasicFileAttributes basicFileAttributes) {
        return basicFileAttributes.lastAccessTime();
    }

    public static /* bridge */ /* synthetic */ boolean B(Path path, LinkOption[] linkOptionArr) {
        return Files.isRegularFile(path, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ FileTime C(BasicFileAttributes basicFileAttributes) {
        return basicFileAttributes.creationTime();
    }

    public static /* bridge */ /* synthetic */ boolean D(Path path, LinkOption[] linkOptionArr) {
        return Files.isDirectory(path, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ long b(FileTime fileTime) {
        return fileTime.toMillis();
    }

    public static /* bridge */ /* synthetic */ long c(Duration duration) {
        return duration.toMillis();
    }

    public static /* bridge */ /* synthetic */ long d(Instant instant) {
        return instant.toEpochMilli();
    }

    public static /* bridge */ /* synthetic */ InputStream e(Path path, OpenOption[] openOptionArr) {
        return Files.newInputStream(path, openOptionArr);
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ StandardCopyOption h() {
        return StandardCopyOption.COPY_ATTRIBUTES;
    }

    public static /* bridge */ /* synthetic */ BasicFileAttributeView i(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ BasicFileAttributes j(Path path, Class cls, LinkOption[] linkOptionArr) {
        return Files.readAttributes(path, cls, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ FileAttributeView k(Path path, Class cls, LinkOption[] linkOptionArr) {
        return Files.getFileAttributeView(path, cls, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ FileTime l(Path path, LinkOption[] linkOptionArr) {
        return Files.getLastModifiedTime(path, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ FileTime m(BasicFileAttributes basicFileAttributes) {
        return basicFileAttributes.lastModifiedTime();
    }

    public static /* bridge */ /* synthetic */ Duration n(long j10) {
        return Duration.ofSeconds(j10);
    }

    public static /* bridge */ /* synthetic */ Instant o(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toInstant();
    }

    public static /* bridge */ /* synthetic */ Instant p(ChronoZonedDateTime chronoZonedDateTime) {
        return chronoZonedDateTime.toInstant();
    }

    public static /* bridge */ /* synthetic */ LocalTime q() {
        return LocalTime.MAX;
    }

    public static /* bridge */ /* synthetic */ LocalTime r(OffsetTime offsetTime) {
        return offsetTime.toLocalTime();
    }

    public static /* bridge */ /* synthetic */ ZoneId s() {
        return ZoneId.systemDefault();
    }

    public static /* bridge */ /* synthetic */ ChronoZonedDateTime t(ChronoLocalDateTime chronoLocalDateTime, ZoneId zoneId) {
        return chronoLocalDateTime.atZone(zoneId);
    }

    public static /* bridge */ /* synthetic */ void u(Path path, Path path2, CopyOption[] copyOptionArr) {
        Files.copy(path, path2, copyOptionArr);
    }

    public static /* bridge */ /* synthetic */ void v(Path path, HashSet hashSet, int i10, AccumulatorPathVisitor accumulatorPathVisitor) {
        Files.walkFileTree(path, hashSet, i10, accumulatorPathVisitor);
    }

    public static /* bridge */ /* synthetic */ void w(BasicFileAttributeView basicFileAttributeView, FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        basicFileAttributeView.setTimes(fileTime, fileTime2, fileTime3);
    }

    public static /* bridge */ /* synthetic */ boolean x(Path path, LinkOption[] linkOptionArr) {
        return Files.exists(path, linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return BasicFileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ StandardCopyOption z() {
        return StandardCopyOption.REPLACE_EXISTING;
    }
}
